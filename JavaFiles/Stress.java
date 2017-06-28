package com.shubhangi.happyplace;

import android.content.Intent;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;

public class Stress extends AppCompatActivity {

    private GestureDetectorCompat gestureObject;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stress);
        gestureObject=new GestureDetectorCompat(this,new LearnGesture());
    }
    public boolean onTouchEvent(MotionEvent event)
    {
        this.gestureObject.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    class LearnGesture extends GestureDetector.SimpleOnGestureListener{
        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
            if(e2.getX()<e1.getX())
            {
                Intent in=new Intent(getBaseContext(),frontpageINFO.class);
                startActivity(in);

            }
            return true;
        }
    }
}
