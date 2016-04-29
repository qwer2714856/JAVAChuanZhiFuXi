package always_revision;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Arrays;

public class NetUdp {
	public static void main(String [] args){
		DatagramSocket ds = null;
		try {
			//建立收获的码头 port 收获的门号
			ds = new DatagramSocket(3305);
			//建立接收数组
			byte [] by = new byte[1024];
			//建立数据包
			DatagramPacket dp = new DatagramPacket(by,0,by.length);
			//从码头拿货
			while(true){
				ds.receive(dp);
				//货已经在dp里面了
				System.out.println(new String(dp.getData(),0,dp.getData().length));
			}
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			if(ds != null){
				ds.close();
			}
		}
	}
}
