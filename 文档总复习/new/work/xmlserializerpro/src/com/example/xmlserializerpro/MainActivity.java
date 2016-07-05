package com.example.xmlserializerpro;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.xmlpull.v1.XmlSerializer;

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
		
		//获取 xml 序列化生成器
		XmlSerializer xs = Xml.newSerializer();
		
		try {
			//第一个参数输入流，第二个用什么编码写入
			xs.setOutput(new FileOutputStream(new File("/storage/sdcard0/ding.luchao.xml")), "utf-8");
			
			//生成头结点
			//@param encoding xml 头上的编码
			//@param st... 是否是独立的xml
			xs.startDocument("utf-8", true);
			//第一个命名空间 第二个是标签开始
			xs.startTag(null, "msg");
			//设置标签内容
			xs.text("aaa");
			//第一个命名空间 第二个标签结束
			xs.endTag(null, "msg");
			
			//结束xml的创建
			xs.endDocument();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}
}
