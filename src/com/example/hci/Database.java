package com.example.hci;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class Database extends SQLiteOpenHelper{

	public Database(Context context) {
		super(context, "abc", null, 1);
		
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		String sql  = "create table users (id integer primary key autoincrement , name text , password text)";
		db.execSQL(sql);
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
	}
	
	public long addUser(String name , String password)
	{
		SQLiteDatabase db = getWritableDatabase()   ; 
		ContentValues values = new ContentValues();
		values.put("name", name);
		values.put("password", password);
		
		long id  = db.insert("users", null, values);
		return id  ; 
		
	}

	public void getAllUsers ()
	{
		
	}
}
