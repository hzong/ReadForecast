/**   
* @title ForecastAddActivity.java 
* @package com.example.readforecast.activity 
* @describe TODO
* @author hzong
* @datetime 2015-6-13 下午10:08:27 
* @version v1.0   
*/ 
package com.example.readforecast.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.style.SuperscriptSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;
import android.widget.TableRow;
import android.widget.TimePicker;

import com.example.android.base.BaseActivity;
import com.example.android.manager.activity.ActivityCollector;
import com.example.readforecast.R;

/** 
 * @className  ForecastAddActivity 
 * @describe  添加预告
 * @author  hzong
 * @datetime  2015-6-13 下午10:08:27  
 */
public class ForecastAddActivity extends BaseActivity implements
		OnClickListener {
	public static void actionStart(Activity activity){
		Intent intent = new Intent(activity, ForecastAddActivity.class);
		activity.startActivityForResult(intent, 1);
	}
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		  setContentView(R.layout.activity_forecast_add);
//		  ForecastAddRepeatActivity
		  TimePicker tp_time  = (TimePicker)findViewById(R.id.tp_time);
		  tp_time.setIs24HourView(true);
		  
		  TableRow tableRow = (TableRow)findViewById(R.id.tableRow_forecast_repeat_title);
		  tableRow.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				ForecastAddRepeatActivity.actionStrat(ForecastAddActivity.this, 1);
			}
		});
	}
	
	/** 
	 * @title onClick 
	 * @describe TODO
	 * @param v 
	 * @overridden @see android.view.View.OnClickListener#onClick(android.view.View) 
	 * @author hzong 
	 */

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

	}

}
