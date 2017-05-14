package com.sgdy.ui.animator;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.sgdy.ui.R;

public class ObjectAnimatorActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_object_animator2);

        ImageView imageView = (ImageView) findViewById(R.id.image1);
        //利用ObjectAnimator实现透明度动画
        ObjectAnimator.ofFloat(imageView, "alpha", 1, 0, 1)
                .setDuration(2000).start();

        ImageView imageView2 = (ImageView) findViewById(R.id.image2);
        //利用AnimatorSet和ObjectAnimator实现缩放动画
        final AnimatorSet animatorSet = new AnimatorSet();
        imageView2.setPivotX(48f);
        imageView2.setPivotY(48f);
        animatorSet.playTogether(
                ObjectAnimator.ofFloat(imageView2, "scaleX", 1, 0).setDuration(5000),
                ObjectAnimator.ofFloat(imageView2, "scaleY", 1, 0).setDuration(5000));
        animatorSet.start();

        ImageView imageView3 = (ImageView) findViewById(R.id.image3);
        //利用AnimatorSet和ObjectAnimator实现平移动画
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(
                ObjectAnimator.ofFloat(imageView3, "translationX", 200, 0).setDuration(2000),
                ObjectAnimator.ofFloat(imageView3, "translationY", 200, 0).setDuration(2000));
        animatorSet3.start();

        ImageView imageView4 = (ImageView) findViewById(R.id.image4);
        //利用ObjectAnimator实现旋转动画
        imageView4.setPivotX(48f);
        imageView4.setPivotY(48f);
        ObjectAnimator.ofFloat(imageView4, "rotation", 0, 360)
                .setDuration(1000).start();

    }
}
