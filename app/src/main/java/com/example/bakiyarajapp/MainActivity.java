package com.example.bakiyarajapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public int i = 10 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void launch(View v){

        Intent i = new Intent(this,laftActivity.class);
        startActivity(i);
    }
    public void launch1(View v){

        Intent j = new Intent(this,selfActivity.class);
        startActivity(j);
    }

}