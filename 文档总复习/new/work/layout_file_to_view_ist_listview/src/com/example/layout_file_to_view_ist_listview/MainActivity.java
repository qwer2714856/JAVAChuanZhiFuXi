package com.example.layout_file_to_view_ist_listview;

import android.app.Activity;
import android.content.Intent;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//这个地方写哪个layout 显示默认就加载哪个layout
		setContentView(R.layout.activity_main);
		final String []ay = new String[]{"1","2","3","4"};
		ListView lv = (ListView) findViewById(R.id.listview);
		Button btButton = (Button) findViewById(R.id.bt);
		btButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//这个是换不同木块功能的跳转，就像A连接
				Intent itIntent = new Intent(MainActivity.this, MainActivity.class);//切换不同的Activity
				MainActivity.this.startActivity(itIntent);
				MainActivity.this.finish();
				
				//setContentView 这个是换皮肤 换layout
				//setContentView(R.layout.listviewdata);
			}
		});
 
		lv.setAdapter(new BaseAdapter() {
			
			@Override
			public View getView(int position, View convertView, ViewGroup parent) {
				// TODO Auto-generated method stub
				ViewGroup group;//view group 可以有子节点，而view对象是没有子节点的  view 比如 button view group linearlayout 等等。
				View view = View.inflate(MainActivity.this, R.layout.listviewdata, null);//布局文件填充为view对象
				//获取布局填充的第二种方法
				/*LayoutInflater layoutInflater = LayoutInflater.from(MainActivity.this);
				View view2 = layoutInflater.inflate(R.layout.listviewdata, null);*/
				//获取布局填充的第三种方法
				//getSystemService 获取系统服务 重点 不同的服务获取不同的管理器
				/*LayoutInflater layoutInflater = (LayoutInflater) getSystemService("layoutinflater");
				layoutInflater.inflate(resource, root);*/
				
				TextView tvnameTextView =(TextView) view.findViewById(R.id.name);//从布局文件获取ID
				TextView tvageTextView = (TextView) view.findViewById(R.id.age);
				tvnameTextView.setText(ay[position]);
				tvageTextView.setText(ay[position]);
				return view;
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
			public int getCount() {
				// TODO Auto-generated method stub
				return ay.length;
			}
		});
		
		
	}
}
