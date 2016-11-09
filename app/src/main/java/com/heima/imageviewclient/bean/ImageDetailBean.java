package com.heima.imageviewclient.bean;

import java.util.List;

/*
 *  @项目名：  ImageViewClient 
 *  @包名：    com.heima.imageviewclient.bean
 *  @文件名:   ImageDetailBean
 *  @创建者:   hele
 *  @创建时间:  2016/11/9 20:16
 *  @描述：    TODO
 */
public class ImageDetailBean {
    private static final String TAG = "ImageDetailBean";


    /**
     * status : true
     * tngou : [{"count":603,"fcount":0,"galleryclass":1,"id":1003,"img":"/ext/161106/c3f698ff5d050d2402d5333df61d2c43.jpg","rcount":0,"size":16,"time":1478429454000,"title":"大胸美女容容容Alice蕾丝美腿"},{"count":194,"fcount":0,"galleryclass":1,"id":1001,"img":"/ext/161106/627aa240e06fddb6bc432e0abb48926d.jpg","rcount":0,"size":15,"time":1478429301000,"title":"极品长腿丝袜美女制服大胆性感"},{"count":499,"fcount":0,"galleryclass":1,"id":998,"img":"/ext/161104/2ca454c95af9f781626cabdb83354367.jpg","rcount":0,"size":9,"time":1478259771000,"title":"透视装美女风姿绰约性感惹火的写真"},{"count":783,"fcount":0,"galleryclass":1,"id":996,"img":"/ext/161031/02b5547ab0f10831a4cec27995b3d793.jpg","rcount":0,"size":9,"time":1477919443000,"title":"都市极品巨乳女神李妍静私房妩媚动人性感"},{"count":1018,"fcount":0,"galleryclass":1,"id":993,"img":"/ext/161027/5b2b08f2e757d3de84fb4c1fa8e92f23.jpg","rcount":0,"size":6,"time":1477575688000,"title":"极品大胸美女腿模连体泳装大白腿美胸爆乳性感"},{"count":1230,"fcount":0,"galleryclass":1,"id":982,"img":"/ext/161019/252fbe0474b0e9f45eb9ed738f661495.jpg","rcount":0,"size":9,"time":1476877380000,"title":"韩国美女模特黑色蕾丝曼妙性感写真图片"},{"count":1448,"fcount":0,"galleryclass":1,"id":972,"img":"/ext/161012/291dfdac42dbb0335ddf98fdceb52e13.jpg","rcount":0,"size":11,"time":1476282427000,"title":"性感气质美女白皙美腿肉丝翘臀"},{"count":1715,"fcount":0,"galleryclass":1,"id":970,"img":"/ext/161011/422dd5cc3feec0ad15e13fd5ed312fac.jpg","rcount":0,"size":9,"time":1476194340000,"title":"知性美女爆乳双峰极品包臀裙"},{"count":1273,"fcount":0,"galleryclass":1,"id":963,"img":"/ext/161008/a1056dbbe883a636391b386a438313d9.jpg","rcount":0,"size":20,"time":1475926166000,"title":"OL美女孙允珠性感吊带开叉红裙"},{"count":1620,"fcount":0,"galleryclass":1,"id":959,"img":"/ext/161005/d70a3a2490bb2e84bba61051dcb2684b.jpg","rcount":0,"size":7,"time":1475659542000,"title":"清秀长发美女户外性感露背吊带裙妩媚性感写真"},{"count":819,"fcount":0,"galleryclass":1,"id":956,"img":"/ext/160929/78d6d592b9c18552c182b3cccb1c0b3c.jpg","rcount":0,"size":31,"time":1475151452000,"title":"职业白领孙允珠流苏叉腿连衣裙性感"},{"count":809,"fcount":0,"galleryclass":1,"id":954,"img":"/ext/160928/0372444674e18bfc99dec2bba8e24f00.jpg","rcount":0,"size":9,"time":1475061163000,"title":"宅男女神紧致魅惑身姿性感酒店写真"},{"count":2168,"fcount":0,"galleryclass":1,"id":946,"img":"/ext/160921/eeb634135dcfc854ce3ae2bd1b36e2ce.jpg","rcount":0,"size":10,"time":1474425208000,"title":"性感大胸美女白领林正允巨乳性感诱人气质卷发美女图片"},{"count":5004,"fcount":0,"galleryclass":1,"id":937,"img":"/ext/160902/4710af037ca4f1e00c42e2b65a1fbaee.jpg","rcount":0,"size":7,"time":1472815816000,"title":"性感嫩模吊带裙酥胸抢眼撩人"},{"count":4051,"fcount":0,"galleryclass":1,"id":932,"img":"/ext/160830/4caa1b28d02bd8984619efa227258a64.jpg","rcount":0,"size":9,"time":1472559595000,"title":"开叉长裙美女性感沙发撩人艺术"},{"count":2296,"fcount":0,"galleryclass":1,"id":930,"img":"/ext/160829/945c1333a6675039480d0f137e8ebad9.jpg","rcount":0,"size":9,"time":1472472569000,"title":"气质美女丝绸吊带连衣裙性感写真"},{"count":2771,"fcount":0,"galleryclass":1,"id":925,"img":"/ext/160825/92a547eb62f72a3bf01f24a958f23d58.jpg","rcount":0,"size":6,"time":1472136035000,"title":"性感大胸美女车模酥胸喷血诱人背心裙迷人"},{"count":4473,"fcount":0,"galleryclass":1,"id":913,"img":"/ext/160818/fb81d940f669925ae13638aaaeb61886.jpg","rcount":0,"size":9,"time":1471517940000,"title":"大胸美女斯戴媛闺房性感"},{"count":3232,"fcount":0,"galleryclass":1,"id":911,"img":"/ext/160818/653d7ac7faf37d07b071a992404ee276.jpg","rcount":0,"size":14,"time":1471517784000,"title":"台湾腿模alice比基尼漂亮长腿美女"},{"count":1853,"fcount":0,"galleryclass":1,"id":906,"img":"/ext/160816/77782b774fb240349d89f4afb32ff327.jpg","rcount":0,"size":9,"time":1471352945000,"title":"超长美腿的皮质紧身裙性感私拍美女"}]
     * total : 300
     */

