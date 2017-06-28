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

public class frontpage extends AppCompatActivity {
    String picked;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frontpage);
        String[] choose={"HELP RIGHT NOW","COPING STRATEGIES","INFORMATION"};
        ListAdapter adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,choose);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                if (position==0) {
                    picked = String.valueOf(parent.getItemAtPosition(position)+"\t: Everything you need to keep calm right here");
                    Toast.makeText(frontpage.this, picked, Toast.LENGTH_LONG).show();
                    Intent in = new Intent(view.getContext(),frontpage1HELP.class);
                    startActivity(in);
                }
                if (position == 1) {
                    picked = String.valueOf(parent.getItemAtPosition(position)+"\t: Metaphors,Manage Worries & positive steps");
                    Toast.makeText(frontpage.this, picked, Toast.LENGTH_LONG).show();
                    Intent myIntent = new Intent(view.getContext(),frontpageCOPING.class);
                    startActivity(myIntent);
                }
                if (position == 2) {
                    picked = String.valueOf(parent.getItemAtPosition(position)+"\t: Anger,Anxiety,Depression & Stress");
                    Toast.makeText(frontpage.this, picked, Toast.LENGTH_LONG).show();
                    Intent myIntent = new Intent(view.getContext(),frontpageINFO.class);
                    startActivity(myIntent);
                }

            }

        });

    }
    public void  onClick(View v)
    {
      Intent in=new Intent(this,MainPage.class);
        startActivity(in);
    }
}
