package com.ersan.sms;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.service.carrier.CarrierMessagingService.SendSmsResult;
import android.telephony.SmsManager;
import android.telephony.gsm.SmsMessage;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button bt =(Button) findViewById(R.id.send);
		bt.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				EditText phone = (EditText) findViewById(R.id.telNum);
				EditText msg = (EditText) findViewById(R.id.msg);
				
				String pstr = phone.getText().toString();
				String pMsg = msg.getText().toString();
				
				//发短信可以直接调用应用逻辑成的api 不需要  Intent了
				//短信管理器
				SmsManager smsManager = SmsManager.getDefault();
				//切割短信，把长短信切割若干短短信。
				ArrayList<String> sList = smsManager.divideMessage(pMsg);
				for (String smString : sList) {
					// 发短信 目标地址，短信服务中心（通常不会手动指定,运营商自动获取，真机也没填）,短信的内容,sentIntent
					// 这是一个广播，这个消息出去是成功了还是失败了，会有一个返回码。deliveryIntent
					// 广播，消息被对方接受会有一个返回。
					// 手机输入*#*#4636#*#* 查看手机的信息，ip 网段 等等
					smsManager.sendTextMessage(pstr, null, smString, null, null);
				}
			}
			
		});
		
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
}
