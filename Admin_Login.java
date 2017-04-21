package DBMS;

import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;

public class Admin_Login {
	private JTextField txtUsername;
	private JPasswordField textField;
	public static int flag = 1;
	Admin_Login(){
	test.panel.removeAll();
	test.panel.repaint();
	test.panel.revalidate();
	 JLabel lblRailway = new JLabel("<HTML><U>Indian Railways</U><HTML>");
		lblRailway.setFont(new Font("Arial Black", Font.PLAIN, 29));
		lblRailway.setForeground(Color.BLACK);
		lblRailway.setHorizontalAlignment(SwingConstants.CENTER);
		lblRailway.setBounds(100, 20, 340, 50);
		lblRailway.setForeground(Color.decode("#E040FB"));

		test.panel.add(lblRailway);
		
	JLabel label = new JLabel("Admin Login");
	label.setFont(new Font("Arial Black", Font.PLAIN, 19));
	label.setForeground(Color.BLACK);
	
	label.setBounds(210, 72, 250, 30);
	test.panel.add(label);
	
	JLabel lblUsername = new JLabel("USERNAME: ");
	lblUsername.setBounds(150, 134, 70, 15);
	test.panel.add(lblUsername);
	
	JLabel lblPassword = new JLabel("PASSWORD: ");
	lblPassword.setBounds(145, 160, 1350, 15);
	test.panel.add(lblPassword);
	
	txtUsername = new JTextField();
	txtUsername.setText("");
	txtUsername.setBounds(230, 128, 114, 24);
	test.panel.add(txtUsername);
	txtUsername.setColumns(10);
	
	textField = new JPasswordField();
	textField.setBounds(230, 160, 114, 24);
	test.panel.add(textField);
	textField.setColumns(10);
	
	JButton btnSubmit = new JButton("SUBMIT");
	btnSubmit.setBounds(268, 227, 117, 25);
	test.panel.add(btnSubmit);
	btnSubmit.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			try{  
				Class.forName("com.mysql.jdbc.Driver").newInstance();  
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/railwaydatabase?autoReconnect=true&useSSL=false","root","34185");  
				//here sonoo is database name, root is username and password  
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery("select * from adminlogin");  
				while(rs.next())  
				{
					if(rs.getString(1).equals(txtUsername.getText()) && rs.getString(2).equals(textField.getText()))
					{
						flag = 0;
						new Admin_Query();
						break;
					}
					
				}
				
				if(flag == 1)
				{
					Admin_Login.infoBox("Wrong Credentials", "Invalid Login");
					new Admin_Login();
				
				}
				con.close();
				}catch(Exception e){ System.out.println(e);}  
		flag =1;		
		}  

			
			
		
		
	});
	
	JButton btnExit = new JButton("EXIT");
	btnExit.setBounds(268, 259, 117, 25);
	test.panel.add(btnExit);
	btnExit.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
			System.exit(0);
			
			
		}
		
	});
	
	JButton btnBack = new JButton("BACK");
	btnBack.setBounds(38, 249, 117, 25);
	test.panel.add(btnBack);
	btnBack.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
			new StartScreen();
		}
		
	});
}

public static void infoBox(String infoMessage, String titleBar)
{
    JOptionPane.showMessageDialog(null, infoMessage, "                  " + titleBar, JOptionPane.INFORMATION_MESSAGE);
}
}
