/**
 * �ļ��ϲ�
 * ������ ���ֽڵ��ַ�û��
 * SequenceInputStream �������������� ��һЩ���������������ȶ�һ�����ڶ���һ�������������һ��
 * û�����������
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
		// ��ͨ���� A B ���ļ����ݶ�ȡ����Ȼ��ϲ�д��c����ȥ
		
		//ʹ��SequenceInputStream���������Ȼ�����
		FileInputStream fr1 = new FileInputStream(new File("d:/b.txt"));
		FileInputStream fr2 = new FileInputStream(new File("d:/ding.txt"));
		FileOutputStream fw = new FileOutputStream(new File("d:/bc.txt"));
		
		//������������
		SequenceInputStream sq = null;
		//sq = new SequenceInputStream(fr1, fr2);//�����ļ��ϲ�
		//����ļ��ϲ�
		Vector<FileInputStream> vc = new Vector<FileInputStream>();
		vc.add(fr1);
		vc.add(fr2);
		sq = new SequenceInputStream(vc.elements());
		
		byte []by = new byte[1024];
		int len = 0;
		
		while((len = sq.read(by)) != -1){
			fw.write(by,0,len);
		}
		
		sq.close(); //���ȹ�
		fw.close();
		System.out.println("==");
		
	}

}
