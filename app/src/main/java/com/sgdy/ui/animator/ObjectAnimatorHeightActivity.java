package com.sgdy.ui.animator;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.sgdy.ui.R;

public class ObjectAnimatorHeightActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_object_animator4);

        ImageView imageView = (ImageView) findViewById(R.id.image);
        ViewWrapper viewWrapper = new ViewWrapper(imageView);
        ObjectAnimator.ofInt(viewWrapper, "height", 100).setDuration(5000).start();
    }

    public class ViewWrapper {

        private View view;

        public ViewWrapper(View view) {
            this.view = view;
        }

        public int getHeight() {
            return view.getLayoutParams().height;
        }

        public void setHeight(int height) {
            view.getLayoutParams().height = height;
            view.requestLayout();
        }
    }
}
