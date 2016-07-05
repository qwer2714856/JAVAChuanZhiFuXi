/**
 * 多线程群聊
 */
package net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * @author www.23.com
 * 
 */
public class QFThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sender sr = new Sender();
		new Thread(sr, "sender").start();

		Geter gr = new Geter();
		new Thread(gr, "geter").start();
	}

}

/**
 * 发送端
 * 
 * @author www.23.com
 * 
 */
class Sender implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		DatagramSocket ds = null;
		try {
			ds = new DatagramSocket();
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		try {
			while ((str = br.readLine()) != null) {
				// packet
				str = fQData(str);
				DatagramPacket dp = new DatagramPacket(str.getBytes(),
						str.getBytes().length,
						InetAddress.getByName("192.168.1.255"), 2426);
				ds.send(dp);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			ds.close();
		}

	}

	public static String fQData(String str) {
		StringBuilder sb = new StringBuilder();
		sb.append("1.0:");
		sb.append(System.currentTimeMillis() + ":");
		sb.append("xiaoming:");
		sb.append("192.168.1.1:");
		sb.append("32:");
		sb.append(str);

		return sb.toString();
	}

}

class Geter implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		DatagramSocket ds = null;

		try {
			ds = new DatagramSocket(2426);
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		byte[] by = new byte[1024];
		DatagramPacket dp = new DatagramPacket(by, by.length);

		try {	
			while (true) {
				ds.receive(dp);
				System.out.println(dp.getAddress().getHostAddress() + ":" + new String(by, 0, dp.getLength()));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			ds.close();
		}

	}

}
