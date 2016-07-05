/**
 * renameTo跨盘符只能拷贝文件而且不能放到其它盘符的根下面
 * 递归
 * 函数本身自己调用自己
 * 
 * 使用前提，必须要有条件控制否则容易死循环。
 * 递归是后面结束到前面。从前->后调用 结束调用从后相前返回。
 * 
 */
package recursion;

import java.io.File;
import java.util.Arrays;

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
		// jc(10);
		// System.out.println(jcc(5));

		// 递归显示文件和文件目录
		// showFileList(new File("d:/tmp"),"|--");

		// 递归删除文件
		delFile(new File("d:/tmp/bbb"));

	}

	public static void jc(int count) {
		if (count > 0) {
			for (int i = 1; i <= count; i++) {
				System.out.print(i + "*" + count + "=" + (i * count) + "\t");
			}
			System.out.println();
			jc(--count);
		}
	}

	public static int jcc(int k) {
		int result = k;

		if (k > 1) {
			result *= jcc(--k);
		}

		return result;
	}

	public static void showFileList(File file, String space) {

		String[] fileList = file.list();

		for (String fileName : fileList) {
			File tmpFile = new File(file, fileName);
			if (tmpFile.isDirectory()) {

				System.out.println(space + "start directory is"
						+ tmpFile.getAbsoluteFile());
				showFileList(tmpFile, "|  " + space);
				System.out.println(space + "=============END"
						+ tmpFile.getAbsoluteFile() + "====================");
			} else {
				System.out.println(space + file.getAbsolutePath() + "\\"
						+ fileName);
			}
		}

	}

	/**
	 * 删除非空的文件夹--删除是不进回收站的！！！
	 */
	public static void delFile(File file) {
		File[] fl = file.listFiles();
		for (File item : fl) {
			if (item.isDirectory()) {
				delFile(item);
			} else {
				if (item.delete()) {
					System.out.println(item.getName() + "remove done");
				}
			}
		}
		if (file.delete()) {
			System.out.println("目录:" + file.getName() + "remove done");
		}
	}
	/**
	 * 作业
	 * 题目剪切一个非空的目录。
	 */
}
