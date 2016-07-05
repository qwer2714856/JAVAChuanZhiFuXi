/**
 * 
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
public class TcpClients {

	/**
	 * @param args
	 * @throws IOException
	 * @throws UnknownHostException
	 */
	public static void main(String[] args) throws UnknownHostException,
			IOException {
		// TODO Auto-generated method stub
		// 创建socket服务
		Socket sk = new Socket(InetAddress.getLocalHost(), 65530);
		// 发送数据
		OutputStream op = sk.getOutputStream();
		op.write("client to server".getBytes());
	 
		//拿服务器数据
		InputStream is = sk.getInputStream();
		byte []by = new byte[1024];
		int len = is.read(by);
		System.out.print(new String(by,0,len));
		
		sk.close();
	}

}
