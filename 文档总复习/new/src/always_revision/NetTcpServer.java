package always_revision;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class NetTcpServer {
	public static void main(String []args){
		/*ServerSocket sc = null;
		try {
			sc = new ServerSocket(3309);
			Socket sac = sc.accept();//线程阻塞
			InputStream is = sac.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String tmp = "";
			while((tmp = br.readLine()) != null){
				System.out.println(tmp);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			if(sc != null){
				try {
					sc.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}*/
		//建立服务端
		ServerSocket sk = null;
		try {
			sk = new ServerSocket(9503);
			while (true) {
				//不断的获取客户端套接字
				Socket sks = sk.accept();
				new SocketClient(sks).start();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			if(sk != null){
				try {
					sk.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
}
class SocketClient extends Thread{
	private Socket sk = null;
	private BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
	public SocketClient(Socket sk) {
		this.sk = sk;
	}
	public void run(){
		try {
			InputStream is = sk.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String tmp = null;
			while((tmp = br.readLine()) != null){//线程等待
				System.out.println(sk.getInetAddress().getHostAddress() + ":" + tmp);
			}
			System.out.println("please write...");
			//回复客户端消息
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(sk.getOutputStream()));
			bw.write(sc.readLine());
			bw.newLine();
			bw.flush();
			sk.shutdownOutput();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				sk.close();//关闭客户端的连接
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

