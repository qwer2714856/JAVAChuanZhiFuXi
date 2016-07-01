/**
 * //通过代码创建空间 getContext() 实际的上下文对象 但是不会显示出来
 * TextView tv = new TextView(getContext());
 * 
 * 如何让其显示出来
 * //将控件设置为布局的字结点
   //findById(R.布局id).addView(tv);
   
   //当数据很多的时候需要使用scrollview
    * <ScrollView
	    xmlns:android="http://schemas.android.com/apk/res/android"
	    xmlns:tools="http://schemas.android.com/tools"
	     android:layout_width="match_parent"
	    android:layout_height="match_parent"
	    >
	<LinearLayout 
	    android:layout_width="match_parent"
	    android:layout_height="match_parent"
	    android:paddingBottom="@dimen/activity_vertical_margin"
	    android:paddingLeft="@dimen/activity_horizontal_margin"
	    android:paddingRight="@dimen/activity_horizontal_margin"
	    android:paddingTop="@dimen/activity_vertical_margin"
	    tools:context="com.example.testviews.MainActivity" 
	    android:orientation="vertical"
	    android:id="@+id/li"
	    >
	
	    <TextView
	        android:layout_width="wrap_content"
	        android:layout_height="wrap_content"
	        android:text="@string/hello_world" />
	</LinearLayout>
	</ScrollView>
	
 * ListView
 * 
 * 
 * // 使用这个的优点，当大于屏幕数量，拖到哪个才会创建哪个对象，并且把消失的那个条目对象销毁掉。
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

把一个布局文件填充成一个view对象
layout_file_to_view_ist_listview project
 * 
 */
package videoandroid;


/**
 * @author www.23.com
 *
 */
public class textviews {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
