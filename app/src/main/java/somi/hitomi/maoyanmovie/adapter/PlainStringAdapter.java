package somi.hitomi.maoyanmovie.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import somi.hitomi.maoyanmovie.R;
import somi.hitomi.maoyanmovie.common.BaseClickableRecyclerViewAdapter;

/**
 * Created by HitomiT on 2016/12/7.
 */
public class PlainStringAdapter extends BaseClickableRecyclerViewAdapter {
    private Context context;
    private List<String> data;

    public PlainStringAdapter(Context context) {
        this.context = context;
    }

    public PlainStringAdapter(Context context, List<String> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    protected RecyclerView.ViewHolder getViewHolder(View view) {
        return new PlainStringViewHolder(view);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.item_theater_filter;
    }

    @Override
    protected void bindNormalView(RecyclerView.ViewHolder holder, int position) {
        ((PlainStringViewHolder) holder).mItemTheaterFilterStr.setText(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data == null ? 0 : data.size();
    }

    class PlainStringViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.item_theater_filter_str)
        TextView mItemTheaterFilterStr;

        PlainStringViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
