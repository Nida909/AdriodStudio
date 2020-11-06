package com.example.queton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    EditText ed1,ed2;
    TextView tv;

    String ml,pp;
    boolean bb=false;
    public void btnclck(View v)
    {

        tv=(TextView)findViewById(R.id.txt1) ;
        ed1=(EditText)findViewById(R.id.edt1);
        ed2=(EditText) findViewById(R.id.edt2);
        ml=ed1.getText().toString();
        pp=ed2.getText().toString();

        for(int j=0;j<10;j++)
        {
            String str1=getResources().getStringArray(R.array.email)[j];
            String str2=getResources().getStringArray(R.array.pass_word)[j];
            if((ml.equals(str1))&&(pp.equals(str2)))
            {

                    bb = true;

            }
        }
        if(bb==true) {
            tv.setText("You have successfully Signed In");
            tv.setVisibility(View.VISIBLE);
        }
        else
        {
            tv.setVisibility(View.VISIBLE);
            tv.setText("Invalid email address or password");

        }
    }
}