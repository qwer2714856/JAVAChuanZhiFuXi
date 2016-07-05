package com.example.foreachtextview;

import android.app.Activity;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		LinearLayout ly = (LinearLayout) findViewById(R.id.listTextView);
		/*for(int i = 0; i < 100; i++){
			TextView tv = new TextView(this);
			tv.setText("aaa" + i);
			ly.addView(tv);
		}*/
	
	}

	 
}
