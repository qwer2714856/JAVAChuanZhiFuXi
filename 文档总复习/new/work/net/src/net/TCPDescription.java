/**
 * TCP
 * 可靠协议
 * 
 * TCP 和 UDP的区别
 * 
 * UDP是基于是数据包的面向无连接。
 * TCP是基于IO流只能传字节无法传字符的是面向连接。
 * 面向连接
 * 比如文件传输。
 * 
 * UDP 数据包64K 内
 * TCP 数据传输没有大小限制
 * 
 * UDP 面向无连接		 			 不可靠
 * TCP 面向连接三次握手，保证数据的完整性 可靠协议
 * 
 * 三次握手
 * 通讯前先要打招呼。
 * 
 * 
 * UDP面向无连接速度快
 * TCP面向连接速度慢
 * 
 * UDP 只有发送端和接收端的，不区分客户端服务端。
 * TCP 是区分客户端和服务端的。
 * 
 * 
 * TCP 协议下的两个类
 * Socket 客户端类
 * ServerSocket 服务器端类
 * 
 * Socket ServerSocket 如果使用BuffreadReader 那么需要注意它默认是不会包含\r\n 所以客户端发送的时候需要加上\r\n否则服务器得不到数据 而且需要使用flush
 * 
 * 1.如果使用BufferedReader readLine 一定加上\r\n才把数据写出
 * 2.使用字符流一定flush才能把数据写出去
 * 
 * 
 * 整理一个概念
 * 客户端				服务器端
 * 当客户端向服务器端发送一个socket 套接字包 服务器通过accept拿到后
 * 此时客户端如果正在读取服务器数据利用while((len = is.read(by) != -1){}此时会僵持在这里，当服务器将socket close关闭后将跳出循环，注意是关闭socket 不是关闭ServerSocket 对象。
 * 反正也可
 * 总之一端在读取是通过另一端是否close来表明的  前提是用了while()循环读取
 * 
 * 就像流水一样
 * 一边停止出流了，另一端自动没了。
 */
package net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author www.23.com
 *
 */
public class TCPDescription {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		//客户端
		//1.建立TCP的客户端服务
		Socket sk  = new Socket(InetAddress.getLocalHost(),9815);
		//2.向服务器输出数据 获取对应的输出流对象
		OutputStream op = sk.getOutputStream();
		op.write("admin".getBytes());
		
		InputStream is = sk.getInputStream();
		byte [] by = new byte[1024];
		int len = 0;
		len = is.read(by);
		System.out.println(new String(by,0,len));
		
		//关闭资源
		sk.close();
		
	}

}
