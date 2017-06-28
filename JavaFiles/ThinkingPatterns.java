package com.shubhangi.happyplace;

import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class ThinkingPatterns extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thinking_patterns);
        ImageButton b1=(ImageButton)findViewById(R.id.imageButton);
        ImageButton b2=(ImageButton)findViewById(R.id.imageButton2);
        ImageButton b3=(ImageButton)findViewById(R.id.imageButton3);
        ImageButton b4=(ImageButton)findViewById(R.id.imageButton4);
        final TextView t1=(TextView)findViewById(R.id.tv1);
        final TextView t2=(TextView)findViewById(R.id.tv2);
        final TextView t3=(TextView)findViewById(R.id.tv3);
        final TextView t4=(TextView)findViewById(R.id.tv4);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText("MENTAL FILTER");
                t2.setText("When we notice only what our 'filter' allows us to notice, and we dismiss anything that doesn't fit.");
                t4.setText("Am I only noticing te bad stuff? Am i filtering out the positives? Am I wearing those 'gloomy specs'? ");
                t3.setText("ASK YOURSELF");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText("PREDICTION");
                t2.setText("Believing we now what's going to happen in the future and treating it as a certainty.");
                t3.setText("ASK YOURSELF!");
                t4.setText("Am I thinking that i can predict thr future? How likely i sit that that might really happen");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText("COMPARE AND DESPAIR");
                t2.setText("Seeing only the good and positive aspects in others, and comparing ourselves negatively against them.");
                t3.setText("ASK YOURSELF!");
                t4.setText("Am I doing that 'compare and despair' thing? What would be a more balanced and helpful way of looking at it?");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText("BAD MEMORIES");
                t2.setText("Sometimes events trigger memories of being hurt in the past, leading us to believe that the danger is here and now,rather than in the past,caused us to feel down,upset,stressed or worried right now.");
                t4.setText("This is just a reminder of the past.That was then, and this is now. Even though this memory makes m feel upset,its not actually happening.");
                t3.setText("REMEMBER");
            }
        });

    }
}
