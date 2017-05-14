package com.sgdy.ui.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.sgdy.ui.R;

public class AlphaAnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alpha_animation);

        ImageView imageView = (ImageView) findViewById(R.id.image);
        Animation loadAnimation = AnimationUtils.loadAnimation(this,
                R.anim.alpha);
        loadAnimation.setFillAfter(true);
        imageView.startAnimation(loadAnimation);

        ImageView imageView1 = (ImageView) findViewById(R.id.image1);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setFillAfter(true);
        alphaAnimation.setDuration(2000);
        alphaAnimation.setRepeatCount(2);
        alphaAnimation.setRepeatMode(Animation.REVERSE);
        imageView1.startAnimation(alphaAnimation);
    }
}
