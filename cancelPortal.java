package DBMS;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class cancelPortal 
{


	private JTextField txtUsername;
	private JTextField textField;
	public cancelPortal()
	{
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
			
		JLabel label = new JLabel("Cancel Ticket");
		label.setFont(new Font("Arial Black", Font.PLAIN, 19));
		label.setForeground(Color.BLACK);
		
		label.setBounds(210, 72, 250, 30);
		test.panel.add(label);
	

		JButton logout = new JButton("Logout");
		logout.setBounds(460, 5, 117, 25);
		test.panel.add(logout);
		logout.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					new Login();
				}
			});



		JLabel lblUsername = new JLabel("Train Number: ");
		lblUsername.setBounds(130, 134, 150, 15);
		test.panel.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Ticket Number: ");
		lblPassword.setBounds(120, 165, 1350, 15);
		test.panel.add(lblPassword);
		

		JLabel UserName = new JLabel("Username:");
		UserName.setBounds(145, 195, 135, 15);
		test.panel.add(UserName);
		
		
		txtUsername = new JTextField();
		txtUsername.setText("");
		txtUsername.setBounds(230, 128, 114, 24);
		test.panel.add(txtUsername);
		txtUsername.setColumns(10);
		txtUsername.setText("");
		
		textField = new JTextField();
		textField.setBounds(230, 160, 114, 24);
		test.panel.add(textField);
		textField.setColumns(10);
		textField.setText("");
		
		JTextField userField = new JTextField();
		userField.setBounds(230,  190, 114, 24);
		test.panel.add(userField);
		userField.setColumns(10);
		userField.setText("");
		
		JButton btnSubmit = new JButton("CONTINUE");
		btnSubmit.setBounds(268, 267, 117, 25);
		test.panel.add(btnSubmit);
		btnSubmit.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
			
				if(userField.getText().equals("") || txtUsername.getText().equals("") || textField.getText().equals(""))
				{
					Admin_Login.infoBox("One or more fields are blank", "Invalid cancellation");
					new cancelPortal();
				}
				else
				{
					
				try{  
					Class.forName("com.mysql.jdbc.Driver").newInstance();  
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/railwaydatabase?autoReconnect=true&useSSL=false","root","34185");  
					//here sonoo is database name, root is username and password  
					Statement stmt=con.createStatement();
					int i = stmt.executeUpdate("UPDATE `railwaydatabase`.`ticket` SET `Status`='Cancelled' WHERE `TicketNumber`='"+textField.getText()+"';");
					int trainNumber = Integer.parseInt(txtUsername.getText());
					String username = userField.getText();
					int ticketNumber = Integer.parseInt(textField.getText());
					
					ResultSet rs = stmt.executeQuery("SELECT AvailableSeats FROM railwaydatabase.traininfo where TrainNumber = "+trainNumber+" ;");
					rs.next();
					int availableSeat = rs.getInt(1);
					int updateInfo = stmt.executeUpdate("UPDATE `railwaydatabase`.`traininfo` SET `AvailableSeats`='"+(availableSeat+1)+"' WHERE `TrainNumber`='"+trainNumber+"';");
					rs = stmt.executeQuery("SELECT PassengerID FROM railwaydatabase.userlogin join passenger where userlogin.UserName = passenger.Name and UserName = '"+username+"';");
					rs.next();
					int passengerID = rs.getInt(1);
					int fin = stmt.executeUpdate("DELETE FROM `railwaydatabase`.`boards` WHERE `PassengerID`='"+passengerID+"' and`TrainNumber`='"+trainNumber+"';");
					
					Admin_Login.infoBox("Successfully Cancelled. Your amount will be refunded back to your account", "Cancellation Successfull");
					new User_Query();
				
					
					con.close();
					}catch(Exception e){ System.out.println(e);}  
					}  

				
				
			}
			
		});
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setBounds(268, 299, 117, 25);
		test.panel.add(btnExit);
		btnExit.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
				
				
			}
			
		});
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(38, 289, 117, 25);
		test.panel.add(btnBack);
		btnBack.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				new User_Query();
			}
			
		});
	}

	public static void infoBox(String infoMessage, String titleBar)
	{
	    JOptionPane.showMessageDialog(null, infoMessage, "                  " + titleBar, JOptionPane.INFORMATION_MESSAGE);
	}

		
		
		

}
