/**
 * 
 */
package test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JToolBar;

interface Settings {
	Color SkemHead = Color.RED;
	Color Skems = Color.BLUE;
	Color wallHead = Color.CYAN;
	Color wallOther = Color.GRAY;
	Color foodColor = Color.BLACK;
	Color gmOver = Color.RED;

	int gridWidth = 20;
	int gridHeight = 20;
	int mapW = 50;
	int mapH = 20;

	int skemNumLen = 3;// this data must lt mapW

	String gameOverTith = "Game Over";
	int FontW = 150;
	int FontH = 90;
	int jmH = 22;
	int fast = 500;
}

class maps {
	private static maps mp;
	private boolean[][] mpsAy = new boolean[Settings.mapH][Settings.mapW];

	private maps() {
		for (int i = 0; i < Settings.mapH; i++) {
			for (int j = 0; j < Settings.mapW; j++) {
				if (i == 0 || i == Settings.mapH - 1) {
					mpsAy[i][j] = true;
				}
			}
		}
	}

	public static maps getMaps() {
		if (mp == null) {
			mp = new maps();
		}
		return mp;
	}

	public boolean[][] getMpsAy() {
		return mpsAy;
	}

}

class Skems extends Thread {
	public static final int UP = 1;
	public static final int RIGHT = 2;
	public static final int DOWN = -1;
	public static final int LEFT = -2;

	private LinkedList<Point> lk = new LinkedList<Point>();
	private int dir = 2;
	private Foodes fd;
	private SkemAwtAd sa;
	private boolean[][] mapAy;
	private int live = 1;

	public Skems(boolean[][] mapAy) {
		// get sm middle
		int smMd = Settings.skemNumLen / 2;
		// get x md
		int mdX = Settings.mapW / 2;
		int mdY = Settings.mapH / 2;

		mdX -= smMd;

		for (int i = 0; i < Settings.skemNumLen; i++) {
			lk.addFirst(new Point(mdX + i, mdY));
		}

		this.mapAy = mapAy;
	}

	public void setLive(int live) {
		this.live = live;
	}

	public int getLive() {
		return live;
	}

	public void setDir(int dir) {
		if (this.dir + dir != 0) {
			this.dir = dir;
		}
	}

	public Foodes getFd() {
		return fd;
	}

	public void setFd(int flg) {
		this.fd = sa.rtFood(flg);
	}

	public void setSa(SkemAwtAd sa) {
		this.sa = sa;
	}

	public LinkedList<Point> getLk() {
		return lk;
	}

	public void move() {

		Point head = lk.getFirst();
		Point pt = null;

		switch (dir) {
		case UP:
			pt = new Point(head.x, head.y - 1);
			break;
		case RIGHT:
			if (head.x + 1 < Settings.mapW) {
				pt = new Point(head.x + 1, head.y);
			} else {
				pt = new Point(0, head.y);
			}
			break;
		case DOWN:
			pt = new Point(head.x, head.y + 1);
			break;
		case LEFT:
			if (head.x - 1 > -1) {
				pt = new Point(head.x - 1, head.y);
			} else {
				pt = new Point(Settings.mapW - 1, head.y);
			}
			break;
		}

		
		
		if (!isGameOver(pt)) {
			if (pt.equals(fd.getPosition())) {
				setFd(1);
			} else {
				lk.removeLast();
			}
		} else {
			setLive(0);
		}

		lk.addFirst(pt);
	}

	public boolean isGameOver(Point pt) {
		boolean rt = false;

		for (Point p : lk) {
			if (pt.equals(p)) {
				rt = true;
				break;
			}
		}

		if (!rt) {
			rt = mapAy[pt.y][pt.x];
		}

		return rt;
	}

	public void run() {
		while (live == 1) {
			try {
				Thread.sleep(Settings.fast);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			move();
			sa.repaint();
		}
	}
}

class Foodes {
	private Point position = new Point();

	public Foodes(boolean[][] mapAy, Skems sm) {
		while (true) {
			Random rd = new Random();
			int x = rd.nextInt(Settings.mapW);
			int y = rd.nextInt(Settings.mapH);
			if (!mapAy[y][x]) {
				position.x = x;
				position.y = y;
				// 食物不能张在蛇的身上
				boolean flg = true;
				for (Point pt : sm.getLk()) {
					if (position.equals(pt)) {
						flg = false;
						break;
					}
				}
				if (flg) {
					break;
				}
			}
		}
	}

