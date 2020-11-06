package com.example.queno3;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    RelativeLayout rl;
    SeekBar bb;
TextView tv,tt;
int prog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bb= (SeekBar)findViewById(R.id.br);

        tt=(TextView)findViewById(R.id.t7);

        bb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                prog=progress;

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                tt.setTextSize(prog);
            }
        });



    }
    public void ontclick(View v)
    {
        boolean on=((ToggleButton)v).isChecked();
        rl=(RelativeLayout) findViewById(R.id.layou);
        if(on)
        {

            rl.setBackgroundResource(R.drawable.nnn);

        }
        else
        {
            rl.setBackgroundResource(R.color.colorAccent);
        }

    }
    public void onrclick(View v)
    {
        tv=(TextView)findViewById(R.id.third);
        boolean ch=((RadioButton)v).isChecked();
        switch(v.getId())
        {
            case R.id.fourth :
            {
                tv.setTextColor(getResources().getColor(R.color.red));
                break;

            }
            case R.id.fifth :
            {
                tv.setTextColor(getResources().getColor(R.color.green));
                break;

            }
            case R.id.blue :
            {
                tv.setTextColor(getResources().getColor(R.color.blue));
                break;

            }
        }
    }
    public void oncclick(View v)
    {
        tv=(TextView)findViewById(R.id.t6);
        Typeface tp=tv.getTypeface();
        boolean opt=((CheckBox)v).isChecked();
        switch (v.getId())
        {
            case R.id.c7: {
                if (opt) {
                    tv.setTypeface(Typeface.SANS_SERIF);

                }
                else
                {
                    tv.setTypeface(tp);
                }
                break;
            }
            case R.id.c8: {
                if (opt) {
                    tv.setTypeface(tp, Typeface.ITALIC);
                }
                else
                {
                    tv.setTypeface(tp);

                }
                break;
            }
            case R.id.c9: {
                if (opt) {
                    tv.setTypeface(Typeface.SERIF);

                }
                else
                {
                    tv.setTypeface(tp);

                }
                break;
            }
        }

    }





}