package somi.hitomi.maoyanmovie.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;

import java.util.List;

import somi.hitomi.maoyanmovie.R;
import somi.hitomi.maoyanmovie.domain.DiscoverBean;
import somi.hitomi.maoyanmovie.viewholder.DiscoverStyle2ViewHolder;
import somi.hitomi.maoyanmovie.viewholder.DiscoverStyle3ViewHolder;
import somi.hitomi.maoyanmovie.viewholder.DiscoverStyle4ViewHolder;

/**
 * Created by HitomiT on 2016/12/5.
 */
public class DiscoverAdapter extends RecyclerView.Adapter {
    private static final int STYLE_4 = (2 << 5);
    private static final int STYLE_2 = (2 << 5) + 1;
    private static final int STYLE_3 = (2 << 5) + 2;

    private Context context;
    private List<DiscoverBean.DataBean.FeedsBean> feeds;

    public DiscoverAdapter(Context context) {
        this.context = context;
    }

    public void setFeeds(List<DiscoverBean.DataBean.FeedsBean> feeds) {
        this.feeds = feeds;
        notifyDataSetChanged();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == STYLE_2) {
            return new DiscoverStyle2ViewHolder(
                    LayoutInflater.from(context).inflate(R.layout.item_discover_style_2, parent, false)
            );
        } else if (viewType == STYLE_3) {
            return new DiscoverStyle3ViewHolder(
                    LayoutInflater.from(context).inflate(R.layout.item_discover_style_3, parent, false)
            );
        } else if (viewType == STYLE_4) {
            return new DiscoverStyle4ViewHolder(
                    LayoutInflater.from(context).inflate(R.layout.item_discover_style_4, parent, false)
            );
        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        DiscoverBean.DataBean.FeedsBean feedsBean = feeds.get(position);
        if (holder instanceof DiscoverStyle4ViewHolder) {
            bindStyle4((DiscoverStyle4ViewHolder) holder, feedsBean);
        } else if (holder instanceof DiscoverStyle2ViewHolder) {
            bindStyle2((DiscoverStyle2ViewHolder) holder, feedsBean);
        } else if (holder instanceof DiscoverStyle3ViewHolder) {
            bindStyle3((DiscoverStyle3ViewHolder) holder, feedsBean);
        }
    }

    private void bindStyle2(DiscoverStyle2ViewHolder holder, DiscoverBean.DataBean.FeedsBean feedsBean) {
        holder.mItemNick.setText(feedsBean.getUser() == null ? "" : feedsBean.getUser().getNickName());
        holder.mItemContent.setText(feedsBean.getTitle());
        holder.mItemCommit.setText(feedsBean.getCommentCount() + "");
        holder.mItemSaw.setText(feedsBean.getViewCount() + "");

        Glide.with(context)
                .load(feedsBean.getImages().get(0).getUrl())
                .centerCrop()
                .into(holder.mItemPic);
    }

    private void bindStyle3(DiscoverStyle3ViewHolder holder, DiscoverBean.DataBean.FeedsBean feedsBean) {
        holder.mItemTitle.setText(feedsBean.getTitle());
        holder.mItemNick.setText(feedsBean.getUser().getNickName());
        holder.mItemCommit.setText(feedsBean.getCommentCount() + "");
        holder.mItemSaw.setText(feedsBean.getViewCount() + "");

        Glide.with(context)
                .load(feedsBean.getImages().get(0).getUrl())
                .centerCrop()
                .into(holder.mItemPic1);
        Glide.with(context)
                .load(feedsBean.getImages().get(1).getUrl())
                .centerCrop()
                .into(holder.mItemPic2);
        Glide.with(context)
                .load(feedsBean.getImages().get(2).getUrl())
                .centerCrop()
                .into(holder.mItemPic3);
    }

    private void bindStyle4(DiscoverStyle4ViewHolder holder, DiscoverBean.DataBean.FeedsBean feedsBean) {
        holder.mItemTitle.setText(feedsBean.getTitle());
        holder.mItemNick.setText(feedsBean.getUser().getNickName());
        holder.mItemCommit.setText(feedsBean.getCommentCount() + "");
        holder.mItemSaw.setText(feedsBean.getViewCount() + "");

        Glide.with(context)
                .load(feedsBean.getImages().get(0).getUrl())
                .centerCrop()
                .into(holder.mItemPic1);
        Glide.with(context)
                .load(feedsBean.getImages().get(1).getUrl())
                .centerCrop()
                .into(holder.mItemPic2);
        Glide.with(context)
                .load(feedsBean.getImages().get(2).getUrl())
                .centerCrop()
                .into(holder.mItemPic3);
    }

    @Override
    public int getItemViewType(int position) {
        DiscoverBean.DataBean.FeedsBean feedsBean = feeds.get(position);
        if (feedsBean.getStyle() == 2) {
            return STYLE_2;
        } else if (feedsBean.getStyle() == 3) {
            return STYLE_3;
        } else if (feedsBean.getStyle() == 4) {
            return STYLE_4;
        }
        return 0;
    }

    @Override
    public int getItemCount() {
        return feeds == null ? 0 : feeds.size();
    }
}
