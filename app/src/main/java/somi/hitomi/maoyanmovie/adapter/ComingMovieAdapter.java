package somi.hitomi.maoyanmovie.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import somi.hitomi.maoyanmovie.R;
import somi.hitomi.maoyanmovie.activity.SearchActivity;
import somi.hitomi.maoyanmovie.domain.ComingMovieBean;
import somi.hitomi.maoyanmovie.utils.DateCompareUtil;
import somi.hitomi.maoyanmovie.utils.DateUtils;
import somi.hitomi.maoyanmovie.utils.DensityUtils;
import somi.hitomi.maoyanmovie.utils.ImageUrlDomainUtil;
import somi.hitomi.maoyanmovie.viewholder.ComingMoviePreHeaderViewHolder;
import somi.hitomi.maoyanmovie.viewholder.ComingMovieViewHolder;
import somi.hitomi.maoyanmovie.viewholder.SearchTitleViewHolder;

/**
 * Created by HitomiT on 2016/12/1.
 */

public class ComingMovieAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final int FIRST_STICKY_VIEW = 1;
    public static final int HAS_STICKY_VIEW = 2;
    public static final int NONE_STICKY_VIEW = 3;

    public static final int ITEM_NORMAL = (2 << 5);
    public static final int ITEM_HEADER_PRE = (2 << 5) + 1;
    private static final int SEARCH_TITLE = (2 << 5) + 2;

    private Context context;
    private List<ComingMovieBean.DataBean.ComingBean> comingBeanList;
    private List<String> stickHeader;

    public ComingMovieAdapter(Context context, List<ComingMovieBean.DataBean.ComingBean> comingList) {
        this.context = context;
        this.comingBeanList = comingList;
        sortList();
        makeStickyHeaderTitle();
//        aBigNews();
    }

    /**
     * 按照日期排序<br/>
     * 此方法不完整
     */

    private void sortList() {
        Collections.sort(comingBeanList, new Comparator<ComingMovieBean.DataBean.ComingBean>() {
            @Override
            public int compare(ComingMovieBean.DataBean.ComingBean comingBean, ComingMovieBean.DataBean.ComingBean t1) {
                String date1 = comingBean.getRt();
                String date2 = t1.getRt();
                if (date1 == null | date2 == null) {
                    return 1;
                }
                return DateCompareUtil.compareDate(date1, date2);
            }
        });
    }

    private void makeStickyHeaderTitle() {
        stickHeader = new ArrayList<>();
        stickHeader.add("预告片推荐");
//        stickHeader.add("近期最受期待");
        for (ComingMovieBean.DataBean.ComingBean comingBean : comingBeanList) {
            stickHeader.add(DateUtils.number2Char(comingBean.getRt()));
        }
    }

    /**
     * 将数据重复两次，以便测试效果<br/>
     * 由于获取了正确的数据，此方法弃用<br/>
     * 不过说不定什么时候能用到。。。
     */
    @Deprecated
    private void aBigNews() {
        List<ComingMovieBean.DataBean.ComingBean> littleWork = new ArrayList<>(comingBeanList.size() * 2);
        littleWork.addAll(comingBeanList);
        for (int i = 0; i < comingBeanList.size(); i++) {
            littleWork.add(comingBeanList.size() + i, comingBeanList.get(i));
        }
        comingBeanList = littleWork;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == ITEM_NORMAL) {
            return new ComingMovieViewHolder(
                    LayoutInflater.from(context)
                            .inflate(R.layout.item_movie_coming, parent, false)
            );
        } else if (viewType == ITEM_HEADER_PRE) {
            return new ComingMoviePreHeaderViewHolder(
                    LayoutInflater.from(context)
                            .inflate(R.layout.coming_header_view_pre, parent, false)
            );
        } else {
            return new SearchTitleViewHolder(
                    LayoutInflater.from(context).inflate(R.layout.view_search_title, parent, false)
            );
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position) {
        if (viewHolder instanceof ComingMovieViewHolder) {
            // 此处位置已减2 额外的search title
            bindNormalView((ComingMovieViewHolder) viewHolder, position - 2);
            bindStickyHeader(viewHolder, position - 1);
        } else if (viewHolder instanceof ComingMoviePreHeaderViewHolder) {
            bindPreHeader((ComingMoviePreHeaderViewHolder) viewHolder);
            bindStickyHeader(viewHolder, position - 1);
        } else if (getItemViewType(position) == SEARCH_TITLE) {
            bindSearchView((SearchTitleViewHolder) viewHolder);
        }
    }

    private void bindSearchView(SearchTitleViewHolder holder) {
        holder.mSearchTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(new Intent(context, SearchActivity.class));
            }
        });
    }

    private void bindStickyHeader(RecyclerView.ViewHolder viewHolder, int position) {
        // sticky header
        if (position == 0) {
            if (viewHolder instanceof ComingMoviePreHeaderViewHolder) {
                ComingMoviePreHeaderViewHolder holder = (ComingMoviePreHeaderViewHolder) viewHolder;
                holder.mViewStickyHeader.setVisibility(View.VISIBLE);
                holder.mViewStickyHeader.setText(stickHeader.get(position));
                holder.itemView.setTag(FIRST_STICKY_VIEW);
                viewHolder.itemView.setContentDescription(stickHeader.get(position));
            }
        } else {
            if (viewHolder instanceof ComingMovieViewHolder) {
                ComingMovieViewHolder holder = (ComingMovieViewHolder) viewHolder;
                if (!TextUtils.equals(stickHeader.get(position), stickHeader.get(position - 1))) {
                    holder.mTvFirstShowTime.setVisibility(View.VISIBLE);
                    holder.mTvFirstShowTime.setText(comingBeanList.get(position - 1).getComingTitle());
                    holder.itemView.setTag(HAS_STICKY_VIEW);
                } else {
                    holder.mTvFirstShowTime.setVisibility(View.GONE);
                    holder.itemView.setTag(NONE_STICKY_VIEW);
                }
                viewHolder.itemView.setContentDescription(comingBeanList.get(position - 1).getComingTitle());
            }
        }
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return SEARCH_TITLE;
        } else if (position == 1) {
            return ITEM_HEADER_PRE;
        }
        return ITEM_NORMAL;
    }

    private void bindPreHeader(ComingMoviePreHeaderViewHolder viewHolder) {
        viewHolder.mMovieComingHeaderPre.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        viewHolder.mMovieComingHeaderPre.setAdapter(new ComingPreAdapter(context, comingBeanList));
        viewHolder.mViewStickyHeader.setVisibility(View.VISIBLE);
        viewHolder.mViewStickyHeader.setText("预告片推荐");
        viewHolder.itemView.setTag(FIRST_STICKY_VIEW);
    }

    private void bindNormalView(ComingMovieViewHolder viewHolder, int position) {
        ComingMovieBean.DataBean.ComingBean coming = comingBeanList.get(position);
        viewHolder.mItemMovieComingName.setText(coming.getNm());
        viewHolder.mItemMovieComingWish.setText(coming.getWish() + "");
        viewHolder.mItemMovieComingScm.setText(coming.getScm());
        viewHolder.mItemMovieComingDesc.setText(coming.getDesc());

        Glide.with(context)
                .load(ImageUrlDomainUtil.getImageUrlDomain(coming.getImg(), DensityUtils.dp2px(65), DensityUtils.dp2px(100)))
                .centerCrop()
                .into(viewHolder.mItemMovieComingPic);

        // headline
        if (coming.getHeadLinesVO().size() == 0) {
            viewHolder.mItemMovieComingHeadline.setVisibility(View.GONE);
        } else {
            viewHolder.mItemMovieComingHeadline.setVisibility(View.VISIBLE);
            viewHolder.mItemMovieComingHeadlineTitle0.setText(coming.getHeadLinesVO().get(0).getTitle());
            viewHolder.mItemMovieComingHeadlineTitle1.setText(coming.getHeadLinesVO().get(1).getTitle());
        }

    }

    @Override
    public int getItemCount() {
        // 还有两个头 加了一个了
        // 加了一个搜索
        // 可能还有一个...大概
        return comingBeanList == null ? 0 : comingBeanList.size() + 1 + 1;
    }
}
