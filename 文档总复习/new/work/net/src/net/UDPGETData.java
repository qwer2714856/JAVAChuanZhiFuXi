/**
 * 
 */
package net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Arrays;

/**
 * @author www.23.com
 * 
 */
public class UDPGETData {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 安装服务
		DatagramSocket ds = new DatagramSocket(9090);// 它需要监听一个端口就是发送过来的那个端口

		// 卸货 需要自己建个空箱子 用于存储数据
		byte[] str = new byte[1024];
		while (true) {
			DatagramPacket dp = new DatagramPacket(str, str.length);

			// 接收数据
			ds.receive(dp);// 数据存储到了str字节数组中去了。这个方法它比较好它是一个阻塞型的方法就是不得到数据不释放。就像scaner
							// 的next一样，没得到数据包就一直等待。

			System.out.println(new String(str, 0, dp.getLength()));// 获取数据包存储了几个字节
		}

		// ds.close();

	}

}
