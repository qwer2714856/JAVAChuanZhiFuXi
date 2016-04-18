/**
 * ecplise 的使用
 * 工作空间(worksapce)
 * 工程(project)
 * 
 * 工作空间：
 * 建议使用年月日命名，不能有中文和空格
 * 工程：
 * java project 管理所有的java原文件和 class文件
 * file->new -> java project  可以选择jdk版本，和工作空间。
 * 
 * 运行java文件
 * 1.ctrl + f11
 * 2.右键源文件 run as -> java application
 * 3.工具栏 Run -> run as -> java application
 * 4.在package explorer 上右键源文件 -> run as -> java application
 * 
 * 常用快捷键
 * alt + /									内容补全
 * ctrl + 1									快速修复
 * ctrl + shift + o 						快速引包，没有引用的包去掉。包的清理和加入
 * ctrl + shift + f 						代码整理
 * alt + ↑↓									条换代码位置
 * ctrl + / 								添加删除单行注释,热键冲突
 * ctrl + shift + /							添加多行注释
 * ctrl + shift + \							删除多行注释
 * window->Reset Perspective 				还原视图当视图被搞乱
 * ctrl + shift + x 						转大写
 * ctrl + shift + y 						转小写
 * ctrl + alt + 向下键						复制 行，热键冲突
 * ctrl + 单击方法名或类名或其它。				查看源代码，注意需要有api否则看不了，src.zip里面有
 * ctrl + shift + t 						搜索查看方法或类的源文件。
 * ctrl + d 								删除当前行
 * ctrl + h 								搜索全局的
 * 
 * 自定义快捷键
 * 设置自定义快捷键
 * window->preferences->搜索keys->在右侧的搜索栏中输入快捷键可产看是否已经使用，或者搜一些关键词，
 * 例如setter 这个是设置set 或 get的，设置constructor 是设置构造方法的，带fields的是带参的.剩下的那个是不带参的(SuperClass).
 * unbind command 解除绑定
 * binding 		     绑定的意思
 * 
 * 类的创建
 * 方法、构造函数，封装
 * 1在类上{里面空白地方} 右键 source->可以创建一些东西
 * 将代码快抽成 独立的方法。
 * 2选中代码块，右键 -> refactor-> Extract Method->输入方法名即可
 * 3变量重命名一个文档中变量很多如何全部重命名？
 * 选中变量 右键 refactor->rename 就可以
 * 
 */
package always_revision;

/**
 * @author www.23.com
 * 
 */
public class UseEclipse {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		haha();
	}

	public static void haha() {
		{
			
		}
	}

}
