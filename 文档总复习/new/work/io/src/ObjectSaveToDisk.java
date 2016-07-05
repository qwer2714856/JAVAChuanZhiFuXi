import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Person�洢�ڱ���
 *
 * ���������������û�ж�д�ļ�����������Ҫ�����ܵ��ģ�
 * ��Ҫ���ã�����д��Ϣ�Ͷ���Ķ�ȡ��Ϣ��
 * 
 * �����������
 * ObjectInputStream
 * 
 * ���������
 * ObjectOutputStream
 * 
 * 
 * ObjectOutputStream ʹ�ò���
 * ������ϢдӲ��
 * 		File f = new File("D:/java/day10/day22/��Ƶ/object/object.txt");
		FileOutputStream fo = new FileOutputStream(f);
		ObjectOutputStream oo = new ObjectOutputStream(fo);
		//�Ѷ���д��
		oo.writeObject(p);
		
 ����
 û����Ҫ����ȥʵ�ַ����Ľӿڽ�����־�ӿ�����Serializable
 ʵ�������಻��Ҫʵ�����ķ�������û����Ҫʵ�ֵķ�����
 
ע��ϸ��
1.���������Ҫ��д�����ļ��ϣ����������������ʵ��Serializable��������ӿ��Ǹ���־�ӿڡ�
 
2.����浽Ӳ���ϣ������������л���
     �����Ӳ�̶�ȡ�����������������л��� 
 
3. ���󴴽�����ù��췽����
        Ȼ������Ƿ����л������Ķ����ǲ�����ù��췽���ġ� 
        
4. serialVersionUID �����ڼ�¼class�İ汾��Ϣ�ģ�serialVersionUID ���������ͨ������ ��Ա ���� �������������һ������
   ��д����ʱ��ᣬ��������д�����󣬻���д��serialVersionUID������� ��¼���ļ���serialVersionUID�����class�ļ��İ汾��Ϣ��
   �ڷ����л���ʱ����Ȱ� �ļ���serialVersionUID ������������������뱾�ص�class�ļ���serialVersionUID�Ա�һ�£������ƥ��ֱ�ӷ����л�ʧ�ܡ�

5.��β��öԱ�serialVersionUID ��Ϊ���ڿ���Ҫ�޸���ĳ�Ա��
   һ��ʼ���ָ��serialVersionUID ��ô�����л��뷴���л���ʱ��jvm���������Լ������class ��serialVersionUID �ˡ����Ƕ���ȡ�
 private static final long serialVersionUID = 1L;

6�����ĳ�������ĳ�����ݲ��뱻���л���Ӳ���ϣ�����ʹ��transientȥ����������ԡ�

7.���һ����Ҫ���л����࣬�ڲ���ά��������һ���࣬��ô�����л���ʱ��Ҳ��Ҫ��ά�����Ǹ���ʵ��һ��Serializable�ӿڡ�
 
  ���һ�������ĳЩ��Ա����д��ȥ���Լ�һ���ؼ�������
 transient int age = 1;
 * @author www.23.com
 *
 */
public class ObjectSaveToDisk {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		//���Ҫʵ��ͼ�����ϵͳ����ʹ��ArraList������չ ���м����඼ʵ����Serializable���Դ洢��������û���⡣
		
		//forever save
		Person p = new Person("aaa", "bbb");
		File f = new File("D:/java/day10/day22/��Ƶ/object/object.txt");
		FileOutputStream fo = new FileOutputStream(f);
		ObjectOutputStream oo = new ObjectOutputStream(fo);
		//�Ѷ���д��
		oo.writeObject(p);
		
		oo.close();
		
		System.out.println("done");
		
		
		
		
		//����ķ����л�  
		ObjectInputStream oi = new ObjectInputStream(new FileInputStream(new File("D:/java/day10/day22/��Ƶ/object/object.txt")));
		Person prd = (Person) oi.readObject();
		System.out.println(prd);
		
		
	}

}


class Person implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String userName;
	String passWord;
	transient int age;//�����������ؼ��־�д�� ��ȥ�ˡ�
	public Person(String userName, String passWord) {
		this.userName = userName;
		this.passWord = passWord;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return userName + passWord;
	}
}