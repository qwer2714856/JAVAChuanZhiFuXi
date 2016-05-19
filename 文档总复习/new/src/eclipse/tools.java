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
 * 
 * 
 * 
 * 
 * 设置方面的
 * 1.选中一端的花括号显示另一端 window->preferences->java->editor->app... color option
 * 
 */
package eclipse;

import java.io.BufferedReader;

/**
 * @author www.23.com
 *
 */

public class tools {
private int i;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			System.out.println("i");
		}  
		long end = System.currentTimeMillis();

		System.out.println(end - start);
	}

	public void ssl(int i){
		
	}
}
