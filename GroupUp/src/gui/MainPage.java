package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainPage extends JPanel{

	public MainFrame mf;
	
	public ExitDialog ed;
	
	public MainPage(MainFrame mframe)
	{
		this.mf = mframe;
		setLayout(null);
		
		// Timetable Button
		JButton timetable = new JButton("Timetable");
		
		timetable.setSize(295, 100);
		timetable.setFont(new Font("나눔바른고딕", Font.PLAIN, 30));
		timetable.setLocation(300, 300);
		
		timetable.addActionListener(new TimetableBtn());
		add(timetable);
		
		// Calendar Button
		JButton calendar = new JButton("Calendar");
		
		calendar.setSize(295, 100);
		calendar.setFont(new Font("나눔바른고딕", Font.PLAIN, 30));
		calendar.setLocation(600, 300);
		
		calendar.addActionListener(new CalnedarBtn());
		add(calendar);
		
		// log in , sign up button
		JButton logIn = new JButton("Log In");
		logIn.setSize(100,50);
		logIn.setLocation(500,600);
		
		logIn.addActionListener(new LoginBtn());
		add(logIn);
		
		JButton signUp = new JButton("Sign Up");
		signUp.setSize(100,50);
		signUp.setLocation(600,600);
		
		signUp.addActionListener(new SignupBtn());
		add(signUp);
		
		// Exit Button
		ed = null;
		
		JButton exit = new JButton("X");
		
		exit.setSize(45, 45);
		exit.setLocation(1100, 30);
		
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				ed = new ExitDialog(mframe, "Exit");
				ed.setVisible(true);
			}
		});
		add(exit);
	}
	
	// Timetable button event
	class TimetableBtn implements ActionListener 
	{
		public void actionPerformed(ActionEvent e) 
		{
            
		}
	}
	
	// Calendar button event
	class CalnedarBtn implements ActionListener 
	{ 
		public void actionPerformed(ActionEvent e) 
		{
            
		}
	}
	
	// Login button event
	class LoginBtn implements ActionListener 
	{ 
		public void actionPerformed(ActionEvent e) 
		{
            //JOptionPane.showMessageDialog(null, "loginPage");
            LoginPage lp = new LoginPage();
            lp.setVisible(true);
		}
	}
	
	// Signup button event
	class SignupBtn implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			JOptionPane.showMessageDialog(null, "signupPage");
		}
	}
	
	// ask to exit
	private class ExitDialog extends JDialog
	{
		public ExitDialog(JFrame fr, String title)
		{
			super(fr, title, true);
			
			// Exit button
			JButton exit_btn = new JButton("Exit");

			exit_btn.setSize(100, 40);
			exit_btn.setFont(new Font("나눔바른고딕", Font.PLAIN, 20));
			exit_btn.setLocation(50, 100);
			
			exit_btn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					
					System.exit(0);
				}
			});
			this.add(exit_btn);
			
			// Cancel button
			JButton cancle_btn = new JButton("Cancel");

			cancle_btn.setSize(100, 40);
			cancle_btn.setFont(new Font("나눔바른고딕", Font.PLAIN, 20));
			cancle_btn.setLocation(200, 100);
			
			cancle_btn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					setVisible(false);
					ed = null;
				}
			});
			this.add(cancle_btn);

			setLayout(null);
			setSize(350, 200);
            
			setLocation(getWidth() / 2 + 210 + mf.getLocation().x, 
				getHeight() / 2 + 120 + mf.getLocation().y);
		}
	}
}