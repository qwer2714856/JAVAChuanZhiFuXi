package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class cp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File inFile = new File("D:\\java\\day10\\day20\\��Ƶ\\4.FileOutStreamд����.wmv");
		File outFile = new File("D:\\java\\day10\\day20\\��Ƶ\\tmp\\cp.wmv");
		
		//�ܵ�
		FileInputStream fi = null;
		FileOutputStream fo = null;
		
		//��ȡ
		try {
			//��ȡ�ܵ�
			fi = new FileInputStream(inFile);
			
			//������Ϊʲô��û�м�true����һ��
			//FileOutputStream ����ԭ��
			/**
			 * �ڲ�Ҳ��ά����һ��ָ���
			 * ÿ�´���һ���µ�FileOutputStreamʵ����Ĭ������������´���һ��ָ�룬Ȼ���������ļ������ݣ�ָ���˿�ʼλ�á�
			 * ÿд��һ��ָ�붼��������Ӧ�ƶ���������ʵ����һ��FileOutputStream��������������Դ��ͣ��д�룬Ҳ��������ļ��������������ʵ��FileOutputStream��
			 * ָ��ͻ�ӿ�ʼλ�ã�Ȼ��������ݣ������������FileOutputStreamʵ��ÿ�ζ�����׷����ҪFileOutputStream�ĵڶ���������
			 * 
			 * ���۾���
			 * 1.FileOutputStreamʵ����Ĭ������ļ�ָ��ָ��ͷ�������õڶ�������true,Ҳ��˵�ڶ�����������ʵ������ʱ�������á�
			 * 2.FileOutputStreamʵ����ֻҪû���ͷ���Դ�Ϳ��Բ�ͣ׷�ӣ�����ٴ�FileOutputStreamʵ��û�еڶ��������ͻ����Ŀ���ļ���
			 */
			//д��ܵ�
			fo = new FileOutputStream(outFile);
			
			//��������ȡ
			byte []buf = new byte[1024];
			int len = 0;
			try {
				while((len = fi.read(buf)) != -1){
					//��ȡ��д��
					fo.write(buf, 0, len);//���Ǹ��� �𿴽��ո�int����д��һ���ֽڣ�����ȫ��ֵд�Ͱ�λ�Ķ�����
					System.out.println("writing====");
				}
				System.out.println("writed done");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				throw new RuntimeException(e);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		} finally{
			try {
				//�رչܵ��ȿ��ĺ�أ��󿪵��ȹ�
				if(fo != null){
					fo.close();
				}
				if(fi != null){
					fi.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				throw new RuntimeException(e);
			}
		}
		
	}

}
