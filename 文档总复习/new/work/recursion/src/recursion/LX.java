/**
 * renameTo跨盘符只能拷贝文件而且不能放到其它盘符的根下面!!!!!!!!
 */
package recursion;

import java.io.File;

/**
 * @author www.23.com
 * 
 */
public class LX {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 阶乘
		// System.out.println(jc(8));

		// 显示目录结构 -- 使用 |--这种形式
		// showFileList(new File("d:/tmp"),"|--");

		// 删除目录
		// delDir(new File("d:/tmp/xxx"), "|--");

		// 移动目录到指定位置
		// moveTo(new File("d:/tmp"), new File("c:/tmps/admin/map"));
		//System.out.println(new File("d:/c/a.jpeg").renameTo(new File("d:/x.jpeg")));
	}

	/**
	 * 计算阶乘 n!
	 */
	public static double jc(int num) {
		if (num == 1) {
			return 1;
		} else {
			return num * jc(--num);
		}
	}

	/**
	 * 显示目录结构
	 * 
	 * @param dir
	 * @param space
	 */
	public static void showFileList(File dir, String space) {
		// get child file
		File[] items = dir.listFiles();

		// foreach 遍历子文件
		for (File item : items) {
			if (item.isDirectory()) {
				System.out.println(space + item.getName());
				showFileList(item, "|  " + space);
			} else {
				System.out.println(space + item.getName());
			}
		}
	}

	/**
	 * 递归删除指定目录
	 */
	public static void delDir(File file, String space) {
		File[] items = file.listFiles();

		for (File item : items) {
			if (item.isDirectory()) {
				delDir(item, "|  " + space);
			} else {
				if (item.delete()) {
					System.out.println(space + item.getName()
							+ " \t[remove done]");
				}
			}
		}
		if (file.delete()) {
			System.out.println(space + file.getName() + " \t[remove done]");
		}
	}

	/**
	 * MoveTo 递归移动文件
	 * renameTo跨盘符只能拷贝文件而且不能放到其它盘符的根下面
	 */
	public static void moveTo(File dir, File to) {
		if (!to.exists()) {
			to.mkdirs();
		}

		// get dir list

		File[] items = dir.listFiles();

		for (File item : items) {
			File tos = new File(to, item.getName());

			if (item.isDirectory()) {
				// 创建目标目录
				moveTo(item, tos);
			} else {
				// move to
				if (item.renameTo(tos)) {
					System.out.println(item.getName() + "done");
				}
			}
		}
		dir.delete();
	}
	/**
	 * 赋值没有方法必须用到文件流
	 */
}
