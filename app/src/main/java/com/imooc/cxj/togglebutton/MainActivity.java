package com.imooc.cxj.togglebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    private ToggleButton tb;
    private ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //初始化控件
        tb = (ToggleButton) findViewById(R.id.toggleButton1);
        img = (ImageView) findViewById(R.id.imageView1);

        /*
         *给当前的tb设置监听器
         */
        tb.setOnCheckedChangeListener(this);
    }
    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked){
        // 当tb被点击的时候，当前的方法会执行
        //buttonView可以检测哪个tb被点击了       isChecked可以判断当前tb的状态
        //当点击这个tb的时候，更换img的背景
        img.setBackgroundResource(isChecked?R.drawable.off:R.drawable.on);
    }
}
