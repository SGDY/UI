package com.sgdy.ui.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.sgdy.ui.R;

public class RotateAnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rotate_animation);

        ImageView imageView = (ImageView) findViewById(R.id.image);
        Animation loadAnimation = AnimationUtils.loadAnimation(this,
                R.anim.rotate);
        loadAnimation.setFillAfter(false);
        imageView.startAnimation(loadAnimation);
    }
}
