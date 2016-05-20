/**
 * IBM 开发的 
 * 体系结构
 * 
 * 通过各种的插件可以写各种的语言，前提是安装了该该插件。（UML 都可以搞。。。）
 * 问题 复杂度很高。
 * 在安装开发中比较常用的。
 * 
 * 中作空间 --项目的结合
 * 针对不同的项目类型，建立不同的工作空间。
 * 切换工作空间 file->switch workspace other  切换就可以了如果切换过会有已经切换的目录。 注意这个目录可以是空的（新的工作空间）。
 * 
 * 
 * 拷贝工作空间配置
 * 将一个工作空间的配置导出，在另一个工作空间导入，这样配置就可以考过去了。
 * 导出： file->export->preferences->select all 选择导出地方即可
 * 导入： file->import->preferences->找到配置文件即可(导入需要重启下)
 * 
 * 代码辅助，键盘小快手
 * 1.显示行号  window->preferences->general->editors->text editors->show line numbers
 * 2.打造更强的代码提示   现在提示是按了alt才有提示 如何自动提示？   window->preferences->java->editor->content assist->
 * auto activation triggers for java 改成 abcdefghijklmnopqrstuvwxyz_.
 * 3.shift + 鼠标左键选中松开就注释了这个试了没反应
 * 4.当前窗口最大最小化 ctrl+m
 * 5.当一个窗口打开了好多文件，可以使用ctrl + f6轻松切换到其它文件
 * 6.快速大小写字母 选中字符串 ctrl + shift + x大写 ctrl + shift + y 小写
 * 7.当行注释 ctrl + shift + c 注释状态就取消，取消状态就注释。alt + /存在热键冲突
 * 8.快速处理行代码 删除行代码ctrl + d
 * 9.选中alt+↑↓移动代码位置
 * 10.复写超类的方法 在类中右键 source->over....
 * 11.批量生成get set 方法 source->	getter setter	
 * 12.生成构造 source-> constructor field,空的构造方法是这个下面那个super什么的
 * 13.导包 ctrl+shift + o
 * 14.生成文档注释alt+shift+j
 * 15.快速生成代码块比如try catch块 选中代码alt + shift + z 
 * 16.alt+shift+z 可以自己配置块的 configure 配置
 * 	  弹出框 new -> 块的name description -> pattern 可以写程序的代码，然后 insert variable 插入变量已知的模板变量
 *   ${line_selection}${cursor} line_selection选中的行  cursor光标结束位置插入 设定的代码块
 *   long start = System.currentTimeMillis();
		${line_selection}${cursor}		
	 long end = System.currentTimeMillis();
		
	 System.out.println(end - start);
	 
 * 17. 关闭当前的打开文件ctrl + w 关闭所有的是ctrl + shift + f4
 * 
 * 代码之美
 * 1.格式化代码ctrl + shift + f 不用非带选中对页面就整个格式化了，选中只格式化选中的。
 *   或者 在工具条上找到source-> format
 *   格式化代码的风格 window->pre->输入format->edit->braces 其它的也可以看看
 *   
 * 2.成员排序
 *   工具条->source->sort Members...->一般就只排方法行了
 *   
 * 3.整理包
 *   工具条->source->org imports
 *   
 * 4.代码重构
 * 选中变量右键refactor->rename 一改都改了
 * 
 * 5.move 移动将一个类从一个地方移动另一地方，所有的引用都自动就改了。 工具条->refactor->move
 * 
 * 6.改方法 选中方法名字->refactor->change method sig...
 * 
 * 7.匿名类移到外边 选中匿名类->refactor->convert anoy... class to ....
 * 
 * 8.push down pull up 将父类的一些东或子类一些东西移动 继承层次的改变
 *   选中子类或父类的成员然后 右键->refactor->push down pull up
 *  
 * 9.提取接口 Extract Interface 选中方法的名字然后右键->refactor->extract interface
 * 
 * 10.提取方法 选中代码块右键->refactor->extract method
 * 
 * 11.抽取局部变量 选中一个数字或者字符串右键->refactor->extract local variable
 * 
 * 12.抽取静态变量 选中一个数字或者字符串右键->refactor->extract constanct
 * 
 * 13.抽取成员变量 选中一个变量右键->refactor->convert local ... variable
 * 
 * 14.抽取参数 一个没有动态传的可以让其变为方法传递的 选中函数的返回值变量 右键->refactor->introduce para...
 * 
 * 
 * 程序模块化
 * 1.把项目转为工程库
 * 当把一个android 打包成一个库文件后，在另一个android 中是可以引用的
 * 如何打包？
 * 右键android 项目->properties->android->is Library->确定（断点也是可以连调的） 23.com被打包
 * yinyong23com引用 23.com
 * 右键android项目->properties->android->add->23.com 就可以了
 * 
 * 使用jar包的方式 android 和 java 项目的连调
 * 新建一个java项目 不需要做任何操作
 * 新建一个android 引进 java 项目
 * 在android 上右键properties->java Build path->projects->add->java 项目
 * 
 * 使用jar包的形式 将 java项目打包成jar文件在给android 使用
 * eclipse大包jar 右键项目export  -> java ->选择保存路径
 * andorid 项目把jar考到项目目录，然后使用 右键->java Build path->libraries->引进来行了 add exten... jar
 * 
 * 
 * 显示
 * 1.让包层级显示  选中项目 -> 在package Explorer 右边有个向下的小箭头 -> package...-> heir
 * 2.如何查看某个功能函数一般需要 ctrl + 鼠标左键进入， 现在只需要 按住shift 然后鼠标滑到需要看的功能函数上
 * 3.进入定义ctrl + 鼠标右键就进入了
 * 4.看类的纲要 ctrl + o 产看当前文件的类的纲要 ctrl + o + o 会显示出详细信息，显示出父类的成员和一些信息
 * 5.查看类继承图 ctrl + t  将鼠标的光标放到类内部然后ctrl + t 可以点击定位过去 在ctrl + t可以看到它都继承了谁
 * 6.在工具条上有几个黄色的箭头，作用是当你按住ctrl + 右键进入的时候可以点箭头回来或前进。
 * 7.查看调用层次查看这个类在那些地方被调用了ctrl + alt + h 选中类名函数名等等然后ctrl+alt+h就可以查看那些地方调用了
 * 8.查看指定类ctrl + shift + t 
 * 9.选中某个变量 然后ctrl + k 查看所有调用情况 多按就往下定位。
 * 10.快速定位匹配符，ctrl + shift + p 选中一端  就会快速定位到另一端
 * 11.增量查找（反向）ctrl + shift + j  ctrl + j(正向被占用了)
 * 12.快速跳转到某行  未知快捷键
 * 13.快速比较  开启 window->pre...->搜diff->quick ... -> show ...  删掉一行的时候行号下面会有一条黑线，鼠标移动上去会有提示删掉的内容 如果被修改的
 *    会有行号颜色标注 ctrl + s 会丢失标注
 * 14.添加书签 在行号上左键->add bookmark    当鼠标移动上去会有提示
 * 15.在视图上显示所有的 bookmark window->show view->other->搜索book mark 可以在上图上删除标注的book mark
 * 16.任务task 也是个标签 右键行号 add task 可以选择任务等级，显示所有的任务 window->show view->other->搜索task  显示所有的task
 * 标签是给自己看的，task给团队看的。
 * 
 * 17.搜索 ctrl + f 搜索个内容，其实它的搜索很强悍 工具栏->search
 * 
 * 
 * 代码调试
 * 1.进入到debug 模式选中需要观察的变量然后右键watch 就可以监控它 切换到 variables 后可以右键监控的这个变量change value 修改它的值.
 * 2.编辑视图里面的breakpoints 去过把checkbox前面的钩钩去掉下次就不会在跳这个断点。后去工具条上run skip all breakpoints 跳过所有断点
 * 3.条件断点 先设置断点，然后右键断点 breakpoints pro... -> conditional 里面必须是个boolean 表达式，如果true就卡主断点 例如监控的变量如果满足条件就卡那
 * 													hit count  命中次数多少次才卡那
 * 4.异常断点 错误有时候出现有时候不出现怎么搞
 *  debug breakpoints 添加异常断点 j!图标的是添加异常断点，如果出现异常就自动断到那 对付不定时的是非常有用的
 *  
 * 
 * 设置方面的
 * 1.选中一端的花括号显示另一端 window->preferences->java->editor->app... color option
 * 
 */
