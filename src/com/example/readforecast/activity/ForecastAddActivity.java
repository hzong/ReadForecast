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
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		switch (requestCode) {
		case 1:
			if(resultCode == RESULT_OK){
				
			}
			break;

		default:
			break;
		}
		
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		  setContentView(R.layout.activity_forecast_add);
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
