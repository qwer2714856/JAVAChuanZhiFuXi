/**
 * java 网络编程
 * URL请求远程接口
 * 
 * socket编程
 * 计算网络，将分布在不同地域的计算机通过外部设备将它们组织在一起，实现资源共享和数据传输。
 * 
 * 子网掩码
 * 就是将IP地址划分为网络地址和主机地址的，单独用没有意义，和IP一起用
 * 
 * ip 地址
 * 简单说就是结点实际地址
 * 
 * 网络地址 (network address) 是一个逻辑的地址 例如 192.168.1.50 子网掩码是255.255.255.0 将ip和子网掩码按位与得到 那么它的逻辑地址就是192.168.1.0
 * 
 * 广播地址 是对整个网段的所有用户发送广播 这个只有UDP 有用 192.168.1.20 子网掩码是255.255.255.0 广播地址是192.168.1.255(255就是广播地址) 自己的ip没有办法设置0，255 0，255是预留的
 * 
 * IP 地址长度是32位， 4字节， 分为4段， 每段8位 每段用十进制数字显示。
 * 0-255.0-255.0-255.0-255
 * IP的分类
 * A 8位网络号24位主机号 255.0.0.0
 * 一个A类IP地址由1字节（每个字节是8位）的网络地址和3个字节主机地址组成，网络地址的最高位必须是“0”,即第一段数字范围为1～127。每个A类地址可连接16387064台主机，Internet有126个A类地址。
 * 这里为什么是126个？是因为127.x.x.x 所有的都代表本机是个预留的
 * 
 * B 16位网络号16位主机号 255.255.0.0
 * 一个B类IP地址由2个字节的网络地址和2个字节的主机地址组成，网络地址的最高位必须是“10”，即第一段数字范围为128～191。每个B类地址可连接64516台主机，Internet有16256个B类地址。 
 * 
 * C 24位网络号8位主机号 255.255.255.0
 * 一个C类地址是由3个字节的网络地址和1个字节的主机地址组成，网络地址的最高位必须是“110”，即第一段数字范围为192～223。每个C类地址可连接254台主机，Internet有2054512个C类地址。
 * 
 * D类地址用于多点播送。 
 * 第一个字节以“1110”开始，第一个字节的数字范围为224～239，是多点播送地址，用于多目的地信息的传输，和作为备用。全零（“0.0.0.0”）地址对应于当前主机，全“1”的IP地址（“255.255.255.255”）是当前子网的广播地址。 
 * 
 * E类地址 
 * 以“11110”开始，即第一段数字范围为240～254。E类地址保留，仅作实验和开发用。 
 * 
 * 几种特殊的IP地址
 * 192.168.1.0 这个代表网络地址
 * 192.168.1.255 广播地址
 * 127.x.x.x 本地回环测试侧本地网络是否通，x.x.x 不能全是0也不能全是255 127.0.0.0 127.255.255.255 是不允许的
 * 
 * 
 * Internet的设计者也不清楚它会怎样发展。
 * 一些人设想一个Internet会是包含有许多主机的几个网。
 * 另一些人则预言有许多的网而每一个网上的主机并不太多，作为折中， Internet的地址是适合大网和小网的。
 * 它们被确定为32位但有三种类型。地址是自定义的，它的最高位定义地址的类型。
 * A类地址支持多个主机在一个网：最高位为0，跟随有7bit网络部份和24bii主机部份。
 * 在B类地址，最高位是非0，跟随有14bit网络号和16bii主机号。
 * C类地址以110开始，跟随有2lbit网络号和8bit主机号。按常规，Internet地址由加点的字符给出。
 * 地址由四部份10进制数组成，用点作分隔。例如，10．0，0．51和128.10.2.1分别是A类和B类的Internet地址。
 * 
 * 
 * Port 地址
 * 如果说一个IP地址是现实世界中一个房子的地址，port就是房子的门，一个房子有多个门，每个门就是一个口port
 * port 的范围是0-65535（2^16 - 1）  端口存在占用问题所以要避免占用一些服务端口。
 * 0-1023 一些服务的端口 自己的端口不要定义在这个范围！！！
 * 1024-49151 松散服务端口 一般定义在这个范围
 * 49152-65535 私有端口
 * 
 * windows netstat -ano  taskkill /F /PID
 * linux   netstat -anp  kill -9 progress id
 * 
 * 常用的一些端口 
 * 21 ftp
 * 22 ssh
 * 433 https
 * 80  http
 * 8080 tomcat
 * 等等
 * 
 * 网络的两种协议（传输层协议）
 * 
 * UDP
 * 面向无连接，不可靠，传输的是数据包，大小限制64K内
 * 案例 魔兽世界 对讲机
 * 
 * TCP
 * 传输的字节码，面向连接，可靠协议，传输内容大小没有限制
 * 案例 电话
 * 建立连接需要
 * 三次握手
 * 客户端											服务器
 * 1											2
 * 我要连接你你同意吗？（进入等待）						同意你连接吧（发出消息进行等等）
 * 3											4
 * 开始发数据										响应
 * 5
 * 得到数据
 * 这样一次的连接加收发消息就结束了
 * 
 * 客户端和服务器都存在一个发送后等待，所以这个等待就所谓的超时时间。客户端连接多久后没有效应就超时，服务器没有接到消息多久就超时
 * 这个是连接超时
 * 
 * 如果连接上了还有个会话超时
 * 
 * 
 * 
 * 
 * 通信的三个要素
 * 协议
 * port
 * ip
 * 
 * 
 * java 网络编程
 * 实现局域网或互联网之间的通信
 * Java 编程的三要素
 * 协议，Ip port
 * Java的网络包是java.net.*
 * 对象的映射
 * ip  主机名 有ip对象
 * 端口 数字表示 没有封装
 * 
 * InetAddress 对象
 * 这些方法都是静态的 返回值都是InetAddress
 * getLocalHost();
 * getByName(String Host); 通过一个ip字符串找对应主机，如果不存在解析不了对应地址，而且显示为对应Ip且 查询很慢。
 * getAllByName(String Host);通过域名查找所有的绑定IP 返回的是数组InetAddress
 * InetAddress 实例有
 * getHostAddress(); ip地址
 * getHostName();    主机名
 * 
 * Socket(套接字) 网络编程
 * 不同协议Java有不同的对象套接字
 * UDP 这个不分服务端和客户端就是一个收一个发反之亦然
 * DatagramSocket DatagramPacket
 * TCP
 * ServerSocket Socket
 * 
 * 
 * 
 * socket 可以想成一个插座 一个口，数据从这进，从这出去。（TCP 是这样的一个进出都在一个口上）（UDP的话应该有个人  口用来发数据包 耳朵用来接收数据包 ）
 * 插座  ->  插座
 * 	   <-
 * 
 * UDP的 DatagramSocket DatagramPacket
 * 发送端和接收端是两个独立运行的程序
 * 发送端的接口是随机的
 * 
 * 
 * 
 * TCP 的数据通信
 * ServerSocket Socket
 * 建立服务端和客户端
 * 建立后，Socket使用io流进行数据的传输
 * 原理就是服务端获取客户端的套接字
 * 然后对套接字的输入输出控制。
 * 注意一个问题
 * 任意一端的read都会造成线程等待
 * 服务端的socket也会线程等待
 * 任意一端写完了就要shutdownOutput 否则容易造成另一端一直等待
 * 
 * 
 * socket服务端可以接收http发过来请求，说白了http 协议 底层也是tcp协议。 http是应用层的协议，tcp是传输层的协议。
 * 
 * 建立socket 也要关闭socket
 * 
 */
