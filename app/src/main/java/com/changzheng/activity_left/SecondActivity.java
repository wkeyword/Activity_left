package com.changzheng.activity_left;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }


    public void backdata(View view) {
//        封装要返回的数据
        Intent i=new Intent();
        i.putExtra("info","大家好,才是真的好");
        setResult(RESULT_OK,i);
        finish();//当finish后返回数据
    }
}
