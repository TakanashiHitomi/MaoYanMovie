package somi.hitomi.maoyanmovie.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import somi.hitomi.maoyanmovie.R;

/**
 * Created by HitomiT on 2016/12/4.
 */
public class SearchTitleViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.search_title)
    public TextView mSearchTitle;

    public SearchTitleViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
}