package always_revision;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.sun.corba.se.spi.activation.Server;
/**
 * @author www.23.com
 *
 */
public class Net {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//发送 GET 请求
        /*String s=HttpRequest.sendGet("http://qd.cityhouse.cn", "key=123&v=456");
        System.out.println(s);*/
        
        //发送 POST 请求
		/*while (true) {
			String sr = HttpRequest.sendPost(
					"http://passport.9wee.com/app/login.php?ac=login",
					"username=123&password=456");
			//System.out.println(sr);
		}*/
		
		/*for(int i = 0; i < 50011; i++){
			new T().start();
		}*/
		
		
		/**
		 * InetAddress 对象
		 */
		/*InetAddress [] ia;
		try {
			ia = InetAddress.getLocalHost();
			System.out.println(ia.getHostAddress());
			System.out.println(ia.getHostName());
			
			ia = InetAddress.getByName("192.168.1.1");
			System.out.println(ia.getHostName());
			System.out.println(ia.getHostAddress());
			//不需要带http
			ia = InetAddress.getAllByName("qd.cityhouse.cn");
			for(InetAddress i : ia){
				System.out.println(i.getHostAddress());
				System.out.println(i.getHostName());
			}
			 
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		
		/**
		 * UDP建立包和发送包
		 * DatagramSocket
		 * DatagramPacket
		 */
		//建立和发送数据包
		/*DatagramSocket ds = null;
		try {
			//建立数据包
			//创建码头
			ds = new DatagramSocket();
			//要发送的数据
			byte [] by ={97,98,99,100};
			//将要发送的数据打包为数据包发出去 InetAddress.getByName("192.168.1.255") 广播出的，只有UDP有这个
			DatagramPacket dp = new DatagramPacket(by,0,by.length,InetAddress.getByName("192.168.1.255"),3305);
			//将打包的数据包从码头发出去
			ds.send(dp);
			
			
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			//关闭码头
			if(ds != null){
				ds.close();
			}
		}*/
		
