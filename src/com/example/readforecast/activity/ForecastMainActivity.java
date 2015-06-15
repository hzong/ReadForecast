package com.example.readforecast.activity;

import com.example.android.base.BaseActivity;
import com.example.readforecast.R;
import com.example.readforecast.view.ForecastMainView;

import android.content.Intent;
import android.os.Bundle;


/** 
* @className  ForecastMainActivity 
* @describe  读预报主活动
* @author  hzong
* @datetime  2015-6-13 下午5:56:56  
*/ 
public class ForecastMainActivity extends BaseActivity {
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast_main);
        new ForecastMainView(this);
        
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
}
