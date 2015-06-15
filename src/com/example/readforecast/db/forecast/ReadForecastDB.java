package com.example.readforecast.db.forecast;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class ReadForecastDB {
	public static final String DB_NAME="ReadForecast";
	public static int VERSION = 1;
	private static ReadForecastDB readForecastDB;
	private SQLiteDatabase db;
	
	
	private ReadForecastDB(Context context){
		ReadForecastHelper dbHelper = new ReadForecastHelper(context, DB_NAME, null, VERSION);
		db = dbHelper.getWritableDatabase();
	}
	
	public synchronized static ReadForecastDB getInstance(Context context){
		if(readForecastDB ==null){
			readForecastDB = new ReadForecastDB(context);
		}
		return readForecastDB;
	}
	
	
}
