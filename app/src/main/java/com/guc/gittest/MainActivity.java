package com.guc.gittest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv_show)
    TextView mTvShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        //master分支
        //主分支又添加代码并提交
        //新建dev分支
        //dev分支修改内容并添加
        mTvShow.setText("你好，master");

    }

    @OnClick(R.id.tv_show)
    public void onViewClicked() {
        Toast.makeText(this,"你好，master",Toast.LENGTH_SHORT).show();
    }
}
