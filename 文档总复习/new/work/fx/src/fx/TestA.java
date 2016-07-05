package fx;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class TestA {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		Socket sk = new Socket(InetAddress.getLocalHost(),1809);
		
		OutputStream ot = sk.getOutputStream();
		
		ot.write("hi server".getBytes());

		Thread.sleep(10000);
		
		System.out.println("close");
		
		sk.close();
		
	}

}
