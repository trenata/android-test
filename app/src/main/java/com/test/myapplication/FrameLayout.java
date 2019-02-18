package com.test.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FrameLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frame_layout);
    }

    public void changeDescription(View view) {
        EditText editTextNewDescription = findViewById(R.id.editDescription);
        String newDescription = editTextNewDescription.getText().toString();

        TextView textViewDescription = findViewById(R.id.description);
        textViewDescription.setText(newDescription);
    }
}
