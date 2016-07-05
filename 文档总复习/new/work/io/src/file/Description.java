/**
 * IO ��
 * input output ���������
 * ��Ҫ���������ڽ�����豸���롾�豸��֮��Ĵ������� �����ڴ� �� Ӳ��  ֮��Ĵ��� ���� �� �ڴ�
 * Ӧ�õĳ��� ����˵��
 * ���������ļ��ϴ������� socket �ܵ�ͨ��   android��һЩ���ݶ��Ǳ�����xml�ϵģ�����xml�ļ���
 *
 * һ���������Ժ�����ʽ���浽Ӳ���ϵģ������ļ�����ġ�
 * 
 * �����ļ� File�� �����ļ������ļ��е�
 * 
 * File��
 * 
 * ���췽��
 * File(File parent, String child) ��ʱ����Ҫ�ڱ�����ʱ����Ҫ��׼Ŀ¼�ڲ�����Ŀ¼����Ŀ¼��������Ŀ¼
 * ��·������   ��·���ַ���  ��һ���͵������õ�һ���Ƚ����á���Ϊ��·���Ǹ�������Ե�һЩ������
 * 
 * File(String pathname) ·���ǳ���Ŀ��ܴ���Ҳ���ܲ����ڵ�  
 * ͨ��������·�����ַ���ת��Ϊ����·����������һ���� File ʵ����
 * ָ��·���ַ������ļ������ļ���·����ת��Ϊ·������file����
 * 
 * File(String parent, String child)  �͹���һ��ֻ�����ַ�·�������ַ���
 * ��·���ַ���   ��·���ַ���
 * 
 * Ŀ¼�ָ��������
 * Ŀ¼�ָ��--��ƽ̨�����ã���windows�ķָ���ǲ�����linux���õ� ���� \ / windows��/дһ�� \\д������ /��linux��  
 * File.separator ��������֪����linux����windows������Ϊ��ͬƽ̨��������ǲ�һ���ġ�
 * 
 * ����
 * file��������ķ���
 * 
 * file.exists();                     �������true����false
 * 
 * file.getAbsolutePath()             ����fileָ����·���ľ���·��--java����������ÿɿ���ǰ�����ļ��ľ���·�� File(".") ��������鿴
 * 
 * ����
 * boolean createNewFile()  --throws IOException���ҽ��������ھ��д˳���·����ָ�����Ƶ��ļ�ʱ�����ɷֵش���һ���µĿ��ļ���
 * boolean mkdir()								�����˳���·����ָ����Ŀ¼��
 * boolean mkdirs()								�����˳���·����ָ����Ŀ¼���������б��赫�����ڵĸ�Ŀ¼��
 * boolean renameTo(File dest)					���������˳���·������ʾ���ļ���
 * 
 * 
 * ɾ���ķ���
 * boolean delete() 							ɾ���˳���·������ʾ���ļ���Ŀ¼�������·������ʾһ��Ŀ¼�����Ŀ¼����Ϊ�ղ���ɾ���� ���ҽ����ɹ�ɾ���ļ���Ŀ¼ʱ������ true�����򷵻� false
 * void deleteOnExit()							 ���������ֹʱ������ɾ���˳���·������ʾ���ļ���Ŀ¼��
 * 
 * �жϵķ���
 * boolean	exists()							�ļ��Ƿ����
 * boolean	isFile()							�Ƿ����ļ�
 * boolean	isDirectory()						�Ƿ���Ŀ¼
 * boolean	isHidden()							�Ƿ������ļ����ļ���
 * boolean	isAbsolute()						�Ƿ��Ǿ���·��
 * 
 * ��ȡ�ķ���
 * getName()									��ȡ�ļ����ļ�����  d:\\sdfsf.txt  sdfs.txtΪ�ļ��� �ļ�������Ҳ�ܻ�ȡ�ļ���,ֱ��splitȡ���һ����û���ж��Ƿ���ڡ�
 * getPath() 									��ȡ����·��������file��ʲô�ͷ���ʲô���ٵ�
 * getAbsolutePath() 							��ȡ����·�����㴫ʲô���ڵ�ǰ·�����㴫��·��ƴ�ӣ����署File f = new File("..\\dsd.txt"); ����õ����ǵ�ǰ�����ļ��ľݶ�·��+�㴫�����·��
 * getParent() 									��ȡ��·��File f = new File("..\\..\\cc.txt"); ���ص���..\\..\\
 * lastModified()								��ȡ���һ�ε��޸�ʱ�� ���ص���ʱ��� ���� ����·���ľ���0
 * length() 									��ȡ�ļ��ֽڴ�С �ֽ�Ϊ��λ --����ļ������ھ���0
 * ���涼���ж��ļ��Ƿ����
 * 
 * �ļ��ķ��� -- ָ��Ŀ¼�����쳣
 * static listRoots() 							�г��������и�Ŀ¼ ���ص���File ���� ����ʵ����comparable�ӿڿ���ʹ��for ��ǿ
 * list()										�г�ָ��Ŀ¼�ļ����ļ�����������string [] 	 ע�������ļ����ݹ�	 �������ص�Ҳ���г���								
 * listFiles() 									�г�ָ��Ŀ¼���ļ����ļ� ������ļ��˲������� ����File [] ע�������ļ����ݹ飬�������ص�,��ȡָ��Ŀ¼�� ���ļ��к��ļ�  �Ķ�������
 * list listFiles ����ʹ��listFiles
 * 
 * list(fileName filter) 						���� fileName filter�ļ���������  �Զ����������Ҫ��Ҫʵ��FilenameFilter
 * listFiles(fileName filter)					���� fileName filter�ļ��������� �Զ����������Ҫʵ��FilenameFilter
 * 
 * ·������
 * ����·�� 		���ļ���Ӳ�̵�����·�� ���̷���ͷ
 * ���·��		��Դ�ļ�����ڵ�ǰ�������ڵ�·��  . ��ǰ·��  ..��һ��·��   ��ע�⣡�����������ļ�����Դ�ļ�����ͬһ���̷����޷����ʡ�
 * classpath ·��
 * web ·��
 * 
 * 
 * io ����Դ�ر�ԭ���ȿ��ĺ�أ��󿪵��ȹء���������ر�
 * 
 */
