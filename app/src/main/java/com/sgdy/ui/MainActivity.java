package com.sgdy.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.sgdy.ui.animation.AnimationIndexActivity;
import com.sgdy.ui.animator.AnimatorIndexActivity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.animation).setOnClickListener(view -> {
            //Tween动画之Animation
            startActivity(new Intent(this, AnimationIndexActivity.class));
        });
        findViewById(R.id.animator).setOnClickListener(view -> {
            //属性动画之Animator
            startActivity(new Intent(this, AnimatorIndexActivity.class));
        });


    }
}
