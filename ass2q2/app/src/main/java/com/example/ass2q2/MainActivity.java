package com.example.ass2q2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   EditText ed;
   EditText et;
 String ml,pp;
 boolean bb=false;
   TextView te;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onpclick(View v)
    {
        te=(TextView)findViewById(R.id.tv) ;
        ed=(EditText)findViewById(R.id.edt);
        et=(EditText) findViewById(R.id.etd);
        ml=ed.getText().toString();
        pp=et.getText().toString();
        String[] mail = getResources().getStringArray(R.array.email);
        String[] pord= getResources().getStringArray(R.array.password);
        for(int i=0;i<10;i++)
        {
            if(ml.equals(mail[i]))
            {
                if(pp.equals(pord[i])) {
                    bb = true;
                }
            }
        }
        if(bb==true) {
            te.setText("You have successfully Signed In");
            te.setVisibility(View.VISIBLE);
        }
        else
        {
            te.setVisibility(View.VISIBLE);
            te.setText("Invalid email address or password");

        }

    }
}