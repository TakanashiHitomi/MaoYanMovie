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

public class DiscoverStyle3ViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.item_title)
    public TextView mItemTitle;
    @BindView(R.id.item_pic1)
    public ImageView mItemPic1;
    @BindView(R.id.item_pic2)
    public ImageView mItemPic2;
    @BindView(R.id.item_pic3)
    public ImageView mItemPic3;
    @BindView(R.id.item_nick)
    public TextView mItemNick;
    @BindView(R.id.item_saw)
    public TextView mItemSaw;
    @BindView(R.id.item_commit)
    public TextView mItemCommit;

    public DiscoverStyle3ViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
}
