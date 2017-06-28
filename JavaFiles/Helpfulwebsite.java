package com.shubhangi.happyplace;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Helpfulwebsite extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helpfulwebsite);
    }
    public void browser1(View v)
    {
        Intent browse1=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.adaa.org/"));
        startActivity(browse1);
    }
    public void browser2(View v)
    {
        Intent browse2=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mentalhealthamerica.net/"));
        startActivity(browse2);
    }
    public void browser3(View v)
    {
        Intent browse3=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.dbsalliance.org/site/PageServer?pagename=home"));
        startActivity(browse3);
    }
    public void browser4(View v)
    {
        Intent browse4=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.suicide.org/suicide-hotlines.html"));
        startActivity(browse4);
    }
}
