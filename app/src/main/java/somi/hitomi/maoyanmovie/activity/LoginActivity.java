package somi.hitomi.maoyanmovie.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import somi.hitomi.maoyanmovie.R;
import somi.hitomi.maoyanmovie.adapter.ViewPagerAdapter;
import somi.hitomi.maoyanmovie.common.BaseActivity;
import somi.hitomi.maoyanmovie.fragment.AccountLoginFragment;
import somi.hitomi.maoyanmovie.fragment.PhoneLoginFragment;

public class LoginActivity extends BaseActivity {

    @BindView(R.id.tv_register)
    TextView mTvRegister;
    @BindView(R.id.tab_login)
    TabLayout mTabLogin;
    @BindView(R.id.vp_login)
    ViewPager mVpLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {
        mVpLogin.setAdapter(getAdapter());
        mVpLogin.setOffscreenPageLimit(2);
        mTabLogin.setupWithViewPager(mVpLogin);
    }

    private ViewPagerAdapter getAdapter() {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Bundle getArgs(int position) {
                return null;
            }
        };
        adapter.addFragment(AccountLoginFragment.class, "账号密码登陆");
        adapter.addFragment(PhoneLoginFragment.class, "手机号快速登陆");

        return adapter;
    }
}
