package com.shubhangi.happyplace;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class DisplayUsername extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_username);
        TextView t1=(TextView)findViewById(R.id.textView10);
        TextView t2=(TextView)findViewById(R.id.textView11);
        TextView t3=(TextView)findViewById(R.id.textView12);
        TextView t4=(TextView)findViewById(R.id.textView13);
        String username=getIntent().getStringExtra("TEXT");
        t4.setText(username);
        final Animation an1= AnimationUtils.loadAnimation(getBaseContext(),R.anim.fade_in);

        t1.setAnimation(an1);
        t2.setAnimation(an1);
        t3.setAnimation(an1);
        t4.setAnimation(an1);
        an1.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                finish();
                Intent i=new Intent(getBaseContext(),frontpage.class);
                startActivity(i);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }
}
