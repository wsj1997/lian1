package com.example.thinkpad.wsj185281601s;

import java.util.List;

public class Bean {

    /**
     * date : 20180528
     * stories : [{"images":["https://pic2.zhimg.com/v2-db5965efebcb51fe2388bdb6fc8c2951.jpg"],"type":0,"id":9684282,"ga_prefix":"052810","title":"「大家都是朋友，问你几个法律问题，还要收费？」"},{"images":["https://pic4.zhimg.com/v2-a654832937cb6b9c503588d0f8187293.jpg"],"type":0,"id":9683772,"ga_prefix":"052809","title":"刚开始健身的新人如何选择健身房？这里有 4 点建议"},{"images":["https://pic3.zhimg.com/v2-9c92d541c358eb50080cf53020827472.jpg"],"type":0,"id":9684043,"ga_prefix":"052808","title":"在世界上最危险的生物实验室工作，是一种怎样的体验？"},{"images":["https://pic3.zhimg.com/v2-cd06c2d9ae8acb4d5f01001821cdcd2e.jpg"],"type":0,"id":9683422,"ga_prefix":"052807","title":"原来拍个电影电视剧这么不容易\u2026\u2026看得我都闹心了"},{"images":["https://pic3.zhimg.com/v2-662bba75ee58696c102f04a76a9a44e2.jpg"],"type":0,"id":9684105,"ga_prefix":"052807","title":"老师，学了这么久，我怎么还是搞不懂这栋房子美在哪里？"},{"images":["https://pic2.zhimg.com/v2-84d410961f1ba6a2b552ec581778b5f1.jpg"],"type":0,"id":9684345,"ga_prefix":"052806","title":"瞎扯 · 如何正确地吐槽"}]
     * top_stories : [{"image":"https://pic1.zhimg.com/v2-97cbff4805a8e770897c3ae589cb9100.jpg","type":0,"id":9684355,"ga_prefix":"052714","title":"本周热门精选 · 许多种惊奇"},{"image":"https://pic1.zhimg.com/v2-cf928e2be388d55b0aba172eec21d418.jpg","type":0,"id":9684105,"ga_prefix":"052807","title":"老师，学了这么久，我怎么还是搞不懂这栋房子美在哪里？"},{"image":"https://pic3.zhimg.com/v2-42ed3669407648c5c502cf60ea46433e.jpg","type":0,"id":9684043,"ga_prefix":"052808","title":"在世界上最危险的生物实验室工作，是一种怎样的体验？"},{"image":"https://pic4.zhimg.com/v2-b66800ef21a89d0b4e575a16dfea7353.jpg","type":0,"id":9683772,"ga_prefix":"052809","title":"刚开始健身的新人如何选择健身房？这里有 4 点建议"},{"image":"https://pic4.zhimg.com/v2-43e6f5cf0fb1052fe71119d5023bde2b.jpg","type":0,"id":9683422,"ga_prefix":"052807","title":"原来拍个电影电视剧这么不容易\u2026\u2026看得我都闹心了"}]
     */

    private String date;
    private List<StoriesBean> stories;
    private List<TopStoriesBean> top_stories;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<StoriesBean> getStories() {
        return stories;
    }

    public void setStories(List<StoriesBean> stories) {
        this.stories = stories;
    }

    public List<TopStoriesBean> getTop_stories() {
        return top_stories;
    }

    public void setTop_stories(List<TopStoriesBean> top_stories) {
        this.top_stories = top_stories;
    }

    public static class StoriesBean {
        /**
         * images : ["https://pic2.zhimg.com/v2-db5965efebcb51fe2388bdb6fc8c2951.jpg"]
         * type : 0
         * id : 9684282
         * ga_prefix : 052810
         * title : 「大家都是朋友，问你几个法律问题，还要收费？」
         */

        private int type;
        private int id;
        private String ga_prefix;
        private String title;
        private List<String> images;

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getGa_prefix() {
            return ga_prefix;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }
    }

    public static class TopStoriesBean {
        /**
         * image : https://pic1.zhimg.com/v2-97cbff4805a8e770897c3ae589cb9100.jpg
         * type : 0
         * id : 9684355
         * ga_prefix : 052714
         * title : 本周热门精选 · 许多种惊奇
         */

        private String image;
        private int type;
        private int id;
        private String ga_prefix;
        private String title;

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getGa_prefix() {
            return ga_prefix;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
}
