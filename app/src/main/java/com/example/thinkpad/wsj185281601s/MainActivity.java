package com.example.thinkpad.wsj185281601s;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.google.gson.Gson;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mrv;
    private String url="https://news-at.zhihu.com/api/4/news/latest";
    private MyAdapter md;
    private OKHttp http;
    private ArrayList<Bean.StoriesBean> mlist=new ArrayList<>();
    public Handler hand=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what==1){
                Gson gson=new Gson();
                Bean bean = gson.fromJson(msg.obj.toString(), Bean.class);
                // mlist=(ArrayList<NewsData.DataBean>) newsData.getData();
                mlist=(ArrayList<Bean.StoriesBean>) bean.getStories();
                md.setdata((ArrayList<Bean.StoriesBean>) mlist);
                md.notifyDataSetChanged();

            }
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mrv=(RecyclerView)findViewById(R.id.recy);
        initdata();
        mrv.setLayoutManager(new LinearLayoutManager(this));
        md=new MyAdapter(this,mlist);
        mrv.setAdapter(md);

        //RecyclerView条目的点击事件
        md.setOnItemClickListener(new MyAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int postion) {
                Toast.makeText(MainActivity.this, mlist.get(postion).getTitle(), Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void initdata() {
        OKHttp http=new OKHttp();
        http.getdata(url, this);
    }
    public void callback(String str) {
        Message msg = Message.obtain();
        msg.what=1;
        msg.obj=str;
        hand.sendMessage(msg);

    }
    public void err(int code, String s) {

    }
}