/**
 * 手机的制式
 * 1G
 * 
 * 2G  数字手机制式 带有网络制式 CDMA，GSM
 * 如果手机上是G那么是GSM网络
 * 如果手机上是E+那么是EDGE网络     2.5G 网络
 * GSM,EDGE 用的都是GSM模块
 *     
 * 3G 
 *    网络标示
 *    3G   3.0g 连的是哪个网不一定  联通移动电信互不兼容
 *    H    3.5g
 * 
 * 4G 
 *   TD-LTE  DD-LTE 这两个标准互不兼容
 *       
 * 网络制式
 * 2G制式
 * GSM 	支持 联通移动
 * CDMA 电信
 * 
 * 3G制式
 * WCDMA 		联通 		通用范围最强
 * TD-SCDMA 	移动
 * CDMA2000		电信
 * 
 * 4G制式
 * FDD-LTE 		电信联通	    这个不代表他们相互兼容
 * TD-LTE 		移动电信联通 这个不代表他们相互兼容
 * 
 * 2/3/4  速度的问题
 * 2g 相当电话线 	12.2k
 * 3g 相当拨号   	384k-2m
 * 4g 相当光钎   	100m
 * 
 * 
 * 
 * android 的知识体系结构
 * 四层
 * 1. linux 内核 
 * 2. library  类库层 3d游戏用[open gl] 开发   搭载的都是[webkit]内核的浏览器,sqllite 轻量级数据库,dvm（java虚拟机） 这里面的东西全部都是c实现的
 * 3. 应用的框架层  java api 如果需要访问类库需要这一层的api去调用。！！！调用这里的东西访问底层的东西。 主要学习这里面的东西
 * 4. 应用层 全是些应用 例如电话的应用，短信的应用 等等各种应用吧，系统级的应用，和其它的应用。
 * 
 * 
 * JVM 和  DVM 区别
 * java 开源免费不代表 jvm开源免费
 * 所以android 开发了自己的 java虚拟机DVM
 *       javac  jvm
 * .java -> .class -> .jar
 *       dalvik vm   
 *       javac      sdk dex  
 * .java -> .class -> .dex -> .apk
 * 所有的 .class都会被打包成.dex文件 classes.dex
 * 
 * jvm 基于栈
 * 
 * dvm 基于寄存器(寄存器里面只保存了指针，不是所有的)。
 * 
 * Dalvik: 应用每次运行的时候都需要把字节码通过即时编译转为机器码，这样会很慢,每条指令都需要编译所以很没有效率。（容量小一些）
 * 
 * ART:   应用第一次安装的时候，字节码预先编译成机器码，使其成为真正的本地应用，应用速度提升 （它的容量大一些，因为它需要保存编译好的机器码）
 * 
 * 以后会使用ART虚拟机
 * 
 * 手机 开启 ART 开发者选项->运行环境->ART
 * 
 * 
 * 
 * SDK
 * soft developer kit 
 * developer.android.com
 * www.android-doc.com
 * 翻墙 自由门 ， 无界浏览
 * 
 * 
 * 
 * 开发组成
 * eclipse + adt 开发环境  或者 android studio 
 * 
 * 这四个都会有的
 * =========================
 * Android SDK
 * Android Platform-tools
 * 最新的Android 开发平台
 * 最新的模拟器镜像
 * =========================
 * 
 * 
 * Android SDK
 * 不同系统的版本，给模拟器用的 用哪个版本模拟器就下那个否则创建不了模拟器
 * Tools
 *     Android SDK Tools android 的可执行程序 SDK 工具集 这个必须下载  （这个不要更新）  --这个位于adt-bundle-windows-x86_64-20140702->sdk->platform-tools下面
 *     这里的工具大部分都是自动调用的，很少需要手动调用。
 *     
 *     Android SDK Platform-tools 平台工具集  --这个位于adt-bundle-windows-x86_64-20140702->sdk->tools下面
 *     这里需要手动用的
 * 
 * Android 4.3 (API 18) 18 这个是api的等级  android 代码中 用 18表示4.3  每个版本都有等级
 *     SDK Platform     						SDK的平台这个就是系统平台 这个下载就可以创建4.3的模拟器了   在 adt-bundle-windows-x86_64-20140702->sdk->platforms 这里会有好多平台的进入相应的平台的即可
 *     docment ... 								帮助文档，android api 帮助文档，android 没有中文文档。稍微好点的就是www.android-doc.com ,  这个下载下来 会在 adt-bundle-windows-x86_64-20140702->sdk->docs里面有离线的文档
 *     (arm/inter 这两种架构) ... System image  	可以选择cpu的架构 不够cpu架构可能执行代码可能不同  这个在adt-bundle-windows-x86_64-20140702\sdk\system-images
 *     source for andorid sdk 					android jar 包的源码 adt-bundle-windows-x86_64-20140702\sdk\sources 如果想和java 一样ctrl + 鼠标左键进去看看就行。
 * 		
 * Extras
 *      android support library 
 * 		安装支持类库
 * 		低版本使用高版本性能 如何搞 把4.0 新特性抽出来
 *      在2.3导入就行 
 *      adt-bundle-windows-x86_64-20140702\sdk\extras\android\support
 *      
 *      inter x86 emulator accelerator (HAXM) 	
 *      模拟器加速器，在inter平台的 必装  adt-bundle-windows-x86_64-20140702\sdk\extras\inter 这个是需要双击安装的  装这个需要 bios VT-X
 *      如果出现VT-X错误就说明支持需要BIOS修改，如果出现not support 就不支持
 *      
 * 
 * SDK Manager --这个就是不同系统在应用开发层的API
 * 
 * 
 * 模拟器--配置  AVD
 * AVD -NAME 			模拟器名字
 * device 				预制的设备 多少分辨率屏幕 这个分辨率是屏幕密度的做屏幕适配的
 * Target 				系统版本
 * cpu/ABI 				cpu 是 inter 还是 arm 如何用到了加速器这里就必须是inter的 没有加速器arm会比较快一些 cpu镜像是要有一个的否则创建不了.
 * 						2.3(包括)系统之前的自带arm  
 * keyboard 			是否有实体按键最好勾上
 * skin 				是否物理按键皮肤 勾上
 * front camera 		前置摄像头 默认不可用
 * back camera 			后置摄像头 模拟个摄像头 但是拍不了，可以获取摄像头的一些参数
 * memory option 		内存ram 运行内存（默认不用改）      vm heep  （虚拟机堆内存大小）每个应用最大只有 设置的那么多m    堆大小应用最大就只能站到那么大 主流128 或 256
 * internal storage     手机自带的存储空间 200 就够了 必须写。
 * SD Card 				可有可无的 可以不写 就没有 写上就有  这个占用硬盘空间。
 * 
 * snapshot use host Gpu 这两建议不勾  
 * 
 * snapshot 			存储快照，类似一个休眠，之前关闭状态恢复出来。 下次开机恢复到上次开机状态
 * use host Gpu			如果模拟器比较慢可以勾选，这个是使用电脑的硬件的gpu  刷新的时候比较快些最好不用。 有加速器这个可以不用。
 * 
 * 启动模拟的时候  勾选wipe user data 启动的时候会回复出场设置
 * 
 * scale display to real size 调整缩放尺寸  缩放后在显示，缩放为原来的多少倍。
 * 
 * 有hax is working 说明加速器 启动了。 分辨率越小，启动速度越快。  建议用320的 做业务逻辑。  系统版本低的启动也快些。
 * 
 * 两个模拟器互相打电话发短信
 * 模拟器的左上角有个数字那个就是
 * 
 * 
 * 多个模拟器可以打电话发短息。
 * 
 * 
 * 创建第一个android 项目
 * application name 	这个是应用的名字 会在多个地方有用
 * project name 		这两个一般都用同一个名字--在项目列表里的标示
 * 不同点：
 * 
 * package name 		包名，代码的包名com.23.项目名
 * 
 * minimum required sdk 项目创建出来最低可以跑在什么SDK上，最低需要什么就这个决定的。
 * =================================
 * target sdk 			项目创建出来运行在什么版本。没有任何一个应用只能运行在一个版本所以没有意义默认就好		
 * compile with 		项目用哪个版本编译 用最新的
 * theme 				主题 和样式有关 默认就行了
 * 这三个用默认的行了
 * 
 * create custom launchar icon 创建自定义图片作为桌面的显示图标.
 * create activity 创建一个界面，任何一个界面都是一个activity 这个钩钩上就是让系统自动创建一个
 * mark.this project as a library 把当前项目变成一个类库供给别人使用。 这个基本没有用，如果给别人使用就勾上
 * 
 * create Activity 一般都选 空白的那个 样式自己写，不会让系统去辅助。
 * 
 * 
 * 在虚拟机上运行一个android 项目 选中项目右键 run as -> android application 
 * 
 * 
 * 
 * eclipse devices 是当前和eclipse 建立连接的设备，模拟器和真实机器都会在这上面。
 * 
 * android 所有的输出都是在logcat 查看而不是 console 了。
 * 
 * 
 * 项目的目录结构分析
 * src				项目的java代码  Activity 是个java类
 * gen				BuildConfig.java 是不需要改的自动生成的public final static boolean DEBUG = true; 是不是可以调试
 * 					R.java 这个很重要 自动生成的，所有的资源ID都在这。
 * Andorid 6.0 		android  api jar 包   这个是编译的版本所决定的。
 * 					如果报android api 找不到的错误 右键项目properties android 找到一个就行了。
 * Android Dependencies为了让低版本运行某些高版本的特性而导入的jar文件。知识包
 * 					这个可以删掉 注意 是在libs里面删掉自动就没了。
 * assets 			存放资源的（无资源ID），这个理的资源和R文件没关系，存大资源的，如视频等，用IO流读取。
 * bin				打包编译后所产生的文件
 * 					.dex .apk这个是可以安装的（自动打包的）每次部署到机器时候，先打apk包在往模拟器去安装的。
 * libs 			存放三方jar包，有什么包就放这行了
 * 
 * res 				资源文件夹，有资源ID 读取通过资源ID。
 * 					布局文件 xml
 * 					配置文件 xml
 * 					图片
 * 					drawable-hdpi 图片文件加
 * 					ic_launcher.png 是有资源ID的
 * 					如何找到资源id?
 * 					类是用的文件夹命名的所以先找类,public static final class 文件夹前面的那块名字 drawable public static final class drawable
 * 					在去内部类找到对应文件的名字 ic_launcher 没有扩展名。 这里的名字该了，资源ID的变量名字也该。	
 * 					R文件不能有中文所以图片不能有中文，也不能是数字开头。图片名字也不能相同，因为R变量不能相同
 * 					剩下那些个drawable是做屏幕适配的。--调用哪个是根据手机的密度决定的（也就是分辨率）.
 * 					"HVGA    mdpi"
					"WVGA   hdpi "
					"FWVGA hdpi "
					"QHD      hdpi "
					"720P     xhdpi"
					"1080P   xxhdpi "
					http://blog.csdn.net/sarsscofy/article/details/9249397
 *					这些目录只放一个也是可以的，没有任何影响。只是没了屏幕适配，如果不做就放第一个目录就行了，任何目录都行默认放第一个行了。
 *layout 			布局文件夹，保存布局文件，所有的布局都是XML。
 *					双击activity_main.xml会在graphical看到现在的样子，如果看不到就切换一下sdk
 *					MainActivity setContentView(R.layout.activity_main); 
 *					启动以后设置使用哪个布局文件
 *					创建MainActivity 这个对象的时候onCreate调用
 *menu 				菜单的配置文件夹，保存菜单样式文件. 点击手机menu 弹出来的
 *
 *values 			
 *					这里的内容不用用老套路找资源ID
 *					strings.xml	配置字符串资源的。用来定义字符串资源的。
 *					<string name="app_name">helloworld</string>
 *					字符串name就是这个字符串的资源ID。
 *					如何找资源ID？
 *					string 内部类里面
 *					public static final class string
 *					找对应的name 的变量
 *					public static final int app_name=0x7f0a0014;
 *
 *					如何在视图调用字符串 资源ID 
 *					"@string/mapreduce"
 *					
 *					xml 文件调用
 *					@内部类/资源name
 *
 *					java 类调用
 *					R.layout.什么什么
 *
 *				
 *					dimens.xml 定义长度的资源id的  数字加dp 是个长度    dp 和 px（这个是固定死的，不同分辨率都固定死了）  dp 是和屏幕密度有关的。
 *
 * 
 * 					style.xml 定义样式和主题的
 *				
 *
 *	values 多个是		国际化（需要自己创建新的values-什么文 values-en等等），适配
 *
 *
 *
 *
 *AndroidMainfest.xml 清单配置文件
 *manifest 
 *package			 默认和代码包是一样的，这个是系统在应用中的唯一识别，应用的唯一的ID，如何进行覆盖？通过包名，包名相同认为是同一个应用。
 *versionCode 		代码属于哪个版本，高版本替换低版本通常是+1  这个是写给系统看的。谁大谁是高版本。
 *versionName 		这个是写给程序员看的					
 *
 * <uses-sdk
 *     android:minSdkVersion="10" 			最低支持到哪个版本 10 是api的代码
 *     android:targetSdkVersion="17"		当前版本 不用管它
 * 
 * <application
 * 		icon		指定应用的图标张什么样子。
 * 		label		指定应用的  -- 这里的label 应用管理界面。
 * <activity
 * 		label 		这里的才是应用的名字。 （icon,label 如果没有 就会是application的)
 * 		icon 		这是设置桌面显示的图标
 * 
 * 写死的
 * <inter-filter> 决定android 应用的入口  点击应用图标的时候  <activity> 这个标签会有多个，谁有下面这个谁是入口
 *     <action android:name ="android.intent.action.MAIN" /> 
 *     <category android:name="android.intent.category.LAUNCHER" />
 *  
 * </inter-filter>						
 * 
 * 
 * 
 * project.properties
 * target=android-18   决定编译的版本 ，也可以右键项目properties->android->勾选一个行了
 */
package videoandroid;

 

/**
 * @author www.23.com
 *
 */
public class day1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
