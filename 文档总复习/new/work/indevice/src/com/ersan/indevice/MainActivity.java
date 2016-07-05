package com.ersan.indevice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final EditText userNameEditText = (EditText) findViewById(R.id.username);
		final EditText passWordEditText = (EditText) findViewById(R.id.pwd);
		final CheckBox cBox = (CheckBox) findViewById(R.id.comfirm);
		Button rd = (Button) findViewById(R.id.sub);
		final Activity atActivity = this;
		rd.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String userName = userNameEditText.getText().toString();
				String passWord = passWordEditText.getText().toString();
				Log.w("login", userName+"login ok");
				
				if(cBox.isChecked()){
					//写到本地文件
					FileWriter fwFileWriter = null;
					try {
						
						fwFileWriter = new FileWriter(new File("/data/data/com.ersan.indevice/cache/info.txt"));
						fwFileWriter.write(userName+"*#06#*"+passWord);
						
						//吐司对话框 
						/**
						 * context 上下文对象 Activity 就是上下文对象
						 * text 提示信息
						 * duration 只有两个值 Toast.LENGTH_SHORT 3 秒，Toast.LENGTH_LONG 5秒
						 */
						Toast toast = Toast.makeText(atActivity, "登录成功", Toast.LENGTH_LONG);
						toast.show();
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} finally{
						if(fwFileWriter != null){
							try {
								fwFileWriter.close();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
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
