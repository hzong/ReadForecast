/**   
 * @title ForecastAddRepeatActivity.java 
 * @package com.example.readforecast.activity 
 * @describe TODO
 * @author hzong
 * @datetime 2015-6-15 下午3:43:34 
 * @version v1.0   
 */
package com.example.readforecast.activity;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.CheckedTextView;
import android.widget.ListView;
import android.widget.RadioButton;

import com.example.android.base.BaseActivity;
import com.example.readforecast.R;

/**
 * @className ForecastAddRepeatActivity
 * @describe 预报重复设置
 * @author hzong
 * @datetime 2015-6-15 下午3:43:34
 */
public class ForecastAddRepeatActivity extends BaseActivity implements
		OnItemClickListener,OnClickListener {
	private Intent resultIntent;
	
	public static void actionStrat(Activity activity, int sel_item) {
		Intent intent = new Intent(activity, ForecastAddRepeatActivity.class);
		intent.putExtra("sel_item", sel_item);
		activity.startActivityForResult(intent, 1);
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_forecast_add_repeat);
		ListView listView = (ListView) findViewById(R.id.listview_repeat);

		List<String> l_s_item = new ArrayList<String>();
		l_s_item.add("每日");
		l_s_item.add("每个工作日（星期一到星期五）");

		resultIntent = new Intent();
		
		ArrayAdapter<String> adapter_repeat = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_single_choice, l_s_item);
		
		listView.setAdapter(adapter_repeat);
		listView.setOnItemClickListener(this);
		listView.setSelected(true);
		listView.setSelection(0);
		listView.setItemChecked(getIntent().getIntExtra("sel_item", 0), true);
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {
		// TODO Auto-generated method stub
		ListView lv = (ListView) parent;
//		RadioButton radio_item = (CheckedTextView) lv.getItemAtPosition(position);
		CheckedTextView textView = (CheckedTextView)view;
		if(textView.isChecked()){
			textView.setChecked(false);
		}else{
			textView.setChecked(true);
			resultIntent.putExtra("week", position);
		}
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
//		switch (v.getId()) {
//		case R.:
//			
//			break;
//
//		default:
//			break;
//		}
	}
	
	
}
