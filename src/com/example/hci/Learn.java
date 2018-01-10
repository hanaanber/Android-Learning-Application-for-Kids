package com.example.hci;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class Learn extends Activity {
	Intent intent ;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);
        ListView myListView = (ListView)findViewById(R.id.listView1);
        String [] letterlist = getResources().getStringArray(R.array.options);
        ArrayAdapter<String> letteradapter = new ArrayAdapter<String> (this,android.R.layout.simple_list_item_1,letterlist);
        myListView.setAdapter(letteradapter);
        
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        	public void onItemClick(AdapterView<?> arg0, View view, int pos,
					long id) {
				// TODO Auto-generated method stub
				if (pos==0)
				{
					Intent intent = new Intent (getApplicationContext(),Learna.class);
					startActivity(intent);
				}
				
				if (pos ==1)
				{
					Intent intent = new Intent(getApplicationContext(), SpellLettera.class);
					startActivity(intent);
				}
				
        	}
		});
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
