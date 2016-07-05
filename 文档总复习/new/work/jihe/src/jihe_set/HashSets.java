/**
 * HashSet
 * �ص�
 * ���򣬲����ظ����ظ� add����false
 * HashSetԭ��
 * HashSet���Ԫ�ص�ʱ��HashSet���ȵ���Ԫ�ص�HashCode�����õ���ϣֵ��Ȼ��ͨ��Ԫ�ع�ϣֵ������λ�������������Ԫ���ڹ�ϣ���λ�á�
 * �����λ���Ժ�
 * 1.�����λ����û��ֵ��ֱ�Ӵ洢
 * 2.�����λ������ֵ����ʹ�ò���Ԫ�ص�equals�����ʹ��ڵ�Ԫ�ؽ��жԱȡ� �������ͬ����Ϊ�ظ�Ԫ�ز�������ӣ������ͬ�Ϳ�����ӡ�
 * �ײ�ʹ���˹�ϣ����ȡ�ٶȿ졣  ͨ���ڴ��ַ������ģ�����˭����������ͨ��һ��ַ��ֵ���������ȡ��������ȡ��ַ�ҵ�λ�ô��ȡ��	
 * 
 * �ɹ�ϣ������
 * ʲô�¹�ϣ��
 * һ����ͨ�ı�Ͱʽ�ṹ��һ�����ж���ӣ�һ�����ж���ܲ���Ҳ��˵һ���������ж�����������������ͬ��ϣֵ��ͬequals���Դ�һ�������ˡ�
 * 
 */
/*String a = "b";
		String b = new String("b");
		a == b false
		a.hashCode() == b.hashCode();
		hashCode ��Object�д洢���Ƕ�����ڴ��ַ
		Ȼ��String��Ӧ����д���������
		ԭ���ǽ��ַ�����ɢΪ�ַ�Ȼ����Ϊ�����ϣֵ��
		����������ͬ���ַ�����ϣ������ͬ��*/
package jihe_set;



import java.util.HashSet;

/**
 * @author www.23.com
 *
 */
public class HashSets {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs = new HashSet();
		hs.add(new p("d",1));
		hs.add(new p("d",11));
		hs.add(new p("d",11));
		hs.add(new p("d",11));
		hs.add(new p("d1",12));
		hs.add(new p("d2",13));
		hs.add(new p("d3",14));
		hs.add(new p("d4",15));
		System.out.println(hs);
		
	}

}


class p{
	String name;
	int id;
	public p(String name,int id) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.id = id;
	}
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return this.name.equals(((p)obj).name);
	}
	public int hashCode() {
		// TODO Auto-generated method stub
		return id;
	}
}
