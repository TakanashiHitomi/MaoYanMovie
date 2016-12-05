package somi.hitomi.maoyanmovie.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import somi.hitomi.maoyanmovie.R;

/**
 * Created by HitomiT on 2016/12/5.
 */

public class DiscoverStyle2ViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.item_pic)
    public ImageView mItemPic;
    @BindView(R.id.item_content)
    public TextView mItemContent;
    @BindView(R.id.item_nick)
    public TextView mItemNick;
    @BindView(R.id.item_saw)
    public TextView mItemSaw;
    @BindView(R.id.item_commit)
    public TextView mItemCommit;

    public DiscoverStyle2ViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
}
