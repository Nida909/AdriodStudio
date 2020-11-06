package com.example.quadratic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();

        String msg1 = intent.getStringExtra("v1");
        String msg2 = intent.getStringExtra("v2");
        setContentView(R.layout.activity_main2);
        tv=(TextView)findViewById(R.id.tt);
        tv.setText(msg1);
    }
}