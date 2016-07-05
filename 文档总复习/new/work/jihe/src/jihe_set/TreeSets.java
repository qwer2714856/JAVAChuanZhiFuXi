/**
 * TreeSet
 * 特点
 * 如果元素具备自然顺序的特性，那么就按照元素自然顺序的特性进行排序存储。
 * 自然顺序a-z 1-n,字符是按照每位的ascii码排序。
 * 
 * TreeSet要注意的事情
 * 1.往TreeSet添加元素，如果元素本身有自然顺序会按照自然顺序排序小->大
 * 2.如果往TreeSet添加元素，如果元素本身没有自然顺序特性，那么改元素所属类必须实现Comparable 接口   Comparable这个接口在java.lang包 把 比较规则定义在compareTo
 * 方法上。
 *     二叉树
 * 3.如果使用TreeSet 往里面添加元素的时候发现比较的那个字段相减为0那么就视为重复元素无法插入。（compareTo 方法返回0，这个和hashCode 和 equals没关系）
 * 4.在往TreeSet添加数据的时候，如果元素本身不具备自然顺序，元素所属类也没有实现comparable接口，那么需要在构造的时候传入一个比较器。
 * 5.Comparator Comparable 如果同时实现使用 Comparator 的比较器 优先
 * 6.TreeSet可以对字符串进行排序。因为字符串实现了Comparable接口
 * 7.字符串比较规则
 *     逐位比较ascii吗，如果没有对应就没有的那个小。
 *     abc
 *     <
 *     abw
 *     逐位比较
 * 
 *     abc
 *     逐位前面都一样，长度不同比较长度。
 *     abcd
 * 原理
 * 底层是使用红黑树，也就是二叉树数据结构，存储规则：左小右大。
 * 结点和2个叶子结点，小的左边，大的右边
 * 如果出现了比较的两个结果相减为0那么就视为重复元素无法添加进去
 * 
 * 二叉树的存取和遍历
 * 
 * 第一次使用add加入的元素视为根节点
 *                        老1  钱100
 * 当二次添加结点的时候会先去和老1比较钱如果发现比100小那么就位于老1的左边
 * 					   老2 钱50	 
 * 当第三次比较例如老3 120 先去和老比较发现比老1大那就放到老1 的右边
 *                              老3 钱 120
 * 当第四次老4钱 5 就先和老1比比老1小去左边和老2比比老2小
 *                  老4 钱5
 * 最后的输出是 老4 老2 老3 老1  从最左下的叶子开始 左叶子 结点右叶子递归
 * 
 * 【二叉树中的一个特点】
 * 在二叉树中，三个结点构不成一个二叉的话就会调整结点，调整完了会使比较次数减少。
 * 
 * 调整结构如下
 * 例如
 * A
 *  B
 *   C
 * 三个结点这个时候没有构成一个二叉。 调整后的结果为
 *     B
 *  A     C
 *  第一个结点位于第二个左边，第二个位于中间，第三个为第二个右边。
 *  
 *      B
 *  A       C
 *           D
 *            E
 * ABC是一颗二叉，B是这个叉的结点，根结点是不算在里面的，所以BCD不是三个是两个CD 而CDE是三个会调整	只算枝叶。
 * 所以CDE三个点没有形成叉 马上发生变化了
 * 
 * 
 * 
 * 自定义比较器格式
 * 自定义一个类实现comparator
 * class Com implements Comparator{

	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}
 
	
}


Comparator Comparable 如果同时实现使用 Comparator 的比较器 优先
推荐使用哪种	推荐Comparator


练习题
TreeSetLx

 * 
 * 
 */
package jihe_set;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/**
 * @author www.23.com
 *
 */
/**
 * 比较器
 * @author www.23.com
 *
 */
class Com implements Comparator{

	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		ps p1 = (ps)o1;
		ps p2 = (ps)o2;
		return p2.qian - p1.qian;
	}
 
	
}

public class TreeSets {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*TreeSet ts = new TreeSet();
		ts.add(new ps("s"));//TreeSet默认是按照自然顺序帮助排序的，而自定义对象没有可比性，你需要告诉它按照什么排序否则报错。
		System.out.print(ts);*/
		
		//元素了本身实现了comparable 
		//TreeSet ts = new TreeSet();
		//自定义比较器 new Com
		TreeSet ts = new TreeSet(new Com());
		ts.add(new ps("bs",4));
		ts.add(new ps("as1",3));
		ts.add(new ps("cs2",2));
		ts.add(new ps("es3",1));
		ts.add(new ps("zs4",99));
		ts.add(new ps("zs4x",99));
		System.out.print(ts);
	 
	}

}


class ps implements Comparable{
	String u;
	int qian;
	public ps(String u,int qian) {
		// TODO Auto-generated constructor stub
		this.u = u;
		this.qian = qian;
	}
	public String toString() {
		// TODO Auto-generated method stub
		return u;
	}
	public int hashCode() {
		// TODO Auto-generated method stub
		return u.hashCode();
	}
	//负整数、零或正整数，根据此对象是小于、等于还是大于指定对象。  从小到大进行排序
	/*若 a 小于 b，在排序后的数组中 a 应该出现在 b 之前，则返回一个小于 0 的值。
	若 a 等于 b，则返回 0。
	若 a 大于 b，则返回一个大于 0 的值。*/
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		ps s = (ps)o;
		System.out.println(u+"和"+s.u+"比较了");
		return qian - s.qian;
		
		
	}
}