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

public class MovieListBean {

    /**
     * data : {"coming":[],"hot":[{"boxInfo":"上映1天，累计票房5105万","cat":"剧情,爱情,动画","civilPubSt":0,"desc":"主演:上白石萌音,神木隆之介,长泽雅美","dir":"新海诚","dur":107,"effectShowNum":0,"fra":"日本","frt":"2016-08-26","globalReleased":true,"headLineShow":false,"headLines":[],"headLinesVO":[{"movieId":344881,"title":"对着谷歌地图，我们把取景地都找到了","type":"专题","url":"meituanmovie://www.meituan.com/forum/newsDetail?id=16957"},{"movieId":344881,"title":"导演新海诚：梦想做宇航员的动画导演","type":"专访","url":"meituanmovie://www.meituan.com/forum/newsDetail?id=16926"}],"id":344881,"img":"http://p0.meituan.net/w.h/movie/910b2e6c7cb0da947d65ef5c33929eb9366676.jpg","late":false,"localPubSt":0,"mk":9.6,"newsHeadlines":[{"movieId":344881,"title":"对着谷歌地图，我们把取景地都找到了","type":"专题","url":"meituanmovie://www.meituan.com/forum/newsDetail?id=16957"},{"movieId":344881,"title":"导演新海诚：梦想做宇航员的动画导演","type":"专访","url":"meituanmovie://www.meituan.com/forum/newsDetail?id=16926"}],"nm":"你的名字。","pn":180,"preSale":0,"preShow":false,"proScore":6.7,"proScoreNum":10,"pubDate":1480608000000,"pubShowNum":0,"recentShowDate":1480608000000,"recentShowNum":0,"rt":"2016-12-02","sc":9.6,"scm":"寻君千里行，心系君之名","showInfo":"今天159家影院放映1944场","showNum":1944,"showTimeInfo":"2016-12-02 本周五上映","showst":3,"snum":27762,"star":"上白石萌音,神木隆之介,长泽雅美","totalShowNum":4303,"ver":"2D","videoId":82197,"videoName":"终极预告片 12月2日一起看吧！","videourl":"http://maoyan.meituan.net/movie/videos/854x480c1f128106e4f4715a87a2b9565b74f54.mp4","vnum":21,"weight":1,"wish":277114,"wishst":0},{"boxInfo":"上映8天，累计票房40112万","cat":"冒险,奇幻,家庭","civilPubSt":0,"desc":"主演:埃迪·雷德梅恩,凯瑟琳·沃特斯顿,艾莉森·萨多尔","dir":"大卫·叶茨","dur":133,"effectShowNum":0,"fra":"美国,英国,日本","frt":"2016-11-18,2016-11-18,2016-11-23","globalReleased":true,"headLineShow":false,"id":248918,"img":"http://p0.meituan.net/w.h/movie/f2820b28cff46c530a1aee47a2c00011274783.jpg","late":false,"localPubSt":0,"mk":9,"nm":"神奇动物在哪里","pn":242,"preSale":0,"preShow":false,"proScore":7,"proScoreNum":30,"pubDate":1480003200000,"pubShowNum":0,"recentShowDate":1480608000000,"recentShowNum":0,"rt":"2016-11-25","sc":9,"scm":"神奇动物城，法师显超能","showInfo":"今天158家影院放映1063场","showNum":1063,"showTimeInfo":"2016-11-25上映","showst":3,"snum":122852,"star":"埃迪·雷德梅恩,凯瑟琳·沃特斯顿,艾莉森·萨多尔","totalShowNum":2115,"ver":"3D/IMAX 3D/中国巨幕","videoId":82078,"videoName":"世界最好的魔法学校预告片","videourl":"http://maoyan.meituan.net/movie/videos/854x4806677d12c3de8462f8592f07fed1aab10.mp4","vnum":47,"weight":1,"wish":130686,"wishst":0},{"boxInfo":"上映1天，累计票房868万","cat":"剧情,冒险,奇幻","civilPubSt":0,"desc":"主演:伊娃·格林,阿沙·巴特菲尔德,塞缪尔·杰克逊","dir":"蒂姆·波顿","dur":126,"effectShowNum":0,"fra":"美国,韩国","frt":"2016-09-30,2016-09-28","globalReleased":true,"headLineShow":false,"id":246373,"img":"http://p0.meituan.net/w.h/movie/eccf1862c4f30042a373a080acc18ccf9587819.jpeg","late":false,"localPubSt":0,"mk":8.9,"nm":"佩小姐的奇幻城堡","pn":101,"preSale":0,"preShow":false,"proScore":0,"proScoreNum":6,"pubDate":1480608000000,"pubShowNum":0,"recentShowDate":1480608000000,"recentShowNum":0,"rt":"2016-12-02","sc":8.9,"scm":"异能桃花源，穿越时光圈","showInfo":"今天156家影院放映985场","showNum":985,"showTimeInfo":"2016-12-02 本周五上映","showst":3,"snum":4666,"star":"伊娃·格林,阿沙·巴特菲尔德,塞缪尔·杰克逊","totalShowNum":1775,"ver":"2D/3D/中国巨幕/全景声","videoId":82084,"videoName":"导演问候预告片","videourl":"http://maoyan.meituan.net/movie/videos/854x480af899e96002f4f29a1d433312f702cb2.mp4","vnum":35,"weight":1,"wish":103395,"wishst":0},{"boxInfo":"上映1天，累计票房791万","cat":"剧情,动作,武侠","civilPubSt":0,"desc":"主演:林更新,何润东,蒋梦婕","dir":"尔冬升","dur":107,"effectShowNum":0,"globalReleased":true,"headLineShow":false,"id":79088,"img":"http://p0.meituan.net/w.h/movie/c3eaa8556346814f2a3a79ffef0924b4577174.jpg","late":false,"localPubSt":0,"mk":8.2,"nm":"三少爷的剑","pn":124,"preSale":0,"preShow":false,"proScore":0,"proScoreNum":0,"pubDate":1480608000000,"pubShowNum":0,"recentShowDate":1480608000000,"recentShowNum":0,"rt":"2016-12-02","sc":8.2,"scm":"冬升携老怪，千仗无一败","showInfo":"今天152家影院放映799场","showNum":799,"showTimeInfo":"2016-12-02 本周五上映","showst":3,"snum":2419,"star":"林更新,何润东,蒋梦婕","totalShowNum":1326,"ver":"3D/中国巨幕","videoId":82196,"videoName":"终极版预告片","videourl":"http://maoyan.meituan.net/movie/videos/d3ee6b72c0e64aa2ad012e6ee50c5b81.mp4","vnum":8,"weight":1,"wish":97935,"wishst":0},{"boxInfo":"上映1天，累计票房394万","cat":"喜剧,动作","civilPubSt":0,"desc":"主演:陈赫,宋智孝,大卫·贝利","dir":"宋啸","dur":91,"effectShowNum":0,"globalReleased":true,"headLineShow":false,"id":343866,"img":"http://p0.meituan.net/w.h/movie/658b714699f37110db35e343474ccf12808915.png","late":false,"localPubSt":0,"mk":8.6,"nm":"超级快递","pn":156,"preSale":0,"preShow":false,"proScore":0,"proScoreNum":1,"pubDate":1480608000000,"pubShowNum":0,"recentShowDate":1480608000000,"recentShowNum":0,"rt":"2016-12-02","sc":8.6,"scm":"快递藏国宝，爆笑接力跑","showInfo":"今天120家影院放映373场","showNum":373,"showTimeInfo":"2016-12-02 本周五上映","showst":3,"snum":2142,"star":"陈赫,宋智孝,大卫·贝利","totalShowNum":487,"ver":"2D/中国巨幕","videoId":82103,"videoName":"终极版预告片","videourl":"http://maoyan.meituan.net/movie/videos/854x480c31cdd86b02b454fa0bdbceaa5a67a50.mp4","vnum":5,"weight":1,"wish":50466,"wishst":0},{"boxInfo":"上映8天，累计票房11134万","cat":"动画,动作,冒险","civilPubSt":0,"desc":"主演:奥伊伊·卡瓦略,道恩·强森,Rachel House","dir":"罗恩·克莱蒙兹,约翰·马斯克,唐·霍尔,克里斯·威廉姆斯","dur":107,"effectShowNum":0,"fra":"美国","frt":"2016-11-23","globalReleased":true,"headLineShow":false,"id":246222,"img":"http://p1.meituan.net/w.h/movie/dd600d0f054b234402edc3a93cd21da7133550.jpeg","late":false,"localPubSt":0,"mk":9.1,"nm":"海洋奇缘","pn":128,"preSale":0,"preShow":false,"proScore":6.7,"proScoreNum":15,"pubDate":1480003200000,"pubShowNum":0,"recentShowDate":1480608000000,"recentShowNum":0,"rt":"2016-11-25","sc":9.1,"scm":"航海家后代，征程向大海","showInfo":"今天110家影院放映335场","showNum":335,"showTimeInfo":"2016-11-25上映","showst":3,"snum":37505,"star":"奥伊伊·卡瓦略,道恩·强森,Rachel House","totalShowNum":1005,"ver":"2D/3D/中国巨幕/全景声","videoId":82112,"videoName":"公映版预告片","videourl":"http://maoyan.meituan.net/movie/videos/854x480b075a8922c9f4506b6ed295e91f38d46.mp4","vnum":25,"weight":1,"wish":42849,"wishst":0},{"boxInfo":"上映15天，累计票房36807万","cat":"剧情,喜剧","civilPubSt":0,"desc":"主演:范冰冰,郭涛,董成鹏","dir":"冯小刚","dur":140,"effectShowNum":0,"fra":"多伦多国际电影节","frt":"2016-09-08","globalReleased":true,"headLineShow":false,"id":341749,"img":"http://p1.meituan.net/w.h/movie/8e5eabeadf237a10227a3124419410ef549583.jpg","late":false,"localPubSt":0,"mk":7.9,"nm":"我不是潘金莲","pn":211,"preSale":0,"preShow":false,"proScore":7.3,"proScoreNum":42,"pubDate":1479398400000,"pubShowNum":0,"recentShowDate":1480608000000,"recentShowNum":0,"rt":"2016-11-18","sc":7.9,"scm":"金莲戏中戏，官场局中局","showInfo":"今天91家影院放映295场","showNum":295,"showTimeInfo":"2016-11-18上映","showst":3,"snum":191995,"star":"范冰冰,郭涛,董成鹏","totalShowNum":474,"ver":"2D/中国巨幕/全景声","videoId":81948,"videoName":"\u201c潘金莲来了\u201d版预告片","videourl":"http://maoyan.meituan.net/movie/videos/854x4808866efe0e1d64e55b66ba4d53736a44b.mp4","vnum":21,"weight":1,"wish":185572,"wishst":0},{"boxInfo":"上映3天，累计票房1749万","cat":"爱情,动作,战争","civilPubSt":0,"desc":"主演:布拉德·皮特,玛丽昂·歌迪亚,马修·古迪","dir":"罗伯特·泽米吉斯","dur":124,"effectShowNum":0,"fra":"美国","frt":"2016-11-23","globalReleased":true,"headLineShow":false,"id":346564,"img":"http://p0.meituan.net/w.h/movie/9aa8a2df88d43ad08fbf0d1c6878bb5579675.jpg","late":false,"localPubSt":0,"mk":8.4,"nm":"间谍同盟","pn":199,"preSale":0,"preShow":false,"proScore":6.1,"proScoreNum":11,"pubDate":1480435200000,"pubShowNum":0,"recentShowDate":1480608000000,"recentShowNum":0,"rt":"2016-11-30","sc":8.4,"scm":"夫妇皆仇敌，枕边藏杀机","showInfo":"今天95家影院放映267场","showNum":267,"showTimeInfo":"2016-11-30 本周三上映","showst":3,"snum":33926,"star":"布拉德·皮特,玛丽昂·歌迪亚,马修·古迪","totalShowNum":415,"ver":"2D/中国巨幕","videoId":82135,"videoName":"倒计时预告片","videourl":"http://maoyan.meituan.net/movie/videos/854x480feb3896008304f1ca09f8e038ecd3262.mp4","vnum":14,"weight":1,"wish":42631,"wishst":0}],"movieIds":[344881,248918,246373,79088,343866,246222,341749,346564,336835,1132403,338349,343082,343413,247736,344073,1197460,246124,345529,342003,338391,246267,248675,341529,1189884,344902,658864,346759,410612,342427,337195,1197623,248637,1182756,345494,345105,1189305,344437,337708,341084,342073,1189048],"stid":"576591972453269000","stids":[{"movieId":344881,"stid":"576591972453269000_a344881_c0"},{"movieId":248918,"stid":"576591972453269000_a248918_c1"},{"movieId":246373,"stid":"576591972453269000_a246373_c2"},{"movieId":79088,"stid":"576591972453269000_a79088_c3"},{"movieId":343866,"stid":"576591972453269000_a343866_c4"},{"movieId":246222,"stid":"576591972453269000_a246222_c5"},{"movieId":341749,"stid":"576591972453269000_a341749_c6"},{"movieId":346564,"stid":"576591972453269000_a346564_c7"}],"total":41}
     */

