package com.example.atecdroid.fivencook.activities;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.atecdroid.fivencook.R;

public class AvSplashScreen extends AppCompatActivity {

    private final int SPLASH_DISPLAY_LENGTH = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                Intent mainIntent = new Intent(AvSplashScreen.this,AvMainActivity.class);
                AvSplashScreen.this.startActivity(mainIntent);
                AvSplashScreen.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);

    }
}
