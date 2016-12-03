package somi.hitomi.maoyanmovie.animation;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;

import somi.hitomi.maoyanmovie.common.BaseAnimation;


/**
 * https://github.com/CymChad/BaseRecyclerViewAdapterHelper
 */
public class SlideInBottomAnimation implements BaseAnimation {



    @Override
    public Animator[] getAnimators(View view) {
        return new Animator[]{
                ObjectAnimator.ofFloat(view, "translationY", view.getMeasuredHeight(), 0)
        };
    }
}