/**
 * 写一个TCP的服务端 作为浏览器的服务器
 * 模拟tomcat服务器
 */
package net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author www.23.com
 * 作业编写服务端可以给所有人发送图片 TCP 多线程
 * 注册登录 socket版 TCP的
 * 
 */
public class TCPBrowerServer {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub //这里用单例没意义。
		ServerSocket ssk = TomcatServer.getServerSocket(9815);

		while (true) {//因为在这不停获取socket
			// 获取套接字
			Socket sk = ssk.accept();

			// 如果多个人连接是需要开多线程的。 为每人开一个socket
			SkThread skThreadnew = new SkThread(sk);
			new Thread(skThreadnew, "skThreadnew").start();
		}
	}

}

class TomcatServer {
	private static ServerSocket ssk = null;

	private TomcatServer() {
	};

	public static ServerSocket getServerSocket(int port) throws IOException {
		if (ssk == null) {
			ssk = new ServerSocket(port);
		}
		return ssk;
	}
}

class SkThread implements Runnable {
	private Socket sk;

	public SkThread(Socket sk) {
		this.sk = sk;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			// 读取数据
			InputStream is = sk.getInputStream();// 使用read阻塞
			OutputStream ot = sk.getOutputStream();
			int len = 0;
			byte[] by = new byte[1024];
			// 这样为什么浏览器没有数据，浏览器是使用了TCP协议。
			// 浏览器会检查数据是否正确如果不正确不显示。用火狐测试会闪过。这里需要把头信息写出去。
			ot.write("<html><head></head><body>tes1t</body></html>".getBytes());
		} catch (Exception e) {

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
