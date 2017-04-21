package DBMS;

import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

public class User_Query {
	User_Query(){
		//Login.flag = 1;
		test.panel.removeAll();
		test.panel.repaint();
		test.panel.revalidate();
		//test.frame.remove(test.panel);
		
		 JLabel lblRailway = new JLabel("<HTML><U>Indian Railways</U><HTML>");
			lblRailway.setFont(new Font("Arial Black", Font.PLAIN, 29));
			lblRailway.setForeground(Color.BLACK);
			lblRailway.setHorizontalAlignment(SwingConstants.CENTER);
			lblRailway.setBounds(100, 20, 340, 50);
			lblRailway.setForeground(Color.decode("#E040FB"));

			test.panel.add(lblRailway);
			
		JLabel label = new JLabel("User Query");
		label.setFont(new Font("Arial Black", Font.PLAIN, 19));
		label.setForeground(Color.BLACK);
		
		label.setBounds(210, 72, 250, 30);
		test.panel.add(label);

		
		JRadioButton btnQuery = new JRadioButton("Query-1");
		//query1 definition below
		//Find the routes which a drivers is allowed whose insurance is not expired and has
		//salary above Rs. x.
		btnQuery.setBounds(40, 130, 117, 25);
		test.panel.add(btnQuery);
	
		
		//if(btnQuery.isSelected())
		
		
		
		JRadioButton btnQuery_1 = new JRadioButton("Query-2");
		btnQuery_1.setBounds(40, 160, 117, 25);
		test.panel.add(btnQuery_1);
		////////////////////
		
		//query2 definition below
		//Find the salary of workers on a specifiedroute.
		
		
		/////////////////////
		JRadioButton btnQuery_2 = new JRadioButton("Query-3");
		btnQuery_2.setBounds(40, 190, 117, 25);
		test.panel.add(btnQuery_2);
		///query3 definition below
		//Find all the trains which can be used on a specified route

		
		
		
		
		JRadioButton btnQuery_3 = new JRadioButton("Query-4");
		btnQuery_3.setBounds(40, 220, 117, 25);
		test.panel.add(btnQuery_3);
		//query4 definit
		//Find name of Drivers who are certified to move in a specifiedrange

		
		//////////////////////
		//query5 definition
		//Find the list of all passengers on a given train at the start of journey
		JRadioButton btnQuery_4 = new JRadioButton("Final Ticket Price");
		btnQuery_4.setBounds(40, 250, 157, 25);
		test.panel.add(btnQuery_4);
		
		JRadioButton book = new JRadioButton("Book Ticket");
		book.setBounds(40, 280, 117, 25);
		test.panel.add(book);
		
		JRadioButton classTrain = new JRadioButton("Train Class");
		classTrain.setBounds(40, 310, 117, 25);
		test.panel.add(classTrain);
		

		JRadioButton TicketPrice = new JRadioButton("Booked Tricket Price");
		TicketPrice.setBounds(40, 340, 155, 25);
		test.panel.add(TicketPrice);
		
		JRadioButton basePrice = new JRadioButton("Search Base Pice");
		basePrice.setBounds(430, 120, 155, 25);
		test.panel.add(basePrice);
	
		JRadioButton checkTrain = new JRadioButton("Look for trains");
		checkTrain.setBounds(430, 150, 155, 25);
		test.panel.add(checkTrain);
		
		JRadioButton cancelTicket = new JRadioButton("Cancel Ticket");
		cancelTicket.setBounds(430, 180, 155, 25);
		test.panel.add(cancelTicket);
		
		
		ButtonGroup group = new ButtonGroup();
		group.add(btnQuery_4);
		group.add(btnQuery_3);
		group.add(btnQuery_2);
		group.add(btnQuery_1);
		group.add(btnQuery);
		group.add(book);
		group.add(classTrain);
		group.add(TicketPrice);
		group.add(basePrice);
		group.add(cancelTicket);
		group.add(checkTrain);
		
		JButton contin = new JButton("Continue");
		contin.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						
						if(btnQuery.isSelected())
						{

							//Find whether x number of seats are available in a train.
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
								
							JLabel label = new JLabel("User Query");
							label.setFont(new Font("Arial Black", Font.PLAIN, 19));
							label.setForeground(Color.BLACK);
							
							label.setBounds(210, 72, 250, 30);
							test.panel.add(label);

							
							JLabel salary = new JLabel("Number of seats: ");
							salary.setBounds(15, 197, 120, 15);
							test.panel.add(salary);
							
							
							
							
							JLabel desc = new JLabel("Find the number of seats ");
							desc.setBounds(15, 130, 300, 20);
							test.panel.add(desc);
							JLabel desc1 = new JLabel("     available in a train");
							desc1.setBounds(15, 150, 300, 20);
							test.panel.add(desc1);
							
							
							JTextField xin = new JTextField();
							xin.setBounds(120, 197, 114, 19);
							test.panel.add(xin);
							xin.setColumns(10);
							
							JButton x = new JButton("Submit");
							x.setBounds(60, 270, 117, 25);
							test.panel.add(x);
							
							//Submit karne pr query execute hogi
							x.addActionListener(new ActionListener(){

								@Override
								public void actionPerformed(ActionEvent arg0) {
									test.panel.repaint();
									test.panel.revalidate();
									
									
									JTable table = new JTable(0,2);
									table.setBackground(new Color(195, 252, 84));
									DefaultTableModel model = (DefaultTableModel) table.getModel();
									table.setBounds(255,187,260,180);
									
									
									model.addRow(new Object[]{"<HTML><B>TrainNumber</B><HTML>", "<HTML><B>AvailableSeats</B><HTML>"});
									if(!(xin.getText().equals("")) )
										{

											try{  
											
											Class.forName("com.mysql.jdbc.Driver").newInstance();  
											Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/railwaydatabase?autoReconnect=true&useSSL=false","root","34185");  
											//here sonoo is database name, root is username and password  
											Statement stmt=con.createStatement();
											ResultSet rs=stmt.executeQuery("SELECT TrainNumber, AvailableSeats FROM railwaydatabase.traininfo where AvailableSeats >= " +xin.getText() +";");  
											
											ArrayList<Object> myArr = new ArrayList<Object>();
											
											while(rs.next())  
											{
												myArr.add(new Object[]{rs.getInt(1), rs.getInt(2)});
											
											}
//											System.out.println(myArr.size());
											
											if(myArr.size() <=10)
											{
												for(int i =0; i<myArr.size();i++)
												{
													Object[] obj;
													obj = (Object[]) myArr.get(i);
													model.addRow(obj);
												}
											}
											if(myArr.size() > 10)
											{
												for(int i =0; i<10;i++)
												{
													Object[] obj;
													obj = (Object[]) myArr.get(i);
													model.addRow(obj);
												}

												
												JButton next = new JButton("Next");
												next.setBounds(455, 375, 60, 20);
												test.panel.add(next);
												next.addActionListener(new ActionListener()
														{
															public void actionPerformed(ActionEvent e)
															{
																next.setEnabled(false);
																JTable table2 = new JTable(0,2);
																table2.setBackground(new Color(195, 252, 84));
																DefaultTableModel model2 = (DefaultTableModel) table2.getModel();
																table2.setBounds(255,187,260,180);
																test.panel.remove(table);
																
																model2.addRow(new Object[]{"<HTML><B>TrainNumber</B><HTML>", "<HTML><B>AvailableSeats</B><HTML>"});
																
																for(int i=10;i<myArr.size();i++)
																{
																	Object[] obj;
																	obj = (Object[]) myArr.get(i);
																	model2.addRow(obj);
																}
																test.panel.add(table2);
																test.panel.revalidate();
																test.panel.repaint();
															}
														});
											}
											

											con.close();
											}
											catch(Exception e){ System.out.println(e);}
										}
										else
										{
											new User_Query();
										}
									test.panel.add(table);
									
								}
								
							});
							
							JButton Back = new JButton("Back");
							Back.setBounds(60, 300, 117, 25);
							test.panel.add(Back);
							Back.addActionListener(new ActionListener(){

								@Override
								public void actionPerformed(ActionEvent arg0) {
									new User_Query();
									
									
								}
								
							});
							
							JButton book = new JButton("Book Ticket");
							book.setBounds(440, 410, 117, 25);
							test.panel.add(book);
							book.addActionListener(new ActionListener()
									{
										public void actionPerformed(ActionEvent e)
										{
											new Book();
										}
									});
							
							JButton exit = new JButton("Exit");
							exit.setBounds(60, 330, 117, 25);
							test.panel.add(exit);
							exit.addActionListener(new ActionListener(){

								@Override
								public void actionPerformed(ActionEvent arg0) {
									System.exit(0);
									
									
								}
								
							});
							
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

						}
						else if(btnQuery_1.isSelected())
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
								
							JLabel label = new JLabel("User Query");
							label.setFont(new Font("Arial Black", Font.PLAIN, 19));
							label.setForeground(Color.BLACK);
							
							label.setBounds(210, 72, 250, 30);
							test.panel.add(label);

							JLabel salary = new JLabel("PassengerID: ");
							salary.setBounds(30, 190, 120, 15);
							test.panel.add(salary);
							JLabel desc = new JLabel("Check reservation status");
							desc.setBounds(30, 130, 300, 20);
							test.panel.add(desc);
							
							JTextField xin = new JTextField("");
							xin.setBounds(120, 190, 114, 19);
							test.panel.add(xin);
							xin.setColumns(10);
							
							
							JButton x = new JButton("Submit");
							x.setBounds(60, 230, 117, 25);
							test.panel.add(x);
							
							//Submit karne pr query execute hogi
							x.addActionListener(new ActionListener(){

								@Override
								public void actionPerformed(ActionEvent arg0) {
									
									test.panel.repaint();
									test.panel.revalidate();
									
									
									JTable table = new JTable(0,2);
									table.setBackground(new Color(195, 252, 84));
									DefaultTableModel model = (DefaultTableModel) table.getModel();
									table.setBounds(250,180,260,180);
									
									model.addRow(new Object[]{"<HTML><B>TicketNumber</B><HTML>", "<HTML><B>Status</B><HTML>"});
									if(!(xin.getText().equals("")))
										{

											try{  
											
											Class.forName("com.mysql.jdbc.Driver").newInstance();  
											Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/railwaydatabase?autoReconnect=true&useSSL=false","root","34185");  
											//here sonoo is database name, root is username and password  
											Statement stmt=con.createStatement();
											ResultSet rs=stmt.executeQuery("SELECT TicketNumber,Status FROM railwaydatabase.ticket where PassengerID = "+ xin.getText()+";");  


											
											ArrayList<Object> myArr = new ArrayList<Object>();
											
											while(rs.next())  
											{
												myArr.add(new Object[]{rs.getInt(1), rs.getString(2)});
											
											}
//											System.out.println(myArr.size());
											
											if(myArr.size() <=10)
											{
												for(int i =0; i<myArr.size();i++)
												{
													Object[] obj;
													obj = (Object[]) myArr.get(i);
													model.addRow(obj);
												}
											}
											if(myArr.size() > 10)
											{
												for(int i =0; i<10;i++)
												{
													Object[] obj;
													obj = (Object[]) myArr.get(i);
													model.addRow(obj);
												}

												
												JButton next = new JButton("Next");
												next.setBounds(455, 375, 60, 20);
												test.panel.add(next);
												next.addActionListener(new ActionListener()
														{
															public void actionPerformed(ActionEvent e)
															{
																next.setEnabled(false);
																JTable table2 = new JTable(0,2);
																table2.setBackground(new Color(195, 252, 84));
																DefaultTableModel model2 = (DefaultTableModel) table2.getModel();
																table2.setBounds(250,180,260,180);
																test.panel.remove(table);
																
																model2.addRow(new Object[]{"<HTML><B>TicketNumber</B><HTML>", "<HTML><B>Status</B><HTML>"});
																
																for(int i=10;i<myArr.size();i++)
																{
																	Object[] obj;
																	obj = (Object[]) myArr.get(i);
																	model2.addRow(obj);
																}
																test.panel.add(table2);
																test.panel.revalidate();
																test.panel.repaint();
															}
														});
											}
											

											
											

											con.close();
											}
											catch(Exception e){ System.out.println(e);}
										}
										else
										{
											new User_Query();
										}
									
									test.panel.add(table);

								}
								
							});
							
							JButton Back = new JButton("Back");
							Back.setBounds(60, 260, 117, 25);
							test.panel.add(Back);
							Back.addActionListener(new ActionListener(){

								@Override
								public void actionPerformed(ActionEvent arg0) {
									new User_Query();
									
									
								}
								
							});
							
							JButton book = new JButton("Book Ticket");
							book.setBounds(440, 410, 117, 25);
							test.panel.add(book);
							book.addActionListener(new ActionListener()
									{
										public void actionPerformed(ActionEvent e)
										{
											new Book();
										}
									});
							
							
							JButton exit = new JButton("Exit");
							exit.setBounds(60, 290, 117, 25);
							test.panel.add(exit);
							exit.addActionListener(new ActionListener(){

								@Override
								public void actionPerformed(ActionEvent arg0) {
									System.exit(0);
									
									
								}
								
							});
							
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
							

						}
						else if(btnQuery_2.isSelected())
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
								
