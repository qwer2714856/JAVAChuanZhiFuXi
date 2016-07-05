package com.example.listviews;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

// 使用这个的优点，当大于屏幕数量，拖到哪个才会创建哪个对象，并且把消失的那个条目对象销毁掉。
public class MainActivity extends Activity {
	private int [] data = {1,2,3,4,5,2,3,4,5,2,3,4,5,2,3,4,5,2,3,4,5,2,3,4,5,2,3,4,5,2,3,4,5,2,3,4,5,2,3,4,5,2,3,4,5};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ListView lv = (ListView) findViewById(R.id.listview);
		lv.setAdapter(new BaseAdapter() {
			
			@Override
			//由系统调用，每次返回的view对象作为条目
			//position 返回当前条目的位置，正好用于插入数据
			public View getView(int position, View convertView, ViewGroup parent) {
				// TODO Auto-generated method stub
				TextView tv = new TextView(MainActivity.this);
				tv.setText("hi" + MainActivity.this.data[position]);
				return tv;
			}
			
			@Override
			public long getItemId(int position) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public Object getItem(int position) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			//由系统调用，一共有多少数据，返回多少getView就会执行多少次。并把位置position 传给 getView
			public int getCount() {
				// TODO Auto-generated method stub
				return MainActivity.this.data.length;
			}
		});
	}

	 
}
