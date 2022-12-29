package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaPlayer;
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


public class KolayActivity<a> extends AppCompatActivity {
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    private ImageView imgv1;
    private ImageView imgv2;
    private ImageView imgv3;
    private TextView textView2;
    private TextView textView5;
    private TextView txt_sureyi_goster;
    private Button btn_sureyi_baslat;
    CountDownTimer countDownTimer = new CountDownTimer(45000, 1000) {
        @Override
        public void onTick(long l) {
            txt_sureyi_goster.setText("" + l / 1000);
            if (f == 2) {
                countDownTimer.cancel();
                MediaPlayer music = MediaPlayer.create(KolayActivity.this, R.raw.bitti);
                music.start();
                AlertDialog.Builder builder = new AlertDialog.Builder(KolayActivity.this);
                builder.setView(R.layout.temp);
                builder.setTitle("HARRY POTTER MEMORY MASTER");
                builder.setMessage("TEBRİKLER!" + "\nPuanınız:" + textView2.getText());
                builder.setNegativeButton("Tamam", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(KolayActivity.this, KolayZorActivity.class);
                        startActivity(intent);
                    }
                });
                builder.show();
            }
        }

        @Override
        public void onFinish() {
            AlertDialog.Builder builder1 = new AlertDialog.Builder(KolayActivity.this);
            builder1.setView(R.layout.temp);
            builder1.setTitle("HARRY POTTER MEMORY MASTER");
            builder1.setMessage("SÜRENİZ BİTTİ!" + "\nPuanınız:" + textView2.getText());
            builder1.setNegativeButton("Tamam", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent intent = new Intent(KolayActivity.this, KolayZorActivity.class);
                    startActivity(intent);
                }
            });
            builder1.show();
            MediaPlayer music = MediaPlayer.create(KolayActivity.this, R.raw.surebit);
            music.start();
            imgv1.setEnabled(false);
            imgv2.setEnabled(false);
            imgv3.setEnabled(false);
            imgv4.setEnabled(false);
        }
    };
    int i = 0;
    int f = 0;
    int n = 0;
    boolean p = true;
    boolean q = true;
    boolean r = true;
    boolean s = true;
    private ImageView imgv4;
    kartlar[] kartdizi = new kartlar[44];
    List<String> acilmis = new ArrayList<>();
    List<String> acilmispuan = new ArrayList<>();
    List<String> acilmisev = new ArrayList<>();
    List<String> listev = new ArrayList<>();
    List<String> listisim = new ArrayList<>();
    List<String> listev1 = new ArrayList<>();
    List<String> listpuan = new ArrayList<>();
    List<Bitmap> listimg = new ArrayList<Bitmap>();
    List<ImageView> listimgv = new ArrayList<ImageView>();
    List<ImageView> tempimgv = new ArrayList<ImageView>();

    @SuppressLint({"MissingInflatedId", "RestrictedApi"})
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img);
        imgv1 = (ImageView) findViewById(R.id.imgv1);
        imgv2 = (ImageView) findViewById(R.id.imgv2);
        imgv3 = (ImageView) findViewById(R.id.imgv3);
        imgv4 = (ImageView) findViewById(R.id.imgv4);
        txt_sureyi_goster = findViewById(R.id.txt_sureyi_goster);
        btn_sureyi_baslat = findViewById(R.id.btn_sureyi_baslat);
        textView2 = findViewById(R.id.textView2);
        textView5 = findViewById(R.id.textView5);
        listimgv.add(imgv1);
        listimgv.add(imgv2);
        listimgv.add(imgv3);
        listimgv.add(imgv4);
        listev.add("slytherin");
        listev.add("gryffindor");
        listev.add("hufflepuff");
        listev.add("ravenclaw");
        imgv1.setEnabled(false);
        imgv2.setEnabled(false);
        imgv3.setEnabled(false);
        imgv4.setEnabled(false);

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
                        kartdizi[n] = new kartlar(listisim.get(n), listimg.get(n), listev1.get(n), listpuan.get(n));
                    }
                    Collections.shuffle(Arrays.asList(kartdizi));


                }

            });
        }


        Collections.shuffle(listimgv);

        sure();
        x();
        y();
        z();
        t();


    }


    public void x() {
        listimgv.get(3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (acilmis.size() == 0 || acilmis.size() == 1) {
                    if (q == true) {
                        listimgv.get(3).setImageBitmap(kartdizi[1].img);
                        q = false;
                        acilmis.add(kartdizi[1].ad);
                        acilmisev.add(kartdizi[1].ev);
                        tempimgv.add(listimgv.get(3));
                        acilmispuan.add(kartdizi[1].puan);
                        textView5.setText(kartdizi[1].ad);
                        if (acilmis.size() == 2) {
                            if (acilmis.get(0) == acilmis.get(1)) {
                                tempimgv.get(0).setEnabled(false);
                                tempimgv.get(1).setEnabled(false);
                                textView2.setText((String.valueOf(Float.parseFloat((String) textView2.getText()) + (Integer.parseInt(acilmisev.get(0)) * 2 * ((Float.parseFloat((String) txt_sureyi_goster.getText())) / 10) * (Integer.parseInt(acilmispuan.get(0)))))));
                                MediaPlayer music = MediaPlayer.create(KolayActivity.this, R.raw.esbul);
                                music.start();
                                acilmis.clear();
                                acilmispuan.clear();
                                tempimgv.clear();
                                acilmisev.clear();
                                f++;
                            } else {
                                if (acilmisev.get(0) == acilmisev.get(1)) {
                                    textView2.setText(String.valueOf(Float.parseFloat((String) textView2.getText()) - ((Integer.parseInt(acilmispuan.get(0)) + Integer.parseInt(acilmispuan.get(1))) / Integer.parseInt(acilmisev.get(0))) * ((45 - Integer.parseInt((String) txt_sureyi_goster.getText()))) / 10));
                                } else {
                                    textView2.setText(String.valueOf(Float.parseFloat((String) textView2.getText()) - (((Integer.parseInt(acilmispuan.get(0))) + Integer.parseInt(acilmispuan.get(1))) / 2 * Integer.parseInt(acilmisev.get(0)) * Integer.parseInt(acilmisev.get(1)) * ((45 - Float.parseFloat((String) txt_sureyi_goster.getText()))) / 10)));
                                }
                            }
                        }
                    } else {
                        listimgv.get(3).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        q = true;
                        acilmis.remove(kartdizi[1].ad);
                        acilmispuan.remove(kartdizi[1].puan);
                        tempimgv.remove(listimgv.get(3));
                        acilmisev.remove(kartdizi[1].ev);
                    }
                } else {
                    if (q == false) {
                        acilmis.remove(kartdizi[1].ad);
                        tempimgv.remove(listimgv.get(3));
                        acilmispuan.remove(kartdizi[1].puan);
                        acilmisev.remove(kartdizi[1].ev);
                        q = true;
                        listimgv.get(3).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                    }
                }
            }
        });

    }

    public void y() {
        listimgv.get(2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (acilmis.size() == 0 || acilmis.size() == 1) {
                    if (r == true) {
                        listimgv.get(2).setImageBitmap(kartdizi[1].img);
                        r = false;
                        acilmis.add(kartdizi[1].ad);
                        acilmispuan.add(kartdizi[1].puan);
                        acilmisev.add(kartdizi[1].ev);
                        tempimgv.add(listimgv.get(2));
                        textView5.setText(kartdizi[1].ad);
                        if (acilmis.size() == 2) {
                            if (acilmis.get(0) == acilmis.get(1)) {
                                tempimgv.get(0).setEnabled(false);
                                tempimgv.get(1).setEnabled(false);
                                textView2.setText((String.valueOf(Float.parseFloat((String) textView2.getText()) + (Integer.parseInt(acilmisev.get(0)) * 2 * ((Float.parseFloat((String) txt_sureyi_goster.getText())) / 10) * (Integer.parseInt(acilmispuan.get(0)))))));
                                MediaPlayer music = MediaPlayer.create(KolayActivity.this, R.raw.esbul);
                                music.start();
                                acilmispuan.clear();
                                acilmis.clear();
                                tempimgv.clear();
                                acilmisev.clear();
                                f++;
                            } else {


                                if (acilmisev.get(0) == acilmisev.get(1)) {
                                    textView2.setText(String.valueOf(Float.parseFloat((String) textView2.getText()) - ((Integer.parseInt(acilmispuan.get(0)) + Integer.parseInt(acilmispuan.get(1))) / Integer.parseInt(acilmisev.get(0))) * ((45 - Integer.parseInt((String) txt_sureyi_goster.getText()))) / 10));
                                } else {
                                    textView2.setText(String.valueOf(Float.parseFloat((String) textView2.getText()) - (((Integer.parseInt(acilmispuan.get(0))) + Integer.parseInt(acilmispuan.get(1))) / 2 * Integer.parseInt(acilmisev.get(0)) * Integer.parseInt(acilmisev.get(1)) * ((45 - Float.parseFloat((String) txt_sureyi_goster.getText()))) / 10)));
                                }

                            }
                        }
                    } else {
                        listimgv.get(2).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        r = true;
                        acilmis.remove(kartdizi[1].ad);
                        acilmisev.remove(kartdizi[1].ev);
                        acilmispuan.remove(kartdizi[1].puan);
                        tempimgv.remove(listimgv.get(2));
                    }
                } else {

                    if (r == false) {
                        acilmis.remove(kartdizi[1].ad);
                        tempimgv.remove(listimgv.get(2));
                        acilmispuan.remove(kartdizi[1].puan);
                        acilmisev.remove(kartdizi[1].ev);
                        r = true;
                        listimgv.get(2).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);

                    }
                }
            }
        });
    }

    public void z() {

        listimgv.get(1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (acilmis.size() == 0 || acilmis.size() == 1) {
                    if (s == true) {
                        listimgv.get(1).setImageBitmap(kartdizi[4].img);
                        s = false;
                        acilmis.add(kartdizi[4].ad);
                        acilmispuan.add(kartdizi[4].puan);
                        acilmisev.add(kartdizi[4].ev);
                        tempimgv.add(listimgv.get(1));
                        textView5.setText(kartdizi[4].ad);
                        if (acilmis.size() == 2) {
                            if (acilmis.get(0) == acilmis.get(1)) {
                                tempimgv.get(0).setEnabled(false);
                                tempimgv.get(1).setEnabled(false);
                                textView2.setText((String.valueOf(Float.parseFloat((String) textView2.getText()) + (Integer.parseInt(acilmisev.get(0)) * 2 * ((Float.parseFloat((String) txt_sureyi_goster.getText())) / 10) * (Integer.parseInt(acilmispuan.get(0)))))));
                                MediaPlayer music = MediaPlayer.create(KolayActivity.this, R.raw.esbul);
                                music.start();
                                acilmispuan.clear();
                                acilmis.clear();
                                tempimgv.clear();
                                acilmisev.clear();
                                f++;
                            } else {


                                if (acilmisev.get(0) == acilmisev.get(1)) {
                                    textView2.setText(String.valueOf(Float.parseFloat((String) textView2.getText()) - ((Integer.parseInt(acilmispuan.get(0)) + Integer.parseInt(acilmispuan.get(1))) / Integer.parseInt(acilmisev.get(0))) * ((45 - Integer.parseInt((String) txt_sureyi_goster.getText()))) / 10));
                                } else {
                                    textView2.setText(String.valueOf(Float.parseFloat((String) textView2.getText()) - (((Integer.parseInt(acilmispuan.get(0))) + Integer.parseInt(acilmispuan.get(1))) / 2 * Integer.parseInt(acilmisev.get(0)) * Integer.parseInt(acilmisev.get(1)) * ((45 - Float.parseFloat((String) txt_sureyi_goster.getText()))) / 10)));
                                }

                            }

                        }
                    } else {
                        listimgv.get(1).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        acilmis.remove(kartdizi[4].ad);
                        tempimgv.remove(listimgv.get(1));
                        acilmispuan.remove(kartdizi[4].puan);
                        acilmisev.remove(kartdizi[4].ev);
                        s = true;
                    }
                } else {

                    if (s == false) {
                        acilmis.remove(kartdizi[4].ad);
                        tempimgv.remove(listimgv.get(1));
                        acilmispuan.remove(kartdizi[4].puan);
                        acilmisev.remove(kartdizi[4].ev);
                        listimgv.get(1).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        s = true;
                    }
                }
            }
        });
    }

    public void t() {

        listimgv.get(0).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (acilmis.size() == 0 || acilmis.size() == 1) {
                    if (p == true) {
                        listimgv.get(0).setImageBitmap(kartdizi[4].img);
                        p = false;
                        acilmis.add(kartdizi[4].ad);
                        tempimgv.add(listimgv.get(0));
                        acilmispuan.add(kartdizi[4].puan);
                        acilmisev.add(kartdizi[4].ev);
                        textView5.setText(kartdizi[4].ad);
                        if (acilmis.size() == 2) {
                            if (acilmis.get(0) == acilmis.get(1)) {
                                tempimgv.get(0).setEnabled(false);
                                tempimgv.get(1).setEnabled(false);
                                textView2.setText((String.valueOf(Float.parseFloat((String) textView2.getText()) + (Integer.parseInt(acilmisev.get(0)) * 2 * ((Float.parseFloat((String) txt_sureyi_goster.getText())) / 10) * (Integer.parseInt(acilmispuan.get(0)))))));
                                MediaPlayer music = MediaPlayer.create(KolayActivity.this, R.raw.esbul);
                                music.start();
                                acilmis.clear();
                                acilmispuan.clear();
                                tempimgv.clear();
                                acilmisev.clear();
                                f++;
                            } else {
                                if (acilmisev.get(0) == acilmisev.get(1)) {
                                    textView2.setText(String.valueOf(Float.parseFloat((String) textView2.getText()) - ((Integer.parseInt(acilmispuan.get(0)) + Integer.parseInt(acilmispuan.get(1))) / Integer.parseInt(acilmisev.get(0))) * ((45 - Integer.parseInt((String) txt_sureyi_goster.getText()))) / 10));
                                } else {
                                    textView2.setText(String.valueOf(Float.parseFloat((String) textView2.getText()) - (((Integer.parseInt(acilmispuan.get(0))) + Integer.parseInt(acilmispuan.get(1))) / 2 * Integer.parseInt(acilmisev.get(0)) * Integer.parseInt(acilmisev.get(1)) * ((45 - Float.parseFloat((String) txt_sureyi_goster.getText()))) / 10)));
                                }
                            }
                        }
                    } else {
                        listimgv.get(0).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        p = true;
                        acilmis.remove(kartdizi[4].ad);
                        tempimgv.remove(listimgv.get(0));
                        acilmispuan.remove(kartdizi[4].puan);
                        acilmisev.remove(kartdizi[4].ev);
                    }
                } else {
                    if (p == false) {
                        acilmis.remove(kartdizi[4].ad);
                        tempimgv.remove(listimgv.get(0));
                        acilmispuan.remove(kartdizi[4].puan);
                        acilmisev.remove(kartdizi[4].ev);
                        listimgv.get(0).setImageResource(R.drawable.harry_potter_hogwarts_coat_of_arms_small_tarra);
                        p = true;
                    }
                }
            }
        });

    }

    public void sure() {
        btn_sureyi_baslat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_sureyi_baslat.setEnabled(false);
                imgv1.setEnabled(true);
                imgv2.setEnabled(true);
                imgv3.setEnabled(true);
                imgv4.setEnabled(true);
                countDownTimer.start();
            }

        });
    }

}







