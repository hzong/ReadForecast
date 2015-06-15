/**   
* @title ReadForecastHelper.java 
* @package com.example.readforecast 
* @describe TODO
* @author hzong
* @datetime 2015-6-15 …œŒÁ9:47:25 
* @version v1.0   
*/ 
package com.example.readforecast.db.forecast;

import com.example.android.tags.listview.entity.Forecast;
import com.example.android.util.reflection.orm.ORMSQLiteTable;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

/** 
 * @className  ReadForecastHelper 
 * @describe  ÓAàÛDBÓê
 * @author  hzong
 * @datetime  2015-6-15 …œŒÁ9:47:25  
 */
public class ReadForecastHelper extends SQLiteOpenHelper {
	private static final ORMSQLiteTable<Forecast> CREATE_FORECAST = new ORMSQLiteTable<Forecast>(Forecast.class); 

	public ReadForecastHelper(Context context, String name,
			CursorFactory factory, int version) {
		super(context, name, factory, version);
	}

	/** 
	 * @title onCreate 
	 * @describe TODO
	 * @param db 
	 * @overridden @see android.database.sqlite.SQLiteOpenHelper#onCreate(android.database.sqlite.SQLiteDatabase) 
	 * @author hzong 
	 */

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		db.execSQL(CREATE_FORECAST.CreateTable());
	}

	/** 
	 * @title onUpgrade 
	 * @describe TODO
	 * @param db
	 * @param oldVersion
	 * @param newVersion 
	 * @overridden @see android.database.sqlite.SQLiteOpenHelper#onUpgrade(android.database.sqlite.SQLiteDatabase, int, int) 
	 * @author hzong 
	 */

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub

	}

}
