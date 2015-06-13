/**   
* @title ImageTextAdapter.java 
* @package com.example.android.tags.listview 
* @describe TODO
* @author hzong
* @datetime 2015-5-18 ����8:53:38 
* @version v1.0   
*/ 
package com.example.android.tags.listview;

import java.util.List;

import com.example.android.tags.listview.entity.ImageText;
import com.example.readforecast.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView.FindListener;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/** 
 * @className  ImageTextAdapter 
 * @describe  ͼƬ�ı�������
 * @author  hzong
 * @datetime  2015-5-18 ����8:53:38  
 */
public class ImageTextAdapter extends ArrayAdapter<ImageText> {
	
	private int resourceId;

	public ImageTextAdapter(Context context,
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
		View view;
		ViewHolder holder = null;
		/**
		 * �ж��ظ����ز������convertViewΪ�գ���ʹ��LayoutInflaterȥ���ز��֣������Ϊ��ֱ�Ӷ�convertView���ã�������������
		 * ListView����Ч��
		 * 
		 */
		if(convertView ==null){
			view = LayoutInflater.from(getContext()).inflate(resourceId, null);
			holder = new ViewHolder();
			holder.image = (ImageView)view.findViewById(R.id.imageText_image);
			holder.name= (TextView)view.findViewById(R.id.imageText_name);
			
			view.setTag(holder);
		}else{
			view = convertView;
			holder = (ViewHolder)view.getTag();
		}
		
		holder.image.setImageResource(imageText.getImageId());
		holder.name.setText(imageText.getName());
		return view;
	}
	/** 
	* @className  ViewHolder 
	* @describe  ���ڿؼ�ʵ�����л���
	* @author  hzong
	* @datetime  2015-5-18 ����9:58:44  
	*/ 
	class ViewHolder{
		ImageView image;
		TextView name;
	}
	
}
