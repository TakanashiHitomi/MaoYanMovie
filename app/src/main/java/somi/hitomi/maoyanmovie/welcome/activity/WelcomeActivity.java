package somi.hitomi.maoyanmovie.welcome.activity;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.SparseArray;

import java.util.List;

import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import somi.hitomi.maoyanmovie.R;
import somi.hitomi.maoyanmovie.common.BaseActivity;
import somi.hitomi.maoyanmovie.domain.MainInfoBean;
import somi.hitomi.maoyanmovie.net.RetrofitAPI;
import somi.hitomi.maoyanmovie.utils.BaseURL;
import somi.hitomi.maoyanmovie.welcome.fragment.WelcomeExtraFragment;
import somi.hitomi.maoyanmovie.welcome.fragment.WelcomeMainFragment;

public class WelcomeActivity extends BaseActivity {

    private static final int WELCOME_MAIN = (2 << 5);
    private static final int WELCOME_EX = (2 << 5) + 1;
    public Handler handler = new Handler();
    public List<MainInfoBean.PostersBean> postersBeans;
    public MainInfoBean.PostersBean postersBean;
    private SparseArray<Fragment> fragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        ButterKnife.bind(this);

        initFragment();
        loadExImage();
        startCounting();
    }

    private void startCounting() {
        switchFragment(null, fragments.get(WELCOME_MAIN));
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                switchFragment(fragments.get(WELCOME_MAIN), new WelcomeExtraFragment());
            }
        }, 1500);
    }

    private void loadExImage() {
        new Retrofit.Builder()
                .baseUrl(BaseURL.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(RetrofitAPI.WelcomeInfoAPI.class)
                .getMainInfo()
                .enqueue(new Callback<MainInfoBean>() {
                    @Override
                    public void onResponse(Call<MainInfoBean> call, Response<MainInfoBean> response) {
                        postersBeans = response.body().getPosters();
                        if (postersBeans.size() != 0) {
                            postersBean = postersBeans.get(0);
                        }
                    }

                    @Override
                    public void onFailure(Call<MainInfoBean> call, Throwable t) {

                    }
                });

    }

    private void initFragment() {
        fragments = new SparseArray<>();
        fragments.put(WELCOME_MAIN, new WelcomeMainFragment());
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
                    .add(R.id.welcome_container, to);
        } else {
            transaction.show(to);
        }

        transaction.commit();
    }
}
