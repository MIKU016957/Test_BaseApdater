package com.example.test_baseapdater;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends BaseAdapter {

    private List<Data> mDataList;
    private LayoutInflater inflater;

    public MyAdapter(List<Data> mDataList, Context context) {
        this.mDataList = mDataList;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {

        return mDataList == null ? 0 : mDataList.size();
    }

    @Override
    public Object getItem(int position) {

        return mDataList.get(position);
    }

    @Override
    public long getItemId(int position) {

        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //加载布局为一个视图
        View view = inflater.inflate(R.layout.listview_item, null);
        Data mData = (Data) getItem(position);
        //在view 视图中查找 组件
        TextView tv_name = (TextView) view.findViewById(R.id.text_name);
        TextView tv_age = (TextView) view.findViewById(R.id.text_age);
        ImageView im_photo = (ImageView) view.findViewById(R.id.image_id);
        //为Item 里面的组件设置相应的数据
        tv_name.setText(mData.getName());
        tv_age.setText("age:" + mData.getAge());
        im_photo.setImageResource(mData.getPhoto());
        //返回含有数据的View
        return view;
    }
}
