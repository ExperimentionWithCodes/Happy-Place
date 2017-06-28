package com.shubhangi.happyplace;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.shubhangi.happyplace.R.drawable.bully;

public class Metaphors extends AppCompatActivity {
Button b1,b2,b3,b4,b5;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metaphors);
        b1=(Button)findViewById(R.id.bb1);
        b2=(Button)findViewById(R.id.bb2);
        b3=(Button)findViewById(R.id.bb3);
        b4=(Button)findViewById(R.id.bb4);
        b5=(Button)findViewById(R.id.bb5);
        t1=(TextView)findViewById(R.id.textView20);
        b1.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v)
                                  {
                                    t1.setText("The playground is fenced in and the children have to learn to live with the bully. This bully  uses threats,mocking and abusive words to upset his victims. We can't stop our thoughts,but perhaps we can react to them as follows:\n" +
                                            "Victim acknowledges then ignores the bully,changing focus of attention, and the bully soon gives up.");

                                  }

                              }
        );
        b2.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v)
                                  {
                                      t1.setText("Items floating down a river,such as leaves or bits of mucky debris (Thoughts,feelings,images), can get in our way or make it difficult for us to stay afloat. But instead of struggling, we can stand on the bank watching the debris go by,just as we can with our thoughts,images and sensations.");

                                  }

                              }
        );
        b3.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v)
                                  {
                                      t1.setText("We can try to stop our thoughts ,like trying to hold a ball under water, but it will keep popping up in front of our face(Intrusive or distressing thoughts). Or we can allow the ball (Our thoughts) to float around us, and just let them be.");

                                  }


                              }
        );
        b4.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v)
                                  {
                                      t1.setText("When we get anxious driving through a tunnel,the best option is to keep going to the other end,rather than stopping or looking for an exit in the tunnel. The feelings will pass -  there is an end to this tunnel, just as there is an end to your current feelings.");

                                  }

                              }
        );
        b5.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v)
                                  {
                                      t1.setText("Whatever the weather, or whatever happens on the surface of the mountain, and even within it - the mountain stands firm,mostly unaffected. Strong,grounded,permanent. We can be like that mountain, observing thoughts,feelings and sensations, and yet know inner stillness, and not let them affect us");

                                  }

                              }
        );
    }
}
