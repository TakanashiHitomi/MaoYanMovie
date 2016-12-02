package somi.hitomi.maoyanmovie.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import somi.hitomi.maoyanmovie.R;
import somi.hitomi.maoyanmovie.domain.ComingMovieBean;
import somi.hitomi.maoyanmovie.domain.ComingMoviePreHeaderDomain;
import somi.hitomi.maoyanmovie.utils.DensityUtils;
import somi.hitomi.maoyanmovie.utils.ImageUrlDomainUtil;
import somi.hitomi.maoyanmovie.viewholder.ComingPreListViewHolder;

/**
 * Created by HitomiT on 2016/12/1.
 */
public class ComingPreAdapter extends RecyclerView.Adapter {

    private Context context;
    private List<ComingMovieBean.DataBean.ComingBean> comingBeanList;
    private List<ComingMoviePreHeaderDomain> headerDomains;

    public ComingPreAdapter(Context context, List<ComingMovieBean.DataBean.ComingBean> comingBeanList) {
        this.context = context;
        this.comingBeanList = comingBeanList;
        // over API24
//        comingBeanList.sort(new Comparator<ComingMovieBean.DataBean.ComingBean>() {
//            @Override
//            public int compare(ComingMovieBean.DataBean.ComingBean comingBean, ComingMovieBean.DataBean.ComingBean t1) {
//                return DateCompareUtil.compareDate(comingBean.getRt(), t1.getRt());
//            }
//        });
        headerDomains = new ArrayList<>();
        for (ComingMovieBean.DataBean.ComingBean comingBean : comingBeanList) {
            String name = comingBean.getNm();
            String imgUrl = comingBean.getImg();
            String videoName = comingBean.getVideoName();
            String videourl = comingBean.getVideourl();

            headerDomains.add(new ComingMoviePreHeaderDomain(name, imgUrl, videoName, videourl));
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ComingPreListViewHolder(
                LayoutInflater.from(context)
                        .inflate(R.layout.item_coming_header_pre, parent, false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof ComingPreListViewHolder) {
            ComingPreListViewHolder viewHolder = (ComingPreListViewHolder) holder;
            ComingMoviePreHeaderDomain headerDomain = headerDomains.get(position);
            viewHolder.mItemComingHeaderPreName.setText(headerDomain.getName());
            viewHolder.mItemComingHeaderPreDesc.setText(headerDomain.getDesc());
            Glide.with(context)
                    .load(ImageUrlDomainUtil.getImageUrlDomain(headerDomain.getImgUrl(), DensityUtils.dp2px(180), DensityUtils.dp2px(180)))
                    .centerCrop()
                    .into(viewHolder.mItemComingHeaderPreImg);
        }
    }

    @Override
    public int getItemCount() {
        return headerDomains == null ? 0 : headerDomains.size();
    }
}
