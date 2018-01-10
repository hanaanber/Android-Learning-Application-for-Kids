package com.example.hci;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;


public class Learning extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning);
        setContentView(R.layout.activity_learning);
        
        Handler handler = new Handler();
 
        // run a thread after 2 seconds to start the home screen
        handler.postDelayed(new Runnable() {
 public void run() {
 
                // make sure we close the splash screen so the user won't come back when it presses back key
 finish();
                // start the home screen
Intent intent = new Intent(Learning.this, Learn.class);
Learning.this.startActivity(intent);
 }
 }, 5000); // time in milliseconds (1 second = 1000 milliseconds) until the run() method will be called
 
    }
}
