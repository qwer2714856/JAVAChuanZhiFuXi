import java.io.*;
class trycatch{
	public static void main(String[] args)	throws Exception{
		//�ļ��������ҵ��ļ�
		File file = new File("./aaa.txt");
		//Ȼ�����ܵ�
		FileReader bfi = new FileReader(file);
		//�ӹܵ����������
		BufferedReader br = new BufferedReader(bfi);
		try{
			String str = "";
			while((str = br.readLine()) != null){
				System.out.println(str);
			}
		}catch(IOException e){
			
		}finally{
			try{
				br.close();
				bfi.close();
				System.out.println("�ͷ���Դ�ɹ�");
			}
			catch(IOException e){
				System.out.println("�ͷ���Դʧ��");
			}
	   }
	}
}
 