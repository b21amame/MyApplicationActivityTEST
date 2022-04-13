package com.example.myapplicationactivitytest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = findViewById(R.id.text_view);
        String name = getIntent().getStringExtra("name");
        textView.setText(name);
        textView.setText("Jag ska dra nu och handla");



    }
}