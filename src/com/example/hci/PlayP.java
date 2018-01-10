package com.example.hci;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.util.Log;

public class PlayP extends Service {
	private static final String TAG = "MyService" ;
	MediaPlayer player ;

	@Override
	public IBinder onBind(Intent arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		Log.d(TAG, "OnCreate");
		player = MediaPlayer.create(this, R.raw.p);
		player.setLooping(false);
		super.onCreate();
	}

	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		Log.d(TAG, "OnDestroy");
		player.stop();
		super.onDestroy();
	}

	
	@Override
	public void onStart(Intent intent, int startId) {
		// TODO Auto-generated method stub
		Log.d(TAG, "OnStart");
		player.start();
		super.onStart(intent, startId);
	}

}
