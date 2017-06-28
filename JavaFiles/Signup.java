package com.shubhangi.happyplace;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Signup extends AppCompatActivity {
EditText name,email,uname,pass1,pass2;
    DatabaseHelper helper=new DatabaseHelper(this);
    String namestr,emailstr,unamestr,pass1str,pass2str;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }
    public void onClick(View v)
    {
       name=(EditText)findViewById(R.id.editText3);
        email=(EditText)findViewById(R.id.editText4);
        uname=(EditText)findViewById(R.id.editText5);
        pass1=(EditText)findViewById(R.id.editText6);
        pass2=(EditText)findViewById(R.id.editText7);

         namestr= name.getText().toString();
         emailstr= email.getText().toString();
        unamestr= uname.getText().toString();
        pass1str= pass1.getText().toString();
         pass2str= pass2.getText().toString();

        if(!pass1str.equals(pass2str))
        {
            Toast pass=Toast.makeText(Signup.this,"Passwords don't match",Toast.LENGTH_SHORT);
            pass.show();
        }
        else
        {
          Contact c=new Contact();
            c.setName(namestr);
            c.setEmail(emailstr);
            c.setUname(unamestr);
            c.setPass(pass1str);
            c.setPass(pass2str);
            helper.insertContact(c);
            Toast pass=Toast.makeText(Signup.this,"Please login to start",Toast.LENGTH_SHORT);
            pass.show();
            Intent in=new Intent(this,MainPage.class);
            startActivity(in);
        }

    }

}
