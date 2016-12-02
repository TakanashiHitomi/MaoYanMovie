package somi.hitomi.maoyanmovie.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import somi.hitomi.maoyanmovie.R;

/**
 * Created by HitomiT on 2016/12/1.
 */

public class ComingPreListViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.item_coming_header_pre_img)
    public ImageView mItemComingHeaderPreImg;
    @BindView(R.id.item_coming_header_pre_name)
    public TextView mItemComingHeaderPreName;
    @BindView(R.id.item_coming_header_pre_desc)
    public TextView mItemComingHeaderPreDesc;

    public ComingPreListViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
}
