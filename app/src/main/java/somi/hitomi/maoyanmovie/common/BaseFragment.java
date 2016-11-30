package somi.hitomi.maoyanmovie.common;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

/**
 * Created by HitomiT on 2016/11/30.
 */

public abstract class BaseFragment extends Fragment {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initContext();
        getDataFromNet();
    }

    protected void initContext() {

    }

    protected void getDataFromNet() {
    }
}
