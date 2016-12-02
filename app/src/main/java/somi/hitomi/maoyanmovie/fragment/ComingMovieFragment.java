package somi.hitomi.maoyanmovie.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

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
import somi.hitomi.maoyanmovie.adapter.ComingMovieAdapter;
import somi.hitomi.maoyanmovie.common.BaseFragment;
import somi.hitomi.maoyanmovie.domain.ComingMovieBean;
import somi.hitomi.maoyanmovie.listener.StickyHeaderListener;
import somi.hitomi.maoyanmovie.net.RetrofitAPI;
import somi.hitomi.maoyanmovie.utils.BaseURL;

/**
 * Created by HitomiT on 2016/11/30.
 */

public class ComingMovieFragment extends BaseFragment {

    @BindView(R.id.movie_waiting_list)
    RecyclerView mMovieWaitingList;
    @BindView(R.id.view_sticky_header)
    TextView mViewStickyHeader;

    private MainActivity mActivity;
    private List<ComingMovieBean.DataBean.ComingBean> mComingList;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivity = (MainActivity) getActivity();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_coming_movie, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    protected void getDataFromNet() {
        new Retrofit.Builder()
                .baseUrl(BaseURL.WAITING_MOVIE_LIST_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(RetrofitAPI.WaitingMovieListAPI.class)
                .getWaitingMovieList(0, 50)
                .enqueue(new Callback<ComingMovieBean>() {
                    @Override
                    public void onResponse(Call<ComingMovieBean> call, Response<ComingMovieBean> response) {
                        mComingList = response.body().getData().getComing();
                        Logger.i(response.body().toString());
                        setAdapter();
                    }

                    @Override
                    public void onFailure(Call<ComingMovieBean> call, Throwable t) {
                        Logger.e(t.getMessage());
                    }
                });
    }

    private void setAdapter() {
        mMovieWaitingList.setLayoutManager(new LinearLayoutManager(mActivity));
        mMovieWaitingList.setAdapter(new ComingMovieAdapter(mActivity, mComingList));
        mMovieWaitingList.addOnScrollListener(new StickyHeaderListener(mViewStickyHeader));
    }
}
