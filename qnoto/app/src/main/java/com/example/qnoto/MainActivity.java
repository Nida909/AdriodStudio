package com.example.qnoto;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
 ImageButton ib,t3,t4,t5,t6,t7,t8,t9,t0,tt,t;
 int no=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onbtn(View v)
    {
       int num;

            no++;
            num=v.getId();
            ib = (ImageButton) findViewById(num);
            if((no%2)==0) {
                ib.setImageDrawable(getResources().getDrawable(R.drawable.crocn));
            }
            else {
                ib.setImageDrawable(getResources().getDrawable(R.drawable.zeron));
            }

    }
    public void reclk(View v)
    {
        t3=(ImageButton)findViewById(R.id.b3);
        t3.setImageDrawable(getResources().getDrawable(R.drawable.fir));
        t4=(ImageButton)findViewById(R.id.b3);
        t4.setImageDrawable(getResources().getDrawable(R.drawable.fir));
        t5=(ImageButton)findViewById(R.id.b4);
        t5.setImageDrawable(getResources().getDrawable(R.drawable.fir));
        t6=(ImageButton)findViewById(R.id.b5);
        t6.setImageDrawable(getResources().getDrawable(R.drawable.fir));
        t7=(ImageButton)findViewById(R.id.b6);
        t7.setImageDrawable(getResources().getDrawable(R.drawable.fir));
        t8=(ImageButton)findViewById(R.id.b7);
        t8.setImageDrawable(getResources().getDrawable(R.drawable.fir));
        t9=(ImageButton)findViewById(R.id.b8);
        t9.setImageDrawable(getResources().getDrawable(R.drawable.fir));
        t0=(ImageButton)findViewById(R.id.b9);
        t0.setImageDrawable(getResources().getDrawable(R.drawable.fir));
        tt=(ImageButton)findViewById(R.id.b0);
        tt.setImageDrawable(getResources().getDrawable(R.drawable.fir));
        t=(ImageButton)findViewById(R.id.b);
        t.setImageDrawable(getResources().getDrawable(R.drawable.fir));
    }
}