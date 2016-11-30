package somi.hitomi.maoyanmovie.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.util.SparseArray;
import android.widget.FrameLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import somi.hitomi.maoyanmovie.R;
import somi.hitomi.maoyanmovie.fragment.WelcomeMainFragment;

public class WelcomeActivity extends AppCompatActivity {

    private static final int WELCOME_MAIN = (2 << 5);
    private static final int WELCOME_EX = (2 << 5) + 1;
    @BindView(R.id.welcome_container)
    FrameLayout mWelcomeContainer;
    private SparseArray<Fragment> fragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        ButterKnife.bind(this);

        fragments = new SparseArray<>();
        fragments.put(WELCOME_MAIN, new WelcomeMainFragment());
        fragments.put(WELCOME_EX, new WelcomeMainFragment());
    }


}
