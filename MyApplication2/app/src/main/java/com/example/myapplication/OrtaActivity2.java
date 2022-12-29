package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Base64;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrtaActivity2 extends AppCompatActivity {
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    private ImageView imgo1;private ImageView imgo2;private ImageView imgo3;private ImageView imgo4;
    private ImageView imgo5;private ImageView imgo6;private ImageView imgo7;private ImageView imgo8;
    private ImageView imgo9;private ImageView imgo10;private ImageView imgo11;private ImageView imgo12;
    private ImageView imgo13;private ImageView imgo14;private ImageView imgo15;private ImageView imgo16;
    private TextView textView2;
    private TextView textView5;
    private TextView txt_sureyi_goster;
    private Button btn_sureyi_baslat;
    CountDownTimer countDownTimero = new CountDownTimer(45000, 1000) {
        @Override
        public void onTick(long l) {
            txt_sureyi_goster.setText("" + l / 1000);
            if (f == 8) {
                countDownTimero.cancel();
                AlertDialog.Builder builder = new AlertDialog.Builder(OrtaActivity2.this);
                builder.setTitle("HARRY POTTER MEMORY MASTER");
                builder.setMessage("TEBRİKLER!" + "\nPuanınız:" + textView2.getText());
                builder.setNegativeButton("Tamam", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(OrtaActivity2.this, KolayZorActivity.class);
                        startActivity(intent);
                    }
                });
                builder.show();
            }
        }

        @Override
        public void onFinish() {
            AlertDialog.Builder builder1 = new AlertDialog.Builder(OrtaActivity2.this);
            builder1.setTitle("HARRY POTTER MEMORY MASTER");
            builder1.setMessage("SÜRENİZ BİTTİ!" + "\nPuanınız:" + textView2.getText());
            builder1.setNegativeButton("Tamam", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent intent = new Intent(OrtaActivity2.this, KolayZorActivity.class);
                    startActivity(intent);
                }
            });
            builder1.show();
            imgo1.setEnabled(false);imgo2.setEnabled(false);imgo3.setEnabled(false);imgo4.setEnabled(false);
            imgo5.setEnabled(false);imgo6.setEnabled(false);imgo7.setEnabled(false);imgo8.setEnabled(false);
            imgo9.setEnabled(false);imgo10.setEnabled(false);imgo11.setEnabled(false);imgo12.setEnabled(false);
            imgo13.setEnabled(false);imgo14.setEnabled(false);imgo15.setEnabled(false);imgo16.setEnabled(false);
        }
    };
    int i = 0;
    int f = 0;
    int n=0;
    boolean p = true;boolean q = true;boolean r = true;boolean s = true;
    boolean t = true;boolean o = true;boolean u = true;boolean v = true;
    boolean y = true;boolean z = true;boolean e = true;boolean d = true;
    boolean g = true;boolean h = true;boolean b = true;boolean c = true;


    kartlar[] kartdizio = new kartlar[44];
    List<String> acilmis = new ArrayList<>();
    List<String> acilmispuan = new ArrayList<>();
    List<String> acilmisev = new ArrayList<>();
    List<String> listev = new ArrayList<>();
    List<String> listisim = new ArrayList<>();
    List<String> listev1 = new ArrayList<>();
    List<String> listpuan = new ArrayList<>();
    List<Bitmap> listimg = new ArrayList<Bitmap>();
    List<ImageView> listimgo = new ArrayList<ImageView>();
    List<ImageView> tempimgv = new ArrayList<ImageView>();

    @SuppressLint({"MissingInflatedId", "RestrictedApi"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orta2);
        imgo1 = (ImageView) findViewById(R.id.imgo1);imgo2 = (ImageView) findViewById(R.id.imgo2);
        imgo3 = (ImageView) findViewById(R.id.imgo3);imgo4 = (ImageView) findViewById(R.id.imgo4);
        imgo5 = (ImageView) findViewById(R.id.imgo5);imgo6 = (ImageView) findViewById(R.id.imgo6);
        imgo7 = (ImageView) findViewById(R.id.imgo7);imgo8 = (ImageView) findViewById(R.id.imgo8);
        imgo9 = (ImageView) findViewById(R.id.imgo9);imgo10 = (ImageView) findViewById(R.id.imgo10);
        imgo11 = (ImageView) findViewById(R.id.imgo11);imgo12 = (ImageView) findViewById(R.id.imgo12);
        imgo13 = (ImageView) findViewById(R.id.imgo13);imgo14 = (ImageView) findViewById(R.id.imgo14);
        imgo15 = (ImageView) findViewById(R.id.imgo15);imgo16 = (ImageView) findViewById(R.id.imgo16);
        txt_sureyi_goster = findViewById(R.id.txt_sureyi_goster);
        btn_sureyi_baslat = findViewById(R.id.btn_sureyi_baslat);
        textView2 = findViewById(R.id.textView2);
        textView5 = findViewById(R.id.textView5);
        imgo1.setEnabled(false);imgo2.setEnabled(false);imgo3.setEnabled(false);imgo4.setEnabled(false);
        imgo5.setEnabled(false);imgo6.setEnabled(false);imgo7.setEnabled(false);imgo8.setEnabled(false);
        imgo9.setEnabled(false);imgo10.setEnabled(false);imgo11.setEnabled(false);imgo12.setEnabled(false);
        imgo13.setEnabled(false);imgo14.setEnabled(false);imgo15.setEnabled(false);imgo16.setEnabled(false);
        listimgo.add(imgo1);listimgo.add(imgo2);listimgo.add(imgo3);listimgo.add(imgo4);
        listimgo.add(imgo5);listimgo.add(imgo6);listimgo.add(imgo7);listimgo.add(imgo8);
        listimgo.add(imgo9);listimgo.add(imgo10);listimgo.add(imgo11);listimgo.add(imgo12);
        listimgo.add(imgo13);listimgo.add(imgo14);listimgo.add(imgo15);listimgo.add(imgo16);
        listev.add("slytherin");listev.add("gryffindor");listev.add("hufflepuff");listev.add("ravenclaw");

        for (i = 0; i < listev.size(); i++) {
            db.collection(listev.get(i)).get().addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                @SuppressLint("RestrictedApi")
                @Override
                public void onComplete(@NonNull Task<QuerySnapshot> task) {

                    for (QueryDocumentSnapshot document : task.getResult()) {
                        listisim.add(document.getString("ad"));
                        listpuan.add(document.getString("puan"));
                        listev1.add(document.getString("ev"));
                        byte[] decodedString = Base64.decode(document.getString("img"), Base64.DEFAULT);
                        Bitmap decodedByte = BitmapFactory.decodeByteArray(decodedString, 0, decodedString.length);
                        listimg.add(decodedByte);

                    }
                    for (n = 0; n < listisim.size(); n++) {
                        kartdizio[n] = new kartlar(listisim.get(n), listimg.get(n), listev1.get(n), listpuan.get(n));
                    }
                    Collections.shuffle(Arrays.asList(kartdizio));

                }

            });

        }


        Collections.shuffle(listimgo);

        sure();
        a();
        b();
        c();
        d();
        e();
        f();
        g();
        h();
        i();
        j();
        k();
        l();
        m();
        n();
        o();
        p();
    }
    public void a(){

            listimgo.get(0).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if(acilmis.size()==0 || acilmis.size()==1) {
                        if(p==true){
                            listimgo.get(0).setImageBitmap(kartdizio[1].img);
                            p=false;
                            acilmis.add(kartdizio[1].ad);
                            tempimgv.add(listimgo.get(0));
                            acilmispuan.add(kartdizio[1].puan);
                            acilmisev.add(kartdizio[1].ev);
                            textView5.setText(kartdizio[1].ad);
                            if(acilmis.size()==2){
                                if(acilmis.get(0)==acilmis.get(1)){
                                    tempimgv.get(0).setEnabled(false);
                                    tempimgv.get(1).setEnabled(false);
                                    textView2.setText((String.valueOf(Float.parseFloat((String) textView2.getText())+(Integer.parseInt(acilmisev.get(0))*2*((Float.parseFloat((String)txt_sureyi_goster.getText()))/10)*(Integer.parseInt(acilmispuan.get(0)))))));
                                    acilmis.clear();
                                    acilmispuan.clear();
                                    tempimgv.clear();
                                    acilmisev.clear();
                                    f++;
                                }
                                else {
                                    if(acilmisev.get(0)==acilmisev.get(1)){
                                        textView2.setText(String.valueOf(Float.parseFloat((String) textView2.getText())- ((Integer.parseInt(acilmispuan.get(0))+Integer.parseInt(acilmispuan.get(1)))/Integer.parseInt(acilmisev.get(0)))*((45-Integer.parseInt((String)txt_sureyi_goster.getText())))/10 ));
                                    }
                                    else{
                                        textView2.setText(String.valueOf(Float.parseFloat((String) textView2.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1))*((45-Float.parseFloat((String)txt_sureyi_goster.getText())))/10 )));
                                    }
                                }
                            }
                        }
                        else{
                            listimgo.get(0).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                            p=true;
                            acilmis.remove(kartdizio[1].ad);
                            tempimgv.remove(listimgo.get(0));
                            acilmispuan.remove(kartdizio[1].puan);
                            acilmisev.remove(kartdizio[1].ev);
                        }
                    }
                    else {
                        if(p==false) {
                            acilmis.remove(kartdizio[1].ad);
                            tempimgv.remove(listimgo.get(0));
                            acilmispuan.remove(kartdizio[1].puan);
                            acilmisev.remove(kartdizio[1].ev);
                            listimgo.get(0).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                            p=true;
                        }
                    }
                }
            });

    }
    public void b(){

        listimgo.get(1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(acilmis.size()==0 || acilmis.size()==1) {
                    if(q==true){
                        listimgo.get(1).setImageBitmap(kartdizio[1].img);
                        q=false;
                        acilmis.add(kartdizio[1].ad);
                        tempimgv.add(listimgo.get(1));
                        acilmispuan.add(kartdizio[1].puan);
                        acilmisev.add(kartdizio[1].ev);
                        textView5.setText(kartdizio[1].ad);
                        if(acilmis.size()==2){
                            if(acilmis.get(0)==acilmis.get(1)){
                                tempimgv.get(0).setEnabled(false);
                                tempimgv.get(1).setEnabled(false);
                                textView2.setText((String.valueOf(Float.parseFloat((String) textView2.getText())+(Integer.parseInt(acilmisev.get(0))*2*((Float.parseFloat((String)txt_sureyi_goster.getText()))/10)*(Integer.parseInt(acilmispuan.get(0)))))));
                                acilmis.clear();
                                acilmispuan.clear();
                                tempimgv.clear();
                                acilmisev.clear();
                                f++;
                            }
                            else {
                                if(acilmisev.get(0)==acilmisev.get(1)){
                                    textView2.setText(String.valueOf(Float.parseFloat((String) textView2.getText())- ((Integer.parseInt(acilmispuan.get(0))+Integer.parseInt(acilmispuan.get(1)))/Integer.parseInt(acilmisev.get(0)))*((45-Integer.parseInt((String)txt_sureyi_goster.getText())))/10 ));
                                }
                                else{
                                    textView2.setText(String.valueOf(Float.parseFloat((String) textView2.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1))*((45-Float.parseFloat((String)txt_sureyi_goster.getText())))/10 )));
                                }
                            }
                        }
                    }
                    else{
                        listimgo.get(1).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        q=true;
                        acilmis.remove(kartdizio[1].ad);
                        tempimgv.remove(listimgo.get(1));
                        acilmispuan.remove(kartdizio[1].puan);
                        acilmisev.remove(kartdizio[1].ev);
                    }
                }
                else {
                    if(q==false) {
                        acilmis.remove(kartdizio[1].ad);
                        tempimgv.remove(listimgo.get(1));
                        acilmispuan.remove(kartdizio[1].puan);
                        acilmisev.remove(kartdizio[1].ev);
                        listimgo.get(1).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        q=true;
                    }
                }
            }
        });

    }
    public void c(){

        listimgo.get(2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(acilmis.size()==0 || acilmis.size()==1) {
                    if(s==true){
                        listimgo.get(2).setImageBitmap(kartdizio[2].img);
                        s=false;
                        acilmis.add(kartdizio[2].ad);
                        tempimgv.add(listimgo.get(2));
                        acilmispuan.add(kartdizio[2].puan);
                        acilmisev.add(kartdizio[2].ev);
                        textView5.setText(kartdizio[2].ad);
                        if(acilmis.size()==2){
                            if(acilmis.get(0)==acilmis.get(1)){
                                tempimgv.get(0).setEnabled(false);
                                tempimgv.get(1).setEnabled(false);
                                textView2.setText((String.valueOf(Float.parseFloat((String) textView2.getText())+(Integer.parseInt(acilmisev.get(0))*2*((Float.parseFloat((String)txt_sureyi_goster.getText()))/10)*(Integer.parseInt(acilmispuan.get(0)))))));
                                acilmis.clear();
                                acilmispuan.clear();
                                tempimgv.clear();
                                acilmisev.clear();
                                f++;
                            }
                            else {
                                if(acilmisev.get(0)==acilmisev.get(1)){
                                    textView2.setText(String.valueOf(Float.parseFloat((String) textView2.getText())- ((Integer.parseInt(acilmispuan.get(0))+Integer.parseInt(acilmispuan.get(1)))/Integer.parseInt(acilmisev.get(0)))*((45-Integer.parseInt((String)txt_sureyi_goster.getText())))/10 ));
                                }
                                else{
                                    textView2.setText(String.valueOf(Float.parseFloat((String) textView2.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1))*((45-Float.parseFloat((String)txt_sureyi_goster.getText())))/10 )));
                                }
                            }
                        }
                    }
                    else{
                        listimgo.get(2).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        s=true;
                        acilmis.remove(kartdizio[2].ad);
                        tempimgv.remove(listimgo.get(2));
                        acilmispuan.remove(kartdizio[2].puan);
                        acilmisev.remove(kartdizio[2].ev);
                    }
                }
                else {
                    if(s==false) {
                        acilmis.remove(kartdizio[2].ad);
                        tempimgv.remove(listimgo.get(2));
                        acilmispuan.remove(kartdizio[2].puan);
                        acilmisev.remove(kartdizio[2].ev);
                        listimgo.get(2).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        s=true;
                    }
                }
            }
        });

    }
    public void d(){

        listimgo.get(3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(acilmis.size()==0 || acilmis.size()==1) {
                    if(t==true){
                        listimgo.get(3).setImageBitmap(kartdizio[2].img);
                        t=false;
                        acilmis.add(kartdizio[2].ad);
                        tempimgv.add(listimgo.get(3));
                        acilmispuan.add(kartdizio[2].puan);
                        acilmisev.add(kartdizio[2].ev);
                        textView5.setText(kartdizio[2].ad);
                        if(acilmis.size()==2){
                            if(acilmis.get(0)==acilmis.get(1)){
                                tempimgv.get(0).setEnabled(false);
                                tempimgv.get(1).setEnabled(false);
                                textView2.setText((String.valueOf(Float.parseFloat((String) textView2.getText())+(Integer.parseInt(acilmisev.get(0))*2*((Float.parseFloat((String)txt_sureyi_goster.getText()))/10)*(Integer.parseInt(acilmispuan.get(0)))))));
                                acilmis.clear();
                                acilmispuan.clear();
                                tempimgv.clear();
                                acilmisev.clear();
                                f++;
                            }
                            else {
                                if(acilmisev.get(0)==acilmisev.get(1)){
                                    textView2.setText(String.valueOf(Float.parseFloat((String) textView2.getText())- ((Integer.parseInt(acilmispuan.get(0))+Integer.parseInt(acilmispuan.get(1)))/Integer.parseInt(acilmisev.get(0)))*((45-Integer.parseInt((String)txt_sureyi_goster.getText())))/10 ));
                                }
                                else{
                                    textView2.setText(String.valueOf(Float.parseFloat((String) textView2.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1))*((45-Float.parseFloat((String)txt_sureyi_goster.getText())))/10 )));
                                }
                            }
                        }
                    }
                    else{
                        listimgo.get(3).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        t=true;
                        acilmis.remove(kartdizio[2].ad);
                        tempimgv.remove(listimgo.get(3));
                        acilmispuan.remove(kartdizio[2].puan);
                        acilmisev.remove(kartdizio[2].ev);
                    }
                }
                else {
                    if(t==false) {
                        acilmis.remove(kartdizio[2].ad);
                        tempimgv.remove(listimgo.get(3));
                        acilmispuan.remove(kartdizio[2].puan);
                        acilmisev.remove(kartdizio[2].ev);
                        listimgo.get(3).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        t=true;
                    }
                }
            }
        });

    }
    public void e(){

        listimgo.get(4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(acilmis.size()==0 || acilmis.size()==1) {
                    if(u==true){
                        listimgo.get(4).setImageBitmap(kartdizio[3].img);
                        u=false;
                        acilmis.add(kartdizio[3].ad);
                        tempimgv.add(listimgo.get(4));
                        acilmispuan.add(kartdizio[3].puan);
                        acilmisev.add(kartdizio[3].ev);
                        textView5.setText(kartdizio[3].ad);
                        if(acilmis.size()==2){
                            if(acilmis.get(0)==acilmis.get(1)){
                                tempimgv.get(0).setEnabled(false);
                                tempimgv.get(1).setEnabled(false);
                                textView2.setText((String.valueOf(Float.parseFloat((String) textView2.getText())+(Integer.parseInt(acilmisev.get(0))*2*((Float.parseFloat((String)txt_sureyi_goster.getText()))/10)*(Integer.parseInt(acilmispuan.get(0)))))));
                                acilmis.clear();
                                acilmispuan.clear();
                                tempimgv.clear();
                                acilmisev.clear();
                                f++;
                            }
                            else {
                                if(acilmisev.get(0)==acilmisev.get(1)){
                                    textView2.setText(String.valueOf(Float.parseFloat((String) textView2.getText())- ((Integer.parseInt(acilmispuan.get(0))+Integer.parseInt(acilmispuan.get(1)))/Integer.parseInt(acilmisev.get(0)))*((45-Integer.parseInt((String)txt_sureyi_goster.getText())))/10 ));
                                }
                                else{
                                    textView2.setText(String.valueOf(Float.parseFloat((String) textView2.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1))*((45-Float.parseFloat((String)txt_sureyi_goster.getText())))/10 )));
                                }
                            }
                        }
                    }
                    else{
                        listimgo.get(4).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        u=true;
                        acilmis.remove(kartdizio[3].ad);
                        tempimgv.remove(listimgo.get(4));
                        acilmispuan.remove(kartdizio[3].puan);
                        acilmisev.remove(kartdizio[3].ev);
                    }
                }
                else {
                    if(u==false) {
                        acilmis.remove(kartdizio[3].ad);
                        tempimgv.remove(listimgo.get(4));
                        acilmispuan.remove(kartdizio[3].puan);
                        acilmisev.remove(kartdizio[3].ev);
                        listimgo.get(4).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        u=true;
                    }
                }
            }
        });

    }
    public void f(){

        listimgo.get(5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(acilmis.size()==0 || acilmis.size()==1) {
                    if(v==true){
                        listimgo.get(5).setImageBitmap(kartdizio[3].img);
                        v=false;
                        acilmis.add(kartdizio[3].ad);
                        tempimgv.add(listimgo.get(5));
                        acilmispuan.add(kartdizio[3].puan);
                        acilmisev.add(kartdizio[3].ev);
                        textView5.setText(kartdizio[3].ad);
                        if(acilmis.size()==2){
                            if(acilmis.get(0)==acilmis.get(1)){
                                tempimgv.get(0).setEnabled(false);
                                tempimgv.get(1).setEnabled(false);
                                textView2.setText((String.valueOf(Float.parseFloat((String) textView2.getText())+(Integer.parseInt(acilmisev.get(0))*2*((Float.parseFloat((String)txt_sureyi_goster.getText()))/10)*(Integer.parseInt(acilmispuan.get(0)))))));
                                acilmis.clear();
                                acilmispuan.clear();
                                tempimgv.clear();
                                acilmisev.clear();
                                f++;
                            }
                            else {
                                if(acilmisev.get(0)==acilmisev.get(1)){
                                    textView2.setText(String.valueOf(Float.parseFloat((String) textView2.getText())- ((Integer.parseInt(acilmispuan.get(0))+Integer.parseInt(acilmispuan.get(1)))/Integer.parseInt(acilmisev.get(0)))*((45-Integer.parseInt((String)txt_sureyi_goster.getText())))/10 ));
                                }
                                else{
                                    textView2.setText(String.valueOf(Float.parseFloat((String) textView2.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1))*((45-Float.parseFloat((String)txt_sureyi_goster.getText())))/10 )));
                                }
                            }
                        }
                    }
                    else{
                        listimgo.get(5).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        v=true;
                        acilmis.remove(kartdizio[3].ad);
                        tempimgv.remove(listimgo.get(5));
                        acilmispuan.remove(kartdizio[3].puan);
                        acilmisev.remove(kartdizio[3].ev);
                    }
                }
                else {
                    if(v==false) {
                        acilmis.remove(kartdizio[3].ad);
                        tempimgv.remove(listimgo.get(5));
                        acilmispuan.remove(kartdizio[3].puan);
                        acilmisev.remove(kartdizio[3].ev);
                        listimgo.get(5).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        v=true;
                    }
                }
            }
        });

    }
    public void g(){

        listimgo.get(6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(acilmis.size()==0 || acilmis.size()==1) {
                    if(y==true){
                        listimgo.get(6).setImageBitmap(kartdizio[4].img);
                        y=false;
                        acilmis.add(kartdizio[4].ad);
                        tempimgv.add(listimgo.get(6));
                        acilmispuan.add(kartdizio[4].puan);
                        acilmisev.add(kartdizio[4].ev);
                        textView5.setText(kartdizio[4].ad);
                        if(acilmis.size()==2){
                            if(acilmis.get(0)==acilmis.get(1)){
                                tempimgv.get(0).setEnabled(false);
                                tempimgv.get(1).setEnabled(false);
                                textView2.setText((String.valueOf(Float.parseFloat((String) textView2.getText())+(Integer.parseInt(acilmisev.get(0))*2*((Float.parseFloat((String)txt_sureyi_goster.getText()))/10)*(Integer.parseInt(acilmispuan.get(0)))))));
                                acilmis.clear();
                                acilmispuan.clear();
                                tempimgv.clear();
                                acilmisev.clear();
                                f++;
                            }
                            else {
                                if(acilmisev.get(0)==acilmisev.get(1)){
                                    textView2.setText(String.valueOf(Float.parseFloat((String) textView2.getText())- ((Integer.parseInt(acilmispuan.get(0))+Integer.parseInt(acilmispuan.get(1)))/Integer.parseInt(acilmisev.get(0)))*((45-Integer.parseInt((String)txt_sureyi_goster.getText())))/10 ));
                                }
                                else{
                                    textView2.setText(String.valueOf(Float.parseFloat((String) textView2.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1))*((45-Float.parseFloat((String)txt_sureyi_goster.getText())))/10 )));
                                }
                            }
                        }
                    }
                    else{
                        listimgo.get(6).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        y=true;
                        acilmis.remove(kartdizio[4].ad);
                        tempimgv.remove(listimgo.get(6));
                        acilmispuan.remove(kartdizio[4].puan);
                        acilmisev.remove(kartdizio[4].ev);
                    }
                }
                else {
                    if(y==false) {
                        acilmis.remove(kartdizio[4].ad);
                        tempimgv.remove(listimgo.get(6));
                        acilmispuan.remove(kartdizio[4].puan);
                        acilmisev.remove(kartdizio[4].ev);
                        listimgo.get(6).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        y=true;
                    }
                }
            }
        });

    }
    public void h(){

        listimgo.get(7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(acilmis.size()==0 || acilmis.size()==1) {
                    if(z==true){
                        listimgo.get(7).setImageBitmap(kartdizio[4].img);
                        z=false;
                        acilmis.add(kartdizio[4].ad);
                        tempimgv.add(listimgo.get(7));
                        acilmispuan.add(kartdizio[4].puan);
                        acilmisev.add(kartdizio[4].ev);
                        textView5.setText(kartdizio[4].ad);
                        if(acilmis.size()==2){
                            if(acilmis.get(0)==acilmis.get(1)){
                                tempimgv.get(0).setEnabled(false);
                                tempimgv.get(1).setEnabled(false);
                                textView2.setText((String.valueOf(Float.parseFloat((String) textView2.getText())+(Integer.parseInt(acilmisev.get(0))*2*((Float.parseFloat((String)txt_sureyi_goster.getText()))/10)*(Integer.parseInt(acilmispuan.get(0)))))));
                                acilmis.clear();
                                acilmispuan.clear();
                                tempimgv.clear();
                                acilmisev.clear();
                                f++;
                            }
                            else {
                                if(acilmisev.get(0)==acilmisev.get(1)){
                                    textView2.setText(String.valueOf(Float.parseFloat((String) textView2.getText())- ((Integer.parseInt(acilmispuan.get(0))+Integer.parseInt(acilmispuan.get(1)))/Integer.parseInt(acilmisev.get(0)))*((45-Integer.parseInt((String)txt_sureyi_goster.getText())))/10 ));
                                }
                                else{
                                    textView2.setText(String.valueOf(Float.parseFloat((String) textView2.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1))*((45-Float.parseFloat((String)txt_sureyi_goster.getText())))/10 )));
                                }
                            }
                        }
                    }
                    else{
                        listimgo.get(7).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        z=true;
                        acilmis.remove(kartdizio[4].ad);
                        tempimgv.remove(listimgo.get(7));
                        acilmispuan.remove(kartdizio[4].puan);
                        acilmisev.remove(kartdizio[4].ev);
                    }
                }
                else {
                    if(z==false) {
                        acilmis.remove(kartdizio[4].ad);
                        tempimgv.remove(listimgo.get(7));
                        acilmispuan.remove(kartdizio[4].puan);
                        acilmisev.remove(kartdizio[4].ev);
                        listimgo.get(7).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        z=true;
                    }
                }
            }
        });

    }
    public void i(){

        listimgo.get(8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(acilmis.size()==0 || acilmis.size()==1) {
                    if(r==true){
                        listimgo.get(8).setImageBitmap(kartdizio[5].img);
                        r=false;
                        acilmis.add(kartdizio[5].ad);
                        tempimgv.add(listimgo.get(8));
                        acilmispuan.add(kartdizio[5].puan);
                        acilmisev.add(kartdizio[5].ev);
                        textView5.setText(kartdizio[5].ad);
                        if(acilmis.size()==2){
                            if(acilmis.get(0)==acilmis.get(1)){
                                tempimgv.get(0).setEnabled(false);
                                tempimgv.get(1).setEnabled(false);
                                textView2.setText((String.valueOf(Float.parseFloat((String) textView2.getText())+(Integer.parseInt(acilmisev.get(0))*2*((Float.parseFloat((String)txt_sureyi_goster.getText()))/10)*(Integer.parseInt(acilmispuan.get(0)))))));
                                acilmis.clear();
                                acilmispuan.clear();
                                tempimgv.clear();
                                acilmisev.clear();
                                f++;
                            }
                            else {
                                if(acilmisev.get(0)==acilmisev.get(1)){
                                    textView2.setText(String.valueOf(Float.parseFloat((String) textView2.getText())- ((Integer.parseInt(acilmispuan.get(0))+Integer.parseInt(acilmispuan.get(1)))/Integer.parseInt(acilmisev.get(0)))*((45-Integer.parseInt((String)txt_sureyi_goster.getText())))/10 ));
                                }
                                else{
                                    textView2.setText(String.valueOf(Float.parseFloat((String) textView2.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1))*((45-Float.parseFloat((String)txt_sureyi_goster.getText())))/10 )));
                                }
                            }
                        }
                    }
                    else{
                        listimgo.get(8).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        r=true;
                        acilmis.remove(kartdizio[5].ad);
                        tempimgv.remove(listimgo.get(8));
                        acilmispuan.remove(kartdizio[5].puan);
                        acilmisev.remove(kartdizio[5].ev);
                    }
                }
                else {
                    if(r==false) {
                        acilmis.remove(kartdizio[5].ad);
                        tempimgv.remove(listimgo.get(8));
                        acilmispuan.remove(kartdizio[5].puan);
                        acilmisev.remove(kartdizio[5].ev);
                        listimgo.get(8).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        r=true;
                    }
                }
            }
        });

    }
    public void j(){

        listimgo.get(9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(acilmis.size()==0 || acilmis.size()==1) {
                    if(o==true){
                        listimgo.get(9).setImageBitmap(kartdizio[5].img);
                        o=false;
                        acilmis.add(kartdizio[5].ad);
                        tempimgv.add(listimgo.get(9));
                        acilmispuan.add(kartdizio[5].puan);
                        acilmisev.add(kartdizio[5].ev);
                        textView5.setText(kartdizio[5].ad);
                        if(acilmis.size()==2){
                            if(acilmis.get(0)==acilmis.get(1)){
                                tempimgv.get(0).setEnabled(false);
                                tempimgv.get(1).setEnabled(false);
                                textView2.setText((String.valueOf(Float.parseFloat((String) textView2.getText())+(Integer.parseInt(acilmisev.get(0))*2*((Float.parseFloat((String)txt_sureyi_goster.getText()))/10)*(Integer.parseInt(acilmispuan.get(0)))))));
                                acilmis.clear();
                                acilmispuan.clear();
                                tempimgv.clear();
                                acilmisev.clear();
                                f++;
                            }
                            else {
                                if(acilmisev.get(0)==acilmisev.get(1)){
                                    textView2.setText(String.valueOf(Float.parseFloat((String) textView2.getText())- ((Integer.parseInt(acilmispuan.get(0))+Integer.parseInt(acilmispuan.get(1)))/Integer.parseInt(acilmisev.get(0)))*((45-Integer.parseInt((String)txt_sureyi_goster.getText())))/10 ));
                                }
                                else{
                                    textView2.setText(String.valueOf(Float.parseFloat((String) textView2.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1))*((45-Float.parseFloat((String)txt_sureyi_goster.getText())))/10 )));
                                }
                            }
                        }
                    }
                    else{
                        listimgo.get(9).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        o=true;
                        acilmis.remove(kartdizio[5].ad);
                        tempimgv.remove(listimgo.get(9));
                        acilmispuan.remove(kartdizio[5].puan);
                        acilmisev.remove(kartdizio[5].ev);
                    }
                }
                else {
                    if(o==false) {
                        acilmis.remove(kartdizio[5].ad);
                        tempimgv.remove(listimgo.get(9));
                        acilmispuan.remove(kartdizio[5].puan);
                        acilmisev.remove(kartdizio[5].ev);
                        listimgo.get(9).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        o=true;
                    }
                }
            }
        });

    }
    public void k(){

        listimgo.get(10).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(acilmis.size()==0 || acilmis.size()==1) {
                    if(e==true){
                        listimgo.get(10).setImageBitmap(kartdizio[6].img);
                        e=false;
                        acilmis.add(kartdizio[6].ad);
                        tempimgv.add(listimgo.get(10));
                        acilmispuan.add(kartdizio[6].puan);
                        acilmisev.add(kartdizio[6].ev);
                        textView5.setText(kartdizio[6].ad);
                        if(acilmis.size()==2){
                            if(acilmis.get(0)==acilmis.get(1)){
                                tempimgv.get(0).setEnabled(false);
                                tempimgv.get(1).setEnabled(false);
                                textView2.setText((String.valueOf(Float.parseFloat((String) textView2.getText())+(Integer.parseInt(acilmisev.get(0))*2*((Float.parseFloat((String)txt_sureyi_goster.getText()))/10)*(Integer.parseInt(acilmispuan.get(0)))))));
                                acilmis.clear();
                                acilmispuan.clear();
                                tempimgv.clear();
                                acilmisev.clear();
                                f++;
                            }
                            else {
                                if(acilmisev.get(0)==acilmisev.get(1)){
                                    textView2.setText(String.valueOf(Float.parseFloat((String) textView2.getText())- ((Integer.parseInt(acilmispuan.get(0))+Integer.parseInt(acilmispuan.get(1)))/Integer.parseInt(acilmisev.get(0)))*((45-Integer.parseInt((String)txt_sureyi_goster.getText())))/10 ));
                                }
                                else{
                                    textView2.setText(String.valueOf(Float.parseFloat((String) textView2.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1))*((45-Float.parseFloat((String)txt_sureyi_goster.getText())))/10 )));
                                }
                            }
                        }
                    }
                    else{
                        listimgo.get(10).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        e=true;
                        acilmis.remove(kartdizio[6].ad);
                        tempimgv.remove(listimgo.get(10));
                        acilmispuan.remove(kartdizio[6].puan);
                        acilmisev.remove(kartdizio[6].ev);
                    }
                }
                else {
                    if(e==false) {
                        acilmis.remove(kartdizio[6].ad);
                        tempimgv.remove(listimgo.get(10));
                        acilmispuan.remove(kartdizio[6].puan);
                        acilmisev.remove(kartdizio[6].ev);
                        listimgo.get(10).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        e=true;
                    }
                }
            }
        });

    }
    public void l(){

        listimgo.get(11).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(acilmis.size()==0 || acilmis.size()==1) {
                    if(b==true){
                        listimgo.get(11).setImageBitmap(kartdizio[6].img);
                        b=false;
                        acilmis.add(kartdizio[6].ad);
                        tempimgv.add(listimgo.get(11));
                        acilmispuan.add(kartdizio[6].puan);
                        acilmisev.add(kartdizio[6].ev);
                        textView5.setText(kartdizio[6].ad);
                        if(acilmis.size()==2){
                            if(acilmis.get(0)==acilmis.get(1)){
                                tempimgv.get(0).setEnabled(false);
                                tempimgv.get(1).setEnabled(false);
                                textView2.setText((String.valueOf(Float.parseFloat((String) textView2.getText())+(Integer.parseInt(acilmisev.get(0))*2*((Float.parseFloat((String)txt_sureyi_goster.getText()))/10)*(Integer.parseInt(acilmispuan.get(0)))))));
                                acilmis.clear();
                                acilmispuan.clear();
                                tempimgv.clear();
                                acilmisev.clear();
                                f++;
                            }
                            else {
                                if(acilmisev.get(0)==acilmisev.get(1)){
                                    textView2.setText(String.valueOf(Float.parseFloat((String) textView2.getText())- ((Integer.parseInt(acilmispuan.get(0))+Integer.parseInt(acilmispuan.get(1)))/Integer.parseInt(acilmisev.get(0)))*((45-Integer.parseInt((String)txt_sureyi_goster.getText())))/10 ));
                                }
                                else{
                                    textView2.setText(String.valueOf(Float.parseFloat((String) textView2.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1))*((45-Float.parseFloat((String)txt_sureyi_goster.getText())))/10 )));
                                }
                            }
                        }
                    }
                    else{
                        listimgo.get(11).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        b=true;
                        acilmis.remove(kartdizio[6].ad);
                        tempimgv.remove(listimgo.get(11));
                        acilmispuan.remove(kartdizio[6].puan);
                        acilmisev.remove(kartdizio[6].ev);
                    }
                }
                else {
                    if(b==false) {
                        acilmis.remove(kartdizio[6].ad);
                        tempimgv.remove(listimgo.get(11));
                        acilmispuan.remove(kartdizio[6].puan);
                        acilmisev.remove(kartdizio[6].ev);
                        listimgo.get(11).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        b=true;
                    }
                }
            }
        });

    }
    public void m(){

        listimgo.get(12).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(acilmis.size()==0 || acilmis.size()==1) {
                    if(c==true){
                        listimgo.get(12).setImageBitmap(kartdizio[7].img);
                        c=false;
                        acilmis.add(kartdizio[7].ad);
                        tempimgv.add(listimgo.get(12));
                        acilmispuan.add(kartdizio[7].puan);
                        acilmisev.add(kartdizio[7].ev);
                        textView5.setText(kartdizio[7].ad);
                        if(acilmis.size()==2){
                            if(acilmis.get(0)==acilmis.get(1)){
                                tempimgv.get(0).setEnabled(false);
                                tempimgv.get(1).setEnabled(false);
                                textView2.setText((String.valueOf(Float.parseFloat((String) textView2.getText())+(Integer.parseInt(acilmisev.get(0))*2*((Float.parseFloat((String)txt_sureyi_goster.getText()))/10)*(Integer.parseInt(acilmispuan.get(0)))))));
                                acilmis.clear();
                                acilmispuan.clear();
                                tempimgv.clear();
                                acilmisev.clear();
                                f++;
                            }
                            else {
                                if(acilmisev.get(0)==acilmisev.get(1)){
                                    textView2.setText(String.valueOf(Float.parseFloat((String) textView2.getText())- ((Integer.parseInt(acilmispuan.get(0))+Integer.parseInt(acilmispuan.get(1)))/Integer.parseInt(acilmisev.get(0)))*((45-Integer.parseInt((String)txt_sureyi_goster.getText())))/10 ));
                                }
                                else{
                                    textView2.setText(String.valueOf(Float.parseFloat((String) textView2.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1))*((45-Float.parseFloat((String)txt_sureyi_goster.getText())))/10 )));
                                }
                            }
                        }
                    }
                    else{
                        listimgo.get(12).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        c=true;
                        acilmis.remove(kartdizio[7].ad);
                        tempimgv.remove(listimgo.get(12));
                        acilmispuan.remove(kartdizio[7].puan);
                        acilmisev.remove(kartdizio[7].ev);
                    }
                }
                else {
                    if(c==false) {
                        acilmis.remove(kartdizio[7].ad);
                        tempimgv.remove(listimgo.get(12));
                        acilmispuan.remove(kartdizio[7].puan);
                        acilmisev.remove(kartdizio[7].ev);
                        listimgo.get(12).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        c =true;
                    }
                }
            }
        });

    }
    public void n(){

        listimgo.get(13).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(acilmis.size()==0 || acilmis.size()==1) {
                    if(d==true){
                        listimgo.get(13).setImageBitmap(kartdizio[7].img);
                        d=false;
                        acilmis.add(kartdizio[7].ad);
                        tempimgv.add(listimgo.get(13));
                        acilmispuan.add(kartdizio[7].puan);
                        acilmisev.add(kartdizio[7].ev);
                        textView5.setText(kartdizio[7].ad);
                        if(acilmis.size()==2){
                            if(acilmis.get(0)==acilmis.get(1)){
                                tempimgv.get(0).setEnabled(false);
                                tempimgv.get(1).setEnabled(false);
                                textView2.setText((String.valueOf(Float.parseFloat((String) textView2.getText())+(Integer.parseInt(acilmisev.get(0))*2*((Float.parseFloat((String)txt_sureyi_goster.getText()))/10)*(Integer.parseInt(acilmispuan.get(0)))))));
                                acilmis.clear();
                                acilmispuan.clear();
                                tempimgv.clear();
                                acilmisev.clear();
                                f++;
                            }
                            else {
                                if(acilmisev.get(0)==acilmisev.get(1)){
                                    textView2.setText(String.valueOf(Float.parseFloat((String) textView2.getText())- ((Integer.parseInt(acilmispuan.get(0))+Integer.parseInt(acilmispuan.get(1)))/Integer.parseInt(acilmisev.get(0)))*((45-Integer.parseInt((String)txt_sureyi_goster.getText())))/10 ));
                                }
                                else{
                                    textView2.setText(String.valueOf(Float.parseFloat((String) textView2.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1))*((45-Float.parseFloat((String)txt_sureyi_goster.getText())))/10 )));
                                }
                            }
                        }
                    }
                    else{
                        listimgo.get(13).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        d=true;
                        acilmis.remove(kartdizio[7].ad);
                        tempimgv.remove(listimgo.get(13));
                        acilmispuan.remove(kartdizio[7].puan);
                        acilmisev.remove(kartdizio[7].ev);
                    }
                }
                else {
                    if(d==false) {
                        acilmis.remove(kartdizio[7].ad);
                        tempimgv.remove(listimgo.get(13));
                        acilmispuan.remove(kartdizio[7].puan);
                        acilmisev.remove(kartdizio[7].ev);
                        listimgo.get(13).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        d=true;
                    }
                }
            }
        });

    }
    public void o(){

        listimgo.get(14).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(acilmis.size()==0 || acilmis.size()==1) {
                    if(g==true){
                        listimgo.get(14).setImageBitmap(kartdizio[8].img);
                        g=false;
                        acilmis.add(kartdizio[8].ad);
                        tempimgv.add(listimgo.get(14));
                        acilmispuan.add(kartdizio[8].puan);
                        acilmisev.add(kartdizio[8].ev);
                        textView5.setText(kartdizio[8].ad);
                        if(acilmis.size()==2){
                            if(acilmis.get(0)==acilmis.get(1)){
                                tempimgv.get(0).setEnabled(false);
                                tempimgv.get(1).setEnabled(false);
                                textView2.setText((String.valueOf(Float.parseFloat((String) textView2.getText())+(Integer.parseInt(acilmisev.get(0))*2*((Float.parseFloat((String)txt_sureyi_goster.getText()))/10)*(Integer.parseInt(acilmispuan.get(0)))))));
                                acilmis.clear();
                                acilmispuan.clear();
                                tempimgv.clear();
                                acilmisev.clear();
                                f++;
                            }
                            else {
                                if(acilmisev.get(0)==acilmisev.get(1)){
                                    textView2.setText(String.valueOf(Float.parseFloat((String) textView2.getText())- ((Integer.parseInt(acilmispuan.get(0))+Integer.parseInt(acilmispuan.get(1)))/Integer.parseInt(acilmisev.get(0)))*((45-Integer.parseInt((String)txt_sureyi_goster.getText())))/10 ));
                                }
                                else{
                                    textView2.setText(String.valueOf(Float.parseFloat((String) textView2.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1))*((45-Float.parseFloat((String)txt_sureyi_goster.getText())))/10 )));
                                }
                            }
                        }
                    }
                    else{
                        listimgo.get(14).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        g=true;
                        acilmis.remove(kartdizio[8].ad);
                        tempimgv.remove(listimgo.get(14));
                        acilmispuan.remove(kartdizio[8].puan);
                        acilmisev.remove(kartdizio[8].ev);
                    }
                }
                else {
                    if(g==false) {
                        acilmis.remove(kartdizio[8].ad);
                        tempimgv.remove(listimgo.get(14));
                        acilmispuan.remove(kartdizio[8].puan);
                        acilmisev.remove(kartdizio[8].ev);
                        listimgo.get(14).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        g=true;
                    }
                }
            }
        });

    }
    public void p(){

        listimgo.get(15).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(acilmis.size()==0 || acilmis.size()==1) {
                    if(h==true){
                        listimgo.get(15).setImageBitmap(kartdizio[8].img);
                        h=false;
                        acilmis.add(kartdizio[8].ad);
                        tempimgv.add(listimgo.get(15));
                        acilmispuan.add(kartdizio[8].puan);
                        acilmisev.add(kartdizio[8].ev);
                        textView5.setText(kartdizio[8].ad);
                        if(acilmis.size()==2){
                            if(acilmis.get(0)==acilmis.get(1)){
                                tempimgv.get(0).setEnabled(false);
                                tempimgv.get(1).setEnabled(false);
                                textView2.setText((String.valueOf(Float.parseFloat((String) textView2.getText())+(Integer.parseInt(acilmisev.get(0))*2*((Float.parseFloat((String)txt_sureyi_goster.getText()))/10)*(Integer.parseInt(acilmispuan.get(0)))))));
                                acilmis.clear();
                                acilmispuan.clear();
                                tempimgv.clear();
                                acilmisev.clear();
                                f++;
                            }
                            else {
                                if(acilmisev.get(0)==acilmisev.get(1)){
                                    textView2.setText(String.valueOf(Float.parseFloat((String) textView2.getText())- ((Integer.parseInt(acilmispuan.get(0))+Integer.parseInt(acilmispuan.get(1)))/Integer.parseInt(acilmisev.get(0)))*((45-Integer.parseInt((String)txt_sureyi_goster.getText())))/10 ));
                                }
                                else{
                                    textView2.setText(String.valueOf(Float.parseFloat((String) textView2.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1))*((45-Float.parseFloat((String)txt_sureyi_goster.getText())))/10 )));
                                }
                            }
                        }
                    }
                    else{
                        listimgo.get(15).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        h=true;
                        acilmis.remove(kartdizio[8].ad);
                        tempimgv.remove(listimgo.get(15));
                        acilmispuan.remove(kartdizio[8].puan);
                        acilmisev.remove(kartdizio[8].ev);
                    }
                }
                else {
                    if(h==false) {
                        acilmis.remove(kartdizio[8].ad);
                        tempimgv.remove(listimgo.get(15));
                        acilmispuan.remove(kartdizio[8].puan);
                        acilmisev.remove(kartdizio[8].ev);
                        listimgo.get(15).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        h=true;
                    }
                }
            }
        });

    }
    public void sure(){
        btn_sureyi_baslat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btn_sureyi_baslat.setEnabled(false);
                imgo1.setEnabled(true);imgo2.setEnabled(true);imgo3.setEnabled(true);imgo4.setEnabled(true);
                imgo5.setEnabled(true);imgo6.setEnabled(true);imgo7.setEnabled(true);imgo8.setEnabled(true);
                imgo9.setEnabled(true);imgo10.setEnabled(true);imgo11.setEnabled(true);imgo12.setEnabled(true);
                imgo13.setEnabled(true);imgo14.setEnabled(true);imgo15.setEnabled(true);imgo16.setEnabled(true);

                countDownTimero.start();

            }

        });
    }
}