		//TCP的客户端
		/*Socket sk = null;
		try {
			sk = new Socket(InetAddress.getByName("192.168.1.105"),3309);
			OutputStream os = sk.getOutputStream();
			String tmp = "admin";
			Thread.sleep(10000);
			os.write(tmp.getBytes());
		} catch (Exception e) {
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
		}*/
		
		talkAbout();
	}

	public static void talkAbout() {
		Socket sk = null;
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			try {
				sk = new Socket(InetAddress.getByName("192.168.1.105"), 9503);
				// 拿到写入流
				BufferedWriter os = new BufferedWriter(new OutputStreamWriter(
						sk.getOutputStream()));// 如果是utf-8接就不用转了，windowscmd默认是GBK所以转一下
				// sc.next() 默认是根据当前项目编码来的默认是utf-8的所以转GBK就错了，它和直接 “测试中文”
				// 不一样，这个是用GBK发出去，sc.next()是UTF-8在用GBK转出去所以错了
				os.write(sc.readLine());// 因为默认是utf-8转GBK就错了所以只能发英文
				os.newLine();
				os.flush();
				sk.shutdownOutput();// !!!这个是重点否则容易造成死等待 写完了就关闭写出流服务端的读入流也就自动关了
				System.out.println("==读服务端回复==");

				// 读取服务端的数据
				BufferedReader br = new BufferedReader(new InputStreamReader(
						sk.getInputStream()));
				String tmp = null;
				while ((tmp = br.readLine()) != null) {// 线程等待
					System.out.println(tmp);
				}

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				if (sk != null) {
					try {
						sk.close();// 关闭和服务器的连接
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}
}

class HttpRequest {
    /**
     * 向指定URL发送GET方法的请求
     * 
     * @param url
     *            发送请求的URL
     * @param param
     *            请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
     * @return URL 所代表远程资源的响应结果
     */
    public static String sendGet(String url, String param) {
        String result = "";
        BufferedReader in = null;
        try {
            String urlNameString = url + "?" + param;
            URL realUrl = new URL(urlNameString);
            // 打开和URL之间的连接
            URLConnection connection = realUrl.openConnection();
            // 设置通用的请求属性
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            // 建立实际的连接
            connection.connect();
            // 获取所有响应头字段
            Map<String, List<String>> map = connection.getHeaderFields();
            // 遍历所有的响应头字段
            for (String key : map.keySet()) {
                System.out.println(key + "--->" + map.get(key));
            }
            // 定义 BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(
                    connection.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println("发送GET请求出现异常！" + e);
            e.printStackTrace();
        }
        // 使用finally块来关闭输入流
        finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return result;
    }

    /**
     * 向指定 URL 发送POST方法的请求
     * 
     * @param url
     *            发送请求的 URL
     * @param param
     *            请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
     * @return 所代表远程资源的响应结果
     */
    public static String sendPost(String url, String param) {
        PrintWriter out = null;
        BufferedReader in = null;
        String result = "";
        try {
            URL realUrl = new URL(url);
            // 打开和URL之间的连接
            URLConnection conn = realUrl.openConnection();
            // 设置通用的请求属性
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            /*conn.setConnectTimeout(1000000);
            conn.setRequestProperty("X-Forwarded-For","112.211.111.125");*/
            // 发送POST请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);
            // 获取URLConnection对象对应的输出流
            out = new PrintWriter(conn.getOutputStream());
            // 发送请求参数
            out.print(param);
            // flush输出流的缓冲
            out.flush();
            // 定义BufferedReader输入流来读取URL的响应
            in = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println("发送 POST 请求出现异常！"+e);
            e.printStackTrace();
        }
        //使用finally块来关闭输出流、输入流
        finally{
            try{
                if(out!=null){
                    out.close();
                }
                if(in!=null){
                    in.close();
                }
            }
            catch(IOException ex){
                ex.printStackTrace();
            }
        }
        return result;
    }    
}
class T extends Thread{
	public void run(){
		while (true) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			HttpRequest.sendPost(
					"http://passport.9wee.com/app/login.php?ac=login",
					"username="+Math.random()+"&password=456"+Math.random());
			//System.out.println(sr);
		}
	}
}
