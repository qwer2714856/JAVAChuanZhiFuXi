/**
 * Collection
 * List �ӿ�
 * ʵ����List�ӿڣ�������
 * �ص�������ظ�
 * ������֪ʵ���ࣺ
 * AbstractList, 
 * AbstractSequentialList, 
 * ArrayList, 
 * AttributeList, 
 * CopyOnWriteArrayList, 
 * LinkedList, 
 * RoleList, 
 * RoleUnresolvedList, 
 * Stack, 
 * Vector
 * 
 * //������һ��������ʲô��˼��
 * //����ָ��Ȼѭ�򣬶���ָ��ӵ�˳��ͳ���˳����һֱ�ģ����˳���Ƕ����Ƚ��ȳ���ԭ��
 * //�����ظ�
 * 
 * List �ӿ������е���չ����
 * ���
 * add(int index, E element) 
 * addAll(int index, Collection<? extends E> c) 
 * 
 * ��ȡ
 * get(int index) 
 * lastIndexOf(Object o) 
 * indexOf(Object o) 
 * subList(int fromIndex, int toIndex) 
 * 
 * ����
 * listIterator() 
 * listIterator(int index) 
 * toArray(T[] a) ��ʱѧ����
 * �޸�
 * set(int index, E element) 
 * 
 * 
 * ListIterator
 * ���з���
 * add
 * hasPrevious
 * nextIndex(); ���ص�ǰָ�������ֵ
 * previous
 * previousIndex(); �����ϸ�����ֵ
 * set
 * 
 * List�����߱����ص㣬�����ķ�����������ֵ����ֻ��list�ӿ������ʵ�ּ�����ž߱�����ֵ�������ӿ�����ļ����඼û������ֵ����ģ�
 */
package jihe;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author www.23.com
 *
 */
public class CollectionList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		//���
		//Collection ��add,addAll������Ĭ�ϰ�Ԫ�� �� ���� ��ӵ�ĩβ����
		//list��add��ӵ�ָ��������λ���ϡ�
		list.add(1,"admin");
		//addAll ���һ����ӵ�ָ��������λ��
		list.addAll(1,list);
		
		//��ȡ
		//list.get(1);��������ֵ��ȡ�����е�Ԫ�� -- ��������Ԫ�ؿ���ʹ��get��
		//list.indexOf("") ���ض����ڼ����е�λ���±�ע������Զ�����Ҳ��Ҫ��дequals��ΪĬ���ڲ�Ҳ�õ���Object��equals û�ҵ�-1
		//list.lastIndexOf("") ���һ�γ���  û�ҵ�-1
		//subList(from, to) ���ص���Ȼ��list  ��1��ʼ��ȡ1+2��
		//list = list.subList(1, 3);
		 
		
		//�޸� ʹ��ָ����Ԫ�أ��滻����ֵλ�õ�Ԫ�ء�
		//list.set(1, "ding");
		
		//���� List�ӿ����еĵ�����ListIterator
		//listItorator�����з���
		//lt.hasPrevious() ��һ��Ԫ����ֵ��
		//����з���trueû�о�false 	
		//lt.previous() ������һ��Ԫ��ֵ
		//û�з�Ҫ��ȡ���׳�java.util.NoSuchElementException �쳣
		//prevԭ����ǰָ���������ƶ���ȡ���жϣ���next��ȡ��ǰλ���������ƶ�  prev������ȡ��next��ȡ����
		ListIterator lt = list.listIterator();
		
		//add ��ָ����Ԫ�أ����뵽��ǰָ��ָ���λ���ϡ� lt.add("aaa"); Ĭ��ָ����0��λ��  lt.next() ��Ԫ�ز嵽1��λ�ã�lt.previous()��Ԫ���ڲ嵽0��λ��
		
		//set �滻���������һ�η��ص�Ԫ�� java.lang.IllegalStateException ���û�е���������Ԫ��ֱ�ӱ���lt.set("");
		
		System.out.println(lt.previous());
		
	}

}
