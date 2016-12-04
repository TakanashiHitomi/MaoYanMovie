package somi.hitomi.maoyanmovie.listener;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import somi.hitomi.maoyanmovie.adapter.ComingMovieAdapter;

/**
 * Sticky Header Listener<br/>
 * Created by HitomiT on 2016/12/1.
 */

public class StickyHeaderListener extends RecyclerView.OnScrollListener {
    private TextView mViewStickyHeader;

    public StickyHeaderListener(TextView stickyHeader) {
        this.mViewStickyHeader = stickyHeader;
    }

    @Override
    public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
        super.onScrolled(recyclerView, dx, dy);

        // Get the sticky information from the topmost view of the screen.
        View stickyInfoView = recyclerView.findChildViewUnder(
                mViewStickyHeader.getMeasuredWidth() / 2, 5);

        if (stickyInfoView != null && stickyInfoView.getContentDescription() != null) {
            mViewStickyHeader.setText(String.valueOf(stickyInfoView.getContentDescription()));
        }

        // Get the sticky view's translationY by the first view below the sticky's height.
        View transInfoView = recyclerView.findChildViewUnder(
                mViewStickyHeader.getMeasuredWidth() / 2, mViewStickyHeader.getMeasuredHeight() + 1);

        if (transInfoView != null && transInfoView.getTag() != null) {
            int transViewStatus = (int) transInfoView.getTag();
            int dealtY = transInfoView.getTop() - mViewStickyHeader.getMeasuredHeight();
            if (transViewStatus == ComingMovieAdapter.HAS_STICKY_VIEW) {
                // If the first view below the sticky's height scroll off the screen,
                // then recovery the sticky view's translationY.
                if (transInfoView.getTop() > 0) {
                    mViewStickyHeader.setTranslationY(dealtY);
                } else {
                    mViewStickyHeader.setTranslationY(0);
                }
            } else if (transViewStatus == ComingMovieAdapter.NONE_STICKY_VIEW) {
                mViewStickyHeader.setTranslationY(0);
            }
        }
    }
}
