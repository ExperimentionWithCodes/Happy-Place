package com.shubhangi.happyplace;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import com.shubhangi.happyplace.R;

public class Managingworries extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_managingworries);
        SeekBar s = (SeekBar) findViewById(R.id.seekBar);
        SeekBar s2 = (SeekBar) findViewById(R.id.seekBar2);
        SeekBar s3 = (SeekBar) findViewById(R.id.seekBar3);
        s.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                SeekBar s = (SeekBar) findViewById(R.id.seekBar);
                s.setMax(255);

            }
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
        s2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                SeekBar s2 = (SeekBar) findViewById(R.id.seekBar2);
                s2.setMax(255);

            }
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
        s3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                SeekBar s3 = (SeekBar) findViewById(R.id.seekBar3);
                s3.setMax(255);

            }
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
        Button b = (Button) findViewById(R.id.button9);
        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                SeekBar s = (SeekBar) findViewById(R.id.seekBar);
                SeekBar s2 = (SeekBar) findViewById(R.id.seekBar2);
                SeekBar s3 = (SeekBar) findViewById(R.id.seekBar3);
                int a = s.getProgress();
                int b = s2.getProgress();
                int c = s3.getProgress();
                int d = Color.rgb(a, b, c);
                Button but = (Button) findViewById(R.id.button9);
                but.setBackgroundColor(d);
            }
        });
    }
}
   /* public void onClick(View v)
    {
        EditText t= (EditText)this.findViewById(R.id.editText);
        EditText t2= (EditText)this.findViewById(R.id.editText2);
        EditText t3= (EditText)this.findViewById(R.id.editText3);
        String s=t.getText().toString();
        int a= new Integer(s).intValue();
        String s2=t2.getText().toString();
        int b= new Integer(s2).intValue();
        String s3=t3.getText().toString();
        int c= new Integer(s3).intValue();;
        int d=Color.rgb(a, b, c);
        Button but=(Button)this.findViewById(R.id.button);
        but.setBackgroundColor(d);
    }
}
*/
