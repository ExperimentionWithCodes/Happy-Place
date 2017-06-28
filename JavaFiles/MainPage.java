package com.shubhangi.happyplace;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainPage extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
    }
    public void onClick(View v)
    {
        //DatabaseHelper helper=new DatabaseHelper(this);

        String Buttontext;
        Buttontext=((Button) v).getText().toString();
        if(Buttontext.equals("Get started"))
        {
            EditText a=(EditText)findViewById(R.id.editText);
            String str=a.getText().toString();
            EditText b=(EditText)findViewById(R.id.editText2);
            String str1=b.getText().toString();
            //String password = helper.searchPass(str);

                Intent in=new Intent(this,DisplayUsername.class);
                in.putExtra("TEXT",str);
                startActivity(in);



        }
       else if(Buttontext.equals("New to our space?"))
        {
            Intent intent=new Intent(this,Signup.class);
            startActivity(intent);
        }
    }
}
