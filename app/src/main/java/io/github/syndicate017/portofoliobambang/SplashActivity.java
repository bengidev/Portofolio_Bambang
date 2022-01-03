package io.github.syndicate017.portofoliobambang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;

public class SplashActivity extends AppCompatActivity {

    ImageView imgBackground, imgPortofolio, imgProfile;
    LottieAnimationView lottieAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ////For hide the statusbar
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash);

        imgBackground = findViewById(R.id.imgBackground);
        imgPortofolio = findViewById(R.id.imgPortofolio);
        imgProfile = findViewById(R.id.imgProfile);

        lottieAnim = findViewById(R.id.lottieAnim);

        imgBackground.animate().translationY(-4000).setDuration(500).setStartDelay(3000);
        imgPortofolio.animate().translationY(3000).setDuration(500).setStartDelay(3000);
        imgProfile.animate().translationY(3000).setDuration(500).setStartDelay(3000);
        lottieAnim.animate().translationY(3000).setDuration(500).setStartDelay(3000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 3600);
    }
}