    private boolean status;
    private int total;
    /**
     * count : 603
     * fcount : 0
     * galleryclass : 1
     * id : 1003
     * img : /ext/161106/c3f698ff5d050d2402d5333df61d2c43.jpg
     * rcount : 0
     * size : 16
     * time : 1478429454000
     * title : 大胸美女容容容Alice蕾丝美腿
     */

    private List<TngouBean> tngou;

    public boolean isStatus() { return status;}

    public void setStatus(boolean status) { this.status = status;}

    public int getTotal() { return total;}

    public void setTotal(int total) { this.total = total;}

    public List<TngouBean> getTngou() { return tngou;}

    public void setTngou(List<TngouBean> tngou) { this.tngou = tngou;}

    public static class TngouBean {
        private int    count;
        private int    fcount;
        private int    galleryclass;
        private int    id;
        private String img;
        private int    rcount;
        private int    size;
        private long   time;
        private String title;

        public int getCount() { return count;}

        public void setCount(int count) { this.count = count;}

        public int getFcount() { return fcount;}

        public void setFcount(int fcount) { this.fcount = fcount;}

        public int getGalleryclass() { return galleryclass;}

        public void setGalleryclass(int galleryclass) { this.galleryclass = galleryclass;}

        public int getId() { return id;}

        public void setId(int id) { this.id = id;}

        public String getImg() { return img;}

        public void setImg(String img) { this.img = img;}

        public int getRcount() { return rcount;}

        public void setRcount(int rcount) { this.rcount = rcount;}

        public int getSize() { return size;}

        public void setSize(int size) { this.size = size;}

        public long getTime() { return time;}

        public void setTime(long time) { this.time = time;}

        public String getTitle() { return title;}

        public void setTitle(String title) { this.title = title;}
    }
}
