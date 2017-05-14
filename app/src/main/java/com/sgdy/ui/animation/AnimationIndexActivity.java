package com.sgdy.ui.animation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.sgdy.ui.R;

public class AnimationIndexActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation_index);

        findViewById(R.id.alphaAnimation).setOnClickListener(view -> {
            //补间动画之AlphaAnimation
            startActivity(new Intent(this, AlphaAnimationActivity.class));
        });
        findViewById(R.id.scaleAnimation).setOnClickListener(view -> {
            //补间动画之ScaleAnimation
            startActivity(new Intent(this, ScaleAnimationActivity.class));
        });
        findViewById(R.id.translateAnimation).setOnClickListener(view -> {
            //补间动画之TranslateAnimation
            startActivity(new Intent(this, TranslateAnimationActivity.class));
        });
        findViewById(R.id.rotateAnimation).setOnClickListener(view -> {
            //补间动画之RotateAnimation
            startActivity(new Intent(this, RotateAnimationActivity.class));
        });
    }
}
