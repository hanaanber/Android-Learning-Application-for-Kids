package com.example.hci;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class About extends Activity {
Intent intent ;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    	MenuInflater inflater = new MenuInflater(this);
    	inflater.inflate(R.menu.activity_learn, menu);
        return true;
    }
    @Override
   	public boolean onOptionsItemSelected(MenuItem item) {
   		// TODO Auto-generated method stub
    	switch(item.getItemId()){
    		
    	case R.id.item3:
    		finish();
    		System.exit(0);
    		break;
    	case R.id.item4:
    		intent = new Intent (getApplicationContext(),About.class);
			startActivity(intent);
    		break;
 }
    	
 return super.onOptionsItemSelected(item);
   	} 
}
