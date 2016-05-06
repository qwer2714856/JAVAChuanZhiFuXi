/**
 * 界面搜索文件
 * //需求
 * 1.导航条
 * 2.保存
 * 3.搜索指定目录文件
 * 4.保存到指定文件
 * 5.打开显示指定文件内容
 */
package test;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;


/**
 * @author www.23.com
 *
 */
public class JieMainSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Tools(600,600);
	}

}

class Tools{
	public Tools(int w, int h){
		final JFrame jfm = new JFrame();
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int) ((d.getWidth() - w) / 2);
		int y = (int) ((d.getHeight() - h) / 2);
		jfm.setBounds(x, y, w, h);
		jfm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfm.setResizable(false);
		//jfm.setVisible(true);
		
		//中间
		final JTextArea textArea = new JTextArea(20,20);
		textArea.setLineWrap(true);
		JScrollPane jsp = new JScrollPane();
		jsp.setAutoscrolls(true);
		jsp.setViewportView(textArea);
		
		jfm.add(jsp);
		
		//工具条
		JMenuBar jmb = new JMenuBar();
		//菜单
		JMenu jm = new JMenu("文件");
		//子项
		JMenuItem open = new JMenuItem("打开");
		JMenuItem save = new JMenuItem("保存");
		JMenuItem search = new JMenuItem("搜索");
		jm.add(open);
		jm.add(save);
		jm.add(search);
		jmb.add(jm);
		
		JPanel jp = new JPanel();
		jp.setLayout(new BorderLayout());
		jp.add(jmb,BorderLayout.NORTH);
		
		final JPanel searchPanel = new JPanel();
		searchPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		final JTextField searchTxt = new JTextField("请输入内容...",40);
		JButton jb = new JButton("搜索");
		searchPanel.add(searchTxt);
		searchPanel.add(jb);
		searchPanel.setVisible(false);
		jp.add(searchPanel);
		
		
		jfm.add(jp,BorderLayout.NORTH);
		jfm.setVisible(true);
		
		//addEvent
		//search show
		search.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				searchPanel.setVisible(true);
			}
			
		});
		
		//clear searchTxt content
		searchTxt.addMouseListener(new MouseAdapter() {
			 public void mouseClicked(MouseEvent e) {
				 JTextField searchTxt = (JTextField)e.getSource();
				 if("请输入内容...".equals(searchTxt.getText())){
					 searchTxt.setText("");
				 }
			 }
			 /*public void mouseExited(MouseEvent e) {
				 JTextField searchTxt = (JTextField)e.getSource();
				 if("".equals(searchTxt.getText())){
					 searchTxt.setText("请输入内容...");
				 }
			 }*/
		});
		
		//search
		jb.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String getPath = searchTxt.getText();
				File fl = new File(getPath);
				if(fl.isDirectory()){
					File [] items = fl.listFiles();
					StringBuilder sb = new StringBuilder();
					for(File item : items){
						sb.append(item.getAbsolutePath()+"\r\n");
					}
					textArea.setText(sb.toString());
				}
			}
			
		});
		
		//save to result
		save.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//启一个fileDialog
				FileDialog fg = new FileDialog(jfm,"save",FileDialog.SAVE);
				fg.setVisible(true);
				
				String directory = fg.getDirectory();
				String fileName = fg.getFile();
				
				String read = textArea.getText();
				
				File fl = new File(directory,fileName);
				FileOutputStream fo = null;
				try {
					fo = new FileOutputStream(fl);
					fo.write(read.getBytes());
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} finally{
					if(fo != null){
						try {
							fo.close();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				}
				
			}
			
		});
		
		//open
		open.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				FileDialog fg = new FileDialog(jfm,"load",FileDialog.LOAD);
				fg.setVisible(true);
				
				String directory = fg.getDirectory();
				String fileName = fg.getFile();
				
				File fl = new File(directory,fileName);
				
				if(fl.isFile()){
					BufferedReader br = null;
					try {
						br = new BufferedReader(new FileReader(fl));
						StringBuilder sb = new StringBuilder();
						String tmp = null;
						while((tmp = br.readLine()) != null){
							sb.append(tmp + "\r\n");
						}
						textArea.setText(sb.toString());
						
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} finally{
						if(br != null){
							try {
								br.close();
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
					}
				}
			}
		});
	}
}
