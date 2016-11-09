package com.heima.imageviewclient.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.heima.imageviewclient.R;
import com.heima.imageviewclient.bean.ImageDetailBean;
import com.squareup.picasso.Picasso;

import java.util.List;

/*
 *  @项目名：  ImageViewClient 
 *  @包名：    com.heima.imageviewclient.adapter
 *  @文件名:   ImageDetailAdapter
 *  @创建者:   hele
 *  @创建时间:  2016/11/9 19:58
 *  @描述：    TODO
 */
public class ImageDetailAdapter extends BaseAdapter {
    private static final String TAG = "ImageDetailAdapter";

    private Context                         mContext;
    private List<ImageDetailBean.TngouBean> mTngouBeanList;
    private final LayoutInflater            mInflater;

    public ImageDetailAdapter(Context context, List<ImageDetailBean.TngouBean> tngouBeanList) {
        mContext = context;
        mTngouBeanList = tngouBeanList;
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return mTngouBeanList.size();
    }

    private static class ViewHolder{
        TextView mTvDesc;
        ImageView mIv;

        public ViewHolder(View root) {
            mTvDesc = (TextView) root.findViewById(R.id.tv_desc);
            mIv = (ImageView) root.findViewById(R.id.iv);
        }
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if(convertView == null){
            convertView = mInflater.inflate(R.layout.item_imagedetail_listview,null);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }

        String title = mTngouBeanList.get(position)
                                     .getTitle();
        holder.mTvDesc.setText(title);

        String imgPath = mTngouBeanList.get(position)
                                   .getImg();
        //组拼uri  http://tnfs.tngou.net/image/ext/150714/832903f1079ad2a74867e5cbd9dcf1a2.jpg_180x120
        String uri = "http://tnfs.tngou.net/image" + imgPath + "_180x120";
        Picasso.with(mContext)
               .load(uri)
                .placeholder(R.mipmap.ig)
                .error(R.mipmap.lp)
                .into(holder.mIv);


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
