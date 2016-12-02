package somi.hitomi.maoyanmovie.utils;

/**
 * Created by HitomiT on 2016/12/2.
 */

public class DateCompareUtil {
    /**
     * 此处的日期格式为yyyy-mm-dd
     * @param date1
     * @param date2
     * @return
     */
    public static int compareDate(String date1, String date2) {
        String[] split1 = date1.split("-");
        String[] split2 = date2.split("-");

        return Integer.parseInt(split1[0]) > Integer.parseInt(split2[0]) || Integer.parseInt(split1[1]) > Integer.parseInt(split2[1]) || Integer.parseInt(split1[2]) > Integer.parseInt(split2[2]) ? 1 : 0;
    }
}
