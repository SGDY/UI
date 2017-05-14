package com.sgdy.ui.animator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.sgdy.ui.R;

public class AnimatorIndexActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animator_index);

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
            //属性动画之Xml创建ObjectAnimator3
            startActivity(new Intent(this, ObjectAnimatorXmlActivity.class));
        });
        findViewById(R.id.objectAnimator4).setOnClickListener(view -> {
            //属性动画之ObjectAnimator设置控件高度
            startActivity(new Intent(this, ObjectAnimatorHeightActivity.class));
        });
    }
}
