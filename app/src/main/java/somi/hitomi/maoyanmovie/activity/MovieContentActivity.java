package somi.hitomi.maoyanmovie.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import com.orhanobut.logger.Logger;

import butterknife.BindView;
import butterknife.ButterKnife;
import somi.hitomi.maoyanmovie.R;
import somi.hitomi.maoyanmovie.utils.BaseURL;

public class MovieContentActivity extends AppCompatActivity {

    @BindView(R.id.movie_content_webview)
    WebView mMovieContentWebview;
    private int movieId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_content);
        ButterKnife.bind(this);
        movieId = getIntent().getIntExtra("movieId", 0);

        String url = BaseURL.MOVIE_CONTENT_URL + movieId + "?_v_=yes";

        Logger.i(url);

        mMovieContentWebview.loadUrl(url);
//        mMovieContentWebview.loadUrl("http://m.maoyan.com/movie/246188?_v_=yes");
    }
}
