package somi.hitomi.maoyanmovie.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import somi.hitomi.maoyanmovie.R;

/**
 * Created by HitomiT on 2016/12/6.
 */
public class TheaterViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.theater_name)
    public TextView mTheaterName;
    @BindView(R.id.theater_sell_price)
    public TextView mTheaterSellPrice;
    @BindView(R.id.item_addr)
    public TextView mItemAddr;

    public TheaterViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
}
