package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ortazorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ortazor);
    }
    public void ortayagit1(View view){
        Intent intent=new Intent(this, ortacokActivity.class);
        startActivity(intent);
    }
    public void zortagit1(View view){
        Intent intent=new Intent(this, zorcokActivity.class);
        startActivity(intent);
    }
}