package somi.hitomi.maoyanmovie.welcome.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import somi.hitomi.maoyanmovie.R;
import somi.hitomi.maoyanmovie.common.BaseFragment;

/**
 * Created by HitomiT on 2016/11/30.
 */

public class WelcomeMainFragment extends BaseFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_welcome_main, container, false);
    }
}
