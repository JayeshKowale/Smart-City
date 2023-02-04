package cpp;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;

import com.mysql.jdbc.Statement;
import java.util.Date;
import cpp.DB;

import java.awt.Font;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
//import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.awt.event.ActionEvent;


public class prop_track {

	 JFrame frmPropertyTracking;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	public static String dd,name,desig,grad,gender,age;
	public static String cont;
	public static String dd2,tax2,name2,addr2,sq2;
	public static String yr2;
	public static String con3,id4,con4,name4,desig4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					prop_track window = new prop_track();
					window.frmPropertyTracking.setVisible(true);
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
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	public prop_track() {
		con = DB.dbconnect();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPropertyTracking = new JFrame();
		frmPropertyTracking.setFont(new Font("Times New Roman", Font.BOLD, 14));
		frmPropertyTracking.setTitle("Property Tracking ");
		frmPropertyTracking.setBounds(100, 100, 1088, 698);
		frmPropertyTracking.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPropertyTracking.getContentPane().setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmPropertyTracking.setVisible(false);
				view d =new view();
				d.frmInformationSearch.setVisible(true);
			}
		});
		
		textField_18 = new JTextField();
		textField_18.setEditable(false);
		textField_18.setBounds(778, 551, 251, 20);
		frmPropertyTracking.getContentPane().add(textField_18);
		textField_18.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("Designation");
		lblNewLabel_14.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_14.setBounds(573, 553, 72, 14);
		frmPropertyTracking.getContentPane().add(lblNewLabel_14);
		
		textField_17 = new JTextField();
		textField_17.setEditable(false);
		textField_17.setBounds(778, 502, 261, 20);
		frmPropertyTracking.getContentPane().add(textField_17);
		textField_17.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Supporting Staff Name :");
		lblNewLabel_13.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_13.setBounds(573, 504, 145, 14);
		frmPropertyTracking.getContentPane().add(lblNewLabel_13);
		
		textField_16 = new JTextField();
		textField_16.setEditable(false);
		textField_16.setBounds(689, 368, 350, 20);
		frmPropertyTracking.getContentPane().add(textField_16);
		textField_16.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setEditable(false);
		textField_15.setBounds(778, 344, 261, 20);
		frmPropertyTracking.getContentPane().add(textField_15);
		textField_15.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Address :");
		lblNewLabel_12.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_12.setBounds(623, 371, 103, 14);
		frmPropertyTracking.getContentPane().add(lblNewLabel_12);
		
		JLabel lblNewLabel_11 = new JLabel("Name of Owner");
		lblNewLabel_11.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_11.setBounds(623, 346, 103, 14);
		frmPropertyTracking.getContentPane().add(lblNewLabel_11);
		
		textField_14 = new JTextField();
		textField_14.setEditable(false);
		textField_14.setBounds(867, 214, 86, 20);
		frmPropertyTracking.getContentPane().add(textField_14);
		textField_14.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setEditable(false);
		textField_13.setBounds(666, 214, 86, 20);
		frmPropertyTracking.getContentPane().add(textField_13);
		textField_13.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setEditable(false);
		textField_12.setBounds(778, 186, 261, 20);
		frmPropertyTracking.getContentPane().add(textField_12);
		textField_12.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setEditable(false);
		textField_11.setBounds(778, 151, 261, 20);
		frmPropertyTracking.getContentPane().add(textField_11);
		textField_11.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Age :");
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_10.setBounds(819, 216, 89, 14);
		frmPropertyTracking.getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_9 = new JLabel("Gender :");
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_9.setBounds(595, 216, 84, 14);
		frmPropertyTracking.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_8 = new JLabel("Graduation :");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_8.setBounds(595, 188, 110, 14);
		frmPropertyTracking.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_7 = new JLabel("Designation :");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_7.setBounds(595, 157, 140, 14);
		frmPropertyTracking.getContentPane().add(lblNewLabel_7);
		
		textField_10 = new JTextField();
		textField_10.setEditable(false);
		textField_10.setBounds(778, 318, 261, 20);
		frmPropertyTracking.getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Property sq_foot");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_6.setBounds(623, 321, 116, 14);
		frmPropertyTracking.getContentPane().add(lblNewLabel_6);
		
		textField_9 = new JTextField();
		textField_9.setEditable(false);
		textField_9.setBounds(778, 120, 261, 20);
		frmPropertyTracking.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Supporting Staff Name :");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(595, 122, 140, 14);
		frmPropertyTracking.getContentPane().add(lblNewLabel_5);
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_1.setBounds(318, 598, 132, 34);
		frmPropertyTracking.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_4 = new JLabel(".");
		lblNewLabel_4.setForeground(Color.RED);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_4.setBounds(65, 531, 498, 58);
		frmPropertyTracking.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel(".");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setBackground(Color.WHITE);
		lblNewLabel_3.setBounds(284, 349, 395, 56);
		frmPropertyTracking.getContentPane().add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(192, 100, 261, 19);
		frmPropertyTracking.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(778, 44, 261, 19);
		frmPropertyTracking.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(778, 86, 261, 19);
		frmPropertyTracking.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(208, 274, 261, 19);
		frmPropertyTracking.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(778, 261, 261, 19);
		frmPropertyTracking.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(778, 291, 261, 19);
		frmPropertyTracking.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(257, 434, 261, 19);
		frmPropertyTracking.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(783, 405, 261, 19);
		frmPropertyTracking.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBounds(778, 447, 261, 19);
		frmPropertyTracking.getContentPane().add(textField_8);
		
		JLabel lblNewLabel = new JLabel("NEWLY REGISTERED:- ");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(46, 35, 341, 34);
		frmPropertyTracking.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Property ID :");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(65, 100, 151, 19);
		frmPropertyTracking.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Supporting Staff ID : ");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(595, 44, 151, 19);
		frmPropertyTracking.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Supporting Staff Contact : ");
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1_1_1.setBounds(595, 86, 170, 19);
		frmPropertyTracking.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("PENDING PROPERTY TAX");
		lblNewLabel_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1_1_1_1.setBounds(46, 229, 247, 35);
		frmPropertyTracking.getContentPane().add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Enter Property ID :");
		lblNewLabel_1_1_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1_1_1_2.setBounds(63, 274, 170, 19);
		frmPropertyTracking.getContentPane().add(lblNewLabel_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_2_1 = new JLabel("Lastly Paid in (Year)");
		lblNewLabel_1_1_1_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1_1_1_2_1.setBounds(623, 261, 170, 19);
		frmPropertyTracking.getContentPane().add(lblNewLabel_1_1_1_2_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("PROPERTY REASSESSMENT");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1_1_1_1_1.setBounds(46, 389, 320, 35);
		frmPropertyTracking.getContentPane().add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_2_1_1 = new JLabel("Payable Tax");
		lblNewLabel_1_1_1_2_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1_1_1_2_1_1.setBounds(623, 291, 170, 19);
		frmPropertyTracking.getContentPane().add(lblNewLabel_1_1_1_2_1_1);
		
		JLabel lblNewLabel_1_1_1_2_1_1_1 = new JLabel("Do want to pay the tax (YES/NO) :");
		lblNewLabel_1_1_1_2_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1_1_1_2_1_1_1.setBounds(24, 323, 211, 19);
		frmPropertyTracking.getContentPane().add(lblNewLabel_1_1_1_2_1_1_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("YES");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			/*	if(rdbtnNewRadioButton.isSelected())
				{
					try {
					DateTimeFormatter formatter= DateTimeFormatter.ofPattern("yyyy-MM-dd");
					String txt2=textField_3.getText();
					textField_6.setText(txt2);
					String qr2="select * from prop_reg where prop_id='"+txt2+"'";
					Statement st2;
					
						st2 = (Statement) con.createStatement();
					
						ResultSet rs2 =st2.executeQuery(qr2);
						
						while(rs2.next())
						{
							dd2=rs2.getString("prop_reg_d");
							yr2=rs2.getString("prop_reg_y");
						}
					    textField_4.setText(yr2);
					    Date dt=new Date();
					    
					   //LocalDate cd = LocalDate.now();
					   SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
					 //  System.out.print(dateFormat.format(dt));
					   String d=dateFormat.format(dt);
					   //System.out.println(d);
					//   Date d = (java.sql.Date) java.util.Date.from(cd.atStartOfDay(ZoneId.systemDefault()).toInstant()); 
					//String first=d;
					String second=dd2;
					LocalDate dt2=LocalDate.parse(second,formatter);
					LocalDate dt1=LocalDate.parse(d,formatter);
					long daysbetween = ChronoUnit.DAYS.between(dt2, dt1);
					
					//System.out.print(daysbetween);
					daysbetween=daysbetween*100;
					
					String days= Long.toString(daysbetween);
					textField_5.setText(days+"Rs");
			//		lblNewLabel_4.setText("The total expenditure with reaccessment charges are "+pay+(sq_foot*100));
					
					//3
					
					String qr4="select * from supp_staff where avail='yes'";
					Statement st4=(Statement) con.createStatement();
					
						ResultSet rs4 =st4.executeQuery(qr4);
						
						while(rs4.next())
						{
							id4=rs4.getString("staff_id");
							con4=rs4.getString("mob_no");
						}
						
						
						textField_7.setText(id4);
						textField_8.setText(con4);
						
						
					
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
			*/	
			}
		});
		rdbtnNewRadioButton.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 14));
		rdbtnNewRadioButton.setBounds(257, 321, 103, 21);
		frmPropertyTracking.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("NO");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			/*	if(rdbtnNewRadioButton_1.isSelected())
				{
					try {
					String qr3="select * from supp_staff where avail='yes'";
					Statement st3;
					
						st3 = (Statement) con.createStatement();
					
					
						ResultSet rs3 =st3.executeQuery(qr3);
						
						while(rs3.next())
						{
							
							con3=rs3.getString("officer_name");
						}
						
					
					lblNewLabel_3.setText("Please consult with our supporting staff "+con3);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}}
			*/	
			}
			
		});
		rdbtnNewRadioButton_1.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 14));
		rdbtnNewRadioButton_1.setBounds(392, 321, 126, 21);
		frmPropertyTracking.getContentPane().add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_1_1_1_2_1_2 = new JLabel("Property ID");
		lblNewLabel_1_1_1_2_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1_1_1_2_1_2.setBounds(65, 434, 170, 19);
		frmPropertyTracking.getContentPane().add(lblNewLabel_1_1_1_2_1_2);
		
		JLabel lblNewLabel_1_1_1_2_1_2_1 = new JLabel("Supporting Staff ID");
		lblNewLabel_1_1_1_2_1_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1_1_1_2_1_2_1.setBounds(573, 405, 170, 19);
		frmPropertyTracking.getContentPane().add(lblNewLabel_1_1_1_2_1_2_1);
		
		JLabel lblNewLabel_1_1_1_2_1_2_1_1 = new JLabel("Supporting Staff Contact :");
		lblNewLabel_1_1_1_2_1_2_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1_1_1_2_1_2_1_1.setBounds(573, 447, 225, 19);
		frmPropertyTracking.getContentPane().add(lblNewLabel_1_1_1_2_1_2_1_1);
		
		JLabel lblNewLabel_1_1_1_2_1_2_1_1_1 = new JLabel("Do you want to reassess your property ? (YES/NO) :");
		lblNewLabel_1_1_1_2_1_2_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1_1_1_2_1_2_1_1_1.setBounds(24, 480, 247, 19);
		frmPropertyTracking.getContentPane().add(lblNewLabel_1_1_1_2_1_2_1_1_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("YES");
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					String id1=textField.getText();
					String id2=textField_3.getText();
					String id3=textField_6.getText();
					
					String qr4="select * from supp_staff where avail='yes'";
					Statement st4=(Statement) con.createStatement();
					
						ResultSet rs4 =st4.executeQuery(qr4);
						
						while(rs4.next())
						{
							id4=rs4.getString("staff_id");
							con4=rs4.getString("mob_no");
						}
						
						
						textField_7.setText(id4);
						textField_8.setText(con4);
						
						
						
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				
				
			}
		});
		rdbtnNewRadioButton_2.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 14));
		rdbtnNewRadioButton_2.setBounds(284, 478, 103, 21);
		frmPropertyTracking.getContentPane().add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("NO");
		rdbtnNewRadioButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				lblNewLabel_4.setText("OK!!!!! Thank you for being us!!!!!");
				
			}
		});
		rdbtnNewRadioButton_1_1.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 14));
		rdbtnNewRadioButton_1_1.setBounds(407, 478, 126, 21);
		frmPropertyTracking.getContentPane().add(rdbtnNewRadioButton_1_1);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				
				String id1=textField.getText();
				String id2=textField_3.getText();
				String id3=textField_6.getText();
				
				String qr1="select * from supp_staff where avail='yes'";
				Statement st=(Statement) con.createStatement();
				
					ResultSet rs =st.executeQuery(qr1);
					
					while(rs.next())
					{
						dd=rs.getString("staff_id");
						cont=rs.getString("mob_no");
						name=rs.getString("officer_name");
						desig=rs.getString("designation");
						grad=rs.getString("graduation");
						gender=rs.getString("gender");
						age=rs.getString("age");
					}
					
					
					textField_1.setText(dd);
					textField_2.setText(cont);
					textField_9.setText(name);
					textField_11.setText(desig);
					textField_12.setText(grad);
					textField_13.setText(gender);
					textField_14.setText(age);
					
					
					
					// yes 2
					

					if(rdbtnNewRadioButton.isSelected())
					{
						try {
						DateTimeFormatter formatter= DateTimeFormatter.ofPattern("yyyy-MM-dd");
						String txt2=textField_3.getText();
						textField_6.setText(txt2);
						String qr2="select * from prop_reg where prop_id='"+txt2+"'";
						Statement st2;
						
							st2 = (Statement) con.createStatement();
						
							ResultSet rs2 =st2.executeQuery(qr2);
							
							while(rs2.next())
							{
								dd2=rs2.getString("prop_reg_d");
								yr2=rs2.getString("prop_reg_y");
								name2=rs2.getString("name_ow");
								addr2=rs2.getString("prop_addr");
								tax2=rs2.getString("payable_tax");
								sq2=rs2.getString("sq_foot");
							}
						    textField_4.setText(yr2);
						    /*Date dt=new Date();
						    
						   //LocalDate cd = LocalDate.now();
						   SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
						 //  System.out.print(dateFormat.format(dt));
						   String d=dateFormat.format(dt);
						   //System.out.println(d);
						//   Date d = (java.sql.Date) java.util.Date.from(cd.atStartOfDay(ZoneId.systemDefault()).toInstant()); 
						//String first=d;
						String second=dd2;
						LocalDate dt2=LocalDate.parse(second,formatter);
						LocalDate dt1=LocalDate.parse(d,formatter);
						long daysbetween = ChronoUnit.DAYS.between(dt2, dt1);
						
						//System.out.print(daysbetween);
						daysbetween=daysbetween*100;
						
						String days= Long.toString(daysbetween);*/
						textField_5.setText(tax2);
						textField_10.setText(sq2);
						textField_15.setText(name2);
						textField_16.setText(addr2);
						double pri=Integer.parseInt(tax2)+(Integer.parseInt(sq2)*35);
						lblNewLabel_4.setText("The total expenditure with reaccessment charges are "+pri+"Rs-/");
						
						//3
						String qr4="select * from supp_staff where avail='yes'";
						Statement st4=(Statement) con.createStatement();
						
							ResultSet rs4 =st4.executeQuery(qr4);
							
							while(rs4.next())
							{
								id4=rs4.getString("staff_id");
								con4=rs4.getString("mob_no");
								name4=rs4.getString("officer_name");
								desig4=rs4.getString("designation");
							}
							
							
							textField_7.setText(id4);
							textField_8.setText(con4);
							textField_17.setText(name4);
							textField_18.setText(desig4);
						
							
						
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
					}
					
					// no 2
					
					if(rdbtnNewRadioButton_1.isSelected())
					{
						try {
						String qr3="select * from supp_staff where avail='yes'";
						Statement st3;
						
							st3 = (Statement) con.createStatement();
						
						
							ResultSet rs3 =st3.executeQuery(qr3);
							
							while(rs3.next())
							{
								
								con3=rs3.getString("officer_name");
							}
							
						
						lblNewLabel_3.setText("Please consult with our supporting staff "+con3);
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}}
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
			}
		});
		btnNewButton.setBackground(new Color(253, 245, 230));
		btnNewButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		btnNewButton.setBounds(528, 598, 151, 34);
		frmPropertyTracking.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(prop_track.class.getResource("/Image/proptrack.jpg")));
		lblNewLabel_2.setBounds(-175, 0, 1312, 661);
		frmPropertyTracking.getContentPane().add(lblNewLabel_2);
	}

	protected String numberToWord(long daysbetween) {
		// TODO Auto-generated method stub
		return null;
	}
}


