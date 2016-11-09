package com.heima.imageviewclient;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.heima.imageviewclient.adapter.ImageDetailAdapter;
import com.heima.imageviewclient.bean.ImageDetailBean;

public class ImageDedailActivity
        extends AppCompatActivity
{

    private static final String TAG = "ImageDedailActivity";
    private ListView        mListView;
    private ImageDetailBean mTngouBeanList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_dedail);

        initView();
            initData();
    }

    private void initView() {
        mListView = (ListView) findViewById(R.id.listview);
    }

    private void initData() {
        //获取启动该界面的意图
        Intent intent = getIntent();
        //获取传递过来的id号
        int id = intent.getIntExtra(getPackageName() + ":id", 1);
        //进行url的组拼  	http://www.tngou.net/tnfs/api/list?id=1
        String url = "http://www.tngou.net/tnfs/api/list?id=" + id;

        //根据id号再去请求我们的对应的id号对应的数据
        //1.创建请求队列
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        //2.创建请求json字符串数据的对象
        StringRequest stringRequest = new StringRequest(url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Log.d(TAG, "onResponse: " + response);
                Gson gson = new Gson();
                mTngouBeanList = gson.fromJson(response, ImageDetailBean.class);
                ImageDetailAdapter adapter = new ImageDetailAdapter(ImageDedailActivity.this,
                                                                    mTngouBeanList.getTngou());

                mListView.setAdapter(adapter);

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d(TAG, "onErrorResponse: " + error.toString());
                error.printStackTrace();
            }
        });

        //将请求对象添加到我们的请求队列中
        requestQueue.add(stringRequest);
    }

}
