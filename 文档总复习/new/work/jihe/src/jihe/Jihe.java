/**
 * ����
 * Object ���͵�������Դ洢�������õ���������
 * ΪʲôҪѧ����
 * ����������˾�˰���
 * ������Ƚ��鷳����Ϊ�����ǲ��̶��ġ������ǿɱ�ģ���̬�Ķ�������������
 * ���ϣ�������
 * �����Ǵ洢�������ݵļ���������
 * 
 * ��������� 
 * ����
 * 1���Ͽ��Դ洢�������Ͷ�������
 * ����ֻ�ܴ洢ͬһ���������͵����ݡ�Object�������
 * 2���ϵĳ����Ƿ����仯��
 * ����ĳ����ǹ̶���
 * �����õıȽ϶�
 * 
 * ������java.util������
 * Collection �������ӿڵĸ��ӿڣ���νṹ �еĸ��ӿڡ���Collection ��ʾһ�������Щ����Ҳ��Ϊ collection ��Ԫ�ء�һЩ collection �������ظ���Ԫ�أ�����һЩ������һЩ collection ������ģ�����һЩ��������ġ�JDK ���ṩ�˽ӿڵ��κ�ֱ�� ʵ�֣����ṩ��������ӽӿڣ��� Set �� List��ʵ�֡��˽ӿ�ͨ���������� collection��������Ҫ����ձ��Եĵط�������Щ collection
 * ���Ϸ�Ϊ
 * Collection -|���ӿ� ����������淶
 *             list  ��չ���ӽӿ�   ����̳���list �ɴ�������ظ�
 *             set   ��չ���ӽӿ�   ����̳���set  �ɴ����򲻿��ظ�
 * Collection �ӿڲ���new ������ʵ�������
 * Collection a = new ArrayList()
 * ������֪ʵ���ࣺ
 * AbstractCollection, AbstractList, AbstractQueue, AbstractSequentialList, AbstractSet, ArrayBlockingQueue, ArrayDeque, ArrayList, AttributeList, BeanContextServicesSupport, BeanContextSupport, ConcurrentLinkedQueue, ConcurrentSkipListSet, CopyOnWriteArrayList, CopyOnWriteArraySet, DelayQueue, EnumSet, HashSet, JobStateReasons, LinkedBlockingDeque, LinkedBlockingQueue, LinkedHashSet, LinkedList, PriorityBlockingQueue, PriorityQueue, RoleList, RoleUnresolvedList, Stack, SynchronousQueue, TreeSet, Vector 
 * Collection
 * 
 * �����ǹ�������
 * ����int, char�������ǻ����������ͣ������Ƕ���
 * ���ڻ��������������뱣�����������
 * 
 * ��
 * add
 * addAll
 * ɾ
 * clear
 * remove
 * removeAll
 * retainAll
 * ��
 * 
 * ��
 * size
 * 
 * ����
 * iterator
 * toArray
 * �ж�
 * contains
 * containsAll
 * equals
 * isEmpty
 * 
 */
package jihe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
class p{
	String name;
	int age;
	int id;
	public p(String name, int age, int id){
		this.name = name;
		this.id = id;
		this.age = age;
	}
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.id;
	}
	public boolean equals(Object str) {
		// TODO Auto-generated method stub
		int id = 0;
		if(str instanceof p){
			id = ((p) str).id;
		}
		return this.id == id;
	}
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}
	
}
/**
 * @author www.23.com
 *
 */
public class Jihe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Object[] arr = new Object[10];*/
		Collection c = new ArrayList();
		//���
		c.add("1.1d");//������ݣ�ֻ������������ return boolean
		c.addAll(c);//��һ��������Ӷ���һ��������ȥ�����Ǽ��Ϻϲ� return boolean
		
		//ɾ��
		//c.clear();//��ռ����е�Ԫ�� return void
		//c.remove("1.1d");//ɾ��ָ���Ķ��� return boolean ���û��ɾ���ͷ���false
		//c.removeAll(c);//��һ����������ɾ������һ�����ϣ�ɾ���������ϵĽ���Ԫ��--ɾ���ǵ����ߵģ� return boolean ���û��ɾ���ͷ���false
		//c.retainAll(c);//��������Ԫ�أ������ǽ���Ԫ��ɾ�������û��ɾ���ͷ���false return boolean
		
		//�鿴
		//c.size();//�鿴Ԫ�ظ���
		
		//�ж�
		//isEmpty() �жϼ����Ƿ�Ϊ��Ԫ�� return boolean
		//contains() �ж�һ�������Ƿ����һ������ return boolean �Զ������Ҫ��дequals ��ΪArrayList�ڲ���ʹ��equals
		//containsAll()  �ж�һ�������Ƿ����һ�����ϵ�����Ԫ�� ��һ����Ϊfalse
		/*c.add(new p("aa",18,1001));
		System.out.println(c.contains(new p("aa",18,1002))); //contains �ڲ�����equals�Ƚϵ����ڴ��ַ����Ҫ��д
		
		
		
		 * 
		 *�Ƚϴ� collection ��ָ�������Ƿ���ȡ�
�� Collection �ӿ�û�ж� Object.equals �ĳ���Э������κ�Լ��ʱ����ֱ�ӡ�ʵ�ָ� Collection �ӿڣ����仰˵������һ�� Collection���������� Set �� List ���ࣩ�ĳ���Աѡ����д Object.equals ����ʱ����С�ġ�û��Ҫ����������򵥵ķ��������� Object ��ʵ�֣�Ȼ��ʵ���߿���ϣ��ʵ�֡�ֵ�Ƚϡ���������Ĭ�ϵġ����ñȽϡ�����List �� Set �ӿ�Ҫ�����������ֵ�Ƚϡ���

Object.equals �����ĳ���Э��������ȱ����ǶԳƵģ����仰˵�����ҽ������� b.equals(a) ʱ���Ŵ��� a.equals(b)����List.equals �� Set.equals ��Э�������б�ֻ�����б���ȣ�set ֻ���� set ��ȡ���ˣ�����һ���Ȳ�ʵ�� List �ֲ�ʵ�� Set �ӿڵ� collection �࣬������ collection ���κ��б�� set ���бȽ�ʱ������� equals �������뷵�� false����������ͬ���߼��������ܱ�дһ��ͬʱ��ȷʵ�� Set �� List �ӿڵ��ࡣ��

���ǣ�
�� Object �е� equals
������
o - Ҫ��� collection ��������ԱȽϵĶ���
���أ�
���ָ��������� collection ��ȣ��򷵻� true
����μ���
Object.equals(Object), Set.equals(Object), List.equals(Object) 
		 * 
		 *
		System.out.println(c.equals(new p("",1,1))); //
		
*/		
		
		//���� toArray();
		/*Object[] a = c.toArray();//ע�ⷵ�ص���object�����飬��Ϊ����Ķ��󲻶���������ҪObject�����ܡ�
		System.out.println(Arrays.toString(a));*/
	    
		 
	}

}
