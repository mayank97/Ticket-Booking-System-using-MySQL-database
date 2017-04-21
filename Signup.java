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

public class Signup 
{
	
	private JTextField txtUsername;
	private JPasswordField textField;
	private static int flag = 0;

	public Signup()
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
			
		JLabel label = new JLabel("Sign Up");
		label.setFont(new Font("Arial Black", Font.PLAIN, 19));
		label.setForeground(Color.BLACK);
		
		label.setBounds(210, 72, 250, 30);
		test.panel.add(label);
		
		JLabel name = new JLabel("Name");
		name.setBounds(152, 136, 70, 15);
		test.panel.add(name);
		
		JLabel contact = new JLabel("Contact");
		contact.setBounds(152, 162, 70, 15);
		test.panel.add(contact);
		
		JLabel gender = new JLabel("Gender");
		gender.setBounds(152, 187, 70, 15);
		test.panel.add(gender);
		
		JLabel age = new JLabel("Age");
		age.setBounds(152, 212, 70, 15);
		test.panel.add(age);
		
		JLabel address = new JLabel("Address");
		address.setBounds(152, 237, 70, 15);
		test.panel.add(address);
		
		
		JLabel lblUsername = new JLabel("USERNAME: ");
		lblUsername.setBounds(150, 292, 70, 15);
		test.panel.add(lblUsername);
		
		JLabel lblPassword = new JLabel("PASSWORD: ");
		lblPassword.setBounds(145, 317, 1350, 15);
		test.panel.add(lblPassword);
		
		txtUsername = new JTextField();
		txtUsername.setText("");
		txtUsername.setBounds(230, 290, 114, 24);
		test.panel.add(txtUsername);
		txtUsername.setColumns(15);
		
		textField = new JPasswordField();
		textField.setBounds(230, 315, 114, 24);
		test.panel.add(textField);
		textField.setColumns(15);
		
		JTextField nameField = new JTextField();
		nameField.setBounds(230, 134, 114, 24);
		test.panel.add(nameField);
		nameField.setColumns(15);
		
		JTextField contactField = new JTextField();
		contactField.setBounds(230, 160, 114, 24);
		test.panel.add(contactField);
		contactField.setColumns(15);
		
		JTextField genderField = new JTextField();
		genderField.setBounds(230, 185, 114, 24);
		test.panel.add(genderField);
		genderField.setColumns(15);
		
		JTextField ageField = new JTextField();
		ageField.setBounds(230, 210, 114, 24);
		test.panel.add(ageField);
		ageField.setColumns(15);
		
		JTextField addressField = new JTextField();
		addressField.setBounds(230, 235, 114, 24);
		test.panel.add(addressField);
		addressField.setColumns(15);
		
		JButton btnSubmit = new JButton("SIGN UP");
		btnSubmit.setBounds(275, 375, 117, 25);
		test.panel.add(btnSubmit);
		btnSubmit.addActionListener(new ActionListener(){

			/* (non-Javadoc)
			 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
			 */
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(nameField.getText().equals("") || contactField.getText().equals("") || gender.getText().equals("") || age.getText().equals("") || addressField.getText().equals("") || txtUsername.getText().equals("") || textField.getText().equals(""))
				{
					Admin_Login.infoBox("One or more fields left blank", "Invalid details");
					new Signup();
					
			
				}
				else{
				
				try{  
					Class.forName("com.mysql.jdbc.Driver").newInstance();  
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/railwaydatabase?autoReconnect=true&useSSL=false","root","34185");  
					//here sonoo is database name, root is username and password  
					Statement stmt=con.createStatement();
					ResultSet rs=stmt.executeQuery("select UserName from userlogin");  
					flag = 0;
					while(rs.next())  
					{
						if(rs.getString(1).equals(txtUsername.getText()) )
						{

							Admin_Login.infoBox("Username already exists.", "Invalid Login");
							new Signup();
							flag = 1;
							break;
						}
						
					}
					con.close();
					}
				catch(Exception e){ System.out.println(e);}  
				
	//			System.out.println("sdss");
				
					try{  
						Class.forName("com.mysql.jdbc.Driver").newInstance();  
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/railwaydatabase?autoReconnect=true&useSSL=false","root","34185");  
						//here sonoo is database name, root is username and password  
						Statement stmt=con.createStatement();

						//System.out.println("2");
						String samp = "INSERT INTO `railwaydatabase`.`userlogin` (`UserName`, `Password`) VALUES ('"+txtUsername.getText()+"', '" + textField.getText()+ "');";
						int rs=stmt.executeUpdate(samp);  
		//				System.out.println(4);
						ResultSet rs1 = stmt.executeQuery("select * from passenger");
						int number = 0;
						while(rs1.next())
						{
							number = rs1.getInt(1);
						}
						number++;

			//			System.out.println("3");
						String temp = "INSERT INTO `railwaydatabase`.`passenger` (`PassengerID`, `Name`, `Contact`, `Gender`, `Address`, `Age`) VALUES ('"+ number +"', '"+ nameField.getText()+"', '"+contactField.getText()+"', '"+genderField.getText()+"', '"+addressField.getText()+"', '"+ageField.getText()+"');";
						rs = stmt.executeUpdate(temp);
						
						Admin_Login.infoBox("User successfully added", "Signed Up");
						new Login();
						
						
						con.close();
						}
					catch(Exception e){ System.out.println(e);}  
						
					
				
				
				}  
			}
			
		});
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setBounds(275, 405, 117, 25);
		test.panel.add(btnExit);
		btnExit.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
				
				
			}
			
		});
		
		JButton btnBack = new JButton("BACK");
		btnBack.setBounds(38, 390, 117, 25);
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
