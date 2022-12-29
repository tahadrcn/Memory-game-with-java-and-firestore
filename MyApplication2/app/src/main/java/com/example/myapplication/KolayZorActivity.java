package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class KolayZorActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kolay_zor);

    }
    public void kolayagit(View view){
        Intent intent=new Intent(this, KolayActivity.class);
        startActivity(intent);
    }
    public void ortayagit(View view){
        Intent intent=new Intent(this, OrtaActivity2.class);
        startActivity(intent);
    }
    public void zortagit(View view){
        Intent intent=new Intent(this, ZortActivity.class);
        startActivity(intent);
    }
}