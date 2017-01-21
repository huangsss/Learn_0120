package com.practice.huangasys.learn_0120;

import android.view.View;
import android.widget.RadioGroup;

import com.huangj.huangjlibrary.base.BaseActivity;
import com.practice.huangasys.fragments.CategoryFragment;
import com.practice.huangasys.fragments.HomeFragment;
import com.practice.huangasys.fragments.HotSaleFragment;
import com.practice.huangasys.fragments.MineFragment;
import com.practice.huangasys.fragments.ShopFragment;

import butterknife.Bind;

public class MainActivity extends BaseActivity {

    @Bind(R.id.rg)
    RadioGroup radioGroup;

    @Override
    protected int getContentId() {
        return R.layout.activity_main;
    }

    @Override
    protected boolean isOpenStatus() {
        return false;
    }

    @Override
    protected void init() {
        radioGroup.getChildAt(0).performClick();
    }

    public void rgOnclick(View view) {
        switch (view.getId()) {
            case R.id.rb1:
                showFragment(R.id.fl_zw, new HomeFragment());
                break;
            case R.id.rb2:
                showFragment(R.id.fl_zw, new HotSaleFragment());
                break;
            case R.id.rb3:
                showFragment(R.id.fl_zw, new ShopFragment());
                break;
            case R.id.rb4:
                showFragment(R.id.fl_zw, new CategoryFragment());
                break;
            case R.id.rb5:
                showFragment(R.id.fl_zw, new MineFragment());
                break;
        }
    }
}
