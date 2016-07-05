package file;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

public class Work {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CFile c = new CFile("D:\\javaFunctionCreate\\");
		c.showFile();
	}

}

class CFile {
	File f = null;

	public CFile(String basePath) {
		this.f = new File(basePath);
	}

	public void showFile(String filter) {
		ArrayList<String> al = new ArrayList<String>();
		if (f.isDirectory()) {
			File[] flist = f.listFiles();
			for (File fl : flist) {
				if (fl.isFile() && fl.getName().endsWith(".java")) {
					al.add(fl.getAbsolutePath());
				}
			}
		} else {
			al.add(f.getAbsolutePath());
		}
		showFileList(al);
	}

	public void showFile() {
		ArrayList<String> alFile = new ArrayList<String>();
		ArrayList<String> alDirectory = new ArrayList<String>();
		if (f.isDirectory()) {
			for (File fl : f.listFiles()) {
				if (fl.isDirectory()) {
					// ��ʾ���е��ļ�
					alDirectory.add(fl.getAbsolutePath());
				} else {
					// ��ʾ���е��ļ���
					alFile.add(fl.getAbsolutePath());
				}
			}
			System.out.println("�ļ���=========");
			showFileList(alDirectory);
			System.out.println("�ļ�==========");
			showFileList(alFile);
		} else {
			alFile.add(f.getAbsolutePath());
			showFileList(alFile);
		}
	}

	private void showFileList(ArrayList<String> al) {
		Iterator<String> it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}