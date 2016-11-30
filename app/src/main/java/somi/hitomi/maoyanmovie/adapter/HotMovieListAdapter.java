package somi.hitomi.maoyanmovie.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;

import java.util.List;

import somi.hitomi.maoyanmovie.R;
import somi.hitomi.maoyanmovie.ViewHolder.HotMovieListViewHolder;
import somi.hitomi.maoyanmovie.domain.MovieListBean;

/**
 * Created by HitomiT on 2016/11/30.
 */

public class HotMovieListAdapter extends RecyclerView.Adapter<HotMovieListViewHolder> {
    private Context context;
    private List<MovieListBean.DataBean.MoviesBean> movies;

    public HotMovieListAdapter(Context context, List<MovieListBean.DataBean.MoviesBean> movies) {
        this.context = context;
        this.movies = movies;
    }

    @Override
    public HotMovieListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_movie_hot, parent, false);
        return new HotMovieListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(HotMovieListViewHolder holder, int position) {
        MovieListBean.DataBean.MoviesBean movie = movies.get(position);
        holder.mItemMovieHotName.setText(movie.getNm());
        holder.mItemMovieHotDesc.setText(movie.getScm());
        holder.mItemMovieHotShow.setText(movie.getShowInfo());
        holder.mItemMovieHotWish.setText(movie.getWish() + "");
        Glide.with(context)
                .load(movie.getImg())
                .fitCenter()
                .into(holder.mItemMovieHotPic);
        if (movie.getPreSale() == 1) {
            holder.mItemMovieHotBuy.setText("预售");
        } else {
            holder.mItemMovieHotBuy.setText("购买");
        }
        if (movie.isValue3d()) {
            Drawable drawable;
            drawable = context.getDrawable(R.drawable.ic_3d);
            if (movie.isImax()) {
                drawable = context.getDrawable(R.drawable.ic_imax_3d);
            }
            holder.mItemMovieHotName.setCompoundDrawables(null, null, drawable, null);
        }
    }


    @Override
    public int getItemCount() {
        return movies == null ? 0 : movies.size();
    }
}