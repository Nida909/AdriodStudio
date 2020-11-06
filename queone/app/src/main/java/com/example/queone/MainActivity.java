package com.example.queone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
public class MainActivity extends AppCompatActivity {

    boolean check=false;

    EditText edi;
    EditText edd;
    EditText ed;
    TextView te;
    String data="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void num(View v)
    {
        String temp=" ";
        switch (v.getId())
        {
            case R.id.b0 :
            {
                temp="0";
                break;
            }
            case R.id.b1 :
            {
                temp="1";
                break;
            }
            case R.id.b2 :
            {
                temp="2";
                break;
            }
            case R.id.b3 :
            {
                temp="3";
                break;
            }
            case R.id.b4 :
            {
                temp="4";
                break;
            }
            case R.id.b5 :
            {
                temp="5";
                break;
            }
            case R.id.b6 :
            {
                temp="6";
                break;
            }
            case R.id.b7 :
            {
                temp="7";
                break;
            }case R.id.b8 :
             {
            temp="8";
            break;
            }
            case R.id.b9 :
            {
                temp="9";
                break;
            }


        }
        if(check==false) {
            edi = (EditText) findViewById(R.id.text1);

            data=edi.getText().toString().concat(temp);
            edi.setText(data);
        }
        else
        {
       edd=(EditText)findViewById(R.id.tet);
       data=edd.getText().toString().concat(temp);
       edd.setText(data);
        }

    }
    public void optr(View v)
    {

   te=(TextView)findViewById(R.id.tt);

        switch (v.getId())
        {
            case R.id.opt3: {
                check=true;
                te.setText("+");
                break;
            }
            case R.id.opt4: {
                check=true;
                te.setText("-");
                break;
            }
            case R.id.opt5: {
                check=true;
                te.setText("*");
                break;
            }
            case R.id.opt6: {
                check=true;
                te.setText("%");
                break;
            }
            case R.id.opt7: {
                check=true;
                te.setText("/");

                break;
            }
            case R.id.opt8: {
                check=true;
                te.setText("^");
                break;
            }
        }

    }
    public void oprtion(View v)
    {
        String ch="";
        String chr;
        int y,z,re;
        te=(TextView)findViewById(R.id.tt);
        chr=te.getText().toString();
        edi = (EditText) findViewById(R.id.text1);
        y=Integer.parseInt(edi.getText().toString());
        edd = (EditText) findViewById(R.id.tet);
        z=Integer.parseInt(edd.getText().toString());
        ed=(EditText)findViewById(R.id.edt3);

        switch (chr)
        {
            case "+": {
                re = y + z;
                ch=String.valueOf(re);

                break;
            }
            case "-": {
                re = y - z;
                ch=String.valueOf(re);

                break;
            }
            case "*": {
                re = y * z;
                ch=String.valueOf(re);

                break;
            }
            case "/": {
                re = y / z;
                ch=String.valueOf(re);

                break;
            }
            case "^": {

                re =(int)Math.pow(y,z);
                ch=String.valueOf(re);

                break;
            }
            case "%": {
                re = y % z;
                ch=String.valueOf(re);
                break;
            }


        }
        ed.setText(ch);

    }
    public void clearc(View v)
    {
        te=(TextView)findViewById(R.id.tt);
        te.setText(" ");
        edi = (EditText) findViewById(R.id.text1);
        edi.setText(" ");
        edd = (EditText) findViewById(R.id.tet);
     edd.setText(" ");
        ed=(EditText)findViewById(R.id.edt3);
        ed.setText(" ");
    }
}