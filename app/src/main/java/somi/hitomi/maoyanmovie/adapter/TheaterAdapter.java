package somi.hitomi.maoyanmovie.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import somi.hitomi.maoyanmovie.R;
import somi.hitomi.maoyanmovie.domain.TheaterBean;
import somi.hitomi.maoyanmovie.viewholder.TheaterViewHolder;

/**
 * 仅展示昌平区
 * Created by HitomiT on 2016/12/6.
 */
public class TheaterAdapter extends RecyclerView.Adapter {
    private Context context;
    private List<TheaterBean.DataBean.TheaterDetailBean> data;

    public TheaterAdapter(Context context) {
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new TheaterViewHolder(LayoutInflater.from(context)
                .inflate(R.layout.item_theater, parent, false)
        );
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        bindNormalView((TheaterViewHolder) holder, position);
    }

    private void bindNormalView(TheaterViewHolder holder, int position) {
        TheaterBean.DataBean.TheaterDetailBean detailBean = data.get(position);
        holder.mTheaterName.setText(detailBean.getNm());
        holder.mTheaterSellPrice.setText(detailBean.getSellPrice() + "");
        holder.mItemAddr.setText(detailBean.getAddr());
    }

    @Override
    public int getItemCount() {
        return data == null ? 0 : data.size();
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    public void setData(List<TheaterBean.DataBean.TheaterDetailBean> data) {
        this.data = data;
        notifyDataSetChanged();
    }
}
