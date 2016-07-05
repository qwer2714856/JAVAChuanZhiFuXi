package com.example.setandgetxml;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import android.R.xml;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.util.Xml;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	private ArrayList<Weather> ay;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button bt = (Button) findViewById(R.id.cxml);
		bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//create a xml to sdcard
				XmlSerializer xs = Xml.newSerializer();
				try {
					xs.setOutput(new FileOutputStream(new File("/storage/sdcard0/lizhao.xml")), "utf-8");
					xs.startDocument("utf-8", true);
						xs.startTag(null, "weather");
							xs.startTag(null, "city");
								xs.text("北京");
							xs.endTag(null, "city");
						xs.endTag(null, "weather");
					xs.endDocument();
					
				System.out.println("write done");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}  
			}
		});
		
		 
		Button read = (Button) findViewById(R.id.rxml);
		read.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				InputStream is = getClassLoader().getResourceAsStream("weather.xml");
				XmlPullParser xp = Xml.newPullParser();
				try {
					xp.setInput(is, "utf-8");
					
					int type = xp.getEventType();
					
					while(type != XmlPullParser.END_DOCUMENT){
						
						if(type == XmlPullParser.START_TAG && "city".equals(xp.getName())){
							System.out.println(xp.nextText());
						}
						
						type = xp.next();
					}
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}
}

class Weather{
	private String city;
	private String pm;
	private String wd;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPm() {
		return pm;
	}
	public void setPm(String pm) {
		this.pm = pm;
	}
	public String getWd() {
		return wd;
	}
	public void setWd(String wd) {
		this.wd = wd;
	}
	
}
