package jihe;

import java.util.ArrayList;
import java.util.Collection;
/**
 * ���ϵĵ�����
 * @author www.23.com
 *
 */
public class Iterator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c = new ArrayList();
		c.add("a");
		c.add("a1");
		c.add("a2");
		c.add("a3");
		c.add("a4");
		c.add("a5");
		c.add("a6");
		c.add("a7");
		System.out.println(c);
		
		//ʹ��iterator����
		//���صĵ���Iterator��ʵ�������
		java.util.Iterator it = c.iterator();
		//����������ץȡ�����е����ݡ�
		/*
		 *  boolean	hasNext()  ���Ƿ�����һ��Ԫ�������true����false
		    next() 			       ȡ��Ԫ��
		 	void	remove()   ���ص��������һ�η��ص�Ԫ�� Ҳ��˵����next�����Ժ���ɾ�� ���û��ʹ��nextֱ�����쳣
    
		 */
		//java.util.NoSuchElementException ������û�п���ץȡ�Ĵ�����
		while(it.hasNext()){
			System.out.println(it.next());
			it.remove();
		}
		System.out.println(c);
		
		
		//hasNext,next����ԭ��
		//hasNext �ʵ�ǰָ���Ƿ���ָ��Ԫ�أ�����з���true���򷵻�false
		//next�����Ƿ��ص�ǰָ��ָ��Ԫ��ָ�����ƶ���
	}

}
