package com.example.smartcalories;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class Splash_Screen extends AppCompatActivity {
    private final int duracion_splash = 2000;  // Variable del tiempo que dura el Splash en milisegundos

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash__screen);

        new Handler().postDelayed(new Runnable() {
            public void run(){
                Intent intent = new Intent(Splash_Screen.this, MainActivity.class);
                startActivity(intent);
                finish();
            };
        }, duracion_splash);

    }
}