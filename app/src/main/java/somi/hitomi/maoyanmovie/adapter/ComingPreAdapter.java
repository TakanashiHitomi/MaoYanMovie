package somi.hitomi.maoyanmovie.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.orhanobut.logger.Logger;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import somi.hitomi.maoyanmovie.R;
import somi.hitomi.maoyanmovie.domain.ComingMovieBean;
import somi.hitomi.maoyanmovie.domain.ComingVideoPreBean;
import somi.hitomi.maoyanmovie.net.RetrofitAPI;
import somi.hitomi.maoyanmovie.utils.BaseURL;
import somi.hitomi.maoyanmovie.viewholder.ComingPreListViewHolder;

/**
 * Created by HitomiT on 2016/12/1.
 */
public class ComingPreAdapter extends RecyclerView.Adapter {

    private Context context;
    //    private List<ComingMovieBean.DataBean.ComingBean> comingBeanList;
    private List<ComingVideoPreBean.DataBean> preVideoData;

    public ComingPreAdapter(Context context, List<ComingMovieBean.DataBean.ComingBean> comingBeanList) {
        this.context = context;
        new Retrofit.Builder()
                .baseUrl(BaseURL.COMING_MOVIE_PRE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(RetrofitAPI.ComingVideoPreAPI.class)
                .getComingVideoPre()
                .enqueue(new Callback<ComingVideoPreBean>() {
                    @Override
                    public void onResponse(Call<ComingVideoPreBean> call, Response<ComingVideoPreBean> response) {
                        preVideoData = response.body().getData();
                        notifyDataSetChanged();
                    }

                    @Override
                    public void onFailure(Call<ComingVideoPreBean> call, Throwable t) {
                        Logger.e(t.getMessage());
                    }
                });
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ComingPreListViewHolder(
                LayoutInflater.from(context)
                        .inflate(R.layout.item_coming_header_pre, parent, false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof ComingPreListViewHolder) {
            bindPreView((ComingPreListViewHolder) holder, position);
        }
    }

    private void bindPreView(ComingPreListViewHolder viewHolder, int position) {
        ComingVideoPreBean.DataBean data = preVideoData.get(position);
        viewHolder.mItemComingHeaderPreName.setText(data.getMovieName());
        viewHolder.mItemComingHeaderPreDesc.setText(data.getOriginName());
        Glide.with(context)
                .load(data.getImg())
                .fitCenter()
                .into(viewHolder.mItemComingHeaderPreImg);
    }

    @Override
    public int getItemCount() {
        return preVideoData == null ? 0 : preVideoData.size();
    }
}
