package cpp;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;


public class UpdateVenue1 {
    
	public JFrame frmVenueRegistration;
	private JTextField txtEnterName;
	private JTextField textField_1;
	private JTextField textField_2;
	public int id;
	public static String y1,ss1;
	public static FileInputStream f1;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateVenue1 window = new UpdateVenue1();
					window.frmVenueRegistration.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	Connection con=null;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_8;
	public JComboBox comboBox;
	public JComboBox comboBox_1;
	 
	public UpdateVenue1() {
	con=DB.dbconnect();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frmVenueRegistration = new JFrame("Update Information");
		frmVenueRegistration.setTitle("Venue Registration");
		frmVenueRegistration.getContentPane().setBackground(Color.WHITE);
		
		frmVenueRegistration.getContentPane().setFont(new Font("Times New Roman", Font.PLAIN, 13));
		frmVenueRegistration.setBounds(0, 0, 1369, 713);
		frmVenueRegistration.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmVenueRegistration.getContentPane().setLayout(null);
		
		JButton btnNewButton_1 = new JButton("CLOSE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmVenueRegistration.dispose();
				
				
			}
		});
		
		
		JButton dash = new JButton("BACK ");
		dash.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmVenueRegistration.setVisible(false);
			//	Dashboard d = new Dashboard();
		//	d.frmSmartcityDashboard.setVisible(true);
			}
		});
		dash.setBounds(632, 640, 96, 23);
		frmVenueRegistration.getContentPane().add(dash);
		
		
		JButton btnNewButton_3 = new JButton("Attach Image here");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
