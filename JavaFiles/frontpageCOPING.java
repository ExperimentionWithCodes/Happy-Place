package com.shubhangi.happyplace;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class frontpageCOPING extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frontpage_coping);
        String[] choose={"THINKING PATTERNS","METAPHORS","MANAGE WORRIES"};
        ListAdapter adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,choose);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                if (position==0) {

                    Intent in = new Intent(view.getContext(),ThinkingPatterns.class);
                    startActivity(in);
                }
                if (position == 1) {

                    Intent myIntent = new Intent(view.getContext(),Metaphors.class);
                    startActivity(myIntent);
                }
                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(),Managingworries.class);
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
