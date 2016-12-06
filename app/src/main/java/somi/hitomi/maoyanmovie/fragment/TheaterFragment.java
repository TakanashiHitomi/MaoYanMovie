package somi.hitomi.maoyanmovie.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import somi.hitomi.maoyanmovie.R;
import somi.hitomi.maoyanmovie.activity.MainActivity;
import somi.hitomi.maoyanmovie.city_picker.activity.CityPickerActivity;
import somi.hitomi.maoyanmovie.common.BaseFragment;
import somi.hitomi.maoyanmovie.widget.LoadingStateFrameLayout;

import static android.app.Activity.RESULT_OK;
import static somi.hitomi.maoyanmovie.city_picker.activity.CityPickerActivity.KEY_PICKED_CITY;

/**
 * Theater Fragment
 * Created by HitomiT on 2016/11/30.
 */

public class TheaterFragment extends BaseFragment implements View.OnClickListener {
    @BindView(R.id.loading_page)
    LoadingStateFrameLayout mLoadingPage;
    @BindView(R.id.theater_city)
    Button mTheaterCity;
    @BindView(R.id.theater_search)
    ImageView mTheaterSearch;
    @BindView(R.id.rv_theater)
    RecyclerView mRvTheater;
    @BindView(R.id.theater_filter)
    ImageView mTheaterFilter;
    private MainActivity mActivity;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivity = (MainActivity) getActivity();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_theater, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mTheaterFilter.setOnClickListener(this);
        mTheaterSearch.setOnClickListener(this);
    }

    @OnClick(R.id.theater_city)
    void onTheaterCityClick() {
        startActivityForResult(new Intent(mActivity, CityPickerActivity.class), 2);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 2 && resultCode == RESULT_OK) {
            String city = data.getStringExtra(KEY_PICKED_CITY);
            mTheaterCity.setText(city);
        }
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.theater_filter) {
            Toast.makeText(mActivity, "Theater Filter", Toast.LENGTH_SHORT).show();
        } else if (view.getId() == R.id.theater_search) {
            Toast.makeText(mActivity, "Theater Search", Toast.LENGTH_SHORT).show();
        }
    }
}
