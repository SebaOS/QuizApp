package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    View logo;
    TextView startText;
    Animation quizAnimation, descriptionAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        quizAnimation = AnimationUtils.loadAnimation(this, R.anim.quiz_animation);
        descriptionAnimation = AnimationUtils.loadAnimation(this, R.anim.description_animation);

        logo = findViewById(R.id.logo);
        startText = findViewById(R.id.startText);

        logo.setAnimation(quizAnimation);
        startText.setAnimation(descriptionAnimation);
    }
}
