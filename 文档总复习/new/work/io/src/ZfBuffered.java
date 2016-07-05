import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 缓冲输入输出字符流
 * 
 * 输入字符流
 * 输入字符类的 Reader 基类
 * FileReader 输入字符流
 * 
 * 缓冲输入字符流
 * BufferedReader 内部维护了一个缓冲字符数组（也是和字节缓冲一样为了了一个8192字节的缓冲字符数组）。 --这个不但提高了效率而且还拓展了功能，字节缓冲只是提高速度没有扩展功能。
 * 凡是缓冲流，都不具备读写能力，必须依赖于真实的管道。！！！！！！！！
 * 
 * 
 * readLine 如果自定义的readLine 读取一行如何知道是到了一行的末尾
 * 用readLine 读取的时候不会把文件行末尾的/r/n读取出来用getBytes 就可以知道 \r\n ascii表示 13 10
 * 以\r\n结束为表示，逐位比较
 * 
 */

/**
 * @author www.23.com
 *
 */
public class ZfBuffered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BR();
		rL();
	}
	public static void BR(){
		File f = new File("d:/c.txt");
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(f);
			br = new BufferedReader(fr); 
			//System.out.println((char)br.read()); //读取的字符从BufferedReader内部维护的数组读取到的，相当于从内存拿的，所以效率高。
			//用char []缓冲数组也可实现。
			//这个类会常用因为它扩展了功能。
			//readLine() 一次读取一行文本 如果读到文件末尾，返回null。
			String back = "";
			while((back = br.readLine()) != null){
				System.out.println(back);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public static void rL(){
		
		File f = new File("d:/b.txt");
		
		FileReader fr = null;
		
		try {
			fr = new FileReader(f);
			char []bf = new char[1024];
			int l = 0;
			StringBuilder sb = new StringBuilder();
			
			int i = 0;
			
			while((l = fr.read(bf)) != -1){
				for (char c : bf) {
					i++;
					if((int)c != 13 && (int)c != 10){
						sb.append(c);
					}else{
						if((int)c == 13 && (int)bf[i] == 10){
							continue;
						}else{
							if((int)c == 13 || (int)c == 10){
								break;
							}
						}
						
					}
					
				}
				System.out.println(sb);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
