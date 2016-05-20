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
 * 
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
