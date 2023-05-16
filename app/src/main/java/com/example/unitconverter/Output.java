package com.example.unitconverter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Output extends AppCompatActivity {
TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);
        text = findViewById(R.id.textView);
        Intent intent = getIntent();
        String str = intent.getStringExtra(MainActivity.EXTRA_NAME);

        text.setText(str);
    }
}