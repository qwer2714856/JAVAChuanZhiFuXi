/**
 * 正则表达式--用于操作字符串的一个技术,一个规则，正则表达式使用了特除的符号表示。
 * 匹配，校验
 * 
 * 原子
 * .    任意字符 除了换行符 \r 回车 是回到首行 \n换一行 
 * \d	数字：[0-9]
 * \D	非数字： [^0-9]
 * \s	空白字符：[ \t\n\x0B\f\r] 输入看不见的东西
 * \S	非空白字符：[^\s]
 * \w	单词字符：[a-zA-Z_0-9]
 * \W	非单词字符：[^\w]
 * \b   单词边界 只要是代表单词间的结束就可以匹配 但是不匹配字符的 不匹配任何字符只是个边界和前瞻和后顾很像 也就说matcher("a b") a\bb是不匹配的因为 空格不是\b \b不匹配任何字符就是个边界而已。
 * \B   非边界
 * 
 * 任意原子在没有加入数量值之前任何预定义字符都只能匹配一个。
 * 字符串加\转定义但如果原来是不是转定义的需要在加一条\来转定义 例如讲\r 是系统转定义字符而 \d不是的，字符串里面需要先对\转定义\\然后在加d 生成的是\d 
 * 
 * 元字符
 * 
 * X?	X，一次或一次也没有
 * X*	X，零次或多次 {0,}
 * X+	X，一次或多次{1,}
 * X{n}	X，恰好 n 次
 * X{n,}	X，至少 n 次 
 * X{n,m}	X，至少 n 次，但是不超过 m 次
 * 
 * 范围
 * [abc]	a、b 或 c（简单类）
 * [^abc]	任何字符，除了 a、b 或 c（否定）
 * [a-zA-Z]	a 到 z 或 A 到 Z，两头的字母包括在内（范围）
 * [a-d[m-p]]	a 到 d 或 m 到 p：[a-dm-p]
 * [a-z&&[def]]	d、e 或 f
 * [a-z&&[^bc]]	a 到 z，除了 b 和 c：[ad-z]（减去）
 * [a-z&&[^m-p]]	a 到 z，而非 m 到 p：[a-lq-z]（减去）
 * 
 * 
 * Back 引用
 * \n	任何匹配的 nth 捕获组
 * 
 * 特殊构造（非捕获）
 * (?:X)	X，作为非捕获组
 * (?idmsux-idmsux) 	Nothing，但是将匹配标志i d m s u x on - off
 * (?idmsux-idmsux:X)  	X，作为带有给定标志 i d m s u x on - off
 * (?=X)	X，通过零宽度的正 lookahead 前瞻
 * (?!X)	X，通过零宽度的负 lookahead 负前瞻
 * (?<=X)	X，通过零宽度的正 lookbehind 后顾
 * (?<!X)	X，通过零宽度的负 lookbehind 负后顾
 * (?>X)	X，作为独立的非捕获组
 * 
 * 
 * ()是用来分组的 提高复用性
 * java反向引用\n \1-\n
 * ()里面的首次出现的为\1 再就是以此类推 \1 - \n
 * 模式修正符
 * 
 * 
 * 
 * 
 * 匹配的函数
 * matches
 * 
 * 
 * 
 * 匹配
 * matches
 * 替换
 * replaceAll
 * 切割
 * split
 * 查找
 */
package regexp;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author www.23.com
 *
 */
public class Description {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//匹配
		String pattern = "([a-z0-9A-Z])(?:[a-z0-9A-Z])+@(?:163|qq)\\.(?:com|cn)";
		String tel = "(\\d{4}-)?\\d{7,8}";
		System.out.println("1177284@163.com".matches(pattern));
		
		//切割 相当用了模式修正符g
		String a = "小明明明红上上上日学学学";
		String aPattern = "(.)\\1{1,}";
		String []getA = a.split(aPattern);
		System.out.println(Arrays.toString(getA));
		
		//查找 字符串没有内置方法--使用正则对象解决这个事情 Pattern  Matcher 匹配器对象   -- java.util
		//Pattern 正则对象
		//Matcher 匹配器对象 所有的东西都在匹配里面
		//找出三个字母组成的单词
		Pattern pt = Pattern.compile("\\b[a-zA-Z1-9]\\w+@(?:163|126)(\\.(?:com|cn|net)){1,2}\\b");
		Matcher m = pt.matcher("dfsdf:13863946940@126.com.com.com.com :13863946940 dfsdf:13863946940 dfsdf:13863946940 dfsdf:13863946940");
		//匹配器主要使用的方法
		//m.find(); 返回boolean通知匹配器去匹配字符串查找符合规则的字符串。  查找符合规则的 必须成对出现
		//m.group(); 获取符合规则的字符串 --使用方法的时候一定先调用find在使用group 这个有点像迭代
		while(m.find()){ //和迭代器一个用法
			System.out.println(m.group());
		}
		
		
		
		
		//替换 replaceAll 相当用了模式修正符g   如果需要在 replaceAll 正则外部 引用组的内容 的 $1-n代表前面的捕获组
		System.out.println("喔喔瑶瑶好好做做香香木木".replaceAll("(.)\\1+", "$1"));
		
		
	}

}
