/**
 * 
 */
package net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author www.23.com
 * 
 */
public class TcpFQServer {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket ssk = new ServerSocket(9522);

		// 获取套接字
		Socket sk = ssk.accept();

		// 获取客户端来的数据
		BufferedReader br = new BufferedReader(new InputStreamReader(
				sk.getInputStream()));

		String str = "";

		while ((str = br.readLine()) != null) {
			System.out.println(str);

			// 回复客户端
			// 获取输出管道
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
					sk.getOutputStream()));
			// 从键盘录入
			BufferedReader brs = new BufferedReader(new InputStreamReader(
					System.in));

			String line = brs.readLine();

			line += "\r\n";
			bw.write(line);
			bw.flush();
		}

		ssk.close();
	}

}