							JLabel label = new JLabel("User Query");
							label.setFont(new Font("Arial Black", Font.PLAIN, 19));
							label.setForeground(Color.BLACK);
							
							label.setBounds(210, 72, 250, 30);
							test.panel.add(label);

							
							
							JLabel source = new JLabel("Source: ");
							source.setBounds(20, 180, 70, 15);
							test.panel.add(source);
							
							JLabel destination = new JLabel("Destination: ");
							destination.setBounds(10, 210, 70, 15);
							test.panel.add(destination);
							
							
							JLabel desc = new JLabel("        Find the cheapest route ");
							desc.setBounds(20, 120, 300, 20);
							test.panel.add(desc);
							JLabel desc1 = new JLabel("between source and destination");
							desc1.setBounds(20, 140, 300, 20);
							test.panel.add(desc1);
							JTextField xin = new JTextField("");
							xin.setBounds(85, 180, 114, 19);
							test.panel.add(xin);
							xin.setColumns(10);
							
							
							JTextField xin2 = new JTextField("");
							xin2.setBounds(85, 210, 114, 19);
							test.panel.add(xin2);
							xin2.setColumns(10);
							
							
							
							JButton x = new JButton("Submit");
							x.setBounds(60, 260, 117, 25);
							test.panel.add(x);
							
