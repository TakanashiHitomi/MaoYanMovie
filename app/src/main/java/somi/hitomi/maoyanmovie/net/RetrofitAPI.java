package somi.hitomi.maoyanmovie.net;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import somi.hitomi.maoyanmovie.domain.ComingMovieBean;
import somi.hitomi.maoyanmovie.domain.ComingMovieBeanOld;
import somi.hitomi.maoyanmovie.domain.HotMovieBannerBean;
import somi.hitomi.maoyanmovie.domain.MainInfoBean;
import somi.hitomi.maoyanmovie.domain.MovieListBean;

/**
 * API for Retrofit
 * Created by HitomiT on 2016/11/30.
 */

public class RetrofitAPI {
    public interface WelcomeInfoAPI {
        @GET("posters.json?city_id=1&poster_type=1&__vhost=api.maoyan.com&utm_campaign=AmovieBmovieCD-1&movieBundleVersion=6801&utm_source=hiapk&utm_medium=android&utm_term=6.8.0&utm_content=860311023305964&ci=1&net=255&dModel=MI%203&uuid=F096369352E4004DD3758BF83FE24AC312445F9B51AD3D8FCE2A0CD57754F6E4&lat=0.0&lng=0.0&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1463656383990&__skua=7e01cf8dd30a179800a7a93979b430b2&__skno=09cbe8d3-3cb0-4e54-bc41-8f0b3387cdf2&__skcy=RbOZVh%2BK%2Bf86K3WlGJYg4ls7DIU%3D")
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
        @GET("adverts?cityid=1&category=11&version=6.8.0&new=0&app=movie&clienttp=android&uuid=FCFAB9D8DD339645D629C8372A29A2C6AD16F9C9E87AF9AC0D656B29DD5AC6DE&devid=866641027400542&uid=&movieid=&partner=1&apptype=1&smId=&utm_campaign=AmovieBmovieCD-1&movieBundleVersion=6801&utm_source=qq&utm_medium=android&utm_term=6.8.0&utm_content=866641027400542&ci=1&net=255&dModel=HM%20NOTE%201LTETD&lat=40.100855&lng=116.378273&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1463730432992&__skua=7e01cf8dd30a179800a7a93979b430b2&__skno=01f9c5c0-eb56-4e19-92fb-b86b16ad79da&__skcy=5K8wRR%2FKYAZDTgmAzbhrXi%2FomzU%3D")
        Call<HotMovieBannerBean> getHotMovieBanner();
    }

    public interface WaitingMovieListAPI {
        @GET("coming.json?ci=1&limit=12")
        Call<ComingMovieBeanOld> getWaitingMovieList();

        //coming.json?offset=0&limit=50<&ci=1>
        @GET("coming.json")
        Call<ComingMovieBean> getWaitingMovieList(
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
}
