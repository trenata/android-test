package com.test.myapplication;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    ImageView mCity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_activity);

        mCity = findViewById(R.id.imageView);

        Bundle mBundle = getIntent().getExtras();
        if (mBundle != null) {
            mCity.setImageResource(mBundle.getInt("Image"));
        }
    }
}