	public Point getPosition() {
		return position;
	}
}

/**
 * @author www.23.com
 * 
 */
public class SkemAwtAd extends JPanel {
	// 这个游戏舞台维护着三个对象
	// 第一个地图对象
	private boolean[][] mapAy = maps.getMaps().getMpsAy();
	// 第二个对象蛇
	private Skems sm = new Skems(mapAy);
	// 第三个食物对象
	private Foodes fd = new Foodes(mapAy, sm);
	// 画笔
	private Graphics g;

	public Foodes rtFood(int opt) {
		if (opt == 1) {
			this.fd = new Foodes(mapAy, sm);
		}
		Foodes fd = this.fd;
		return fd;
	}

	public SkemAwtAd() {
		sm.setSa(this);
		sm.setFd(0);
	}
	private static SkemAwtAd sa;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 这是一个场景
		final JFrame jf = new JFrame("贪吃蛇");
		sa = new SkemAwtAd();

		int w = Settings.gridWidth * Settings.mapW + 10;
		int h = Settings.gridHeight * Settings.mapH + 30 + Settings.jmH;
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		jf.setBounds((int) (ds.getWidth() - w) / 2,
				(int) (ds.getHeight() - h) / 2, w, h);
		jf.setResizable(false);
		jf.add(sa);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar jtb = new JMenuBar();
		JMenu jm = new JMenu("游戏");
		JMenuItem jmi = new JMenuItem("重新开始");
		jm.add(jmi);
		jtb.add(jm);

		jf.add(jtb, BorderLayout.NORTH);

		jf.setVisible(true);

		// 获取蛇
		final Skems sm = sa.getSkems();

		KeyAdapter k = new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				switch (e.getKeyCode()) {
				case KeyEvent.VK_UP:
					sm.setDir(1);
					sm.move();
					break;
				case KeyEvent.VK_RIGHT:
					sm.setDir(2);
					sm.move();
					break;
				case KeyEvent.VK_DOWN:
					sm.setDir(-1);
					sm.move();
					break;
				case KeyEvent.VK_LEFT:
					sm.setDir(-2);
					sm.move();
					break;
				}
				sa.repaint();

				if (sm.getLive() == 0) {
					jf.removeKeyListener(this);
				}

			}

		};

		jmi.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					Runtime.getRuntime().exec(
							"java -classpath ./ test.SkemAwtAd ");
					Thread.sleep(1000);
					System.exit(0);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		jf.addKeyListener(k);

		// auto paly
		sm.start();
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);

		this.g = g;

		showMap();
		showFood();
		showSkem();

	}

	private void showMap() {
		for (int i = 0; i < Settings.mapH; i++) {
			for (int j = 0; j < Settings.mapW; j++) {
				if (mapAy[i][j]) {
					g.setColor(Settings.wallHead);
				} else {
					g.setColor(Settings.wallOther);
				}
				g.fill3DRect(j * Settings.gridWidth, i * Settings.gridHeight,
						Settings.gridWidth, Settings.gridHeight, true);
			}
		}
	}

	private void showFood() {
		g.setColor(Settings.foodColor);
		Point pt = fd.getPosition();
		g.fill3DRect(pt.x * Settings.gridWidth, pt.y * Settings.gridHeight,
				Settings.gridWidth, Settings.gridHeight, true);
	}

	private void showSkem() {
		LinkedList<Point> lk = sm.getLk();
		g.setColor(Settings.Skems);
		for (int i = 1; i < lk.size(); i++) {
			Point pt = lk.get(i);
			g.fill3DRect(pt.x * Settings.gridWidth, pt.y * Settings.gridHeight,
					Settings.gridWidth, Settings.gridHeight, true);
		}
		g.setColor(Settings.SkemHead);
		Point hd = lk.getFirst();
		g.fill3DRect(hd.x * Settings.gridWidth, hd.y * Settings.gridHeight,
				Settings.gridWidth, Settings.gridHeight, true);

		if (sm.getLive() == 0) {
			g.setColor(Settings.gmOver);
			g.setFont(new Font("宋体", Font.BOLD, 30));
			g.drawString(Settings.gameOverTith, (Settings.gridWidth
					* Settings.mapW - Settings.FontW) / 2, (Settings.gridHeight
					* Settings.mapH - Settings.FontH) / 2);
		}
	}

	public Skems getSkems() {
		return sm;
	}
}
