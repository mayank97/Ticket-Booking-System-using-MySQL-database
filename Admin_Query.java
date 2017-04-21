package DBMS;

import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;

public class Admin_Query {
	
	Admin_Query(){
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
			
		JLabel label = new JLabel("Admin Query");
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
		JRadioButton btnQuery_4 = new JRadioButton("Query-5");
		btnQuery_4.setBounds(40, 250, 117, 25);
		test.panel.add(btnQuery_4);
		
		JRadioButton basePrice = new JRadioButton("Update Base Price");
		basePrice.setBounds(370, 185, 197, 25);
		test.panel.add(basePrice);
		
		JRadioButton trainTime = new JRadioButton("Update Train Timing");
		trainTime.setBounds(40, 310, 157, 25);
		test.panel.add(trainTime);
		

		JRadioButton certified = new JRadioButton("Certified Train Driver");
		certified.setBounds(370, 125, 197, 25);
		test.panel.add(certified);
		

		

		JRadioButton driver = new JRadioButton("Drivers Available on Route");
		driver.setBounds(370, 155, 197, 25);
		test.panel.add(driver);


		JRadioButton query6 = new JRadioButton("Query-6");
		query6.setBounds(40, 280, 157, 25);
		test.panel.add(query6);

		
		ButtonGroup group = new ButtonGroup();
		group.add(btnQuery_4);
		group.add(btnQuery_3);
		group.add(btnQuery_2);
		group.add(btnQuery_1);
		group.add(btnQuery);
		group.add(basePrice);
		group.add(trainTime);
		group.add(certified);
		group.add(driver);
		group.add(query6);
		JButton contin = new JButton("Continue");
		contin.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						
						if(btnQuery.isSelected())
						{

							//query chalao
							//Find the routes which a drivers is allowed whose insurance is not expired and has
							//salary above Rs. x.
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
								
							JLabel label = new JLabel("Admin Query");
							label.setFont(new Font("Arial Black", Font.PLAIN, 19));
							label.setForeground(Color.BLACK);
							
							label.setBounds(210, 72, 250, 30);
							test.panel.add(label);

							
							JLabel salary = new JLabel("Salary: ");
							salary.setBounds(15, 197, 70, 15);
							test.panel.add(salary);
							JLabel EID = new JLabel("EID: ");
							EID.setBounds(25, 227, 70, 15);
							test.panel.add(EID);
							
							JTextField xin2 = new JTextField();
							xin2.setBounds(60, 227, 114, 19);
							test.panel.add(xin2);
							xin2.setColumns(10);
							
							
							
							JLabel desc = new JLabel("Routes on which a drivers is allowed ");
							desc.setBounds(15, 110, 300, 20);
							test.panel.add(desc);
							JLabel desc1 = new JLabel("   whose insurance is not expired");
							desc1.setBounds(15, 130, 300, 20);
							test.panel.add(desc1);
							JLabel desc2 = new JLabel("     and has salary above Rs x");
							desc2.setBounds(15, 150, 300, 20);
							test.panel.add(desc2);
							JTextField xin = new JTextField();
							xin.setBounds(60, 197, 114, 19);
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
									
									
									JTable table = new JTable(0,1);
									table.setBackground(new Color(195, 252, 84));
									DefaultTableModel model = (DefaultTableModel) table.getModel();
									table.setBounds(245,187,260,180);
									
									model.addRow(new Object[]{"<HTML><B>RouteID</B><HTML>"});
									if(!(xin.getText().equals("")) && !(xin2.getText().equals("")))
										{

											try{  
											
											Class.forName("com.mysql.jdbc.Driver").newInstance();  
											Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/railwaydatabase?autoReconnect=true&useSSL=false","root","34185");  
											//here sonoo is database name, root is username and password  
											Statement stmt=con.createStatement();
											ResultSet rs=stmt.executeQuery("select RouteID from employees natural join map where(Insurance = 'Available' and Salary > "+ xin.getText()+ " and EID = "+xin2.getText() +");");  
											

											ArrayList<Object> myArr = new ArrayList<Object>();
											
											while(rs.next())  
											{
												myArr.add(new Object[]{rs.getInt(1)});
											
											}
							//				System.out.println(myArr.size());
											
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
																JTable table2 = new JTable(0,1);
																table2.setBackground(new Color(195, 252, 84));
																DefaultTableModel model2 = (DefaultTableModel) table2.getModel();
																table2.setBounds(245,187,260,180);
																test.panel.remove(table);
																
																model2.addRow(new Object[]{"<HTML><B>RouteID</B><HTML>"});
																
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
											new Admin_Query();
										}
									
									
									
									
									test.panel.add(table);
									
						
								}
								
							});
							