package file;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Description {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//file ��������������ļ��Ķ���
		//File filefk = new File("d:\\");
		//File file = new File(filefk,"cc.txt");//��һ��������Ŀ¼���󣬵ڶ��������ַ�����·��
		//File file = new File("d:\\", "cc.txt"); //�ݹ����Ŀ¼�����ù̶�Ŀ¼������Ŀ¼
		//System.out.print(file.exists());
		
		//Ŀ¼�ָ��--��ƽ̨�����ã���windows�ķָ���ǲ�����linux���õ� ���� \ windows /��linux��
		//System.out.print(File.separator);
		
		/*File file = new File(".");
		System.out.println(file.getAbsolutePath());//���ص�ǰ�������ڵľ���·��
		
		File file2 = new File(file.getAbsolutePath()+"../../../../../cc.txt");
		System.out.println(file2.exists());*/
		
		
		//�����ļ�
		
		//�����ļ�
		//�ڲ����ڵ�Ŀ¼�����ļ��ͱ���  ������ļ����ھͲ��������� false �����ڴ�������true �ɹ�����true ����false
		/*File files = new File("d:\\javaFunctionCreate\\a.txt");
		try {
			System.out.println(files.createNewFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		//�����ļ��� --�м�������ڲ����ڵ�Ŀ¼������false���Ŀ���ļ��д��ڷ���false ���������ļ��� �ɹ�����true ����false
		/*File files = new File("d:\\javaFunctionCreate\\mkdir\\mkdir");
		System.out.println(files.mkdir());*/
		
		//�ݹ鴴�������ڵ��ļ��� ���Ŀ���ļ��д��ڷ���false �����༶�ļ��� �ɹ�����true ����false
		/*File files = new File("d:\\javaFunctionCreate\\mkdir\\mkdir");
		System.out.println(files.mkdirs());*/
		
		//�������ļ� @param File dest ������һ��file���� ����������������� ���������ƶ� û�гɹ���false �ɹ�����true ����false
		//��files���ƶ���files2������������ȥ���ͬĿ¼��������������������ƶ�  ���������Զ��ļ��в������ƶ����ܶ��ļ��в���
		/*File files = new File("d:\\javaFunctionCreates");
		File files2 = new File("d:\\javaFunctionCreate");
		System.out.println(files.renameTo(files2));*/
		
		//����ɾ���ļ��к��ļ��������ļ��б����ǿյ� �ɹ�����true ����false ����ɾ
		/*File files = new File("d:\\javaFunctionCreate");
		System.out.println(files.delete());*/
		
		//deleteOnExit jvm�˳���ʱ��ɾ���ļ� ��deleteһ������ɾ�������ݵ��ļ��� ����void  �˳�ɾ�� �൱����������һ������ɾ����ʱ�ļ�
		/*File files = new File("d:\\javaFunctionCreate\\a.txt");
		files.deleteOnExit();*/
		
		/*File f = new File("d:\\cc.txt");
		System.out.println(f.lastModified());
		Date d = new Date(f.lastModified());
		System.out.println(d);
		SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sm.format(d));*/
		
		//�ļ��еķ���
		//�г����еĸ�Ŀ¼
		//System.out.print(File.listRoots());
		/*for(File p:File.listRoots()){
			System.out.println(p.getPath());
		}*/
		
		//�г�ָ��Ŀ¼�����ļ����ļ���
		/*File f = new File("d:\\");
		for(String name:f.list()){
			System.out.println(name);
		}*/
		
		//��ȡָ��Ŀ¼�� ���ļ��к��ļ�  �Ķ�������
		/*File f = new File("d:\\");
		for(File fc:f.listFiles()){
			System.out.println(fc.getAbsolutePath());
		}*/
		/*System.out.print(new File("").lastModified());*/
		
		File [] fl = new File("D:\\javaFunctionCreate\\").listFiles(new MyFilter());
		for(File fls:fl){
			System.out.println(fls.getAbsolutePath());
		}
	}

}

class MyFilter implements FilenameFilter{

	@Override
	/**
	 * @param dir�ļ�Ŀ¼
	 * @param name�ļ���
	 * @�������true�ͱ���false�͹���
	 */
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		boolean rt = false;
		if(name.endsWith(".java")){
			rt = true;
		}
		return rt;
	}
	
}
