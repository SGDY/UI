package com.sgdy.ui.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;

import com.sgdy.ui.R;

public class ScaleAnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scale_animation);

        ImageView imageView = (ImageView) findViewById(R.id.image);
        Animation loadAnimation = AnimationUtils.loadAnimation(this,
                R.anim.scale);
        loadAnimation.setFillAfter(false);
        imageView.startAnimation(loadAnimation);

        ImageView imageView1 = (ImageView) findViewById(R.id.image1);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f,
                Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        scaleAnimation.setDuration(4000);
        scaleAnimation.setInterpolator(new AccelerateInterpolator());
        imageView1.startAnimation(scaleAnimation);
    }
}
