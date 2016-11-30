package somi.hitomi.maoyanmovie.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import somi.hitomi.maoyanmovie.R;
import somi.hitomi.maoyanmovie.common.BaseFragment;

/**
 * Created by HitomiT on 2016/11/30.
 */

public class WelcomeExtraFragment extends BaseFragment {
    @BindView(R.id.welcome_ex_container)
    ImageView mWelcomeExContainer;
    @BindView(R.id.button)
    Button mButton;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_welcome_ex, container, false);
        ButterKnife.bind(this, view);
        return view;
    }
}
