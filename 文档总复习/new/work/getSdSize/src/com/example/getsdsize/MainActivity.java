package com.example.getsdsize;

import java.io.File;
import android.text.format.Formatter;

import android.R.integer;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//sd 卡的目录 
		File fl = Environment.getExternalStorageDirectory();
		//获取文件系统
		StatFs fs = new StatFs(fl.getAbsolutePath());
		
		//获取参数
		long size = fs.getBlockSize();
		long count = fs.getBlockCount();
		long av = fs.getAvailableBlocks();
		
		TextView tView = (TextView) findViewById(R.id.txt);
		
		tView.setText(Formatter.formatFileSize(this,size * count));
		
		//Log.e("build", Build.VERSION.SDK_INT+"");
		
	}

}
