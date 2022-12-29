package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Html;
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

public class zorcokActivity extends AppCompatActivity {
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    private ImageView imgz1;private ImageView imgz2;private ImageView imgz3;private ImageView imgz4;
    private ImageView imgz5;private ImageView imgz6;private ImageView imgz7;private ImageView imgz8;
    private ImageView imgz9;private ImageView imgz10;private ImageView imgz11;private ImageView imgz12;
    private ImageView imgz13;private ImageView imgz14;private ImageView imgz15;private ImageView imgz16;
    private ImageView imgz17;private ImageView imgz18;private ImageView imgz19;private ImageView imgz20;
    private ImageView imgz21;private ImageView imgz22;private ImageView imgz23;private ImageView imgz24;
    private ImageView imgz25;private ImageView imgz26;private ImageView imgz27;private ImageView imgz28;
    private ImageView imgz29;private ImageView imgz30;private ImageView imgz31;private ImageView imgz32;
    private ImageView imgz33;private ImageView imgz34;private ImageView imgz35;private ImageView imgz36;
    private TextView textView2;
    private TextView textView4;
    private TextView textView6;
    private TextView textView5;
    private TextView textView7;
    private TextView txt_sureyi_goster;
    private Button btn_sureyi_baslat;
    CountDownTimer countDownTimerz = new CountDownTimer(60000, 1000) {
        @Override
        public void onTick(long l) {
            txt_sureyi_goster.setText("" + l / 1000);
            if (f == 8) {
                countDownTimerz.cancel();
                AlertDialog.Builder builder = new AlertDialog.Builder(zorcokActivity.this);
                builder.setTitle("HARRY POTTER MEMORY MASTER");
                builder.setMessage("TEBRİKLER!" + "\nP1:" + textView2.getText() + "\nP2:" + textView7.getText());
                builder.setNegativeButton("Tamam", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(zorcokActivity.this, ortazorActivity.class);
                        startActivity(intent);
                    }
                });
                builder.show();
            }
            belirt();
        }

        @Override
        public void onFinish() {
            AlertDialog.Builder builder1 = new AlertDialog.Builder(zorcokActivity.this);
            builder1.setTitle("HARRY POTTER MEMORY MASTER");
            builder1.setMessage("SÜRENİZ BİTTİ!" + "\nP1:" + textView2.getText() + "\nP2:" + textView7.getText());
            builder1.setNegativeButton("Tamam", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent intent = new Intent(zorcokActivity.this, ortazorActivity.class);
                    startActivity(intent);
                }
            });
            builder1.show();
            imgz1.setEnabled(false);imgz2.setEnabled(false);imgz3.setEnabled(false);imgz4.setEnabled(false);imgz5.setEnabled(false);imgz6.setEnabled(false);
            imgz7.setEnabled(false);imgz8.setEnabled(false);imgz9.setEnabled(false);imgz10.setEnabled(false);imgz11.setEnabled(false);imgz12.setEnabled(false);
            imgz13.setEnabled(false);imgz14.setEnabled(false);imgz15.setEnabled(false);imgz16.setEnabled(false);imgz17.setEnabled(false);imgz18.setEnabled(false);
            imgz19.setEnabled(false);imgz20.setEnabled(false);imgz21.setEnabled(false);imgz22.setEnabled(false);imgz23.setEnabled(false);imgz24.setEnabled(false);
            imgz25.setEnabled(false);imgz26.setEnabled(false);imgz27.setEnabled(false);imgz28.setEnabled(false);imgz29.setEnabled(false);imgz30.setEnabled(false);
            imgz31.setEnabled(false);imgz32.setEnabled(false);imgz33.setEnabled(false);imgz34.setEnabled(false);imgz35.setEnabled(false);imgz36.setEnabled(false);

        }
    };
    int i = 0;
    int f = 0;
    int n=0;
    boolean p = true;boolean q = true;boolean r = true;boolean s = true;
    boolean t = true;boolean o = true;boolean u = true;boolean v = true;
    boolean y = true;boolean z = true;boolean e = true;boolean d = true;
    boolean g = true;boolean h = true;boolean b = true;boolean c = true;
    boolean pa = true;boolean qa = true;boolean ra = true;boolean sa = true;
    boolean ta = true;boolean oa = true;boolean ua = true;boolean va = true;
    boolean ya = true;boolean za = true;boolean ea = true;boolean da = true;
    boolean pb = true;boolean qb = true;boolean rb = true;boolean sb = true;
    boolean tb = true;boolean ob = true;boolean ub = true;boolean vb = true;

    boolean p1=true;
    boolean p2=false;

    kartlar[] kartdiziz = new kartlar[44];
    List<String> acilmis = new ArrayList<>();
    List<String> acilmispuan = new ArrayList<>();
    List<String> acilmisev = new ArrayList<>();
    List<String> listev = new ArrayList<>();
    List<String> listisim = new ArrayList<>();
    List<String> listev1 = new ArrayList<>();
    List<String> listpuan = new ArrayList<>();
    List<Bitmap> listimg = new ArrayList<Bitmap>();
    List<ImageView> listimgz = new ArrayList<ImageView>();
    List<ImageView> tempimgv = new ArrayList<ImageView>();

    @SuppressLint({"MissingInflatedId", "RestrictedApi"})

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zorcok);


        imgz1 = (ImageView) findViewById(R.id.imgz1);imgz2 = (ImageView) findViewById(R.id.imgz2);
        imgz3 = (ImageView) findViewById(R.id.imgz3);imgz4 = (ImageView) findViewById(R.id.imgz4);
        imgz5 = (ImageView) findViewById(R.id.imgz5);imgz6 = (ImageView) findViewById(R.id.imgz6);
        imgz7 = (ImageView) findViewById(R.id.imgz7);imgz8 = (ImageView) findViewById(R.id.imgz8);
        imgz9 = (ImageView) findViewById(R.id.imgz9);imgz10 = (ImageView) findViewById(R.id.imgz10);
        imgz11 = (ImageView) findViewById(R.id.imgz11);imgz12 = (ImageView) findViewById(R.id.imgz12);
        imgz13 = (ImageView) findViewById(R.id.imgz13);imgz14 = (ImageView) findViewById(R.id.imgz14);
        imgz15 = (ImageView) findViewById(R.id.imgz15);imgz16 = (ImageView) findViewById(R.id.imgz16);
        imgz17 = (ImageView) findViewById(R.id.imgz17);imgz18 = (ImageView) findViewById(R.id.imgz18);
        imgz19 = (ImageView) findViewById(R.id.imgz19);imgz20 = (ImageView) findViewById(R.id.imgz20);
        imgz21 = (ImageView) findViewById(R.id.imgz21);imgz22 = (ImageView) findViewById(R.id.imgz22);
        imgz23 = (ImageView) findViewById(R.id.imgz23);imgz24 = (ImageView) findViewById(R.id.imgz24);
        imgz25 = (ImageView) findViewById(R.id.imgz25);imgz26 = (ImageView) findViewById(R.id.imgz26);
        imgz27 = (ImageView) findViewById(R.id.imgz27);imgz28 = (ImageView) findViewById(R.id.imgz28);
        imgz29 = (ImageView) findViewById(R.id.imgz29);imgz30 = (ImageView) findViewById(R.id.imgz30);
        imgz31 = (ImageView) findViewById(R.id.imgz31);imgz32 = (ImageView) findViewById(R.id.imgz32);
        imgz33 = (ImageView) findViewById(R.id.imgz33);imgz34 = (ImageView) findViewById(R.id.imgz34);
        imgz35 = (ImageView) findViewById(R.id.imgz35);imgz36 = (ImageView) findViewById(R.id.imgz36);
        txt_sureyi_goster = findViewById(R.id.txt_sureyi_goster);
        btn_sureyi_baslat = findViewById(R.id.btn_sureyi_baslat);
        textView2 = findViewById(R.id.textView2);
        textView4 = findViewById(R.id.textView4);
        textView6 = findViewById(R.id.textView6);
        textView5 = findViewById(R.id.textView5);
        textView7 = findViewById(R.id.textView7);
        imgz1.setEnabled(false);imgz2.setEnabled(false);imgz3.setEnabled(false);imgz4.setEnabled(false);imgz5.setEnabled(false);imgz6.setEnabled(false);
        imgz7.setEnabled(false);imgz8.setEnabled(false);imgz9.setEnabled(false);imgz10.setEnabled(false);imgz11.setEnabled(false);imgz12.setEnabled(false);
        imgz13.setEnabled(false);imgz14.setEnabled(false);imgz15.setEnabled(false);imgz16.setEnabled(false);imgz17.setEnabled(false);imgz18.setEnabled(false);
        imgz19.setEnabled(false);imgz20.setEnabled(false);imgz21.setEnabled(false);imgz22.setEnabled(false);imgz23.setEnabled(false);imgz24.setEnabled(false);
        imgz25.setEnabled(false);imgz26.setEnabled(false);imgz27.setEnabled(false);imgz28.setEnabled(false);imgz29.setEnabled(false);imgz30.setEnabled(false);
        imgz31.setEnabled(false);imgz32.setEnabled(false);imgz33.setEnabled(false);imgz34.setEnabled(false);imgz35.setEnabled(false);imgz36.setEnabled(false);
        listimgz.add(imgz1);listimgz.add(imgz2);listimgz.add(imgz3);listimgz.add(imgz4);
        listimgz.add(imgz5);listimgz.add(imgz6);listimgz.add(imgz7);listimgz.add(imgz8);
        listimgz.add(imgz9);listimgz.add(imgz10);listimgz.add(imgz11);listimgz.add(imgz12);
        listimgz.add(imgz13);listimgz.add(imgz14);listimgz.add(imgz15);listimgz.add(imgz16);
        listimgz.add(imgz17);listimgz.add(imgz18);listimgz.add(imgz19);listimgz.add(imgz20);
        listimgz.add(imgz21);listimgz.add(imgz22);listimgz.add(imgz23);listimgz.add(imgz24);
        listimgz.add(imgz25);listimgz.add(imgz26);listimgz.add(imgz27);listimgz.add(imgz28);
        listimgz.add(imgz29);listimgz.add(imgz30);listimgz.add(imgz31);listimgz.add(imgz32);
        listimgz.add(imgz33);listimgz.add(imgz34);listimgz.add(imgz35);listimgz.add(imgz36);
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
                        kartdiziz[n] = new kartlar(listisim.get(n), listimg.get(n), listev1.get(n), listpuan.get(n));
                    }
                    Collections.shuffle(Arrays.asList(kartdiziz));

                }

            });

        }


        Collections.shuffle(listimgz);
        aa();ab();ac();ad();ae();af();
        ba();bb();b();bd();be();bf();
        ca();cb();cc();cd();ce();cf();
        da();db();dc();dd();de();df();
        ea();eb();ec();ed();ef();ee();
        fa();fb();fc();fd();fe();ff();


        sure();
    }
    public void aa(){

        listimgz.get(0).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(acilmis.size()==0 || acilmis.size()==1) {
                    if(p==true){
                        listimgz.get(0).setImageBitmap(kartdiziz[1].img);
                        p=false;
                        acilmis.add(kartdiziz[1].ad);
                        tempimgv.add(listimgz.get(0));
                        acilmispuan.add(kartdiziz[1].puan);
                        acilmisev.add(kartdiziz[1].ev);
                        textView5.setText(kartdiziz[1].ad);
                        if(acilmis.size()==2){
                            if(acilmis.get(0)==acilmis.get(1)){
                                tempimgv.get(0).setEnabled(false);
                                tempimgv.get(1).setEnabled(false);
                                if (p1==true){
                                    textView2.setText((String.valueOf(Integer.parseInt((String) textView2.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }
                                else if(p2==true){
                                    textView7.setText((String.valueOf(Integer.parseInt((String) textView7.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }                               
                                acilmis.clear();
                                acilmispuan.clear();
                                tempimgv.clear();
                                acilmisev.clear();
                                f++;
                            }
                            else {
                                  if(p1==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p1=false;
                                   p2=true;
                               }
                               else if(p2==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p2=false;
                                   p1=true;
                               }
                            }
                        }
                    }
                    else{
                        listimgz.get(0).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        p=true;
                        acilmis.remove(kartdiziz[1].ad);
                        tempimgv.remove(listimgz.get(0));
                        acilmispuan.remove(kartdiziz[1].puan);
                        acilmisev.remove(kartdiziz[1].ev);
                    }
                }
                else {
                    if(p==false) {
                        acilmis.remove(kartdiziz[1].ad);
                        tempimgv.remove(listimgz.get(0));
                        acilmispuan.remove(kartdiziz[1].puan);
                        acilmisev.remove(kartdiziz[1].ev);
                        listimgz.get(0).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        p=true;
                    }
                }
            }
        });

    }
    public void ab(){

        listimgz.get(1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(acilmis.size()==0 || acilmis.size()==1) {
                    if(q==true){
                        listimgz.get(1).setImageBitmap(kartdiziz[1].img);
                        q=false;
                        acilmis.add(kartdiziz[1].ad);
                        tempimgv.add(listimgz.get(1));
                        acilmispuan.add(kartdiziz[1].puan);
                        acilmisev.add(kartdiziz[1].ev);
                        textView5.setText(kartdiziz[1].ad);
                        if(acilmis.size()==2){
                            if(acilmis.get(0)==acilmis.get(1)){
                                tempimgv.get(0).setEnabled(false);
                                tempimgv.get(1).setEnabled(false);
                                if (p1==true){
                                    textView2.setText((String.valueOf(Integer.parseInt((String) textView2.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }
                                else if(p2==true){
                                    textView7.setText((String.valueOf(Integer.parseInt((String) textView7.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }                               
                                acilmis.clear();
                                acilmispuan.clear();
                                tempimgv.clear();
                                acilmisev.clear();
                                f++;
                            }
                            else {
                                  if(p1==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p1=false;
                                   p2=true;
                               }
                               else if(p2==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p2=false;
                                   p1=true;
                               }
                            }
                        }
                    }
                    else{
                        listimgz.get(1).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        q=true;
                        acilmis.remove(kartdiziz[1].ad);
                        tempimgv.remove(listimgz.get(1));
                        acilmispuan.remove(kartdiziz[1].puan);
                        acilmisev.remove(kartdiziz[1].ev);
                    }
                }
                else {
                    if(q==false) {
                        acilmis.remove(kartdiziz[1].ad);
                        tempimgv.remove(listimgz.get(1));
                        acilmispuan.remove(kartdiziz[1].puan);
                        acilmisev.remove(kartdiziz[1].ev);
                        listimgz.get(1).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        q=true;
                    }
                }
            }
        });

    }
    public void ac(){

        listimgz.get(2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(acilmis.size()==0 || acilmis.size()==1) {
                    if(r==true){
                        listimgz.get(2).setImageBitmap(kartdiziz[2].img);
                        r=false;
                        acilmis.add(kartdiziz[2].ad);
                        tempimgv.add(listimgz.get(2));
                        acilmispuan.add(kartdiziz[2].puan);
                        acilmisev.add(kartdiziz[2].ev);
                        textView5.setText(kartdiziz[2].ad);
                        if(acilmis.size()==2){
                            if(acilmis.get(0)==acilmis.get(1)){
                                tempimgv.get(0).setEnabled(false);
                                tempimgv.get(1).setEnabled(false);
                                if (p1==true){
                                    textView2.setText((String.valueOf(Integer.parseInt((String) textView2.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }
                                else if(p2==true){
                                    textView7.setText((String.valueOf(Integer.parseInt((String) textView7.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }
                                acilmis.clear();
                                acilmispuan.clear();
                                tempimgv.clear();
                                acilmisev.clear();
                                f++;
                            }
                            else {
                                  if(p1==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p1=false;
                                   p2=true;
                               }
                               else if(p2==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p2=false;
                                   p1=true;
                               }
                            }
                        }
                    }
                    else{
                        listimgz.get(2).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        r=true;
                        acilmis.remove(kartdiziz[2].ad);
                        tempimgv.remove(listimgz.get(2));
                        acilmispuan.remove(kartdiziz[2].puan);
                        acilmisev.remove(kartdiziz[2].ev);
                    }
                }
                else {
                    if(r==false) {
                        acilmis.remove(kartdiziz[2].ad);
                        tempimgv.remove(listimgz.get(2));
                        acilmispuan.remove(kartdiziz[2].puan);
                        acilmisev.remove(kartdiziz[2].ev);
                        listimgz.get(2).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        r=true;
                    }
                }
            }
        });

    }
    public void ad(){

        listimgz.get(3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(acilmis.size()==0 || acilmis.size()==1) {
                    if(s==true){
                        listimgz.get(3).setImageBitmap(kartdiziz[2].img);
                        s=false;
                        acilmis.add(kartdiziz[2].ad);
                        tempimgv.add(listimgz.get(3));
                        acilmispuan.add(kartdiziz[2].puan);
                        acilmisev.add(kartdiziz[2].ev);
                        textView5.setText(kartdiziz[2].ad);
                        if(acilmis.size()==2){
                            if(acilmis.get(0)==acilmis.get(1)){
                                tempimgv.get(0).setEnabled(false);
                                tempimgv.get(1).setEnabled(false);
  if (p1==true){
                                    textView2.setText((String.valueOf(Integer.parseInt((String) textView2.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }
                                else if(p2==true){
                                    textView7.setText((String.valueOf(Integer.parseInt((String) textView7.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }                                acilmis.clear();
                                acilmispuan.clear();
                                tempimgv.clear();
                                acilmisev.clear();
                                f++;
                            }
                            else {
                                  if(p1==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p1=false;
                                   p2=true;
                               }
                               else if(p2==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p2=false;
                                   p1=true;
                               }
                            }
                        }
                    }
                    else{
                        listimgz.get(3).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        s=true;
                        acilmis.remove(kartdiziz[2].ad);
                        tempimgv.remove(listimgz.get(3));
                        acilmispuan.remove(kartdiziz[2].puan);
                        acilmisev.remove(kartdiziz[2].ev);
                    }
                }
                else {
                    if(s==false) {
                        acilmis.remove(kartdiziz[2].ad);
                        tempimgv.remove(listimgz.get(3));
                        acilmispuan.remove(kartdiziz[2].puan);
                        acilmisev.remove(kartdiziz[2].ev);
                        listimgz.get(3).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        s=true;
                    }
                }
            }
        });

    }
    public void ae(){

        listimgz.get(4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(acilmis.size()==0 || acilmis.size()==1) {
                    if(t==true){
                        listimgz.get(4).setImageBitmap(kartdiziz[3].img);
                        t=false;
                        acilmis.add(kartdiziz[3].ad);
                        tempimgv.add(listimgz.get(4));
                        acilmispuan.add(kartdiziz[3].puan);
                        acilmisev.add(kartdiziz[3].ev);
                        textView5.setText(kartdiziz[3].ad);
                        if(acilmis.size()==2){
                            if(acilmis.get(0)==acilmis.get(1)){
                                tempimgv.get(0).setEnabled(false);
                                tempimgv.get(1).setEnabled(false);
  if (p1==true){
                                    textView2.setText((String.valueOf(Integer.parseInt((String) textView2.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }
                                else if(p2==true){
                                    textView7.setText((String.valueOf(Integer.parseInt((String) textView7.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }                                acilmis.clear();
                                acilmispuan.clear();
                                tempimgv.clear();
                                acilmisev.clear();
                                f++;
                            }
                            else {
                                  if(p1==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p1=false;
                                   p2=true;
                               }
                               else if(p2==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p2=false;
                                   p1=true;
                               }
                            }
                        }
                    }
                    else{
                        listimgz.get(4).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        t=true;
                        acilmis.remove(kartdiziz[3].ad);
                        tempimgv.remove(listimgz.get(4));
                        acilmispuan.remove(kartdiziz[3].puan);
                        acilmisev.remove(kartdiziz[3].ev);
                    }
                }
                else {
                    if(t==false) {
                        acilmis.remove(kartdiziz[3].ad);
                        tempimgv.remove(listimgz.get(4));
                        acilmispuan.remove(kartdiziz[3].puan);
                        acilmisev.remove(kartdiziz[3].ev);
                        listimgz.get(4).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        t=true;
                    }
                }
            }
        });

    }
    public void af(){

        listimgz.get(5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(acilmis.size()==0 || acilmis.size()==1) {
                    if(o==true){
                        listimgz.get(5).setImageBitmap(kartdiziz[3].img);
                        o=false;
                        acilmis.add(kartdiziz[3].ad);
                        tempimgv.add(listimgz.get(5));
                        acilmispuan.add(kartdiziz[3].puan);
                        acilmisev.add(kartdiziz[3].ev);
                        textView5.setText(kartdiziz[3].ad);
                        if(acilmis.size()==2){
                            if(acilmis.get(0)==acilmis.get(1)){
                                tempimgv.get(0).setEnabled(false);
                                tempimgv.get(1).setEnabled(false);
  if (p1==true){
                                    textView2.setText((String.valueOf(Integer.parseInt((String) textView2.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }
                                else if(p2==true){
                                    textView7.setText((String.valueOf(Integer.parseInt((String) textView7.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }                                acilmis.clear();
                                acilmispuan.clear();
                                tempimgv.clear();
                                acilmisev.clear();
                                f++;
                            }
                            else {
                                  if(p1==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p1=false;
                                   p2=true;
                               }
                               else if(p2==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p2=false;
                                   p1=true;
                               }
                            }
                        }
                    }
                    else{
                        listimgz.get(5).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        o=true;
                        acilmis.remove(kartdiziz[3].ad);
                        tempimgv.remove(listimgz.get(5));
                        acilmispuan.remove(kartdiziz[3].puan);
                        acilmisev.remove(kartdiziz[3].ev);
                    }
                }
                else {
                    if(o==false) {
                        acilmis.remove(kartdiziz[3].ad);
                        tempimgv.remove(listimgz.get(5));
                        acilmispuan.remove(kartdiziz[3].puan);
                        acilmisev.remove(kartdiziz[3].ev);
                        listimgz.get(5).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        o=true;
                    }
                }
            }
        });

    }
    public void ba(){

        listimgz.get(6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(acilmis.size()==0 || acilmis.size()==1) {
                    if(u==true){
                        listimgz.get(6).setImageBitmap(kartdiziz[4].img);
                        u=false;
                        acilmis.add(kartdiziz[4].ad);
                        tempimgv.add(listimgz.get(6));
                        acilmispuan.add(kartdiziz[4].puan);
                        acilmisev.add(kartdiziz[4].ev);
                        textView5.setText(kartdiziz[4].ad);
                        if(acilmis.size()==2){
                            if(acilmis.get(0)==acilmis.get(1)){
                                tempimgv.get(0).setEnabled(false);
                                tempimgv.get(1).setEnabled(false);
  if (p1==true){
                                    textView2.setText((String.valueOf(Integer.parseInt((String) textView2.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }
                                else if(p2==true){
                                    textView7.setText((String.valueOf(Integer.parseInt((String) textView7.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }                                acilmis.clear();
                                acilmispuan.clear();
                                tempimgv.clear();
                                acilmisev.clear();
                                f++;
                            }
                            else {
                                  if(p1==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p1=false;
                                   p2=true;
                               }
                               else if(p2==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p2=false;
                                   p1=true;
                               }
                            }
                        }
                    }
                    else{
                        listimgz.get(6).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        u=true;
                        acilmis.remove(kartdiziz[4].ad);
                        tempimgv.remove(listimgz.get(6));
                        acilmispuan.remove(kartdiziz[4].puan);
                        acilmisev.remove(kartdiziz[4].ev);
                    }
                }
                else {
                    if(u==false) {
                        acilmis.remove(kartdiziz[4].ad);
                        tempimgv.remove(listimgz.get(6));
                        acilmispuan.remove(kartdiziz[4].puan);
                        acilmisev.remove(kartdiziz[4].ev);
                        listimgz.get(6).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        u=true;
                    }
                }
            }
        });

    }
    public void bb(){

        listimgz.get(7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(acilmis.size()==0 || acilmis.size()==1) {
                    if(v==true){
                        listimgz.get(7).setImageBitmap(kartdiziz[4].img);
                        v=false;
                        acilmis.add(kartdiziz[4].ad);
                        tempimgv.add(listimgz.get(7));
                        acilmispuan.add(kartdiziz[4].puan);
                        acilmisev.add(kartdiziz[4].ev);
                        textView5.setText(kartdiziz[4].ad);
                        if(acilmis.size()==2){
                            if(acilmis.get(0)==acilmis.get(1)){
                                tempimgv.get(0).setEnabled(false);
                                tempimgv.get(1).setEnabled(false);
  if (p1==true){
                                    textView2.setText((String.valueOf(Integer.parseInt((String) textView2.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }
                                else if(p2==true){
                                    textView7.setText((String.valueOf(Integer.parseInt((String) textView7.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }                                acilmis.clear();
                                acilmispuan.clear();
                                tempimgv.clear();
                                acilmisev.clear();
                                f++;
                            }
                            else {
                                  if(p1==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p1=false;
                                   p2=true;
                               }
                               else if(p2==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p2=false;
                                   p1=true;
                               }
                            }
                        }
                    }
                    else{
                        listimgz.get(7).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        v=true;
                        acilmis.remove(kartdiziz[4].ad);
                        tempimgv.remove(listimgz.get(7));
                        acilmispuan.remove(kartdiziz[4].puan);
                        acilmisev.remove(kartdiziz[4].ev);
                    }
                }
                else {
                    if(v==false) {
                        acilmis.remove(kartdiziz[4].ad);
                        tempimgv.remove(listimgz.get(7));
                        acilmispuan.remove(kartdiziz[4].puan);
                        acilmisev.remove(kartdiziz[4].ev);
                        listimgz.get(7).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        v=true;
                    }
                }
            }
        });

    }
    public void b(){

        listimgz.get(8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(acilmis.size()==0 || acilmis.size()==1) {
                    if(y==true){
                        listimgz.get(8).setImageBitmap(kartdiziz[5].img);
                        y=false;
                        acilmis.add(kartdiziz[5].ad);
                        tempimgv.add(listimgz.get(8));
                        acilmispuan.add(kartdiziz[5].puan);
                        acilmisev.add(kartdiziz[5].ev);
                        textView5.setText(kartdiziz[5].ad);
                        if(acilmis.size()==2){
                            if(acilmis.get(0)==acilmis.get(1)){
                                tempimgv.get(0).setEnabled(false);
                                tempimgv.get(1).setEnabled(false);
  if (p1==true){
                                    textView2.setText((String.valueOf(Integer.parseInt((String) textView2.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }
                                else if(p2==true){
                                    textView7.setText((String.valueOf(Integer.parseInt((String) textView7.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }                                acilmis.clear();
                                acilmispuan.clear();
                                tempimgv.clear();
                                acilmisev.clear();
                                f++;
                            }
                            else {
                                  if(p1==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p1=false;
                                   p2=true;
                               }
                               else if(p2==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p2=false;
                                   p1=true;
                               }
                            }
                        }
                    }
                    else{
                        listimgz.get(8).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        y=true;
                        acilmis.remove(kartdiziz[5].ad);
                        tempimgv.remove(listimgz.get(8));
                        acilmispuan.remove(kartdiziz[5].puan);
                        acilmisev.remove(kartdiziz[5].ev);
                    }
                }
                else {
                    if(y==false) {
                        acilmis.remove(kartdiziz[5].ad);
                        tempimgv.remove(listimgz.get(8));
                        acilmispuan.remove(kartdiziz[5].puan);
                        acilmisev.remove(kartdiziz[5].ev);
                        listimgz.get(8).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        y=true;
                    }
                }
            }
        });

    }
    public void bd(){

        listimgz.get(9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(acilmis.size()==0 || acilmis.size()==1) {
                    if(z==true){
                        listimgz.get(9).setImageBitmap(kartdiziz[5].img);
                        z=false;
                        acilmis.add(kartdiziz[5].ad);
                        tempimgv.add(listimgz.get(9));
                        acilmispuan.add(kartdiziz[5].puan);
                        acilmisev.add(kartdiziz[5].ev);
                        textView5.setText(kartdiziz[5].ad);
                        if(acilmis.size()==2){
                            if(acilmis.get(0)==acilmis.get(1)){
                                tempimgv.get(0).setEnabled(false);
                                tempimgv.get(1).setEnabled(false);
  if (p1==true){
                                    textView2.setText((String.valueOf(Integer.parseInt((String) textView2.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }
                                else if(p2==true){
                                    textView7.setText((String.valueOf(Integer.parseInt((String) textView7.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }                                acilmis.clear();
                                acilmispuan.clear();
                                tempimgv.clear();
                                acilmisev.clear();
                                f++;
                            }
                            else {
                                  if(p1==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p1=false;
                                   p2=true;
                               }
                               else if(p2==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p2=false;
                                   p1=true;
                               }
                            }
                        }
                    }
                    else{
                        listimgz.get(9).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        z=true;
                        acilmis.remove(kartdiziz[5].ad);
                        tempimgv.remove(listimgz.get(9));
                        acilmispuan.remove(kartdiziz[5].puan);
                        acilmisev.remove(kartdiziz[5].ev);
                    }
                }
                else {
                    if(z==false) {
                        acilmis.remove(kartdiziz[5].ad);
                        tempimgv.remove(listimgz.get(9));
                        acilmispuan.remove(kartdiziz[5].puan);
                        acilmisev.remove(kartdiziz[5].ev);
                        listimgz.get(9).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        z=true;
                    }
                }
            }
        });

    }
    public void be(){

        listimgz.get(10).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(acilmis.size()==0 || acilmis.size()==1) {
                    if(b==true){
                        listimgz.get(10).setImageBitmap(kartdiziz[6].img);
                        b=false;
                        acilmis.add(kartdiziz[6].ad);
                        tempimgv.add(listimgz.get(10));
                        acilmispuan.add(kartdiziz[6].puan);
                        acilmisev.add(kartdiziz[6].ev);
                        textView5.setText(kartdiziz[6].ad);
                        if(acilmis.size()==2){
                            if(acilmis.get(0)==acilmis.get(1)){
                                tempimgv.get(0).setEnabled(false);
                                tempimgv.get(1).setEnabled(false);
  if (p1==true){
                                    textView2.setText((String.valueOf(Integer.parseInt((String) textView2.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }
                                else if(p2==true){
                                    textView7.setText((String.valueOf(Integer.parseInt((String) textView7.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }                                acilmis.clear();
                                acilmispuan.clear();
                                tempimgv.clear();
                                acilmisev.clear();
                                f++;
                            }
                            else {
                                  if(p1==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p1=false;
                                   p2=true;
                               }
                               else if(p2==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p2=false;
                                   p1=true;
                               }
                            }
                        }
                    }
                    else{
                        listimgz.get(10).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        b=true;
                        acilmis.remove(kartdiziz[6].ad);
                        tempimgv.remove(listimgz.get(10));
                        acilmispuan.remove(kartdiziz[6].puan);
                        acilmisev.remove(kartdiziz[6].ev);
                    }
                }
                else {
                    if(b==false) {
                        acilmis.remove(kartdiziz[6].ad);
                        tempimgv.remove(listimgz.get(10));
                        acilmispuan.remove(kartdiziz[6].puan);
                        acilmisev.remove(kartdiziz[6].ev);
                        listimgz.get(10).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        b=true;
                    }
                }
            }
        });

    }
    public void bf(){

        listimgz.get(11).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(acilmis.size()==0 || acilmis.size()==1) {
                    if(c==true){
                        listimgz.get(11).setImageBitmap(kartdiziz[6].img);
                        c=false;
                        acilmis.add(kartdiziz[6].ad);
                        tempimgv.add(listimgz.get(11));
                        acilmispuan.add(kartdiziz[6].puan);
                        acilmisev.add(kartdiziz[6].ev);
                        textView5.setText(kartdiziz[6].ad);
                        if(acilmis.size()==2){
                            if(acilmis.get(0)==acilmis.get(1)){
                                tempimgv.get(0).setEnabled(false);
                                tempimgv.get(1).setEnabled(false);
  if (p1==true){
                                    textView2.setText((String.valueOf(Integer.parseInt((String) textView2.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }
                                else if(p2==true){
                                    textView7.setText((String.valueOf(Integer.parseInt((String) textView7.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }                                acilmis.clear();
                                acilmispuan.clear();
                                tempimgv.clear();
                                acilmisev.clear();
                                f++;
                            }
                            else {
                                  if(p1==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p1=false;
                                   p2=true;
                               }
                               else if(p2==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p2=false;
                                   p1=true;
                               }
                            }
                        }
                    }
                    else{
                        listimgz.get(11).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        c=true;
                        acilmis.remove(kartdiziz[6].ad);
                        tempimgv.remove(listimgz.get(11));
                        acilmispuan.remove(kartdiziz[6].puan);
                        acilmisev.remove(kartdiziz[6].ev);
                    }
                }
                else {
                    if(c==false) {
                        acilmis.remove(kartdiziz[6].ad);
                        tempimgv.remove(listimgz.get(11));
                        acilmispuan.remove(kartdiziz[6].puan);
                        acilmisev.remove(kartdiziz[6].ev);
                        listimgz.get(11).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        c=true;
                    }
                }
            }
        });

    }
    public void ca(){

        listimgz.get(12).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(acilmis.size()==0 || acilmis.size()==1) {
                    if(d==true){
                        listimgz.get(12).setImageBitmap(kartdiziz[7].img);
                        d=false;
                        acilmis.add(kartdiziz[7].ad);
                        tempimgv.add(listimgz.get(12));
                        acilmispuan.add(kartdiziz[7].puan);
                        acilmisev.add(kartdiziz[7].ev);
                        textView5.setText(kartdiziz[7].ad);
                        if(acilmis.size()==2){
                            if(acilmis.get(0)==acilmis.get(1)){
                                tempimgv.get(0).setEnabled(false);
                                tempimgv.get(1).setEnabled(false);
  if (p1==true){
                                    textView2.setText((String.valueOf(Integer.parseInt((String) textView2.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }
                                else if(p2==true){
                                    textView7.setText((String.valueOf(Integer.parseInt((String) textView7.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }                                acilmis.clear();
                                acilmispuan.clear();
                                tempimgv.clear();
                                acilmisev.clear();
                                f++;
                            }
                            else {
                                  if(p1==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p1=false;
                                   p2=true;
                               }
                               else if(p2==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p2=false;
                                   p1=true;
                               }
                            }
                        }
                    }
                    else{
                        listimgz.get(12).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        d=true;
                        acilmis.remove(kartdiziz[7].ad);
                        tempimgv.remove(listimgz.get(12));
                        acilmispuan.remove(kartdiziz[7].puan);
                        acilmisev.remove(kartdiziz[7].ev);
                    }
                }
                else {
                    if(d==false) {
                        acilmis.remove(kartdiziz[7].ad);
                        tempimgv.remove(listimgz.get(12));
                        acilmispuan.remove(kartdiziz[7].puan);
                        acilmisev.remove(kartdiziz[7].ev);
                        listimgz.get(12).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        d=true;
                    }
                }
            }
        });

    }
    public void cb(){

        listimgz.get(13).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(acilmis.size()==0 || acilmis.size()==1) {
                    if(e==true){
                        listimgz.get(13).setImageBitmap(kartdiziz[7].img);
                        e=false;
                        acilmis.add(kartdiziz[7].ad);
                        tempimgv.add(listimgz.get(13));
                        acilmispuan.add(kartdiziz[7].puan);
                        acilmisev.add(kartdiziz[7].ev);
                        textView5.setText(kartdiziz[7].ad);
                        if(acilmis.size()==2){
                            if(acilmis.get(0)==acilmis.get(1)){
                                tempimgv.get(0).setEnabled(false);
                                tempimgv.get(1).setEnabled(false);
  if (p1==true){
                                    textView2.setText((String.valueOf(Integer.parseInt((String) textView2.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }
                                else if(p2==true){
                                    textView7.setText((String.valueOf(Integer.parseInt((String) textView7.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }                                acilmis.clear();
                                acilmispuan.clear();
                                tempimgv.clear();
                                acilmisev.clear();
                                f++;
                            }
                            else {
                                  if(p1==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p1=false;
                                   p2=true;
                               }
                               else if(p2==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p2=false;
                                   p1=true;
                               }
                            }
                        }
                    }
                    else{
                        listimgz.get(13).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        e=true;
                        acilmis.remove(kartdiziz[7].ad);
                        tempimgv.remove(listimgz.get(13));
                        acilmispuan.remove(kartdiziz[7].puan);
                        acilmisev.remove(kartdiziz[7].ev);
                    }
                }
                else {
                    if(e==false) {
                        acilmis.remove(kartdiziz[7].ad);
                        tempimgv.remove(listimgz.get(13));
                        acilmispuan.remove(kartdiziz[7].puan);
                        acilmisev.remove(kartdiziz[7].ev);
                        listimgz.get(13).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        e=true;
                    }
                }
            }
        });

    }
    public void cc(){

        listimgz.get(14).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(acilmis.size()==0 || acilmis.size()==1) {
                    if(g==true){
                        listimgz.get(14).setImageBitmap(kartdiziz[8].img);
                        g=false;
                        acilmis.add(kartdiziz[8].ad);
                        tempimgv.add(listimgz.get(14));
                        acilmispuan.add(kartdiziz[8].puan);
                        acilmisev.add(kartdiziz[8].ev);
                        textView5.setText(kartdiziz[8].ad);
                        if(acilmis.size()==2){
                            if(acilmis.get(0)==acilmis.get(1)){
                                tempimgv.get(0).setEnabled(false);
                                tempimgv.get(1).setEnabled(false);
  if (p1==true){
                                    textView2.setText((String.valueOf(Integer.parseInt((String) textView2.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }
                                else if(p2==true){
                                    textView7.setText((String.valueOf(Integer.parseInt((String) textView7.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }                                acilmis.clear();
                                acilmispuan.clear();
                                tempimgv.clear();
                                acilmisev.clear();
                                f++;
                            }
                            else {
                                  if(p1==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p1=false;
                                   p2=true;
                               }
                               else if(p2==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p2=false;
                                   p1=true;
                               }
                            }
                        }
                    }
                    else{
                        listimgz.get(14).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        g=true;
                        acilmis.remove(kartdiziz[8].ad);
                        tempimgv.remove(listimgz.get(14));
                        acilmispuan.remove(kartdiziz[8].puan);
                        acilmisev.remove(kartdiziz[8].ev);
                    }
                }
                else {
                    if(g==false) {
                        acilmis.remove(kartdiziz[8].ad);
                        tempimgv.remove(listimgz.get(14));
                        acilmispuan.remove(kartdiziz[8].puan);
                        acilmisev.remove(kartdiziz[8].ev);
                        listimgz.get(14).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        g=true;
                    }
                }
            }
        });

    }
    public void cd(){

        listimgz.get(15).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(acilmis.size()==0 || acilmis.size()==1) {
                    if(h==true){
                        listimgz.get(15).setImageBitmap(kartdiziz[8].img);
                        h=false;
                        acilmis.add(kartdiziz[8].ad);
                        tempimgv.add(listimgz.get(15));
                        acilmispuan.add(kartdiziz[8].puan);
                        acilmisev.add(kartdiziz[8].ev);
                        textView5.setText(kartdiziz[8].ad);
                        if(acilmis.size()==2){
                            if(acilmis.get(0)==acilmis.get(1)){
                                tempimgv.get(0).setEnabled(false);
                                tempimgv.get(1).setEnabled(false);
  if (p1==true){
                                    textView2.setText((String.valueOf(Integer.parseInt((String) textView2.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }
                                else if(p2==true){
                                    textView7.setText((String.valueOf(Integer.parseInt((String) textView7.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }                                acilmis.clear();
                                acilmispuan.clear();
                                tempimgv.clear();
                                acilmisev.clear();
                                f++;
                            }
                            else {
                                  if(p1==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p1=false;
                                   p2=true;
                               }
                               else if(p2==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p2=false;
                                   p1=true;
                               }
                            }
                        }
                    }
                    else{
                        listimgz.get(15).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        h=true;
                        acilmis.remove(kartdiziz[8].ad);
                        tempimgv.remove(listimgz.get(15));
                        acilmispuan.remove(kartdiziz[8].puan);
                        acilmisev.remove(kartdiziz[8].ev);
                    }
                }
                else {
                    if(h==false) {
                        acilmis.remove(kartdiziz[8].ad);
                        tempimgv.remove(listimgz.get(15));
                        acilmispuan.remove(kartdiziz[8].puan);
                        acilmisev.remove(kartdiziz[8].ev);
                        listimgz.get(15).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        h=true;
                    }
                }
            }
        });

    }
    public void ce(){

        listimgz.get(16).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(acilmis.size()==0 || acilmis.size()==1) {
                    if(pa==true){
                        listimgz.get(16).setImageBitmap(kartdiziz[9].img);
                        pa=false;
                        acilmis.add(kartdiziz[9].ad);
                        tempimgv.add(listimgz.get(16));
                        acilmispuan.add(kartdiziz[9].puan);
                        acilmisev.add(kartdiziz[9].ev);
                        textView5.setText(kartdiziz[9].ad);
                        if(acilmis.size()==2){
                            if(acilmis.get(0)==acilmis.get(1)){
                                tempimgv.get(0).setEnabled(false);
                                tempimgv.get(1).setEnabled(false);
  if (p1==true){
                                    textView2.setText((String.valueOf(Integer.parseInt((String) textView2.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }
                                else if(p2==true){
                                    textView7.setText((String.valueOf(Integer.parseInt((String) textView7.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }                                acilmis.clear();
                                acilmispuan.clear();
                                tempimgv.clear();
                                acilmisev.clear();
                                f++;
                            }
                            else {
                                  if(p1==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p1=false;
                                   p2=true;
                               }
                               else if(p2==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p2=false;
                                   p1=true;
                               }
                            }
                        }
                    }
                    else{
                        listimgz.get(16).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        pa=true;
                        acilmis.remove(kartdiziz[9].ad);
                        tempimgv.remove(listimgz.get(16));
                        acilmispuan.remove(kartdiziz[9].puan);
                        acilmisev.remove(kartdiziz[9].ev);
                    }
                }
                else {
                    if(pa==false) {
                        acilmis.remove(kartdiziz[9].ad);
                        tempimgv.remove(listimgz.get(16));
                        acilmispuan.remove(kartdiziz[9].puan);
                        acilmisev.remove(kartdiziz[9].ev);
                        listimgz.get(16).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        pa=true;
                    }
                }
            }
        });

    }
    public void cf(){

        listimgz.get(17).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(acilmis.size()==0 || acilmis.size()==1) {
                    if(pb==true){
                        listimgz.get(17).setImageBitmap(kartdiziz[9].img);
                        pb=false;
                        acilmis.add(kartdiziz[9].ad);
                        tempimgv.add(listimgz.get(17));
                        acilmispuan.add(kartdiziz[9].puan);
                        acilmisev.add(kartdiziz[9].ev);
                        textView5.setText(kartdiziz[9].ad);
                        if(acilmis.size()==2){
                            if(acilmis.get(0)==acilmis.get(1)){
                                tempimgv.get(0).setEnabled(false);
                                tempimgv.get(1).setEnabled(false);
  if (p1==true){
                                    textView2.setText((String.valueOf(Integer.parseInt((String) textView2.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }
                                else if(p2==true){
                                    textView7.setText((String.valueOf(Integer.parseInt((String) textView7.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }                                acilmis.clear();
                                acilmispuan.clear();
                                tempimgv.clear();
                                acilmisev.clear();
                                f++;
                            }
                            else {
                                  if(p1==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p1=false;
                                   p2=true;
                               }
                               else if(p2==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p2=false;
                                   p1=true;
                               }
                            }
                        }
                    }
                    else{
                        listimgz.get(17).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        pb=true;
                        acilmis.remove(kartdiziz[9].ad);
                        tempimgv.remove(listimgz.get(17));
                        acilmispuan.remove(kartdiziz[9].puan);
                        acilmisev.remove(kartdiziz[9].ev);
                    }
                }
                else {
                    if(pb==false) {
                        acilmis.remove(kartdiziz[9].ad);
                        tempimgv.remove(listimgz.get(17));
                        acilmispuan.remove(kartdiziz[9].puan);
                        acilmisev.remove(kartdiziz[9].ev);
                        listimgz.get(17).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        pb=true;
                    }
                }
            }
        });

    }
    public void da(){

        listimgz.get(18).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(acilmis.size()==0 || acilmis.size()==1) {
                    if(qa==true){
                        listimgz.get(18).setImageBitmap(kartdiziz[10].img);
                        qa=false;
                        acilmis.add(kartdiziz[10].ad);
                        tempimgv.add(listimgz.get(18));
                        acilmispuan.add(kartdiziz[10].puan);
                        acilmisev.add(kartdiziz[10].ev);
                        textView5.setText(kartdiziz[10].ad);
                        if(acilmis.size()==2){
                            if(acilmis.get(0)==acilmis.get(1)){
                                tempimgv.get(0).setEnabled(false);
                                tempimgv.get(1).setEnabled(false);
  if (p1==true){
                                    textView2.setText((String.valueOf(Integer.parseInt((String) textView2.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }
                                else if(p2==true){
                                    textView7.setText((String.valueOf(Integer.parseInt((String) textView7.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }                                acilmis.clear();
                                acilmispuan.clear();
                                tempimgv.clear();
                                acilmisev.clear();
                                f++;
                            }
                            else {
                                  if(p1==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p1=false;
                                   p2=true;
                               }
                               else if(p2==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p2=false;
                                   p1=true;
                               }
                            }
                        }
                    }
                    else{
                        listimgz.get(18).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        qa=true;
                        acilmis.remove(kartdiziz[10].ad);
                        tempimgv.remove(listimgz.get(18));
                        acilmispuan.remove(kartdiziz[10].puan);
                        acilmisev.remove(kartdiziz[10].ev);
                    }
                }
                else {
                    if(qa==false) {
                        acilmis.remove(kartdiziz[10].ad);
                        tempimgv.remove(listimgz.get(18));
                        acilmispuan.remove(kartdiziz[10].puan);
                        acilmisev.remove(kartdiziz[10].ev);
                        listimgz.get(18).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        qa=true;
                    }
                }
            }
        });

    }
    public void db(){

        listimgz.get(19).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(acilmis.size()==0 || acilmis.size()==1) {
                    if(qb==true){
                        listimgz.get(19).setImageBitmap(kartdiziz[10].img);
                        qb=false;
                        acilmis.add(kartdiziz[10].ad);
                        tempimgv.add(listimgz.get(19));
                        acilmispuan.add(kartdiziz[10].puan);
                        acilmisev.add(kartdiziz[10].ev);
                        textView5.setText(kartdiziz[10].ad);
                        if(acilmis.size()==2){
                            if(acilmis.get(0)==acilmis.get(1)){
                                tempimgv.get(0).setEnabled(false);
                                tempimgv.get(1).setEnabled(false);
  if (p1==true){
                                    textView2.setText((String.valueOf(Integer.parseInt((String) textView2.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }
                                else if(p2==true){
                                    textView7.setText((String.valueOf(Integer.parseInt((String) textView7.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }                                acilmis.clear();
                                acilmispuan.clear();
                                tempimgv.clear();
                                acilmisev.clear();
                                f++;
                            }
                            else {
                                  if(p1==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p1=false;
                                   p2=true;
                               }
                               else if(p2==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p2=false;
                                   p1=true;
                               }
                            }
                        }
                    }
                    else{
                        listimgz.get(19).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        qb=true;
                        acilmis.remove(kartdiziz[10].ad);
                        tempimgv.remove(listimgz.get(19));
                        acilmispuan.remove(kartdiziz[10].puan);
                        acilmisev.remove(kartdiziz[10].ev);
                    }
                }
                else {
                    if(qb==false) {
                        acilmis.remove(kartdiziz[10].ad);
                        tempimgv.remove(listimgz.get(19));
                        acilmispuan.remove(kartdiziz[10].puan);
                        acilmisev.remove(kartdiziz[10].ev);
                        listimgz.get(19).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        qb=true;
                    }
                }
            }
        });

    }
    public void dc(){

        listimgz.get(20).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(acilmis.size()==0 || acilmis.size()==1) {
                    if(ra==true){
                        listimgz.get(20).setImageBitmap(kartdiziz[11].img);
                        ra=false;
                        acilmis.add(kartdiziz[11].ad);
                        tempimgv.add(listimgz.get(20));
                        acilmispuan.add(kartdiziz[11].puan);
                        acilmisev.add(kartdiziz[11].ev);
                        textView5.setText(kartdiziz[11].ad);
                        if(acilmis.size()==2){
                            if(acilmis.get(0)==acilmis.get(1)){
                                tempimgv.get(0).setEnabled(false);
                                tempimgv.get(1).setEnabled(false);
  if (p1==true){
                                    textView2.setText((String.valueOf(Integer.parseInt((String) textView2.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }
                                else if(p2==true){
                                    textView7.setText((String.valueOf(Integer.parseInt((String) textView7.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }                                acilmis.clear();
                                acilmispuan.clear();
                                tempimgv.clear();
                                acilmisev.clear();
                                f++;
                            }
                            else {
                                  if(p1==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p1=false;
                                   p2=true;
                               }
                               else if(p2==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p2=false;
                                   p1=true;
                               }
                            }
                        }
                    }
                    else{
                        listimgz.get(20).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        ra=true;
                        acilmis.remove(kartdiziz[11].ad);
                        tempimgv.remove(listimgz.get(20));
                        acilmispuan.remove(kartdiziz[11].puan);
                        acilmisev.remove(kartdiziz[11].ev);
                    }
                }
                else {
                    if(ra==false) {
                        acilmis.remove(kartdiziz[11].ad);
                        tempimgv.remove(listimgz.get(20));
                        acilmispuan.remove(kartdiziz[11].puan);
                        acilmisev.remove(kartdiziz[11].ev);
                        listimgz.get(20).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        ra=true;
                    }
                }
            }
        });

    }
    public void dd(){

        listimgz.get(21).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(acilmis.size()==0 || acilmis.size()==1) {
                    if(rb==true){
                        listimgz.get(21).setImageBitmap(kartdiziz[11].img);
                        rb=false;
                        acilmis.add(kartdiziz[11].ad);
                        tempimgv.add(listimgz.get(21));
                        acilmispuan.add(kartdiziz[11].puan);
                        acilmisev.add(kartdiziz[11].ev);
                        textView5.setText(kartdiziz[11].ad);
                        if(acilmis.size()==2){
                            if(acilmis.get(0)==acilmis.get(1)){
                                tempimgv.get(0).setEnabled(false);
                                tempimgv.get(1).setEnabled(false);
  if (p1==true){
                                    textView2.setText((String.valueOf(Integer.parseInt((String) textView2.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }
                                else if(p2==true){
                                    textView7.setText((String.valueOf(Integer.parseInt((String) textView7.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }                                acilmis.clear();
                                acilmispuan.clear();
                                tempimgv.clear();
                                acilmisev.clear();
                                f++;
                            }
                            else {
                                  if(p1==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p1=false;
                                   p2=true;
                               }
                               else if(p2==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p2=false;
                                   p1=true;
                               }
                            }
                        }
                    }
                    else{
                        listimgz.get(21).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        rb=true;
                        acilmis.remove(kartdiziz[11].ad);
                        tempimgv.remove(listimgz.get(21));
                        acilmispuan.remove(kartdiziz[11].puan);
                        acilmisev.remove(kartdiziz[11].ev);
                    }
                }
                else {
                    if(rb==false) {
                        acilmis.remove(kartdiziz[11].ad);
                        tempimgv.remove(listimgz.get(21));
                        acilmispuan.remove(kartdiziz[11].puan);
                        acilmisev.remove(kartdiziz[11].ev);
                        listimgz.get(21).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        rb=true;
                    }
                }
            }
        });

    }
    public void de(){

        listimgz.get(22).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(acilmis.size()==0 || acilmis.size()==1) {
                    if(sa==true){
                        listimgz.get(22).setImageBitmap(kartdiziz[12].img);
                        sa=false;
                        acilmis.add(kartdiziz[12].ad);
                        tempimgv.add(listimgz.get(22));
                        acilmispuan.add(kartdiziz[12].puan);
                        acilmisev.add(kartdiziz[12].ev);
                        textView5.setText(kartdiziz[12].ad);
                        if(acilmis.size()==2){
                            if(acilmis.get(0)==acilmis.get(1)){
                                tempimgv.get(0).setEnabled(false);
                                tempimgv.get(1).setEnabled(false);
  if (p1==true){
                                    textView2.setText((String.valueOf(Integer.parseInt((String) textView2.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }
                                else if(p2==true){
                                    textView7.setText((String.valueOf(Integer.parseInt((String) textView7.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }                                acilmis.clear();
                                acilmispuan.clear();
                                tempimgv.clear();
                                acilmisev.clear();
                                f++;
                            }
                            else {
                                  if(p1==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p1=false;
                                   p2=true;
                               }
                               else if(p2==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p2=false;
                                   p1=true;
                               }
                            }
                        }
                    }
                    else{
                        listimgz.get(22).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        sa=true;
                        acilmis.remove(kartdiziz[12].ad);
                        tempimgv.remove(listimgz.get(22));
                        acilmispuan.remove(kartdiziz[12].puan);
                        acilmisev.remove(kartdiziz[12].ev);
                    }
                }
                else {
                    if(sa==false) {
                        acilmis.remove(kartdiziz[12].ad);
                        tempimgv.remove(listimgz.get(22));
                        acilmispuan.remove(kartdiziz[12].puan);
                        acilmisev.remove(kartdiziz[12].ev);
                        listimgz.get(22).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        sa=true;
                    }
                }
            }
        });

    }
    public void df(){

        listimgz.get(23).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(acilmis.size()==0 || acilmis.size()==1) {
                    if(sb==true){
                        listimgz.get(23).setImageBitmap(kartdiziz[12].img);
                        sb=false;
                        acilmis.add(kartdiziz[12].ad);
                        tempimgv.add(listimgz.get(23));
                        acilmispuan.add(kartdiziz[12].puan);
                        acilmisev.add(kartdiziz[12].ev);
                        textView5.setText(kartdiziz[12].ad);
                        if(acilmis.size()==2){
                            if(acilmis.get(0)==acilmis.get(1)){
                                tempimgv.get(0).setEnabled(false);
                                tempimgv.get(1).setEnabled(false);
  if (p1==true){
                                    textView2.setText((String.valueOf(Integer.parseInt((String) textView2.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }
                                else if(p2==true){
                                    textView7.setText((String.valueOf(Integer.parseInt((String) textView7.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }                                acilmis.clear();
                                acilmispuan.clear();
                                tempimgv.clear();
                                acilmisev.clear();
                                f++;
                            }
                            else {
                                  if(p1==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p1=false;
                                   p2=true;
                               }
                               else if(p2==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p2=false;
                                   p1=true;
                               }
                            }
                        }
                    }
                    else{
                        listimgz.get(23).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        sb=true;
                        acilmis.remove(kartdiziz[12].ad);
                        tempimgv.remove(listimgz.get(23));
                        acilmispuan.remove(kartdiziz[12].puan);
                        acilmisev.remove(kartdiziz[12].ev);
                    }
                }
                else {
                    if(sb==false) {
                        acilmis.remove(kartdiziz[12].ad);
                        tempimgv.remove(listimgz.get(23));
                        acilmispuan.remove(kartdiziz[12].puan);
                        acilmisev.remove(kartdiziz[12].ev);
                        listimgz.get(23).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        sb=true;
                    }
                }
            }
        });

    }
    public void ea(){

        listimgz.get(24).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(acilmis.size()==0 || acilmis.size()==1) {
                    if(ta==true){
                        listimgz.get(24).setImageBitmap(kartdiziz[13].img);
                        ta=false;
                        acilmis.add(kartdiziz[13].ad);
                        tempimgv.add(listimgz.get(24));
                        acilmispuan.add(kartdiziz[13].puan);
                        acilmisev.add(kartdiziz[13].ev);
                        textView5.setText(kartdiziz[13].ad);
                        if(acilmis.size()==2){
                            if(acilmis.get(0)==acilmis.get(1)){
                                tempimgv.get(0).setEnabled(false);
                                tempimgv.get(1).setEnabled(false);
  if (p1==true){
                                    textView2.setText((String.valueOf(Integer.parseInt((String) textView2.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }
                                else if(p2==true){
                                    textView7.setText((String.valueOf(Integer.parseInt((String) textView7.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }                                acilmis.clear();
                                acilmispuan.clear();
                                tempimgv.clear();
                                acilmisev.clear();
                                f++;
                            }
                            else {
                                  if(p1==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p1=false;
                                   p2=true;
                               }
                               else if(p2==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p2=false;
                                   p1=true;
                               }
                            }
                        }
                    }
                    else{
                        listimgz.get(24).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        ta=true;
                        acilmis.remove(kartdiziz[13].ad);
                        tempimgv.remove(listimgz.get(24));
                        acilmispuan.remove(kartdiziz[13].puan);
                        acilmisev.remove(kartdiziz[13].ev);
                    }
                }
                else {
                    if(ta==false) {
                        acilmis.remove(kartdiziz[13].ad);
                        tempimgv.remove(listimgz.get(24));
                        acilmispuan.remove(kartdiziz[13].puan);
                        acilmisev.remove(kartdiziz[13].ev);
                        listimgz.get(24).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        ta=true;
                    }
                }
            }
        });

    }
    public void eb(){

        listimgz.get(25).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(acilmis.size()==0 || acilmis.size()==1) {
                    if(tb==true){
                        listimgz.get(25).setImageBitmap(kartdiziz[13].img);
                        tb=false;
                        acilmis.add(kartdiziz[13].ad);
                        tempimgv.add(listimgz.get(25));
                        acilmispuan.add(kartdiziz[13].puan);
                        acilmisev.add(kartdiziz[13].ev);
                        textView5.setText(kartdiziz[13].ad);
                        if(acilmis.size()==2){
                            if(acilmis.get(0)==acilmis.get(1)){
                                tempimgv.get(0).setEnabled(false);
                                tempimgv.get(1).setEnabled(false);
  if (p1==true){
                                    textView2.setText((String.valueOf(Integer.parseInt((String) textView2.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }
                                else if(p2==true){
                                    textView7.setText((String.valueOf(Integer.parseInt((String) textView7.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }                                acilmis.clear();
                                acilmispuan.clear();
                                tempimgv.clear();
                                acilmisev.clear();
                                f++;
                            }
                            else {
                                  if(p1==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p1=false;
                                   p2=true;
                               }
                               else if(p2==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p2=false;
                                   p1=true;
                               }
                            }
                        }
                    }
                    else{
                        listimgz.get(25).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        tb=true;
                        acilmis.remove(kartdiziz[13].ad);
                        tempimgv.remove(listimgz.get(25));
                        acilmispuan.remove(kartdiziz[13].puan);
                        acilmisev.remove(kartdiziz[13].ev);
                    }
                }
                else {
                    if(tb==false) {
                        acilmis.remove(kartdiziz[13].ad);
                        tempimgv.remove(listimgz.get(25));
                        acilmispuan.remove(kartdiziz[13].puan);
                        acilmisev.remove(kartdiziz[13].ev);
                        listimgz.get(25).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        tb=true;
                    }
                }
            }
        });

    }
    public void ec(){

        listimgz.get(26).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(acilmis.size()==0 || acilmis.size()==1) {
                    if(oa==true){
                        listimgz.get(26).setImageBitmap(kartdiziz[14].img);
                        oa=false;
                        acilmis.add(kartdiziz[14].ad);
                        tempimgv.add(listimgz.get(26));
                        acilmispuan.add(kartdiziz[14].puan);
                        acilmisev.add(kartdiziz[14].ev);
                        textView5.setText(kartdiziz[14].ad);
                        if(acilmis.size()==2){
                            if(acilmis.get(0)==acilmis.get(1)){
                                tempimgv.get(0).setEnabled(false);
                                tempimgv.get(1).setEnabled(false);
  if (p1==true){
                                    textView2.setText((String.valueOf(Integer.parseInt((String) textView2.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }
                                else if(p2==true){
                                    textView7.setText((String.valueOf(Integer.parseInt((String) textView7.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }                                acilmis.clear();
                                acilmispuan.clear();
                                tempimgv.clear();
                                acilmisev.clear();
                                f++;
                            }
                            else {
                                  if(p1==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p1=false;
                                   p2=true;
                               }
                               else if(p2==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p2=false;
                                   p1=true;
                               }
                            }
                        }
                    }
                    else{
                        listimgz.get(26).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        oa=true;
                        acilmis.remove(kartdiziz[14].ad);
                        tempimgv.remove(listimgz.get(26));
                        acilmispuan.remove(kartdiziz[14].puan);
                        acilmisev.remove(kartdiziz[14].ev);
                    }
                }
                else {
                    if(oa==false) {
                        acilmis.remove(kartdiziz[14].ad);
                        tempimgv.remove(listimgz.get(26));
                        acilmispuan.remove(kartdiziz[14].puan);
                        acilmisev.remove(kartdiziz[14].ev);
                        listimgz.get(26).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        oa=true;
                    }
                }
            }
        });

    }
    public void ed(){

        listimgz.get(27).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(acilmis.size()==0 || acilmis.size()==1) {
                    if(ob==true){
                        listimgz.get(27).setImageBitmap(kartdiziz[14].img);
                        ob=false;
                        acilmis.add(kartdiziz[14].ad);
                        tempimgv.add(listimgz.get(27));
                        acilmispuan.add(kartdiziz[14].puan);
                        acilmisev.add(kartdiziz[14].ev);
                        textView5.setText(kartdiziz[14].ad);
                        if(acilmis.size()==2){
                            if(acilmis.get(0)==acilmis.get(1)){
                                tempimgv.get(0).setEnabled(false);
                                tempimgv.get(1).setEnabled(false);
  if (p1==true){
                                    textView2.setText((String.valueOf(Integer.parseInt((String) textView2.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }
                                else if(p2==true){
                                    textView7.setText((String.valueOf(Integer.parseInt((String) textView7.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }                                acilmis.clear();
                                acilmispuan.clear();
                                tempimgv.clear();
                                acilmisev.clear();
                                f++;
                            }
                            else {
                                  if(p1==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p1=false;
                                   p2=true;
                               }
                               else if(p2==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p2=false;
                                   p1=true;
                               }
                            }
                        }
                    }
                    else{
                        listimgz.get(27).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        ob=true;
                        acilmis.remove(kartdiziz[14].ad);
                        tempimgv.remove(listimgz.get(27));
                        acilmispuan.remove(kartdiziz[14].puan);
                        acilmisev.remove(kartdiziz[14].ev);
                    }
                }
                else {
                    if(ob==false) {
                        acilmis.remove(kartdiziz[14].ad);
                        tempimgv.remove(listimgz.get(27));
                        acilmispuan.remove(kartdiziz[14].puan);
                        acilmisev.remove(kartdiziz[14].ev);
                        listimgz.get(27).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        ob=true;
                    }
                }
            }
        });

    }
    public void ee(){

        listimgz.get(28).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(acilmis.size()==0 || acilmis.size()==1) {
                    if(ua==true){
                        listimgz.get(28).setImageBitmap(kartdiziz[15].img);
                        ua=false;
                        acilmis.add(kartdiziz[15].ad);
                        tempimgv.add(listimgz.get(28));
                        acilmispuan.add(kartdiziz[15].puan);
                        acilmisev.add(kartdiziz[15].ev);
                        textView5.setText(kartdiziz[15].ad);
                        if(acilmis.size()==2){
                            if(acilmis.get(0)==acilmis.get(1)){
                                tempimgv.get(0).setEnabled(false);
                                tempimgv.get(1).setEnabled(false);
  if (p1==true){
                                    textView2.setText((String.valueOf(Integer.parseInt((String) textView2.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }
                                else if(p2==true){
                                    textView7.setText((String.valueOf(Integer.parseInt((String) textView7.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }                                acilmis.clear();
                                acilmispuan.clear();
                                tempimgv.clear();
                                acilmisev.clear();
                                f++;
                            }
                            else {
                                  if(p1==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p1=false;
                                   p2=true;
                               }
                               else if(p2==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p2=false;
                                   p1=true;
                               }
                            }
                        }
                    }
                    else{
                        listimgz.get(28).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        ua=true;
                        acilmis.remove(kartdiziz[15].ad);
                        tempimgv.remove(listimgz.get(28));
                        acilmispuan.remove(kartdiziz[15].puan);
                        acilmisev.remove(kartdiziz[15].ev);
                    }
                }
                else {
                    if(ua==false) {
                        acilmis.remove(kartdiziz[15].ad);
                        tempimgv.remove(listimgz.get(28));
                        acilmispuan.remove(kartdiziz[15].puan);
                        acilmisev.remove(kartdiziz[15].ev);
                        listimgz.get(28).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        ua=true;
                    }
                }
            }
        });

    }
    public void ef(){

        listimgz.get(29).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(acilmis.size()==0 || acilmis.size()==1) {
                    if(ub==true){
                        listimgz.get(29).setImageBitmap(kartdiziz[9].img);
                        ub=false;
                        acilmis.add(kartdiziz[15].ad);
                        tempimgv.add(listimgz.get(29));
                        acilmispuan.add(kartdiziz[15].puan);
                        acilmisev.add(kartdiziz[15].ev);
                        textView5.setText(kartdiziz[15].ad);
                        if(acilmis.size()==2){
                            if(acilmis.get(0)==acilmis.get(1)){
                                tempimgv.get(0).setEnabled(false);
                                tempimgv.get(1).setEnabled(false);
  if (p1==true){
                                    textView2.setText((String.valueOf(Integer.parseInt((String) textView2.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }
                                else if(p2==true){
                                    textView7.setText((String.valueOf(Integer.parseInt((String) textView7.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }                                acilmis.clear();
                                acilmispuan.clear();
                                tempimgv.clear();
                                acilmisev.clear();
                                f++;
                            }
                            else {
                                  if(p1==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p1=false;
                                   p2=true;
                               }
                               else if(p2==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p2=false;
                                   p1=true;
                               }
                            }
                        }
                    }
                    else{
                        listimgz.get(29).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        ub=true;
                        acilmis.remove(kartdiziz[15].ad);
                        tempimgv.remove(listimgz.get(29));
                        acilmispuan.remove(kartdiziz[15].puan);
                        acilmisev.remove(kartdiziz[15].ev);
                    }
                }
                else {
                    if(ub==false) {
                        acilmis.remove(kartdiziz[15].ad);
                        tempimgv.remove(listimgz.get(29));
                        acilmispuan.remove(kartdiziz[15].puan);
                        acilmisev.remove(kartdiziz[15].ev);
                        listimgz.get(29).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        ub=true;
                    }
                }
            }
        });

    }
    public void fa(){

        listimgz.get(30).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(acilmis.size()==0 || acilmis.size()==1) {
                    if(va==true){
                        listimgz.get(30).setImageBitmap(kartdiziz[16].img);
                        va=false;
                        acilmis.add(kartdiziz[16].ad);
                        tempimgv.add(listimgz.get(30));
                        acilmispuan.add(kartdiziz[16].puan);
                        acilmisev.add(kartdiziz[16].ev);
                        textView5.setText(kartdiziz[16].ad);
                        if(acilmis.size()==2){
                            if(acilmis.get(0)==acilmis.get(1)){
                                tempimgv.get(0).setEnabled(false);
                                tempimgv.get(1).setEnabled(false);
  if (p1==true){
                                    textView2.setText((String.valueOf(Integer.parseInt((String) textView2.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }
                                else if(p2==true){
                                    textView7.setText((String.valueOf(Integer.parseInt((String) textView7.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }                                acilmis.clear();
                                acilmispuan.clear();
                                tempimgv.clear();
                                acilmisev.clear();
                                f++;
                            }
                            else {
                                  if(p1==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p1=false;
                                   p2=true;
                               }
                               else if(p2==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p2=false;
                                   p1=true;
                               }
                            }
                        }
                    }
                    else{
                        listimgz.get(30).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        va=true;
                        acilmis.remove(kartdiziz[16].ad);
                        tempimgv.remove(listimgz.get(30));
                        acilmispuan.remove(kartdiziz[16].puan);
                        acilmisev.remove(kartdiziz[16].ev);
                    }
                }
                else {
                    if(va==false) {
                        acilmis.remove(kartdiziz[16].ad);
                        tempimgv.remove(listimgz.get(30));
                        acilmispuan.remove(kartdiziz[16].puan);
                        acilmisev.remove(kartdiziz[16].ev);
                        listimgz.get(30).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        va=true;
                    }
                }
            }
        });

    }
    public void fb(){

        listimgz.get(31).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(acilmis.size()==0 || acilmis.size()==1) {
                    if(vb==true){
                        listimgz.get(31).setImageBitmap(kartdiziz[16].img);
                        vb=false;
                        acilmis.add(kartdiziz[16].ad);
                        tempimgv.add(listimgz.get(31));
                        acilmispuan.add(kartdiziz[16].puan);
                        acilmisev.add(kartdiziz[16].ev);
                        textView5.setText(kartdiziz[16].ad);
                        if(acilmis.size()==2){
                            if(acilmis.get(0)==acilmis.get(1)){
                                tempimgv.get(0).setEnabled(false);
                                tempimgv.get(1).setEnabled(false);
  if (p1==true){
                                    textView2.setText((String.valueOf(Integer.parseInt((String) textView2.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }
                                else if(p2==true){
                                    textView7.setText((String.valueOf(Integer.parseInt((String) textView7.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }                                acilmis.clear();
                                acilmispuan.clear();
                                tempimgv.clear();
                                acilmisev.clear();
                                f++;
                            }
                            else {
                                  if(p1==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p1=false;
                                   p2=true;
                               }
                               else if(p2==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p2=false;
                                   p1=true;
                               }
                            }
                        }
                    }
                    else{
                        listimgz.get(31).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        vb=true;
                        acilmis.remove(kartdiziz[16].ad);
                        tempimgv.remove(listimgz.get(31));
                        acilmispuan.remove(kartdiziz[16].puan);
                        acilmisev.remove(kartdiziz[16].ev);
                    }
                }
                else {
                    if(vb==false) {
                        acilmis.remove(kartdiziz[16].ad);
                        tempimgv.remove(listimgz.get(31));
                        acilmispuan.remove(kartdiziz[16].puan);
                        acilmisev.remove(kartdiziz[16].ev);
                        listimgz.get(31).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        vb=true;
                    }
                }
            }
        });

    }
    public void fc(){

        listimgz.get(32).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(acilmis.size()==0 || acilmis.size()==1) {
                    if(ya==true){
                        listimgz.get(32).setImageBitmap(kartdiziz[17].img);
                        ya=false;
                        acilmis.add(kartdiziz[17].ad);
                        tempimgv.add(listimgz.get(32));
                        acilmispuan.add(kartdiziz[17].puan);
                        acilmisev.add(kartdiziz[17].ev);
                        textView5.setText(kartdiziz[17].ad);
                        if(acilmis.size()==2){
                            if(acilmis.get(0)==acilmis.get(1)){
                                tempimgv.get(0).setEnabled(false);
                                tempimgv.get(1).setEnabled(false);
  if (p1==true){
                                    textView2.setText((String.valueOf(Integer.parseInt((String) textView2.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }
                                else if(p2==true){
                                    textView7.setText((String.valueOf(Integer.parseInt((String) textView7.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }                                acilmis.clear();
                                acilmispuan.clear();
                                tempimgv.clear();
                                acilmisev.clear();
                                f++;
                            }
                            else {
                                  if(p1==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p1=false;
                                   p2=true;
                               }
                               else if(p2==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p2=false;
                                   p1=true;
                               }
                            }
                        }
                    }
                    else{
                        listimgz.get(32).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        ya=true;
                        acilmis.remove(kartdiziz[17].ad);
                        tempimgv.remove(listimgz.get(32));
                        acilmispuan.remove(kartdiziz[17].puan);
                        acilmisev.remove(kartdiziz[17].ev);
                    }
                }
                else {
                    if(ya==false) {
                        acilmis.remove(kartdiziz[17].ad);
                        tempimgv.remove(listimgz.get(32));
                        acilmispuan.remove(kartdiziz[17].puan);
                        acilmisev.remove(kartdiziz[17].ev);
                        listimgz.get(32).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        ya=true;
                    }
                }
            }
        });

    }
    public void fd(){

        listimgz.get(33).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(acilmis.size()==0 || acilmis.size()==1) {
                    if(ea==true){
                        listimgz.get(33).setImageBitmap(kartdiziz[17].img);
                        ea=false;
                        acilmis.add(kartdiziz[17].ad);
                        tempimgv.add(listimgz.get(33));
                        acilmispuan.add(kartdiziz[17].puan);
                        acilmisev.add(kartdiziz[17].ev);
                        textView5.setText(kartdiziz[17].ad);
                        if(acilmis.size()==2){
                            if(acilmis.get(0)==acilmis.get(1)){
                                tempimgv.get(0).setEnabled(false);
                                tempimgv.get(1).setEnabled(false);
  if (p1==true){
                                    textView2.setText((String.valueOf(Integer.parseInt((String) textView2.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }
                                else if(p2==true){
                                    textView7.setText((String.valueOf(Integer.parseInt((String) textView7.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }                                acilmis.clear();
                                acilmispuan.clear();
                                tempimgv.clear();
                                acilmisev.clear();
                                f++;
                            }
                            else {
                                  if(p1==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p1=false;
                                   p2=true;
                               }
                               else if(p2==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p2=false;
                                   p1=true;
                               }
                            }
                        }
                    }
                    else{
                        listimgz.get(33).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        ea=true;
                        acilmis.remove(kartdiziz[17].ad);
                        tempimgv.remove(listimgz.get(33));
                        acilmispuan.remove(kartdiziz[17].puan);
                        acilmisev.remove(kartdiziz[17].ev);
                    }
                }
                else {
                    if(ea==false) {
                        acilmis.remove(kartdiziz[17].ad);
                        tempimgv.remove(listimgz.get(33));
                        acilmispuan.remove(kartdiziz[17].puan);
                        acilmisev.remove(kartdiziz[17].ev);
                        listimgz.get(33).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        ea=true;
                    }
                }
            }
        });

    }
    public void fe(){

        listimgz.get(34).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(acilmis.size()==0 || acilmis.size()==1) {
                    if(da==true){
                        listimgz.get(34).setImageBitmap(kartdiziz[18].img);
                        da=false;
                        acilmis.add(kartdiziz[18].ad);
                        tempimgv.add(listimgz.get(34));
                        acilmispuan.add(kartdiziz[18].puan);
                        acilmisev.add(kartdiziz[18].ev);
                        textView5.setText(kartdiziz[18].ad);
                        if(acilmis.size()==2){
                            if(acilmis.get(0)==acilmis.get(1)){
                                tempimgv.get(0).setEnabled(false);
                                tempimgv.get(1).setEnabled(false);
  if (p1==true){
                                    textView2.setText((String.valueOf(Integer.parseInt((String) textView2.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }
                                else if(p2==true){
                                    textView7.setText((String.valueOf(Integer.parseInt((String) textView7.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }                                acilmis.clear();
                                acilmispuan.clear();
                                tempimgv.clear();
                                acilmisev.clear();
                                f++;
                            }
                            else {
                                  if(p1==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p1=false;
                                   p2=true;
                               }
                               else if(p2==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p2=false;
                                   p1=true;
                               }
                            }
                        }
                    }
                    else{
                        listimgz.get(34).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        da=true;
                        acilmis.remove(kartdiziz[18].ad);
                        tempimgv.remove(listimgz.get(34));
                        acilmispuan.remove(kartdiziz[18].puan);
                        acilmisev.remove(kartdiziz[18].ev);
                    }
                }
                else {
                    if(da==false) {
                        acilmis.remove(kartdiziz[18].ad);
                        tempimgv.remove(listimgz.get(34));
                        acilmispuan.remove(kartdiziz[18].puan);
                        acilmisev.remove(kartdiziz[18].ev);
                        listimgz.get(34).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        da=true;
                    }
                }
            }
        });

    }
    public void ff(){

        listimgz.get(35).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(acilmis.size()==0 || acilmis.size()==1) {
                    if(za==true){
                        listimgz.get(35).setImageBitmap(kartdiziz[18].img);
                        za=false;
                        acilmis.add(kartdiziz[18].ad);
                        tempimgv.add(listimgz.get(35));
                        acilmispuan.add(kartdiziz[18].puan);
                        acilmisev.add(kartdiziz[18].ev);
                        textView5.setText(kartdiziz[18].ad);
                        if(acilmis.size()==2){
                            if(acilmis.get(0)==acilmis.get(1)){
                                tempimgv.get(0).setEnabled(false);
                                tempimgv.get(1).setEnabled(false);
  if (p1==true){
                                    textView2.setText((String.valueOf(Integer.parseInt((String) textView2.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }
                                else if(p2==true){
                                    textView7.setText((String.valueOf(Integer.parseInt((String) textView7.getText())+(2*(Integer.parseInt(acilmispuan.get(0)))*(Integer.parseInt(acilmisev.get(0)))))));
                                }                                acilmis.clear();
                                acilmispuan.clear();
                                tempimgv.clear();
                                acilmisev.clear();
                                f++;
                            }
                            else {
                                  if(p1==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView2.setText(String.valueOf(Integer.parseInt((String) textView2.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p1=false;
                                   p2=true;
                               }
                               else if(p2==true){
                                   if(acilmisev.get(0)==acilmisev.get(1)){
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-((Integer.parseInt(acilmispuan.get(0)))+(Integer.parseInt(acilmispuan.get(1))))/Integer.parseInt(acilmisev.get(0))));
                                   }
                                   else{
                                       textView7.setText(String.valueOf(Integer.parseInt((String) textView7.getText())-(((Integer.parseInt(acilmispuan.get(0)))+Integer.parseInt(acilmispuan.get(1)))/2*Integer.parseInt(acilmisev.get(0))*Integer.parseInt(acilmisev.get(1)))));
                                   }
                                   p2=false;
                                   p1=true;
                               }
                            }
                        }
                    }
                    else{
                        listimgz.get(35).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        za=true;
                        acilmis.remove(kartdiziz[18].ad);
                        tempimgv.remove(listimgz.get(35));
                        acilmispuan.remove(kartdiziz[18].puan);
                        acilmisev.remove(kartdiziz[18].ev);
                    }
                }
                else {
                    if(za==false) {
                        acilmis.remove(kartdiziz[18].ad);
                        tempimgv.remove(listimgz.get(35));
                        acilmispuan.remove(kartdiziz[18].puan);
                        acilmisev.remove(kartdiziz[18].ev);
                        listimgz.get(35).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        za=true;
                    }
                }
            }
        });

    }
    public void belirt(){
        if(p1==true){
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                textView4.setText(Html.fromHtml("<b>P1:<b>",Html.FROM_HTML_MODE_COMPACT));
                textView6.setText("P2:");
            }
        }
        if(p2==true){
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                textView6.setText(Html.fromHtml("<b>P2:<b>",Html.FROM_HTML_MODE_COMPACT));
                textView4.setText("P1:");

            }
        }

    }
    public void sure(){
        btn_sureyi_baslat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btn_sureyi_baslat.setEnabled(false);
                imgz1.setEnabled(true);imgz2.setEnabled(true);imgz3.setEnabled(true);imgz4.setEnabled(true);imgz5.setEnabled(true);imgz6.setEnabled(true);
                imgz7.setEnabled(true);imgz8.setEnabled(true);imgz9.setEnabled(true);imgz10.setEnabled(true);imgz11.setEnabled(true);imgz12.setEnabled(true);
                imgz13.setEnabled(true);imgz14.setEnabled(true);imgz15.setEnabled(true);imgz16.setEnabled(true);imgz17.setEnabled(true);imgz18.setEnabled(true);
                imgz19.setEnabled(true);imgz20.setEnabled(true);imgz21.setEnabled(true);imgz22.setEnabled(true);imgz23.setEnabled(true);imgz24.setEnabled(true);
                imgz25.setEnabled(true);imgz26.setEnabled(true);imgz27.setEnabled(true);imgz28.setEnabled(true);imgz29.setEnabled(true);imgz30.setEnabled(true);
                imgz31.setEnabled(true);imgz32.setEnabled(true);imgz33.setEnabled(true);imgz34.setEnabled(true);imgz35.setEnabled(true);imgz36.setEnabled(true);

                countDownTimerz.start();

            }

        });
    }
}