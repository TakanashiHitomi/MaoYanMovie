package somi.hitomi.maoyanmovie.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.orhanobut.logger.Logger;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import somi.hitomi.maoyanmovie.R;
import somi.hitomi.maoyanmovie.activity.MainActivity;
import somi.hitomi.maoyanmovie.adapter.HotMovieListAdapter;
import somi.hitomi.maoyanmovie.common.BaseFragment;
import somi.hitomi.maoyanmovie.domain.HotMovieBannerBean;
import somi.hitomi.maoyanmovie.domain.MovieListBean;
import somi.hitomi.maoyanmovie.net.RetrofitAPI;
import somi.hitomi.maoyanmovie.utils.BaseURL;
import somi.hitomi.maoyanmovie.widget.LoadingStateFrameLayout;
import somi.hitomi.maoyanmovie.widget.RotationHeader;
import somi.hitomi.maoyanmovie.widget.SwipeRefreshLayout;

/**
 * Created by HitomiT on 2016/11/30.
 */

public class HotMovieFragment extends BaseFragment implements SwipeRefreshLayout.OnFreshListener {

    @BindView(R.id.movie_hot_list)
    RecyclerView mMovieHotList;
    @BindView(R.id.swipe_refresh_layout)
    SwipeRefreshLayout mSwipeRefreshLayout;

    private List<MovieListBean.DataBean.HotBean> movies;
    private MainActivity mActivity;
    private List<HotMovieBannerBean.DataBean> bannerData;

    private boolean isBannerExist = false;
    private HotMovieListAdapter hotMovieListAdapter;
    private LoadingStateFrameLayout mainContainer;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivity = (MainActivity) getActivity();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hot_movie, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mainContainer = mActivity.getMainContainer();
        mainContainer.showLoading();
        // 设置下拉刷新监听器
        mSwipeRefreshLayout.setListener(this);
        mSwipeRefreshLayout.setHeader(new RotationHeader(mActivity));
    }

    @Override
    protected void getDataFromNet() {
        new Retrofit.Builder()
                .baseUrl(BaseURL.BASE_MOVIE_LIST_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(RetrofitAPI.MovieListAPI.class)
                .getMovieList(0, 20)
                .enqueue(new Callback<MovieListBean>() {
                    @Override
                    public void onResponse(Call<MovieListBean> call, Response<MovieListBean> response) {
                        movies = response.body().getData().getHot();
                        setAdapter(false);
                    }

                    @Override
                    public void onFailure(Call<MovieListBean> call, Throwable t) {
                        Logger.e(t.getMessage());
                        showError();
                    }
                });

        new Retrofit.Builder()
                .baseUrl(BaseURL.BANNER_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(RetrofitAPI.HotMovieBannerAPI.class)
                .getHotMovieBanner()
                .enqueue(new Callback<HotMovieBannerBean>() {
                    @Override
                    public void onResponse(Call<HotMovieBannerBean> call, Response<HotMovieBannerBean> response) {
                        bannerData = response.body().getData();
                        Logger.i(response.body().toString());
                        setAdapter(true);
                    }

                    @Override
                    public void onFailure(Call<HotMovieBannerBean> call, Throwable t) {
                        Logger.e(t.getMessage());
                    }
                });
    }

    /**
     * 错误页面显示
     * 太长所以拿出来了
     */
    private void showError() {
        mainContainer.showError(
                mActivity.getDrawable(R.drawable.error_internet_image),
                getString(R.string.progressActivityEmptyTitlePlaceholder),
                getString(R.string.progressActivityEmptyContentPlaceholder),
                getString(R.string.progressActivityErrorButton),
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        getDataFromNet();
                        mainContainer.showLoading();
                    }
                }
        );
    }

    private void setAdapter(boolean isBannerData) {
        if (hotMovieListAdapter == null) {
            if (isBannerData) {
                isBannerExist = true;
            } else {
                initAdapter();
                if (isBannerExist) {
                    hotMovieListAdapter.setBanner(bannerData);
                    mainContainer.showContent();
                    mSwipeRefreshLayout.onFinishFreshAndLoad();
                }
            }
        } else {
            hotMovieListAdapter.setBanner(bannerData);
            mainContainer.showContent();
            mSwipeRefreshLayout.onFinishFreshAndLoad();
        }
    }

    private void initAdapter() {
        mMovieHotList.setLayoutManager(new LinearLayoutManager(mActivity));
        hotMovieListAdapter = new HotMovieListAdapter(mActivity, movies);
        mMovieHotList.setAdapter(hotMovieListAdapter);
    }

    @Override
    public void onRefresh() {
        getDataFromNet();
    }

    @Override
    public void onLoadMore() {

    }
}
