package somi.hitomi.maoyanmovie.fragment;

import android.content.Intent;
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
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import somi.hitomi.maoyanmovie.R;
import somi.hitomi.maoyanmovie.activity.MainActivity;
import somi.hitomi.maoyanmovie.activity.SearchActivity;
import somi.hitomi.maoyanmovie.adapter.DiscoverAdapter;
import somi.hitomi.maoyanmovie.common.BaseFragment;
import somi.hitomi.maoyanmovie.domain.DiscoverBean;
import somi.hitomi.maoyanmovie.net.RetrofitAPI;
import somi.hitomi.maoyanmovie.utils.BaseURL;
import somi.hitomi.maoyanmovie.widget.LoadingStateFrameLayout;

/**
 * Discover Fragment
 * Created by HitomiT on 2016/11/30.
 */

public class DiscoverFragment extends BaseFragment {

    @BindView(R.id.rv_discover)
    RecyclerView mRvDiscover;
    private MainActivity mActivity;
    private List<DiscoverBean.DataBean.FeedsBean> feeds;
    private DiscoverAdapter discoverAdapter;
    private LoadingStateFrameLayout mainContainer;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivity = (MainActivity) getActivity();
        mainContainer = mActivity.getMainContainer();
        mainContainer.showLoading();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_discover, container, false);
        ButterKnife.bind(this, view);
        initRecyclerView();
        return view;
    }

    private void initRecyclerView() {
        mRvDiscover.setLayoutManager(new LinearLayoutManager(mActivity));
        discoverAdapter = new DiscoverAdapter(mActivity);
        mRvDiscover.setAdapter(discoverAdapter);
    }

    @Override
    protected void getDataFromNet() {
        new Retrofit.Builder()
                .baseUrl(BaseURL.DISCOVER_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(RetrofitAPI.DiscoverAPI.class)
                .getDiscoverData(0, 20)
                .enqueue(new Callback<DiscoverBean>() {
                    @Override
                    public void onResponse(Call<DiscoverBean> call, Response<DiscoverBean> response) {
                        DiscoverBean.DataBean data = response.body().getData();
                        if (data != null) {
                            setData(data);
                        }
                    }

                    @Override
                    public void onFailure(Call<DiscoverBean> call, Throwable t) {
                        Logger.e(t.getMessage());
                        showError();
                    }
                });
    }

    private void setData(DiscoverBean.DataBean data) {
        feeds = data.getFeeds();
        discoverAdapter.setFeeds(feeds);
        mainContainer.showContent();
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

    @OnClick(R.id.search_title)
    void onSearchTitleClick() {
        startActivity(new Intent(mActivity, SearchActivity.class));
    }
}
