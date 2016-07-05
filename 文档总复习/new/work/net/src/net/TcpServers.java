/**
 * 
 */
package net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author www.23.com
 * 
 */
public class TcpServers {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 创建服务端
		ServerSocket ssk = new ServerSocket(65530);
		// 获取客户端的套接字
		Socket sk = ssk.accept();
		// 根据客户端的套接字来获取数据
		InputStream is = sk.getInputStream();
		// 获取数据
		byte [] by = new byte[1024];
		int len = is.read(by);
		System.out.println(new String(by,0,len));
		
		//回复客户端
		OutputStream ot = sk.getOutputStream();
		ot.write("server got it".getBytes());
		
		ssk.close();
	}

}
