package somi.hitomi.maoyanmovie.domain;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by HitomiT on 2016/12/2.
 */

public class ComingMovieBean {

    /**
     * data : {"coming":[{"cat":"剧情,冒险,奇幻","civilPubSt":0,"comingTitle":"12月16日 周五","desc":"主演:马特·达蒙,景甜,佩德罗·帕斯卡","dir":"张艺谋","dur":104,"effectShowNum":0,"fra":"美国,瑞典,荷兰,德国,英国","frt":"2017-02-17,2016-09-30,2016-11-24,2016-12-22,2017-01-06","globalReleased":false,"headLineShow":false,"headLines":[],"headLinesVO":[],"id":246267,"img":"http://p0.meituan.net/w.h/movie/e4a3447ebe8c44eea59ab7f68790c7e2179321.jpeg","late":false,"localPubSt":0,"mk":0,"newsHeadlines":[],"nm":"长城","pn":98,"preShow":false,"proScore":0,"proScoreNum":0,"pubDate":1481817600000,"pubShowNum":0,"recentShowDate":0,"recentShowNum":0,"rt":"2016-12-16","sc":0,"scm":"五军战饕餮，中国魂不灭","showNum":0,"showst":1,"snum":4488,"star":"马特·达蒙,景甜,佩德罗·帕斯卡","ver":"2D/3D","videoId":82214,"videoName":"电影《长城》三巨星特辑 呆萌这次又要被救了","videourl":"http://maoyan.meituan.net/movie/videos/854x480528115c49e544c14a057cef704a5d187.mp4","vnum":14,"weight":1,"wish":182149,"wishst":0,"showInfo":"今天7家影院放映10场","time":"2017-01"},{"cat":"喜剧,爱情","civilPubSt":0,"comingTitle":"12月23日 周五","desc":"主演:梁朝伟,金城武,陈奕迅","dir":"张嘉佳","dur":0,"effectShowNum":0,"globalReleased":false,"headLineShow":false,"headLines":[],"headLinesVO":[],"id":246388,"img":"http://p1.meituan.net/w.h/movie/7f41742a5c2ea24fcd2018ad333451ae193120.jpg","late":false,"localPubSt":0,"mk":0,"newsHeadlines":[],"nm":"摆渡人","pn":152,"preShow":false,"proScore":0,"proScoreNum":0,"pubDate":1482422400000,"pubShowNum":0,"recentShowDate":0,"recentShowNum":0,"rt":"2016-12-23","sc":0,"scm":"你爱我不爱，我爱你不爱","showNum":0,"showst":1,"snum":1358,"star":"梁朝伟,金城武,陈奕迅","ver":"2D","videoId":82211,"videoName":"《摆渡人》\u201c陪你渡过\u201d版预告","videourl":"http://maoyan.meituan.net/movie/videos/854x48044d49cefd7b24f9fab4b839f9f7b8eb6.mp4","vnum":5,"weight":1,"wish":128797,"wishst":0},{"cat":"喜剧,动作,冒险","civilPubSt":0,"comingTitle":"2017年1月28日 周六","desc":"主演:王宝强,白客,岳云鹏","dir":"王宝强","dur":0,"effectShowNum":0,"globalReleased":false,"headLineShow":false,"headLines":[],"headLinesVO":[],"id":248935,"img":"http://p0.meituan.net/w.h/movie/ea67816f455239cd93f22e462d14dadc173993.jpg","late":false,"localPubSt":0,"mk":0,"newsHeadlines":[],"nm":"大闹天竺","pn":101,"preShow":false,"proScore":0,"proScoreNum":0,"pubDate":1485532800000,"pubShowNum":0,"recentShowDate":0,"recentShowNum":0,"rt":"2017-01-28","sc":0,"scm":"宝强取真经，争当搞笑King","showNum":0,"showst":1,"snum":2880,"star":"王宝强,白客,岳云鹏","ver":"2D","videoId":81077,"videoName":"\u201c静\u201d请期待版预告片","videourl":"http://maoyan.meituan.net/movie/videos/1128x480fed635b9474b4ac2808ce282cd89d669.mp4","vnum":1,"weight":1,"wish":126733,"wishst":0},{"cat":"喜剧,爱情,奇幻","civilPubSt":0,"comingTitle":"12月9日 周五","desc":"主演:倪妮,霍建华,马苏","dir":"张末","dur":109,"effectShowNum":0,"globalReleased":false,"headLineShow":false,"headLines":[],"headLinesVO":[],"id":343413,"img":"http://p1.meituan.net/w.h/movie/f85de4d42c6fe3e958bd204fcb6a76f59235962.jpg","late":false,"localPubSt":0,"mk":9.2,"newsHeadlines":[],"nm":"28岁未成年","pn":140,"preShow":true,"proScore":0,"proScoreNum":2,"pubDate":1481212800000,"pubShowNum":0,"recentShowDate":0,"recentShowNum":0,"rt":"2016-12-09","sc":9.2,"scm":"哭成小笨蛋，笑回长大前","showInfo":"今天7家影院放映10场","showNum":0,"showst":4,"snum":95,"star":"倪妮,霍建华,马苏","ver":"2D","videoId":82151,"videoName":"毒丸版预告片","videourl":"http://maoyan.meituan.net/movie/videos/854x480780a6acfadc8407b917478f2072faf3c.mp4","vnum":7,"weight":1,"wish":93871,"wishst":0},{"cat":"喜剧,动作,奇幻","civilPubSt":0,"comingTitle":"2017年1月28日 周六","desc":"主演:吴亦凡,林更新,杨一威","dir":"徐克","dur":0,"effectShowNum":0,"globalReleased":false,"headLineShow":false,"headLines":[],"headLinesVO":[],"id":248904,"img":"http://p1.meituan.net/w.h/movie/77cf7c5589c769f6b4ea108362f50532400259.jpg","late":false,"localPubSt":0,"mk":0,"newsHeadlines":[],"nm":"西游·伏妖篇","pn":100,"preShow":false,"proScore":0,"proScoreNum":0,"pubDate":1485532800000,"pubShowNum":0,"recentShowDate":0,"recentShowNum":0,"rt":"2017-01-28","sc":0,"scm":"取经矛盾多，面和心不和","showNum":0,"showst":1,"snum":2170,"star":"吴亦凡,林更新,杨一威","ver":"2D/3D","videoId":81813,"videoName":"彩蛋NG预告片","videourl":"http://maoyan.meituan.net/movie/videos/5c7b8b69e8344d49b2ad2385c030b617.mp4","vnum":4,"weight":1,"wish":88908,"wishst":0},{"cat":"剧情,喜剧","civilPubSt":0,"comingTitle":"2017年2月17日 周五","desc":"主演:毕志飞,李彦漫,陈思瀚","dir":"毕志飞","dur":95,"effectShowNum":0,"globalReleased":false,"headLineShow":false,"headLines":[],"headLinesVO":[],"id":340946,"img":"http://p0.meituan.net/w.h/movie/ad48eec319582068c14f3b391d70782c106705.jpeg","late":false,"localPubSt":0,"mk":0,"newsHeadlines":[],"nm":"纯洁心灵·逐梦演艺圈","pn":40,"preShow":false,"proScore":0,"proScoreNum":0,"pubDate":1487260800000,"pubShowNum":0,"recentShowDate":0,"recentShowNum":0,"rt":"2017-02-17","sc":0,"scm":"贵圈有点乱，逐梦远泥潭","showNum":0,"showst":1,"snum":399,"star":"毕志飞,李彦漫,陈思瀚","ver":"2D","videoId":47663,"videoName":"先导预告片","videourl":"http://maoyan.meituan.net/movie/videos/854x48088e57566727c4007b1c2996a44d434a8.mp4","vnum":3,"weight":1,"wish":51788,"wishst":0},{"cat":"动作,冒险,科幻","civilPubSt":0,"comingTitle":"2017年1月 待定","desc":"主演:菲丽希缇·琼斯,麦斯·米科尔森,本·门德尔森","dir":"加里斯·爱德华斯","dur":133,"effectShowNum":0,"fra":"美国","frt":"2016-12-16","globalReleased":false,"headLineShow":false,"headLines":[],"headLinesVO":[],"id":247185,"img":"http://p0.meituan.net/w.h/movie/ba85d6aa4c981692a6d4c35d380ef03e743946.jpg","late":false,"localPubSt":0,"mk":0,"newsHeadlines":[],"nm":"侠盗一号：星球大战外传","pn":368,"preShow":false,"proScore":0,"proScoreNum":0,"pubDate":1485835200000,"pubShowNum":0,"recentShowDate":0,"recentShowNum":0,"sc":0,"scm":"姜文和子丹，去打太空战","showNum":0,"showst":1,"snum":280,"star":"菲丽希缇·琼斯,麦斯·米科尔森,本·门德尔森","time":"2017-01","ver":"2D/3D","videoId":82152,"videoName":"呼吸版电视预告片","videourl":"http://maoyan.meituan.net/movie/videos/dd77d906964e4edb9dd5635cfb92c19f.mp4","vnum":29,"weight":1,"wish":50385,"wishst":0},{"cat":"剧情,动作,传记","civilPubSt":0,"comingTitle":"12月16日 周五","desc":"主演:葛优,章子怡,浅野忠信","dir":"程耳","dur":100,"effectShowNum":0,"globalReleased":false,"headLineShow":false,"headLines":[],"headLinesVO":[],"id":246261,"img":"http://p1.meituan.net/w.h/movie/e3c34991865ce70b81d7e4bc7df41c19355849.jpg","late":false,"localPubSt":0,"mk":0,"newsHeadlines":[],"nm":"罗曼蒂克消亡史","pn":140,"preShow":false,"proScore":0,"proScoreNum":0,"pubDate":1481817600000,"pubShowNum":0,"recentShowDate":0,"recentShowNum":0,"rt":"2016-12-16","sc":0,"scm":"教父葛大爷，死磕男间谍","showNum":0,"showst":1,"snum":447,"star":"葛优,章子怡,浅野忠信","ver":"2D","videoId":82213,"videoName":"《罗曼蒂克消亡史》陆先生片花曝光 枪火无眼黑帮有道","videourl":"http://maoyan.meituan.net/movie/videos/854x4804efde4d4ba704632b97b820ed05ab7e5.mp4","vnum":10,"weight":1,"wish":48083,"wishst":0},{"cat":"喜剧,动作,战争","civilPubSt":0,"comingTitle":"12月30日 周五","desc":"主演:成龙,黄子韬,王凯","dir":"丁晟","dur":130,"effectShowNum":0,"globalReleased":false,"headLineShow":false,"headLines":[],"headLinesVO":[],"id":248916,"img":"http://p0.meituan.net/w.h/movie/6f294e1bcfc9b3318034f7e22ddf1e0c2259769.jpg","late":false,"localPubSt":0,"mk":0,"newsHeadlines":[],"nm":"铁道飞虎","pn":199,"preShow":false,"proScore":0,"proScoreNum":0,"pubDate":1483027200000,"pubShowNum":0,"recentShowDate":0,"recentShowNum":0,"rt":"2016-12-30","sc":0,"scm":"铁道抗日寇，有勇更有谋","showNum":0,"showst":1,"snum":1748,"star":"成龙,黄子韬,王凯","ver":"2D","videoId":82132,"videoName":"海外版预告 成龙黄子韬王凯王大陆热血开战","videourl":"http://maoyan.meituan.net/movie/videos/854x48082698ca5cba04996921b592a0457b5e8.mp4","vnum":7,"weight":1,"wish":34440,"wishst":0},{"cat":"爱情,悬疑,犯罪","civilPubSt":0,"comingTitle":"12月30日 周五","desc":"主演:胡歌,宋佳,颜卓灵","dir":"周隼","dur":0,"effectShowNum":0,"globalReleased":false,"headLineShow":false,"headLines":[],"headLinesVO":[],"id":1187526,"img":"http://p0.meituan.net/w.h/movie/d4def49e4f1b238c939334f8915bd8ac829204.png","late":false,"localPubSt":0,"mk":0,"newsHeadlines":[],"nm":"那年夏天你去了哪里","pn":52,"preShow":false,"proScore":0,"proScoreNum":0,"pubDate":1483027200000,"pubShowNum":0,"recentShowDate":0,"recentShowNum":0,"rt":"2016-12-30","sc":0,"scm":"绑架十二年，归家惹事端","showNum":0,"showst":1,"snum":882,"star":"胡歌,宋佳,颜卓灵","ver":"2D","videoId":81980,"videoName":"终极预告片","videourl":"http://maoyan.meituan.net/movie/videos/1146x480783a8d48342b4989bbd089aa4980994d.mp4","vnum":6,"weight":1,"wish":32209,"wishst":0},{"cat":"动画,奇幻,家庭","civilPubSt":0,"comingTitle":"12月31日 周六","desc":"主演:伊莎贝拉·弗尔曼,沙尔托·科普雷,贝拉·索恩","dir":"阿列克谢·特斯蒂斯林","dur":85,"effectShowNum":0,"fra":"英国","frt":"2014-12-11","globalReleased":false,"headLineShow":false,"headLines":[],"headLinesVO":[],"id":246276,"img":"http://p0.meituan.net/w.h/movie/1b5e2752d1f9fddee62a467b1a37d0904690507.jpg","late":false,"localPubSt":0,"mk":0,"newsHeadlines":[],"nm":"冰雪女皇之冬日魔咒","pn":49,"preShow":false,"proScore":0,"proScoreNum":0,"pubDate":1483113600000,"pubShowNum":0,"recentShowDate":0,"recentShowNum":0,"rt":"2016-12-31","sc":0,"scm":"北风使劲吹，公主又悲催","showNum":0,"showst":1,"snum":310,"star":"伊莎贝拉·弗尔曼,沙尔托·科普雷,贝拉·索恩","ver":"2D/3D","videoId":82187,"videoName":"寓言版预告片","videourl":"http://maoyan.meituan.net/movie/videos/854x4805730c96f4dd549d69a480bf25722b861.mp4","vnum":2,"weight":1,"wish":31865,"wishst":0},{"cat":"喜剧,动作,冒险","civilPubSt":0,"comingTitle":"2017年1月28日 周六","desc":"主演:成龙,李治廷,张艺兴","dir":"唐季礼","dur":0,"effectShowNum":0,"globalReleased":false,"headLineShow":false,"headLines":[],"headLinesVO":[],"id":248933,"img":"http://p1.meituan.net/w.h/movie/243a6fb4155161febd1c36d10c9d99f83041992.jpg","late":false,"localPubSt":0,"mk":0,"newsHeadlines":[],"nm":"功夫瑜伽","pn":86,"preShow":false,"proScore":0,"proScoreNum":0,"pubDate":1485532800000,"pubShowNum":0,"recentShowDate":0,"recentShowNum":0,"rt":"2017-01-28","sc":0,"scm":"科学家寻宝，中印来回跑","showNum":0,"showst":1,"snum":390,"star":"成龙,李治廷,张艺兴","ver":"2D/3D/IMAX 3D","videoId":81740,"videoName":"先导预告片","videourl":"http://maoyan.meituan.net/movie/videos/854x480adf53c1b2bed4c2aba68b306ac276258.mp4","vnum":5,"weight":1,"wish":31022,"wishst":0},{"cat":"喜剧,爱情,家庭","civilPubSt":0,"comingTitle":"12月9日 周五","desc":"主演:董洁,张亮,孙茜","dir":"马楚成","dur":97,"effectShowNum":0,"globalReleased":false,"headLineShow":false,"headLines":[],"headLinesVO":[],"id":247913,"img":"http://p0.meituan.net/w.h/movie/c8f8e7c3af8c5792d80c958cca13b61a500299.jpg","late":false,"localPubSt":0,"mk":0,"newsHeadlines":[],"nm":"爸爸的3次婚礼","pn":15,"preShow":false,"proScore":0,"proScoreNum":0,"pubDate":1481212800000,"pubShowNum":0,"recentShowDate":0,"recentShowNum":0,"rt":"2016-12-09","sc":0,"scm":"结了又分手，啥时是个头","showNum":0,"showst":1,"snum":89,"star":"董洁,张亮,孙茜","ver":"2D","videoId":38884,"videoName":"六次别离 拍摄花絮之mike隋孙茜不靠谱组合","videourl":"http://maoyan.meituan.net/movie/videos/f53c7fca22ee4014b12d11520b78c6f6.mp4","vnum":1,"weight":1,"wish":21783,"wishst":0},{"cat":"恐怖,惊悚,悬疑","civilPubSt":0,"comingTitle":"2017年2月1日 周三","desc":"主演:李果,庄森,朱洪振","dir":"戴维","dur":0,"effectShowNum":0,"globalReleased":false,"headLineShow":false,"headLines":[],"headLinesVO":[],"id":346464,"img":"http://p0.meituan.net/w.h/movie/2af851bd4c5103ec8fe6d39e84679a34735139.jpg","late":false,"localPubSt":0,"mk":0,"newsHeadlines":[],"nm":"谜域之噬魂岭","pn":45,"preShow":false,"proScore":0,"proScoreNum":0,"pubDate":1485878400000,"pubShowNum":0,"recentShowDate":0,"recentShowNum":0,"rt":"2017-02-01","sc":0,"scm":"人类之劫数，终极大恐怖","showNum":0,"showst":1,"snum":52,"star":"李果,庄森,朱洪振","ver":"2D","videoId":82169,"videoName":"终极预告片","videourl":"http://maoyan.meituan.net/movie/videos/854x4802e474b175a3946a092c1f2737db693d4.mp4","vnum":2,"weight":1,"wish":18600,"wishst":0},{"cat":"奇幻,喜剧,动作","civilPubSt":0,"comingTitle":"2017年1月 待定","desc":"主演:吴磊,张丰毅,罗佩","dir":"刘镇伟","dur":0,"effectShowNum":0,"globalReleased":false,"headLineShow":false,"headLines":[],"headLinesVO":[],"id":342950,"img":"http://p1.meituan.net/w.h/movie/8b5b76512172a96475964dd6aa878d921529448.jpg","late":false,"localPubSt":0,"mk":0,"newsHeadlines":[],"nm":"大闹东海","pn":30,"preShow":false,"proScore":0,"proScoreNum":0,"pubDate":1485835200000,"pubShowNum":0,"recentShowDate":0,"recentShowNum":0,"sc":0,"scm":"哪吒自认罚，闯祸不求爸","showNum":0,"showst":1,"snum":127,"star":"吴磊,张丰毅,罗佩","time":"2017-01","ver":"2D/3D","videoId":0,"vnum":0,"weight":1,"wish":17989,"wishst":0},{"cat":"喜剧,爱情,奇幻","civilPubSt":0,"comingTitle":"12月31日 周六","desc":"主演:文卓,邹杨,曹曦月","dir":"林云翔,叶茗","dur":0,"effectShowNum":0,"globalReleased":false,"headLineShow":false,"headLines":[],"headLinesVO":[],"id":343742,"img":"http://p0.meituan.net/w.h/movie/7fc86f5f55332fac84fef040c3fe6a6e1040553.jpg","late":false,"localPubSt":0,"mk":0,"newsHeadlines":[],"nm":"人鱼校花","pn":7,"preShow":false,"proScore":0,"proScoreNum":0,"pubDate":1483113600000,"pubShowNum":0,"recentShowDate":0,"recentShowNum":0,"rt":"2016-12-31","sc":0,"scm":"误闯游泳池，人鱼追爱迟","showNum":0,"showst":1,"snum":442,"star":"文卓,邹杨,曹曦月","ver":"2D","videoId":82031,"videoName":"预告片","videourl":"http://maoyan.meituan.net/movie/videos/d64b69c32c9f40739b67d649a4c6a9f2.mp4","vnum":3,"weight":1,"wish":16917,"wishst":0},{"cat":"动作,悬疑,犯罪","civilPubSt":0,"comingTitle":"12月16日 周五","desc":"主演:欧豪,张译,余男","dir":"杨树鹏","dur":0,"effectShowNum":0,"globalReleased":false,"headLineShow":false,"headLines":[],"headLinesVO":[],"id":345919,"img":"http://p1.meituan.net/w.h/movie/5ba826c1b27f04dddbc8278a5933349e883907.png","late":false,"localPubSt":0,"mk":0,"newsHeadlines":[],"nm":"少年","pn":277,"preShow":false,"proScore":0,"proScoreNum":0,"pubDate":1481817600000,"pubShowNum":0,"recentShowDate":0,"recentShowNum":0,"rt":"2016-12-16","sc":0,"scm":"设一个局谋，报十年情仇","showNum":0,"showst":1,"snum":1399,"star":"欧豪,张译,余男","ver":"2D","videoId":81937,"videoName":"\u201c谋定而动\u201d版预告片","videourl":"http://maoyan.meituan.net/movie/videos/854x480108186df79b74a0f919e00660254b092.mp4","vnum":7,"weight":1,"wish":15367,"wishst":0},{"cat":"剧情,战争","civilPubSt":0,"comingTitle":"12月8日 周四","desc":"主演:安德鲁·加菲尔德,雨果·维文,卢克·布雷西","dir":"梅尔·吉布森","dur":139,"effectShowNum":0,"fra":"美国","frt":"2016-11-04","globalReleased":false,"headLineShow":false,"headLines":[],"headLinesVO":[],"id":338349,"img":"http://p1.meituan.net/w.h/movie/9581cfbc221ab927b6c856524e96d319769553.jpg","late":false,"localPubSt":0,"mk":0,"newsHeadlines":[],"nm":"血战钢锯岭","pn":98,"preShow":false,"proScore":7.4,"proScoreNum":8,"pubDate":1481126400000,"pubShowNum":0,"recentShowDate":0,"recentShowNum":0,"rt":"2016-12-08","sc":0,"scm":"士兵有信仰，战场拒拿枪","showInfo":"2016-12-08 下周四上映","showNum":0,"showst":4,"snum":323,"star":"安德鲁·加菲尔德,雨果·维文,卢克·布雷西","ver":"2D/中国巨幕","videoId":82137,"videoName":"\u201c孤胆傲志\u201d预告片","videourl":"http://maoyan.meituan.net/movie/videos/854x480cacd191cf0ef4a37808da1fb590c3bf2.mp4","vnum":17,"weight":1,"wish":15178,"wishst":0},{"cat":"喜剧,悬疑","civilPubSt":0,"comingTitle":"2017年1月1日 周日","desc":"主演:万茜,王自健,周一围","dir":"饶晓志","dur":0,"effectShowNum":0,"globalReleased":false,"headLineShow":false,"headLines":[],"headLinesVO":[],"id":345106,"img":"http://p0.meituan.net/w.h/movie/7a3668c95987d6ea46b85fef7cc9cc2a214742.jpg","late":false,"localPubSt":0,"mk":0,"newsHeadlines":[],"nm":"你好，疯子","pn":120,"preShow":false,"proScore":0,"proScoreNum":0,"pubDate":1483200000000,"pubShowNum":0,"recentShowDate":0,"recentShowNum":0,"rt":"2017-01-01","sc":0,"scm":"醒来吓呆了，混乱一锅粥","showNum":0,"showst":1,"snum":288,"star":"万茜,王自健,周一围","ver":"2D","videoId":82081,"videoName":"快乐治疗版改档预告片","videourl":"http://maoyan.meituan.net/movie/videos/854x4805d9305b0f8ef447d8702fec56e2210d3.mp4","vnum":4,"weight":1,"wish":14817,"wishst":0},{"cat":"喜剧,犯罪,剧情","civilPubSt":0,"comingTitle":"12月9日 周五","desc":"主演:陈小春,邓家佳,汪东城","dir":"森岛","dur":88,"effectShowNum":0,"globalReleased":false,"headLineShow":false,"headLines":[],"headLinesVO":[],"id":248174,"img":"http://p0.meituan.net/w.h/movie/fe1d539e60b209773e3835124c1d03b6381915.jpg","late":false,"localPubSt":0,"mk":0,"newsHeadlines":[],"nm":"呆呆计划","pn":71,"preShow":false,"proScore":0,"proScoreNum":0,"pubDate":1481212800000,"pubShowNum":0,"recentShowDate":0,"recentShowNum":0,"rt":"2016-12-09","sc":0,"scm":"帅哥美女至，爆笑戏中戏","showNum":0,"showst":1,"snum":154,"star":"陈小春,邓家佳,汪东城","ver":"2D","videoId":81758,"videoName":"\u201c迷局\u201d版预告片","videourl":"http://maoyan.meituan.net/movie/videos/854x480323c5f12a7b2437fa24035afef0ed691.mp4","vnum":2,"weight":1,"wish":13925,"wishst":0},{"cat":"剧情,传记,灾难","civilPubSt":0,"comingTitle":"12月9日 周五","desc":"主演:汤姆·汉克斯,艾伦·艾克哈特,劳拉·琳妮","dir":"克林特·伊斯特伍德","dur":96,"effectShowNum":0,"fra":"美国,韩国","frt":"2016-09-09,2016-09-28","globalReleased":false,"headLineShow":false,"headLines":[],"headLinesVO":[],"id":342003,"img":"http://p0.meituan.net/w.h/movie/470b3d85956f801fdcdeaa1d1c1a5c84234487.jpg","late":false,"localPubSt":0,"mk":0,"newsHeadlines":[],"nm":"萨利机长","pn":78,"preShow":false,"proScore":0,"proScoreNum":6,"pubDate":1481212800000,"pubShowNum":0,"recentShowDate":0,"recentShowNum":0,"rt":"2016-12-09","sc":0,"scm":"飞机遇意外，机长险被害","showInfo":"2016-12-09 下周五上映","showNum":0,"showst":4,"snum":206,"star":"汤姆·汉克斯,艾伦·艾克哈特,劳拉·琳妮","ver":"2D/IMAX 2D/中国巨幕","videoId":82219,"videoName":"《萨利机长》发布口碑版预告片","videourl":"http://maoyan.meituan.net/movie/videos/854x480eb62a7790eac470e97af7c2096be8e03.mp4","vnum":15,"weight":1,"wish":13737,"wishst":0},{"cat":"剧情,惊悚,悬疑","civilPubSt":0,"comingTitle":"2017年2月24日 周五","desc":"主演:辉灿,何乙轩,刘汉兆","dir":"王俊潾","dur":0,"effectShowNum":0,"globalReleased":false,"headLineShow":false,"headLines":[],"headLinesVO":[],"id":344199,"img":"http://p1.meituan.net/w.h/movie/8350b8bcdc3446806f1baa8f404d4d6a806252.jpg","late":false,"localPubSt":0,"mk":0,"newsHeadlines":[],"nm":"惊魂绣花鞋","pn":11,"preShow":false,"proScore":0,"proScoreNum":0,"pubDate":1487865600000,"pubShowNum":0,"recentShowDate":0,"recentShowNum":0,"rt":"2017-02-24","sc":0,"scm":"带病回古宅，梦魇绣花鞋","showNum":0,"showst":1,"snum":36,"star":"辉灿,何乙轩,刘汉兆","ver":"2D","videoId":81683,"videoName":"先导预告片","videourl":"http://maoyan.meituan.net/movie/videos/854x48062bcf5bb44534be6b6ceed869490ece4.mp4","vnum":1,"weight":1,"wish":13291,"wishst":0},{"cat":"喜剧,动作","civilPubSt":0,"comingTitle":"2017年2月10日 周五","desc":"主演:贾乃亮,马丽,梁超","dir":"郭大雷","dur":0,"effectShowNum":0,"globalReleased":false,"headLineShow":false,"headLines":[],"headLinesVO":[],"id":344032,"img":"http://p0.meituan.net/w.h/movie/deaa2df9721b7b13a45a118fddcbb1932241880.jpg","late":false,"localPubSt":0,"mk":0,"newsHeadlines":[],"nm":"东北往事之破马张飞","pn":45,"preShow":false,"proScore":0,"proScoreNum":0,"pubDate":1486656000000,"pubShowNum":0,"recentShowDate":0,"recentShowNum":0,"rt":"2017-02-10","sc":0,"scm":"东北小混混，斗黑帮恶棍","showNum":0,"showst":1,"snum":101,"star":"贾乃亮,马丽,梁超","ver":"2D","videoId":81580,"videoName":"定档预告 贾乃亮马丽带你笑出马贾线","videourl":"http://maoyan.meituan.net/movie/videos/854x4806c04751780ce48e9a0587d608bcab965.mp4","vnum":3,"weight":1,"wish":13273,"wishst":0},{"cat":"喜剧,爱情","civilPubSt":0,"comingTitle":"12月9日 周五","desc":"主演:丹尼斯·吴,唐婧,乔杉","dir":"罗登","dur":94,"effectShowNum":0,"globalReleased":false,"headLineShow":false,"headLines":[],"headLinesVO":[],"id":1196825,"img":"http://p0.meituan.net/w.h/movie/7afb384ce4e432b816984cb60107b7c297377.jpg","late":false,"localPubSt":0,"mk":0,"newsHeadlines":[],"nm":"爱上试睡师","pn":40,"preShow":false,"proScore":0,"proScoreNum":0,"pubDate":1481212800000,"pubShowNum":0,"recentShowDate":0,"recentShowNum":0,"rt":"2016-12-09","sc":0,"scm":"失眠试睡师，爱情来医治","showNum":0,"showst":1,"snum":470,"star":"丹尼斯·吴,唐婧,乔杉","ver":"2D","videoId":82016,"videoName":"\u201c笑弹\u201d预告片","videourl":"http://maoyan.meituan.net/movie/videos/1130x48063482e46cf1c4aa683ddbc0feec48f22.mp4","vnum":4,"weight":1,"wish":13287,"wishst":0},{"cat":"恐怖,惊悚,悬疑","civilPubSt":0,"comingTitle":"2017年1月6日 周五","desc":"主演:殷果儿,姜星丘,任青安","dir":"陆诗雷","dur":0,"effectShowNum":0,"globalReleased":false,"headLineShow":false,"headLines":[],"headLinesVO":[],"id":343253,"img":"http://p0.meituan.net/w.h/movie/97aea9a6993380fa5b85a6640a8d0797851860.jpg","late":false,"localPubSt":0,"mk":0,"newsHeadlines":[],"nm":"恐怖理发店","pn":5,"preShow":false,"proScore":0,"proScoreNum":0,"pubDate":1483632000000,"pubShowNum":0,"recentShowDate":0,"recentShowNum":0,"rt":"2017-01-06","sc":0,"scm":"骷髅理发师，猛鬼追命时","showNum":0,"showst":1,"snum":117,"star":"殷果儿,姜星丘,任青安","ver":"2D","videoId":81761,"videoName":"正式预告片","videourl":"http://maoyan.meituan.net/movie/videos/854x480deec0ff42f8340ef883dedf5061a0a2a.mp4","vnum":1,"weight":1,"wish":11930,"wishst":0},{"cat":"动作,悬疑,冒险","civilPubSt":0,"comingTitle":"12月9日 周五","desc":"主演:让·雷诺,卡特琳娜·莫里诺,蒂埃里·钮维","dir":"本杰明·罗切尔","dur":94,"effectShowNum":0,"fra":"法国","frt":"2015-08-19","globalReleased":false,"headLineShow":false,"headLines":[],"headLinesVO":[],"id":342234,"img":"http://p1.meituan.net/w.h/movie/45c9d3827353f506212555ea6f44c0e139635.jpg","late":false,"localPubSt":0,"mk":0,"newsHeadlines":[],"nm":"反黑行动组","pn":44,"preShow":false,"proScore":0,"proScoreNum":0,"pubDate":1481212800000,"pubShowNum":0,"recentShowDate":0,"recentShowNum":0,"rt":"2016-12-09","sc":0,"scm":"杀手变警探，破案不一般","showNum":0,"showst":1,"snum":120,"star":"让·雷诺,卡特琳娜·莫里诺,蒂埃里·钮维","ver":"2D","videoId":82180,"videoName":"\u201c破天阴谋\u201d版预告片","videourl":"http://maoyan.meituan.net/movie/videos/854x4800535f5e7272a482d8aef54513740609c.mp4","vnum":2,"weight":1,"wish":10377,"wishst":0},{"cat":"喜剧,爱情,动作","civilPubSt":0,"comingTitle":"2017年1月 待定","desc":"主演:黄圣依,胡夏,王惜今","dir":"陈伟强,王惜今","dur":100,"effectShowNum":0,"globalReleased":false,"headLineShow":false,"headLines":[],"headLinesVO":[],"id":341370,"img":"http://p0.meituan.net/w.h/movie/4fea0a747b3afbc659010b9691fc80fe953099.jpg","late":false,"localPubSt":0,"mk":0,"newsHeadlines":[],"nm":"活宝","pn":177,"preShow":false,"proScore":0,"proScoreNum":0,"pubDate":1485835200000,"pubShowNum":0,"recentShowDate":0,"recentShowNum":0,"sc":0,"scm":"活宝二人组，探案傻乎乎","showNum":0,"showst":1,"snum":245,"star":"黄圣依,胡夏,王惜今","time":"2017-01","ver":"2D","videoId":46509,"videoName":"首款预告片","videourl":"http://maoyan.meituan.net/movie/videos/744108c402a54cefb6cc1da6cfba3e85.mp4","vnum":1,"weight":1,"wish":9226,"wishst":0},{"cat":"纪录片","civilPubSt":0,"comingTitle":"12月16日 周五","desc":"主演:王津,亓昊楠,屈峰","dir":"萧寒","dur":0,"effectShowNum":0,"globalReleased":false,"headLineShow":false,"headLines":[],"headLinesVO":[],"id":1196913,"img":"http://p0.meituan.net/w.h/movie/8c4e2707c513bfc598d3111463572e52160440.jpg","late":false,"localPubSt":0,"mk":0,"newsHeadlines":[],"nm":"我在故宫修文物","pn":49,"preShow":false,"proScore":0,"proScoreNum":0,"pubDate":1481817600000,"pubShowNum":0,"recentShowDate":0,"recentShowNum":0,"rt":"2016-12-16","sc":0,"scm":"铸器以匠心，修身博古今","showNum":0,"showst":1,"snum":178,"star":"王津,亓昊楠,屈峰","ver":"2D","videoId":81750,"videoName":"燃到大屏幕宣传片","videourl":"http://maoyan.meituan.net/movie/videos/bdbc5232f62d4c2d85b3b7a983d0722e.mp4","vnum":3,"weight":1,"wish":8723,"wishst":0},{"cat":"动画,冒险","civilPubSt":0,"comingTitle":"2017年1月13日 周五","desc":"主演:林美秀,曾允凡,孙国卿","dir":"张苑,王龙波,陆锦辉,陆锦明","dur":84,"effectShowNum":0,"globalReleased":false,"headLineShow":false,"headLines":[],"headLinesVO":[],"id":342584,"img":"http://p0.meituan.net/w.h/movie/0ec2864bf55146acabb2e8b146684508739799.png","late":false,"localPubSt":0,"mk":0,"newsHeadlines":[],"nm":"逗逗迪迪之美梦年年","pn":17,"preShow":false,"proScore":0,"proScoreNum":0,"pubDate":1484236800000,"pubShowNum":0,"recentShowDate":0,"recentShowNum":0,"rt":"2017-01-13","sc":0,"scm":"噩梦从天降，兄妹寻真相","showNum":0,"showst":1,"snum":185,"star":"林美秀,曾允凡,孙国卿","ver":"2D","videoId":21245,"videoName":"先行版预告片","videourl":"http://maoyan.meituan.net/movie/videos/8a60ef8dd190407f86d7a1a2a776f3ea.mp4","vnum":1,"weight":1,"wish":6181,"wishst":0},{"cat":"剧情","civilPubSt":0,"comingTitle":"2016年 待定","desc":"主演:黄远,王大陆,赖雅妍","dir":"洪昇扬","dur":0,"effectShowNum":0,"fra":"中国台湾","frt":"2016-10-07","globalReleased":false,"headLineShow":false,"headLines":[],"headLinesVO":[],"id":344751,"img":"http://p0.meituan.net/w.h/movie/a8721482c236affc34c775556c35bf09245088.jpg","late":false,"localPubSt":0,"mk":0,"newsHeadlines":[],"nm":"一万公里的约定","pn":66,"preShow":false,"proScore":0,"proScoreNum":0,"pubDate":1483196400000,"pubShowNum":0,"recentShowDate":0,"recentShowNum":0,"sc":0,"scm":"徒步一万里，证明我爱你","showNum":0,"showst":1,"snum":37,"star":"黄远,王大陆,赖雅妍","time":"2016","ver":"2D","videoId":46366,"videoName":"先导预告片","videourl":"http://maoyan.meituan.net/movie/videos/854x4803934806981fd4df9ae24aca31e0472aa.mp4","vnum":1,"weight":1,"wish":5492,"wishst":0}],"hot":[],"paging":{"hasMore":true,"limit":30,"offset":0,"total":70},"stid":"110189035512576"}
     */

