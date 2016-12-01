package somi.hitomi.maoyanmovie.utils;

import android.text.TextUtils;

/**
 * Created by HitomiT on 2016/12/1.
 */

public class DateUtils {
    public static String number2Char(String numberDate) {
        String[] strings = numberDate.split("-");
        if (strings.length != 3) {
            throw new IllegalStateException("Input date error");
        }
        String year = strings[0];
        String month = strings[1];
        String day = strings[2];

        if (!TextUtils.equals("2016", year)) {
            return year + "年" + month + "月" + day + "日";
        } else {
            return month + "月" + day + "日";
        }
    }
}
