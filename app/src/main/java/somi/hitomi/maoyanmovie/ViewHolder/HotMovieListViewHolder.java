package somi.hitomi.maoyanmovie.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import somi.hitomi.maoyanmovie.R;

/**
 * Created by HitomiT on 2016/11/30.
 */

public class HotMovieListViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.item_movie_hot_name)
    public TextView mItemMovieHotName;
    @BindView(R.id.item_movie_hot_score)
    public TextView mItemMovieHotScore;
    @BindView(R.id.item_movie_hot_desc)
    public TextView mItemMovieHotDesc;
    @BindView(R.id.item_movie_hot_show)
    public TextView mItemMovieHotShow;
    @BindView(R.id.item_movie_hot_buy)
    public Button mItemMovieHotBuy;
    @BindView(R.id.item_movie_hot_pic)
    public ImageView mItemMovieHotPic;

    public HotMovieListViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
}
