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
import java.sql.SQLException;
import java.sql.Statement;


public class Venue1 {
    
	public JFrame frmVenueRegistration;
	private JTextField txtEnterName;
	private JTextField textField_1;
	private JTextField textField_2;
	public int id;
	public static FileInputStream f1;

	/**
	 * Launch the application.
	 */
	Connection con=null;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Venue1 window = new Venue1();
					window.frmVenueRegistration.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_8;
	public JComboBox comboBox;
	public JComboBox comboBox_1;
	 
	public Venue1() {
	con=DB.dbconnect();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmVenueRegistration = new JFrame("Property Registration");
		frmVenueRegistration.setTitle("Venue Registration");
		frmVenueRegistration.getContentPane().setBackground(Color.WHITE);
		
		frmVenueRegistration.getContentPane().setFont(new Font("Times New Roman", Font.PLAIN, 13));
		frmVenueRegistration.setBounds(0, 0, 1369, 713);
		frmVenueRegistration.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmVenueRegistration.getContentPane().setLayout(null);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmVenueRegistration.setVisible(false);
				Dashboard d=new Dashboard();
				d.frmSmartcityDashboard.setVisible(true);
				
				
			}
		});
		
		
		JButton dash = new JButton("BACK TO DASHBOARD");
		dash.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmVenueRegistration.setVisible(false);
			//	Dashboard d = new Dashboard();
		//	d.frmSmartcityDashboard.setVisible(true);
			}
		});
		
		
		
		
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
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.setForeground(Color.BLACK);
		
			btnNewButton.setBounds(478, 640, 89, 23);
			frmVenueRegistration.getContentPane().add(btnNewButton);
			
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String s1=txtEnterName.getText();
					String s2=textField_1.getText();
					String s3=textField_2.getText();
					String s4=textField_5.getText();
					String s5=textField_6.getText();
					String s6=textField_7.getText();
					String s7=comboBox.getSelectedItem().toString();
					String s8=comboBox_1.getSelectedItem().toString();
					String s9=textField.getText();
					String s10=textField_3.getText();
					String s11=textField_4.getText();
					String s12=textField_8.getText();
					//System.out.println(s7);
					
					try {
						//Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
						//Connection con=DriverManager.getConnection("jdbc:ucanaccess://F://polytechinc//TestData.accdb");
						Statement st=con.createStatement();
						// Connection connection = DriverManager.getConnection("jdbc:ucanaccess://D://Database5.accdb");
			            //System.out.println("Connected Successfully");
			            String sql="insert into venue"+"(Venue_Name,Owner,Opening_Time,Venue_Address,Landmark,Pincode,City,State,Founder,History,Found_Year,Submitter_Name,img,Date_Formed)"+"values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
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
			            ss.setBlob(13, (Blob)null);
			            ss.setDate(14, java.sql.Date.valueOf(java.time.LocalDate.now()));
				        int e1=ss.executeUpdate();
				        System.out.println("data inserted successfully"+e1); 
				        
				        String query1 = ("SELECT ven_id FROM venue ORDER BY ven_id DESC ");
				        ResultSet rs= null;
				        PreparedStatement ss2=con.prepareStatement(query1);
				        rs = ss2.executeQuery();
				        if (rs.next()) 
				         {
				              id  = rs.getInt("ven_id");
				            
				         }
				        String query_1="update venue set img=? where ven_id= ?";//insert into anthro(historical_p) values(?) where Annthro_id=? ";
						PreparedStatement stmt_1=con.prepareStatement(query_1);
						stmt_1.setLong(2, id);
	                    try {
							stmt_1.setBinaryStream(1,f1,f1.available());
							stmt_1.executeUpdate();
							} catch (IOException e11) {
							// TODO Auto-generated catch block
							e11.printStackTrace();
						}
	                    
				        
				        String h="VED0"+id;
				        // String h2=String.valueOf(id);
				       String query2 = "update venue set g_id='"+h+"' where ven_id in (?)";
				      /*   String query1="select * from table1 where ID =?";
				        ResultSet rs1= null;*/
				        PreparedStatement ss3=con.prepareStatement(query2);
				        ss3.setInt(1,id);
				       ss3.execute();
				       JOptionPane.showMessageDialog(null,"Your database id is   "+h+ "  remind it for future");
			            
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				
				}
				});
		btnNewButton_1.setBounds(907, 640, 89, 23);
		frmVenueRegistration.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("VENUE EROLLMENT");
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 33));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setBounds(464, 11, 640, 46);
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
		
	

		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		rdbtnNewRadioButton.setBounds(241, 549, 103, 21);
		frmVenueRegistration.getContentPane().add(rdbtnNewRadioButton);
		
		JButton btnNewButton_4 = new JButton("Update");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UpdateVenue1 up=new UpdateVenue1();
				up.setVisible(true);
			}
		});
		btnNewButton_4.setBounds(612, 640, 89, 23);
		frmVenueRegistration.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Delete");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DelVenue1 dv=new DelVenue1();
				dv.setVisiable(true);
				
			}
		});
		btnNewButton_5.setBounds(751, 640, 89, 23);
		frmVenueRegistration.getContentPane().add(btnNewButton_5);
		
		JLabel lblNewLabel_13 = new JLabel("New label");
		lblNewLabel_13.setIcon(new ImageIcon(Venue1.class.getResource("/image/fort4.jpg")));
		lblNewLabel_13.setBounds(20, 48, 1395, 821);
		frmVenueRegistration.getContentPane().add(lblNewLabel_13);
		
		/*JLabel lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.setIcon(new ImageIcon(Venue.class.getResource("/Image/Smart City Logo change.jpg")));
		lblNewLabel_13.setBounds(0, 0, 323, 157);
		frmVenueRegistration.getContentPane().add(lblNewLabel_13);
		dash.setBounds(582, 640, 146, 23);
		frmVenueRegistration.getContentPane().add(dash);*/
		
		
	}
}
