package somi.hitomi.maoyanmovie.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

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

        String url = BaseURL.MOVIE_CONTENT_URL + movieId;

        Logger.i(url);

        mMovieContentWebview.loadUrl(url);
        mMovieContentWebview.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
            }
        });
        mMovieContentWebview.getSettings().setJavaScriptEnabled(true);
        mMovieContentWebview.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (keyEvent.getAction() == KeyEvent.ACTION_DOWN) {
                    if (i == KeyEvent.KEYCODE_BACK && mMovieContentWebview.canGoBack()) {
                        mMovieContentWebview.goBack();
                        return true;
                    }
                }
                return false;
            }
        });
//        mMovieContentWebview.loadUrl("http://m.maoyan.com/movie/246188?_v_=yes");
    }
}
