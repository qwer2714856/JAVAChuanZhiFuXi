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
