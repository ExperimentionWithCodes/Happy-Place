package com.shubhangi.happyplace;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Affirmation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_affirmation);


        final int[] count = {0};
        final int[] b = new int[1];
        ImageButton b1=(ImageButton)findViewById(R.id.imageButton5);
        ImageButton b2=(ImageButton)findViewById(R.id.imageButton6);
        final TextView t1=(TextView)findViewById(R.id.textView9);
        b1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                count[0]++;
                if (count[0] ==1) {
                    t1.setText("My life purpose can be whatever I choose it to be.");
                    b[0] =1;
                }
                else if (count[0] ==2) {
                    t1.setText("I look good because I am good.");
                    b[0] =2;
                }
                else if (count[0] ==3) {
                    t1.setText("I let go of worries that drain my energy.");
                    b[0] =3;
                }
                else if (count[0] ==4)
                {t1.setText("I know I can master anything if I practice it continually.");
                    b[0] =4;
                }
                else if (count[0] ==5)
                   count[0]=0;

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count[0]++;
                if (count[0] ==1) {
                    t1.setText("I am separate from depression.");
                    b[0] =1;
                }
                else if (count[0] ==2) {
                    t1.setText("I have many options and can make wise decisions");
                    b[0] =2;
                }
                else if (count[0] ==3) {
                    t1.setText("I am healthy and have all that I need.");
                    b[0] =3;
                }
                else if (count[0] ==4)
                {t1.setText("I feel the love of those who are not physically around me");
                    b[0] =4;
                }
                else if (count[0] ==5)
                    count[0]=0;



            }
        });
    }
}
