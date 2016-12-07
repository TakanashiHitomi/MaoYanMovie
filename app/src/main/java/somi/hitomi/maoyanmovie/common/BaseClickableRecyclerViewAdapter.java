package somi.hitomi.maoyanmovie.common;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by HitomiT on 2016/12/7.
 */

public abstract class BaseClickableRecyclerViewAdapter extends RecyclerView.Adapter implements View.OnClickListener {
    protected OnRecyclerViewItemClickListener mOnItemClickListener = null;

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(getLayoutId(), parent, false);
        view.setOnClickListener(this);
        return getViewHolder(view);
    }

    protected abstract RecyclerView.ViewHolder getViewHolder(View view);

    protected abstract int getLayoutId();

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        holder.itemView.setTag(position);
        bindNormalView(holder, position);
    }

    protected abstract void bindNormalView(RecyclerView.ViewHolder holder, int position);

    public abstract int getItemCount();

    public void setOnItemClickListener(OnRecyclerViewItemClickListener listener) {
        this.mOnItemClickListener = listener;
    }

    @Override
    public void onClick(View view) {
        if (mOnItemClickListener != null) {
            mOnItemClickListener.onItemClick(view, (Integer) view.getTag());
        }
    }

    //define interface
    public interface OnRecyclerViewItemClickListener {
        void onItemClick(View view, int position);
    }
}
