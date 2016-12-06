package somi.hitomi.maoyanmovie.net;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import somi.hitomi.maoyanmovie.domain.ComingMovieBean;
import somi.hitomi.maoyanmovie.domain.ComingMovieBeanOld;
import somi.hitomi.maoyanmovie.domain.ComingVideoPreBean;
import somi.hitomi.maoyanmovie.domain.DiscoverBean;
import somi.hitomi.maoyanmovie.domain.HotMovieBannerBean;
import somi.hitomi.maoyanmovie.domain.MainInfoBean;
import somi.hitomi.maoyanmovie.domain.MovieListBean;
import somi.hitomi.maoyanmovie.domain.TheaterBean;

/**
 * API for Retrofit
 * Created by HitomiT on 2016/11/30.
 */

public class RetrofitAPI {
    public interface WelcomeInfoAPI {
        @GET("posters.json")
        Call<MainInfoBean> getMainInfo();
    }


    public interface MovieListAPI {
        //"type=hot&offset=0&limit=1000"
        @GET("hot.json")
        Call<MovieListBean> getMovieList(
                @Query("offset") int offset,
                @Query("limit") int limit);
    }

    public interface HotMovieBannerAPI {
        //http://advert.mobile.meituan.com/api/v3/
        @GET("adverts")
        Call<HotMovieBannerBean> getHotMovieBanner();
    }

    public interface ComingMovieListAPI {
        @GET("coming.json?ci=1&limit=12")
        Call<ComingMovieBeanOld> getComingMovieList();

        //coming.json?offset=0&limit=50<&ci=1>
        @GET("coming.json")
        Call<ComingMovieBean> getComingMovieList(
                @Query("offset") int offset,
                @Query("limit") int limit);
    }

    public interface ImageAPI {
        //w.h/movie/f85de4d42c6fe3e958bd204fcb6a76f59235962.jpg
        @GET("{@width}.{@height}/movie/{@imgurl}")
        Call<String> getImageUrl(
                @Path("width") String width,
                @Path("height") String height,
                @Path("imgurl") String imgurl
        );
    }

    public interface MovieContentAPI {
        @GET("{@movieId}")
        Call<String> getMovieContent(@Path("movieId") String movieId);
    }

    public interface ComingVideoPreAPI {
        @GET("list.json")
        Call<ComingVideoPreBean> getComingVideoPre();
    }

    public interface DiscoverAPI {
        @GET("feed.json")
        Call<DiscoverBean> getDiscoverData(
                @Query("offset") int offset,
                @Query("limit") int limit
        );
    }

    public interface TheaterAPI {
        @GET("cinemas.json")
        Call<TheaterBean> getTheaterData();
    }

}
