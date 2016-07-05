/**
 * UDP的socket好比是码头这个是发送的码头
 * 发送码头码头本身不需要写目标码头信息，都是放在集装箱里面的也就数据
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
public class LXUDPSend {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//建立发送码头
		DatagramSocket ds = new DatagramSocket();
		//数据
		String str = "admin";
		//打包数据
		DatagramPacket pt = new DatagramPacket(str.getBytes(),str.getBytes().length,InetAddress.getLocalHost(),9001);
		//发送数据
		ds.send(pt);
		//关闭
		ds.close();
	}

}
