package fx;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TestB {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		ServerSocket ssk = new ServerSocket(1809);
		
		Socket sk = ssk.accept();
		
		byte []by = new byte[1024];
		int len = 0;
		InputStream is = sk.getInputStream();
		while((len = is.read(by)) != -1){
			System.out.println(new String(by,0,len));
		}
		
		sk.close();
	}

}
