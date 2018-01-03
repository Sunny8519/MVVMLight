package com.sunny.learning;

import android.databinding.DataBindingUtil;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.sunny.learning.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding mBinding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        setSupportActionBar(this.mBinding.toolBar);
        getSupportActionBar().setDisplayShowTitleEnabled(true);

        //
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //setHomeButtonEnabled(boolean)的作用是设置左上角的按钮是否可点击(也就是返回按钮以及配合DrawerLayout使用的三个横线的按钮)
        getSupportActionBar().setHomeButtonEnabled(true);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, this.mBinding.drawerLayout, this.mBinding.toolBar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        this.mBinding.drawerLayout.setDrawerListener(toggle);
        toggle.syncState();
    }
}
