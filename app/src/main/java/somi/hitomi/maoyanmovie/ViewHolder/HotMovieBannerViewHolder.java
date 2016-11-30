package somi.hitomi.maoyanmovie.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.youth.banner.Banner;

import butterknife.BindView;
import butterknife.ButterKnife;
import somi.hitomi.maoyanmovie.R;

/**
 * Created by HitomiT on 2016/11/30.
 */

public class HotMovieBannerViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.hot_movie_banner)
    public Banner mHotMovieBanner;

    public HotMovieBannerViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
}
