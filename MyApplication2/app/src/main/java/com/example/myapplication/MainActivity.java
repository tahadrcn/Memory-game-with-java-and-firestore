package com.example.myapplication;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;


public class MainActivity extends AppCompatActivity {
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    private EditText editmail,editpass;
    private String txtmail,txtpass;
    private FirebaseAuth mAuth;
    private ImageView imageview6;
    boolean m=true;
    private FirebaseUser mUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    editmail=(EditText)findViewById(R.id.giris_mail);
    editpass=(EditText)findViewById(R.id.giris_sifre);
    imageview6=(ImageView) findViewById(R.id.imageView6);
    mAuth=FirebaseAuth.getInstance();
        MediaPlayer music = MediaPlayer.create(MainActivity.this, R.raw.full);
        music.start();
        imageview6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(m==true){
                    music.pause();
                    imageview6.setImageResource(R.drawable.no_audio_3);
                    m=false;
                }
                else if(m==false){
                    music.start();
                    imageview6.setImageResource(R.drawable.audio_2);
                    m=true;
                }

            }
        });



    }

    public void Girisyap(View view){
        txtmail=editmail.getText().toString();
        txtpass=editpass.getText().toString();

        if(!TextUtils.isEmpty(txtmail) && !TextUtils.isEmpty(txtpass)){
            mAuth.signInWithEmailAndPassword(txtmail,txtpass)
                    .addOnSuccessListener(this, new OnSuccessListener<AuthResult>() {
                        @Override
                        public void onSuccess(AuthResult authResult) {
                            mUser=mAuth.getCurrentUser();
                            Intent intent = new Intent(MainActivity.this, tek_cokActivity.class);
                            startActivity(intent);


                        }
                    }).addOnFailureListener(this, new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(MainActivity.this,e.getMessage(),Toast.LENGTH_SHORT).show();
                        }
                    });
        }
        else {
            Toast.makeText(this,"Email veya şifre boş olamaz.",Toast.LENGTH_SHORT).show();
        }

    }
    public void uyeol(View view){
        Intent intent=new Intent(this,uyeolActivity.class);
        startActivity(intent);
    }

}
