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
import somi.hitomi.maoyanmovie.domain.MovieListBean;
import somi.hitomi.maoyanmovie.net.RetrofitAPI;
import somi.hitomi.maoyanmovie.utils.Constant;

/**
 * Created by HitomiT on 2016/11/30.
 */

public class HotMovieFragment extends BaseFragment {
    @BindView(R.id.movie_hot_list)
    RecyclerView mMovieHotList;
    private List<MovieListBean.DataBean.MoviesBean> movies;
    private MainActivity mActivity;

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
    protected void getDataFromNet() {
        new Retrofit.Builder()
                .baseUrl(Constant.BASE_MOVIE_LIST_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(RetrofitAPI.MovieListAPI.class)
                .getMovieList("hot", 0, 1000)
                .enqueue(new Callback<MovieListBean>() {
                    @Override
                    public void onResponse(Call<MovieListBean> call, Response<MovieListBean> response) {
                        movies = response.body().getData().getMovies();
                        Logger.i(movies.get(0).toString());
                        setAdapter();
                    }

                    @Override
                    public void onFailure(Call<MovieListBean> call, Throwable t) {
                        Logger.e(t.getMessage());
                    }
                });
    }

    private void setAdapter() {
        mMovieHotList.setLayoutManager(new LinearLayoutManager(mActivity));

        mMovieHotList.setAdapter(new HotMovieListAdapter(mActivity, movies));
    }
}