							JButton backup = new JButton("Back");
							backup.setBounds(60, 300, 117, 25);
							test.panel.add(backup);
							backup.addActionListener(new ActionListener()
									{
										public void actionPerformed(ActionEvent e)
										{
											new Admin_Query();
										}
									});
							
							JButton Back = new JButton("Logout");
							Back.setBounds(460, 5, 117, 25);
							test.panel.add(Back);
							Back.addActionListener(new ActionListener(){

								@Override
								public void actionPerformed(ActionEvent arg0) {
									new Admin_Login();
									
									
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
								
							JLabel label = new JLabel("Admin Query");
							label.setFont(new Font("Arial Black", Font.PLAIN, 19));
							label.setForeground(Color.BLACK);
							
							label.setBounds(210, 72, 250, 30);
							test.panel.add(label);

							JLabel salary = new JLabel("RouteID: ");
							salary.setBounds(30, 180, 70, 15);
							test.panel.add(salary);
							JLabel desc = new JLabel("Salary of workers on");
							desc.setBounds(30, 120, 300, 20);
							test.panel.add(desc);
							JLabel desc1 = new JLabel("   a specified route");
							desc1.setBounds(30, 140, 300, 20);
							test.panel.add(desc1);
							JTextField xin = new JTextField("");
							xin.setBounds(90, 180, 114, 19);
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
									table.setBounds(250,180,260,180);
									
									model.addRow(new Object[]{"<HTML><B>EID</B><HTML>", "<HTML><B>EName</B><HTML>", "<HTML><B>Salary</B><HTML>"});
									if(!(xin.getText().equals("")))
										{

											try{  
											
											Class.forName("com.mysql.jdbc.Driver").newInstance();  
											Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/railwaydatabase?autoReconnect=true&useSSL=false","root","34185");  
											//here sonoo is database name, root is username and password  
											Statement stmt=con.createStatement();
											ResultSet rs=stmt.executeQuery("select EID, EName,Salary from employees natural join map where( RouteID = "+xin.getText() +");");  


											
											ArrayList<Object> myArr = new ArrayList<Object>();
											
											while(rs.next())  
											{
												myArr.add(new Object[]{rs.getInt(1), rs.getString(2), rs.getInt(3)});
											
											}
							//				System.out.println(myArr.size());
											
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
																JTable table2 = new JTable(0,3);
																table2.setBackground(new Color(195, 252, 84));
																DefaultTableModel model2 = (DefaultTableModel) table2.getModel();
																table2.setBounds(250,180,260,180);
																test.panel.remove(table);
																

																model2.addRow(new Object[]{"<HTML><B>EID</B><HTML>", "<HTML><B>EName</B><HTML>", "<HTML><B>Salary</B><HTML>"});
																											
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
											new Admin_Query();
										}
									
									test.panel.add(table);

								}
								
							});
							
							

							JButton backup = new JButton("Back");
							backup.setBounds(60, 260, 117, 25);
							test.panel.add(backup);
							backup.addActionListener(new ActionListener()
									{
										public void actionPerformed(ActionEvent e)
										{
											new Admin_Query();
										}
									});
							
							JButton Back = new JButton("Logout");
							Back.setBounds(460, 5, 117, 25);
							test.panel.add(Back);
							Back.addActionListener(new ActionListener(){

								@Override
								public void actionPerformed(ActionEvent arg0) {
									new Admin_Login();
									
									
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
								
							JLabel label = new JLabel("Admin Query");
							label.setFont(new Font("Arial Black", Font.PLAIN, 19));
							label.setForeground(Color.BLACK);
							
							label.setBounds(210, 72, 250, 30);
							test.panel.add(label);

							
							
							JLabel salary = new JLabel("RouteID: ");
							salary.setBounds(20, 180, 70, 15);
							test.panel.add(salary);
							
							JLabel desc = new JLabel("         Trains which can");
							desc.setBounds(20, 120, 300, 20);
							test.panel.add(desc);
							JLabel desc1 = new JLabel("be used on a specified route");
							desc1.setBounds(20, 140, 300, 20);
							test.panel.add(desc1);
							JTextField xin = new JTextField("");
							xin.setBounds(85, 180, 114, 19);
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
									
									model.addRow(new Object[]{"<HTML><B>TrainNumber</B><HTML>", "<HTML><B>TrainName</B><HTML>"});
									if(!(xin.getText().equals("")))
										{

											try{  
											
											Class.forName("com.mysql.jdbc.Driver").newInstance();  
											Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/railwaydatabase?autoReconnect=true&useSSL=false","root","34185");  
											//here sonoo is database name, root is username and password  
											Statement stmt=con.createStatement();
											ResultSet rs=stmt.executeQuery("SELECT TrainNumber, TrainName FROM railwaydatabase.traininfo as T natural join detail as d where T.source = (SELECT R.Source From railwaydatabase.route as R where RouteID = "+ xin.getText()+" and T.Destination = R.Destination);");  



											
											ArrayList<Object> myArr = new ArrayList<Object>();
											
											while(rs.next())  
											{
												myArr.add(new Object[]{rs.getInt(1), rs.getString(2)});
											
											}
							//				System.out.println(myArr.size());
											
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
																

																model2.addRow(new Object[]{"<HTML><B>TrainNumber</B><HTML>", "<HTML><B>TrainName</B><HTML>"});
																											
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
											new Admin_Query();
										}
									
									test.panel.add(table);

								}
								
							});
							
							JButton Back = new JButton("Logout");
							Back.setBounds(460, 5, 117, 25);
							test.panel.add(Back);
							Back.addActionListener(new ActionListener(){

								@Override
								public void actionPerformed(ActionEvent arg0) {
									new Admin_Login();
									
									
								}
								
							});
							

							JButton backup = new JButton("Back");
							backup.setBounds(60, 260, 117, 25);
							test.panel.add(backup);
							backup.addActionListener(new ActionListener()
									{
										public void actionPerformed(ActionEvent e)
										{
											new Admin_Query();
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
								
							JLabel label = new JLabel("Admin Query");
							label.setFont(new Font("Arial Black", Font.PLAIN, 19));
							label.setForeground(Color.BLACK);
							
							label.setBounds(210, 72, 250, 30);
							test.panel.add(label);

							
							JLabel desc = new JLabel("          Name of Drivers who are");
							desc.setBounds(20, 120, 300, 20);
							test.panel.add(desc);
							JLabel desc1 = new JLabel("certified to move in a specified range");
							desc1.setBounds(20, 140, 300, 20);
							test.panel.add(desc1);
							
							JLabel source = new JLabel("Source: ");
							source.setBounds(25, 180, 114, 20);
							test.panel.add(source);
							
							JLabel destination = new JLabel("Destination: ");
							destination.setBounds(5, 205, 114, 20);
							test.panel.add(destination);
							
							
							JTextField xin = new JTextField("");
							xin.setBounds(80, 180, 114, 20);
							test.panel.add(xin);
							xin.setColumns(10);
							
							JTextField xin2 = new JTextField("");
							xin2.setBounds(80, 205, 114, 20);
							test.panel.add(xin2);
							xin2.setColumns(10);

							JButton x = new JButton("Submit");
							x.setBounds(60, 250, 117, 25);
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
									table.setBounds(255,200,260,180);
									
									model.addRow(new Object[]{"<HTML><B>EID</B><HTML>", "<HTML><B>EName</B><HTML>"});
									if(!(xin.getText().equals("")) &&  !(xin2.getText().equals("")))
										{

											try{  
											
											Class.forName("com.mysql.jdbc.Driver").newInstance();  
											Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/railwaydatabase?autoReconnect=true&useSSL=false","root","34185");  
											//here sonoo is database name, root is username and password  
											Statement stmt=con.createStatement();
											ResultSet rs=stmt.executeQuery("select EID,EName from certified natural join traininfo natural join employees where source = '"+xin.getText()+"' and Destination = '"+xin2.getText()+"' ;");  
	


											ArrayList<Object> myArr = new ArrayList<Object>();
											
											while(rs.next())  
											{
												myArr.add(new Object[]{rs.getInt(1), rs.getString(2)});
											
											}
							//				System.out.println(myArr.size());
											
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
												next.setBounds(455, 395, 60, 20);
												test.panel.add(next);
												next.addActionListener(new ActionListener()
														{
															public void actionPerformed(ActionEvent e)
															{
																next.setEnabled(false);
																JTable table2 = new JTable(0,2);
																table2.setBackground(new Color(195, 252, 84));
																DefaultTableModel model2 = (DefaultTableModel) table2.getModel();
																table2.setBounds(255,200,260,180);
																test.panel.remove(table);
																

																model2.addRow(new Object[]{"<HTML><B>EID</B><HTML>", "<HTML><B>EName</B><HTML>"});
																											
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
											new Admin_Query();
										}
									
									test.panel.add(table);

								}
								
							});
							
							JButton Back = new JButton("Logout");
							Back.setBounds(460, 5, 117, 25);
							test.panel.add(Back);
							Back.addActionListener(new ActionListener(){

								@Override
								public void actionPerformed(ActionEvent arg0) {
									new Admin_Login();
									
									
								}
								
							});
							
							
							JButton backup = new JButton("Back");
							backup.setBounds(60, 280, 117, 25);
							test.panel.add(backup);
							backup.addActionListener(new ActionListener(){

								@Override
								public void actionPerformed(ActionEvent arg0) {
									new Admin_Query();
									
									
								}
								
							});

							
							JButton exit = new JButton("Exit");
							exit.setBounds(60, 310, 117, 25);
							test.panel.add(exit);
							exit.addActionListener(new ActionListener(){

								@Override
								public void actionPerformed(ActionEvent arg0) {
									System.exit(0);
									
									
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
								
							JLabel label = new JLabel("Admin Query");
							label.setFont(new Font("Arial Black", Font.PLAIN, 19));
							label.setForeground(Color.BLACK);
							
							label.setBounds(210, 72, 250, 30);
							test.panel.add(label);

							
							
							JLabel desc = new JLabel("List of all passengers on a");
							desc.setBounds(20, 110, 300, 20);
							test.panel.add(desc);
							JLabel desc1 = new JLabel(" given train at the start of");
							desc1.setBounds(20, 130, 300, 20);
							test.panel.add(desc1);
							JLabel desc2 = new JLabel("             journey");
							desc2.setBounds(20, 150, 300, 20);
							test.panel.add(desc2);


							JLabel source = new JLabel("TrainNumber: ");
							source.setBounds(20, 190, 114, 20);
							test.panel.add(source);
							
							JTextField xin = new JTextField("");
							xin.setBounds(110, 190, 114, 20);
							test.panel.add(xin);
							xin.setColumns(10);
							
							JButton x = new JButton("Submit");
							x.setBounds(60, 250, 117, 25);
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
									table.setBounds(255,190,260,180);
									
									model.addRow(new Object[]{"<HTML><B>PassengerID</B><HTML>", "<HTML><B>Name</B><HTML>"});
									if(!(xin.getText().equals("")))
										{

											try{  
											
											Class.forName("com.mysql.jdbc.Driver").newInstance();  
											Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/railwaydatabase?autoReconnect=true&useSSL=false","root","34185");  
											//here sonoo is database name, root is username and password  
											Statement stmt=con.createStatement();
											ResultSet rs=stmt.executeQuery("SELECT PassengerID, Name FROM boards natural join passenger where TrainNumber = "+xin.getText()+";");  

											
											ArrayList<Object> myArr = new ArrayList<Object>();
											
											while(rs.next())  
											{
												myArr.add(new Object[]{rs.getInt(1), rs.getString(2)});
											
											}
							//				System.out.println(myArr.size());
											
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
																table2.setBounds(255,190,260,180);
																test.panel.remove(table);
																

																model2.addRow(new Object[]{"<HTML><B>PassengerID</B><HTML>", "<HTML><B>Name</B><HTML>"});
																											
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
											new Admin_Query();
										}
									
									test.panel.add(table);						
								}
								
							});
							
							JButton Back = new JButton("Logout");
							Back.setBounds(460, 5, 117, 25);
							test.panel.add(Back);
							Back.addActionListener(new ActionListener(){

								@Override
								public void actionPerformed(ActionEvent arg0) {
									new Admin_Login();
									
									
								}
								
							});
							
							JButton backup = new JButton("Back");
							backup.setBounds(60, 280, 117, 25);
							test.panel.add(backup);
							backup.addActionListener(new ActionListener(){

								@Override
								public void actionPerformed(ActionEvent arg0) {
									new Admin_Query();
									
									
								}
								
							});
							
							JButton exit = new JButton("Exit");
							exit.setBounds(60, 310, 117, 25);
							test.panel.add(exit);
							exit.addActionListener(new ActionListener(){

								@Override
								public void actionPerformed(ActionEvent arg0) {
									System.exit(0);
									
									
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
								
							JLabel label = new JLabel("Admin Query");
							label.setFont(new Font("Arial Black", Font.PLAIN, 19));
							label.setForeground(Color.BLACK);
							
							label.setBounds(210, 72, 250, 30);
							test.panel.add(label);

							JLabel desc = new JLabel("Update Base Price");
							desc.setBounds(220, 140, 300, 20);
							test.panel.add(desc);
							
							
							JLabel salary = new JLabel("TrainNumber: ");
							salary.setBounds(175, 230, 700, 15);
							test.panel.add(salary);
							
							JLabel price = new JLabel("Enter new price:");
							price.setBounds(160,260,270,15);
							test.panel.add(price);
							JTextField xin = new JTextField("");
							xin.setBounds(270, 230, 70, 20);
							test.panel.add(xin);
							xin.setColumns(10);
							

							JTextField xin2 = new JTextField("");
							xin2.setBounds(270,260,70,20);
							test.panel.add(xin2);
							xin2.setColumns(10);
							
							
							JButton x = new JButton("UPDATE");
							x.setBounds(360, 330, 117, 25);
							test.panel.add(x);
							
							//Submit karne pr query execute hogi
							x.addActionListener(new ActionListener(){

								@Override
								public void actionPerformed(ActionEvent arg0) {
									
									test.panel.repaint();
									test.panel.revalidate();
									
									if(!(xin2.getText().equals("")) && !(xin.getText().equals("")))
									{
											try{  
											
											Class.forName("com.mysql.jdbc.Driver").newInstance();  
											Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/railwaydatabase?autoReconnect=true&useSSL=false","root","34185");  
											//here sonoo is database name, root is username and password  
											Statement stmt=con.createStatement();
											
											int temp = stmt.executeUpdate("UPDATE `railwaydatabase`.`train` SET `Price`='"+xin2.getText()+"' WHERE `TrainNumber`='"+xin.getText()+"';");
								
											Admin_Login.infoBox("Sucessfully Updated", "Updated");
											new Admin_Query();
											
											con.close();
											}
											catch(Exception e){ System.out.println(e);}
								
								}
								else
								{
									new Admin_Query();
								}
							}
								
							});
							
							

							JButton backup = new JButton("Back");
							backup.setBounds(360, 360, 117, 25);
							test.panel.add(backup);
							backup.addActionListener(new ActionListener()
									{
										public void actionPerformed(ActionEvent e)
										{
											new Admin_Query();
										}
									});
							
							JButton Back = new JButton("Logout");
							Back.setBounds(460, 5, 117, 25);
							test.panel.add(Back);
							Back.addActionListener(new ActionListener(){

								@Override
								public void actionPerformed(ActionEvent arg0) {
									new Admin_Login();
									
									
								}
								
							});
							
							JButton exit = new JButton("Exit");
							exit.setBounds(360, 390, 117, 25);
							test.panel.add(exit);
							exit.addActionListener(new ActionListener(){

								@Override
								public void actionPerformed(ActionEvent arg0) {
									System.exit(0);
									
									
								}
								
							});
							

						}
						else if(trainTime.isSelected())
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
									
								JLabel label = new JLabel("Admin Query");
								label.setFont(new Font("Arial Black", Font.PLAIN, 19));
								label.setForeground(Color.BLACK);
								
								label.setBounds(210, 72, 250, 30);
								test.panel.add(label);

								JLabel desc = new JLabel("Update Train Timing");
								desc.setBounds(220, 140, 300, 20);
								test.panel.add(desc);
								
								
								JLabel salary = new JLabel("TrainNumber: ");
								salary.setBounds(175, 230, 700, 15);
								test.panel.add(salary);
								
								JLabel price = new JLabel("New Arrival Time:");
								price.setBounds(145,260,270,15);
								test.panel.add(price);
								

								JLabel price2 = new JLabel("New Departure Time:");
								price2.setBounds(134,290,270,15);
								test.panel.add(price2);
								
								JTextField xin = new JTextField("");
								xin.setBounds(270, 230, 70, 20);
								test.panel.add(xin);
								xin.setColumns(10);
								

								JTextField xin2 = new JTextField("");
								xin2.setBounds(270,260,70,20);
								test.panel.add(xin2);
								xin2.setColumns(10);
								
								JTextField xin3 = new JTextField("");
								xin3.setBounds(270, 290, 70, 20);
								test.panel.add(xin3);
								xin3.setColumns(10);
								
								
								JButton x = new JButton("UPDATE");
								x.setBounds(360, 330, 117, 25);
								test.panel.add(x);
								
								//Submit karne pr query execute hogi
								x.addActionListener(new ActionListener(){

									@Override
									public void actionPerformed(ActionEvent arg0) {
										
										test.panel.repaint();
										test.panel.revalidate();
										
										if(!(xin.getText().equals("")) && !(xin2.getText().equals("")) &&!(xin3.getText().equals("")))
											
											{
											try{  
											
												
												Class.forName("com.mysql.jdbc.Driver").newInstance();  
												Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/railwaydatabase?autoReconnect=true&useSSL=false","root","34185");  
												//here sonoo is database name, root is username and password  
												Statement stmt=con.createStatement();
												
												int temp = stmt.executeUpdate("UPDATE `railwaydatabase`.`traininfo` SET `ArrivalTime`='"+xin2.getText()+"', `DepartureTime`='"+xin3.getText()+"' WHERE `TrainNumber`='"+xin.getText()+"';");
									
												Admin_Login.infoBox("Sucessfully Updated", "Updated");
												new Admin_Query();
												
												con.close();
												}
												catch(Exception e){ System.out.println(e);}
											}
										else
										{
											new Admin_Query();
										}
											}
									
								});
								
								

								JButton backup = new JButton("Back");
								backup.setBounds(360, 360, 117, 25);
								test.panel.add(backup);
								backup.addActionListener(new ActionListener()
										{
											public void actionPerformed(ActionEvent e)
											{
												new Admin_Query();
											}
										});
								
								JButton Back = new JButton("Logout");
								Back.setBounds(460, 5, 117, 25);
								test.panel.add(Back);
								Back.addActionListener(new ActionListener(){

									@Override
									public void actionPerformed(ActionEvent arg0) {
										new Admin_Login();
										
										
									}
									
								});
								
								JButton exit = new JButton("Exit");
								exit.setBounds(360, 390, 117, 25);
								test.panel.add(exit);
								exit.addActionListener(new ActionListener(){

									@Override
									public void actionPerformed(ActionEvent arg0) {
										System.exit(0);
										
										
									}
									
								});
								


						}
						else if(certified.isSelected())
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
									
								JLabel label = new JLabel("Admin Query");
								label.setFont(new Font("Arial Black", Font.PLAIN, 19));
								label.setForeground(Color.BLACK);
								
								label.setBounds(210, 72, 250, 30);
								test.panel.add(label);

								
								JLabel EID = new JLabel("EID: ");
								EID.setBounds(25, 207, 70, 15);
								test.panel.add(EID);
								
								JTextField xin2 = new JTextField();
								xin2.setBounds(55, 207, 114, 19);
								test.panel.add(xin2);
								xin2.setColumns(10);
								
								
								
								JLabel desc = new JLabel("Trains for which a driver is  ");
								desc.setBounds(15, 110, 300, 20);
								test.panel.add(desc);
								JLabel desc1 = new JLabel("   certified for operating");
								desc1.setBounds(15, 130, 300, 20);
								test.panel.add(desc1);
								
								
								
								JButton x = new JButton("Search");
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
										table.setBounds(245,187,260,180);
										
										model.addRow(new Object[]{"<HTML><B>TrainNumber</B><HTML>", "<HTML><B>TrainName</B><HTML>"});
										if(!(xin2.getText().equals("")))
											{

												try{  
												
												Class.forName("com.mysql.jdbc.Driver").newInstance();  
												Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/railwaydatabase?autoReconnect=true&useSSL=false","root","34185");  
												//here sonoo is database name, root is username and password  
												Statement stmt=con.createStatement();
												ResultSet rs = stmt.executeQuery("SELECT TrainNumber, TrainName FROM railwaydatabase.certified natural join detail where EID = "+xin2.getText()+";");
												while(rs.next())
												{
													model.addRow(new Object[]{rs.getInt(1), rs.getString(2)});
												}
												con.close();
												}
												catch(Exception e){ System.out.println(e);}
											}
											else
											{
												new Admin_Query();
											}
										
										
										
										
										test.panel.add(table);
										
							
									}
									
								});
								
								JButton backup = new JButton("Back");
								backup.setBounds(60, 300, 117, 25);
								test.panel.add(backup);
								backup.addActionListener(new ActionListener()
										{
											public void actionPerformed(ActionEvent e)
											{
												new Admin_Query();
											}
										});
								
								JButton Back = new JButton("Logout");
								Back.setBounds(460, 5, 117, 25);
								test.panel.add(Back);
								Back.addActionListener(new ActionListener(){

									@Override
									public void actionPerformed(ActionEvent arg0) {
										new Admin_Login();
										
										
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


						}

						else if(driver.isSelected())
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
								
							JLabel label = new JLabel("Admin Query");
							label.setFont(new Font("Arial Black", Font.PLAIN, 19));
							label.setForeground(Color.BLACK);
							
							label.setBounds(210, 72, 250, 30);
							test.panel.add(label);

							JLabel EID = new JLabel("RouteID: ");
							EID.setBounds(25, 207, 70, 15);
							test.panel.add(EID);
							
							JTextField xin2 = new JTextField();
							xin2.setBounds(80, 207, 114, 19);
							test.panel.add(xin2);
							xin2.setColumns(10);
							
							
							
							JLabel desc = new JLabel("Drivers allowed on a given route ");
							desc.setBounds(15, 120, 300, 20);
							test.panel.add(desc);
							
							
							JButton x = new JButton("Submit");
							x.setBounds(60, 270, 117, 25);
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
									table.setBounds(245,187,290,180);
									
									model.addRow(new Object[]{"<HTML><B>EID</B><HTML>", "<HTML><B>Name</B><HTML>", "<HTML><B>Salary</B><HTML>"});
									if(!(xin2.getText().equals("")))
										{

											try{  
											
											Class.forName("com.mysql.jdbc.Driver").newInstance();  
											Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/railwaydatabase?autoReconnect=true&useSSL=false","root","34185");  
											//here sonoo is database name, root is username and password  
											Statement stmt=con.createStatement();
											ResultSet rs=stmt.executeQuery("SELECT EID, EName, Salary FROM railwaydatabase.map natural join employees where RouteID = "+xin2.getText()+";");  
											

											ArrayList<Object> myArr = new ArrayList<Object>();
											
											while(rs.next())  
											{
												myArr.add(new Object[]{rs.getInt(1), rs.getString(2), rs.getInt(3)});
											
											}
							//				System.out.println(myArr.size());
											
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
																JTable table2 = new JTable(0,3);
																table2.setBackground(new Color(195, 252, 84));
																DefaultTableModel model2 = (DefaultTableModel) table2.getModel();
																table2.setBounds(245,187,260,180);
																test.panel.remove(table);
																
																model.addRow(new Object[]{"<HTML><B>EID</B><HTML>", "<HTML><B>Name</B><HTML>", "<HTML><B>Salary</B><HTML>"});
																
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
											new Admin_Query();
										}
									
									
									
									
									test.panel.add(table);
									
						
								}
								
							});
							
							JButton backup = new JButton("Back");
							backup.setBounds(60, 300, 117, 25);
							test.panel.add(backup);
							backup.addActionListener(new ActionListener()
									{
										public void actionPerformed(ActionEvent e)
										{
											new Admin_Query();
										}
									});
							
							JButton Back = new JButton("Logout");
							Back.setBounds(460, 5, 117, 25);
							test.panel.add(Back);
							Back.addActionListener(new ActionListener(){

								@Override
								public void actionPerformed(ActionEvent arg0) {
									new Admin_Login();
									
									
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

						}
						if(query6.isSelected())
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
								
							JLabel label = new JLabel("Admin Query");
							label.setFont(new Font("Arial Black", Font.PLAIN, 19));
							label.setForeground(Color.BLACK);
							
							label.setBounds(210, 72, 250, 30);
							test.panel.add(label);

							
							JLabel salary = new JLabel("Salary: ");
							salary.setBounds(15, 207, 70, 15);
							test.panel.add(salary);
							
							JTextField xin2 = new JTextField();
							xin2.setBounds(60, 207, 114, 19);
							test.panel.add(xin2);
							xin2.setColumns(10);
							
							
							
							JLabel desc = new JLabel("Name of trains such that all drivers");
							desc.setBounds(15, 110, 300, 20);
							test.panel.add(desc);
							JLabel desc1 = new JLabel("certified to operate them has salary");
							desc1.setBounds(15, 130, 300, 20);
							test.panel.add(desc1);
							JLabel desc2 = new JLabel("more than equal to some amount");
							desc2.setBounds(15, 150, 300, 20);
							test.panel.add(desc2);
							
							JButton x = new JButton("Search");
							x.setBounds(60, 270, 117, 25);
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
									table.setBounds(245,187,260,180);
									
									model.addRow(new Object[]{"<HTML><B>TrainName</B><HTML>"});
									
									if(!(xin2.getText().equals("")))
										{

											try{  
											
											Class.forName("com.mysql.jdbc.Driver").newInstance();  
											Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/railwaydatabase?autoReconnect=true&useSSL=false","root","34185");  
											
											Statement stmt=con.createStatement();
											ResultSet rs=stmt.executeQuery("SELECT TrainName, min(Salary) FROM railwaydatabase.certified natural join detail natural join employees group by TrainName;");  
											while(rs.next())
											{
												int money = rs.getInt(2);
												if(money >= Integer.parseInt(xin2.getText()))
												{
													model.addRow(new Object[]{rs.getString(1)});
												}
											}

											con.close();
											}
											catch(Exception e){ System.out.println(e);}
										}
										else
										{
											new Admin_Query();
										}
									
									
									
									
									test.panel.add(table);
									
						
								}
								
							});
							
							JButton backup = new JButton("Back");
							backup.setBounds(60, 300, 117, 25);
							test.panel.add(backup);
							backup.addActionListener(new ActionListener()
									{
										public void actionPerformed(ActionEvent e)
										{
											new Admin_Query();
										}
									});
							
							JButton Back = new JButton("Logout");
							Back.setBounds(460, 5, 117, 25);
							test.panel.add(Back);
							Back.addActionListener(new ActionListener(){

								@Override
								public void actionPerformed(ActionEvent arg0) {
									new Admin_Login();
									
									
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

						}



						
					}
				});
		
		contin.setBounds(230, 370, 117, 25);
		test.panel.add(contin);
		
		JButton btnBack = new JButton("Logout");
		btnBack.setBounds(460, 5, 117, 25);
		test.panel.add(btnBack);
		btnBack.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				new Admin_Login();
				
				
			}
			
		});
		
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(230, 400, 117, 25);
		test.panel.add(btnExit);
		btnExit.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
				
				
			}
			
		});
		
	}

	public static void infoBox(String infoMessage, String titleBar)
	{
	    JOptionPane.showMessageDialog(null, infoMessage, "                  " + titleBar, JOptionPane.INFORMATION_MESSAGE);
	}

		
		
}
