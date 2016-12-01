package somi.hitomi.maoyanmovie.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.orhanobut.logger.Logger;

import java.util.ArrayList;
import java.util.List;

import somi.hitomi.maoyanmovie.R;
import somi.hitomi.maoyanmovie.domain.ComingMovieBean;
import somi.hitomi.maoyanmovie.viewholder.ComingMovieViewHolder;

/**
 * Created by HitomiT on 2016/12/1.
 */

public class ComingMovieAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final int FIRST_STICKY_VIEW = 1;
    public static final int HAS_STICKY_VIEW = 2;
    public static final int NONE_STICKY_VIEW = 3;

    private Context context;
    private List<ComingMovieBean.DataBean.ComingBean> comingBeanList;

    public ComingMovieAdapter(Context context, List<ComingMovieBean.DataBean.ComingBean> comingList) {
        this.context = context;
        this.comingBeanList = comingList;
        aBigNews();
    }

    /**
     * 将数据重复两次，以便测试效果
     */
    private void aBigNews() {
        List<ComingMovieBean.DataBean.ComingBean> littleWork = new ArrayList<>(comingBeanList.size() * 2);
        littleWork.addAll(comingBeanList);
        for (int i = 0; i < comingBeanList.size(); i++) {
            littleWork.add(comingBeanList.size() + i, comingBeanList.get(i));
        }
        comingBeanList = littleWork;
        Logger.i("comingBeanList.size() = " + comingBeanList.size());
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ComingMovieViewHolder(
                LayoutInflater.from(context)
                        .inflate(R.layout.item_movie_coming, parent, false)
        );
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position) {
        if (viewHolder instanceof ComingMovieViewHolder) {
            bindNormalView((ComingMovieViewHolder) viewHolder, position);
        }
    }

    private void bindNormalView(ComingMovieViewHolder viewHolder, int position) {
        ComingMovieBean.DataBean.ComingBean coming = comingBeanList.get(position);
        viewHolder.mItemMovieComingName.setText(coming.getNm());
        viewHolder.mItemMovieComingWish.setText(coming.getWish() + "");
        viewHolder.mItemMovieComingScm.setText(coming.getScm());
        viewHolder.mItemMovieComingDesc.setText(coming.getDesc());

        Glide.with(context)
                .load(coming.getImg())
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

        // sticky header
        if (position == 0) {
            viewHolder.mTvFirstShowTime.setVisibility(View.VISIBLE);
            viewHolder.mTvFirstShowTime.setText(coming.getRt());
            viewHolder.itemView.setTag(FIRST_STICKY_VIEW);
        } else {
            if (!TextUtils.equals(coming.getRt(), comingBeanList.get(position - 1).getRt())) {
                viewHolder.mTvFirstShowTime.setVisibility(View.VISIBLE);
                viewHolder.mTvFirstShowTime.setText(coming.getRt());
                viewHolder.itemView.setTag(HAS_STICKY_VIEW);
            } else {
                viewHolder.mTvFirstShowTime.setVisibility(View.GONE);
                viewHolder.itemView.setTag(NONE_STICKY_VIEW);
            }
        }
        viewHolder.itemView.setContentDescription(coming.getRt());
    }

    @Override
    public int getItemCount() {
        // 还有两个头
        // 可能还有一个...大概
        // 暂时不加头
        return comingBeanList == null ? 0 : comingBeanList.size();
    }
}