    private DataBean data;

    public static MovieListBean objectFromData(String str) {

        return new Gson().fromJson(str, MovieListBean.class);
    }

    public static MovieListBean objectFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(str), MovieListBean.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<MovieListBean> arrayMovieListBeanFromData(String str) {

        Type listType = new TypeToken<ArrayList<MovieListBean>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<MovieListBean> arrayMovieListBeanFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<MovieListBean>>() {
            }.getType();

            return new Gson().fromJson(jsonObject.getString(str), listType);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return new ArrayList();


    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * coming : []
         * hot : [{"boxInfo":"上映1天，累计票房5105万","cat":"剧情,爱情,动画","civilPubSt":0,"desc":"主演:上白石萌音,神木隆之介,长泽雅美","dir":"新海诚","dur":107,"effectShowNum":0,"fra":"日本","frt":"2016-08-26","globalReleased":true,"headLineShow":false,"headLines":[],"headLinesVO":[{"movieId":344881,"title":"对着谷歌地图，我们把取景地都找到了","type":"专题","url":"meituanmovie://www.meituan.com/forum/newsDetail?id=16957"},{"movieId":344881,"title":"导演新海诚：梦想做宇航员的动画导演","type":"专访","url":"meituanmovie://www.meituan.com/forum/newsDetail?id=16926"}],"id":344881,"img":"http://p0.meituan.net/w.h/movie/910b2e6c7cb0da947d65ef5c33929eb9366676.jpg","late":false,"localPubSt":0,"mk":9.6,"newsHeadlines":[{"movieId":344881,"title":"对着谷歌地图，我们把取景地都找到了","type":"专题","url":"meituanmovie://www.meituan.com/forum/newsDetail?id=16957"},{"movieId":344881,"title":"导演新海诚：梦想做宇航员的动画导演","type":"专访","url":"meituanmovie://www.meituan.com/forum/newsDetail?id=16926"}],"nm":"你的名字。","pn":180,"preSale":0,"preShow":false,"proScore":6.7,"proScoreNum":10,"pubDate":1480608000000,"pubShowNum":0,"recentShowDate":1480608000000,"recentShowNum":0,"rt":"2016-12-02","sc":9.6,"scm":"寻君千里行，心系君之名","showInfo":"今天159家影院放映1944场","showNum":1944,"showTimeInfo":"2016-12-02 本周五上映","showst":3,"snum":27762,"star":"上白石萌音,神木隆之介,长泽雅美","totalShowNum":4303,"ver":"2D","videoId":82197,"videoName":"终极预告片 12月2日一起看吧！","videourl":"http://maoyan.meituan.net/movie/videos/854x480c1f128106e4f4715a87a2b9565b74f54.mp4","vnum":21,"weight":1,"wish":277114,"wishst":0},{"boxInfo":"上映8天，累计票房40112万","cat":"冒险,奇幻,家庭","civilPubSt":0,"desc":"主演:埃迪·雷德梅恩,凯瑟琳·沃特斯顿,艾莉森·萨多尔","dir":"大卫·叶茨","dur":133,"effectShowNum":0,"fra":"美国,英国,日本","frt":"2016-11-18,2016-11-18,2016-11-23","globalReleased":true,"headLineShow":false,"id":248918,"img":"http://p0.meituan.net/w.h/movie/f2820b28cff46c530a1aee47a2c00011274783.jpg","late":false,"localPubSt":0,"mk":9,"nm":"神奇动物在哪里","pn":242,"preSale":0,"preShow":false,"proScore":7,"proScoreNum":30,"pubDate":1480003200000,"pubShowNum":0,"recentShowDate":1480608000000,"recentShowNum":0,"rt":"2016-11-25","sc":9,"scm":"神奇动物城，法师显超能","showInfo":"今天158家影院放映1063场","showNum":1063,"showTimeInfo":"2016-11-25上映","showst":3,"snum":122852,"star":"埃迪·雷德梅恩,凯瑟琳·沃特斯顿,艾莉森·萨多尔","totalShowNum":2115,"ver":"3D/IMAX 3D/中国巨幕","videoId":82078,"videoName":"世界最好的魔法学校预告片","videourl":"http://maoyan.meituan.net/movie/videos/854x4806677d12c3de8462f8592f07fed1aab10.mp4","vnum":47,"weight":1,"wish":130686,"wishst":0},{"boxInfo":"上映1天，累计票房868万","cat":"剧情,冒险,奇幻","civilPubSt":0,"desc":"主演:伊娃·格林,阿沙·巴特菲尔德,塞缪尔·杰克逊","dir":"蒂姆·波顿","dur":126,"effectShowNum":0,"fra":"美国,韩国","frt":"2016-09-30,2016-09-28","globalReleased":true,"headLineShow":false,"id":246373,"img":"http://p0.meituan.net/w.h/movie/eccf1862c4f30042a373a080acc18ccf9587819.jpeg","late":false,"localPubSt":0,"mk":8.9,"nm":"佩小姐的奇幻城堡","pn":101,"preSale":0,"preShow":false,"proScore":0,"proScoreNum":6,"pubDate":1480608000000,"pubShowNum":0,"recentShowDate":1480608000000,"recentShowNum":0,"rt":"2016-12-02","sc":8.9,"scm":"异能桃花源，穿越时光圈","showInfo":"今天156家影院放映985场","showNum":985,"showTimeInfo":"2016-12-02 本周五上映","showst":3,"snum":4666,"star":"伊娃·格林,阿沙·巴特菲尔德,塞缪尔·杰克逊","totalShowNum":1775,"ver":"2D/3D/中国巨幕/全景声","videoId":82084,"videoName":"导演问候预告片","videourl":"http://maoyan.meituan.net/movie/videos/854x480af899e96002f4f29a1d433312f702cb2.mp4","vnum":35,"weight":1,"wish":103395,"wishst":0},{"boxInfo":"上映1天，累计票房791万","cat":"剧情,动作,武侠","civilPubSt":0,"desc":"主演:林更新,何润东,蒋梦婕","dir":"尔冬升","dur":107,"effectShowNum":0,"globalReleased":true,"headLineShow":false,"id":79088,"img":"http://p0.meituan.net/w.h/movie/c3eaa8556346814f2a3a79ffef0924b4577174.jpg","late":false,"localPubSt":0,"mk":8.2,"nm":"三少爷的剑","pn":124,"preSale":0,"preShow":false,"proScore":0,"proScoreNum":0,"pubDate":1480608000000,"pubShowNum":0,"recentShowDate":1480608000000,"recentShowNum":0,"rt":"2016-12-02","sc":8.2,"scm":"冬升携老怪，千仗无一败","showInfo":"今天152家影院放映799场","showNum":799,"showTimeInfo":"2016-12-02 本周五上映","showst":3,"snum":2419,"star":"林更新,何润东,蒋梦婕","totalShowNum":1326,"ver":"3D/中国巨幕","videoId":82196,"videoName":"终极版预告片","videourl":"http://maoyan.meituan.net/movie/videos/d3ee6b72c0e64aa2ad012e6ee50c5b81.mp4","vnum":8,"weight":1,"wish":97935,"wishst":0},{"boxInfo":"上映1天，累计票房394万","cat":"喜剧,动作","civilPubSt":0,"desc":"主演:陈赫,宋智孝,大卫·贝利","dir":"宋啸","dur":91,"effectShowNum":0,"globalReleased":true,"headLineShow":false,"id":343866,"img":"http://p0.meituan.net/w.h/movie/658b714699f37110db35e343474ccf12808915.png","late":false,"localPubSt":0,"mk":8.6,"nm":"超级快递","pn":156,"preSale":0,"preShow":false,"proScore":0,"proScoreNum":1,"pubDate":1480608000000,"pubShowNum":0,"recentShowDate":1480608000000,"recentShowNum":0,"rt":"2016-12-02","sc":8.6,"scm":"快递藏国宝，爆笑接力跑","showInfo":"今天120家影院放映373场","showNum":373,"showTimeInfo":"2016-12-02 本周五上映","showst":3,"snum":2142,"star":"陈赫,宋智孝,大卫·贝利","totalShowNum":487,"ver":"2D/中国巨幕","videoId":82103,"videoName":"终极版预告片","videourl":"http://maoyan.meituan.net/movie/videos/854x480c31cdd86b02b454fa0bdbceaa5a67a50.mp4","vnum":5,"weight":1,"wish":50466,"wishst":0},{"boxInfo":"上映8天，累计票房11134万","cat":"动画,动作,冒险","civilPubSt":0,"desc":"主演:奥伊伊·卡瓦略,道恩·强森,Rachel House","dir":"罗恩·克莱蒙兹,约翰·马斯克,唐·霍尔,克里斯·威廉姆斯","dur":107,"effectShowNum":0,"fra":"美国","frt":"2016-11-23","globalReleased":true,"headLineShow":false,"id":246222,"img":"http://p1.meituan.net/w.h/movie/dd600d0f054b234402edc3a93cd21da7133550.jpeg","late":false,"localPubSt":0,"mk":9.1,"nm":"海洋奇缘","pn":128,"preSale":0,"preShow":false,"proScore":6.7,"proScoreNum":15,"pubDate":1480003200000,"pubShowNum":0,"recentShowDate":1480608000000,"recentShowNum":0,"rt":"2016-11-25","sc":9.1,"scm":"航海家后代，征程向大海","showInfo":"今天110家影院放映335场","showNum":335,"showTimeInfo":"2016-11-25上映","showst":3,"snum":37505,"star":"奥伊伊·卡瓦略,道恩·强森,Rachel House","totalShowNum":1005,"ver":"2D/3D/中国巨幕/全景声","videoId":82112,"videoName":"公映版预告片","videourl":"http://maoyan.meituan.net/movie/videos/854x480b075a8922c9f4506b6ed295e91f38d46.mp4","vnum":25,"weight":1,"wish":42849,"wishst":0},{"boxInfo":"上映15天，累计票房36807万","cat":"剧情,喜剧","civilPubSt":0,"desc":"主演:范冰冰,郭涛,董成鹏","dir":"冯小刚","dur":140,"effectShowNum":0,"fra":"多伦多国际电影节","frt":"2016-09-08","globalReleased":true,"headLineShow":false,"id":341749,"img":"http://p1.meituan.net/w.h/movie/8e5eabeadf237a10227a3124419410ef549583.jpg","late":false,"localPubSt":0,"mk":7.9,"nm":"我不是潘金莲","pn":211,"preSale":0,"preShow":false,"proScore":7.3,"proScoreNum":42,"pubDate":1479398400000,"pubShowNum":0,"recentShowDate":1480608000000,"recentShowNum":0,"rt":"2016-11-18","sc":7.9,"scm":"金莲戏中戏，官场局中局","showInfo":"今天91家影院放映295场","showNum":295,"showTimeInfo":"2016-11-18上映","showst":3,"snum":191995,"star":"范冰冰,郭涛,董成鹏","totalShowNum":474,"ver":"2D/中国巨幕/全景声","videoId":81948,"videoName":"\u201c潘金莲来了\u201d版预告片","videourl":"http://maoyan.meituan.net/movie/videos/854x4808866efe0e1d64e55b66ba4d53736a44b.mp4","vnum":21,"weight":1,"wish":185572,"wishst":0},{"boxInfo":"上映3天，累计票房1749万","cat":"爱情,动作,战争","civilPubSt":0,"desc":"主演:布拉德·皮特,玛丽昂·歌迪亚,马修·古迪","dir":"罗伯特·泽米吉斯","dur":124,"effectShowNum":0,"fra":"美国","frt":"2016-11-23","globalReleased":true,"headLineShow":false,"id":346564,"img":"http://p0.meituan.net/w.h/movie/9aa8a2df88d43ad08fbf0d1c6878bb5579675.jpg","late":false,"localPubSt":0,"mk":8.4,"nm":"间谍同盟","pn":199,"preSale":0,"preShow":false,"proScore":6.1,"proScoreNum":11,"pubDate":1480435200000,"pubShowNum":0,"recentShowDate":1480608000000,"recentShowNum":0,"rt":"2016-11-30","sc":8.4,"scm":"夫妇皆仇敌，枕边藏杀机","showInfo":"今天95家影院放映267场","showNum":267,"showTimeInfo":"2016-11-30 本周三上映","showst":3,"snum":33926,"star":"布拉德·皮特,玛丽昂·歌迪亚,马修·古迪","totalShowNum":415,"ver":"2D/中国巨幕","videoId":82135,"videoName":"倒计时预告片","videourl":"http://maoyan.meituan.net/movie/videos/854x480feb3896008304f1ca09f8e038ecd3262.mp4","vnum":14,"weight":1,"wish":42631,"wishst":0}]
         * movieIds : [344881,248918,246373,79088,343866,246222,341749,346564,336835,1132403,338349,343082,343413,247736,344073,1197460,246124,345529,342003,338391,246267,248675,341529,1189884,344902,658864,346759,410612,342427,337195,1197623,248637,1182756,345494,345105,1189305,344437,337708,341084,342073,1189048]
         * stid : 576591972453269000
         * stids : [{"movieId":344881,"stid":"576591972453269000_a344881_c0"},{"movieId":248918,"stid":"576591972453269000_a248918_c1"},{"movieId":246373,"stid":"576591972453269000_a246373_c2"},{"movieId":79088,"stid":"576591972453269000_a79088_c3"},{"movieId":343866,"stid":"576591972453269000_a343866_c4"},{"movieId":246222,"stid":"576591972453269000_a246222_c5"},{"movieId":341749,"stid":"576591972453269000_a341749_c6"},{"movieId":346564,"stid":"576591972453269000_a346564_c7"}]
         * total : 41
         */

        private String stid;
        private int total;
        private List<?> coming;
        private List<HotBean> hot;
        private List<Integer> movieIds;
        private List<StidsBean> stids;

        public static DataBean objectFromData(String str) {

            return new Gson().fromJson(str, DataBean.class);
        }

        public static DataBean objectFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);

