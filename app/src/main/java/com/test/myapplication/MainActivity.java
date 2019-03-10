package com.test.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this,
                DisplayMessageActivity.class);

        EditText firstName = findViewById(R.id.firstName);
        EditText lastName = findViewById(R.id.lastName);

        String firstNameString = firstName.getText().toString();
        String lastNameString = lastName.getText().toString();

        Name name = new Name(firstNameString, lastNameString);
        intent.putExtra("name", name);
        startActivity(intent);
    }

    public void openRecycleView(View view) {
        Intent intent = new Intent(this,
                RecyclerViewActivity.class);

        startActivity(intent);
    }

    public void openViewPager(View view) {
        Intent intent = new Intent(this,
                ViewPagerActivity.class);

        startActivity(intent);
    }
}
