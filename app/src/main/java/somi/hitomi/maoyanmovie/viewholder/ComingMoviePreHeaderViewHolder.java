package somi.hitomi.maoyanmovie.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import somi.hitomi.maoyanmovie.R;

/**
 * Created by HitomiT on 2016/12/1.
 */

public class ComingMoviePreHeaderViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.view_sticky_header)
    public TextView mViewStickyHeader;
    @BindView(R.id.movie_coming_header_pre)
    public RecyclerView mMovieComingHeaderPre;

    public ComingMoviePreHeaderViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
}
