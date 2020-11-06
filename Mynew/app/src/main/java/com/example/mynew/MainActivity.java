package com.example.mynew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
    public void onpclck(View v)
    {
        te=(TextView)findViewById(R.id.tv) ;
        ed=(EditText)findViewById(R.id.edt);
        et=(EditText) findViewById(R.id.etd);
        ml=ed.getText().toString();
        pp=et.getText().toString();
        String[] mail = getResources().getStringArray(R.array.email);
        String[] pord= getResources().getStringArray(R.array.password);

        for(int j=0;j<10;j++)
        {
            if((ml.equals(mail[j]))&&(pp.equals(pord[j]))) {
                bb = true;
            }
        }
        if(bb==true) {
            te.setText("You have successfully Signed In");
            te.setVisibility(View.VISIBLE);
            Intent intent = new Intent(this,confirm.class);

            intent.putExtra("v1", "Some Value");

            intent.putExtra("v2", "Another Value");

            startActivity(intent);
        }
        else
        {
            te.setVisibility(View.VISIBLE);
            te.setText("Invalid email address or password");

        }




    }

}