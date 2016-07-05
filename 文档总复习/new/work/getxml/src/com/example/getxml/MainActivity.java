package com.example.getxml;

import java.io.InputStream;
import java.util.ArrayList;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import android.app.Activity;
import android.os.Bundle;
import android.util.Xml;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//获取 class 目录下面的资源文件,返回的是一个输入流
		InputStream is = getClassLoader().getResourceAsStream("weather.xml");
		//创建 xml 解析器
		XmlPullParser xp = Xml.newPullParser();
		try {
			//读取xml的输入流
			xp.setInput(is, "utf-8");
			//获取读入的类型
			//int START_DOCUMENT = 0;
			//int END_DOCUMENT = 1;
			//int START_TAG = 2;
			//int END_TAG = 3;
			int type = xp.getEventType();
			test t = null;
			ArrayList<test> tlist = null;
			while(type != XmlPullParser.END_DOCUMENT){
				type = xp.next();
				switch (type) {
				case XmlPullParser.START_TAG:
					if("weather".equals(xp.getName())){
						tlist = new ArrayList<test>();
					}else if("city".equals(xp.getName())){
						t = new test();
					} else if ("a".equals(xp.getName())){
						t.setA(xp.nextText());
					} else if("b".equals(xp.getName())){
						t.setB(xp.nextText());
					}else if("c".equals(xp.getName())){
						t.setC(xp.nextText());
					}
					break;
					
				case XmlPullParser.END_TAG:
					if("city".equals(xp.getName())){
						tlist.add(t);
					}
					break;
				}
				
				for(test tm:tlist){
					System.out.println(tm.toString());
				}
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
 
}

class test{
	
	public String getA() {
		return a;
	}
	public void setA(String a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	public String getC() {
		return c;
	}
	public void setC(String c) {
		this.c = c;
	}
	private String a;
	private String b;
	private String c;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return a+b+c;
	}
}