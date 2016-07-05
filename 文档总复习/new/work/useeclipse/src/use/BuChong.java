package use;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

 

/**
 * 1.内容补全                                          alt+/这个很重要 要学会
 * 2.快速修复错误                                  ctrl + 1 
 * 3.挪代码  选中要挪的代码块              alt + 上下方向键
 * 4.左右移动                                           多行选中Tab向右移动
 *   左边移动选中                                   shift+Tab
 * 5.多行注释                                           ctrl+shift+/   取消是 + \
 * 6.单行注释                                           ctrl + / 取消或添加都可以原来有就取消原来没有就注释光标移到最前面
 * 7.代码整理                                           代码格式化 ctrl+shift+f  选中
 * 8.导包导入所有 ,或者去掉无用的包 ctrl+shift+o
 * 9.删除当前行光标落在当前行		ctrl+d 
 * 10.所有的热键 windows->prefer.. 搜keys
 * 11.构造函数没有固定快捷键需要自己设置  在热键搜索constructor  Fields 使用所有字段 from superClass 没有参数的构造 building绑定    unbind Command 解除
 * 12.生成get 和 set 方法               keys 搜索getter 或 setter 设置 要生成的话是一起生成的
 * 13.查看源代码                                    ctrl+鼠标点击  或者ctrl+shift+t 搜徐你想查看的类 或选中 f3
 * 14.转大小写	
 * 15.转大写					ctrl+shift+x
 * 16.转小写					ctrl+shift+y
 * 17.统一的改名字				选中右键 refactor->rename
 * 18.查看这个文件的一些信息              ctrl+f3
 * 断点调试
 * 可以让程序停留指定地方观察停留地方数据分析原因。
 * 1.在代码上下一个断点
 * 2.然后用debug模式运行 debug as
 * 3.进入debug视图 停在断点
 * 	 鼠标可以悬停在变量或者其它位置观察信息
 *  或者想看哪个变量选中右键watch 右上会多一个观察的窗口express
 *  step over 跳过这一步
 *  step into 进入到调用者的函数内部
 *  step return 这个方法马上结束回到上一层
 *  绿色箭头运行完所有代码除了断点如果下面还有断点就在卡住
 *  Breakpoints 选项卡有个打叉就会删除所有的断点
 *  
 *  
 * 如果想查看自己的热键是否冲突，可以在keys那个框框里面输入你自定义快捷键看看能不能搜出东西来。
 * @author www.23.com
 *  
 *  
 * 补充
 * 客户端清楚登录记录
 * http://jingyan.baidu.com/album/f71d603776ae7a1ab641d112.html?picindex=2
 * 添加热键需要看
 * http://outofmemory.cn/code-snippet/2721/eclipse-setting-svn-tijiao-kuaijiejian
 */
public class BuChong {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
  
		bbb();
		bbb();
		bbb();
		bbb();
		
		
	}
	public static void bbb(){
		System.out.println("");
	      }
}

class pp{
	String name;

	int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public pp(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
 
}
