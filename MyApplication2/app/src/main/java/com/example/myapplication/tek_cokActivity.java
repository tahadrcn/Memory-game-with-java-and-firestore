package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class tek_cokActivity extends AppCompatActivity {



    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tek_cok);





    }

    public void zorkolaygetir(View view){
        Intent intent=new Intent(this,KolayZorActivity.class);
        startActivity(intent);
    }
    public void ortazorgetir(View view){
        Intent intent=new Intent(this,ortazorActivity.class);
        startActivity(intent);
    }

}