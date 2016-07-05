/**
 * 
 */
package net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author www.23.com
 *
 */
public class FXDescription {

	/**
	 * @param args
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		/*InetAddress ia = InetAddress.getLocalHost();
		System.out.println(ia.getHostName());
		System.out.print(ia.getHostAddress());*/
		
		InetAddress ia = InetAddress.getByName("192.168.1.114");
		System.out.println(ia.getHostAddress());
	}

}
