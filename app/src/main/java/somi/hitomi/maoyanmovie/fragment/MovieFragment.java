package somi.hitomi.maoyanmovie.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.AppCompatButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.flyco.tablayout.SlidingTabLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import somi.hitomi.maoyanmovie.R;
import somi.hitomi.maoyanmovie.activity.CityPickerActivity;
import somi.hitomi.maoyanmovie.activity.MainActivity;
import somi.hitomi.maoyanmovie.adapter.ViewPagerAdapter;
import somi.hitomi.maoyanmovie.common.BaseFragment;

import static android.app.Activity.RESULT_OK;
import static somi.hitomi.maoyanmovie.activity.CityPickerActivity.KEY_PICKED_CITY;

/**
 * Movie Fragment
 * Created by HitomiT on 2016/11/30.
 */

public class MovieFragment extends BaseFragment {
    @BindView(R.id.title_seg_tab)
    SlidingTabLayout mTitleSegTab;
    @BindView(R.id.title_city)
    AppCompatButton mTitleCity;
    @BindView(R.id.hot_movie_pager)
    ViewPager mHotMoviePager;
    private MainActivity mActivity;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_movie, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        mHotMoviePager.setAdapter(getAdapter());
        mHotMoviePager.setOffscreenPageLimit(3);
        mTitleSegTab.setViewPager(mHotMoviePager);
    }

    @OnClick(R.id.title_city)
    void onTitleCityClick() {
        startActivityForResult(new Intent(mActivity, CityPickerActivity.class), 1);
    }

    @Override
    protected void initContext() {
        mActivity = (MainActivity) getActivity();
    }

    private ViewPagerAdapter getAdapter() {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getChildFragmentManager()) {
            @Override
            public Bundle getArgs(int position) {
                return null;
            }
        };
        adapter.addFragment(HotMovieFragment.class, "热映");
        adapter.addFragment(WaittingMovieFragment.class, "待映");
        adapter.addFragment(FindMovieFragment.class, "搜片");

        return adapter;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == RESULT_OK) {
            String city = data.getStringExtra(KEY_PICKED_CITY);
            mTitleCity.setText(city);
        }
    }
}
