/**
 * 贪吃蛇的第二版
 * 
 */
package test;

import java.awt.BorderLayout;
import java.awt.Point;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.LinkedList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author www.23.com
 * 
 */
public class TcsNew {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 显示初始化的地图
		TMap.initMap();

		Foods fd = Foods.getFoods();
		fd.setMap();

		final skem sm = new skem();
		sm.setMap();
		TMap.printMap();

		/*
		 * //move for (int i = 0; i < 3; i++) { Refresh.rf(fd); sm.move(1);
		 * TMap.printMap(); try { Thread.sleep(1000); } catch
		 * (InterruptedException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 * 
		 * }
		 * 
		 * for (int i = 0; i < 3; i++) { Refresh.rf(fd); sm.move(2);
		 * TMap.printMap(); try { Thread.sleep(1000); } catch
		 * (InterruptedException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 * 
		 * }
		 * 
		 * for (int i = 0; i < 3; i++) { Refresh.rf(fd); sm.move(3);
		 * TMap.printMap(); try { Thread.sleep(1000); } catch
		 * (InterruptedException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 * 
		 * }
		 * 
		 * 
		 * for (int i = 0; i < 3; i++) { Refresh.rf(fd); sm.move(4);
		 * TMap.printMap(); try { Thread.sleep(1000); } catch
		 * (InterruptedException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 * 
		 * }
		 */

		JFrame jf = new JFrame("方向盘");
		jf.add(new JButton("up"), BorderLayout.NORTH);
		jf.add(new JButton("down"), BorderLayout.SOUTH);
		jf.add(new JButton("left"), BorderLayout.WEST);
		jf.add(new JButton("right"), BorderLayout.EAST);
		JButton jl = new JButton("方位");
		jf.add(jl, BorderLayout.CENTER);

		jf.setBounds(0, 0, 500, 500);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);

		jl.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				if (keyCode > 36 && keyCode < 41) {
					switch (keyCode) {
					case 38:
						sm.move(1);
						break;
					case 39:
						sm.move(2);
						break;
					case 40:
						sm.move(3);
						break;
					case 37:
						sm.move(4);
						break;
					}
				}
			}
		});
	}

}

class Refresh {
	public static void rf() {
		TMap.initMap();
		Foods.getFoods().setMap();
	}
}

/**
 * create map
 * 
 * @author www.23.com
 * 
 */
interface Arguments {
	int mapX = 50;
	int mapY = 10;
	char food = '@';
	int skemXLen = 3;
	int skemYlen = 1;
	char skemHead = '$';
	char skemSz = '#';
	String gameOverTith = "Game Over";
}

class TMap {
	private static char[][] map = new char[Arguments.mapY][Arguments.mapX];

	public static void initMap() {
		for (int i = 0; i < Arguments.mapY; i++) {
			for (int j = 0; j < Arguments.mapX; j++) {
				// if(i == 0 || i == Arguments.mapY - 1 || j == 0 || j ==
				// Arguments.mapX - 1){
				if (i == 0 || i == Arguments.mapY - 1) {
					map[i][j] = '*';
				} else {
					map[i][j] = ' ';
				}
			}
		}
	}

