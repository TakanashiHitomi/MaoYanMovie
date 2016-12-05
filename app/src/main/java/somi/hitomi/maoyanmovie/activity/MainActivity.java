package somi.hitomi.maoyanmovie.activity;

import android.Manifest;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.SparseArray;
import android.widget.Toast;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;
import com.tbruyelle.rxpermissions.RxPermissions;

import java.util.Collections;

import butterknife.BindView;
import butterknife.ButterKnife;
import rx.functions.Action1;
import somi.hitomi.maoyanmovie.R;
import somi.hitomi.maoyanmovie.common.BaseActivity;
import somi.hitomi.maoyanmovie.common.BaseFragment;
import somi.hitomi.maoyanmovie.fragment.DiscoverFragment;
import somi.hitomi.maoyanmovie.fragment.MovieFragment;
import somi.hitomi.maoyanmovie.fragment.TheaterFragment;
import somi.hitomi.maoyanmovie.fragment.UserFragment;
import somi.hitomi.maoyanmovie.widget.LoadingStateFrameLayout;

public class MainActivity extends BaseActivity {

    @BindView(R.id.main_bottom_bar)
    BottomBar mMainBottomBar;
    @BindView(R.id.main_container)
    LoadingStateFrameLayout mMainContainer;

    private SparseArray<BaseFragment> fragments;
    private int currentTabId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        RxPermissions rxPermissions = new RxPermissions(this);
        rxPermissions.request(
                Manifest.permission.READ_EXTERNAL_STORAGE,
                Manifest.permission.WRITE_EXTERNAL_STORAGE,
                Manifest.permission.ACCESS_FINE_LOCATION,
                Manifest.permission.ACCESS_COARSE_LOCATION
        ).subscribe(new Action1<Boolean>() {
            @Override
            public void call(Boolean aBoolean) {
                if (!aBoolean) {
                    Toast.makeText(MainActivity.this, "为了更好地使用，最好授予本应用权限> <", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "应用已获授权> <", Toast.LENGTH_SHORT).show();
                }
            }
        });

        initFragment();
        initView();
    }

    private void initView() {
        mMainBottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                mMainContainer.showEmpty(null, null, null, Collections.<Integer>emptyList());
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
//                .setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out)
                ;

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

    public LoadingStateFrameLayout getMainContainer() {
        return mMainContainer;
    }
}
