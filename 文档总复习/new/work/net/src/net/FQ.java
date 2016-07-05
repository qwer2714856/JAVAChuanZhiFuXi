/**
 * 给飞Q发送信息。
 * 飞Q用的是UDP协议如何发送？
 * 飞Q的端口是多少？
 * 
 * 
 * 
 * 在UDP协议中有一个地址是广播地址主机号为255的。
 * 同一个网段都可以接收到机器。
 * 什么叫用一个网络段
 * 就是网络号相等的。
 */
package net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 * @author www.23.com
 *
 */
public class FQ {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DatagramSocket ds = new DatagramSocket();
		
		String str = "hi hi";
		
		//处理飞q数据
		str = fQData(str);
	 
		
		DatagramPacket dp = new DatagramPacket(str.getBytes(),str.getBytes().length,InetAddress.getByName("192.168.1.255"),2425);
		
		ds.send(dp);
		
		ds.close();
		
		System.out.println("===test====");
		
		//为什么发FQ无法发出？ 
		//原因每一个网络程序都有自己的所处理的特定格式数据，如果接收到数据不符合格式就会被当做垃圾数据丢弃，就相当于一个加密。
		//如果想让飞Q接收你的数据必须你要符合他的格式。
		//飞Q接收的数据格式要求
		/*
		 * 版本号 随意写
		 * 时间 毫秒
		 * 发送人
		 * ip 发送的一个标示符 来源人的ip这个没要求随便写
		 * flg发送的标示32
		 * content 真正的内容
		 * 
		 * 版本号:时间:发送人:ip:flg:content
		 */
		
	}
	public static String fQData(String str){
		StringBuilder sb = new StringBuilder();
		sb.append("1.0:");
		sb.append(System.currentTimeMillis()+":");
		sb.append("xiaoming:");
		sb.append("192.168.1.1:");
		sb.append("32:");
		sb.append(str);
		
		return sb.toString();
	}

}
