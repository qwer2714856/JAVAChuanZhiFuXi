import java.util.ArrayList;
import java.util.Collections;

/**
 * jdk1.5������
 * ��̬����
 * ��������ʲô�ģ�
 * ����д
 * ��ʽ
 * ������һ��������о�̬��Ա
 * import static ����.����.��̬��Ա
 *                      .* ��������
 */

/**
 * @author www.23.com
 *
 */
//��̬����
//�����ھ�̬�ĳ�Ա����
import static java.util.Collections.sort;
import static java.util.Collections.binarySearch;
//�����ھ�̬�ĳ�Ա����
import static java.lang.System.out;

/*����ĵط�
��ʹ����һ��sort��������Ҳ��һ��sort ֻҪ�͵��������һ����
��ô�������һ����
��ô����ñ�����Ǹ�������
���������ð����Ǹ�����Ҫʹ�þ�̬����.��
*/
	
public class StaticImportDescription {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(10);
		al.add(-1);
		al.add(12);
		
		sort(al);
		out.println(binarySearch(al, 10));
	}

}
