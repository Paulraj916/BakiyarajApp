package com.example.bakiyarajapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class selfend extends AppCompatActivity {

    TextView textView0,textView1,textView2,textView3,textView4,textView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selfend);
        Intent k = getIntent();
        float length1 = k.getFloatExtra("cool",0f);
        float height1 = k.getFloatExtra("cool1",0f);
        float border1 = k.getFloatExtra("cool2",0f);
        float slap = k.getFloatExtra("cool3",0f);
        float value1 = k.getFloatExtra("cool4",0f);
        float value2 = k.getFloatExtra("cool5",0f);
        float value3 = k.getFloatExtra("cool6",0f);
        float value4 = k.getFloatExtra("cool7",0f);
        float value5 = k.getFloatExtra("cool8",0f);
        float value6 = k.getFloatExtra("cool9",0f);

        textView0 = (TextView)findViewById((R.id.textView15));
        textView0.setText("  "+length1+" x "+height1+" x 1 ");

        textView1 = (TextView)findViewById((R.id.textView16));
        textView1.setText(" "+value1+" x "+value2+" x "+slap);

        textView2 = (TextView)findViewById((R.id.textView17));
        textView2.setText(" "+value1+" x "+height1+" x 2 ");

        textView3 = (TextView)findViewById((R.id.textView18));
        textView3.setText(" "+border1+" x "+value3+" x 2 ");

        textView4 = (TextView)findViewById((R.id.textView19));
        textView4.setText(" "+border1+" x "+value4+" 2 ");

        textView5 = (TextView)findViewById((R.id.textView20));
        textView5.setText(" "+value5+" x "+value6+" x 2");

    }
}