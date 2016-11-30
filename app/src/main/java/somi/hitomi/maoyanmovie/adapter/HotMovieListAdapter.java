package somi.hitomi.maoyanmovie.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;
import java.util.List;

import somi.hitomi.maoyanmovie.R;
import somi.hitomi.maoyanmovie.domain.HotMovieBannerBean;
import somi.hitomi.maoyanmovie.domain.MovieListBean;
import somi.hitomi.maoyanmovie.viewholder.HotMovieBannerViewHolder;
import somi.hitomi.maoyanmovie.viewholder.HotMovieListViewHolder;

/**
 * Created by HitomiT on 2016/11/30.
 */

public class HotMovieListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private static final int BANNER = 0;
    private static final int NORMAL = 1;
    private final List<HotMovieBannerBean.DataBean> data;
    private Context context;
    private List<MovieListBean.DataBean.MoviesBean> movies;

    public HotMovieListAdapter(Context context, List<MovieListBean.DataBean.MoviesBean> movies, List<HotMovieBannerBean.DataBean> data) {
        this.context = context;
        this.movies = movies;
        this.data = data;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == NORMAL) {
            return new HotMovieListViewHolder(
                    LayoutInflater.from(context).inflate(R.layout.item_movie_hot, parent, false)
            );
        } else {
            return new HotMovieBannerViewHolder(
                    LayoutInflater.from(context).inflate(R.layout.banner_movie_hot, parent, false)
            );
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (getItemViewType(position) == NORMAL) {
            // 此处减1了，下面的方法中就不需要减了
            bindNormalView((HotMovieListViewHolder) holder, position - 1);
        } else if (getItemViewType(position) == BANNER) {
            bindBannerView((HotMovieBannerViewHolder) holder);
        }
    }

    private void bindBannerView(HotMovieBannerViewHolder holder) {
        Banner mHotMovieBanner = holder.mHotMovieBanner;
        mHotMovieBanner.setOffscreenPageLimit(data.size());
        mHotMovieBanner.setBannerStyle(BannerConfig.NOT_INDICATOR);
        // 初始化图片集合
        ArrayList<String> imageUrls = new ArrayList<>();
        for (HotMovieBannerBean.DataBean dataBean : data) {
            imageUrls.add(dataBean.getImgUrl());
        }
        mHotMovieBanner.setBannerAnimation(Transformer.Accordion);
        mHotMovieBanner.setImages(imageUrls);
        mHotMovieBanner.setImageLoader(new ImageLoader() {
            @Override
            public void displayImage(Context context, Object path, ImageView imageView) {
                Glide.with(context)
                        .load(path)
                        .centerCrop()
                        .into(imageView);
            }
        });
        mHotMovieBanner.setBannerAnimation(Transformer.DepthPage);
        //设置自动轮播，默认为true
        mHotMovieBanner.isAutoPlay(true);
        //设置轮播时间
        mHotMovieBanner.setDelayTime(1500);
        mHotMovieBanner.start();
    }

    private void bindNormalView(HotMovieListViewHolder holder, int position) {
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
            drawable = context.getResources().getDrawable(R.drawable.ic_3d, null);
            if (movie.isImax()) {
                drawable = context.getResources().getDrawable(R.drawable.ic_imax_3d, null);
            }
            holder.mItemMovieHotName.setCompoundDrawables(null, null, drawable, null);
        }
    }


    @Override
    public int getItemCount() {
        return movies == null ? 0 : movies.size() + 1;
    }

    @Override
    public int getItemViewType(int position) {
        return position == 0 ? BANNER : NORMAL;
    }
}
