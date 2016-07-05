/**
 * 
 */
package merge_file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Vector;

/**
 * @author www.23.com
 *
 */
public class SequenceFile {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String baseImg = "D:/tmp/yato5.jpeg";
		Vector<FileInputStream> vc = new Vector<FileInputStream>();
		for(int i = 0; i < 4; i++){
			vc.add(new FileInputStream(new File(baseImg+i)));
		}
		
		SequenceInputStream sq = new SequenceInputStream(vc.elements());
		FileOutputStream fo = new FileOutputStream(new File("D:/tmp/yato5_bak.jpeg"));
		byte []by = new byte[1024];
		int len = 0;
		while((len = sq.read(by))!=-1){
			fo.write(by,0,len);
		}
		fo.close();
		sq.close();
	}

}
