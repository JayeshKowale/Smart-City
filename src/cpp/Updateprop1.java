package cpp;


import javax.swing.*;

import com.mysql.jdbc.PreparedStatement;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;


public class Updateprop1 {
    
	public JFrame frame;
	private JTextField txtEnterName;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Updateprop1 window = new Updateprop1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	
	Connection con=null;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_13;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_14;
	private JTextField textField_12;
	private JTextField textField_15;
	public Updateprop1() {
		 con = DB.dbconnect();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Property Registration");
		frame.getContentPane().setBackground(new Color(135, 206, 250));
		
		frame.getContentPane().setFont(new Font("Times New Roman", Font.PLAIN, 13));
		frame.setBounds(0, 0, 1369, 713);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JButton dash = new JButton("BACK");
		dash.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.setVisible(false);
				PropertyReg d = new PropertyReg();
				d.frame.setVisible(true);
			}
		});
		
		
		/////////////////////////////////////////////////////////
		
		
		
		
	    JFrame f=new JFrame("Details");
		f.setBounds(100, 100, 700, 690);
		f.setVisible(true);
		f.getContentPane().setLayout(null);
		
		JLabel j =new JLabel("Please enter the data id and name of ANTHROPOLOGICAL INPUTS");	
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
				
				
			
				 try {
					
				
						Statement st=con.createStatement();
					 String query1="select * from prop_reg where prop_id =?";
				        ResultSet rs1= null;
				         PreparedStatement ss3=(PreparedStatement) con.prepareStatement(query1);
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
				        	 String i15=null;
				        	 String i16=null;
				        	 String i17=null;
				        	


				        	 
				        	 
				   
				                i=rs1.getString("name_ow");
				        		i1=rs1.getString("ph_no");
				        		i2=rs1.getString("email");
				        		i3=rs1.getString("district");
				        		i4=rs1.getString("state");
				        		i5=rs1.getString("prop_addr");
				        		i6=rs1.getString("land_m");
				        		i7=rs1.getString("pin");
				        		i8=rs1.getString("district_p");
				        		i9=rs1.getString("prop_reg_y");
				        		i10=rs1.getString("prop_reg_d");
				        		i11=rs1.getString("land_l");
				        		i12=rs1.getString("payable_tax");
				        		i13=rs1.getString("city");
				        		i14=rs1.getString("state_prop");
				        		i15=rs1.getString("sq_foot");
				        		i16=rs1.getString("area_road");
				        		i17=rs1.getString("prop_by");
				        		
				        		
				        		
				        	
				    			
				        		txtEnterName.setText(i);
				        		textField_1.setText(i1);
				        		textField_2.setText(i2);
				        		textField_3.setText(i3);
				        		textField_4.setText(i4);
				        		textField_5.setText(i5);
				    			textField_6.setText(i6);
				    			textField_7.setText(i7);
				    			textField_8.setText(i8);//comboBox_4
				    			textField_9.setText(i9);
				    			textField_10.setText(i10);
				    			textField_11.setText(i11);
				    			textField_12.setText(i12);
				    			textField_13.setText(i13);
				    			textField_14.setText(i14);
				    			textField_15.setText(i15);
				    			textField_16.setText(i16);
				    			textField_17.setText(i17);
				           
				        	PropertyReg f=new PropertyReg();
				        		 f.frame.setVisible(false);
				        	//	 frmVenueRegistration.setVisible(true);
								//	ss1=y1;

				         }
				        
				 }
				 catch(SQLException e3)
				 {
					 System.out.println(e3);
				 }
				 catch(Exception e2)
				 {
					 System.out.println(e2);
				 }
				
				
			
				 }
		});	
		
		
		JButton btnNewButton = new JButton("Update");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String y2=tf.getText();
				
			
        		

    		String name=txtEnterName.getText();
    		String ph_no=textField_1.getText();
    		String email=textField_2.getText();
    		String district=textField_3.getText();
    		String state=textField_4.getText();
    		String prop_addr=textField_5.getText();
    		String land_m=textField_6.getText();
    		String pin=textField_7.getText();
    		String district_p =textField_8.getText();//comboBox_4
    		String prop_reg_y=textField_9.getText();
    		String prop_reg_d=textField_10.getText();
    		String land_l=textField_11.getText();
    		String payable_tax=textField_12.getText();
    		String city=textField_13.getText();
    		String state_prop=textField_14.getText();
    		String sq_foot=textField_15.getText();
    		String area_road=textField_16.getText();
    		String prop_by=textField_17.getText();
			
			
			try {
				Statement st=con.createStatement();
				String sql = "UPDATE  prop_reg SET name_ow=?,ph_no=?,email=?,district=?,state=?,prop_addr=?,land_m=?,pin=?,district_p=?,prop_reg_y=?,prop_reg_d=?,land_l=?,payable_tax=?,city=?,state_prop=?,sq_foot=?,area_road=?,prop_by=? WHERE prop_id=?";//
				PreparedStatement ss=(PreparedStatement) con.prepareStatement(sql); 
			//ResultSet rs=null;
			//	System.out.println("Query Executed");
				  int rs;
				    ss.setString(1,name);
				    ss.setString(2, ph_no);
				    ss.setString(3,email);
				    ss.setString(4,district);
				    ss.setString(5,state);
				    ss.setString(6,prop_addr);
				    ss.setString(7,land_m);
				    ss.setString(8,pin);
				    ss.setString(9,district_p);
				    ss.setString(10,prop_reg_y);
				    ss.setString(11,prop_reg_d);
				    ss.setString(12,land_l);
				    ss.setString(13, payable_tax);
				    ss.setString(14, city);
				    ss.setString(15, state_prop);
				    ss.setString(16, sq_foot);
				    ss.setString(17, area_road);
				    ss.setString(18, prop_by);
				    ss.setString(19, y2);
				
				
				  
			rs=ss.executeUpdate();
			JOptionPane.showMessageDialog(null,"Your Information has been successfully Updated!!");
			
			
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
			
			
			}
		});
		btnNewButton.setForeground(Color.BLACK);
		
			btnNewButton.setBounds(779, 640, 89, 23);
			frame.getContentPane().add(btnNewButton);	
		
					
					
					
					
					
					
		
		textField_15 = new JTextField();
		textField_15.setBounds(1074, 309, 238, 20);
		frame.getContentPane().add(textField_15);
		textField_15.setColumns(10);
		
		JLabel lblNewLabel_19 = new JLabel("Sq. foot of property");
		lblNewLabel_19.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_19.setBounds(875, 312, 137, 14);
		frame.getContentPane().add(lblNewLabel_19);
		
		textField_12 = new JTextField();
		textField_12.setBounds(1074, 165, 238, 20);
		frame.getContentPane().add(textField_12);
		textField_12.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("Payable Tax");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_14.setBounds(875, 168, 80, 14);
		frame.getContentPane().add(lblNewLabel_14);
		dash.setBounds(589, 640, 146, 23);
		frame.getContentPane().add(dash);
		
		JButton btnNewButton_1 = new JButton("CLOSE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				
				
			}
		});
		btnNewButton_1.setBounds(896, 640, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Property Registration");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setBounds(559, 11, 338, 46);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Phone Number");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setBounds(388, 167, 113, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtEnterName = new JTextField();
		txtEnterName.setToolTipText("");
		txtEnterName.setBounds(525, 121, 232, 20);
		frame.getContentPane().add(txtEnterName);
		txtEnterName.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setToolTipText("");
		textField_1.setBounds(525, 165, 235, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Email Address");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2.setBounds(388, 207, 113, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("District");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_3.setBounds(388, 244, 72, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setToolTipText("");
		textField_2.setBounds(525, 205, 232, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		
		
		JLabel lblNewLabel_4 = new JLabel("State");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_4.setBounds(388, 269, 113, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Name of Owner");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_5.setBounds(388, 121, 147, 19);
		frame.getContentPane().add(lblNewLabel_5);
		
		textField_3 = new JTextField();
		textField_3.setToolTipText("");
		textField_3.setBounds(525, 242, 232, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setToolTipText("");
		textField_4.setBounds(525, 273, 232, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Property Address");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_6.setBounds(388, 358, 113, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		textField_5 = new JTextField();
		textField_5.setToolTipText("");
		textField_5.setBounds(525, 356, 232, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Landmark");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_7.setBounds(388, 416, 126, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		textField_6 = new JTextField();
		textField_6.setBounds(525, 414, 232, 20);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Pin Code");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_8.setBounds(388, 461, 137, 14);
		frame.getContentPane().add(lblNewLabel_8);
		
		textField_7 = new JTextField();
		textField_7.setToolTipText("Enter Qualification");
		textField_7.setBounds(525, 459, 232, 20);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("District");
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_9.setBounds(388, 497, 118, 14);
		frame.getContentPane().add(lblNewLabel_9);
		
		textField_8 = new JTextField();
		textField_8.setToolTipText("Enter Designation");
		textField_8.setBounds(525, 495, 232, 20);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Property Registered In:");
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_10.setBounds(374, 555, 161, 14);
		frame.getContentPane().add(lblNewLabel_10);
		
		textField_9 = new JTextField();
		textField_9.setToolTipText("Enter Experience");
		textField_9.setBounds(525, 553, 227, 20);
		frame.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Date of Registration:");
		lblNewLabel_11.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_11.setBounds(374, 602, 147, 14);
		frame.getContentPane().add(lblNewLabel_11);
		
		textField_10 = new JTextField();
		textField_10.setToolTipText("DD/MM/YYYY");
		textField_10.setBounds(525, 600, 224, 20);
		frame.getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("Landline Number");
		lblNewLabel_15.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_15.setBounds(875, 127, 137, 14);
		frame.getContentPane().add(lblNewLabel_15);
		
		textField_11 = new JTextField();
		textField_11.setToolTipText("Enter Category");
		textField_11.setBounds(1074, 121, 238, 20);
		frame.getContentPane().add(textField_11);
		textField_11.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("City");
		lblNewLabel_12.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_12.setBounds(877, 214, 46, 14);
		frame.getContentPane().add(lblNewLabel_12);
		
		textField_13 = new JTextField();
		textField_13.setBounds(1074, 205, 238, 20);
		frame.getContentPane().add(textField_13);
		textField_13.setColumns(10);
		
		JLabel lblNewLabel_16 = new JLabel("Area/Road ");
		lblNewLabel_16.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_16.setBounds(875, 358, 80, 14);
		frame.getContentPane().add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("Property Information");
		lblNewLabel_17.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_17.setBounds(374, 331, 238, 14);
		frame.getContentPane().add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("Personal Information");
		lblNewLabel_18.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_18.setBounds(374, 86, 211, 14);
		frame.getContentPane().add(lblNewLabel_18);
		
		textField_16 = new JTextField();
		textField_16.setBounds(1074, 356, 238, 20);
		frame.getContentPane().add(textField_16);
		textField_16.setColumns(10);
		
		JLabel lblNewLabel_20 = new JLabel("State");
		lblNewLabel_20.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_20.setBounds(877, 269, 46, 14);
		frame.getContentPane().add(lblNewLabel_20);
		
		JLabel lblNewLabel_21 = new JLabel("Property Registered by:");
		lblNewLabel_21.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_21.setBounds(862, 416, 181, 14);
		frame.getContentPane().add(lblNewLabel_21);
		
		textField_17 = new JTextField();
		textField_17.setBounds(1074, 414, 238, 20);
		frame.getContentPane().add(textField_17);
		textField_17.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setBounds(1074, 267, 238, 20);
		frame.getContentPane().add(textField_14);
		textField_14.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.setIcon(new ImageIcon(Updateprop1.class.getResource("/Image/Smart City Logo change.jpg")));
		lblNewLabel_13.setBounds(10, 0, 338, 166);
		frame.getContentPane().add(lblNewLabel_13);
		
		JLabel lblNewLabel_22 = new JLabel("New label");
		lblNewLabel_22.setIcon(new ImageIcon(Updateprop1.class.getResource("/Image/Real-Estate-b-edited.jpg")));
		lblNewLabel_22.setBounds(337, -11, 1025, 691);
		frame.getContentPane().add(lblNewLabel_22);
		
		JLabel lblNewLabel_23 = new JLabel("WELCOME TO");
		lblNewLabel_23.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_23.setBounds(80, 316, 174, 23);
		frame.getContentPane().add(lblNewLabel_23);
		
		JLabel lblNewLabel_24 = new JLabel("PROPERTY REGISTRATION");
		lblNewLabel_24.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_24.setBounds(20, 350, 344, 26);
		frame.getContentPane().add(lblNewLabel_24);
		
		JLabel lblNewLabel_25 = new JLabel("FORM");
		lblNewLabel_25.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_25.setBounds(109, 375, 104, 35);
		frame.getContentPane().add(lblNewLabel_25);
	
	

			
			
	}}