    private DataBean data;

    public static ComingMovieBean objectFromData(String str) {

        return new Gson().fromJson(str, ComingMovieBean.class);
    }

    public static ComingMovieBean objectFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(str), ComingMovieBean.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<ComingMovieBean> arrayComingMovieBeanFromData(String str) {

        Type listType = new TypeToken<ArrayList<ComingMovieBean>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<ComingMovieBean> arrayComingMovieBeanFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<ComingMovieBean>>() {
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
         * coming : [{"cat":"剧情,冒险,奇幻","civilPubSt":0,"comingTitle":"12月16日 周五","desc":"主演:马特·达蒙,景甜,佩德罗·帕斯卡","dir":"张艺谋","dur":104,"effectShowNum":0,"fra":"美国,瑞典,荷兰,德国,英国","frt":"2017-02-17,2016-09-30,2016-11-24,2016-12-22,2017-01-06","globalReleased":false,"headLineShow":false,"headLines":[],"headLinesVO":[],"id":246267,"img":"http://p0.meituan.net/w.h/movie/e4a3447ebe8c44eea59ab7f68790c7e2179321.jpeg","late":false,"localPubSt":0,"mk":0,"newsHeadlines":[],"nm":"长城","pn":98,"preShow":false,"proScore":0,"proScoreNum":0,"pubDate":1481817600000,"pubShowNum":0,"recentShowDate":0,"recentShowNum":0,"rt":"2016-12-16","sc":0,"scm":"五军战饕餮，中国魂不灭","showNum":0,"showst":1,"snum":4488,"star":"马特·达蒙,景甜,佩德罗·帕斯卡","ver":"2D/3D","videoId":82214,"videoName":"电影《长城》三巨星特辑 呆萌这次又要被救了","videourl":"http://maoyan.meituan.net/movie/videos/854x480528115c49e544c14a057cef704a5d187.mp4","vnum":14,"weight":1,"wish":182149,"wishst":0},{"cat":"喜剧,爱情","civilPubSt":0,"comingTitle":"12月23日 周五","desc":"主演:梁朝伟,金城武,陈奕迅","dir":"张嘉佳","dur":0,"effectShowNum":0,"globalReleased":false,"headLineShow":false,"headLines":[],"headLinesVO":[],"id":246388,"img":"http://p1.meituan.net/w.h/movie/7f41742a5c2ea24fcd2018ad333451ae193120.jpg","late":false,"localPubSt":0,"mk":0,"newsHeadlines":[],"nm":"摆渡人","pn":152,"preShow":false,"proScore":0,"proScoreNum":0,"pubDate":1482422400000,"pubShowNum":0,"recentShowDate":0,"recentShowNum":0,"rt":"2016-12-23","sc":0,"scm":"你爱我不爱，我爱你不爱","showNum":0,"showst":1,"snum":1358,"star":"梁朝伟,金城武,陈奕迅","ver":"2D","videoId":82211,"videoName":"《摆渡人》\u201c陪你渡过\u201d版预告","videourl":"http://maoyan.meituan.net/movie/videos/854x48044d49cefd7b24f9fab4b839f9f7b8eb6.mp4","vnum":5,"weight":1,"wish":128797,"wishst":0},{"cat":"喜剧,动作,冒险","civilPubSt":0,"comingTitle":"2017年1月28日 周六","desc":"主演:王宝强,白客,岳云鹏","dir":"王宝强","dur":0,"effectShowNum":0,"globalReleased":false,"headLineShow":false,"headLines":[],"headLinesVO":[],"id":248935,"img":"http://p0.meituan.net/w.h/movie/ea67816f455239cd93f22e462d14dadc173993.jpg","late":false,"localPubSt":0,"mk":0,"newsHeadlines":[],"nm":"大闹天竺","pn":101,"preShow":false,"proScore":0,"proScoreNum":0,"pubDate":1485532800000,"pubShowNum":0,"recentShowDate":0,"recentShowNum":0,"rt":"2017-01-28","sc":0,"scm":"宝强取真经，争当搞笑King","showNum":0,"showst":1,"snum":2880,"star":"王宝强,白客,岳云鹏","ver":"2D","videoId":81077,"videoName":"\u201c静\u201d请期待版预告片","videourl":"http://maoyan.meituan.net/movie/videos/1128x480fed635b9474b4ac2808ce282cd89d669.mp4","vnum":1,"weight":1,"wish":126733,"wishst":0},{"cat":"喜剧,爱情,奇幻","civilPubSt":0,"comingTitle":"12月9日 周五","desc":"主演:倪妮,霍建华,马苏","dir":"张末","dur":109,"effectShowNum":0,"globalReleased":false,"headLineShow":false,"headLines":[],"headLinesVO":[],"id":343413,"img":"http://p1.meituan.net/w.h/movie/f85de4d42c6fe3e958bd204fcb6a76f59235962.jpg","late":false,"localPubSt":0,"mk":9.2,"newsHeadlines":[],"nm":"28岁未成年","pn":140,"preShow":true,"proScore":0,"proScoreNum":2,"pubDate":1481212800000,"pubShowNum":0,"recentShowDate":0,"recentShowNum":0,"rt":"2016-12-09","sc":9.2,"scm":"哭成小笨蛋，笑回长大前","showInfo":"今天7家影院放映10场","showNum":0,"showst":4,"snum":95,"star":"倪妮,霍建华,马苏","ver":"2D","videoId":82151,"videoName":"毒丸版预告片","videourl":"http://maoyan.meituan.net/movie/videos/854x480780a6acfadc8407b917478f2072faf3c.mp4","vnum":7,"weight":1,"wish":93871,"wishst":0},{"cat":"喜剧,动作,奇幻","civilPubSt":0,"comingTitle":"2017年1月28日 周六","desc":"主演:吴亦凡,林更新,杨一威","dir":"徐克","dur":0,"effectShowNum":0,"globalReleased":false,"headLineShow":false,"headLines":[],"headLinesVO":[],"id":248904,"img":"http://p1.meituan.net/w.h/movie/77cf7c5589c769f6b4ea108362f50532400259.jpg","late":false,"localPubSt":0,"mk":0,"newsHeadlines":[],"nm":"西游·伏妖篇","pn":100,"preShow":false,"proScore":0,"proScoreNum":0,"pubDate":1485532800000,"pubShowNum":0,"recentShowDate":0,"recentShowNum":0,"rt":"2017-01-28","sc":0,"scm":"取经矛盾多，面和心不和","showNum":0,"showst":1,"snum":2170,"star":"吴亦凡,林更新,杨一威","ver":"2D/3D","videoId":81813,"videoName":"彩蛋NG预告片","videourl":"http://maoyan.meituan.net/movie/videos/5c7b8b69e8344d49b2ad2385c030b617.mp4","vnum":4,"weight":1,"wish":88908,"wishst":0},{"cat":"剧情,喜剧","civilPubSt":0,"comingTitle":"2017年2月17日 周五","desc":"主演:毕志飞,李彦漫,陈思瀚","dir":"毕志飞","dur":95,"effectShowNum":0,"globalReleased":false,"headLineShow":false,"headLines":[],"headLinesVO":[],"id":340946,"img":"http://p0.meituan.net/w.h/movie/ad48eec319582068c14f3b391d70782c106705.jpeg","late":false,"localPubSt":0,"mk":0,"newsHeadlines":[],"nm":"纯洁心灵·逐梦演艺圈","pn":40,"preShow":false,"proScore":0,"proScoreNum":0,"pubDate":1487260800000,"pubShowNum":0,"recentShowDate":0,"recentShowNum":0,"rt":"2017-02-17","sc":0,"scm":"贵圈有点乱，逐梦远泥潭","showNum":0,"showst":1,"snum":399,"star":"毕志飞,李彦漫,陈思瀚","ver":"2D","videoId":47663,"videoName":"先导预告片","videourl":"http://maoyan.meituan.net/movie/videos/854x48088e57566727c4007b1c2996a44d434a8.mp4","vnum":3,"weight":1,"wish":51788,"wishst":0},{"cat":"动作,冒险,科幻","civilPubSt":0,"comingTitle":"2017年1月 待定","desc":"主演:菲丽希缇·琼斯,麦斯·米科尔森,本·门德尔森","dir":"加里斯·爱德华斯","dur":133,"effectShowNum":0,"fra":"美国","frt":"2016-12-16","globalReleased":false,"headLineShow":false,"headLines":[],"headLinesVO":[],"id":247185,"img":"http://p0.meituan.net/w.h/movie/ba85d6aa4c981692a6d4c35d380ef03e743946.jpg","late":false,"localPubSt":0,"mk":0,"newsHeadlines":[],"nm":"侠盗一号：星球大战外传","pn":368,"preShow":false,"proScore":0,"proScoreNum":0,"pubDate":1485835200000,"pubShowNum":0,"recentShowDate":0,"recentShowNum":0,"sc":0,"scm":"姜文和子丹，去打太空战","showNum":0,"showst":1,"snum":280,"star":"菲丽希缇·琼斯,麦斯·米科尔森,本·门德尔森","time":"2017-01","ver":"2D/3D","videoId":82152,"videoName":"呼吸版电视预告片","videourl":"http://maoyan.meituan.net/movie/videos/dd77d906964e4edb9dd5635cfb92c19f.mp4","vnum":29,"weight":1,"wish":50385,"wishst":0},{"cat":"剧情,动作,传记","civilPubSt":0,"comingTitle":"12月16日 周五","desc":"主演:葛优,章子怡,浅野忠信","dir":"程耳","dur":100,"effectShowNum":0,"globalReleased":false,"headLineShow":false,"headLines":[],"headLinesVO":[],"id":246261,"img":"http://p1.meituan.net/w.h/movie/e3c34991865ce70b81d7e4bc7df41c19355849.jpg","late":false,"localPubSt":0,"mk":0,"newsHeadlines":[],"nm":"罗曼蒂克消亡史","pn":140,"preShow":false,"proScore":0,"proScoreNum":0,"pubDate":1481817600000,"pubShowNum":0,"recentShowDate":0,"recentShowNum":0,"rt":"2016-12-16","sc":0,"scm":"教父葛大爷，死磕男间谍","showNum":0,"showst":1,"snum":447,"star":"葛优,章子怡,浅野忠信","ver":"2D","videoId":82213,"videoName":"《罗曼蒂克消亡史》陆先生片花曝光 枪火无眼黑帮有道","videourl":"http://maoyan.meituan.net/movie/videos/854x4804efde4d4ba704632b97b820ed05ab7e5.mp4","vnum":10,"weight":1,"wish":48083,"wishst":0},{"cat":"喜剧,动作,战争","civilPubSt":0,"comingTitle":"12月30日 周五","desc":"主演:成龙,黄子韬,王凯","dir":"丁晟","dur":130,"effectShowNum":0,"globalReleased":false,"headLineShow":false,"headLines":[],"headLinesVO":[],"id":248916,"img":"http://p0.meituan.net/w.h/movie/6f294e1bcfc9b3318034f7e22ddf1e0c2259769.jpg","late":false,"localPubSt":0,"mk":0,"newsHeadlines":[],"nm":"铁道飞虎","pn":199,"preShow":false,"proScore":0,"proScoreNum":0,"pubDate":1483027200000,"pubShowNum":0,"recentShowDate":0,"recentShowNum":0,"rt":"2016-12-30","sc":0,"scm":"铁道抗日寇，有勇更有谋","showNum":0,"showst":1,"snum":1748,"star":"成龙,黄子韬,王凯","ver":"2D","videoId":82132,"videoName":"海外版预告 成龙黄子韬王凯王大陆热血开战","videourl":"http://maoyan.meituan.net/movie/videos/854x48082698ca5cba04996921b592a0457b5e8.mp4","vnum":7,"weight":1,"wish":34440,"wishst":0},{"cat":"爱情,悬疑,犯罪","civilPubSt":0,"comingTitle":"12月30日 周五","desc":"主演:胡歌,宋佳,颜卓灵","dir":"周隼","dur":0,"effectShowNum":0,"globalReleased":false,"headLineShow":false,"headLines":[],"headLinesVO":[],"id":1187526,"img":"http://p0.meituan.net/w.h/movie/d4def49e4f1b238c939334f8915bd8ac829204.png","late":false,"localPubSt":0,"mk":0,"newsHeadlines":[],"nm":"那年夏天你去了哪里","pn":52,"preShow":false,"proScore":0,"proScoreNum":0,"pubDate":1483027200000,"pubShowNum":0,"recentShowDate":0,"recentShowNum":0,"rt":"2016-12-30","sc":0,"scm":"绑架十二年，归家惹事端","showNum":0,"showst":1,"snum":882,"star":"胡歌,宋佳,颜卓灵","ver":"2D","videoId":81980,"videoName":"终极预告片","videourl":"http://maoyan.meituan.net/movie/videos/1146x480783a8d48342b4989bbd089aa4980994d.mp4","vnum":6,"weight":1,"wish":32209,"wishst":0},{"cat":"动画,奇幻,家庭","civilPubSt":0,"comingTitle":"12月31日 周六","desc":"主演:伊莎贝拉·弗尔曼,沙尔托·科普雷,贝拉·索恩","dir":"阿列克谢·特斯蒂斯林","dur":85,"effectShowNum":0,"fra":"英国","frt":"2014-12-11","globalReleased":false,"headLineShow":false,"headLines":[],"headLinesVO":[],"id":246276,"img":"http://p0.meituan.net/w.h/movie/1b5e2752d1f9fddee62a467b1a37d0904690507.jpg","late":false,"localPubSt":0,"mk":0,"newsHeadlines":[],"nm":"冰雪女皇之冬日魔咒","pn":49,"preShow":false,"proScore":0,"proScoreNum":0,"pubDate":1483113600000,"pubShowNum":0,"recentShowDate":0,"recentShowNum":0,"rt":"2016-12-31","sc":0,"scm":"北风使劲吹，公主又悲催","showNum":0,"showst":1,"snum":310,"star":"伊莎贝拉·弗尔曼,沙尔托·科普雷,贝拉·索恩","ver":"2D/3D","videoId":82187,"videoName":"寓言版预告片","videourl":"http://maoyan.meituan.net/movie/videos/854x4805730c96f4dd549d69a480bf25722b861.mp4","vnum":2,"weight":1,"wish":31865,"wishst":0},{"cat":"喜剧,动作,冒险","civilPubSt":0,"comingTitle":"2017年1月28日 周六","desc":"主演:成龙,李治廷,张艺兴","dir":"唐季礼","dur":0,"effectShowNum":0,"globalReleased":false,"headLineShow":false,"headLines":[],"headLinesVO":[],"id":248933,"img":"http://p1.meituan.net/w.h/movie/243a6fb4155161febd1c36d10c9d99f83041992.jpg","late":false,"localPubSt":0,"mk":0,"newsHeadlines":[],"nm":"功夫瑜伽","pn":86,"preShow":false,"proScore":0,"proScoreNum":0,"pubDate":1485532800000,"pubShowNum":0,"recentShowDate":0,"recentShowNum":0,"rt":"2017-01-28","sc":0,"scm":"科学家寻宝，中印来回跑","showNum":0,"showst":1,"snum":390,"star":"成龙,李治廷,张艺兴","ver":"2D/3D/IMAX 3D","videoId":81740,"videoName":"先导预告片","videourl":"http://maoyan.meituan.net/movie/videos/854x480adf53c1b2bed4c2aba68b306ac276258.mp4","vnum":5,"weight":1,"wish":31022,"wishst":0},{"cat":"喜剧,爱情,家庭","civilPubSt":0,"comingTitle":"12月9日 周五","desc":"主演:董洁,张亮,孙茜","dir":"马楚成","dur":97,"effectShowNum":0,"globalReleased":false,"headLineShow":false,"headLines":[],"headLinesVO":[],"id":247913,"img":"http://p0.meituan.net/w.h/movie/c8f8e7c3af8c5792d80c958cca13b61a500299.jpg","late":false,"localPubSt":0,"mk":0,"newsHeadlines":[],"nm":"爸爸的3次婚礼","pn":15,"preShow":false,"proScore":0,"proScoreNum":0,"pubDate":1481212800000,"pubShowNum":0,"recentShowDate":0,"recentShowNum":0,"rt":"2016-12-09","sc":0,"scm":"结了又分手，啥时是个头","showNum":0,"showst":1,"snum":89,"star":"董洁,张亮,孙茜","ver":"2D","videoId":38884,"videoName":"六次别离 拍摄花絮之mike隋孙茜不靠谱组合","videourl":"http://maoyan.meituan.net/movie/videos/f53c7fca22ee4014b12d11520b78c6f6.mp4","vnum":1,"weight":1,"wish":21783,"wishst":0},{"cat":"恐怖,惊悚,悬疑","civilPubSt":0,"comingTitle":"2017年2月1日 周三","desc":"主演:李果,庄森,朱洪振","dir":"戴维","dur":0,"effectShowNum":0,"globalReleased":false,"headLineShow":false,"headLines":[],"headLinesVO":[],"id":346464,"img":"http://p0.meituan.net/w.h/movie/2af851bd4c5103ec8fe6d39e84679a34735139.jpg","late":false,"localPubSt":0,"mk":0,"newsHeadlines":[],"nm":"谜域之噬魂岭","pn":45,"preShow":false,"proScore":0,"proScoreNum":0,"pubDate":1485878400000,"pubShowNum":0,"recentShowDate":0,"recentShowNum":0,"rt":"2017-02-01","sc":0,"scm":"人类之劫数，终极大恐怖","showNum":0,"showst":1,"snum":52,"star":"李果,庄森,朱洪振","ver":"2D","videoId":82169,"videoName":"终极预告片","videourl":"http://maoyan.meituan.net/movie/videos/854x4802e474b175a3946a092c1f2737db693d4.mp4","vnum":2,"weight":1,"wish":18600,"wishst":0},{"cat":"奇幻,喜剧,动作","civilPubSt":0,"comingTitle":"2017年1月 待定","desc":"主演:吴磊,张丰毅,罗佩","dir":"刘镇伟","dur":0,"effectShowNum":0,"globalReleased":false,"headLineShow":false,"headLines":[],"headLinesVO":[],"id":342950,"img":"http://p1.meituan.net/w.h/movie/8b5b76512172a96475964dd6aa878d921529448.jpg","late":false,"localPubSt":0,"mk":0,"newsHeadlines":[],"nm":"大闹东海","pn":30,"preShow":false,"proScore":0,"proScoreNum":0,"pubDate":1485835200000,"pubShowNum":0,"recentShowDate":0,"recentShowNum":0,"sc":0,"scm":"哪吒自认罚，闯祸不求爸","showNum":0,"showst":1,"snum":127,"star":"吴磊,张丰毅,罗佩","time":"2017-01","ver":"2D/3D","videoId":0,"vnum":0,"weight":1,"wish":17989,"wishst":0},{"cat":"喜剧,爱情,奇幻","civilPubSt":0,"comingTitle":"12月31日 周六","desc":"主演:文卓,邹杨,曹曦月","dir":"林云翔,叶茗","dur":0,"effectShowNum":0,"globalReleased":false,"headLineShow":false,"headLines":[],"headLinesVO":[],"id":343742,"img":"http://p0.meituan.net/w.h/movie/7fc86f5f55332fac84fef040c3fe6a6e1040553.jpg","late":false,"localPubSt":0,"mk":0,"newsHeadlines":[],"nm":"人鱼校花","pn":7,"preShow":false,"proScore":0,"proScoreNum":0,"pubDate":1483113600000,"pubShowNum":0,"recentShowDate":0,"recentShowNum":0,"rt":"2016-12-31","sc":0,"scm":"误闯游泳池，人鱼追爱迟","showNum":0,"showst":1,"snum":442,"star":"文卓,邹杨,曹曦月","ver":"2D","videoId":82031,"videoName":"预告片","videourl":"http://maoyan.meituan.net/movie/videos/d64b69c32c9f40739b67d649a4c6a9f2.mp4","vnum":3,"weight":1,"wish":16917,"wishst":0},{"cat":"动作,悬疑,犯罪","civilPubSt":0,"comingTitle":"12月16日 周五","desc":"主演:欧豪,张译,余男","dir":"杨树鹏","dur":0,"effectShowNum":0,"globalReleased":false,"headLineShow":false,"headLines":[],"headLinesVO":[],"id":345919,"img":"http://p1.meituan.net/w.h/movie/5ba826c1b27f04dddbc8278a5933349e883907.png","late":false,"localPubSt":0,"mk":0,"newsHeadlines":[],"nm":"少年","pn":277,"preShow":false,"proScore":0,"proScoreNum":0,"pubDate":1481817600000,"pubShowNum":0,"recentShowDate":0,"recentShowNum":0,"rt":"2016-12-16","sc":0,"scm":"设一个局谋，报十年情仇","showNum":0,"showst":1,"snum":1399,"star":"欧豪,张译,余男","ver":"2D","videoId":81937,"videoName":"\u201c谋定而动\u201d版预告片","videourl":"http://maoyan.meituan.net/movie/videos/854x480108186df79b74a0f919e00660254b092.mp4","vnum":7,"weight":1,"wish":15367,"wishst":0},{"cat":"剧情,战争","civilPubSt":0,"comingTitle":"12月8日 周四","desc":"主演:安德鲁·加菲尔德,雨果·维文,卢克·布雷西","dir":"梅尔·吉布森","dur":139,"effectShowNum":0,"fra":"美国","frt":"2016-11-04","globalReleased":false,"headLineShow":false,"headLines":[],"headLinesVO":[],"id":338349,"img":"http://p1.meituan.net/w.h/movie/9581cfbc221ab927b6c856524e96d319769553.jpg","late":false,"localPubSt":0,"mk":0,"newsHeadlines":[],"nm":"血战钢锯岭","pn":98,"preShow":false,"proScore":7.4,"proScoreNum":8,"pubDate":1481126400000,"pubShowNum":0,"recentShowDate":0,"recentShowNum":0,"rt":"2016-12-08","sc":0,"scm":"士兵有信仰，战场拒拿枪","showInfo":"2016-12-08 下周四上映","showNum":0,"showst":4,"snum":323,"star":"安德鲁·加菲尔德,雨果·维文,卢克·布雷西","ver":"2D/中国巨幕","videoId":82137,"videoName":"\u201c孤胆傲志\u201d预告片","videourl":"http://maoyan.meituan.net/movie/videos/854x480cacd191cf0ef4a37808da1fb590c3bf2.mp4","vnum":17,"weight":1,"wish":15178,"wishst":0},{"cat":"喜剧,悬疑","civilPubSt":0,"comingTitle":"2017年1月1日 周日","desc":"主演:万茜,王自健,周一围","dir":"饶晓志","dur":0,"effectShowNum":0,"globalReleased":false,"headLineShow":false,"headLines":[],"headLinesVO":[],"id":345106,"img":"http://p0.meituan.net/w.h/movie/7a3668c95987d6ea46b85fef7cc9cc2a214742.jpg","late":false,"localPubSt":0,"mk":0,"newsHeadlines":[],"nm":"你好，疯子","pn":120,"preShow":false,"proScore":0,"proScoreNum":0,"pubDate":1483200000000,"pubShowNum":0,"recentShowDate":0,"recentShowNum":0,"rt":"2017-01-01","sc":0,"scm":"醒来吓呆了，混乱一锅粥","showNum":0,"showst":1,"snum":288,"star":"万茜,王自健,周一围","ver":"2D","videoId":82081,"videoName":"快乐治疗版改档预告片","videourl":"http://maoyan.meituan.net/movie/videos/854x4805d9305b0f8ef447d8702fec56e2210d3.mp4","vnum":4,"weight":1,"wish":14817,"wishst":0},{"cat":"喜剧,犯罪,剧情","civilPubSt":0,"comingTitle":"12月9日 周五","desc":"主演:陈小春,邓家佳,汪东城","dir":"森岛","dur":88,"effectShowNum":0,"globalReleased":false,"headLineShow":false,"headLines":[],"headLinesVO":[],"id":248174,"img":"http://p0.meituan.net/w.h/movie/fe1d539e60b209773e3835124c1d03b6381915.jpg","late":false,"localPubSt":0,"mk":0,"newsHeadlines":[],"nm":"呆呆计划","pn":71,"preShow":false,"proScore":0,"proScoreNum":0,"pubDate":1481212800000,"pubShowNum":0,"recentShowDate":0,"recentShowNum":0,"rt":"2016-12-09","sc":0,"scm":"帅哥美女至，爆笑戏中戏","showNum":0,"showst":1,"snum":154,"star":"陈小春,邓家佳,汪东城","ver":"2D","videoId":81758,"videoName":"\u201c迷局\u201d版预告片","videourl":"http://maoyan.meituan.net/movie/videos/854x480323c5f12a7b2437fa24035afef0ed691.mp4","vnum":2,"weight":1,"wish":13925,"wishst":0},{"cat":"剧情,传记,灾难","civilPubSt":0,"comingTitle":"12月9日 周五","desc":"主演:汤姆·汉克斯,艾伦·艾克哈特,劳拉·琳妮","dir":"克林特·伊斯特伍德","dur":96,"effectShowNum":0,"fra":"美国,韩国","frt":"2016-09-09,2016-09-28","globalReleased":false,"headLineShow":false,"headLines":[],"headLinesVO":[],"id":342003,"img":"http://p0.meituan.net/w.h/movie/470b3d85956f801fdcdeaa1d1c1a5c84234487.jpg","late":false,"localPubSt":0,"mk":0,"newsHeadlines":[],"nm":"萨利机长","pn":78,"preShow":false,"proScore":0,"proScoreNum":6,"pubDate":1481212800000,"pubShowNum":0,"recentShowDate":0,"recentShowNum":0,"rt":"2016-12-09","sc":0,"scm":"飞机遇意外，机长险被害","showInfo":"2016-12-09 下周五上映","showNum":0,"showst":4,"snum":206,"star":"汤姆·汉克斯,艾伦·艾克哈特,劳拉·琳妮","ver":"2D/IMAX 2D/中国巨幕","videoId":82219,"videoName":"《萨利机长》发布口碑版预告片","videourl":"http://maoyan.meituan.net/movie/videos/854x480eb62a7790eac470e97af7c2096be8e03.mp4","vnum":15,"weight":1,"wish":13737,"wishst":0},{"cat":"剧情,惊悚,悬疑","civilPubSt":0,"comingTitle":"2017年2月24日 周五","desc":"主演:辉灿,何乙轩,刘汉兆","dir":"王俊潾","dur":0,"effectShowNum":0,"globalReleased":false,"headLineShow":false,"headLines":[],"headLinesVO":[],"id":344199,"img":"http://p1.meituan.net/w.h/movie/8350b8bcdc3446806f1baa8f404d4d6a806252.jpg","late":false,"localPubSt":0,"mk":0,"newsHeadlines":[],"nm":"惊魂绣花鞋","pn":11,"preShow":false,"proScore":0,"proScoreNum":0,"pubDate":1487865600000,"pubShowNum":0,"recentShowDate":0,"recentShowNum":0,"rt":"2017-02-24","sc":0,"scm":"带病回古宅，梦魇绣花鞋","showNum":0,"showst":1,"snum":36,"star":"辉灿,何乙轩,刘汉兆","ver":"2D","videoId":81683,"videoName":"先导预告片","videourl":"http://maoyan.meituan.net/movie/videos/854x48062bcf5bb44534be6b6ceed869490ece4.mp4","vnum":1,"weight":1,"wish":13291,"wishst":0},{"cat":"喜剧,动作","civilPubSt":0,"comingTitle":"2017年2月10日 周五","desc":"主演:贾乃亮,马丽,梁超","dir":"郭大雷","dur":0,"effectShowNum":0,"globalReleased":false,"headLineShow":false,"headLines":[],"headLinesVO":[],"id":344032,"img":"http://p0.meituan.net/w.h/movie/deaa2df9721b7b13a45a118fddcbb1932241880.jpg","late":false,"localPubSt":0,"mk":0,"newsHeadlines":[],"nm":"东北往事之破马张飞","pn":45,"preShow":false,"proScore":0,"proScoreNum":0,"pubDate":1486656000000,"pubShowNum":0,"recentShowDate":0,"recentShowNum":0,"rt":"2017-02-10","sc":0,"scm":"东北小混混，斗黑帮恶棍","showNum":0,"showst":1,"snum":101,"star":"贾乃亮,马丽,梁超","ver":"2D","videoId":81580,"videoName":"定档预告 贾乃亮马丽带你笑出马贾线","videourl":"http://maoyan.meituan.net/movie/videos/854x4806c04751780ce48e9a0587d608bcab965.mp4","vnum":3,"weight":1,"wish":13273,"wishst":0},{"cat":"喜剧,爱情","civilPubSt":0,"comingTitle":"12月9日 周五","desc":"主演:丹尼斯·吴,唐婧,乔杉","dir":"罗登","dur":94,"effectShowNum":0,"globalReleased":false,"headLineShow":false,"headLines":[],"headLinesVO":[],"id":1196825,"img":"http://p0.meituan.net/w.h/movie/7afb384ce4e432b816984cb60107b7c297377.jpg","late":false,"localPubSt":0,"mk":0,"newsHeadlines":[],"nm":"爱上试睡师","pn":40,"preShow":false,"proScore":0,"proScoreNum":0,"pubDate":1481212800000,"pubShowNum":0,"recentShowDate":0,"recentShowNum":0,"rt":"2016-12-09","sc":0,"scm":"失眠试睡师，爱情来医治","showNum":0,"showst":1,"snum":470,"star":"丹尼斯·吴,唐婧,乔杉","ver":"2D","videoId":82016,"videoName":"\u201c笑弹\u201d预告片","videourl":"http://maoyan.meituan.net/movie/videos/1130x48063482e46cf1c4aa683ddbc0feec48f22.mp4","vnum":4,"weight":1,"wish":13287,"wishst":0},{"cat":"恐怖,惊悚,悬疑","civilPubSt":0,"comingTitle":"2017年1月6日 周五","desc":"主演:殷果儿,姜星丘,任青安","dir":"陆诗雷","dur":0,"effectShowNum":0,"globalReleased":false,"headLineShow":false,"headLines":[],"headLinesVO":[],"id":343253,"img":"http://p0.meituan.net/w.h/movie/97aea9a6993380fa5b85a6640a8d0797851860.jpg","late":false,"localPubSt":0,"mk":0,"newsHeadlines":[],"nm":"恐怖理发店","pn":5,"preShow":false,"proScore":0,"proScoreNum":0,"pubDate":1483632000000,"pubShowNum":0,"recentShowDate":0,"recentShowNum":0,"rt":"2017-01-06","sc":0,"scm":"骷髅理发师，猛鬼追命时","showNum":0,"showst":1,"snum":117,"star":"殷果儿,姜星丘,任青安","ver":"2D","videoId":81761,"videoName":"正式预告片","videourl":"http://maoyan.meituan.net/movie/videos/854x480deec0ff42f8340ef883dedf5061a0a2a.mp4","vnum":1,"weight":1,"wish":11930,"wishst":0},{"cat":"动作,悬疑,冒险","civilPubSt":0,"comingTitle":"12月9日 周五","desc":"主演:让·雷诺,卡特琳娜·莫里诺,蒂埃里·钮维","dir":"本杰明·罗切尔","dur":94,"effectShowNum":0,"fra":"法国","frt":"2015-08-19","globalReleased":false,"headLineShow":false,"headLines":[],"headLinesVO":[],"id":342234,"img":"http://p1.meituan.net/w.h/movie/45c9d3827353f506212555ea6f44c0e139635.jpg","late":false,"localPubSt":0,"mk":0,"newsHeadlines":[],"nm":"反黑行动组","pn":44,"preShow":false,"proScore":0,"proScoreNum":0,"pubDate":1481212800000,"pubShowNum":0,"recentShowDate":0,"recentShowNum":0,"rt":"2016-12-09","sc":0,"scm":"杀手变警探，破案不一般","showNum":0,"showst":1,"snum":120,"star":"让·雷诺,卡特琳娜·莫里诺,蒂埃里·钮维","ver":"2D","videoId":82180,"videoName":"\u201c破天阴谋\u201d版预告片","videourl":"http://maoyan.meituan.net/movie/videos/854x4800535f5e7272a482d8aef54513740609c.mp4","vnum":2,"weight":1,"wish":10377,"wishst":0},{"cat":"喜剧,爱情,动作","civilPubSt":0,"comingTitle":"2017年1月 待定","desc":"主演:黄圣依,胡夏,王惜今","dir":"陈伟强,王惜今","dur":100,"effectShowNum":0,"globalReleased":false,"headLineShow":false,"headLines":[],"headLinesVO":[],"id":341370,"img":"http://p0.meituan.net/w.h/movie/4fea0a747b3afbc659010b9691fc80fe953099.jpg","late":false,"localPubSt":0,"mk":0,"newsHeadlines":[],"nm":"活宝","pn":177,"preShow":false,"proScore":0,"proScoreNum":0,"pubDate":1485835200000,"pubShowNum":0,"recentShowDate":0,"recentShowNum":0,"sc":0,"scm":"活宝二人组，探案傻乎乎","showNum":0,"showst":1,"snum":245,"star":"黄圣依,胡夏,王惜今","time":"2017-01","ver":"2D","videoId":46509,"videoName":"首款预告片","videourl":"http://maoyan.meituan.net/movie/videos/744108c402a54cefb6cc1da6cfba3e85.mp4","vnum":1,"weight":1,"wish":9226,"wishst":0},{"cat":"纪录片","civilPubSt":0,"comingTitle":"12月16日 周五","desc":"主演:王津,亓昊楠,屈峰","dir":"萧寒","dur":0,"effectShowNum":0,"globalReleased":false,"headLineShow":false,"headLines":[],"headLinesVO":[],"id":1196913,"img":"http://p0.meituan.net/w.h/movie/8c4e2707c513bfc598d3111463572e52160440.jpg","late":false,"localPubSt":0,"mk":0,"newsHeadlines":[],"nm":"我在故宫修文物","pn":49,"preShow":false,"proScore":0,"proScoreNum":0,"pubDate":1481817600000,"pubShowNum":0,"recentShowDate":0,"recentShowNum":0,"rt":"2016-12-16","sc":0,"scm":"铸器以匠心，修身博古今","showNum":0,"showst":1,"snum":178,"star":"王津,亓昊楠,屈峰","ver":"2D","videoId":81750,"videoName":"燃到大屏幕宣传片","videourl":"http://maoyan.meituan.net/movie/videos/bdbc5232f62d4c2d85b3b7a983d0722e.mp4","vnum":3,"weight":1,"wish":8723,"wishst":0},{"cat":"动画,冒险","civilPubSt":0,"comingTitle":"2017年1月13日 周五","desc":"主演:林美秀,曾允凡,孙国卿","dir":"张苑,王龙波,陆锦辉,陆锦明","dur":84,"effectShowNum":0,"globalReleased":false,"headLineShow":false,"headLines":[],"headLinesVO":[],"id":342584,"img":"http://p0.meituan.net/w.h/movie/0ec2864bf55146acabb2e8b146684508739799.png","late":false,"localPubSt":0,"mk":0,"newsHeadlines":[],"nm":"逗逗迪迪之美梦年年","pn":17,"preShow":false,"proScore":0,"proScoreNum":0,"pubDate":1484236800000,"pubShowNum":0,"recentShowDate":0,"recentShowNum":0,"rt":"2017-01-13","sc":0,"scm":"噩梦从天降，兄妹寻真相","showNum":0,"showst":1,"snum":185,"star":"林美秀,曾允凡,孙国卿","ver":"2D","videoId":21245,"videoName":"先行版预告片","videourl":"http://maoyan.meituan.net/movie/videos/8a60ef8dd190407f86d7a1a2a776f3ea.mp4","vnum":1,"weight":1,"wish":6181,"wishst":0},{"cat":"剧情","civilPubSt":0,"comingTitle":"2016年 待定","desc":"主演:黄远,王大陆,赖雅妍","dir":"洪昇扬","dur":0,"effectShowNum":0,"fra":"中国台湾","frt":"2016-10-07","globalReleased":false,"headLineShow":false,"headLines":[],"headLinesVO":[],"id":344751,"img":"http://p0.meituan.net/w.h/movie/a8721482c236affc34c775556c35bf09245088.jpg","late":false,"localPubSt":0,"mk":0,"newsHeadlines":[],"nm":"一万公里的约定","pn":66,"preShow":false,"proScore":0,"proScoreNum":0,"pubDate":1483196400000,"pubShowNum":0,"recentShowDate":0,"recentShowNum":0,"sc":0,"scm":"徒步一万里，证明我爱你","showNum":0,"showst":1,"snum":37,"star":"黄远,王大陆,赖雅妍","time":"2016","ver":"2D","videoId":46366,"videoName":"先导预告片","videourl":"http://maoyan.meituan.net/movie/videos/854x4803934806981fd4df9ae24aca31e0472aa.mp4","vnum":1,"weight":1,"wish":5492,"wishst":0}]
         * hot : []
         * paging : {"hasMore":true,"limit":30,"offset":0,"total":70}
         * stid : 110189035512576
         */

        private PagingBean paging;
        private String stid;
        private List<ComingBean> coming;
        private List<?> hot;

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

        public PagingBean getPaging() {
            return paging;
        }

        public void setPaging(PagingBean paging) {
            this.paging = paging;
        }

        public String getStid() {
            return stid;
        }

        public void setStid(String stid) {
            this.stid = stid;
        }

        public List<ComingBean> getComing() {
            return coming;
        }

        public void setComing(List<ComingBean> coming) {
            this.coming = coming;
        }

        public List<?> getHot() {
            return hot;
        }

        public void setHot(List<?> hot) {
            this.hot = hot;
        }

        public static class PagingBean {
            /**
             * hasMore : true
             * limit : 30
             * offset : 0
             * total : 70
             */

            private boolean hasMore;
            private int limit;
            private int offset;
            private int total;

            public static PagingBean objectFromData(String str) {

                return new Gson().fromJson(str, PagingBean.class);
            }

            public static PagingBean objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(str), PagingBean.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public static List<PagingBean> arrayPagingBeanFromData(String str) {

                Type listType = new TypeToken<ArrayList<PagingBean>>() {
                }.getType();

                return new Gson().fromJson(str, listType);
            }

            public static List<PagingBean> arrayPagingBeanFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);
                    Type listType = new TypeToken<ArrayList<PagingBean>>() {
                    }.getType();

                    return new Gson().fromJson(jsonObject.getString(str), listType);

                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return new ArrayList();


            }

            public boolean isHasMore() {
                return hasMore;
            }

            public void setHasMore(boolean hasMore) {
                this.hasMore = hasMore;
            }

            public int getLimit() {
                return limit;
            }

            public void setLimit(int limit) {
                this.limit = limit;
            }

            public int getOffset() {
                return offset;
            }

            public void setOffset(int offset) {
                this.offset = offset;
            }

            public int getTotal() {
                return total;
            }

            public void setTotal(int total) {
                this.total = total;
            }
        }

