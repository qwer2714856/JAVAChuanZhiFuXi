/**
 * ���ϸ�ϰ
 * 
 * �������� ��ϵ
 * Collection --���ӿ�
 *     | List --������ظ�
 *         | ArrayList    �ײ�ʹ����Object���� ��������0.5 �ص��ѯ�죬��ɾ�� jdk1.2
 *         | LinkedList   �ײ�����˫���� �ص��ѯ������ɾ��
 *         | Vector       Vector��ArrayListһ�µģ��������̰߳�ȫ�ģ�����Ч�ʵͣ�jdk1.0
 *     | Set  --���򲻿��ظ�
 *         | HashSet	  �ײ�����Hash�� ��ȡ�죬ԭ��ʹ��Ԫ�ص� hashCode �õ�hash��Ȼ��λ�ƣ��õ�Ҫ��ŵ�λ�ã������λ��û��ֱֵ�Ӵ洢�������λ����ֵ���Ǳ�Ԫ�ص�ֵequals���Ѿ����ڵ�ֵ�����ͬ�����룬������롣���Ź�ϣ��ÿ����Ԫ���൱��һ��Ͱ���ԷŶ�����ݡ�
 *         | TressSet	 �ײ��Ƕ����� ��������� �ص���Ԫ������洢��ע������1.��TreeSet���Ԫ�ر�������Ȼ˳�򣬻����Ԫ����Ȼ˳������
 *        				 2.���û����Ȼ˳��Ԫ������Ҫʵ��comparable�ӿ� ��дcompareTo����
 *        				 3.���߱���Ȼ˳�����Ԫ��������û��ʵ��comparable�ӿڱ���Ҫ�ڴ���TreeSet��ʱ�����Զ���Ƚ������Ƚ�������Ҫʵ��comparator ����дcompare������class t implements Comparator{}��
 *        				 4.����ʲô�����ظ���compare compareTo ����0��Ϊ�ظ�Ԫ�ز���ӡ�
 *        
 *        ������jdk1.5���ֵ�������
 *        �ô���1.������ʱ���⣬��ǰ������
 *        	   2.������ν��ǿ������ת��
 *        �Զ��巺�� <T> �Զ������͵�����
 *        ���ͷ���
 *        public static <T> T admin(T [] ay){}
 *        ע������
 *        1.�Զ��巺�;��������������øú�������ʵ�ξ�����
 *        2.�Զ��巺�����õ���ĸA-Z ����һ�㶼ʹ��һ��T����E element
 *        
 *        ������
 *        class ClassName<T>{
 *        
 *        }
 *        ����<��������>
 *        ע������
 *        1.����������ͣ�����ʹ�ø���ʵ������ʱ��ȷ���� ClassName<String> a = new ClassName<String>();String��ȷ����T��ʲô����--ʵ������ʱ��ָ����
 *        2.�����ʵ������ʱ��û��ָ����Ĭ��ΪObject
 *        3.��̬��������ʹ�������Զ���ķ��ͣ������Ҫ�����Զ����Լ��ķ����ϡ�
 *        
 *        ���ͽӿ�
 *        interface map<T>{
 *        	public void ll(T c);
 *        }
 *        ע�������
 *        1.���ͽӿڵ������������ڱ�ʵ�ֵ�ʱ����� class a implements map<String> ��ʱT����String
 *        2.���ʵ�ֽӿڵ�ʱ��û��ָ����������Ĭ����Object
 *        3.�����Ҫʵ����ʱ����ȷ�Ͻӿڵķ������Ϳ�����ô�� class nnty<T> implements p<T>{}
 *        
 *        
 *        ���͵�������
 *        ?ͨ���
 *        ? super Integer ���� Integer �����ĸ���
 *        ? extends Number ����Number ����������
 *        
 *        Collection <? ....>����ǰ���������һ��Ҫ���ڲ�����T<?....>��������
 *        
 */		
package fuxi;

/**
 * @author www.23.com
 *
 */
public class JiHeFuXi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
