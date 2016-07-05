/**
 * TCP 发图片服务器端
 */
package net;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 * @author www.23.com
 * 
 */
public class TCPImageServer {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket ssk = new ServerSocket(9812);

		// 从客户端获取套接字
		while (true) {
			FileInputStream fl = new FileInputStream(new File(
					"C:\\Users\\www.23.com\\Desktop\\yato5.jpeg"));
			Socket sk = ssk.accept();
			OutputThread ot = new OutputThread(sk, fl);
			new Thread(ot, "ot").start();

		}

	}
}

class OutputThread implements Runnable {
	private Socket sk;
	private FileInputStream fl;

	public OutputThread(Socket sk, FileInputStream fl) {
		this.sk = sk;
		this.fl = fl;
	}

	@Override
	public void run() {
		try {
			synchronized ("lock") {
				// TODO Auto-generated method stub
				// 向客户端输出套接字
				OutputStream op = sk.getOutputStream();
				// 直接写出去
				byte by[] = new byte[1024];
				int len = 0;
				while ((len = fl.read(by)) != -1) {
					op.write(by, 0, len);
				}
			}

		} catch (Exception e) {

		} finally {
			try {
				fl.close();
				sk.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}