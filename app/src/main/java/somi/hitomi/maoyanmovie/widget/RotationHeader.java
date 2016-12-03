package somi.hitomi.maoyanmovie.widget;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ProgressBar;

import somi.hitomi.maoyanmovie.R;
import somi.hitomi.maoyanmovie.common.BaseHeader;


/**
 * Created by Administrator on 2016/3/21.
 * Update by HitomiT on 2016/12/3
 */
public class RotationHeader extends BaseHeader {
    private Context context;
    private int rotationSrc;
    private int rotationFuSrc;

    private RotateAnimation mRotateUpAnim;

    private ProgressBar progress;

    public RotationHeader(Context context) {
        this(context, R.drawable.progress_loading, R.drawable.progress_loading_full);
    }

    public RotationHeader(Context context, int rotationSrc, int rotationFuSrc) {
        this.context = context;
        this.rotationSrc = rotationSrc;
        this.rotationFuSrc = rotationFuSrc;

        mRotateUpAnim = new RotateAnimation(0.0f, 360.0f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        mRotateUpAnim.setInterpolator(new LinearInterpolator());
        mRotateUpAnim.setRepeatCount(Integer.MAX_VALUE);
        mRotateUpAnim.setDuration(1200);
        mRotateUpAnim.setFillAfter(true);
    }

    @Override
    public View getView(LayoutInflater inflater, ViewGroup viewGroup) {
        View view = inflater.inflate(R.layout.rotation_header, viewGroup, true);
        progress = (ProgressBar) view.findViewById(R.id.progress);
        progress.setIndeterminateDrawable(ContextCompat.getDrawable(context, rotationSrc));
        return view;
    }

    @Override
    public int getDragLimitHeight(View rootView) {
        return rootView.getMeasuredHeight() / 4;
    }

    @Override
    public void onPreDrag(View rootView) {

    }

    @Override
    public void onDropAnim(View rootView, int dy) {
        float rota = 360 * dy / rootView.getMeasuredHeight();
        progress.setRotation(rota);
    }

    @Override
    public void onLimitDes(View rootView, boolean upORdown) {
    }

    @Override
    public void onStartAnim() {
        progress.startAnimation(mRotateUpAnim);
    }

    @Override
    public void onFinishAnim() {
        progress.clearAnimation();
    }
}