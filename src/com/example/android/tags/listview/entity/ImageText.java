/**   
* @title Image.java 
* @package com.example.android.tags.listview.entity 
* @describe TODO
* @author hzong
* @datetime 2015-5-18 下午8:41:49 
* @version v1.0   
*/ 
package com.example.android.tags.listview.entity;

/** 
 * @className  ImageText 
 * @describe  图片文本视图
 * @author  hzong
 * @datetime  2015-5-18 下午8:41:49  
 */
public class ImageText {
	private ImageText(){}
	public ImageText(String name,int imageId){
		this.name = name;
		this.imageId = imageId;
		
	}
	
	
	/** 
	* @fieldName name
	* @describe 名称
	* @fieldType String
	*/ 
	private String name;
	/** 
	* @fieldName imageId
	* @describe 图片id
	* @fieldType int
	*/ 
	private int imageId;
	public String getName() {
		return name;
	}
	public int getImageId() {
		return imageId;
	} 
	
	
	
}
