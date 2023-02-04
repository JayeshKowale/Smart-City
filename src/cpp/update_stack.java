package cpp;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.mysql.jdbc.Statement;
import javax.swing.ImageIcon;
import java.awt.Color;

//import org.hsqldb.Statement;

public class update_stack {
	public static ResultSet rs1;
	public static String y1,ss1;
	public static JFrame frame;
	public static JFrame f;
	Connection con=null;
	public static void main(String[] args) {
		
		update_stack t = new update_stack();
		t.f.setVisible(true);
	}
		
		public update_stack() {
		// JLabel oo = null;
		  JTextField txtEnterName;
		 JTextField textField_1;
		   JTextField textField_2;
		 ResultSet rs1;  
		

		/**
		 * Launch the application.
		 */
		//public static void main(String[] args) {
				

		/**
		 * Create the application.
		 */
		
		 JTextField textField_3;
	
		 JTextField textField_4;
		 JTextField textField_5;
		 JTextField textField_6;
		 JTextField textField_7;
		 JTextField textField_8;
		 JTextField textField_9;
		 JTextField textField_10;
		 JTextField textField_11;
		 JTextField textField_12;
		 JTextField textField_13;
		 JTextField textField_14;
		
	     con = DB.dbconnect();
			
		/**
		 * Initialize the contents of the frame.
		 */
			frame = new JFrame("Update Information");
			//frame.getContentPane().setBackground(Color.WHITE);
		//	frame.getContentPane().setFont(new Font("Times New Roman", Font.PLAIN, 13));
			frame.setBounds(100, 100, 700, 593);
			frame.setVisible(false);
			frame.getContentPane().setLayout(null);
			
			
			
			
			
			
			
			
			JLabel lblNewLabel_16 = new JLabel("PLEASE EDIT THE FIELDS THAT YOU WANT TO UPDATE!!");
			lblNewLabel_16.setForeground(new Color(75, 0, 130));
			lblNewLabel_16.setFont(new Font("Times New Roman", Font.BOLD, 20));
			lblNewLabel_16.setBounds(10, 11, 577, 39);
			frame.getContentPane().add(lblNewLabel_16);
			
			JLabel lblNewLabel_5 = new JLabel("Enter registration date");
			lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
			lblNewLabel_5.setBounds(0, 72, 147, 19);
			frame.getContentPane().add(lblNewLabel_5);
			
			JLabel lblNewLabel_1 = new JLabel("Enter Name");
			lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
			lblNewLabel_1.setBounds(10, 120, 113, 14);
			frame.getContentPane().add(lblNewLabel_1);
			
			txtEnterName = new JTextField();
			txtEnterName.setToolTipText("Enter Registration Date");
			txtEnterName.setBounds(139, 72, 197, 20);
			frame.getContentPane().add(txtEnterName);
			txtEnterName.setColumns(10);
			
			textField_1 = new JTextField();
			textField_1.setToolTipText("Enter Name");
			textField_1.setBounds(136, 118, 200, 20);
			frame.getContentPane().add(textField_1);
			textField_1.setColumns(10);
			
			JLabel lblNewLabel_2 = new JLabel("Enter Address");
			lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
			lblNewLabel_2.setBounds(10, 166, 113, 14);
			frame.getContentPane().add(lblNewLabel_2);
			
			JLabel lblNewLabel_3 = new JLabel("Address 2");
			lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 13));
			lblNewLabel_3.setBounds(10, 214, 72, 14);
			frame.getContentPane().add(lblNewLabel_3);
			
			textField_2 = new JTextField();
			textField_2.setToolTipText("Enter Address\n");
			textField_2.setBounds(133, 163, 197, 20);
			frame.getContentPane().add(textField_2);
			textField_2.setColumns(10);
			
			JLabel lblNewLabel_4 = new JLabel("Enter Email");
			lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 13));
			lblNewLabel_4.setBounds(10, 260, 113, 14);
			frame.getContentPane().add(lblNewLabel_4);
			
			
			textField_3 = new JTextField();
			textField_3.setToolTipText("Enter Address-2");
			textField_3.setBounds(133, 211, 197, 20);
			frame.getContentPane().add(textField_3);
			textField_3.setColumns(10);
			
			textField_4 = new JTextField();
			textField_4.setToolTipText("Enter Email Address\n");
			textField_4.setBounds(133, 257, 197, 20);
			frame.getContentPane().add(textField_4);
			textField_4.setColumns(10);
			
			JLabel lblNewLabel_6 = new JLabel("Enter Mobile_no");
			lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 14));
			lblNewLabel_6.setBounds(10, 312, 113, 14);
			frame.getContentPane().add(lblNewLabel_6);
			
			
			textField_5 = new JTextField();
			textField_5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			textField_5.setToolTipText("Enter Mobile Number\n");
			textField_5.setBounds(133, 309, 197, 20);
			frame.getContentPane().add(textField_5);
			
			
			
			JLabel lblNewLabel_7 = new JLabel("Enter Landline_no");
			lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 14));
			lblNewLabel_7.setBounds(10, 369, 126, 14);
			frame.getContentPane().add(lblNewLabel_7);
			
			textField_6 = new JTextField();
			textField_6.setBounds(133, 366, 197, 20);
			textField_6.setToolTipText("Enter Landline_No\n");
			frame.getContentPane().add(textField_6);
			
			
			JLabel lblNewLabel_8 = new JLabel("Enter Qualification");
			lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 14));
			lblNewLabel_8.setBounds(10, 426, 137, 14);
			frame.getContentPane().add(lblNewLabel_8);
			
			textField_7 = new JTextField();
			textField_7.setToolTipText("Enter Qualification");
			textField_7.setBounds(133, 423, 197, 20);
			frame.getContentPane().add(textField_7);
			textField_7.setColumns(10);
			
			JLabel lblNewLabel_9 = new JLabel("Enter Designation");
			lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 14));
			lblNewLabel_9.setBounds(373, 74, 118, 14);
			frame.getContentPane().add(lblNewLabel_9);
			
			textField_8 = new JTextField();
			textField_8.setToolTipText("Enter Designation");
			textField_8.setBounds(501, 72, 152, 20);
			frame.getContentPane().add(textField_8);
			textField_8.setColumns(10);
			
			JLabel lblNewLabel_10 = new JLabel("Enter Experience");
			lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD, 14));
			lblNewLabel_10.setBounds(373, 120, 118, 14);
			frame.getContentPane().add(lblNewLabel_10);
			
			textField_9 = new JTextField();
			textField_9.setToolTipText("Enter Experience");
			textField_9.setBounds(501, 118, 152, 20);
			frame.getContentPane().add(textField_9);
			textField_9.setColumns(10);
			
			JLabel lblNewLabel_11 = new JLabel("Enter Date of birth");
			lblNewLabel_11.setFont(new Font("Times New Roman", Font.BOLD, 14));
			lblNewLabel_11.setBounds(373, 166, 118, 14);
			frame.getContentPane().add(lblNewLabel_11);
			
			textField_10 = new JTextField();
			textField_10.setToolTipText("DD/MM/YYYY");
			textField_10.setBounds(501, 164, 152, 20);
			frame.getContentPane().add(textField_10);
			textField_10.setColumns(10);
			
			JLabel lblNewLabel_12 = new JLabel("Enter Age");
			lblNewLabel_12.setFont(new Font("Times New Roman", Font.BOLD, 13));
			lblNewLabel_12.setBounds(373, 214, 102, 14);
			frame.getContentPane().add(lblNewLabel_12);
			
			JLabel lblNewLabel_13 = new JLabel("Enter Gender");
			lblNewLabel_13.setFont(new Font("Times New Roman", Font.BOLD, 13));
			lblNewLabel_13.setBounds(373, 260, 102, 14);
			frame.getContentPane().add(lblNewLabel_13);
			
			JLabel lblNewLabel_14 = new JLabel("Enter Area of Experience");
			lblNewLabel_14.setFont(new Font("Times New Roman", Font.BOLD, 13));
			lblNewLabel_14.setBounds(354, 312, 137, 14);
			frame.getContentPane().add(lblNewLabel_14);
			
			JLabel lblNewLabel_15 = new JLabel("Enter Category");
			lblNewLabel_15.setFont(new Font("Times New Roman", Font.BOLD, 13));
			lblNewLabel_15.setBounds(373, 370, 89, 14);
			frame.getContentPane().add(lblNewLabel_15);
			
			textField_11 = new JTextField();
			textField_11.setToolTipText("Enter Age");
			textField_11.setBounds(501, 211, 152, 20);
			frame.getContentPane().add(textField_11);
			textField_11.setColumns(10);
			
			textField_12 = new JTextField();
			textField_12.setToolTipText("Enter Gender ");
			textField_12.setBounds(501, 257, 152, 20);
			frame.getContentPane().add(textField_12);
			textField_12.setColumns(10);
			
			textField_13 = new JTextField();
			textField_13.setToolTipText("Enter Area of Experience");
			textField_13.setBounds(501, 310, 152, 20);
			frame.getContentPane().add(textField_13);
			textField_13.setColumns(10);
			
			textField_14 = new JTextField();
			textField_14.setToolTipText("Enter Category");
			textField_14.setBounds(501, 367, 152, 20);
			frame.getContentPane().add(textField_14);
			textField_14.setColumns(10);
			
	

		/****************************************/
         f=new JFrame("fgfh");
		f.setBounds(100, 100, 700, 690);
		f.setVisible(true);
		f.getContentPane().setLayout(null);
		
		JLabel j =new JLabel("Please enter the data id and name of Stack holder");	
		j.setFont(new Font("Times New Roman", Font.BOLD, 24));
	    j.setBounds(10, 11,700 , 39);
		f.getContentPane().add(j);
		
		JLabel j1 =new JLabel("Data id:-");	
		j1.setFont(new Font("Times New Roman", Font.BOLD,20));
	    j1.setBounds(150,190,100 ,19);
		f.getContentPane().add(j1);

		JLabel j2 =new JLabel("Name");	
		j2.setFont(new Font("Times New Roman", Font.BOLD,20));
	    j2.setBounds(150,120,130 ,20);
		f.getContentPane().add(j2);
		
		/*JTextField ff= new JTextField("yyy");
		ff.setBounds(300,190,100,20);
		f.add(ff);
		ff.setVisible(true);*/

		 JTextField tf = new JTextField();
		tf.setToolTipText("Enter Data id");
		tf.setBounds(270, 190,130, 20);
		f.getContentPane().add(tf);
		tf.setColumns(20);
		tf.setVisible(true);

		JTextField tf1 = new JTextField();
		tf1.setToolTipText("Enter Name");
		tf1.setBounds(270, 120,130, 20);
		f.getContentPane().add(tf1);
		tf1.setColumns(20);
		tf1.setVisible(true);
		
		JButton jb=new JButton("Submit");
		jb.setBounds(150,300, 89, 23);
		f.getContentPane().add(jb);
		jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=tf1.getText();
				String y1=tf.getText();
				
				// y1=Integer.parseInt(y);
				//oo.setText(y);
				 try {
					//Connection connection = DriverManager.getConnection("jdbc:ucanaccess://D://Database5.accdb");
					 //System.out.println("Connected Successfully");
					 String query1="select * from stack_reg where g_id =?";
				        ResultSet rs1= null;
				         PreparedStatement ss3=con.prepareStatement(query1);
				         ss3.setString(1,y1);
				       rs1=ss3.executeQuery();
				        // System.out.println("done");
				         ResultSetMetaData rsMetaData = rs1.getMetaData();
				         
				       
				         if(!rs1.next())
				 		{
				 			JOptionPane.showMessageDialog(null,"Please enter an valid ID");
				 		}

				         else 
				         {
				        	// rs1.beforeFirst();
				        	 String i=null;
				        	 String i1=null;
				        	 String i2=null;
				        	 String i3=null;
				        	 String i4=null;
				        	 String i5=null;
				        	 String i6=null;
				        	 String i7=null;
				        	 String i8=null;
				        	 String i9=null;
				        	 String i10=null;
				        	 String i11=null;
				        	 String i12=null;
				        	 String i13=null;
				        	 String i14=null;


				        	 
				        	 
				   
				        		i=rs1.getString("Reg_Date");
				        		i1=rs1.getString("Name");
				        		i2=rs1.getString("Address");
				        		i3=rs1.getString("Address_2");
				        		i4=rs1.getString("Email");
				        		i5=rs1.getString("Mobile");
				        		i6=rs1.getString("Landline");
				        		i7=rs1.getString("Qualification");
				        		i8=rs1.getString("Designation");
				        		i9=rs1.getString("Experience");
				        		i10=rs1.getString("Date_of_birth");
				        		i11=rs1.getString("Age");
				        		i12=rs1.getString("Gender");
				        		i13=rs1.getString("Area_of_experience");
				        		i14=rs1.getString("Category");
								     
				        		 txtEnterName.setText(i);
				        		 textField_1.setText(i1);
				        		 textField_2.setText(i2);
				        		 textField_3.setText(i3);
				        		 textField_4.setText(i4);
				        		 textField_5.setText(i5);
				        		 textField_6.setText(i6);
				        		 textField_7.setText(i7);
				        		 textField_8.setText(i8);
				        		 textField_9.setText(i9);
				        		 textField_10.setText(i10);
				        		 textField_11.setText(i11);
				        		 textField_12.setText(i12);
				        		 textField_13.setText(i13);
				        		 textField_14.setText(i14);
				        	
				        		 f.setVisible(false);
									frame.setVisible(true);
									ss1=y1;

				         }
				        
				         
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		           
							}
		});
		
		
		JButton btnNewButton = new JButton("SAVE");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
								try {
									String s1=txtEnterName.getText();
									String s2=textField_1.getText();
									String s3=textField_2.getText();		
									String s4=textField_3.getText();
									String s5=textField_4.getText();
									String s6=textField_5.getText();
									String s7=textField_6.getText();
									String s8=textField_7.getText();
									String s9=textField_8.getText();
									String s10=textField_9.getText();
									String s11=textField_10.getText();
									String s12=textField_11.getText();
									String s13=textField_12.getText();
									String s14=textField_13.getText();
									String s15=textField_14.getText();
									
									//String g_id=tf.getText();
									//g_id=y1;
									//String b=oo.getText();
									//Connection connection;

					//connection = DriverManager.getConnection("jdbc:ucanaccess://D://Database5.accdb");
					String sql = "update stack_reg SET Reg_Date=?,Name=?,Address=?,Address_2=?,Email=?,Mobile=?,Landline=?,Qualification=?,Designation=?,Experience=?,Date_of_birth=?,Age=?,Gender=?,Area_of_experience=?,Category=? where g_id=?";		           
		            PreparedStatement ss=con.prepareStatement(sql);
		            
		            ss.setString(1,s1);
		            ss.setString(2,s2);
		            ss.setString(3,s3);
		            ss.setString(4,s4);
		            ss.setString(5,s5);
		            ss.setString(6,s6);
		            ss.setString(7,s7);
		            ss.setString(8,s8);
		            ss.setString(9,s9);
		            ss.setString(10,s10);
		            ss.setString(11,s11);
		            ss.setString(12,s12);
		            ss.setString(13,s13);
		            ss.setString(14,s14);
		            ss.setString(15,s15);
		            ss.setString(16,ss1);
		           // ss.setString(16,b);
		           // ss.setString(16,"ddd");
		            // int x=preparedStatement.executeUpdate(q1);
			      int e1=ss.executeUpdate();
			      JOptionPane.showMessageDialog(null,"Your Information with id "+ss1+" has been successfully Updated!!");
			      
				}
								
					catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				

			
			}
		});
		btnNewButton.setBounds(247, 500, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CLOSE");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBounds(373, 500, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("E:\\DR. PD 6 sem\\CPP\\Image\\Image\\unnamed.png"));
		lblNewLabel.setBounds(0, -68, 695, 708);
		frame.getContentPane().add(lblNewLabel);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				frame.dispose();
			}
		});

		
				

		JButton jb1=new JButton("Close");
		jb1.setBounds(300,300, 89, 23);
		f.getContentPane().add(jb1);
		jb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.dispose();
			}
		});
		
		
		

		// TODO Auto-generated method stub

	}
}


/* **********************************************************************************/

	 		
	
		/*public void setVisible(boolean b) {
			frame.setVisible(true);

	}*/

			
			
