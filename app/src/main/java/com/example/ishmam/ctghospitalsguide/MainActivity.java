package com.example.ishmam.ctghospitalsguide;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int splashtimeout=4000;
    ImageView logo;
    TextView name;
    Animation fadeanim,rotateanim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logo=findViewById(R.id.log);
        name=findViewById(R.id.nam);
        fadeanim= AnimationUtils.loadAnimation(MainActivity.this,R.anim.fade);
        rotateanim= AnimationUtils.loadAnimation(MainActivity.this,R.anim.rotate);

        logo.startAnimation(rotateanim);
        name.startAnimation(fadeanim);



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(MainActivity.this,HomeActivity.class);
                startActivity(intent);
                finish();

            }
        },splashtimeout);

    }
}
