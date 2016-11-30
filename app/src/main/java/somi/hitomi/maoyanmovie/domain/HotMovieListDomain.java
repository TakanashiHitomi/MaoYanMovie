package somi.hitomi.maoyanmovie.domain;

/**
 * Created by HitomiT on 2016/11/30.
 */

public class HotMovieListDomain {
    public HotMovieBannerBean banner;
    public MovieListBean movieListBean;

    public HotMovieListDomain(HotMovieBannerBean banner, MovieListBean movieListBean) {
        this.banner = banner;
        this.movieListBean = movieListBean;
    }

    public HotMovieListDomain() {
    }

    public HotMovieBannerBean getBanner() {
        return banner;
    }

    public void setBanner(HotMovieBannerBean banner) {
        this.banner = banner;
    }

    public MovieListBean getMovieListBean() {
        return movieListBean;
    }

    public void setMovieListBean(MovieListBean movieListBean) {
        this.movieListBean = movieListBean;
    }
}
