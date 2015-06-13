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
* OnItemClickListener:ListView�������
* @author  hzong
* @datetime  2015-5-18 ����10:07:52  
*/ 
public class MainActivity extends BaseActivity implements OnItemClickListener {
	private String[] data={"ˮƿ��","˫����","Ħ����","��Ů��","ʨ����","��з��","��Ы��","������","�����","˫����","��ţ��","ĵ����"};
	private List<ImageText> imageTexts = new ArrayList<ImageText>();
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sys_tag_listview_imagetext_item_test_main);
        customListView();
    }
    
    /** 
    * @title SimpleListView 
    * @describe android�Դ���ListView
    * @author hzong 
    */ 
    public void SimpleListView(){
    	   /**
         * android.R.layout.simple_list_item_1:��ΪListView����ֵ�id,����һ��Android���õĲ����ļ�������ֻ��һ��
         * TextView�����ڼ򵥵���ʾһ���ı�
         */
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,data);
        ListView listView =(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
    
    /** 
    * @title customListView 
    * @describe �Զ���ListView
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
    	ImageText iconfont_chunvzuo = new ImageText("��Ů��", R.drawable.iconfont_chunvzuo);
    	imageTexts.add(iconfont_chunvzuo);

    	ImageText iconfont_jinniuzuo = new ImageText("��ţ��", R.drawable.iconfont_jinniuzuo);
    	imageTexts.add(iconfont_jinniuzuo);

    	ImageText iconfont_juxiezuo = new ImageText("��з��", R.drawable.iconfont_juxiezuo);
    	imageTexts.add(iconfont_juxiezuo);
    	
    	ImageText iconfont_mojiezuo = new ImageText("ħз��", R.drawable.iconfont_mojiezuo);
    	imageTexts.add(iconfont_mojiezuo);
    	
    	ImageText iconfont_muyangzuo = new ImageText("������", R.drawable.iconfont_muyangzuo);
    	imageTexts.add(iconfont_muyangzuo);
    	
    	ImageText iconfont_sheshouzuo = new ImageText("������", R.drawable.iconfont_sheshouzuo);
    	imageTexts.add(iconfont_sheshouzuo);
    	
    	ImageText iconfont_shizizuo = new ImageText("ʨ����", R.drawable.iconfont_shizizuo);
    	imageTexts.add(iconfont_shizizuo);
    	
    	ImageText iconfont_shuangyuzuo = new ImageText("˫����", R.drawable.iconfont_shuangyuzuo);
    	imageTexts.add(iconfont_shuangyuzuo);
    	
    	ImageText iconfont_shuangzizuo = new ImageText("˫����", R.drawable.iconfont_shuangzizuo);
    	imageTexts.add(iconfont_shuangzizuo);
    	
    	ImageText iconfont_shuipingzuo = new ImageText("ˮƽ��", R.drawable.iconfont_shuipingzuo);
    	imageTexts.add(iconfont_shuipingzuo);
    	
    	ImageText iconfont_tianchengzuo = new ImageText("��ƽ��", R.drawable.iconfont_tianchengzuo);
    	imageTexts.add(iconfont_tianchengzuo);
    	
    	ImageText iconfont_tianhezuo = new ImageText("��Ы��", R.drawable.iconfont_tianhezuo);
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
