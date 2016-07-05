package com.example.testviews;

import java.util.ArrayList;
import java.util.List;

import android.R.integer;
import android.widget.TextView;


public class jutil extends android.test.AndroidTestCase {
	List<Person> plist;
	public void textView(){
		plist = new ArrayList<Person>();
		for(int i = 0; i < 100; i++){
			plist.add(new Person("小智" + i, i));
		}
		
		//放到textView里面 -- 有几个就new 几个textView
		
		//数据显示到屏幕
		for(Person person : plist ){
			TextView tv = new TextView(getContext());
			tv.setText(person.toString());
			
			//将控件设置为布局的字结点
			//findById(R.布局id).addView(tv)
		}
	}
}
