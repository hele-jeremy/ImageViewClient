package com.heima.imageviewclient;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.android.volley.AuthFailureError;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.heima.imageviewclient.adapter.CateGroryAdapter;
import com.heima.imageviewclient.bean.CategoryBean;

import java.util.List;
import java.util.Map;

public class MainActivity
        extends AppCompatActivity
        implements AdapterView.OnItemClickListener
{

    private static final String TAG = "MainActivity";
    private ListView                     mListview;
    private List<CategoryBean.TngouBean> mTngouList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initData();
        initListener();
    }

    private void initView() {
        mListview = (ListView) findViewById(R.id.listview);
    }


    private void initData() {
        //使用Volley执行网络请求
        //创建url网络请求地址
        String url = "http://www.tngou.net/tnfs/api/classify";
        //1.创建请求队列
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        //2.构建请求,获取json字符串数据,使用StringRequest
        StringRequest request = new StringRequest(url, new Response.Listener<String>() {

            //请求成功响应时候调用
            @Override
            public void onResponse(String response) {
                Log.d(TAG, "onResponse: " + response);
                //将json字符串解析成我们的java bean
                Gson         gson         = new Gson();
                CategoryBean categoryBean = gson.fromJson(response, CategoryBean.class);
                mTngouList = categoryBean.getTngou();
                CateGroryAdapter adapter = new CateGroryAdapter(MainActivity.this, mTngouList);

                //设置数据适配器
                mListview.setAdapter(adapter);

            }
        }, new Response.ErrorListener() {

            //请求失败时调用
            @Override
            public void onErrorResponse(VolleyError error) {
                //                Log.d(TAG, "onErrorResponse: " + error.toString());
                error.printStackTrace();
            }
        })
        {
            @Override
            public Map<String, String> getHeaders()
                    throws AuthFailureError
            {
                //添加请求头验证信息
                //                Map<String,String> map = new HashMap<>();
                //                map.put("apikey","")
                return super.getHeaders();
            }
        };

        //3.将我们的请求对象添加到请求队列里
        requestQueue.add(request);
    }

    private void initListener() {
        //对ListView设置条目点击事件
        mListview.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        //点击条目跳转到指定的页面

        Intent intent = new Intent(this, ImageDedailActivity.class);
        //点击对应的条目将对应的图片的分类id传递给对应的界面
        intent.putExtra(getPackageName() + ":id",
                        mTngouList.get(position)
                                  .getId());
        startActivity(intent);
    }
}
