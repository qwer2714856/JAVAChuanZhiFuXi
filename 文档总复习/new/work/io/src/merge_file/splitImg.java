/**
 * ÎÄ¼þ·Ö¸î
 */
package merge_file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author www.23.com
 *
 */
public class splitImg {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String basePath = "D:/tmp/yato5.jpeg";
		
		byte []by = new byte[5120];
		int len = 0;
		FileInputStream fi = new FileInputStream(new File("D:/tmp/yato5.jpeg"));
		for(int i = 0; i < 4; i++){
			
			FileOutputStream f = new FileOutputStream(new File(basePath+i));
			len = fi.read(by);
			f.write(by, 0, len);
			f.close();
		}
		fi.close();
		
	}

}
