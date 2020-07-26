package com.example.projectlyfia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;

public class ActivitySignIn extends AppCompatActivity {

    Animation slide_left_enter, slide_right_enter, slide_up_enter;
    RelativeLayout layout_phone_number, layout_password, layout_sign_in, btnSignUp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        layout_phone_number = findViewById(R.id.layout_phone_number);
        layout_password = findViewById(R.id.layout_password);
        layout_sign_in = findViewById(R.id.layout_sign_in);
        btnSignUp = findViewById(R.id.btnSignUp);

        slide_left_enter = AnimationUtils.loadAnimation(this, R.anim.swipe_left_enter);
        slide_right_enter = AnimationUtils.loadAnimation(this, R.anim.swipe_right_enter);
        slide_up_enter = AnimationUtils.loadAnimation(this, R.anim.slide_up_enter);

        applyAnimation();

    }

    private void applyAnimation(){
        layout_phone_number.startAnimation(slide_right_enter);
        layout_password.startAnimation(slide_left_enter);
        layout_sign_in.startAnimation(slide_up_enter);
    }

}
