package com.heima.imageviewclient.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.heima.imageviewclient.bean.CategoryBean;

import java.util.List;

/*
 *  @项目名：  ImageViewClient 
 *  @包名：    com.heima.imageviewclient.adapter
 *  @文件名:   CateGroryAdapter
 *  @创建者:   hele
 *  @创建时间:  2016/11/9 19:38
 *  @描述：    TODO
 */
public class CateGroryAdapter extends BaseAdapter{
    private static final String TAG = "CateGroryAdapter";

    private Context                      mContext;
    private List<CategoryBean.TngouBean> mList;

    public CateGroryAdapter(Context context, List<CategoryBean.TngouBean> list) {
        mContext = context;
        mList = list;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = View.inflate(mContext,android.R.layout.simple_list_item_1,null);
        }

        TextView tv = (TextView) convertView;

        tv.setText(mList.get(position).getDescription());

        return convertView;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


}
