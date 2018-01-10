package com.example.hci;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Learnp extends Activity implements OnClickListener {
	private static final String TAG = "ServicesDemo";
	Button buttonstart , buttonstop , buttonnext;
    Intent intent ;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learnp);
        buttonstart = (Button)findViewById(R.id.button1);
    	buttonstop = (Button)findViewById(R.id.button2);
    	buttonnext = (Button)findViewById(R.id.button3);
    	buttonstart.setOnClickListener(this);
    	buttonstop.setOnClickListener(this);
    	buttonnext.setOnClickListener(this);
    }

    
	public void onClick(View src) {
		// TODO Auto-generated method stub
		switch (src.getId())
		{
		case R.id.button1:
			Log.d(TAG, "OnClick: Service Started");
			startService(new Intent(this, PlayP.class));
			break ;
		case R.id.button2:
			Log.d(TAG, "OnClick: Service Stopped");
			stopService(new Intent(this, PlayP.class));
			break;
		case R.id.button3:
			Intent intent = new Intent (getApplicationContext(),Learnq.class);
			startActivity(intent);
			break;
		}
		
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
