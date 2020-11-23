package com.example.proyectofinal_heidihuancachambi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView email,user;
    ImageView logo,ivUser,ivEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //
        setContentView(R.layout.activity_main);
        //instanciamos loas atributos de la Activity Principal

        //Agregar animaciones
        Animation animacion1= AnimationUtils.loadAnimation(this,R.anim.desplazamiento_arriba);
        Animation animacion2=AnimationUtils.loadAnimation(this,R.anim.desplazamiento_abajo);

        email=findViewById(R.id.txtEmail);
        user=findViewById(R.id.txtUser);
        logo=findViewById(R.id.ivLogo);
        ivUser=findViewById(R.id.ivUser);
        ivEmail=findViewById(R.id.ivEmail);

        logo.setAnimation(animacion1);
        email.setAnimation(animacion2);
        user.setAnimation(animacion2);
        ivUser.setAnimation(animacion2);
        ivEmail.setAnimation(animacion2);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(MainActivity.this,HomeActivity.class);
                startActivity(i);
                finish();
            }
        },3000);

    }//fin OnCreate
}