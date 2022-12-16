package com.example.bakiyarajapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class selfActivity extends AppCompatActivity {

    Spinner spinner,spinner1,spinner2,spinner3,spinner4;
    TextView length,height,depth,border;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self);
        Intent j = getIntent();
    }

    public void spinnervalue(View view){

        spinner = (Spinner)findViewById(R.id.spinner6);
        spinner1 = (Spinner)findViewById(R.id.spinner7);
        spinner2 = (Spinner)findViewById(R.id.spinner8);
        spinner3 = (Spinner)findViewById(R.id.spinner9);
        spinner4 = (Spinner)findViewById(R.id.spinner10);

        String[] arrvalue1 = new String[]{"0","1/8","1/4","3/8","1/2","5/8","3/4","7/8"};

        ArrayAdapter<CharSequence> adapter1 = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,arrvalue1);
        spinner.setAdapter(adapter1);

        ArrayAdapter<CharSequence> adapter2 = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,arrvalue1);
        spinner1.setAdapter(adapter2);

        ArrayAdapter<CharSequence> adapter3 = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,arrvalue1);
        spinner2.setAdapter(adapter3);

        ArrayAdapter<CharSequence> adapter4 = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,arrvalue1);
        spinner3.setAdapter(adapter4);

        String[] arrvalue2 = new String[]{"1","2","3","4","5","6","7","8","9","10"};

        ArrayAdapter<CharSequence> adapter5 = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,arrvalue2);
        spinner4.setAdapter(adapter5);

    }

    public void launchend (View v){

        length = findViewById(R.id.length);
        String input = length.getText().toString();

        height = findViewById(R.id.height);
        String input2 = height.getText().toString();

        depth = findViewById(R.id.depth);
        String input3 = depth.getText().toString();
        border = findViewById(R.id.border);
        String input4 = border.getText().toString();

        float length,height,depth,border;

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

        int index1 = spinner1.getSelectedItemPosition();
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

        int index2 = spinner2.getSelectedItemPosition();
        float lnmain2 = 0f;
        if(index2==0){
            lnmain2 = 0f;
        }
        else if(index2==1){
            lnmain2 = 0.125f;
        }
        else if(index2==2){
            lnmain2 = 0.25f;
        }
        else if(index2==3){
            lnmain2 = 0.375f;
        }
        else if(index2==4){
            lnmain2 = 0.5f;
        }
        else if(index2==5){
            lnmain2 = 0.625f;
        }
        else if(index2==6){
            lnmain2 = 0.75f;
        }
        else if(index2==7){
            lnmain2 = 0.875f;
        }

        int index3 = spinner3.getSelectedItemPosition();
        float lnmain3 = 0f;
        if(index3==0){
            lnmain3 = 0f;
        }
        else if(index3==1){
            lnmain3 = 0.125f;
        }
        else if(index3==2){
            lnmain3 = 0.25f;
        }
        else if(index3==3){
            lnmain3 = 0.375f;
        }
        else if(index3==4){
            lnmain3 = 0.5f;
        }
        else if(index3==5){
            lnmain3 = 0.625f;
        }
        else if(index3==6){
            lnmain3 = 0.75f;
        }
        else if(index3==7){
            lnmain3 = 0.875f;
        }

        int index4 = spinner4.getSelectedItemPosition();
        int lnmain4 = 0;
        if(index4==0){
            lnmain4 = 1;
        }
        else if(index4==1){
            lnmain4 = 2;
        }
        else if(index4==2){
            lnmain4 = 3;
        }
        else if(index4==3){
            lnmain4 = 4;
        }
        else if(index4==4){
            lnmain4 = 5;
        }
        else if(index4==5){
            lnmain4 = 6;
        }
        else if(index4==6){
            lnmain4 = 7;
        }
        else if(index4==7){
            lnmain4 = 8;
        }
        else if(index4==8){
            lnmain4 = 9;
        }
        else if(index4==9){
            lnmain4 = 10;
        }

        length = Float.parseFloat(input);
        height = Float.parseFloat(input2);
        depth = Float.parseFloat(input3);
        border = Float.parseFloat(input4);

        float length1 = length+lnmain;//1.1
        float height1 = height+lnmain1;//1.2...3.2
        float depth1 = depth+lnmain2;
        float border1 = border+lnmain3;//4.1...5.1
        float slap = lnmain4;//2.3
        float value1 = depth1-0.75f;//2.1...3.1
        float value2 = length1-1.375f;//2.2
        float value3 = height1-1.375f;//4.2
        float value4 = value2+(2*border1);//5.2
        float value5 = (length1/2)-0.25f;//6.1
        float value6 = height1-0.25f;//6.2

        Intent k = new Intent(this,selfend.class);
        k.putExtra("cool",length1);
        k.putExtra("cool1",height1);
        k.putExtra("cool2",border1);
        k.putExtra("cool3",slap);
        k.putExtra("cool4",value1);
        k.putExtra("cool5",value2);
        k.putExtra("cool6",value3);
        k.putExtra("cool7",value4);
        k.putExtra("cool8",value5);
        k.putExtra("cool9",value6);

        startActivity(k);

    }

}