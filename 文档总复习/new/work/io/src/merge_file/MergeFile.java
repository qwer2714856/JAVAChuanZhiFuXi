/**
 * 文件合并
 * 序列流 能字节的字符没有
 * SequenceInputStream （序列输入流） 把一些输入流串起来，先读一个流在读另一个流，多个流串一起。
 * 没有序列输出流
 */
package merge_file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Vector;

/**
 * @author www.23.com
 * 
 */
public class MergeFile {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 普通做法 A B 的文件内容读取出来然后合并写到c里面去
		
		//使用SequenceInputStream串联多个流然后读出
		FileInputStream fr1 = new FileInputStream(new File("d:/b.txt"));
		FileInputStream fr2 = new FileInputStream(new File("d:/ding.txt"));
		FileOutputStream fw = new FileOutputStream(new File("d:/bc.txt"));
		
		//建立输入序列
		SequenceInputStream sq = null;
		//sq = new SequenceInputStream(fr1, fr2);//两个文件合并
		//多个文件合并
		Vector<FileInputStream> vc = new Vector<FileInputStream>();
		vc.add(fr1);
		vc.add(fr2);
		sq = new SequenceInputStream(vc.elements());
		
		byte []by = new byte[1024];
		int len = 0;
		
		while((len = sq.read(by)) != -1){
			fw.write(by,0,len);
		}
		
		sq.close(); //后开先关
		fw.close();
		System.out.println("==");
		
	}

}
