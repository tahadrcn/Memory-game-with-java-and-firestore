package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class uyeolActivity extends AppCompatActivity {
    private EditText editmail,editpass;
    private String txtmail,txtpass;
    private FirebaseAuth mAuth;
    private FirebaseUser mUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uyeol);
        editmail=(EditText)findViewById(R.id.uye_mail);
        editpass=(EditText)findViewById(R.id.uye_sifre);
        mAuth=FirebaseAuth.getInstance();
    }
    public void uyeoldurma(View v){
        txtmail=editmail.getText().toString();
        txtpass=editpass.getText().toString();

        if(!TextUtils.isEmpty(txtmail) && !TextUtils.isEmpty(txtpass)){
            mAuth.createUserWithEmailAndPassword(txtmail,txtpass)
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful()){
                                Toast.makeText(uyeolActivity.this,"Kayıt islemi başarılı",Toast.LENGTH_SHORT).show();
                            }
                            else{
                                Toast.makeText(uyeolActivity.this,task.getException().getMessage(),Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
        }
        else {
            Toast.makeText(this,"Email veya şifre boş olamaz.",Toast.LENGTH_SHORT).show();
        }

    }
    public void geridon_uye(View view){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}