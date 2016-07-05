package com.ersan.insidesave;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Environment;
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
		
		Log.e("test", getCacheDir().getAbsolutePath());
		
		Context context=null;
		final EditText userEditText = (EditText) findViewById(R.id.username);
		final EditText pwdEditText = (EditText) findViewById(R.id.pwd);
		final CheckBox ckBox = (CheckBox) findViewById(R.id.ck);
		Button suButton = (Button) findViewById(R.id.sub);
		final MainActivity _this = this;
		
		//get user name and password
		File rdFile = new File("/data/data/com.ersan.insidesave/cache/info.txt");
		if(rdFile.isFile()){
			FileReader frFileReader = null;
			try {
				frFileReader = new FileReader(rdFile);
				char [] by = new char[1024];
				StringBuilder sb = new StringBuilder();
				int tmpString = 0;
				while((tmpString = frFileReader.read(by)) != -1){
					sb.append(by,0,tmpString);
				}
				
				String spString = sb.toString();
				String []ayString = spString.split("\\*#06#\\*");
				userEditText.setText(ayString[0]);
				pwdEditText.setText(ayString[1]);
				
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally{
				if(frFileReader != null){
					try {
						frFileReader.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		}
		
		
		suButton.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String userName = userEditText.getText().toString();
				String pwd = pwdEditText.getText().toString();
				
				if(ckBox.isChecked()){
					//write to cache
					FileWriter fwFileWriter = null;
					
					try {
						fwFileWriter = new FileWriter(new File("/data/data/com.ersan.insidesave/cache/info.txt"));
						fwFileWriter.write(userName+"*#06#*"+pwd);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} finally {
						try {
							fwFileWriter.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					
					Toast.makeText(_this, "登录成功", Toast.LENGTH_SHORT);
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
