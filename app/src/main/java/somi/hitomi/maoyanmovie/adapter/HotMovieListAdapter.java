package somi.hitomi.maoyanmovie.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
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
import somi.hitomi.maoyanmovie.activity.MovieContentActivity;
import somi.hitomi.maoyanmovie.domain.HotMovieBannerBean;
import somi.hitomi.maoyanmovie.domain.MovieListBean;
import somi.hitomi.maoyanmovie.utils.DensityUtils;
import somi.hitomi.maoyanmovie.utils.ImageUrlDomainUtil;
import somi.hitomi.maoyanmovie.viewholder.HotMovieBannerViewHolder;
import somi.hitomi.maoyanmovie.viewholder.HotMovieListViewHolder;

/**
 * Created by HitomiT on 2016/11/30.
 */

public class HotMovieListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private static final int BANNER = 0;
    private static final int NORMAL = 1;
    private Context context;
    private List<MovieListBean.DataBean.HotBean> movies;
    private List<HotMovieBannerBean.DataBean> bannerData;

    public HotMovieListAdapter(Context context, List<MovieListBean.DataBean.HotBean> movies) {
        this.context = context;
        this.movies = movies;
    }

    public void setBanner(List<HotMovieBannerBean.DataBean> bannerData) {
        this.bannerData = bannerData;
        notifyDataSetChanged();
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
        mHotMovieBanner.setOffscreenPageLimit(bannerData.size());
        mHotMovieBanner.setBannerStyle(BannerConfig.NOT_INDICATOR);
        // 初始化图片集合
        ArrayList<String> imageUrls = new ArrayList<>();
        for (HotMovieBannerBean.DataBean dataBean : bannerData) {
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
        mHotMovieBanner.setDelayTime(2500);
        mHotMovieBanner.start();
    }

    private void bindNormalView(HotMovieListViewHolder holder, int position) {
        final MovieListBean.DataBean.HotBean movie = movies.get(position);
        holder.mItemMovieHotName.setText(movie.getNm());
        holder.mItemMovieHotDesc.setText(movie.getScm());
        holder.mItemMovieHotShow.setText(movie.getShowInfo());
        holder.mItemMovieHotWish.setText(movie.getWish() + "");
        Glide.with(context)
                .load(ImageUrlDomainUtil.getImageUrlDomain(movie.getImg(), DensityUtils.dp2px(63), DensityUtils.dp2px(93)))
                .fitCenter()
                .into(holder.mItemMovieHotPic);
        if (movie.getPreSale() == 1) {
            holder.mItemMovieHotBuy.setText("预售");
        } else {
            holder.mItemMovieHotBuy.setText("购买");
        }
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, MovieContentActivity.class);
                intent.putExtra("movieId", movie.getId());
                context.startActivity(intent);
            }
        });
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
