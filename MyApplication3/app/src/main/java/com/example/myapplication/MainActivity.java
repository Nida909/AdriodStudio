package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Resources res;
    EditText ed;
    EditText et;
    String ml,pp;
    boolean bb=false;
    TextView te;
    String[] mail = res.getStringArray(R.array.email);
    String[] pord= res.getStringArray(R.array.pass_word);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onpclck(View v)
    {
        te=(TextView)findViewById(R.id.tv) ;
        ed=(EditText)findViewById(R.id.edt);
        et=(EditText) findViewById(R.id.etd);
        ml=ed.getText().toString();
        pp=et.getText().toString();

        for(int j=0;j<10;j++)
        {
            if((ml.equals(mail[j]))&&(pp.equals(pord[j])))
            {
                bb=true;
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