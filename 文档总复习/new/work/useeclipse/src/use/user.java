package use;

import java.io.File;

public class user {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// eclipse 使用
		// 第一次启动选择工作目录->创建会在里面生成个文件夹这个不能删除
		// 创建工程代码(工程作为单位的)
		//     1.package explorer 右键 new 可以选择需要建立的项目
		//     2.选个java project
		//     3.project name 写完直接finish
		//  写代码，在src目录下面右键new一个类（建立的时候会让你勾选一些东西仔细看看）
		//  只有放在src下面java 类才能运行不能放在工程下面   
		//  设置界面字体等 window->preferences->上面有个搜索 输入text->text editors->colors and fronts->baseic->Text-front->edit 或者找到某种语言的直接设置，单种语言的会覆盖全局的，前面的那个就是全局的
		//  创建的项目会保存在工作区下面。
		//  运行java 文件 
		//		1.右键 src下面的java 源文件，run as...->java app 输出在console窗口
		//      2.工具条 绿色小箭头 run as ...->java app
		//  	3.快捷键 ctrl+f11
		//  使用的好处
		//  内容补全助手alt+/
		//  注释选择中ctrl+shift+/
		//  取消注释ctrl+shift+\
		//  不需要使用javac了，一旦保存就会自动编译。到bin里面去
		//  精准报错，自动修复
		//  如果出现报错直接将光标放上去ctrl+1就会给出几种帮助方案(一般第一句精准)
		//  通过eclipse 的快捷键查看元代吗的方式，2个快捷键，1按住ctrl+鼠标滑到那个方法上左键 2 选中那个方法然后F3 或者去src.zip源文件里面找去
		//  设置字体搜索的那个地方将text换成keys就可以设置快捷键
		//  控制右上角有个Outline 可以查看当前打开这个类的所有的成员
		//  在做逻辑判断的时候，让确定的值位于左边，不确定的放于右边，这样避免左边的值空出现的问题
		//  例如讲 str = null; str.equals("abc")这个时候会有空指针错误。
		
		// 导入工程
		// 删除的时候如果没有选中disk只是从eclipse种删除没有从磁盘上删掉如果选了就真的删掉了所以注意使用
		// file(或者右键package explorer)->import,export 导入和导出(import->general->existsing)(export->file system)
		// 如果存在eclipse的版本问题，可以新建一个空工程，然后把别人的工程下面的src的东西靠到你的项目里面去（这种不受版本不兼容的限制）
		
		// 所有的窗口可以随意拖动
		// 托乱了如何还原？window->reset perspective ...
		// window->show view 哪个需要拖哪个窗口
		
		//拓展方法 选中一个断码片段右键->refactor->extract method  将选中的代码片片段变成方法到都类里面去
		
		//  注释
		// eclipse 工程目录介绍
		// 打开工程目录
		// .settings  eclipse 自动生成的配置文件，不要动
		// bin		     用于存放所有的class文件，编译后的都放在这
		// src		     该目录用于存放所有的java源文件
		// .classpath 自动生成的勿动
		// .project   自动生成的勿动
		
		//快速创建子类重写父类的方法
		/*1.类中右键->source->override implements 选择需要重写的*/
		
		
		//查看项目的jdk版本
		//右键项目->properties->搜索java compiler
		
		System.out.println("--");
	}

}
