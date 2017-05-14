package com.sgdy.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.sgdy.ui.animation.AlphaAnimationActivity;
import com.sgdy.ui.animation.RotateAnimationActivity;
import com.sgdy.ui.animation.ScaleAnimationActivity;
import com.sgdy.ui.animation.TranslateAnimationActivity;
import com.sgdy.ui.animator.ObjectAnimatorActivity;
import com.sgdy.ui.animator.ObjectAnimatorActivity2;
import com.sgdy.ui.animator.ObjectAnimatorActivity3;
import com.sgdy.ui.animator.ObjectAnimatorActivity4;
import com.sgdy.ui.animator.ValueAnimatorActivity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.valueAnimator).setOnClickListener(view -> {
            //属性动画之ValueAnimator
            startActivity(new Intent(this, ValueAnimatorActivity.class));
        });
        findViewById(R.id.objectAnimator).setOnClickListener(view -> {
            //属性动画之ObjectAnimator
            startActivity(new Intent(this, ObjectAnimatorActivity.class));
        });
        findViewById(R.id.objectAnimator2).setOnClickListener(view -> {
            //属性动画之ObjectAnimator2
            startActivity(new Intent(this, ObjectAnimatorActivity2.class));
        });
        findViewById(R.id.objectAnimator3).setOnClickListener(view -> {
            //属性动画之ObjectAnimator3
            startActivity(new Intent(this, ObjectAnimatorActivity3.class));
        });
        findViewById(R.id.objectAnimator4).setOnClickListener(view -> {
            //属性动画之ObjectAnimator4
            startActivity(new Intent(this, ObjectAnimatorActivity4.class));
        });
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
