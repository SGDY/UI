package com.sgdy.ui.animator;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.sgdy.ui.R;

public class ObjectAnimatorXmlActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_object_animator3);

        ImageView imageView = (ImageView) findViewById(R.id.image1);
        Animator animator = AnimatorInflater.loadAnimator(this, R.animator.alpha);
        animator.setTarget(imageView);
        animator.start();

        ImageView imageView2 = (ImageView) findViewById(R.id.image2);
        Animator animator2 = AnimatorInflater.loadAnimator(this, R.animator.scale);
        animator2.setTarget(imageView2);
        animator2.start();

        ImageView imageView3 = (ImageView) findViewById(R.id.image3);
        Animator animator3 = AnimatorInflater.loadAnimator(this, R.animator.translate);
        animator3.setTarget(imageView3);
        animator3.start();

        ImageView imageView4 = (ImageView) findViewById(R.id.image4);
        Animator animator4 = AnimatorInflater.loadAnimator(this, R.animator.rotate);
        animator4.setTarget(imageView4);
        animator4.start();
    }
}
