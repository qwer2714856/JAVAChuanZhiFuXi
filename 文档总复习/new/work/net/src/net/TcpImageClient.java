/**
 * 
 */
package net;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author www.23.com
 *
 */
public class TcpImageClient {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket sk = new Socket(InetAddress.getByName("192.168.1.114"),9812);
		
		InputStream ips = sk.getInputStream();
		FileOutputStream ops = new FileOutputStream(new File("d:/hi4.jpeg"));
		
		byte[] by = new byte[1024];
		int len = 0;
		
		while((len = ips.read(by)) != -1){
			//write to myself local 
			ops.write(by,0,len);
		}
		
		ops.close();
		sk.close();
	}

}
