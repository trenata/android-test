package com.test.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    int[] mCityList;
    String[] mCityNameList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view_activity);

        mRecyclerView = findViewById(R.id.recyclerview);
        GridLayoutManager mGridLayoutManager = new GridLayoutManager(RecyclerViewActivity.this, 2);
        mRecyclerView.setLayoutManager(mGridLayoutManager);

        mCityList = new int[]{R.drawable.clujnapoca, R.drawable.bucharest, R.drawable.budapest, R.drawable.london, R.drawable.seoul, R.drawable.sydney,
                R.drawable.tokyo, R.drawable.la};

        mCityNameList = new String[]{"Cluj-Napoca", "Bucharest", "Budapest", "London", "Seoul", "Sydney", "Tokyo", "Los Angeles"};

        MyAdapter myAdapter = new MyAdapter(RecyclerViewActivity.this, mCityList, mCityNameList);
        mRecyclerView.setAdapter(myAdapter);
    }
}
