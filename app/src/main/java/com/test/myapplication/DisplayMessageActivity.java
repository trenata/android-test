package com.test.myapplication;

import android.os.Bundle;
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
}
