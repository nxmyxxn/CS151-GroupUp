package gui;

import javax.swing.*; // JFrame을 사용하기 위해 import

public class MainFrame extends JFrame {

		/* constructor */
		public MainFrame()
		{
			setTitle("team4 - GroupUp"); 
			setSize(1200, 800); // frame size
			setVisible(true); 
		}
		
		public static void main(String[] args) 
		{
			MainFrame mf = new MainFrame(); // MainFrame 생성
			MainPage mp = new MainPage(mf);
			mf.add(mp);
		}
	}
