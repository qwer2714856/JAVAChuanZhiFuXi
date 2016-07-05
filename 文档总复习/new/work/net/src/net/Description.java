/**
 * java 网络编程
 * 网络编程解决什么问题？
 * 网络编程主要用于计算机与计算机之间的数据传输问题。
 * 手机 与 手机等等
 * 等等再网络上的设备之间的传递
 * 
 * 网络编程和网页编程，不是同一个概念
 * 网络编程不需要基于HTML就可以达到数据之间的传输。 非Q就是网络编程，QQ等等，C/S架构的   网页编程是B/S架构的。
 * 
 * 我们的网络编程，分体系。
 * 网络编程主要用到哪去？
 * 录制视频的原理就是每秒种截取屏幕的图片分发给其它的人。（在线视频） 因为速度快所以看着就是一个动画。
 * 
 * 体系
 * WEB         网络编程就不太重要了
 * android 	       网络编程很重要！！！ 
 * 
 * 什么是计算机网络？
 * 形成一个拓扑，数据可以传输，文件可以共享。
 * 分布在不同地域计算机，通过外部设备连接，达到数据互通，资源共享。
 * 
 * 网络通讯的三要素
 * 1、ip 	地址  
 * 2、端口	号  简单理解为门牌号。 该消息是给哪个应用处理的。不用应用端口不同。
 * 3、数据经过路由器都会加一些针。 接收数据的路由器会解出来。 因为发送和接收的路由器可能不同，所以可能错乱。所以他们要有一个协议。在哪个位置解数据，加数据，不同牌子路由也就不会有问题了（协议！！！）	
 * 
 * 
 * IP 地址
 * 由32位或64 二进制数组成的。
 * 00000000-00000000-00000000-00000000
 * 别人把32位的二进制，切成了4份方便记忆，每份8位。2^8个  0-(2^8)-1
 * IP地址=网络号+主机号。
 * 什么是网络号
 * ipconfig
 * 先看子网掩码 255.255.255.0
 * 好是3部分
 * 192.168.1.1
 * 那么网络号就是192.168.1 
 * 主机号是1 
 * 网络号是根据子网掩码分析的。
 * 255的部分就是对应IP的网络号有几段255网络号就有几段。
 * 
 * 分类：
 * A类  一个网络号可以配置2^24主机 政府单位
 * B类  两个网络号可以配置2^16主机 事业单位
 * C类  三个网络号可以配置2^8主机  私人使用 路由器 一个IP可以分发给内部多个人。
 * 
 * java是面向对象的
 * IP地址也是一类实物的，用类描述IP地址的。
 * 
 * 所有的网络都在java.net 包里面
 * IP类 InetAddress 用来描述一个IP地址
 * 
 * 
 * 
 * 服务器集群
 * 
 *client 访问请求过来 -> dns 域名服务器
 * 					 www.baidu.com 192.168.1.1  nginx服务器     背后有大把的集群为其服务
 * 											 	负载均衡		
 * 					 www.baidu.com 192.168.1.2  nginx服务器     背后有大把的集群为其服务
 * 												负载均衡
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 端口号
 * 端口号没有使用类来表示，仅仅是个标识符所以不需要再使用个类在描述了。 范围是0-65535的范围，不是全部都能用有些被占了
 * windows 0-1023 已经被系统占用了。
 * 1024-49151 系统绑定了松散的服务。
 * 
 * 其实可以用
 * 1024-65535 这个范围的我们可以使用。不行就换。
 * 
 * 
 * 网络通讯的协议
 * UDP 协议  需要把数据封装成数据包在发出去的，不需要建立连接的。
 * TCP 协议
 * 
 * 
 * 在UDP协议中有一个地址是广播地址主机号为255的。只有UDP才有的，TCP是没有的。
 */
package net;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

/**
 * @author www.23.com
 *
 */
public class Description {

	/**
	 * @param args
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		//InetAddress.getLocalHost() InetAddress 类。返回一个IP对象本机的IP地址对象  没有网卡就会有异常，没有IP
		InetAddress ip = InetAddress.getLocalHost();
		ip.getHostAddress();//返回一个IP地址字符串
		//System.out.print(ip.getHostName());//返回计算机的主机名
		
		//获取别人IP地址的对象。
		//这里的参数可以传入别人的IP地址也可以传入主机名，还可以写域名,不需要带http。
		/*InetAddress other = InetAddress.getByName("192.168.1.2");
		System.out.println(other.getHostName());*/
		
		//返回IP地址数组 还可以写域名
		InetAddress  [] iads = InetAddress.getAllByName("www.baidu.com");// [在dns上一个域名绑定了几台机器] 返回所有的域名解析IP地址，一个域名可以有多个IP服务器，这个原则就是择优选择空闲的服务器。
		for(InetAddress iad : iads){
			System.out.println(iad.getHostAddress());
			System.out.println(iad.getHostName());
		}
		
	}

}
