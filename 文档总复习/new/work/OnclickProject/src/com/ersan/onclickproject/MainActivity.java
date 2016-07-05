package com.ersan.onclickproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		Button bt1 = (Button) findViewById(R.id.f1);
		bt1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				System.out.println("方式1");
			}
		});
		
		
		Button bt2 = (Button) findViewById(R.id.f2);
		bt2.setOnClickListener(new f2());
		
		
		Button bt3 = (Button) findViewById(R.id.f3);
		bt3.setOnClickListener(this);
		
		
		
		
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

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		System.out.println("方式三");
	}
	public void fangshi4(View v){
		System.out.println("方式四");
	}
}
class f2 implements OnClickListener{

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		System.out.println("方式二");
	}
	
}