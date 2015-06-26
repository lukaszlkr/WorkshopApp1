package com.stw85.lukasz.funfacts;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import static android.widget.Toast.makeText;


public class FunFactsActivity extends Activity {

    //public static final String TAG = "FunFactActivity";

    public static final String TAG = FunFactsActivity.class.getSimpleName();


    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Declare our View variable and assign the View
         final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        final Button showFactButton = (Button) findViewById(R.id.showFactButton);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        View.OnClickListener listener = new View.OnClickListener()
        {
          @Override
        public void onClick(View view)
          {



              // Update the label with our dynamic fact
              /*
              //fact = randomNumber + "";
              if(randomNumber == 0)
              {
                  fact = "Ants stretch when they wake up i the morning";

              }
              else if(randomNumber == 1)
              {
                  fact = "Ostrich can run faster than horses";

              }
              else if(randomNumber == 2)
              {
                  fact = "Olympic gold medal are actually made from silver";

              }
              else
              {
                  fact = "Sorry there was an error";
              }

              */

              String fact = mFactBook.getFact();

              factLabel.setText(fact);

              int color = mColorWheel.getColor();

              relativeLayout.setBackgroundColor(color);
              showFactButton.setTextColor(color);




          }

        };

        showFactButton.setOnClickListener(listener);

        //String message = "Yeah! Our Activity was created";
        //Toast.makeText(this, message, Toast.LENGTH_LONG).show();
        //welcomeToast.show();
        //Log.d("FunFactsActivity","We're logging from the onCreate() method !");
        Log.d(TAG,"We're logging from the onCreate() method !");


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.fun_facts, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
