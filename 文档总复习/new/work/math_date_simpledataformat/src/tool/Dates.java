/**
 * Date 日期类  在util 包里面 java.util 包里面 Date 里面的大部分方法都过时了，所以使用Calendar类代替,但是一般Date 配合 SimpleDataFormat使用
 * 构造函数
 * Date() 返回当前系统时间对象
 * new Date().setTime(System.currentTimeMillis()); 设置日期 然后通过SimpleDateFormat格式化它
 * 
 * Calendar 必须继承因为构造方法是protected所以不同包只能继承，或者使用静态方法获取。
 * Calendar.getInstance() 获取当前系统时间对象 --通过静态过去日期对象
 * Calendar 有一个get方法可以获取年月日时分秒public int get(int field)
 * 这个get方法传入的是相应的常量 int field
 *     Calendar.YEAR --年
 *     Calendar.MONTH --月 0-11月获取的时候需要+1，星期是0-6
 *     Calendar.MONDAY -- 指示 Monday 的 DAY_OF_WEEK 字段值
 *     Calendar.DATE --日  --DAY_OF_MONTH 可以过去其他一天位于年是第几天月以及周等等
 *     Calendar.HOUR --时  HOUR_OF_DAY 24小时 进制   HOUR 12小时进制
 *     Calendar.MINUTE --分
 *     Calendar.SECOND --秒
 *     Calendar.MILLISECOND --毫秒
 *     
 *     
 *     日期格式化类
 *     SimpleDateFormat   -- 隶属于java.text.SimpleDateFormat;包
 *     作用有两点 
 *     1.把日期转换指定格式的字符串    format()
 *     2.把字符串转换对应日期	  parse()
 *     SimpleDateFormat() 默认格式创建了一个日期格式化
 *     
		字母	日期或时间元素	表示	示例
		G	Era 标志符	Text	AD
		y	年	Year	1996; 96
		M	年中的月份	Month	July; Jul; 07
		w	年中的周数	Number	27
		W	月份中的周数	Number	2
		D	年中的天数	Number	189
		d	月份中的天数	Number	10
		F	月份中的星期	Number	2
		E	星期中的天数	Text	Tuesday; Tue
		a	Am/pm 标记	Text	PM
		H	一天中的小时数（0-23）	Number	0
		k	一天中的小时数（1-24）	Number	24
		K	am/pm 中的小时数（0-11）	Number	0
		h	am/pm 中的小时数（1-12）	Number	12
		m	小时中的分钟数	Number	30
		s	分钟中的秒数	Number	55
		S	毫秒数	Number	978
		z	时区	General time zone	Pacific Standard Time; PST; GMT-08:00
		Z	时区	RFC 822 time zone	-0800
		"yyyy年MM月dd日HH时mm分ss秒"
		
		
		
 *
 *   数学类Math 提供了很多数学公式使用 -- java.lang.Math包里面
 *   abs 绝对值
 *   ceil 向上取整 往大的取整
 *   floor 向下取整
 *   round 四舍五入
 *   random 取随机数 0-1的随机数 不包括1
 *   有一个随机数的类 Random --java.util.Random
 *   Random rd = new Random();
	 System.out.println(rd.nextInt(11));
	  产生 0-10的随机数
	 System.out.println(rd.nextInt(11)+1);
	 1-10 
	 
 *   
 *   验证码	 
 */
package tool;
import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Random;

/**
 * @author www.23.com
 *
 */
public class Dates{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Date date = new Date();//获取当前系统时间
*/	
		/*Calendar a = Calendar.getInstance();
		a.setTimeInMillis(System.currentTimeMillis()+5000);//设置一个时间
		System.out.println(a.get(Calendar.YEAR));//获取一个时间
	    
		//日期格式化 类
		SimpleDateFormat sf = new SimpleDateFormat("yyyy年MM月dd日-HH时mm分ss秒");
		try {
			System.out.println(sf.parse(sf.format(a.getTime())));//字符串转日期 -- 这个字符串一定要按照simpleDateFormat的格式字符串-才能转会日期,否则直接异常.
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(sf.format(a.getTime()));//日期转字符串 
*/		
		
		/*Random rd = new Random();
		System.out.println(rd.nextInt(11)+1);*/
		
		
		Random rd = new Random();
		char[] a = {'b','s','d','e','t','p','定','路','超'};
		int rds = 0;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 31; i++){
			rds = rd.nextInt(a.length);
			sb.append(a[rds]);
		}
		System.out.println(sb.toString());
	}
}
