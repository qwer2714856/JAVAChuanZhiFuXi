/**
 * 
 */
package fx;

import java.util.Arrays;
import java.util.Properties;

/**
 * @author www.23.com
 * 
 */
public class Fx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 4, 77, -1, -55, 3 };
		for (int i = 0; i < a.length - 1; i++) {
			int flg = i;
			int tmpData = a[i];
			for (int j = i + 1; j < a.length; j++) {
				if (tmpData > a[j]) {
					flg = j;
					tmpData = a[j];
				}
			}
			int tmp = a[flg];
			a[flg] = a[i];
			a[i] = tmp;
		}
		System.out.println(Arrays.toString(a));
		// 折半查找法
		// find(a, 1, 0, a.length-1);
		
		findWhile(a, 777);
	}

	public static void find(int[] find, int d, int l, int r) {
		int md = (int) ((l + r) / 2);

		if (d != find[md] && l != r) {
			if (d > find[md]) {
				l = md + 1;
			} else {
				r = md - 1;
			}

			find(find, d, l, r);
		} else if (d == find[md]) {
			System.out.println("find it");
		} else {
			System.out.println("not found");
		}
	}

	public static void findWhile(int[] ay, int fd) {
		int l = 0;
		int r = ay.length - 1;
		int md = (l + r) / 2;
		int flg = 0;

		while (l < r) {
			
			if (fd > ay[md]) {
				l = md + 1;
			} else if (fd < ay[md]) {
				r = md - 1;
			} else {
				flg = 1;
				break;
			}
			md = (l + r) / 2;
		}
		if(flg == 1){
			System.out.println("find it");
		}else{
			System.out.println("not found");
		}
	}
}