try {
					
					JFileChooser jfc=new JFileChooser();
					jfc.showOpenDialog(null);
					File file=jfc.getSelectedFile();
					
					 f1=new FileInputStream(file);
					
					 JOptionPane.showMessageDialog(null, "Your Identifiable image has been successfully added!!!!");
				
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 
			}
		});
		btnNewButton_3.setBounds(907, 413, 124, 23);
		frmVenueRegistration.getContentPane().add(btnNewButton_3);
		
	
		btnNewButton_1.setBounds(884, 640, 89, 23);
		frmVenueRegistration.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("UPDATE YOUR INFORMATION HERE");
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 33));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setBounds(559, 11, 612, 46);
		frmVenueRegistration.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Founded By / Owner\r\n");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1.setBounds(368, 166, 147, 14);
		frmVenueRegistration.getContentPane().add(lblNewLabel_1);
		
		txtEnterName = new JTextField("");
		txtEnterName.setToolTipText("");
		txtEnterName.setBounds(525, 121, 232, 20);
		frmVenueRegistration.getContentPane().add(txtEnterName);
		txtEnterName.setColumns(10);
		
		textField_1 = new JTextField("");
		textField_1.setToolTipText("");
		textField_1.setBounds(525, 165, 232, 20);
		frmVenueRegistration.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Opening Time");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_2.setBounds(380, 206, 113, 14);
		frmVenueRegistration.getContentPane().add(lblNewLabel_2);
		
		textField_2 = new JTextField("");
		textField_2.setToolTipText("");
		textField_2.setBounds(525, 205, 232, 20);
		frmVenueRegistration.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
				
		JLabel lblNewLabel_5 = new JLabel("Venue Full Name");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_5.setBounds(388, 121, 147, 19);
		frmVenueRegistration.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Venue Address");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_6.setBounds(388, 358, 127, 14);
		frmVenueRegistration.getContentPane().add(lblNewLabel_6);
		
		textField_5 = new JTextField("");
		textField_5.setToolTipText("");
		textField_5.setBounds(525, 357, 232, 20);
		frmVenueRegistration.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Landmark");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_7.setBounds(388, 416, 126, 14);
		frmVenueRegistration.getContentPane().add(lblNewLabel_7);
		
		textField_6 = new JTextField("");
		textField_6.setBounds(525, 414, 232, 20);
		frmVenueRegistration.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Pin Code");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_8.setBounds(388, 461, 137, 14);
		frmVenueRegistration.getContentPane().add(lblNewLabel_8);
		
		textField_7 = new JTextField("");
		textField_7.setToolTipText("Enter Qualification");
		textField_7.setBounds(525, 459, 232, 20);
		frmVenueRegistration.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("City/Village");
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_9.setBounds(380, 512, 118, 14);
		frmVenueRegistration.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_17 = new JLabel("Venue Information");
		lblNewLabel_17.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_17.setBounds(374, 316, 238, 23);
		frmVenueRegistration.getContentPane().add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("General Information");
		lblNewLabel_18.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_18.setBounds(374, 77, 211, 23);
		frmVenueRegistration.getContentPane().add(lblNewLabel_18);
		
		JLabel lblNewLabel_20 = new JLabel("State");
		lblNewLabel_20.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_20.setBounds(380, 556, 46, 14);
		frmVenueRegistration.getContentPane().add(lblNewLabel_20);
		
		/*JLabel lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.setIcon(new ImageIcon(Venue.class.getResource("/Image/Smart City Logo change.jpg")));
		lblNewLabel_13.setBounds(10, 0, 338, 166);
		frmVenueRegistration.getContentPane().add(lblNewLabel_13);*/
		
		JLabel lblNewLabel_23 = new JLabel("EXPLORE");
		lblNewLabel_23.setBackground(new Color(204, 255, 51));
		lblNewLabel_23.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_23.setBounds(108, 322, 174, 23);
		frmVenueRegistration.getContentPane().add(lblNewLabel_23);
		
		JLabel lblNewLabel_24 = new JLabel("PLACES AND MILESTONES\r\n");
		lblNewLabel_24.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_24.setBounds(20, 350, 344, 26);
		frmVenueRegistration.getContentPane().add(lblNewLabel_24);
		
		JLabel lblNewLabel_25 = new JLabel("OF THE CITY !!");
		lblNewLabel_25.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_25.setBounds(74, 374, 198, 35);
		frmVenueRegistration.getContentPane().add(lblNewLabel_25);
		
		JButton btnNewButton_2 = new JButton("Help ");
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnNewButton_2.setBounds(1241, 11, 85, 21);
		frmVenueRegistration.getContentPane().add(btnNewButton_2);
		
		 comboBox = new JComboBox();
		comboBox.setToolTipText("Select City/Village");
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Chikaldara", "Bazargaon", "Pachgani", "Melghat", "Kondeshwar", "Wadali", "Amravati", "Nagpur"}));
		comboBox.setBounds(525, 509, 232, 21);
		frmVenueRegistration.getContentPane().add(comboBox);
		
	    comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Maharashtra", "(not avaiable in the list)"}));
		comboBox_1.setBounds(525, 554, 232, 21);
		frmVenueRegistration.getContentPane().add(comboBox_1);
		
		JLabel lblNewLabel_3 = new JLabel("Historical/Past Information");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_3.setBounds(962, 51, 260, 46);
		frmVenueRegistration.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Founder");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_4.setBounds(929, 123, 102, 13);
		frmVenueRegistration.getContentPane().add(lblNewLabel_4);
		
		textField = new JTextField("");
		textField.setBounds(997, 121, 174, 19);
		frmVenueRegistration.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("History of Venue (30-50 Words)");
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_10.setBounds(790, 166, 226, 35);
		frmVenueRegistration.getContentPane().add(lblNewLabel_10);
		
		textField_3 = new JTextField("");
		textField_3.setBounds(1013, 175, 174, 153);
		frmVenueRegistration.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Founded in (Year)");
		lblNewLabel_11.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_11.setBounds(807, 360, 137, 13);
		frmVenueRegistration.getContentPane().add(lblNewLabel_11);
		
		textField_4 = new JTextField("");
		textField_4.setBounds(997, 356, 190, 19);
		frmVenueRegistration.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Information Submitted By :-\r\n");
		lblNewLabel_12.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_12.setBounds(807, 481, 207, 13);
		frmVenueRegistration.getContentPane().add(lblNewLabel_12);
		
		textField_8 = new JTextField("");
		textField_8.setBounds(1034, 479, 162, 19);
		frmVenueRegistration.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		/****************************************/
       JFrame f=new JFrame("Details");
		f.setBounds(100, 100, 700, 690);
		f.setVisible(true);
		f.getContentPane().setLayout(null);
		
		JLabel j =new JLabel("Please enter the data id and name of Venue Enrollment");	
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
					
					//	Statement st=con.createStatement();
					//Connection connection = DriverManager.getConnection("jdbc:ucanaccess://D://Database5.accdb");
					 //System.out.println("Connected Successfully");
					// Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
						//Connection con=DriverManager.getConnection("jdbc:ucanaccess://F://polytechinc//TestData.accdb");
						Statement st=con.createStatement();
					 String query1="select * from Venue where g_id=?";
				        ResultSet rs1= null;
				         PreparedStatement ss3=con.prepareStatement(query1);
				         ss3.setString(1,y1);
				       rs1=ss3.executeQuery();
				        // System.out.println("done");
				        // ResultSetMetaData rsMetaData = rs1.getMetaData();
				         
				       
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
				        	


				        	 
				        	 
				   
				        		i=rs1.getString("Venue_Name");
				        		i1=rs1.getString("Owner");
				        		i2=rs1.getString("Opening_Time");
				        		i3=rs1.getString("Venue_Address");
				        		i4=rs1.getString("Landmark");
				        		i5=rs1.getString("Pincode");
				        		i6=rs1.getString("City");
				        		i7=rs1.getString("State");
				        		i8=rs1.getString("Founder");
				        		i9=rs1.getString("History");
				        		i10=rs1.getString("Found_Year");
				        		i11=rs1.getString("Submitter_Name");
				        		i12=rs1.getString("img");
				        		
				        	  /*  i=txtEnterName.getText();
								i1=textField_1.getText();
								i2=textField_2.getText();		
								i9=textField_3.getText();
								i10=textField_4.getText();
								i3=textField_5.getText();
								i4=textField_6.getText();
								i5=textField_7.getText();
								i11=textField_8.getText();
								i8=textField.getText();
								i6=comboBox.getSelectedItem().toString();
								i7=comboBox_1.getSelectedItem().toString();
								i12=btnNewButton_3.getActionCommand();*/
								     
				        		 txtEnterName.setText(i);
				        		 textField_1.setText(i1);//i5,i2,i10
				        		 textField_2.setText(i2);
				        		 textField_5.setText(i3);
				        		 textField_6.setText(i4);
				        		 textField_7.setText(i5);
				        		 comboBox.setToolTipText(i6);
				        		 comboBox_1.setToolTipText(i7);
				        		 //((String) comboBox).setItem(i6);
				        		 textField.setText(i8);
				        		 textField_3.setText(i9);
				        		 textField_4.setText(i10);
				        		 textField_8.setText(i11);
				        		// textField_12.setText(i12);
				        		
				        	
				        		 f.setVisible(false);
				        		frmVenueRegistration.setVisible(true);
								ss1=y1;

				         }
				        
				 }
				 catch(Exception e2)
				 {
					 System.out.println(e2);
				 }
				
				
			
				 }
		});
		
		JButton btnNewButton_4 = new JButton("UPDATE");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String y2=tf.getText();
		
				String s1=txtEnterName.getText();//name 1
				String s2=textField_1.getText();//founder and owner 2
				String s3=textField_2.getText();//opening time	3
				String s10=textField_3.getText();//History 10
				String s11=textField_4.getText();//Founded in year 11
				String s4=textField_5.getText();//address 4
				String s7 =(String) comboBox.getSelectedItem();//city 7
				String s8=(String) comboBox_1.getSelectedItem();//state 8
				String s12=textField_8.getText();//information Submit 12
				String s9=textField.getText();//founder 9
				String s5=textField_6.getText();//landmark 5
				String s6=textField_7.getText();//pincode 6
				
			//String s13=btnNewButton_3.getActionCommand();textField_5
				try
				{
					//Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
					//Connection con=DriverManager.getConnection("jdbc:ucanaccess://F://polytechinc//TestData.accdb");
					Statement st=con.createStatement();
					String sql = "UPDATE  Venue SET  Venue_Name=?,Owner=?,Opening_Time=?,Venue_Address=?,Landmark=?,Pincode=?,City=?,State=?,Founder=?,History=?,Found_Year=?,Submitter_Name=? WHERE g_id=?";//
					PreparedStatement ss=con.prepareStatement(sql); 
				//ResultSet rs=null;
				//	System.out.println("Query Executed");
					  int rs;
					    ss.setString(1,s1);
					    ss.setString(2, s2);
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
					    ss.setString(13, y2);
					
					
					  
				rs=ss.executeUpdate();
				JOptionPane.showMessageDialog(null,"Your Information has been successfully Updated!!");
					
					/*String y2=tf.getText();
					Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
					Connection con=DriverManager.getConnection("jdbc:ucanaccess://F://polytechinc//TestData.accdb");
					Statement st=con.createStatement();
										
					String sql = "UPDATE Venue SET Venue_Name=?,Owner=?,Opening_Time=?,Venue_Address=?,Landmark=?,Pincode=?,City=?,State=?,Founder=?,History=?,Found_Year=?,Submitter_Name=?,img=? where g_id="+y2;		           
					PreparedStatement ss=con.prepareStatement(sql);
					ss.setString(1,s1);
					ss.setString(2, s2);
					ss.setString(3,s3);
					ss.setString(4,s4);
					ss.setString(5,s5); ss3.setString(1,y1);
					ss.setString(6,s6);
					ss.setString(7,s7);
					ss.setString(8,s8);
					ss.setString(9,s9);
					ss.setString(10,s10);
					ss.setString(11,s11);
					ss.setString(12,s12);
					ss.setString(13, s13);
					int rs;
					rs=ss.executeUpdate();*/
  /*  ss.setString(1,s1);
    ss.setString(2, s2);
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
    //  ss.setString(16,ss1);
    
    int rs;
    ss.executeUpdate();*/

				
				}
				catch(Exception e1)
				{
					System.out.println(e1);
				}
				
			}
		});
		btnNewButton_4.setBounds(758, 640, 89, 23);
		frmVenueRegistration.getContentPane().add(btnNewButton_4);
			
	/*	JLabel lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.setIcon(new ImageIcon(Design.class.getResource("/Image/Smart City Logo change.jpg")));
		lblNewLabel_13.setBounds(0, 0, 323, 157);
		frame.getContentPane().add(lblNewLabel_13);*/
		
		
		JLabel lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.setIcon(new ImageIcon(UpdateVenue1.class.getResource("/image/fort4.jpg")));
		lblNewLabel_13.setBounds(20, 48, 1395, 821);
		frmVenueRegistration.getContentPane().add(lblNewLabel_13);
	}


	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frmVenueRegistration.setVisible(false);
		
	}
}
