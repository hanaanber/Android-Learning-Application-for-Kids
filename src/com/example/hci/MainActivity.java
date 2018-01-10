package com.example.hci;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.EditText;

public class MainActivity extends Activity {

	EditText et  ; 
	EditText et2 ; 
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Database d = new Database(this);
		String user  = et.getText().toString();
	long id  = 	d.addUser(user, "");
	if(id > 0 )
	{
		Intent i = new Intent(this,Learna.class) ;
		startActivity(i);
	
	}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