                return new Gson().fromJson(jsonObject.getString(str), DataBean.class);
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return null;
        }

        public static List<DataBean> arrayDataBeanFromData(String str) {

            Type listType = new TypeToken<ArrayList<DataBean>>() {
            }.getType();

            return new Gson().fromJson(str, listType);
        }

        public static List<DataBean> arrayDataBeanFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);
                Type listType = new TypeToken<ArrayList<DataBean>>() {
                }.getType();

                return new Gson().fromJson(jsonObject.getString(str), listType);

            } catch (JSONException e) {
                e.printStackTrace();
            }

            return new ArrayList();


        }

        public String getStid() {
            return stid;
        }

        public void setStid(String stid) {
            this.stid = stid;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public List<?> getComing() {
            return coming;
        }

        public void setComing(List<?> coming) {
            this.coming = coming;
        }

        public List<HotBean> getHot() {
            return hot;
        }

        public void setHot(List<HotBean> hot) {
            this.hot = hot;
        }

        public List<Integer> getMovieIds() {
            return movieIds;
        }

        public void setMovieIds(List<Integer> movieIds) {
            this.movieIds = movieIds;
        }

        public List<StidsBean> getStids() {
            return stids;
        }

        public void setStids(List<StidsBean> stids) {
            this.stids = stids;
        }

        public static class HotBean {
            /**
             * boxInfo : 上映1天，累计票房5105万
             * cat : 剧情,爱情,动画
             * civilPubSt : 0
             * desc : 主演:上白石萌音,神木隆之介,长泽雅美
             * dir : 新海诚
             * dur : 107
             * effectShowNum : 0
             * fra : 日本
             * frt : 2016-08-26
             * globalReleased : true
             * headLineShow : false
             * headLines : []
             * headLinesVO : [{"movieId":344881,"title":"对着谷歌地图，我们把取景地都找到了","type":"专题","url":"meituanmovie://www.meituan.com/forum/newsDetail?id=16957"},{"movieId":344881,"title":"导演新海诚：梦想做宇航员的动画导演","type":"专访","url":"meituanmovie://www.meituan.com/forum/newsDetail?id=16926"}]
             * id : 344881
             * img : http://p0.meituan.net/w.h/movie/910b2e6c7cb0da947d65ef5c33929eb9366676.jpg
             * late : false
             * localPubSt : 0
             * mk : 9.6
             * newsHeadlines : [{"movieId":344881,"title":"对着谷歌地图，我们把取景地都找到了","type":"专题","url":"meituanmovie://www.meituan.com/forum/newsDetail?id=16957"},{"movieId":344881,"title":"导演新海诚：梦想做宇航员的动画导演","type":"专访","url":"meituanmovie://www.meituan.com/forum/newsDetail?id=16926"}]
             * nm : 你的名字。
             * pn : 180
             * preSale : 0
             * preShow : false
             * proScore : 6.7
             * proScoreNum : 10
             * pubDate : 1480608000000
             * pubShowNum : 0
             * recentShowDate : 1480608000000
             * recentShowNum : 0
             * rt : 2016-12-02
             * sc : 9.6
             * scm : 寻君千里行，心系君之名
             * showInfo : 今天159家影院放映1944场
             * showNum : 1944
             * showTimeInfo : 2016-12-02 本周五上映
             * showst : 3
             * snum : 27762
             * star : 上白石萌音,神木隆之介,长泽雅美
             * totalShowNum : 4303
             * ver : 2D
             * videoId : 82197
             * videoName : 终极预告片 12月2日一起看吧！
             * videourl : http://maoyan.meituan.net/movie/videos/854x480c1f128106e4f4715a87a2b9565b74f54.mp4
             * vnum : 21
             * weight : 1
             * wish : 277114
             * wishst : 0
             */

            private String boxInfo;
            private String cat;
            private int civilPubSt;
            private String desc;
            private String dir;
            private int dur;
            private int effectShowNum;
            private String fra;
            private String frt;
            private boolean globalReleased;
            private boolean headLineShow;
            private int id;
            private String img;
            private boolean late;
            private int localPubSt;
            private double mk;
            private String nm;
            private int pn;
            private int preSale;
            private boolean preShow;
            private double proScore;
            private int proScoreNum;
            private long pubDate;
            private int pubShowNum;
            private long recentShowDate;
            private int recentShowNum;
            private String rt;
            private double sc;
            private String scm;
            private String showInfo;
            private int showNum;
            private String showTimeInfo;
            private int showst;
            private int snum;
            private String star;
            private int totalShowNum;
            private String ver;
            private int videoId;
            private String videoName;
            private String videourl;
            private int vnum;
            private int weight;
            private int wish;
            private int wishst;
            private List<?> headLines;
            private List<HeadLinesVOBean> headLinesVO;
            private List<NewsHeadlinesBean> newsHeadlines;

            public static HotBean objectFromData(String str) {

                return new Gson().fromJson(str, HotBean.class);
            }

            public static HotBean objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(str), HotBean.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public static List<HotBean> arrayHotBeanFromData(String str) {

                Type listType = new TypeToken<ArrayList<HotBean>>() {
                }.getType();

                return new Gson().fromJson(str, listType);
            }

            public static List<HotBean> arrayHotBeanFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);
                    Type listType = new TypeToken<ArrayList<HotBean>>() {
                    }.getType();

                    return new Gson().fromJson(jsonObject.getString(str), listType);

                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return new ArrayList();


            }

            public String getBoxInfo() {
                return boxInfo;
            }

            public void setBoxInfo(String boxInfo) {
                this.boxInfo = boxInfo;
            }

            public String getCat() {
                return cat;
            }

            public void setCat(String cat) {
                this.cat = cat;
            }

            public int getCivilPubSt() {
                return civilPubSt;
            }

            public void setCivilPubSt(int civilPubSt) {
                this.civilPubSt = civilPubSt;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getDir() {
                return dir;
            }

            public void setDir(String dir) {
                this.dir = dir;
            }

            public int getDur() {
                return dur;
            }

            public void setDur(int dur) {
                this.dur = dur;
            }

            public int getEffectShowNum() {
                return effectShowNum;
            }

            public void setEffectShowNum(int effectShowNum) {
                this.effectShowNum = effectShowNum;
            }

            public String getFra() {
                return fra;
            }

            public void setFra(String fra) {
                this.fra = fra;
            }

            public String getFrt() {
                return frt;
            }

            public void setFrt(String frt) {
                this.frt = frt;
            }

            public boolean isGlobalReleased() {
                return globalReleased;
            }

            public void setGlobalReleased(boolean globalReleased) {
                this.globalReleased = globalReleased;
            }

            public boolean isHeadLineShow() {
                return headLineShow;
            }

            public void setHeadLineShow(boolean headLineShow) {
                this.headLineShow = headLineShow;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getImg() {
                return img;
            }

            public void setImg(String img) {
                this.img = img;
            }

            public boolean isLate() {
                return late;
            }

            public void setLate(boolean late) {
                this.late = late;
            }

            public int getLocalPubSt() {
                return localPubSt;
            }

            public void setLocalPubSt(int localPubSt) {
                this.localPubSt = localPubSt;
            }

            public double getMk() {
                return mk;
            }

            public void setMk(double mk) {
                this.mk = mk;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public int getPn() {
                return pn;
            }

            public void setPn(int pn) {
                this.pn = pn;
            }

            public int getPreSale() {
                return preSale;
            }

            public void setPreSale(int preSale) {
                this.preSale = preSale;
            }

            public boolean isPreShow() {
                return preShow;
            }

            public void setPreShow(boolean preShow) {
                this.preShow = preShow;
            }

            public double getProScore() {
                return proScore;
            }

            public void setProScore(double proScore) {
                this.proScore = proScore;
            }

            public int getProScoreNum() {
                return proScoreNum;
            }

            public void setProScoreNum(int proScoreNum) {
                this.proScoreNum = proScoreNum;
            }

            public long getPubDate() {
                return pubDate;
            }

            public void setPubDate(long pubDate) {
                this.pubDate = pubDate;
            }

            public int getPubShowNum() {
                return pubShowNum;
            }

            public void setPubShowNum(int pubShowNum) {
                this.pubShowNum = pubShowNum;
            }

            public long getRecentShowDate() {
                return recentShowDate;
            }

            public void setRecentShowDate(long recentShowDate) {
                this.recentShowDate = recentShowDate;
            }

            public int getRecentShowNum() {
                return recentShowNum;
            }

            public void setRecentShowNum(int recentShowNum) {
                this.recentShowNum = recentShowNum;
            }

            public String getRt() {
                return rt;
            }

            public void setRt(String rt) {
                this.rt = rt;
            }

            public double getSc() {
                return sc;
            }

            public void setSc(double sc) {
                this.sc = sc;
            }

            public String getScm() {
                return scm;
            }

            public void setScm(String scm) {
                this.scm = scm;
            }

            public String getShowInfo() {
                return showInfo;
            }

            public void setShowInfo(String showInfo) {
                this.showInfo = showInfo;
            }

            public int getShowNum() {
                return showNum;
            }

            public void setShowNum(int showNum) {
                this.showNum = showNum;
            }

            public String getShowTimeInfo() {
                return showTimeInfo;
            }

            public void setShowTimeInfo(String showTimeInfo) {
                this.showTimeInfo = showTimeInfo;
            }

            public int getShowst() {
                return showst;
            }

            public void setShowst(int showst) {
                this.showst = showst;
            }

            public int getSnum() {
                return snum;
            }

            public void setSnum(int snum) {
                this.snum = snum;
            }

            public String getStar() {
                return star;
            }

            public void setStar(String star) {
                this.star = star;
            }

            public int getTotalShowNum() {
                return totalShowNum;
            }

            public void setTotalShowNum(int totalShowNum) {
                this.totalShowNum = totalShowNum;
            }

            public String getVer() {
                return ver;
            }

            public void setVer(String ver) {
                this.ver = ver;
            }

            public int getVideoId() {
                return videoId;
            }

            public void setVideoId(int videoId) {
                this.videoId = videoId;
            }

            public String getVideoName() {
                return videoName;
            }

            public void setVideoName(String videoName) {
                this.videoName = videoName;
            }

            public String getVideourl() {
                return videourl;
            }

            public void setVideourl(String videourl) {
                this.videourl = videourl;
            }

            public int getVnum() {
                return vnum;
            }

            public void setVnum(int vnum) {
                this.vnum = vnum;
            }

            public int getWeight() {
                return weight;
            }

            public void setWeight(int weight) {
                this.weight = weight;
            }

            public int getWish() {
                return wish;
            }

            public void setWish(int wish) {
                this.wish = wish;
            }

            public int getWishst() {
                return wishst;
            }

            public void setWishst(int wishst) {
                this.wishst = wishst;
            }

            public List<?> getHeadLines() {
                return headLines;
            }

            public void setHeadLines(List<?> headLines) {
                this.headLines = headLines;
            }

            public List<HeadLinesVOBean> getHeadLinesVO() {
                return headLinesVO;
            }

            public void setHeadLinesVO(List<HeadLinesVOBean> headLinesVO) {
                this.headLinesVO = headLinesVO;
            }

            public List<NewsHeadlinesBean> getNewsHeadlines() {
                return newsHeadlines;
            }

            public void setNewsHeadlines(List<NewsHeadlinesBean> newsHeadlines) {
                this.newsHeadlines = newsHeadlines;
            }

            public static class HeadLinesVOBean {
                /**
                 * movieId : 344881
                 * title : 对着谷歌地图，我们把取景地都找到了
                 * type : 专题
                 * url : meituanmovie://www.meituan.com/forum/newsDetail?id=16957
                 */

                private int movieId;
                private String title;
                private String type;
                private String url;

                public static HeadLinesVOBean objectFromData(String str) {

                    return new Gson().fromJson(str, HeadLinesVOBean.class);
                }

                public static HeadLinesVOBean objectFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);

                        return new Gson().fromJson(jsonObject.getString(str), HeadLinesVOBean.class);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return null;
                }

                public static List<HeadLinesVOBean> arrayHeadLinesVOBeanFromData(String str) {

                    Type listType = new TypeToken<ArrayList<HeadLinesVOBean>>() {
                    }.getType();

                    return new Gson().fromJson(str, listType);
                }

                public static List<HeadLinesVOBean> arrayHeadLinesVOBeanFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);
                        Type listType = new TypeToken<ArrayList<HeadLinesVOBean>>() {
                        }.getType();

                        return new Gson().fromJson(jsonObject.getString(str), listType);

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return new ArrayList();


                }

                public int getMovieId() {
                    return movieId;
                }

                public void setMovieId(int movieId) {
                    this.movieId = movieId;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }
            }

            public static class NewsHeadlinesBean {
                /**
                 * movieId : 344881
                 * title : 对着谷歌地图，我们把取景地都找到了
                 * type : 专题
                 * url : meituanmovie://www.meituan.com/forum/newsDetail?id=16957
                 */

                private int movieId;
                private String title;
                private String type;
                private String url;

                public static NewsHeadlinesBean objectFromData(String str) {

                    return new Gson().fromJson(str, NewsHeadlinesBean.class);
                }

                public static NewsHeadlinesBean objectFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);

                        return new Gson().fromJson(jsonObject.getString(str), NewsHeadlinesBean.class);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return null;
                }

                public static List<NewsHeadlinesBean> arrayNewsHeadlinesBeanFromData(String str) {

                    Type listType = new TypeToken<ArrayList<NewsHeadlinesBean>>() {
                    }.getType();

                    return new Gson().fromJson(str, listType);
                }

                public static List<NewsHeadlinesBean> arrayNewsHeadlinesBeanFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);
                        Type listType = new TypeToken<ArrayList<NewsHeadlinesBean>>() {
                        }.getType();

                        return new Gson().fromJson(jsonObject.getString(str), listType);

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return new ArrayList();


                }

                public int getMovieId() {
                    return movieId;
                }

                public void setMovieId(int movieId) {
                    this.movieId = movieId;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
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

        public static class StidsBean {
            /**
             * movieId : 344881
             * stid : 576591972453269000_a344881_c0
             */

            private int movieId;
            private String stid;

            public static StidsBean objectFromData(String str) {

                return new Gson().fromJson(str, StidsBean.class);
            }

            public static StidsBean objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(str), StidsBean.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public static List<StidsBean> arrayStidsBeanFromData(String str) {

                Type listType = new TypeToken<ArrayList<StidsBean>>() {
                }.getType();

                return new Gson().fromJson(str, listType);
            }

            public static List<StidsBean> arrayStidsBeanFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);
                    Type listType = new TypeToken<ArrayList<StidsBean>>() {
                    }.getType();

                    return new Gson().fromJson(jsonObject.getString(str), listType);

                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return new ArrayList();


            }

            public int getMovieId() {
                return movieId;
            }

            public void setMovieId(int movieId) {
                this.movieId = movieId;
            }

            public String getStid() {
                return stid;
            }

            public void setStid(String stid) {
                this.stid = stid;
            }
        }
    }
}
