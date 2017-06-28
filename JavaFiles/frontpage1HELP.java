package com.shubhangi.happyplace;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class frontpage1HELP extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frontpage1_help);
        String[] choose={"STOP","UPLIFTING QUOTES","AFFIRMATIONS","HELPFUL WEBSITE"};
        ListAdapter adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,choose);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                if (position==0) {

                    Intent in = new Intent(view.getContext(),StopMain.class);
                    startActivity(in);
                }
                if (position == 1) {

                    Intent myIntent = new Intent(view.getContext(),Upliftingquotes.class);
                    startActivity(myIntent);
                }
                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(),Affirmation.class);
                    startActivity(myIntent);
                }
                if (position == 3) {

                    Intent myIntent = new Intent(view.getContext(),Helpfulwebsite.class);
                    startActivity(myIntent);
                }

            }

        });

    }
    public void  onClick(View v)
    {
        Intent in=new Intent(this,frontpage.class);
        startActivity(in);
    }

}

