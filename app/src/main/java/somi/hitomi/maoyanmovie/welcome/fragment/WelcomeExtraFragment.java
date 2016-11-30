package somi.hitomi.maoyanmovie.welcome.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import somi.hitomi.maoyanmovie.R;
import somi.hitomi.maoyanmovie.activity.MainActivity;
import somi.hitomi.maoyanmovie.welcome.activity.WelcomeActivity;
import somi.hitomi.maoyanmovie.common.BaseFragment;

/**
 * Created by HitomiT on 2016/11/30.
 */

public class WelcomeExtraFragment extends BaseFragment {
    @BindView(R.id.welcome_ex_container)
    ImageView mWelcomeExContainer;
    @BindView(R.id.welcome_jump_button)
    Button mWelcomeJumpButton;
    private WelcomeActivity mActivity;
    private String welcomeImageUrl = "";
    private int duration;
    private boolean canSkip;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivity = (WelcomeActivity) getActivity();
        welcomeImageUrl = mActivity.postersBean.getPic();
        duration = mActivity.postersBean.getDuration();
        canSkip = mActivity.postersBean.isCanSkip();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_welcome_ex, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @OnClick(R.id.welcome_jump_button)
    void onCanJumpClick() {
        mActivity.handler.removeCallbacksAndMessages(null);
        startActivity(new Intent(mActivity, MainActivity.class));
        mActivity.finish();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        // 根据是否可以跳过来设置跳过按钮的显示
        if (canSkip) {
            mWelcomeJumpButton.setVisibility(View.VISIBLE);
        } else {
            mWelcomeJumpButton.setVisibility(View.GONE);
        }
        // 延时消息
        mActivity.handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(mActivity, MainActivity.class));
                mActivity.finish();
            }
        }, duration == 0 ? 2500 : duration);
        // 加载图片
        Glide.with(this)
                .load(welcomeImageUrl)
                .crossFade()
                .centerCrop()
                .into(mWelcomeExContainer);
    }
}