        public static class ComingBean {
            /**
             * cat : 剧情,冒险,奇幻
             * civilPubSt : 0
             * comingTitle : 12月16日 周五
             * desc : 主演:马特·达蒙,景甜,佩德罗·帕斯卡
             * dir : 张艺谋
             * dur : 104
             * effectShowNum : 0
             * fra : 美国,瑞典,荷兰,德国,英国
             * frt : 2017-02-17,2016-09-30,2016-11-24,2016-12-22,2017-01-06
             * globalReleased : false
             * headLineShow : false
             * headLines : []
             * headLinesVO : []
             * id : 246267
             * img : http://p0.meituan.net/w.h/movie/e4a3447ebe8c44eea59ab7f68790c7e2179321.jpeg
             * late : false
             * localPubSt : 0
             * mk : 0
             * newsHeadlines : []
             * nm : 长城
             * pn : 98
             * preShow : false
             * proScore : 0
             * proScoreNum : 0
             * pubDate : 1481817600000
             * pubShowNum : 0
             * recentShowDate : 0
             * recentShowNum : 0
             * rt : 2016-12-16
             * sc : 0
             * scm : 五军战饕餮，中国魂不灭
             * showNum : 0
             * showst : 1
             * snum : 4488
             * star : 马特·达蒙,景甜,佩德罗·帕斯卡
             * ver : 2D/3D
             * videoId : 82214
             * videoName : 电影《长城》三巨星特辑 呆萌这次又要被救了
             * videourl : http://maoyan.meituan.net/movie/videos/854x480528115c49e544c14a057cef704a5d187.mp4
             * vnum : 14
             * weight : 1
             * wish : 182149
             * wishst : 0
             * showInfo : 今天7家影院放映10场
             * time : 2017-01
             */

