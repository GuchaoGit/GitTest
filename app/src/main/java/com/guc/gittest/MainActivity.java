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
    @BindView(R.id.tv_show2)
    TextView mTvShow2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //新建dev分支
        //dev分支修改内容并添加
        ButterKnife.bind(this);
        //master分支
        //主分支又添加代码并提交
        //新建dev分支
        //dev分支修改内容并添加
        mTvShow.setText("你好，dev");
        mTvShow2.setText("inject");

        故意改错并提交到版本库

    }

    @OnClick(R.id.tv_show)
    public void onViewClicked() {
        Toast.makeText(this, "你好，dev", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.tv_show2)
    public void onViewClick() {
        Toast.makeText(this, "你好，dev,show2", Toast.LENGTH_SHORT).show();
    }
}
