import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * ������������ַ���
 * 
 * �����ַ���
 * �����ַ���� Reader ����
 * FileReader �����ַ���
 * 
 * ���������ַ���
 * BufferedReader �ڲ�ά����һ�������ַ����飨Ҳ�Ǻ��ֽڻ���һ��Ϊ����һ��8192�ֽڵĻ����ַ����飩�� --������������Ч�ʶ��һ���չ�˹��ܣ��ֽڻ���ֻ������ٶ�û����չ���ܡ�
 * ���ǻ������������߱���д������������������ʵ�Ĺܵ�������������������
 * 
 * 
 * readLine ����Զ����readLine ��ȡһ�����֪���ǵ���һ�е�ĩβ
 * ��readLine ��ȡ��ʱ�򲻻���ļ���ĩβ��/r/n��ȡ������getBytes �Ϳ���֪�� \r\n ascii��ʾ 13 10
 * ��\r\n����Ϊ��ʾ����λ�Ƚ�
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
			//System.out.println((char)br.read()); //��ȡ���ַ���BufferedReader�ڲ�ά���������ȡ���ģ��൱�ڴ��ڴ��õģ�����Ч�ʸߡ�
			//��char []��������Ҳ��ʵ�֡�
			//�����᳣����Ϊ����չ�˹��ܡ�
			//readLine() һ�ζ�ȡһ���ı� ��������ļ�ĩβ������null��
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