            private String cat;
            private int civilPubSt;
            private String comingTitle;
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
            private boolean preShow;
            private double proScore;
            private int proScoreNum;
            private long pubDate;
            private int pubShowNum;
            private int recentShowDate;
            private int recentShowNum;
            private String rt;
            private double sc;
            private String scm;
            private int showNum;
            private int showst;
            private int snum;
            private String star;
            private String ver;
            private int videoId;
            private String videoName;
            private String videourl;
            private int vnum;
            private int weight;
            private int wish;
            private int wishst;
            private String showInfo;
            private String time;
            private List<?> headLines;
            private List<HeadLinesVOBean> headLinesVO;
            private List<?> newsHeadlines;

            public static ComingBean objectFromData(String str) {

                return new Gson().fromJson(str, ComingBean.class);
            }

            public static ComingBean objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(str), ComingBean.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public static List<ComingBean> arrayComingBeanFromData(String str) {

                Type listType = new TypeToken<ArrayList<ComingBean>>() {
                }.getType();

                return new Gson().fromJson(str, listType);
            }

            public static List<ComingBean> arrayComingBeanFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);
                    Type listType = new TypeToken<ArrayList<ComingBean>>() {
                    }.getType();

                    return new Gson().fromJson(jsonObject.getString(str), listType);

                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return new ArrayList();


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

            public String getComingTitle() {
                return comingTitle;
            }

            public void setComingTitle(String comingTitle) {
                this.comingTitle = comingTitle;
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

            public int getRecentShowDate() {
                return recentShowDate;
            }

            public void setRecentShowDate(int recentShowDate) {
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

            public int getShowNum() {
                return showNum;
            }

            public void setShowNum(int showNum) {
                this.showNum = showNum;
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

            public String getShowInfo() {
                return showInfo;
            }

            public void setShowInfo(String showInfo) {
                this.showInfo = showInfo;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
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

            public List<?> getNewsHeadlines() {
                return newsHeadlines;
            }

            public void setNewsHeadlines(List<?> newsHeadlines) {
                this.newsHeadlines = newsHeadlines;
            }

            public static class HeadLinesVOBean {
                /**
                 * movieId : 344881
                 * title : 圣地巡礼：美哭的每一帧都有现实取景地
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
        }
    }
}
