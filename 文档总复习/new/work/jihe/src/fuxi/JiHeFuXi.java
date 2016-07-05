/**
 * 集合复习
 * 
 * 单例集合 体系
 * Collection --根接口
 *     | List --有序可重复
 *         | ArrayList    底层使用了Object数组 不够增加0.5 特点查询快，增删慢 jdk1.2
 *         | LinkedList   底层用了双链表 特点查询慢，增删快
 *         | Vector       Vector和ArrayList一致的，但是是线程安全的，操作效率低，jdk1.0
 *     | Set  --无序不可重复
 *         | HashSet	  底层用了Hash表 存取快，原理，使用元素的 hashCode 得到hash码然后位移，得到要存放的位置，如果该位置没有值直接存储，如果该位置有值，那本元素的值equals和已经存在的值如果相同不插入，否则插入。这张哈希表每个单元格相当于一个桶可以放多个数据。
 *         | TressSet	 底层是二叉树 （红黑树） 特点会对元素排序存储，注意事项1.往TreeSet如果元素本身有自然顺序，会根据元素自然顺序排序
 *        				 2.如果没有自然顺序，元素类需要实现comparable接口 重写compareTo方法
 *        				 3.不具备自然顺序而且元素所属类没有实现comparable接口必须要在创建TreeSet的时候传入自定义比较器，比较器类需要实现comparator 和重写compare方法（class t implements Comparator{}）
 *        				 4.它以什么返回重复？compare compareTo 返回0就为重复元素不添加。
 *        
 *        泛型是jdk1.5出现的新特性
 *        好处：1.将运行时问题，提前到编译
 *        	   2.避免无谓的强制类型转换
 *        自定义泛型 <T> 自定义类型的声明
 *        泛型方法
 *        public static <T> T admin(T [] ay){}
 *        注意事项
 *        1.自定义泛型具体类型是在条用该函数传入实参决定的
 *        2.自定义泛型所用的字母A-Z 我们一般都使用一个T类型E element
 *        
 *        泛型类
 *        class ClassName<T>{
 *        
 *        }
 *        类名<声明泛型>
 *        注意事项
 *        1.泛型类的类型，是在使用该类实例化的时候确定的 ClassName<String> a = new ClassName<String>();String就确定了T是什么类型--实例化的时候指定的
 *        2.如果在实例化的时候没有指定就默认为Object
 *        3.静态函数不能使用类上自定义的泛型，如果需要必须自定在自己的方法上。
 *        
 *        泛型接口
 *        interface map<T>{
 *        	public void ll(T c);
 *        }
 *        注意的事情
 *        1.泛型接口的数据类型是在被实现的时候传入的 class a implements map<String> 这时T就是String
 *        2.如果实现接口的时候没有指定泛型类型默认是Object
 *        3.如果需要实例的时候在确认接口的泛型类型可以这么搞 class nnty<T> implements p<T>{}
 *        
 *        
 *        泛型的上下限
 *        ?通配符
 *        ? super Integer 下限 Integer 和它的父类
 *        ? extends Number 上限Number 和它的子类
 *        
 *        Collection <? ....>这里前面这个类型一定要存在不能是T<?....>这样错误。
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
