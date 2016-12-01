package somi.hitomi.maoyanmovie.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import somi.hitomi.maoyanmovie.R;

/**
 * Created by HitomiT on 2016/12/1.
 */

public class ComingMovieViewHolder extends RecyclerView.ViewHolder {
    // normal view
    @BindView(R.id.item_movie_coming_name)
    public TextView mItemMovieComingName;
    @BindView(R.id.item_movie_coming_wish)
    public TextView mItemMovieComingWish;
    @BindView(R.id.item_movie_coming_scm)
    public TextView mItemMovieComingScm;
    @BindView(R.id.item_movie_coming_desc)
    public TextView mItemMovieComingDesc;
    @BindView(R.id.item_movie_coming_pic)
    public ImageView mItemMovieComingPic;
    @BindView(R.id.item_movie_coming_pic_all)
    public FrameLayout mItemMovieComingPicAll;
    @BindView(R.id.item_movie_coming_buy)
    public Button mItemMovieComingBuy;
    // sticky title
    @BindView(R.id.tv_first_show_time)
    public TextView mTvFirstShowTime;
    // headline
    @BindView(R.id.item_movie_coming_headline)
    public RelativeLayout mItemMovieComingHeadline;
    @BindView(R.id.item_movie_coming_headline_title0)
    public TextView mItemMovieComingHeadlineTitle0;
    @BindView(R.id.item_movie_coming_headline_title1)
    public TextView mItemMovieComingHeadlineTitle1;

    public ComingMovieViewHolder(View view) {
        super(view);
        ButterKnife.bind(this, view);
    }
}
