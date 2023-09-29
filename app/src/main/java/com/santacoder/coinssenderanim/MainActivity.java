package com.santacoder.coinssenderanim;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.santacoder.coins_sender_anim.SantaCoderAnimationUtil;

public class MainActivity extends AppCompatActivity {

    ImageView tview;
    LinearLayout dview;
    Button sendBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tview = findViewById(R.id.targetView);
        dview = findViewById(R.id.destView);
        sendBtn = findViewById(R.id.sendBtn);
        sendBtn.setOnClickListener(view -> {
            startCoinsCollectingAnim(tview, dview);
        });

    }

    private void startCoinsCollectingAnim(ImageView sender, LinearLayout receiver) {
        new SantaCoderAnimationUtil().attachActivity(this).setTargetView(sender).setMoveDuration(500).setBorderColor(Color.TRANSPARENT).isHideTargetView(false).setDestView(receiver).setAnimationListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {

            }

            @Override
            public void onAnimationEnd(Animator animation) {

            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        }).startAnimation();
    }

}