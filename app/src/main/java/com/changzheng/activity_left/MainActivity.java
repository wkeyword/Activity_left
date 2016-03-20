package com.changzheng.activity_left;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView mFace;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFace=(ImageView)findViewById(R.id.head_iv);
    }

    public void changeImage(View view) {
        Intent intent=new Intent();
        intent.setAction(Intent.ACTION_GET_CONTENT);//取得内容
//        intent.addCategory(Intent.CATEGORY_DEFAULT);//默认添加
        intent.setType("image/*");//设置要访问的数据的MIME类型
        startActivityForResult(intent,6);


    }


//    当通过statActivityResult调用activity,当activity关闭后(finish),则安卓框架回调该方法
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode==6){
//            设置头像
            Uri uri=data.getData();
            mFace.setImageURI(uri);
            System.out.println("执行了这个方法..................................");
        }
    }
}
