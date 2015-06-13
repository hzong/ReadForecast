package com.example.android.tags.listview.main;

import java.util.ArrayList;
import java.util.List;

import com.example.android.base.BaseActivity;
import com.example.android.tags.listview.ImageTextAdapter;
import com.example.android.tags.listview.entity.ImageText;
import com.example.readforecast.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


/** 
* @className  MainActivity 
* @describe  TODO
* OnItemClickListener:ListView项单机监听
* @author  hzong
* @datetime  2015-5-18 下午10:07:52  
*/ 
public class MainActivity extends BaseActivity implements OnItemClickListener {
	private String[] data={"水瓶座","双鱼座","摩羯座","处女座","狮子座","巨蟹座","天蝎座","射手座","天秤座","双子座","金牛座","牡羊座"};
	private List<ImageText> imageTexts = new ArrayList<ImageText>();
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sys_tag_listview_imagetext_item_test_main);
        customListView();
    }
    
    /** 
    * @title SimpleListView 
    * @describe android自带的ListView
    * @author hzong 
    */ 
    public void SimpleListView(){
    	   /**
         * android.R.layout.simple_list_item_1:作为ListView子项布局的id,这是一个Android内置的布局文件，里面只有一个
         * TextView可用于简单的显示一段文本
         */
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,data);
        ListView listView =(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
    
    /** 
    * @title customListView 
    * @describe 自定义ListView
    * @author hzong 
    */ 
    public void customListView(){
    	initImageTests();
    	ImageTextAdapter adapter = new ImageTextAdapter(MainActivity.this, R.layout.activity_sys_tag_listview_imagetext_item, imageTexts);
    	ListView listView =(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }
    
    /** 
    * @title initImageTests 
    * @describe TODO 
    * @author hzong 
    */ 
    private void initImageTests(){
    	ImageText iconfont_chunvzuo = new ImageText("处女座", R.drawable.iconfont_chunvzuo);
    	imageTexts.add(iconfont_chunvzuo);

    	ImageText iconfont_jinniuzuo = new ImageText("金牛座", R.drawable.iconfont_jinniuzuo);
    	imageTexts.add(iconfont_jinniuzuo);

    	ImageText iconfont_juxiezuo = new ImageText("巨蟹座", R.drawable.iconfont_juxiezuo);
    	imageTexts.add(iconfont_juxiezuo);
    	
    	ImageText iconfont_mojiezuo = new ImageText("魔蟹座", R.drawable.iconfont_mojiezuo);
    	imageTexts.add(iconfont_mojiezuo);
    	
    	ImageText iconfont_muyangzuo = new ImageText("牧羊座", R.drawable.iconfont_muyangzuo);
    	imageTexts.add(iconfont_muyangzuo);
    	
    	ImageText iconfont_sheshouzuo = new ImageText("射手座", R.drawable.iconfont_sheshouzuo);
    	imageTexts.add(iconfont_sheshouzuo);
    	
    	ImageText iconfont_shizizuo = new ImageText("狮子座", R.drawable.iconfont_shizizuo);
    	imageTexts.add(iconfont_shizizuo);
    	
    	ImageText iconfont_shuangyuzuo = new ImageText("双鱼座", R.drawable.iconfont_shuangyuzuo);
    	imageTexts.add(iconfont_shuangyuzuo);
    	
    	ImageText iconfont_shuangzizuo = new ImageText("双子座", R.drawable.iconfont_shuangzizuo);
    	imageTexts.add(iconfont_shuangzizuo);
    	
    	ImageText iconfont_shuipingzuo = new ImageText("水平座", R.drawable.iconfont_shuipingzuo);
    	imageTexts.add(iconfont_shuipingzuo);
    	
    	ImageText iconfont_tianchengzuo = new ImageText("天平座", R.drawable.iconfont_tianchengzuo);
    	imageTexts.add(iconfont_tianchengzuo);
    	
    	ImageText iconfont_tianhezuo = new ImageText("天蝎座", R.drawable.iconfont_tianhezuo);
    	imageTexts.add(iconfont_tianhezuo);
    	
    	
    	
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {
		ImageText imageText = imageTexts.get(position);
		Toast.makeText(this, imageText.getName(), Toast.LENGTH_SHORT).show();
	}
    
}