package eclipse;

/**
 * @author www.23.com
 * 
 */

public class tools implements sk {
	public static final class RunTest extends Thread {
		public void run() {

		}
	}

	private toolsData data = new toolsData();
	private static int j;
	private static String string2;

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			System.out.println("i");
		}
		long end = System.currentTimeMillis();

		System.out.println(end - start);
		ssl(1, null);
		new sk() {

		};
		new RunTest().start();

		// 运行异常
		String sql = null;
		System.out.println(sql.toString());
	}

	public static void ssl(int i, String newParam) {
		new sk() {

		};
	}

	private static void mmsql(int i) {
		bbd(i);
		string2 = "aaa";
		String string = string2;
	}

	private static void bbd(int i) {
		if (i == 1) {

		} else if (i == 2) {

		} else {

		}
	}

}

class Fu implements say, niuniufa {

	int i;

	/*
	 * (non-Javadoc)
	 * 
	 * @see eclipse.say#say()
	 */
	@Override
	public void say() {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see eclipse.niuniufa#mmsql()
	 */
	@Override
	public void mmsql() {
		String name = "";
	}

}

class Zi extends Fu {

	public String sasy(SasyParameter parameterObject, String string) {
		String name = "";

		new Thread() {
			public void run() {

			}
		};
		return string;
	}

}

class Zi2 extends Fu {

}