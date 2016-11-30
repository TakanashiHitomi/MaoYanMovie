package somi.hitomi.maoyanmovie.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.SparseArray;

import butterknife.ButterKnife;
import somi.hitomi.maoyanmovie.R;
import somi.hitomi.maoyanmovie.common.BaseActivity;
import somi.hitomi.maoyanmovie.fragment.WelcomeMainFragment;

public class WelcomeActivity extends BaseActivity {

    private static final int WELCOME_MAIN = (2 << 5);
    private static final int WELCOME_EX = (2 << 5) + 1;
    private SparseArray<Fragment> fragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        ButterKnife.bind(this);

        initFragment();
    }

    private void initFragment() {
        fragments = new SparseArray<>();
        fragments.put(WELCOME_MAIN, new WelcomeMainFragment());
        fragments.put(WELCOME_EX, new WelcomeMainFragment());
    }



}
