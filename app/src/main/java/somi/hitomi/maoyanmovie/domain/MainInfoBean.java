package somi.hitomi.maoyanmovie.domain;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by HitomiT on 2016/11/30.
 */

public class MainInfoBean {

    private List<PostersBean> posters;

    public static MainInfoBean objectFromData(String str) {

        return new Gson().fromJson(str, MainInfoBean.class);
    }

    public static MainInfoBean objectFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(str), MainInfoBean.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<MainInfoBean> arrayMainInfoBeanFromData(String str) {

        Type listType = new TypeToken<ArrayList<MainInfoBean>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<MainInfoBean> arrayMainInfoBeanFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<MainInfoBean>>() {
            }.getType();

            return new Gson().fromJson(jsonObject.getString(str), listType);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return new ArrayList();


    }

    public List<PostersBean> getPosters() {
        return posters;
    }

    public void setPosters(List<PostersBean> posters) {
        this.posters = posters;
    }

    public static class PostersBean {
        /**
         * canSkip : false
         * duration : 2500
         * end : 1480521599
         * id : 957
         * isShowLogo : 0
         * pic : http://p1.meituan.net/movie/839126f4c422ac102c45259064598b31189180.jpg
         * screenType : 0
         * showLogo : false
         * start : 1480435200
         * times : 10
         * title : 11.30 间谍同盟今日上映
         * type : 2
         * url :
         */

        private boolean canSkip;
        private int duration;
        private int end;
        private int id;
        private int isShowLogo;
        private String pic;
        private int screenType;
        private boolean showLogo;
        private int start;
        private int times;
        private String title;
        private int type;
        private String url;

        public static PostersBean objectFromData(String str) {

            return new Gson().fromJson(str, PostersBean.class);
        }

        public static PostersBean objectFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);

                return new Gson().fromJson(jsonObject.getString(str), PostersBean.class);
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return null;
        }

        public static List<PostersBean> arrayPostersBeanFromData(String str) {

            Type listType = new TypeToken<ArrayList<PostersBean>>() {
            }.getType();

            return new Gson().fromJson(str, listType);
        }

        public static List<PostersBean> arrayPostersBeanFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);
                Type listType = new TypeToken<ArrayList<PostersBean>>() {
                }.getType();

                return new Gson().fromJson(jsonObject.getString(str), listType);

            } catch (JSONException e) {
                e.printStackTrace();
            }

            return new ArrayList();


        }

        public boolean isCanSkip() {
            return canSkip;
        }

        public void setCanSkip(boolean canSkip) {
            this.canSkip = canSkip;
        }

        public int getDuration() {
            return duration;
        }

        public void setDuration(int duration) {
            this.duration = duration;
        }

        public int getEnd() {
            return end;
        }

        public void setEnd(int end) {
            this.end = end;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getIsShowLogo() {
            return isShowLogo;
        }

        public void setIsShowLogo(int isShowLogo) {
            this.isShowLogo = isShowLogo;
        }

        public String getPic() {
            return pic;
        }

        public void setPic(String pic) {
            this.pic = pic;
        }

        public int getScreenType() {
            return screenType;
        }

        public void setScreenType(int screenType) {
            this.screenType = screenType;
        }

        public boolean isShowLogo() {
            return showLogo;
        }

        public void setShowLogo(boolean showLogo) {
            this.showLogo = showLogo;
        }

        public int getStart() {
            return start;
        }

        public void setStart(int start) {
            this.start = start;
        }

        public int getTimes() {
            return times;
        }

        public void setTimes(int times) {
            this.times = times;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
