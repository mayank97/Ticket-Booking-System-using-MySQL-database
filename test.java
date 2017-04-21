/*!
 * @Mayank Kumar 2015055
 * @Dewansh Gautam 2015025
 */
package DBMS;

import java.awt.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;
//import com.jgoodies.forms.layout.FormLayout;
//import com.jgoodies.forms.layout.ColumnSpec;
//import com.jgoodies.forms.layout.RowSpec;
public class test{
	 static JPanel panel=null;
	 static JFrame frame=null;
	 test(){
		 

			JWindow window = new JWindow();
			try 
			{
				window.getContentPane().add(
				new JLabel("", new ImageIcon(new URL("https://s-media-cache-ak0.pinimg.com/originals/92/8e/1a/928e1aa5fc53b31897414d2ecf4cda5a.gif")), SwingConstants.CENTER));
			}
			catch (MalformedURLException e1) 
			{
				e1.printStackTrace();
			}
			window.setBounds(500, 200, 400, 400);
			window.setVisible(true);
			try {
			    Thread.sleep(12000);
			} catch (InterruptedException e) {
			    e.printStackTrace();
			}
			window.setVisible(false);
		
		 
		 
		 
		 panel=new JPanel();
			frame=new JFrame();
			frame.getContentPane().add(panel);
			panel.setLayout(null);
			setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
			
	
	new StartScreen();
		
	}
	
	private void setDefaultCloseOperation(int exitOnClose) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String args[]){
		new test();	
	}
}
class StartScreen{
	 StartScreen(){
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
			
			ImageIcon image = new ImageIcon("C:/Users/Mayank/Desktop/e.jpg");
			JLabel label = new JLabel(image);
			label.setBounds(220, 90, 350, 380);
			test.panel.add(label);

			ButtonGroup group = new ButtonGroup();
			
			
			JRadioButton rdbtnUser = new JRadioButton("User");
			rdbtnUser.setBounds(30, 120, 109, 23);
			
			JRadioButton rdbtnAdmin = new JRadioButton("Admin");
			rdbtnAdmin.setBounds(30, 154, 109, 23);
			
			group.add(rdbtnUser);
			group.add(rdbtnAdmin);
			test.panel.add(rdbtnUser);
			test.panel.add(rdbtnAdmin);
			
			JButton btnContinue = new JButton("Continue");
			btnContinue.setBounds(90, 205, 89, 23);
			test.panel.add(btnContinue);
			
			JButton btnExit = new JButton("Exit");
			btnExit.setBounds(90, 235, 89, 25);
			test.panel.add(btnExit);
			


			btnContinue.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
						{
							if(rdbtnAdmin.isSelected())
							{
								new Admin_Login();
							}
							else if(rdbtnUser.isSelected())
							{
								new Login();
							}
						}
					});
			
			
			
			
			
			btnExit.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					System.exit(0);
					
				}
				
			});
			
			test.frame.setResizable(false);
			test.frame.setSize(600,550);
			test.frame.setVisible(true);
		 
	 }
	
}