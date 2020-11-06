package com.example.quadratic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 EditText ed;
 EditText et;
 EditText tt;
 TextView tv;
 String s1,s2,s3;

    int a,b,c,res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void oneclick(View v)
    {

    }
    public void root(View v)
    {
        boolean op =false;
        ed=(EditText)findViewById(R.id.edt);
        et=(EditText)findViewById(R.id.edt1);
        tt=(EditText)findViewById(R.id.edt2);
        s1=ed.getText().toString();
        s2=et.getText().toString();
        s3=tt.getText().toString();
        for(int i=0;i<s1.length();i++)
        {
            boolean opt=Character.isDigit(s1.charAt(i));
            if(opt==false)
            {
                Toast to=Toast.makeText(getApplicationContext(),"Enter Integer Value for a",Toast.LENGTH_SHORT);
                to.setMargin(50,50);
                to.show();

                op=true;
                break;
            }
        }
        for(int i=0;i<s2.length();i++)
        {
            boolean opt=Character.isDigit(s2.charAt(i));
            if(opt==false)
            {
                Toast to=Toast.makeText(getApplicationContext(),"Enter Integer value for b",Toast.LENGTH_SHORT);
                to.setMargin(50,50);
                to.show();

                op=true;
                break;
            }
        }
        for(int i=0;i<s3.length();i++)
        {
            boolean opt=Character.isDigit(s3.charAt(i));
            if(opt==false)
            {
                Toast to=Toast.makeText(getApplicationContext(),"Enter Integer value for c",Toast.LENGTH_SHORT);
                to.setMargin(50,50);
                to.show();

                op=true;
                break;
            }
        }
        tv=(TextView) findViewById(R.id.t);
        if(op==false) {
            a = Integer.parseInt(s1);
            b = Integer.parseInt(s2);
            c = Integer.parseInt(s3);
            res = (b * b) - (4 * a * c);
            if (res < 0) {
                Toast to = Toast.makeText(getApplicationContext(), "Root is Imaginary", Toast.LENGTH_SHORT);
                to.setMargin(50, 50);
                to.show();
                tv.setText("Root is Imaginary ");
                tv.setVisibility(View.VISIBLE);
            } else {
                double x, y;
                x = ((-b) - (Math.sqrt(res))) / (2 * a);
                y = ((-b) + (Math.sqrt(res))) / (2 * a);
                tv.setText("Root = " + x + " , " + y);
                tv.setVisibility(View.VISIBLE);



            }
        }
    }
}