package com.sgdy.ui.animator;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.sgdy.ui.R;
import com.sgdy.ui.util.LogUtils;

/**
 * ValueAnimator只是对值进行了一个平滑的动画过渡
 */
public class ValueAnimatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_value_animator);

        TextView tv1 = (TextView) findViewById(R.id.tv1);

        /**
         * setStartDelay()方法来设置动画延迟播放的时间
         * setRepeatCount()和setRepeatMode()方法来设置动画循环播放的次数以及循环播放的模式，
         * 循环模式包括RESTART和REVERSE两种，分别表示重新播放和倒序播放的意思。
         */
        ValueAnimator animator = ValueAnimator.ofFloat(0f, 100f);
        animator.setDuration(300);
        animator.setTarget(tv1);
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                Object value = valueAnimator.getAnimatedValue();
                LogUtils.d("cuurent value is " + value);
            }
        });
        animator.start();


    }

}
