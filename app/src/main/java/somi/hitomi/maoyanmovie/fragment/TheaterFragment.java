package somi.hitomi.maoyanmovie.fragment;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;

import com.orhanobut.logger.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;
import somi.hitomi.maoyanmovie.R;
import somi.hitomi.maoyanmovie.activity.MainActivity;
import somi.hitomi.maoyanmovie.activity.SearchActivity;
import somi.hitomi.maoyanmovie.adapter.PlainStringAdapter;
import somi.hitomi.maoyanmovie.adapter.TheaterAdapter;
import somi.hitomi.maoyanmovie.city_picker.activity.CityPickerActivity;
import somi.hitomi.maoyanmovie.common.BaseClickableRecyclerViewAdapter;
import somi.hitomi.maoyanmovie.common.BaseFragment;
import somi.hitomi.maoyanmovie.domain.TheaterBean;
import somi.hitomi.maoyanmovie.net.RetrofitAPI;
import somi.hitomi.maoyanmovie.utils.BaseURL;
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
    private TheaterBean.DataBean data;
    private TheaterAdapter theaterAdapter;
    private HashMap<String, List<TheaterBean.DataBean.TheaterDetailBean>> allDetailBeanList;
    private PopupWindow popupWindow;

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
        initPopupWindow(null);
        return view;
    }

    private void initPopupWindow(@Nullable Bundle savedInstanceState) {
        View inflate = getLayoutInflater(savedInstanceState).inflate(R.layout.view_theater_filter, null, false);
        popupWindow = new PopupWindow(inflate, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT, true);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0xb0000000));
        RecyclerView list1 = (RecyclerView) inflate.findViewById(R.id.filter_list1);
        final RecyclerView list2 = (RecyclerView) inflate.findViewById(R.id.filter_list2);
        RecyclerView list3 = (RecyclerView) inflate.findViewById(R.id.filter_list3);

        list1.setLayoutManager(new LinearLayoutManager(mActivity));
        list2.setLayoutManager(new LinearLayoutManager(mActivity));
        list3.setLayoutManager(new LinearLayoutManager(mActivity));


        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("商圈");
        arrayList1.add("地铁站");

        final ArrayList<String> arrayList2 = new ArrayList<>();

        arrayList2.add("朝阳区");
        arrayList2.add("海淀区");
        arrayList2.add("大兴区");
        arrayList2.add("东城区");
        arrayList2.add("丰台区");
        arrayList2.add("西城区");
        arrayList2.add("通州区");
        arrayList2.add("昌平区");
        arrayList2.add("房山区");
        arrayList2.add("顺义区");
        arrayList2.add("门头沟区");
        arrayList2.add("石景山区");
        arrayList2.add("怀柔区");
        arrayList2.add("平谷区");
        arrayList2.add("密云县");
        arrayList2.add("延庆县");

        list1.setAdapter(new PlainStringAdapter(mActivity, arrayList1));
        PlainStringAdapter list2Adapter = new PlainStringAdapter(mActivity, arrayList2);
        list2Adapter.setOnItemClickListener(new BaseClickableRecyclerViewAdapter.OnRecyclerViewItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                String location = arrayList2.get(position);
                theaterAdapter.setData(allDetailBeanList.get(location));
                if (popupWindow.isShowing()) {
                    popupWindow.dismiss();
                }
            }
        });
        list2.setAdapter(list2Adapter);
        list3.setAdapter(new PlainStringAdapter(mActivity));
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mTheaterFilter.setOnClickListener(this);
        mTheaterSearch.setOnClickListener(this);
        mLoadingPage.showLoading();
        mRvTheater.setLayoutManager(new LinearLayoutManager(mActivity));
        theaterAdapter = new TheaterAdapter(mActivity);
        mRvTheater.setAdapter(theaterAdapter);
    }

    @Override
    protected void getDataFromNet() {
        new Retrofit.Builder()
                .baseUrl(BaseURL.THEATER_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build()
                .create(RetrofitAPI.TheaterAPI.class)
                .getTheaterData()
                .subscribeOn(Schedulers.newThread())
                .observeOn(Schedulers.io())
                .doOnNext(new Action1<TheaterBean>() {
                    @Override
                    public void call(TheaterBean theaterBean) {
                        data = theaterBean.getData();
                        preDealData();
                        theaterAdapter.setData(allDetailBeanList.get("朝阳区"));
                    }
                })
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<TheaterBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        Logger.e(e.getMessage());
                        showError();
                    }

                    @Override
                    public void onNext(TheaterBean theaterBean) {
                        mLoadingPage.showContent();
                    }
                })
        ;
    }

    private void preDealData() {
        allDetailBeanList = new HashMap<>();
        allDetailBeanList.put("朝阳区", data.getChaoyangQu());
        allDetailBeanList.put("海淀区", data.getHaidianQu());
        allDetailBeanList.put("大兴区", data.getDaxingQu());
        allDetailBeanList.put("东城区", data.getDongchengQu());
        allDetailBeanList.put("丰台区", data.getFengtaiQu());
        allDetailBeanList.put("西城区", data.getXichengQu());
        allDetailBeanList.put("通州区", data.getTongzhouQu());
        allDetailBeanList.put("昌平区", data.getChangpingQu());
        allDetailBeanList.put("房山区", data.getFangshanQu());
        allDetailBeanList.put("顺义区", data.getShunyiQu());
        allDetailBeanList.put("门头沟区", data.getMentougouQu());
        allDetailBeanList.put("石景山区", data.getShijingshanQu());
        allDetailBeanList.put("怀柔区", data.getHuairouQu());
        allDetailBeanList.put("平谷区", data.getPingguQu());
        allDetailBeanList.put("密云县", data.getMiyunXian());
        allDetailBeanList.put("延庆县", data.getYanqingXian());
    }

    /**
     * 错误页面显示
     * 太长所以拿出来了
     */
    private void showError() {
        mLoadingPage.showError(
                mActivity.getDrawable(R.drawable.error_internet_image),
                getString(R.string.progressActivityEmptyTitlePlaceholder),
                getString(R.string.progressActivityEmptyContentPlaceholder),
                getString(R.string.progressActivityErrorButton),
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        getDataFromNet();
                        mLoadingPage.showLoading();
                    }
                }
        );
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
            if (!popupWindow.isShowing()) {
                popupWindow.showAsDropDown(mTheaterCity);
            } else {
                popupWindow.dismiss();
            }
        } else if (view.getId() == R.id.theater_search) {
            startActivity(new Intent(mActivity, SearchActivity.class));
        }
    }
}
