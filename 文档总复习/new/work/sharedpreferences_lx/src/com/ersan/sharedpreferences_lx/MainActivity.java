package com.ersan.sharedpreferences_lx;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//SharedPreferences
		SharedPreferences sp = getSharedPreferences("user",MODE_PRIVATE);
		
		//创建编辑器
		Editor editor = sp.edit();
		//条件数据
		editor.putString("username", "ding.luchao");
		editor.putString("pwd", "qwer110");
		//提交
		editor.commit();
		
		//获取数据
		String userString = sp.getString("username", "");
		String pwd = sp.getString("pwd", "");
		
		Log.e("test", userString+pwd);
		
	}

	 
}
