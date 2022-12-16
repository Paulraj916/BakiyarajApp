package com.example.bakiyarajapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class laftActivity extends AppCompatActivity {

    Spinner spinner;
    Spinner spinner2;
    Spinner spinner3;
    Spinner spinner4;
    //TextView display;
    TextView nodoors,lnfeet,lninch,totalheight,heightremain;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laft2);
        Intent i = getIntent();

    }

    public void spinnervalue(View view){

        spinner = (Spinner)findViewById(R.id.spinner);
        spinner2 = (Spinner)findViewById(R.id.spinner2);
        spinner3 = (Spinner)findViewById(R.id.spinner3);
        spinner4 = (Spinner)findViewById(R.id.spinner4);



        String[] arrvalue1 = new String[]{"0","1/8","1/4","3/8","1/2","5/8","3/4","7/8"};

        ArrayAdapter<CharSequence> adapter1 = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,arrvalue1);
        spinner.setAdapter(adapter1);

        ArrayAdapter<CharSequence> adapter2 = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,arrvalue1);
        spinner2.setAdapter(adapter2);

        ArrayAdapter<CharSequence> adapter3 = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,arrvalue1);
        spinner3.setAdapter(adapter3);

        String[] arrvalue2 = new String[]{"N normal ","L laft "};

        ArrayAdapter<CharSequence> adapter4 = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,arrvalue2);
        spinner4.setAdapter(adapter4);

    }

    public void launchend (View v){


        nodoors = findViewById(R.id.doors);
        String input = nodoors.getText().toString();

        lninch = findViewById(R.id.inches1);
        String input2 = lninch.getText().toString();


        heightremain = findViewById(R.id.inches2);
        String input4 = heightremain.getText().toString();
        totalheight = findViewById(R.id.totalheight);
        String input5 = totalheight.getText().toString();


        float lnfeet,lninch,heightremain,totalheight,slap1;

        int nodoors;


        int index = spinner.getSelectedItemPosition();
        float lnmain = 0f;
        if(index==0){
            lnmain = 0f;
        }
        else if(index==1){
            lnmain = 0.125f;
        }
        else if(index==2){
            lnmain = 0.25f;
        }
        else if(index==3){
            lnmain = 0.375f;
        }
        else if(index==4){
            lnmain = 0.5f;
        }
        else if(index==5){
            lnmain = 0.625f;
        }
        else if(index==6){
            lnmain = 0.75f;
        }
        else if(index==7){
            lnmain = 0.875f;
        }

        int index1 = spinner2.getSelectedItemPosition();
        float lnmain1 = 0f;
        if(index1==0){
            lnmain1 = 0f;
        }
        else if(index1==1){
            lnmain1 = 0.125f;
        }
        else if(index1==2){
            lnmain1 = 0.25f;
        }
        else if(index1==3){
            lnmain1 = 0.375f;
        }
        else if(index1==4){
            lnmain1 = 0.5f;
        }
        else if(index1==5){
            lnmain1 = 0.625f;
        }
        else if(index1==6){
            lnmain1 = 0.75f;
        }
        else if(index1==7){
            lnmain1 = 0.875f;
        }

        int index3 = spinner3.getSelectedItemPosition();
        float slapremain1 = 0f;
        if(index3==0){
             slapremain1 = 0f;
        }
        else if(index3==1){
             slapremain1 = 0.125f;
        }
        else if(index3==2){
             slapremain1 = 0.25f;
        }
        else if(index3==3){
             slapremain1 = 0.375f;
        }
        else if(index3==4){
             slapremain1 = 0.5f;
        }
        else if(index3==5){
             slapremain1 = 0.625f;
        }
        else if(index3==6){
             slapremain1 = 0.75f;
        }
        else if(index3==7){
             slapremain1 = 0.875f;
        }

        int index4 = spinner4.getSelectedItemPosition();
        float tylaft = 0f;
        if(index4==0){
            tylaft = 0f;
        }
        else if(index4==1){
            tylaft = 1f;
        }

        nodoors = Integer.parseInt(input);

        lninch = Float.parseFloat(input2);
        heightremain = Float.parseFloat(input4);
        totalheight = Float.parseFloat(input5);



        int baki = 0;

        if (nodoors == 1) {
            baki = 4;
        }
        else if(nodoors == 2)
        {
            baki = 4;
        }
        else if(nodoors == 3)
        {
            baki = 6;
        }
        else if(nodoors == 4)
        {
            baki = 6;
        }
        else if(nodoors == 5)
        {
            baki = 8;
        }
        else if(nodoors == 6)
        {
            baki = 8;
        }
        else if(nodoors == 7)
        {
            baki = 10;
        }
        else if(nodoors == 8)
        {
            baki = 10;
        }
        else if(nodoors == 9)
        {
            baki = 12;
        }
        else if(nodoors == 10)
        {
            baki = 12;
        }
        else if(nodoors == 11)
        {
            baki = 14;
        }
        else if(nodoors == 12)
        {
            baki = 14;
        }

        float l = 1.5f;
        if(tylaft == 0f){
            l = 1.5f;
        }else if(tylaft == 1f){
            l = 4f;
        }
        int inner = 3;




        float totinch = lninch+lnmain;
        float totinch1 = totinch-l;
        float value1 = (totinch1/nodoors)-0.25f;
        float totheight =heightremain+lnmain1;
        float value2 = totheight-0.5f;
        float value3 = value2-1;
        float value5 = 0f;
        float value4 = 0f;
        float value6 = 0f;
        float totalheight1 =totalheight+slapremain1;
        slap1 = totalheight1-totheight;



        if(totinch<=96){

            value4 = totinch;

        }else if(totinch>=96){

            /*if(nodoors == 1){
                inner = 1;
            }else if (nodoors==2){
                inner = 1;
            }else if (nodoors==3||nodoors==4){
                inner = 2;
            }else if (nodoors==5||nodoors==6){
                inner = 3;
            }else if (nodoors==7||nodoors==8){
                inner = 4;
            }else if (nodoors==9||nodoors==10){
                inner = 5;
            }else if (nodoors==11||nodoors==12){
                inner = 6;
            }*/

            if(nodoors==5){
                inner = 5;
                float value44 = totinch1/inner;
                value4 = (value44*2)+0.75f;
                value5 = (value44*3)+0.75f;
                if (l==4f){
                    value4 = (value44*2)+0.75f+2.51f;
                }
            }

           if(nodoors==6){
               inner = 3;
               float value44 = totinch1/inner;
               value4 = (totinch1/inner)+0.75f;
               value5 = value44+value44+0.75f;
               if (l==4f){
                   value4 = (totinch1/inner)+0.75f+2.51f;
               }
           }

            if(nodoors==7){

                inner = 7;

                float value44 = totinch1/inner;
                value4 = /*value44+value44+0.75f;*/(value44*4)+0.75f;

                value5 = (value44*3)+0.75f;
                if (l==4f){
                    value4 = /*value44+value44+0.75f;*/(value44*4)+0.75f+2.51f;
                }

            }
            if(nodoors==8){

                inner = 4;

                float value44 = totinch1/inner;
                value4 = value44+value44+0.75f;
                value5 = value4;
                if (l==4f){
                    value4 = value44+value44+0.75f+2.51f;
                }
            }
            if(nodoors==9){

                inner = 9;

                float value44 = totinch1/inner;
                value4 = (value44*5)+0.75f;
                value5 = (value44*4)+0.75f;
                if (l==4f){
                    value4 = (value44*5)+0.75f+2.51f;
                }

            }
            if(nodoors==10){

                inner = 5;

                float value44 = totinch1/inner;
                value4 = value44;
                value5 = ((totinch1-value44)/2)+0.75f;
                value6 = value5;
                if (l==4f){
                    value6 = value5+2.51f;
                }

            }
            if(nodoors==12){

                float value44 = totinch1/3;
                value4 = value44;
                value5 = value4+0.75f;
                value6 = value5;

                if (l==4f){
                    value6 = value5+2.51f;
                }

            }

        }


        float slapadd = 0.75f;
        if(totalheight1==0){
            slapadd = 0f;
            slap1 = 0f;
        }else {
            slapadd = 0.75f;
        }


        float totslap = slap1+slapadd;

        //display = (TextView)findViewById(R.id.textView);

        Intent j = new Intent(this,laftend.class);
        j.putExtra("cool",value1);
        j.putExtra("cool1",value2);
        j.putExtra("cool2",nodoors);
        j.putExtra("cool3",value3);
        j.putExtra("cool4",baki);
        j.putExtra("cool5",value5);
        j.putExtra("cool6",value4);
        j.putExtra("cool9",value6);
        j.putExtra("cool7",totslap);
        j.putExtra("cool8",totinch);

        startActivity(j);
    }

}