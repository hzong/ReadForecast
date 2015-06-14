/**   
* @title ImageTextAdapter.java 
* @package com.example.android.tags.listview 
* @describe TODO
* @author hzong
* @datetime 2015-5-18 下午8:53:38 
* @version v1.0   
*/ 
package com.example.android.tags.listview.adapter;

import java.util.List;

import com.example.android.tags.listview.entity.ImageText;
import com.example.readforecast.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/** 
 * @className  ImageTextAdapter 
 * @describe  图片文本适配器
 * @author  hzong
 * @datetime  2015-5-18 下午8:53:38  
 */
public class ForecastListAdapter extends ArrayAdapter<ImageText> {
	
	private int resourceId;

	public ForecastListAdapter(Context context,
			int textViewResourceId, List<ImageText> objects) {
		super(context, textViewResourceId, objects);
		resourceId = textViewResourceId;
	}
	
	/** 
	* @title getView 
	* @describe 每个子项被滚动到屏幕内的时候会调用
	* @param position
	* @param convertView
	* @param parent
	* @return 
	* @overridden @see android.widget.ArrayAdapter#getView(int, android.view.View, android.view.ViewGroup) 
	* @author hzong 
	*/ 
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ImageText imageText =getItem(position);
		ViewGroup view;
		ViewHolder holder = null;
		/**
		 * 判断重复加载布局如果convertView为空，则使用LayoutInflater去加载布局，如果不为空直接对convertView重用，这样就提升了
		 * ListView运行效率
		 * 
		 */
		if(convertView ==null){
			view = (ViewGroup)LayoutInflater.from(getContext()).inflate(resourceId, null);
			holder = new ViewHolder();
			holder.forecast_name= (TextView)view.findViewById(R.id.forecast_name);
			holder.forecast_time= (TextView)view.findViewById(R.id.forecast_time);
//			holder.tv_name= (TextView)view.findViewById(R.id.forecast_name);
//			holder.tv_name= (TextView)view.findViewById(R.id.forecast_name);
			
			view.setTag(holder);
		}else{
			view = (ViewGroup)convertView;
			holder = (ViewHolder)view.getTag();
		}
		
		holder.forecast_name.setText(imageText.getImageId());
		holder.forecast_time.setText(imageText.getName());
		return view;
	}
	/** 
	* @className  ViewHolder 
	* @describe  对于控件实例进行缓存
	* @author  hzong
	* @datetime  2015-5-18 下午9:58:44  
	*/ 
	class ViewHolder{
		/** 
		* @fieldName tv_name
		* @describe 名称
		* @fieldType TextView
		*/ 
		TextView forecast_name;
		/** 
		* @fieldName tv_time
		* @describe 时间
		* @fieldType TextView
		*/ 
		TextView forecast_time;
		/** 
		* @fieldName week
		* @describe 一周
		* @fieldType TextView[]
		*/ 
		TextView[] week;
		/** 
		* @fieldName is_use
		* @describe 是否使用
		* @fieldType ImageView
		*/ 
		ImageView is_use;
		public TextView getForecast_name() {
			return forecast_name;
		}
		public void setForecast_name(String forecast_name) {
			
			this.forecast_name.setText(forecast_name);;
		}
		public TextView getForecast_time() {
			return forecast_time;
		}
		public void setForecast_time(String forecast_time) {
			this.forecast_time.setText(forecast_time);
		}
		public TextView[] getWeek() {
			return week;
		}
		public void setWeek(boolean[] week) {
			this.week = week;
		}
		public ImageView getIs_use() {
			return is_use;
		}
		public void setIs_use(boolean is_use) {
			this.is_use = is_use;
		}
		
		
	}
	
}