							//Submit karne pr query execute hogi
							x.addActionListener(new ActionListener(){

								@Override
								public void actionPerformed(ActionEvent arg0) {

									test.panel.repaint();
									test.panel.revalidate();
									
									JTable table = new JTable(0,2);
									table.setBackground(new Color(195, 252, 84));
									DefaultTableModel model = (DefaultTableModel) table.getModel();
									table.setBounds(250,180,260,180);
									
									model.addRow(new Object[]{"<HTML><B>RouteID</B><HTML>", "<HTML><B>Min Price</B><HTML>"});
									if(!(xin.getText().equals("")) && !(xin2.getText().equals("")))
										{

											try{  
											
											Class.forName("com.mysql.jdbc.Driver").newInstance();  
											Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/railwaydatabase?autoReconnect=true&useSSL=false","root","34185");  
											//here sonoo is database name, root is username and password  
											Statement stmt=con.createStatement();
											ResultSet rs=stmt.executeQuery("SELECT RouteID,min(price) FROM railwaydatabase.route natural join traininfo natural join train where source = '"+xin.getText()+"' and Destination = '"+xin2.getText()+"';");  

									
											ArrayList<Object> myArr = new ArrayList<Object>();
											
											while(rs.next())  
											{
												myArr.add(new Object[]{rs.getInt(1), rs.getInt(2)});
											
											}
//											System.out.println(myArr.size());
											
											if(myArr.size() <=10)
											{
												for(int i =0; i<myArr.size();i++)
												{
													Object[] obj;
													obj = (Object[]) myArr.get(i);
													model.addRow(obj);
												}
											}
											if(myArr.size() > 10)
											{
												for(int i =0; i<10;i++)
												{
													Object[] obj;
													obj = (Object[]) myArr.get(i);
													model.addRow(obj);
												}

												
												JButton next = new JButton("Next");
												next.setBounds(455, 375, 60, 20);
												test.panel.add(next);
												next.addActionListener(new ActionListener()
														{
															public void actionPerformed(ActionEvent e)
															{
																next.setEnabled(false);
																next.setEnabled(false);
																JTable table2 = new JTable(0,2);
																table2.setBackground(new Color(195, 252, 84));
																DefaultTableModel model2 = (DefaultTableModel) table2.getModel();
																table2.setBounds(250,180,260,180);
																test.panel.remove(table);
																
																model2.addRow(new Object[]{"<HTML><B>RouteID</B><HTML>", "<HTML><B>Min Price</B><HTML>"});
																
																for(int i=10;i<myArr.size();i++)
																{
																	Object[] obj;
																	obj = (Object[]) myArr.get(i);
																	model2.addRow(obj);
																}
																test.panel.add(table2);
																test.panel.revalidate();
																test.panel.repaint();
															}
														});
											}
											

											
											
											
											
											
											con.close();
											}
											catch(Exception e){ System.out.println(e);}
										}
										else
										{
											new User_Query();
										}
									
									test.panel.add(table);

								}
								
							});
							
