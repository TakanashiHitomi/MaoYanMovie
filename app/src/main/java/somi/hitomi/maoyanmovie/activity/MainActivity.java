package somi.hitomi.maoyanmovie.activity;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.SparseArray;
import android.widget.FrameLayout;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

import butterknife.BindView;
import butterknife.ButterKnife;
import somi.hitomi.maoyanmovie.R;
import somi.hitomi.maoyanmovie.common.BaseActivity;
import somi.hitomi.maoyanmovie.common.BaseFragment;
import somi.hitomi.maoyanmovie.fragment.DiscoverFragment;
import somi.hitomi.maoyanmovie.fragment.MovieFragment;
import somi.hitomi.maoyanmovie.fragment.TheaterFragment;
import somi.hitomi.maoyanmovie.fragment.UserFragment;

public class MainActivity extends BaseActivity {

    @BindView(R.id.main_container)
    FrameLayout mMainContainer;
    @BindView(R.id.main_bottom_bar)
    BottomBar mMainBottomBar;

    private SparseArray<BaseFragment> fragments;
    private int currentTabId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initFragment();
        initView();
    }

    private void initView() {
        mMainBottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                switchFragment(fragments.get(currentTabId), fragments.get(tabId));
                currentTabId = tabId;
            }
        });
    }

    private void initFragment() {
        fragments = new SparseArray<>();
        fragments.put(R.id.tab_movie, new MovieFragment());
        fragments.put(R.id.tab_theater, new TheaterFragment());
        fragments.put(R.id.tab_discover, new DiscoverFragment());
        fragments.put(R.id.tab_user, new UserFragment());
    }


    private void switchFragment(Fragment from, Fragment to) {
        FragmentTransaction transaction = getSupportFragmentManager()
                .beginTransaction()
                .setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out);

        if (from != null) {
            transaction.hide(from);
        }

        if (!to.isAdded()) {
            transaction
                    .add(R.id.main_container, to);
        } else {
            transaction.show(to);
        }

        transaction.commit();
    }
}
