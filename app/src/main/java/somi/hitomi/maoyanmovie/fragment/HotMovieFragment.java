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

/**
 * Created by HitomiT on 2016/11/30.
 */

public class HotMovieFragment extends BaseFragment {
    private static final int LIST_DATA = (2 << 5) + 3;
    private static final int BANNER_DATA = (2 << 5) + 4;

    @BindView(R.id.movie_hot_list)
    RecyclerView mMovieHotList;
    private List<MovieListBean.DataBean.HotBean> movies;
    private MainActivity mActivity;
    private List<HotMovieBannerBean.DataBean> data;

    private boolean isBannerExist = false;
    private boolean isListExist = false;

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
                        setAdapter(LIST_DATA);
                    }

                    @Override
                    public void onFailure(Call<MovieListBean> call, Throwable t) {
                        Logger.e(t.getMessage());
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
                        data = response.body().getData();
                        Logger.i(response.body().toString());
                        setAdapter(BANNER_DATA);
                    }

                    @Override
                    public void onFailure(Call<HotMovieBannerBean> call, Throwable t) {
                        Logger.e(t.getMessage());
                    }
                });
    }

    private void setAdapter(int listData) {
        if (listData == BANNER_DATA) {
            isBannerExist = true;
        }
        if (listData == LIST_DATA) {
            isListExist = true;
        }
        if (isBannerExist && isListExist) {
            mMovieHotList.setLayoutManager(new LinearLayoutManager(mActivity));

            mMovieHotList.setAdapter(new HotMovieListAdapter(mActivity, movies, data));
        }
    }
}
