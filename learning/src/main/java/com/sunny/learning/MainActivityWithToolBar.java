package com.sunny.learning;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.sunny.learning.databinding.ActivityMainWithToolbarBinding;

/**
 * @author Sunny
 * @Description:
 * @date 2017/12/30
 */

public class MainActivityWithToolBar extends AppCompatActivity {
    private ActivityMainWithToolbarBinding mBinding = null;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main_with_toolbar);
//        setSupportActionBar(this.mBinding.mainToolbar);
    }
}
