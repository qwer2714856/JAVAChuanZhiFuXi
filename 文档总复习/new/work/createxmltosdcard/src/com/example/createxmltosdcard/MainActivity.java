package com.example.createxmltosdcard;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import sms.Sms;
import android.R.integer;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	List<Sms> smsList;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		smsList = new ArrayList<Sms>();
		//模拟短信，现在获取短信没学
		for(int i = 0; i < 10; i++){
			Sms sms = new Sms(i+"", i+"", i+"", (char)i);
			smsList.add(sms);
		}
		
		Button btButton = (Button) findViewById(R.id.back);
		btButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				File fl = new File("/storage/sdcard0/save.xml");
				FileOutputStream fo = null;
				try {
					fo = new FileOutputStream(fl);
					StringBuilder sbBuilder = new StringBuilder();
					sbBuilder.append("<?xml version='1.0' encoding='UTF-8'?>");
					sbBuilder.append("<message>");
					for(Sms sms:smsList){
						sbBuilder.append("<sms>");
						sbBuilder.append("<body>");
						sbBuilder.append(sms.getBody());
						sbBuilder.append("</body>");
						
						sbBuilder.append("<date>");
						sbBuilder.append(sms.getDate());
						sbBuilder.append("</date>");
						
						sbBuilder.append("<from>");
						sbBuilder.append(sms.getFrom());
						sbBuilder.append("</from>");
						
						sbBuilder.append("<flg>");
						sbBuilder.append(sms.getFlg());
						sbBuilder.append("</flg>");
						
						sbBuilder.append("</sms>");
					}
					sbBuilder.append("</message>");
					fo.write(sbBuilder.toString().getBytes());
					Log.e("test", sbBuilder.toString());
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally{
					if(fo != null){
						try {
							fo.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
				
			}
		});
	}
}
