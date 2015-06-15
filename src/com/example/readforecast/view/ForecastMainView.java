/**   
* @title ForecastMainView.java 
* @package com.example.readforecast.view 
* @describe TODO
* @author hzong
* @datetime 2015-6-15 上午11:45:20 
* @version v1.0   
*/ 
package com.example.readforecast.view;

import java.util.ArrayList;
import java.util.List;

import com.example.android.tags.listview.adapter.ForecastListAdapter;
import com.example.android.tags.listview.entity.Forecast;
import com.example.readforecast.R;
import com.example.readforecast.activity.ForecastAddActivity;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.ListView;

/** 
 * @className  ForecastMainView 
 * @describe  读预报主布局
 * @author  hzong
 * @datetime  2015-6-15 上午11:45:20  
 */
public class ForecastMainView implements OnClickListener {
	private Activity activity;
	LinearLayout layout_create;
	ListView lv_readForecast;
	
	/** 
	* title ForecastMainView
	* describe 读构造
	* @param activity 
	*/ 
	public ForecastMainView(Activity activity) {
		
		this.activity = activity;
		
		layout_create =(LinearLayout)activity.findViewById(R.id.create_item);
        layout_create.setOnClickListener(this);
        
        lv_readForecast = (ListView)activity.findViewById(R.id.lv_readForecast);
        
        
        ForecastListAdapter forecastListAdapter = new ForecastListAdapter(activity, R.layout.lv_forecast_list, getData());
        
        lv_readForecast.setAdapter(forecastListAdapter);
        
        
	}
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.create_item:
			ForecastAddActivity.actionStart(activity);
			break;

		default:
			break;
		}
	}
	List<Forecast> getData(){
		List<Forecast>  lf = new ArrayList<Forecast>();
		Forecast forecast1 = new Forecast();
		forecast1.setForecast_name("1阿斯蒂芬");
		forecast1.setWeek(new int[]{1,3,5});
		lf.add(forecast1);
		
		Forecast forecast2 = new Forecast();
		forecast2.setForecast_name("2阿斯蒂芬");
		lf.add(forecast2);
		return lf;
	}
}
