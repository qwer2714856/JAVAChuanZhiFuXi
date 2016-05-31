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
 * 外部文件
 * 外部存储空间sd卡
 * /storage(这里为什么搞个软连接，android2.2之前sd卡就在这)  	->		/storage/emulated/legacy
 * /storage/emulated/legacy（4.3之前在这）					->		/mnt/shell/emulated/0  这个地方有挂在点sd卡（后来就到这了）
 * 
 * 用输入输出流写入
 * 路径就是
 * File fl = new File("/storage/info.txt"); 这里sdk 访问拒绝，需要在清单文件里面添加权限。
 * 权限是什么？
 * android.permission.WRITE_EXTERNAL_STORAGE
 * android.permission.READ_EXTERNAL_STORAGE（这个只有开发者模式下开启了sd卡读保护这个选项才有用，一般不用）。
 * //读没有权限没有必要加的。
 * 
 * api 提供sdk 路径
 * Environment.getExternalStorageDirectory(); 返回的也是个file对象目录 sdk的真实路径目录。 需要用这个。因为手机厂商都自己改掉了/storage
 * 
 * 
 * 检测sd卡的状态
 * 外部存储可有可无的，所以需要先检测下存在否
 * 
 * Environment.getExternalStorageState(); 获取sd卡的状态.
 * 返回的是个字符串，会有很多中状态。
 * MEDIA_UNKNOWN, 						不能识别sd卡
 * MEDIA_REMOVED, 						sd 卡根本就不存在
 * MEDIA_UNMOUNTED, 					sd 卡卸载，挂在点不存在，卡存在，但是没挂载
 * MEDIA_CHECKING, 						sd 卡正在检测（正在准备sd卡）
 * MEDIA_MOUNTED,						sd 卡已经挂在可用，返回值是这个就代表sd可用 
 * MEDIA_MOUNTED_READ_ONLY,				sd 卡可用只读. 
 * 比较的时候是
 * if(Environment.MEDIA_UNKNOWN.equals(Environment.getExternalStorageState())){
 * ...
 * }
 * 2.3 和之前版本是可以卸载sd卡的。 
 * 
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
