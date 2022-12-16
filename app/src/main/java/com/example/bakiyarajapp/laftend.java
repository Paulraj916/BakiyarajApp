package com.example.bakiyarajapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class laftend extends AppCompatActivity {

    TextView textView2,textView3,textView4,textView5,textView6,textView7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laftend);
        Intent j = getIntent();
        float value1 = j.getFloatExtra("cool",0f);
        float value2 = j.getFloatExtra("cool1",0f);
        int nodoors = j.getIntExtra("cool2",0);
        float value3 = j.getFloatExtra("cool3",0f);
        int baki = j.getIntExtra("cool4",0);
        float value5 = j.getFloatExtra("cool5",0f);
        float value4 = j.getFloatExtra("cool6",0f);
        float totslap = j.getFloatExtra("cool7",0f);
        float totinch = j.getFloatExtra("cool8",0f);
        float value6 = j.getFloatExtra("cool9",0f);

        textView2 = (TextView)findViewById((R.id.textView2));
        textView2.setText(" DOORS :"+value1+" x "+value2+" x "+nodoors);

        textView3 = (TextView)findViewById((R.id.textView3));
        textView3.setText("FRAME : 3.25 "+" x "+value3+"x "+baki);

        textView4 = (TextView)findViewById((R.id.textView4));
        textView4.setText("FRAME : 3.25 "+" x "+value4+" x 2 ");

        textView5 = (TextView)findViewById((R.id.textView5));
        textView5.setText("FRAME : 3.25 "+" x "+value5+" x 2 ");

        textView6 = (TextView)findViewById((R.id.textView6));
        textView6.setText("FRAME : 3.25 "+" x "+value6+" x 2");

        textView7 = (TextView)findViewById((R.id.textView7));
        textView7.setText("BORDER : "+totslap+" x "+totinch);


    }
}