							JButton Back = new JButton("Back");
							Back.setBounds(60, 290, 117, 25);
							test.panel.add(Back);
							Back.addActionListener(new ActionListener(){

								@Override
								public void actionPerformed(ActionEvent arg0) {
									new User_Query();
									
									
								}
								
							});
							
							JButton book = new JButton("Book Ticket");
							book.setBounds(440, 410, 117, 25);
							test.panel.add(book);
							book.addActionListener(new ActionListener()
									{
										public void actionPerformed(ActionEvent e)
										{
											new Book();
										}
									});
							
							
							JButton exit = new JButton("Exit");
							exit.setBounds(60, 320, 117, 25);
							test.panel.add(exit);
							exit.addActionListener(new ActionListener(){

								@Override
								public void actionPerformed(ActionEvent arg0) {
									System.exit(0);
									
									
								}
								
							});
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
							

						}
						else if(btnQuery_3.isSelected())
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
								
							JLabel label = new JLabel("User Query");
							label.setFont(new Font("Arial Black", Font.PLAIN, 19));
							label.setForeground(Color.BLACK);
							
							label.setBounds(210, 72, 250, 30);
							test.panel.add(label);

							
							JLabel desc = new JLabel("Trains to board to reach the destination before");
							desc.setBounds(20, 120, 300, 20);
							test.panel.add(desc);
							JLabel desc1 = new JLabel("the specified time with not more than 2 changes");
							desc1.setBounds(20, 140, 300, 20);
							test.panel.add(desc1);
							
							JLabel source = new JLabel("Source: ");
							source.setBounds(25, 180, 114, 20);
							test.panel.add(source);
							
							JLabel destination = new JLabel("Destination: ");
							destination.setBounds(5, 205, 114, 20);
							test.panel.add(destination);
							
							JLabel time = new JLabel("Time: ");
							time.setBounds(38,230, 114, 20);
							test.panel.add(time);
							
							
							JTextField xin = new JTextField("");
							xin.setBounds(80, 180, 114, 20);
							test.panel.add(xin);
							xin.setColumns(10);
							
							JTextField xin2 = new JTextField("");
							xin2.setBounds(80, 205, 114, 20);
							test.panel.add(xin2);
							xin2.setColumns(10);
							

							JTextField xin3 = new JTextField("");
							xin3.setBounds(80, 230, 114, 20);
							test.panel.add(xin3);
							xin3.setColumns(10);

							JButton x = new JButton("Submit");
							x.setBounds(60, 280, 117, 25);
							test.panel.add(x);
							
							//Submit karne pr query execute hogi
							x.addActionListener(new ActionListener(){

								@Override
								public void actionPerformed(ActionEvent arg0) {

									test.panel.repaint();
									test.panel.revalidate();
									
									JTable table = new JTable(0,2);
									table.setBackground(new Color(195, 252, 84));
									DefaultTableModel model = (DefaultTableModel) table.getModel();
									table.setBounds(245,200,260,180);
									
									model.addRow(new Object[]{"<HTML><B>TrainNumber</B><HTML>", "<HTML><B>TrainName</B><HTML>"});
									if(!(xin.getText().equals("")) && !(xin2.getText().equals("")) && !(xin3.getText().equals("")))
										{

											try{  
											
											Class.forName("com.mysql.jdbc.Driver").newInstance();  
											Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/railwaydatabase?autoReconnect=true&useSSL=false","root","34185");  
											//here sonoo is database name, root is username and password  
											Statement stmt=con.createStatement();
											String temp = xin3.getText();
											temp = temp.substring(0, 2)+ temp.substring(3,5);
											int timer = Integer.parseInt(temp);
											
											ResultSet rs=stmt.executeQuery("SELECT ArrivalTime,TrainNumber, TrainName FROM railwaydatabase.traininfo natural join detail where Source = '"+xin.getText()+"' and Destination = '"+xin2.getText()+"';");  
											while(rs.next())  
											{
												String sideTime = rs.getString(1);
												sideTime = sideTime.substring(0, 2) + sideTime.substring(3, 5);
												int timer2 = Integer.parseInt(sideTime);
												if(timer2 < timer)
												{
													model.addRow(new Object[]{rs.getInt(2), rs.getString(3)});
												}
											
											}

											con.close();
											}
											catch(Exception e){ System.out.println(e);}
										}
										else
										{
											new User_Query();
										}
									
									test.panel.add(table);

								}
								
							});
							
							JButton Back = new JButton("Back");
							Back.setBounds(60, 310, 117, 25);
							test.panel.add(Back);
							Back.addActionListener(new ActionListener(){

								@Override
								public void actionPerformed(ActionEvent arg0) {
									new User_Query();
									
									
								}
								
							});
							
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
							
							JButton exit = new JButton("Exit");
							exit.setBounds(60, 340, 117, 25);
							test.panel.add(exit);
							exit.addActionListener(new ActionListener(){

								@Override
								public void actionPerformed(ActionEvent arg0) {
									System.exit(0);
									
									
								}
								
							});
							JButton book = new JButton("Book Ticket");
							book.setBounds(440, 410, 117, 25);
							test.panel.add(book);
							book.addActionListener(new ActionListener()
									{
										public void actionPerformed(ActionEvent e)
										{
											new Book();
										}
									});
							
							
							

						}
						else if(btnQuery_4.isSelected())
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
								
							JLabel label = new JLabel("User Query");
							label.setFont(new Font("Arial Black", Font.PLAIN, 19));
							label.setForeground(Color.BLACK);
							
							label.setBounds(210, 72, 250, 30);
							test.panel.add(label);

							
							
							JLabel desc = new JLabel("Check final price of ticket");
							desc.setBounds(20, 140, 300, 20);
							test.panel.add(desc);
							
							
							JLabel source = new JLabel("Username: ");
							source.setBounds(20, 200, 114, 20);
							test.panel.add(source);
							
							JTextField xin = new JTextField("");
							xin.setBounds(100, 200, 114, 20);
							test.panel.add(xin);
							xin.setColumns(10);
							
							JButton x = new JButton("Submit");
							x.setBounds(60, 260, 117, 25);
							test.panel.add(x);

							
							//Submit karne pr query execute hogi
							x.addActionListener(new ActionListener(){

								@Override
								public void actionPerformed(ActionEvent arg0) {

									test.panel.repaint();
									test.panel.revalidate();
									
									JTable table = new JTable(0,2);
									table.setBackground(new Color(195, 252, 84));
									DefaultTableModel model = (DefaultTableModel) table.getModel();
									table.setBounds(255,190,260,200);
									
									model.addRow(new Object[]{"<HTML><B>TicketNumber</B><HTML>", "<HTML><B>FinalPrice</B><HTML>"});
									if(!(xin.getText().equals("")))
										{

											try{  
											
											Class.forName("com.mysql.jdbc.Driver").newInstance();  
											Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/railwaydatabase?autoReconnect=true&useSSL=false","root","34185");  
											//here sonoo is database name, root is username and password  
											Statement stmt=con.createStatement();
											ResultSet rs=stmt.executeQuery("SELECT TicketNumber, FinalPrice FROM railwaydatabase.passenger natural join ticket where Name = '"+xin.getText()+"';");  
											while(rs.next())  
											{
												model.addRow(new Object[]{rs.getInt(1), rs.getInt(2)});
											
											}

											con.close();
											}
											catch(Exception e){ System.out.println(e);}
										}
										else
										{
											new User_Query();
										}
									
									test.panel.add(table);						
								}
								
							});
							
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
							
							JButton Back = new JButton("Back");
							Back.setBounds(60, 290, 117, 25);
							test.panel.add(Back);
							Back.addActionListener(new ActionListener(){

								@Override
								public void actionPerformed(ActionEvent arg0) {
									new User_Query();
									
									
								}
								
							});
							
							JButton exit = new JButton("Exit");
							exit.setBounds(60, 320, 117, 25);
							test.panel.add(exit);
							exit.addActionListener(new ActionListener(){

								@Override
								public void actionPerformed(ActionEvent arg0) {
									System.exit(0);
									
									
								}
								
							});
							
							JButton book = new JButton("Book Ticket");
							book.setBounds(440, 410, 117, 25);
							test.panel.add(book);
							book.addActionListener(new ActionListener()
									{
										public void actionPerformed(ActionEvent e)
										{
											new Book();
										}
									});
							
							
							

						}
						else if(book.isSelected())
						{
							new Book();
						}
						else if(classTrain.isSelected())
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
								
							JLabel label = new JLabel("User Query");
							label.setFont(new Font("Arial Black", Font.PLAIN, 19));
							label.setForeground(Color.BLACK);
							
							label.setBounds(210, 72, 250, 30);
							test.panel.add(label);

							JLabel salary = new JLabel("TrainNumber: ");
							salary.setBounds(30, 190, 120, 15);
							test.panel.add(salary);
							JLabel desc = new JLabel("Check train class");
							desc.setBounds(30, 130, 300, 20);
							test.panel.add(desc);
							
							JTextField xin = new JTextField("");
							xin.setBounds(120, 190, 114, 19);
							test.panel.add(xin);
							xin.setColumns(10);
							
							
							JButton x = new JButton("Submit");
							x.setBounds(60, 230, 117, 25);
							test.panel.add(x);
							
							//Submit karne pr query execute hogi
							x.addActionListener(new ActionListener(){

								@Override
								public void actionPerformed(ActionEvent arg0) {
									
									test.panel.repaint();
									test.panel.revalidate();
									
									
									JTable table = new JTable(0,1);
									table.setBackground(new Color(195, 252, 84));
									DefaultTableModel model = (DefaultTableModel) table.getModel();
									table.setBounds(260,180,260,180);
									
									model.addRow(new Object[]{"<HTML><B>TrainClass</B><HTML>"});
									if(!(xin.getText().equals("")))
										{

											try{  
											
											Class.forName("com.mysql.jdbc.Driver").newInstance();  
											Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/railwaydatabase?autoReconnect=true&useSSL=false","root","34185");  
											//here sonoo is database name, root is username and password  
											Statement stmt=con.createStatement();
											ResultSet rs=stmt.executeQuery("Select Class from train where TrainNumber = "+xin.getText()+";");  
											while(rs.next())  
											{
												model.addRow(new Object[]{rs.getString(1)});
											
											}

											con.close();
											}
											catch(Exception e){ System.out.println(e);}
										}
										else
										{
											new User_Query();
										}
									
									test.panel.add(table);

								}
								
							});
							
							JButton Back = new JButton("Back");
							Back.setBounds(60, 260, 117, 25);
							test.panel.add(Back);
							Back.addActionListener(new ActionListener(){

								@Override
								public void actionPerformed(ActionEvent arg0) {
									new User_Query();
									
									
								}
								
							});
							
							JButton book = new JButton("Book Ticket");
							book.setBounds(440, 410, 117, 25);
							test.panel.add(book);
							book.addActionListener(new ActionListener()
									{
										public void actionPerformed(ActionEvent e)
										{
											new Book();
										}
									});
							
							
							JButton exit = new JButton("Exit");
							exit.setBounds(60, 290, 117, 25);
							test.panel.add(exit);
							exit.addActionListener(new ActionListener(){

								@Override
								public void actionPerformed(ActionEvent arg0) {
									System.exit(0);
									
									
								}
								
							});
							
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
							


						}
						
						else if(TicketPrice.isSelected())
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
									
								JLabel label = new JLabel("User Query");
								label.setFont(new Font("Arial Black", Font.PLAIN, 19));
								label.setForeground(Color.BLACK);
								
								label.setBounds(210, 72, 250, 30);
								test.panel.add(label);

								JLabel salary = new JLabel("PassengerID: ");
								salary.setBounds(30, 190, 120, 15);
								test.panel.add(salary);
								JLabel desc = new JLabel("Check price of booked ticket");
								desc.setBounds(30, 130, 300, 20);
								test.panel.add(desc);
								
								JTextField xin = new JTextField("");
								xin.setBounds(120, 190, 114, 19);
								test.panel.add(xin);
								xin.setColumns(10);
								
								
								JButton x = new JButton("Submit");
								x.setBounds(60, 230, 117, 25);
								test.panel.add(x);
								
								//Submit karne pr query execute hogi
								x.addActionListener(new ActionListener(){

									@Override
									public void actionPerformed(ActionEvent arg0) {
										
										test.panel.repaint();
										test.panel.revalidate();
										
										
										JTable table = new JTable(0,3);
										table.setBackground(new Color(195, 252, 84));
										DefaultTableModel model = (DefaultTableModel) table.getModel();
										table.setBounds(260,180,260,180);
										
										model.addRow(new Object[]{"<HTML><B>TicketNumber</B><HTML>","<HTML><B>FinalPrice</B><HTML>","<HTML><B>Status</B><HTML>"});
										if(!(xin.getText().equals("")))
											{

												try{  
												
												Class.forName("com.mysql.jdbc.Driver").newInstance();  
												Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/railwaydatabase?autoReconnect=true&useSSL=false","root","34185");  
												//here sonoo is database name, root is username and password  
												Statement stmt=con.createStatement();
												ResultSet rs=stmt.executeQuery("SELECT TicketNumber,FinalPrice,Status FROM railwaydatabase.ticket where PassengerID = "+xin.getText()+";");  
												while(rs.next())  
												{
													model.addRow(new Object[]{rs.getInt(1), rs.getInt(2), rs.getString(3)});
												
												}

												con.close();
												}
												catch(Exception e){ System.out.println(e);}
											}
											else
											{
												new User_Query();
											}
										
										test.panel.add(table);

									}
									
								});
								
								JButton Back = new JButton("Back");
								Back.setBounds(60, 260, 117, 25);
								test.panel.add(Back);
								Back.addActionListener(new ActionListener(){

									@Override
									public void actionPerformed(ActionEvent arg0) {
										new User_Query();
										
										
									}
									
								});
								
								JButton book = new JButton("Book Ticket");
								book.setBounds(440, 410, 117, 25);
								test.panel.add(book);
								book.addActionListener(new ActionListener()
										{
											public void actionPerformed(ActionEvent e)
											{
												new Book();
											}
										});
								
								
								JButton exit = new JButton("Exit");
								exit.setBounds(60, 290, 117, 25);
								test.panel.add(exit);
								exit.addActionListener(new ActionListener(){

									@Override
									public void actionPerformed(ActionEvent arg0) {
										System.exit(0);
										
										
									}
									
								});
								
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
								



						}

						else if(basePrice.isSelected())
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
									
								JLabel label = new JLabel("User Query");
								label.setFont(new Font("Arial Black", Font.PLAIN, 19));
								label.setForeground(Color.BLACK);
								
								label.setBounds(210, 72, 250, 30);
								test.panel.add(label);

								JLabel salary = new JLabel("TrainNumber: ");
								salary.setBounds(30, 190, 120, 15);
								test.panel.add(salary);
								JLabel desc = new JLabel("Check base price of train");
								desc.setBounds(30, 130, 300, 20);
								test.panel.add(desc);
								
								JTextField xin = new JTextField("");
								xin.setBounds(120, 190, 114, 19);
								test.panel.add(xin);
								xin.setColumns(10);
								
								
								JButton x = new JButton("Submit");
								x.setBounds(60, 230, 117, 25);
								test.panel.add(x);
								
								//Submit karne pr query execute hogi
								x.addActionListener(new ActionListener(){

									@Override
									public void actionPerformed(ActionEvent arg0) {
										
										test.panel.repaint();
										test.panel.revalidate();
										
										
										JTable table = new JTable(0,1);
										table.setBackground(new Color(195, 252, 84));
										DefaultTableModel model = (DefaultTableModel) table.getModel();
										table.setBounds(270,180,260,180);
										
										model.addRow(new Object[]{"<HTML><B>Base Price</B><HTML>"});
										if(!(xin.getText().equals("")))
											{

												try{  
												
												Class.forName("com.mysql.jdbc.Driver").newInstance();  
												Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/railwaydatabase?autoReconnect=true&useSSL=false","root","34185");  
												//here sonoo is database name, root is username and password  
												Statement stmt=con.createStatement();
												ResultSet rs=stmt.executeQuery("SELECT Price FROM railwaydatabase.train where TrainNumber = "+xin.getText()+";");  
												while(rs.next())  
												{
													model.addRow(new Object[]{rs.getInt(1)});
												
												}

												con.close();
												}
												catch(Exception e){ System.out.println(e);}
											}
											else
											{
												new User_Query();
											}
										
										test.panel.add(table);

									}
									
								});
								
								JButton Back = new JButton("Back");
								Back.setBounds(60, 260, 117, 25);
								test.panel.add(Back);
								Back.addActionListener(new ActionListener(){

									@Override
									public void actionPerformed(ActionEvent arg0) {
										new User_Query();
										
										
									}
									
								});
								
								JButton book = new JButton("Book Ticket");
								book.setBounds(440, 410, 117, 25);
								test.panel.add(book);
								book.addActionListener(new ActionListener()
										{
											public void actionPerformed(ActionEvent e)
											{
												new Book();
											}
										});
								
								
								JButton exit = new JButton("Exit");
								exit.setBounds(60, 290, 117, 25);
								test.panel.add(exit);
								exit.addActionListener(new ActionListener(){

									@Override
									public void actionPerformed(ActionEvent arg0) {
										System.exit(0);
										
										
									}
									
								});
								
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
								



						}
						else if(checkTrain.isSelected())
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
								
							JLabel label = new JLabel("User Query");
							label.setFont(new Font("Arial Black", Font.PLAIN, 19));
							label.setForeground(Color.BLACK);
							
							label.setBounds(210, 72, 250, 30);
							test.panel.add(label);

							
							
							JLabel source = new JLabel("Source: ");
							source.setBounds(20, 180, 70, 15);
							test.panel.add(source);
							
							JLabel destination = new JLabel("Destination: ");
							destination.setBounds(10, 210, 70, 15);
							test.panel.add(destination);
							
							
							JLabel desc = new JLabel("            Find trains running");
							desc.setBounds(20, 120, 300, 20);
							test.panel.add(desc);
							JLabel desc1 = new JLabel("between source and destination");
							desc1.setBounds(20, 140, 300, 20);
							test.panel.add(desc1);
							JTextField xin = new JTextField("");
							xin.setBounds(85, 180, 114, 19);
							test.panel.add(xin);
							xin.setColumns(10);
							
							
							JTextField xin2 = new JTextField("");
							xin2.setBounds(85, 210, 114, 19);
							test.panel.add(xin2);
							xin2.setColumns(10);
							
							
							
							JButton x = new JButton("Submit");
							x.setBounds(60, 260, 117, 25);
							test.panel.add(x);
							
							//Submit karne pr query execute hogi
							x.addActionListener(new ActionListener(){

								@Override
								public void actionPerformed(ActionEvent arg0) {

									test.panel.repaint();
									test.panel.revalidate();
									
									JTable table = new JTable(0,4);
									table.setBackground(new Color(195, 252, 84));
									DefaultTableModel model = (DefaultTableModel) table.getModel();
									table.setBounds(220,180,345,180);
									
									model.addRow(new Object[]{"<HTML><B>TrainNumber</B><HTML>", "<HTML><B>ArrivalTime</B><HTML>", "<HTML><B>DepartureTime</B><HTML>", "<HTML><B>AvailableSeats</B><HTML>"});
									if(!(xin.getText().equals("")) && !(xin2.getText().equals("")))
										{

											try{  
											
											Class.forName("com.mysql.jdbc.Driver").newInstance();  
											Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/railwaydatabase?autoReconnect=true&useSSL=false","root","34185");  
											//here sonoo is database name, root is username and password  
											Statement stmt=con.createStatement();
											ResultSet rs=stmt.executeQuery("SELECT TrainNumber, ArrivalTime, DepartureTime, AvailableSeats FROM railwaydatabase.traininfo where Source = '"+xin.getText()+"' and Destination = '"+xin2.getText()+"';");  
											while(rs.next())
											{
												model.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4)});
											}
											con.close();
											}
											catch(Exception e){ System.out.println(e);}
										}
										else
										{
											new User_Query();
										}
									
									test.panel.add(table);

								}
								
							});
							
							JButton Back = new JButton("Back");
							Back.setBounds(60, 290, 117, 25);
							test.panel.add(Back);
							Back.addActionListener(new ActionListener(){

								@Override
								public void actionPerformed(ActionEvent arg0) {
									new User_Query();
									
									
								}
								
							});
							
							JButton book = new JButton("Book Ticket");
							book.setBounds(440, 410, 117, 25);
							test.panel.add(book);
							book.addActionListener(new ActionListener()
									{
										public void actionPerformed(ActionEvent e)
										{
											new Book();
										}
									});
							
							
							JButton exit = new JButton("Exit");
							exit.setBounds(60, 320, 117, 25);
							test.panel.add(exit);
							exit.addActionListener(new ActionListener(){

								@Override
								public void actionPerformed(ActionEvent arg0) {
									System.exit(0);
									
									
								}
								
							});
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
							

						}
						else if(cancelTicket.isSelected())
						{
							new cancelPortal();
						}

						
					}
				});
		
		contin.setBounds(250, 395, 117, 25);
		test.panel.add(contin);
		
			
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
		
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(250, 425, 117, 25);
		test.panel.add(btnExit);
		btnExit.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
				
				
			}
			
		});
		
	}

}
