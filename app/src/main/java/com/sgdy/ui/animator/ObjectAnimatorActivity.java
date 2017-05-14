package com.sgdy.ui.animator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.sgdy.ui.R;

/**
 * ObjectAnimator继承自ValueAnimator
 */
public class ObjectAnimatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_object_animator);

        TextView tv1 = (TextView) findViewById(R.id.tv1);
        ObjectAnimator animator = ObjectAnimator.ofFloat(tv1, "alpha", 1f, 0f, 1f);
        animator.setDuration(3000);
        animator.start();

        TextView tv2 = (TextView) findViewById(R.id.tv2);
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(tv2, "rotation", 0f, 360f);
        animator2.setDuration(3000);
        animator2.start();

        TextView tv3 = (TextView) findViewById(R.id.tv3);
        ObjectAnimator animator3 = ObjectAnimator.ofFloat(tv3, "translationX",
                0, -500f, 0);
        animator3.setDuration(3000);
        animator3.start();

        TextView tv4 = (TextView) findViewById(R.id.tv4);
        ObjectAnimator animator4 = ObjectAnimator.ofFloat(tv4, "scaleY", 1f, 3f, 1f);
        animator4.setDuration(3000);
        animator4.start();

        TextView tv5 = (TextView) findViewById(R.id.tv5);
        /**
         * 组合动画功能主要需要借助AnimatorSet这个类，这个类提供了一个play()方法，
         * 如果我们向这个方法中传入一个Animator对象(ValueAnimator或ObjectAnimator)
         * 将会返回一个AnimatorSet.Builder的实例，AnimatorSet.Builder中包括以下四个方法：
         * after(Animator anim)   将现有动画插入到传入的动画之后执行
         * after(long delay)   将现有动画延迟指定毫秒后执行
         * before(Animator anim)   将现有动画插入到传入的动画之前执行
         * with(Animator anim)   将现有动画和传入的动画同时执行
         */
        ObjectAnimator moveIn = ObjectAnimator.ofFloat(tv5, "translationX", -500f, 0f);
        ObjectAnimator rotate = ObjectAnimator.ofFloat(tv5, "rotation", 0f, 360f);
        ObjectAnimator fadeInOut = ObjectAnimator.ofFloat(tv5, "alpha", 1f, 0f, 1f);
        AnimatorSet animSet = new AnimatorSet();
        /**
         * AnimatorListener监听动画的各种事件，
         * ObjectAnimator是继承自ValueAnimator的，
         * ValueAnimator又是继承自Animator的，
         * 因此不管是ValueAnimator还是ObjectAnimator都是可以使用addListener()这个方法的。
         * 另外AnimatorSet也是继承自Animator的，
         * 因此addListener()这个方法算是个通用的方法
         */
        animSet.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {
                //动画开始的时候调用
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                //动画结束的时候调用
            }

            @Override
            public void onAnimationCancel(Animator animator) {
                //动画被取消的时候调用
            }

            @Override
            public void onAnimationRepeat(Animator animator) {
                //动画重复执行的时候调用
            }
        });
        /**
         * 很多时候我们并不想要监听那么多个事件，
         * 可能我只想要监听动画结束这一个事件，
         * 那么每次都要将四个接口全部实现一遍就显得非常繁琐。
         * 没关系，为此Android提供了一个适配器类，叫作AnimatorListenerAdapter，
         * 使用这个类就可以解决掉实现接口繁琐的问题了
         */
        animSet.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                //监听动画结束事件
            }
        });
        animSet.play(rotate).with(fadeInOut).after(moveIn);
        animSet.setDuration(3000);
        animSet.start();
    }
}
