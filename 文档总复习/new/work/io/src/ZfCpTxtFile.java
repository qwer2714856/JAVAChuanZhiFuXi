import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 拷贝文本文件
 */

/**
 * @author www.23.com
 *
 */
public class ZfCpTxtFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fi = new File("d:/cc.txt");
		File fo = new File("d:/cc_cp.txt");
		
		FileReader fri = null;
		FileWriter fwo = null;
		
		try {
			fri = new FileReader(fi);
			fwo = new FileWriter(fo);
			
			char [] buf = new char[1024];
			int l = 0;
			
			while((l = fri.read(buf)) != -1){
				fwo.write(buf, 0, l);
			}
			System.out.println("ok");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		} finally{
			if(fwo != null){
				try {
					fwo.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					throw new RuntimeException(e);
				} finally{
					if(fri != null){
						try {
							fri.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							throw new RuntimeException(e);
						}
					}
				}
			}
		}
		
		
	}

}
