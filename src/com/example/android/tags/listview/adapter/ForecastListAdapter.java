/**   
* @title ImageTextAdapter.java 
* @package com.example.android.tags.listview 
* @describe TODO
* @author hzong
* @datetime 2015-5-18 ����8:53:38 
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
 * @describe  ͼƬ�ı�������
 * @author  hzong
 * @datetime  2015-5-18 ����8:53:38  
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
	* @describe ÿ�������������Ļ�ڵ�ʱ������
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
		 * �ж��ظ����ز������convertViewΪ�գ���ʹ��LayoutInflaterȥ���ز��֣������Ϊ��ֱ�Ӷ�convertView���ã�������������
		 * ListView����Ч��
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
	* @describe  ���ڿؼ�ʵ�����л���
	* @author  hzong
	* @datetime  2015-5-18 ����9:58:44  
	*/ 
	class ViewHolder{
		/** 
		* @fieldName tv_name
		* @describe ����
		* @fieldType TextView
		*/ 
		TextView forecast_name;
		/** 
		* @fieldName tv_time
		* @describe ʱ��
		* @fieldType TextView
		*/ 
		TextView forecast_time;
		/** 
		* @fieldName week
		* @describe һ��
		* @fieldType TextView[]
		*/ 
		TextView[] week;
		/** 
		* @fieldName is_use
		* @describe �Ƿ�ʹ��
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
