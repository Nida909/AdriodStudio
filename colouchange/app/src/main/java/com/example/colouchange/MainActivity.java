package com.example.colouchange;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et1;
    EditText edi;
    LinearLayout l1;
    ImageView i1;
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

    }
    public void ne(View v)
    {
        edi=(EditText)findViewById(R.id.s1);
        Toast toast=Toast.makeText(getApplicationContext(),"Place your mg here",Toast.LENGTH_SHORT);
        toast.setMargin(50,50);
        toast.show();
    }
    public void newGame(View v)
    {
        et1=(EditText)findViewById(R.id.s1);
        et1.setText(" You want to play a new game");
    }
    public void oldPlayer(View v)
    {
        et1=(EditText)findViewById(R.id.s1);
        et1.setText(" You are an Expert");
    }
    public void bored(View v)
    {
        l1=(LinearLayout) findViewById(R.id.layout1);
        l1.setVisibility(View.VISIBLE);

    }
    public void changeColor(View v)
    {int c1;
        switch(v.getId())
        {
            case R.id.red:
            { c1=R.drawable.nida;
                getWindow().setBackgroundDrawableResource(c1);
                break;}
            case R.id.green:
            {c1=R.color.green;
                getWindow().setBackgroundDrawableResource(c1);
                break;}

            case R.id.blue:
            {c1=R.color.blue;
                getWindow().setBackgroundDrawableResource(c1);
                break;}


        }

    }

}