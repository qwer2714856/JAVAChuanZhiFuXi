/**
 * 
 */
package net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @author www.23.com
 *
 */
public class LXUDPGet {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DatagramSocket ds = new DatagramSocket(9001);
		
		byte [] by = new byte[1024];
		DatagramPacket pt = new DatagramPacket(by,by.length);
		
		ds.receive(pt);
		
		System.out.println(new String(by,0,pt.getLength()));
	}

}
