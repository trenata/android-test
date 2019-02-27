package com.test.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_message_activity);

        Name name = getIntent().getParcelableExtra("name");
        String message = name.getFirstName() + " " + name.getLastName();

        TextView textView = findViewById(R.id.fullName);
        textView.setText(message);
    }

    public void openLinearLayout(View view) {
        Intent intent = new Intent(this,
                LinearLayoutActivity.class);

        startActivity(intent);
    }

    public void openFrameLayout(View view) {
        Intent intent = new Intent(this,
                FrameLayoutActivity.class);

        startActivity(intent);
    }
}
