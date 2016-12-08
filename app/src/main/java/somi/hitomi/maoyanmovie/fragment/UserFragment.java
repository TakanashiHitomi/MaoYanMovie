package somi.hitomi.maoyanmovie.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import somi.hitomi.maoyanmovie.R;
import somi.hitomi.maoyanmovie.activity.LoginActivity;
import somi.hitomi.maoyanmovie.activity.MainActivity;
import somi.hitomi.maoyanmovie.common.BaseFragment;
import somi.hitomi.maoyanmovie.widget.LoadingStateFrameLayout;

/**
 * User Fragment
 * Created by HitomiT on 2016/11/30.
 */

public class UserFragment extends BaseFragment implements View.OnClickListener {

    @BindView(R.id.loading_page)
    LoadingStateFrameLayout mLoadingPage;
    @BindView(R.id.ll_login)
    LinearLayout mLlLogin;
    private MainActivity mActivity;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivity = (MainActivity) getActivity();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_user, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mLlLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.ll_login) {
            startActivity(new Intent(mActivity, LoginActivity.class));
        }
    }
}
