package somi.hitomi.maoyanmovie.domain;

/**
 * Created by HitomiT on 2016/12/1.
 */

public class ComingMoviePreHeaderDomain {
    private String name;
    private String imgUrl;
    private String desc;
    private String videoUrl;

    public ComingMoviePreHeaderDomain(String name, String imgurl, String desc, String videourl) {
        this.name = name;
        this.imgUrl = imgurl;
        this.desc = desc;
        this.videoUrl = videourl;
    }

    public ComingMoviePreHeaderDomain() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }
}
