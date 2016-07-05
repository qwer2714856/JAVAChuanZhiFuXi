/**
 * 
 */
package net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author www.23.com
 * 
 */
public class LoginClient {

	/**
	 * @param args
	 * @throws IOException
	 * @throws UnknownHostException
	 */
	public static void main(String[] args) throws UnknownHostException,
			IOException {
		// TODO Auto-generated method stub
		frontFunct();

	}

	public static void frontFunct() throws IOException {
		System.out.println("请选择功能 A 登录 B 注册");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String funct = br.readLine();

		System.out.println("请输入用户名");
		String userName = br.readLine();

		System.out.println("请输入密码");
		String password = br.readLine();

		Person p = new Person(userName, password);

		String sendData = funct + '-' + p;

		// 启动客户端socket 发出去
		Socket sk = new Socket(InetAddress.getLocalHost(), 10841);

		// 流向服务器
		OutputStream ot = sk.getOutputStream();

		ot.write(sendData.getBytes());
		
		//通知服务器停止读取
		sk.shutdownOutput();
		
		// 流出后返回相应操作的状态
		InputStream is = sk.getInputStream();
		
		byte [] by = new byte[1024];
		int len = 0;
		while((len = is.read(by)) != -1){
			System.out.println(new String(by,0,len,"UTF-8"));
		}
		
		sk.close();
	}

}

class Person {
	private String userName;
	private String password;

	public Person(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return userName + '-' + password;
	}
}
