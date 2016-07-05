/**
 * UDP 协议
 * 将数据及其源和目的封装为数据包，不需要建立连接。
 * 每个数据包大小限制在64中。
 * 因为无连续所以不可靠，会出现数据包丢失。
 * 因为不需要建立连接所以速度快。
 * 
 * 什么叫不需要建立连接？
 * 比如 对讲机 群喊 不需要知道对方在不在，只是负责吧数据扔出去，不需要管它知不知道。就像飞Q群发 包括聊天， 有些游戏比如CS 为什么会出现卡机？因为服务器不断的发数据过来，不管你有没有能力处理，当你处理不了这些数据就会丢失一部分就会卡机。
 * 什么叫面向连接？
 * 例如 手机定点拨号是需要双方建立连接的。
 * 确认对方在不在，并且等对方处理完了再搞。
 * 
 * 没有大小限制
 * 可靠
 * 效率低
 * 
 * 如果面向连接作CS 如果一个人卡住了服务器就会等你，结果就会连累一大批人。服务器就管不断的发数据他不管接没接到。速度快面向无连接。
 * 
 * 
 * 不同协议，有不同特点，各有优略。
 * 
 * 在java中网络通讯也是socket通信，通讯两端必须安装socket.
 * socket 套接字(插座)。
 * 不同的协议，就有不同的插座（socket）
 * 
 * 
 * udp协议的插座
 * DatagramSocket UDP插座服务   发送接收都使用这个类，是不分客户端和服务端，只分发送端和接收端。
 * 封装数据包
 * DatagramPacket
 * 数据包类
 * 
 * 不可靠的协议，数据包可能会丢失。
 * UDP在什么时候会丢失数据包？
 * 比如网络不好，带宽不足。
 * 		客户端							游戏服务器
 * ------------------             ----------------
 * |1客户服务器 每秒比如讲 				带宽每秒10m数据
 * |可以接收1m数据						每秒发送25K数据
 * |2CPU每秒可以处理 20K 	
 * |数据
 * |CPU寄存器 可以在处理不过来
 * |的时候会把处理不了的数据
 * |放到寄存器。但寄存器很小貌似
 * |只有1K									
 * |---------------	
 * 
 * 这样就会造成客户端根不上服务器的速度导致每秒9m的数据被丢失了。
 * 
 * 第一、 带宽不足
 * 第二、客户端的cpu处理能力不足
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
public class UDPDescription {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 1 建立UDP的服务 两个UDP socket好比码头，所有的信息都是捆绑在数据上的，码头不需要做什么，所以创建的时候使用无参的构造函数。
		DatagramSocket ds = new DatagramSocket();

		// 2 捆绑数据
		String str = "ding.luchao";
		/**
		 * @parameter 字节数组
		 * @parameter 字节数组大小
		 * @parameter IP对象
		 * @parameter 端口
		 */
		// 创建了一个数据包了
		DatagramPacket dp = new DatagramPacket(str.getBytes(),
				str.getBytes().length, InetAddress.getLocalHost(), 9090);

		// 货物装好了就发或了
		// 调用码头的服务把货物发出去
		ds.send(dp);
		// 关闭资源 数据出去要占用端口号，端口是有限资源。
		ds.close();

		
	}

}
