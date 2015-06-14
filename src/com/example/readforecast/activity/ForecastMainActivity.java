package com.example.readforecast.activity;

import com.example.android.base.BaseActivity;
import com.example.readforecast.R;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;


/** 
* @className  ForecastMainActivity 
* @describe  读预报主活动
* @author  hzong
* @datetime  2015-6-13 下午5:56:56  
*/ 
public class ForecastMainActivity extends BaseActivity implements OnClickListener {
	
	LinearLayout layout_create;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast_main);
        layout_create =(LinearLayout)findViewById(R.id.create_item);
        layout_create.setOnClickListener(this);
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.create_item:
			ForecastAddActivity.actionStart(this);
			break;

		default:
			break;
		}
	}

}
