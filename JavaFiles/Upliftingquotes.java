package com.shubhangi.happyplace;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Upliftingquotes extends AppCompatActivity {

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upliftingquotes);
        tv=(TextView)findViewById(R.id.textView19);
        loadText();
    }
    private void loadText()
    {
        String s="";
        for(int x=1;x<=20;x++)
        {
            switch(x)
            {
                case 1:
                {
                    s+="Quotes"+String.valueOf(x)+": “Discouragement and failure are two of the surest stepping stones to success.” \n ~Dale Carnegie \n\n";
                    break;
                }
                case 2:
                {
                    s+="Quotes"+String.valueOf(x)+": “Once you choose hope, anything’s possible.”\n ~Christopher Reeve \n\n";
                    break;
                }
                case 3:
                {
                    s+="Quotes"+String.valueOf(x)+": “Most great people have attained their greatest success one step beyond their greatest failure.”\n ~Napoleon Hill \n\n";
                    break;
                }
                case 4:
                {
                    s+="Quotes"+String.valueOf(x)+": “The best way to predict the future is to create it.”  \n ~Abraham Lincoln \n\n";
                    break;
                }
                case 5:
                {
                    s+="Quotes"+String.valueOf(x)+": “The first step is you have to say that you can” \n ~Will Smith \n\n";
                    break;
                }
                case 6:
                {
                    s+="Quotes"+String.valueOf(x)+": “Only those who dare to fail greatly can ever achieve greatly.” \n ~Robert F. Kennedy \n\n";
                    break;
                }
                case 7:
                {
                    s+="Quotes"+String.valueOf(x)+": “If I persist long enough I will win.” \n ~Og Mandino \n\n";
                    break;
                }
                case 8:
                {
                    s+="Quotes"+String.valueOf(x)+": “In the middle of a difficulty lies opportunity.”  \n ~Albert Einstein \n\n";
                    break;
                }
                case 9:
                {
                    s+="Quotes"+String.valueOf(x)+": “Light tomorrow with today.”\n ~Elizabeth Barrett Browning \n\n";
                    break;
                }
                case 10:
                {
                    s+="Quotes"+String.valueOf(x)+": “The dreamers are the saviors of the world.” \n ~James Allen \n\n";
                    break;
                }
                case 11:
                {
                    s+="Quotes"+String.valueOf(x)+": “Do not let what you cannot do interfere with what you can do.” \n ~John Wooden \n\n";
                    break;
                }
                case 12:
                {
                    s+="Quotes"+String.valueOf(x)+": “I’ve failed over and over and over again in my life. And that is why I succeed.” \n ~Michael Jordan \n\n";
                    break;
                }
                case 13:
                {
                    s+="Quotes"+String.valueOf(x)+": “If there is no struggle, there is no progress.” \n ~Frederick Douglass \n\n";
                    break;
                }
                case 14:
                {
                    s+="Quotes"+String.valueOf(x)+": “Defeat is simply a signal to press onward.”  \n ~Helen Keller\n\n";
                    break;
                }
                case 15:
                {
                    s+="Quotes"+String.valueOf(x)+": “Rise above the storm and you will find the sunshine.”  \n ~Mario Fernandez\n\n";
                    break;
                }
                case 16:
                {
                    s+="Quotes"+String.valueOf(x)+": “The best is yet to be.”  \n ~Robert Browning \n\n";
                    break;
                }
                case 17:
                {
                    s+="Quotes"+String.valueOf(x)+": “Life has no limitations, except the ones you make.” \n ~Les Brown\n\n";
                    break;
                }
                case 18:
                {
                    s+="Quotes"+String.valueOf(x)+": “Believe you can and you’re halfway there.” \n ~Theodore Roosevelt \n\n";
                    break;
                }
                case 19:
                {
                    s+="Quotes"+String.valueOf(x)+": “Life is 10% what happens to me and 90% how I react to it.”  \n ~Charles R. Swindoll \n\n";
                    break;
                }
                case 20:
                {
                    s+="Quotes"+String.valueOf(x)+": “Failure is the condiment that gives success its flavor.” \n ~Truman Capote \n\n";
                    break;
                }

                }

        }
        tv.setMovementMethod(new ScrollingMovementMethod());
        tv.setText(s);
    }
}
