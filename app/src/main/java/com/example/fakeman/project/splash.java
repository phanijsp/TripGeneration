package com.example.fakeman.project;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import org.w3c.dom.Text;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Window g=getWindow();
        g.setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION,WindowManager.LayoutParams.TYPE_STATUS_BAR);
        TextView    t=(TextView)    findViewById(R.id.textView5);

        Typeface mmedium = Typeface.createFromAsset(getAssets(), "fonts/MontserratMedium.ttf");

        t.setText("Trip Generation\nManual India");
        t.setTypeface(mmedium);
        t.setVisibility(View.VISIBLE);
     //   ObjectAnimator  objectAnimator=ObjectAnimator.ofFloat(t,"y",200);
      //  objectAnimator.setDuration(2000);

//        objectAnimator.start();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // do something after 2s = 2000 miliseconds
                Intent i=new Intent(splash.this,MainActivity.class);
                startActivity(i);
                splash.this.finish();
            }
        }, 2000);

    }

}



