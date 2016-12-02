package somi.hitomi.maoyanmovie.utils;

/**
 * Created by HitomiT on 2016/12/2.
 */

public class ImageUrlDomainUtil {
    /**
     * 返回图片请求的域名
     * @param rawImgurl 图片请求到的网址
     * @param width 图片宽度
     * @param height 图片高度
     * @return
     */
    public static String getImageUrlDomain(String rawImgurl, int width, int height) {
        return mergeImageUrl(splitImageUrl(rawImgurl), width, height);
    }

    /**
     * 一般会返回俩，[0]为前缀，识别用；[1]为图片名称
     * @param rawImgurl
     * @return
     */
    private static String[] splitImageUrl(String rawImgurl) {
        return rawImgurl.split("w.h");
    }

    /**
     * 合并图片地址
     * @param splitUrls
     * @param width
     * @param height
     * @return
     */
    private static String mergeImageUrl(String[] splitUrls, int width, int height) {
        return splitUrls[0] + width + "." + height + splitUrls[1];
    }
}
