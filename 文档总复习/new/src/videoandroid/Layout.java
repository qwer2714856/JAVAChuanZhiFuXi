/**
 * android 各种布局和布局的特有属性
 * 5种布局
 * LinearLayout 	线性布局
 * FrameLayout  	帧布局
 * RelativeLayout 	相对布局
 * TableLayout		表格布局
 * AbsoluteLayout   绝对布局
 * 
 * 布局组合组成比较套路的布局
 * 
 * 常用的就线性布局和相对布局
 * 
 * LinerarLayout   线性布局里面的组件彼此是不能重叠的，排列可以水平，也可以竖直排列。默认水平排列.
 * android:orientation="vertical"     垂直排列
   android:orientation="horizontal"	     水平排列  
 * 
 * 排列如果内容超出也不会换行
 * 
 * 组件本身的属性
 * android:layout_gravity=""  组件本身对其方式              如果布局是竖直只有左中右，如果布局是水平的有上中下
 * android:gravity=""		     组件内容的对其方式
 * 如果有多个值采用|的方式  left|center|top
 * android:layout_weight="1"  权重 比例分配（！！！屏幕剩余！！！）宽度或高度   如果有n个组件 那就是n个组件的权重之和平分屏幕，然后根据自己的权重去占相应的尺寸。
 * 如果要平分
 * =============================
 * android:layout_width="0dp"
 * android:layout_weight="1"
 * =============================
 * 这么分比较精确 权重出现了搭配的一定是0dp 
 * 
 * android:textSize 		    设置字号
 * 
 * 
 * 
 * 
 * 相对布局
 * RelativeLayout
 * 组件没有方向和权重（这个只有线性才有的）。
 * 相对布局组件和组件可以重叠的。 
 * 
 * 
 * 单位
 * 
 * 字体是sp 长度是dp  都是根据屏幕密度决定的。
 * 
 * 
 * 
 * 如果要在xml中引用谷歌的资源使用@android....
 * 
 */
package videoandroid;

/**
 * @author www.23.com
 *
 */
public class Layout {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
