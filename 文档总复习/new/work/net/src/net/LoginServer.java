/**
 * 登录 服务器端
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
public class LoginServer {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket ssk = new ServerSocket(10841);

		// 得到客户端的套接字
		while (true) {
			Socket sk = ssk.accept();

			Funct fc = new Funct(sk);
			new Thread(fc, "fc").start();
		}
	}

}

class Funct implements Runnable {
	private Socket sk;

	public Funct(Socket sk) {
		this.sk = sk;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		// get client data
		try {
			InputStream is = sk.getInputStream();

			byte[] by = new byte[1024];
			int len = 0;
			StringBuilder sb = new StringBuilder();

			while ((len = is.read(by)) != -1) {
				sb.append(new String(by, 0, len));
			}

			String[] data = sb.toString().split("-");
			String backData = "";
			if ("a".equalsIgnoreCase(data[0])) {
				// 登录的
				backData = "登录的";
			} else if ("b".equalsIgnoreCase(data[0])) {
				// 注册的
				backData = "注册的";
			}

			// 紧接着我要写出去
			OutputStream ot = sk.getOutputStream();
			ot.write(backData.getBytes("UTF-8"));
			sk.shutdownOutput();// 让客户端停止循环读取，其实这里不加也行下面就close

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				sk.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}