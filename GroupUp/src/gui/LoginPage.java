package gui;


import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class LoginPage extends JFrame{
	public JPanel loginPanel = new JPanel();
	private JLabel idLabel = new JLabel("ID ");
	private JLabel pwLabel = new JLabel("PASSWORD ");
	
	private JTextField idText = new JTextField();
	private JPasswordField pwText = new JPasswordField();
	
	private JButton loginBtn = new JButton("Log in");
	private JButton idpwSearchBtn = new JButton("Find id/password");
	
	public LoginPage() {
		super("LoginPage!");
		this.setContentPane(loginPanel);
		loginPanel.setBounds(100, 100, 500, 160);
		loginPanel.setBorder(new EmptyBorder(5,5,5,5));
		
		idLabel.setHorizontalAlignment(SwingConstants.CENTER);
		idLabel.setBounds(40, 30, 47, 15);
		loginPanel.add(idLabel);
		
		pwLabel.setHorizontalAlignment(SwingConstants.CENTER);
		pwLabel.setBounds(40, 55, 47, 15);
		loginPanel.add(pwLabel);	
		
		
		idText.setColumns(10);
		idText.setBounds(100,50,170,21);
		loginPanel.add(idText);
		
		pwText.setBounds(99, 52, 167, 21);
		pwText.setColumns(10);
		loginPanel.add(pwText);
		
		loginPanel.add(idpwSearchBtn);
		loginPanel.add(loginBtn);
		
		setSize(350,150);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
