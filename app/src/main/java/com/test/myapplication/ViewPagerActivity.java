package com.test.myapplication;

import android.os.Bundle;

import com.rd.PageIndicatorView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class ViewPagerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_pager_activity);

        ViewPager viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(new CustomPagerAdapter(this));

        final PageIndicatorView pageIndicatorView = findViewById(R.id.pageIndicatorView);
        pageIndicatorView.setViewPager(viewPager);
    }
}


