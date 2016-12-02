package somi.hitomi.maoyanmovie.utils;

import android.content.res.Resources;

/**
 * Created by HitomiT on 2016/12/2.
 */

public class DensityUtils {
    //dp--->px
    public static int dp2px(int dp) {
        //获取手机的密度
        return (int) (dp * Resources.getSystem().getDisplayMetrics().density + 0.5);//实现四舍五入操作
    }

    //px--->dp
    public static int px2dp(int px) {
        //获取手机的密度
        return (int) (px / Resources.getSystem().getDisplayMetrics().density + 0.5);//实现四舍五入操作
    }

}
