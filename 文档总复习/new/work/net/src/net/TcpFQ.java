/**
 * 为什么ServerSocket 不设计 getInputStream 和 getOutStream 这两个流方法？
 * 是为了接收多用户的请求的。
 * 如何接收多用户请求？
 * ------------------------------------------------------------------------------------------------
 * 	ServerSocket 服务器端  每个人和我连接通过accept都会产生一个socket 这个socket对应的就是和服务器连接的客户端。
 * ------------------------------------------------------------------------------------------------
 *   ↑↓	socket						↑↓ socket  都有自己的socket
 * -----------				---------------
 * 客户端A						客户端B
 * Socket A						Socket B
 * -----------				---------------
 * 
 */
package net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author www.23.com 实现客户端和服务器一问一答 客户端
 */
public class TcpFQ {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		// 创建客户端socket
		Socket sk = new Socket(InetAddress.getLocalHost(), 9522);
		// 获取输出管道
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(sk.getOutputStream()));
		// 从控制台获取数据发给服务器
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		// 获取发送数据
		String line = "";
		while ((line = rd.readLine()) != null) {//System.in 的会等待
			//readLine获取的数据没有\r\n 为什么要加？因为服务器端需要用readLine读数据需要根据\r\n判断是否一个
			line += "\r\n";
			
			bw.write(line);
			//这里为什么使用flush 因为需要从缓冲区里面刷出去
			bw.flush();
			
			//获取服务器发来的消息
			BufferedReader br = new BufferedReader(new InputStreamReader(sk.getInputStream()));//socket输入字节流read的会等待
			String str = br.readLine();
			System.out.println(str);
			  
			
		}
	}

}
