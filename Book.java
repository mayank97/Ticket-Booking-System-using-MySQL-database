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
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Book 
{
	

	private JTextField txtUsername;
	private JTextField textField;
	public Book()
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
		
	JLabel label = new JLabel("Book Ticket");
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
	
	JLabel lblPassword = new JLabel("Number of Tickets: ");
	lblPassword.setBounds(105, 165, 1350, 15);
	test.panel.add(lblPassword);
	

	JLabel UserName = new JLabel("Username");
	UserName.setBounds(105, 195, 135, 15);
	test.panel.add(UserName);
	
	
	txtUsername = new JTextField();
	txtUsername.setText("");
	txtUsername.setBounds(230, 128, 114, 24);
	test.panel.add(txtUsername);
	txtUsername.setColumns(10);
	
	textField = new JTextField();
	textField.setBounds(230, 160, 114, 24);
	test.panel.add(textField);
	textField.setColumns(10);
	
	JTextField userField = new JTextField();
	userField.setBounds(230,  190, 114, 24);
	test.panel.add(userField);
	userField.setColumns(10);
	
	JButton btnSubmit = new JButton("SUBMIT");
	btnSubmit.setBounds(268, 227, 117, 25);
	test.panel.add(btnSubmit);
	btnSubmit.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
		
			if(userField.getText().equals("") || txtUsername.getText().equals("") || textField.getText().equals(""))
			{
				Admin_Login.infoBox("One or more fields are blank", "Invalid Book");
				new Book();
			}
			else
			{
				
			try{  
				Class.forName("com.mysql.jdbc.Driver").newInstance();  
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/railwaydatabase?autoReconnect=true&useSSL=false","root","34185");  
				//here sonoo is database name, root is username and password  
				Statement stmt=con.createStatement();
	//			System.out.println(userField.getText());
				ResultSet rs = stmt.executeQuery("SELECT p.PassengerID FROM userlogin as u, passenger as p where u.UserName = P.Name and u.UserName = '"+userField.getText()+"';");  
				rs.next();
				int id = rs.getInt(1);
				rs = stmt.executeQuery("SELECT Price FROM railwaydatabase.train where TrainNumber  = "+txtUsername.getText()+";");
				rs.next();
				int price = rs.getInt(1);
				
				rs = stmt.executeQuery("SELECT * FROM railwaydatabase.ticket;");
				int ticketNumber = 0;
				while(rs.next())  
				{
					ticketNumber = rs.getInt(1);
				}
				ticketNumber++;
				int wow = stmt.executeUpdate("INSERT INTO `railwaydatabase`.`ticket` (`TicketNumber`, `FinalPrice`, `PassengerID`, `Status`) VALUES ('"+ticketNumber+"', '"+(price*(Integer.parseInt(textField.getText())))+"', '"+id+"', 'Confirmed');");
				int wow2 = stmt.executeUpdate("INSERT INTO `railwaydatabase`.`boards` (`PassengerID`, `TrainNumber`, `SeatNumber`) VALUES ('"+id+"', '"+txtUsername.getText()+"', '"+60 +"');");
				
				rs = stmt.executeQuery("select AvailableSeats from traininfo where TrainNumber = "+txtUsername.getText()+";");
				rs.next();
				int seats = rs.getInt(1);
				int total = seats - Integer.parseInt(textField.getText());
				int wow3  = stmt.executeUpdate("UPDATE traininfo SET AvailableSeats = "+ total +" WHERE TrainNumber = "+ txtUsername.getText() +";");
				Admin_Login.infoBox("Successfully Booked", "Seat Confirmed");
				new User_Query();
			
				
				con.close();
				}catch(Exception e){ System.out.println(e);}  
				}  

			
			
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
	
	JButton btnBack = new JButton("Back");
	btnBack.setBounds(38, 249, 117, 25);
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
