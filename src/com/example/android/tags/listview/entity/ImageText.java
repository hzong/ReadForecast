/**   
* @title Image.java 
* @package com.example.android.tags.listview.entity 
* @describe TODO
* @author hzong
* @datetime 2015-5-18 ����8:41:49 
* @version v1.0   
*/ 
package com.example.android.tags.listview.entity;

/** 
 * @className  ImageText 
 * @describe  ͼƬ�ı���ͼ
 * @author  hzong
 * @datetime  2015-5-18 ����8:41:49  
 */
public class ImageText {
	private ImageText(){}
	public ImageText(String name,int imageId){
		this.name = name;
		this.imageId = imageId;
		
	}
	
	
	/** 
	* @fieldName name
	* @describe ����
	* @fieldType String
	*/ 
	private String name;
	/** 
	* @fieldName imageId
	* @describe ͼƬid
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
