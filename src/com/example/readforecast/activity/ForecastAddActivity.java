/**   
 * @title ForecastAddActivity.java 
 * @package com.example.readforecast.activity 
 * @describe TODO
 * @author hzong
 * @datetime 2015-6-13 ����10:08:27 
 * @version v1.0   
 */
package com.example.readforecast.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TableRow;
import android.widget.TimePicker;

import com.example.android.base.BaseActivity;
import com.example.android.tags.listview.entity.Forecast;
import com.example.readforecast.R;

/**
 * @className ForecastAddActivity
 * @describe ���Ԥ��
 * @author hzong
 * @datetime 2015-6-13 ����10:08:27
 */
public class ForecastAddActivity extends BaseActivity implements
		OnClickListener {

	Forecast forecast;

	private Button add_save;
	
	public static void actionStart(Activity activity) {
		Intent intent = new Intent(activity, ForecastAddActivity.class);
		activity.startActivityForResult(intent, 1);
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_forecast_add);
		TimePicker tp_time = (TimePicker) findViewById(R.id.tp_time);
		tp_time.setIs24HourView(true);

		forecast = new Forecast();
		
		add_save = (Button)findViewById(R.id.add_save);
		add_save.setOnClickListener(this);
		
		TableRow tableRow = (TableRow) findViewById(R.id.tableRow_forecast_repeat_title);
		tableRow.setOnClickListener(this);
	}

	/**
	 * @title onClick
	 * @describe TODO
	 * @param v
	 * @overridden @see
	 *             android.view.View.OnClickListener#onClick(android.view.View)
	 * @author hzong
	 */

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		switch (requestCode) {
		case 1:
			
			break;

		default:
			break;
		}
	}
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.tableRow_forecast_repeat_title:
			ForecastAddRepeatActivity.actionStrat(ForecastAddActivity.this,
					1);
			break;
		case R.id.add_save:
			
			break;
		default:
			break;
		}
	}

}
