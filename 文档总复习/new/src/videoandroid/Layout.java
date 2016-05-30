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
 * 默认组件 左对齐和顶部对其
 * 组件的属性
 * android:layout_alignParentTop=""          值是true 或 false 对其父辈的方向。
 * ...
 * 这些属性可以一起搞
 * android:layout_alignParentTop="true"
 * android:layout_alignParentLeft="true"
 * 
 * 还可以对其其它的组件
 * 但是其它的组件必须设置id 本组件根据其它组件的id进行对其
 * android:layout_toRightOf="@id/要对其元素的id"		这个意思是在什么什么的右边，什么什么是id
 * android:layout_above="@id" 						上
 * android:layout_below="@id"						下
 * ...
 * 也可以多个一起搞
 * 
 * 相对于组件对其
 * android:layout_alignLeft=""  					组件和组件的左边对其
 * ...
 * 
 * android:layout_alignLeft=""
 * android:layout_alignRight=""						相对的那个组件有多宽这个组件就有多宽
 * 
 *  android:layout_centerHorizontal="" 水平居中
 *  android:layout_centerVertical=""   垂直居中
 *  android:layout_centerInParent=""   水平垂直都居中 
 *  
 *  
 * 表格布局 -- TableLayout 				
 * 一些属性
 * android:stretchColumns="number"		拉伸列 拉伸第几列0 开始 拉伸的这一列屏幕剩余宽度都将给它。
 * 
 * 
 * <TableRow ></TableRow>				行节点，里面的组件可以不定义宽高。(包括tablerow) 给了也没用。改了也无效。
 * TableRow 							里面有几个子节点就有几列
 * 组件可以和tablerow是同级节点，显示出来的效果是组建占了一行。
 * 
 * 组件的属性
 * android:layout_column="1" 			将列号修改 android:stretchColumns 修改后对它起作用。
 * android:layout_span="2"				当前列占用两列	
 * 
 * 如果组件嵌套在tablerow里面组件就是列，如果放到布局里面和tablerow并行就是行。
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
