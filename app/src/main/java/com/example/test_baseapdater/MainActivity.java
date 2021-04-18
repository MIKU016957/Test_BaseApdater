package com.example.test_baseapdater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView mListView;
    //字符串组合
    private String [] data = {"item_One","item_Two","item_Three","item_Four",
            "item_Five","item_Six","item_Seven","item_Eight","item_Nine","item_Ten"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //找到ListView组建
        mListView =(ListView)findViewById(R.id.list_item);

        List<Data> mDataList =new ArrayList<>();
        for( int i = 1; i <= 18 ; i++) {
            Data mData = new Data();      //循环创建studentData 对象
            mData.setName("a " + i + " 号");          //为对象设置姓名
            mData.setAge(i);                             //为对象设置 年龄
            mData.setPhoto(R.drawable.abc);              //为对象设置照片
            mDataList.add(mData);                  //将对象添加到列表中
        }
        //创建Adapter 实例化对象， 调用构造函数传参，将数据和adapter  绑定
        MyAdapter myAdapter = new MyAdapter(mDataList,this);
        mListView.setAdapter(myAdapter);

    }
}