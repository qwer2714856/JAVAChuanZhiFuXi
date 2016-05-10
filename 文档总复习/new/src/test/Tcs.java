/**
 * 贪吃蛇
 * 分析事物
 * 游戏的业务逻辑最难搞
 * 
 * 先搞业务逻辑
 * 分析里面有几个对象
 * 
 * 地图
 * 
 * 蛇
 * 
 * 食物
 * 
 * 
 * 了解游戏规则
 * 1.蛇一开初始化是3个结点，出现在地图中间。
 * 2.蛇吃到东西会长长
 * 3.咬到自己会死
 * 4.撞墙会死
 * 5.食物具有随机性，随机生成在地图上
 * 6.食物不能长在石头上
 * 7.食物可以在蛇身上
 * 
 * 
 * ==================================================================
 * 怎样可以避免大篇幅修改代码，建立自己的代码库。 遇到同样问题去代码库去寻找解决方案。        |
 * 避免我们写重复代码，把更好的解决方案拉上去。								|
 * 工作学习遇到比较好的代码就记下来。										|
 * ==================================================================
 * 
 */
package test;

import java.awt.Point;
import java.util.LinkedList;
import java.util.Random;

/**
 * @author www.23.com
 * 
 */
public class Tcs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map mp = new Map(50,10,'*');
		
		//蛇 
		Sk sk = new Sk(mp.getMap());
		//sk.setSkPosition();
		sk.initSkem();
		sk.drawSkem();
		sk.runTopSkem();
		
		Food fd = new Food(mp.getMap());
		fd.initXY();
		
		mp.printMap();
		
		
		//start Thread
		//new Thread(sk).start();
		//界面刷新
		//new Thread(mp).start();
	}

}



final class Map implements Runnable{
	private char [][] map;
	private int w;
	private int h;
	public Map(int w, int h, char split){
		this.w = w;
		this.h = h;
		//init map
		map = new char[h][w];
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
				
				if(i == 0 || i == h-1 || (j == 0 || j == w - 1)){
					map[i][j] = split;
				}else{
					map[i][j] = ' ';
				}
				
			}
		}
	}
	public void printMap(){
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}
	
	public void setMap(char[][] map) {
		this.map = map;
	}
	public char[][] getMap() {
		return map;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			try {
				printMap();
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	
}

class Sk implements Runnable{
	private String ske = "##$";
	private LinkedList<Point> ske2 = new LinkedList<Point>();
	private Food fd;
	private char [][] map;
	private int maxW;
	private int maxH;
	
	public Sk(char [][] map){
		// init ske position
		this.map = map;
		this.maxW = map[0].length;
		this.maxH = map.length;
	}
	public void setSkPosition(){
		//get ske length
		int len = ske.length();
		int runLeftX = 1;
		int runLeftY = 1;
		int runRightX = maxW - 1;
		int runRightY = maxH - 1;
		
		int mdX = (int)(runLeftX + runRightX) / 2;
		int mdY = (int)(runLeftY + runRightY) / 2;
		int mdSkX = (int)len/2;
		int mdSkY = 1;
		
		mdX -= mdSkX;
		mdY -= mdSkY;
		
		if(mdX > 0 && mdY > 0 && mdX+len < maxW && mdY + mdSkY < maxH){
			char [] ch = ske.toCharArray();
			for(int i = 0;i<len;i++){
				map[mdY][mdX+i] = ch[i];
			}
		}
		
	}
	
	public void initSkem(){		
		int x = (int)maxW / 2;
		int y = (int)maxH / 2;
	
		ske2.addFirst(new Point(x-1,y));
		ske2.addFirst(new Point(x,y));
		ske2.addFirst(new Point(x+1,y));
		
	}
	
	public void drawSkem(){
		for(int i = 1; i < ske2.size(); i++){
			Point pt = ske2.get(i);
			map[pt.y][pt.x] = '#';
		}
		Point firstPt = ske2.getFirst();

		map[firstPt.y][firstPt.x] = '$';
	}
	
	public void drawSkem(Point rm){
		drawSkem();
		
		map[rm.y][rm.x] = ' ';
	}
	
	
	public boolean runRightSkem(){
		//获取头结点
		Point lkF = ske2.getFirst();
		boolean rt = false;
		//check
		if ((rt=checkMove(lkF.x + 1, lkF.y))) {
			// 删除尾结点
			Point rm = ske2.removeLast();
			// 添加一个结点
			ske2.addFirst(new Point(lkF.x + 1, lkF.y));
			//画一下
			drawSkem(rm);
		}
		return rt;
	}
	
	
	public boolean runLeftSkem(){
		//获取头结点
		Point lkF = ske2.getLast();
		boolean rt = false;
		//check
		if ((rt = checkMove(lkF.x - 1, lkF.y))) {
			// 删除尾结点
			Point rm = ske2.removeFirst();
			// 添加一个结点
			ske2.addLast(new Point(lkF.x - 1, lkF.y));
			//画一下
			drawSkem(rm);
		}
		return rt;
	}
	
	public boolean runTopSkem(){
		boolean rt = false;
		Point ft = ske2.getFirst();
		if((rt = checkMove(ft.x, ft.y - 1))){
			Point rm = ske2.removeLast();
			ske2.addFirst(new Point(ft.x, ft.y - 1));
			drawSkem(rm);
		}
		return rt;
	}
	
	
	
	private boolean checkMove(int x, int y){
		boolean rt = false;
		if(map[y][x] == ' '){
			rt = true;
		}
		return rt;
	}
	
	public String getSke() {
		return ske;
	}
	public void setSke(String ske) {
		this.ske = ske;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(runRightSkem()){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.exit(0);
	}
	
}
 

class Skm{
	private int x;
	private int y;
	public Skm(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
}



class Food{
	private int x;
	private int y;
	private char [][] map;
	public Food(char [][]map) {
		this.map = map;
		x = map[0].length;
		y = map.length;
	}
	public void initXY(){
		int lx = -1;
		int ly = -1;
		
		Random rd = new Random();
		while (true) {
			lx = rd.nextInt(x);
			ly = rd.nextInt(y);
			if(map[ly][lx] == ' '){
				break;
			}
		}
		
		map[ly][lx] = '@';
		
	}
	
}