	public static void printMap() {
		for (int i = 0; i < Arguments.mapY; i++) {
			for (int j = 0; j < Arguments.mapX; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}

	public static char[][] getMap() {
		return map;
	}

	public static boolean checkWheatherAdd(Point pt) {
		boolean rt = false;
		if (pt.x < Arguments.mapX && pt.y < Arguments.mapY
				&& map[pt.y][pt.x] == ' ') {
			rt = true;
		}
		return rt;
	}
}

interface showPoint {
	public void setMap();
}

class Foods implements showPoint {
	private char[][] map = TMap.getMap();
	private static Foods fd = null;
	private Point pt = new Point();

	private Foods() {
		initFood();
	}

	private void initFood() {
		Random rd = new Random();
		while (true) {
			int x = rd.nextInt(Arguments.mapX);
			int y = rd.nextInt(Arguments.mapY);

			pt.x = x;
			pt.y = y;

			if (TMap.checkWheatherAdd(pt)) {
				break;
			}

		}

	}

	@Override
	public void setMap() {
		// TODO Auto-generated method stub
		map[pt.y][pt.x] = Arguments.food;
	}

	public boolean wheatherEat(Point pt) {
		return this.pt.equals(pt);
	}

	public static Foods getFoods() {
		if (fd == null) {
			fd = new Foods();
		}
		return fd;
	}

	public static Foods getFoods(int isnew) {
		if (fd == null || isnew == 1) {
			fd = new Foods();
		}
		return fd;
	}
}

class skem implements showPoint {

	private char[][] map = TMap.getMap();
	private LinkedList<Point> lk = new LinkedList<Point>();
	private int currentDir = 2;

	public skem() {
		initSkem();
	}

	public void initSkem() {
		int mapMdX = Arguments.mapX / 2;
		int mapMdY = Arguments.mapY / 2;

		// skem md
		int skemMdx = Arguments.skemXLen / 2;
		int skemMdY = Arguments.skemYlen / 2;

		mapMdX -= skemMdx;
		mapMdY -= skemMdY;

		for (int i = 0; i < Arguments.skemXLen; i++) {
			Point pt = new Point(mapMdX + i, mapMdY);
			if (TMap.checkWheatherAdd(pt)) {
				lk.addFirst(pt);
			} else {
				lk = null;
				break;
			}

		}
	}

	@Override
	public void setMap() {
		// TODO Auto-generated method stub
		Point hd = lk.getFirst();
		map[hd.y][hd.x] = Arguments.skemHead;

		for (int i = 1; i < lk.size(); i++) {
			Point pt = lk.get(i);
			map[pt.y][pt.x] = Arguments.skemSz;
		}

	}

	public void move(int option) {

		Point hd = lk.getFirst();
		Point pt = null;
		switch (option) {
		case 1:
			if (currentDir != 3) {
				pt = new Point(hd.x, hd.y - 1);
				currentDir = 1;
			}
			break;
		case 2:
			if (currentDir != 4) {
				if (hd.x + 1 < Arguments.mapX) {
					pt = new Point(hd.x + 1, hd.y);
				} else {
					pt = new Point(0, hd.y);
				}
				currentDir = 2;
			}
			break;
		case 3:
			if (currentDir != 1) {
				pt = new Point(hd.x, hd.y + 1);
				currentDir = 3;
			}
			break;
		case 4:
			if (currentDir != 2) {
				if (hd.x - 1 > -1) {
					pt = new Point(hd.x - 1, hd.y);
				} else {
					pt = new Point(Arguments.mapX - 1, hd.y);
				}
				currentDir = 4;
			}
			break;
		}

		if (pt != null) {

			// 横向穿越
			/*
			 * pt.x = Math.max(pt.x, 0); pt.x = Math.min(pt.x, Arguments.mapX);
			 * 
			 * if (currentDir == 2 && pt.x == Arguments.mapX) { pt.x = 0; } else
			 * if (currentDir == 4 && pt.x == 0) { pt.x = Arguments.mapX - 1; }
			 */

			if (TMap.checkWheatherAdd(pt)) {
				lk.addFirst(pt);
				lk.removeLast();
			} else if (Foods.getFoods().wheatherEat(pt)) {
				Foods.getFoods(1);

				// 身体边长
				switch (currentDir) {
				case 1:
					lk.addFirst(new Point(hd.x, hd.y - 1));
					break;
				case 2:
					lk.addFirst(new Point(hd.x + 1, hd.y));
					break;
				case 3:
					lk.addFirst(new Point(hd.x, hd.y + 1));
					break;
				case 4:
					lk.addFirst(new Point(hd.x - 1, hd.y));
					break;
				}
			} else {
				System.out.println(Arguments.gameOverTith);
				System.exit(0);
			}
		}

		Refresh.rf();
		setMap();
		TMap.printMap();
	}

}
