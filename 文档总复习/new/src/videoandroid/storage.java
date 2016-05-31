/**
 * 读写数据
 * 所有的android 有两个存储空间，内外存储空间。
 * 内部存储空间 -- 一定有
 * RAM 运行内存，相当于电脑内存
 * ROM 存储内存，相当于电脑硬盘
 * 
 * 外部存储空间 -- 可有可无 ， 多少多少G都是外部存储空间。
 * 移动硬盘（sd卡）
 * 
 * 内部外部存储都会有。
 * 
 * 
 * File Explorer 控制面板 点击文件 然后控制台右上角有个pull 导出的，当然可以用shell 去看看
 * 
 * 
 * 	//吐司对话框 
			
	context 上下文对象 Activity 就是上下文对象
	text 提示信息
	duration 只有两个值 Toast.LENGTH_SHORT 3 秒，Toast.LENGTH_LONG 5秒
		 
	Toast toast = Toast.makeText(atActivity, "登录成功", Toast.LENGTH_LONG);
	toast.show();
 * 
 * 
 * 如果点击手机home键 文本域上有内容在返回，内容还在，如果是点击的返回内容就没有了，点击返回activity 会销毁，再点击在开启一个新的。
 * 
 * 
 * 用api 获取资源的路径
 * 使用getFilesDir() 这个来获取到可以使用的也就是/data/data/com...../files  就是这个app的专属目录. 返回的是file对象.
 * 
 * 
 * 可以通过Context上下文对象来获取一些信息比如getFilesDir()，因为它存在于上下文中，所以就可以在其他上下文对象中直接使用。
 * 吐司的指定上下文，是指定在哪个上下文中弹出。
 * 
 * 
 * getCacheDir()  指向了/data/data/com...../cache 这个是app缓存的专属目录
 * 
 * getCacheDir getFilesDir 区别
 * 
 * cache 保存会被删除，当手机的内部存储空间不足的时候就删除了（存一些临时的东西）。
 * 
 * 手机上的clear cache 删除的是cache 下面的内容
 * 手机上的clear data 删除的是应用报名下面所有的内容， files + cache 全部删掉（包括目录）。
 * 
 */
package videoandroid;

/**
 * @author www.23.com
 * 
 */
public class storage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "aaaa*#06#*";
		string.split("\\*#06#\\*");
	}

}
