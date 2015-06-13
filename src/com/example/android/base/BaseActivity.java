/**
 * 
 */
package com.example.android.base;


import com.example.android.manager.activity.ActivityCollector;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;

/** 
* @className  BaseActivity 
* @describe  所有的活动超类
* @author  hzong
* @datetime  2015-5-14 下午8:37:58  
*/ 
public class BaseActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d("BaseActivity", getClass().getSimpleName());
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		ActivityCollector.addActivity(this);
	}
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
		ActivityCollector.removeActivity(this);
	}
}
