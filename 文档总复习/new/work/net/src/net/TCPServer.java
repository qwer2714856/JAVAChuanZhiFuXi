/**
 * 
 */
package net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author www.23.com
 * 
 */
public class TCPServer {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 建立服务监听端口
		ServerSocket ssk = new ServerSocket(9815);
		// 获取客户端的socket 阻塞型的方法，没有客户端与其连接就等待。
		Socket sk = ssk.accept();
		// 读取数据,获取输入流读取客户端发送的消息
		InputStream is = sk.getInputStream();
		byte[] buf = new byte[1024];
		int length = 0;
		length = is.read(buf);
		System.out.println("服务端接收："+ new String(buf,0,length));
		
		//回复数据
		OutputStream op = sk.getOutputStream();
		op.write("admin".getBytes());
		
		ssk.close();
	}

}
