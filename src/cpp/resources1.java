package cpp;




import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
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
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.JProgressBar;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;

public class resources1 {
    
	public JFrame frame;

	private JTextField textField_1;
	public static FileInputStream f1;

	/**
	 * Launch the application.
	 */
	Connection con=null;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					resources1 window = new resources1();
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
	
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private int id;
	public resources1() {
		con=DB.dbconnect();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Resources Registration");
	
		frame.getContentPane().setFont(new Font("Times New Roman", Font.PLAIN, 13));
		frame.setBounds(0, 0, 1369, 730);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton_2 = new JButton("Attach Image here");
		btnNewButton_2.addActionListener(new ActionListener() {
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
		btnNewButton_2.setBounds(868, 378, 131, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton dash = new JButton("BACK TO DASHBOARD");
		dash.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.setVisible(false);
				Dashboard d = new Dashboard();
			     d.frmSmartcityDashboard.setVisible(true);
			}
		});
		dash.setBounds(902, 630, 146, 23);
		frame.getContentPane().add(dash);
		
		
		JLabel lblNewLabel = new JLabel("WELCOME TO RESOURCES REGISTRATION FORM");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel.setBounds(641, 10, 643, 46);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblPleaseEnterDetails = new JLabel("Please Enter Details Carefully");
		lblPleaseEnterDetails.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblPleaseEnterDetails.setBounds(295, 68, 337, 29);
		frame.getContentPane().add(lblPleaseEnterDetails);
		
		JLabel label1 = new JLabel("Select State Name");
		label1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label1.setBounds(275, 124, 168, 14);
		frame.getContentPane().add(label1);
		
		JLabel label2 = new JLabel("Select City Name ");
		label2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label2.setBounds(275, 166, 244, 14);
		frame.getContentPane().add(label2);
		
		JLabel lblNewLabel_3 = new JLabel("Enter Name of Resources");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_3.setBounds(275, 213, 213, 14);
		frame.getContentPane().add(lblNewLabel_3);

		
		
		textField_1 = new JTextField("");
		textField_1.setBounds(435, 211, 200, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		
		textField_3 = new JTextField("");
	
		textField_3.setBounds(435, 263, 197, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField("");
		textField_4.setBounds(435, 323, 197, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel Label5 = new JLabel("Enter Founded By");
		Label5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		Label5.setBounds(275, 265, 168, 14);
		frame.getContentPane().add(Label5);
		
		textField_5 = new JTextField("");
		textField_5.setBounds(435, 378, 197, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel Label6 = new JLabel("Resource founded on");
		Label6.setFont(new Font("Times New Roman", Font.BOLD, 14));
		Label6.setBounds(275, 325, 168, 14);
		frame.getContentPane().add(Label6);
		
		textField_6 = new JTextField("");
		textField_6.setBounds(435, 441, 197, 20);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JLabel Label7 = new JLabel("Founder Phone No");
		Label7.setFont(new Font("Times New Roman", Font.BOLD, 14));
		Label7.setBounds(275, 380, 137, 14);
		frame.getContentPane().add(Label7);
		
		textField_7 = new JTextField("");
		textField_7.setBounds(435, 494, 197, 20);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JTextArea textArea = new JTextArea("");
		textArea.setBounds(800, 162, 237, 117);
		frame.getContentPane().add(textArea);

	
	
		
		JComboBox cb1 = new JComboBox();
		cb1.addItem("Select State Name");
		cb1.addItem("Maharashtra");
		cb1.addItem("Madhya Pradesh");
		cb1.addItem("Uttar Pradesh");
		cb1.addItem("Andhra Pradesh");
		cb1.addItem("Punjab");
		cb1.addItem("non of above");
		cb1.setBounds(435, 121, 137, 23);
		frame.getContentPane().add(cb1);
		
		
		JComboBox cb2 = new JComboBox();
		cb2.addItem("Select City Name");
		cb2.addItem("Amravati");
		cb2.addItem("Akola");
		cb2.addItem("Nagpur");
		cb2.addItem("Mumbai");
		cb2.addItem("Pune");
		cb2.addItem("non of above");
		cb2.setBounds(435, 164, 137, 20);
		frame.getContentPane().add(cb2);
		
		/*JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Select City Name ", "Amravati", "Akola", "Nagpur", "Mumbai", "Pune"}));
		comboBox_1.setBounds(435, 257, 137, 22);
		frame.getContentPane().add(comboBox_1);*/
		
		JLabel Label8 = new JLabel("Resource Address");
		Label8.setFont(new Font("Times New Roman", Font.BOLD, 14));
		Label8.setBounds(275, 443, 197, 14);
		frame.getContentPane().add(Label8);
		
		JLabel Label9 = new JLabel(" Enter Type Of Resource");
		Label9.setFont(new Font("Times New Roman", Font.BOLD, 14));
		Label9.setBounds(275, 496, 182, 14);
		frame.getContentPane().add(Label9);
		
		/*JLabel lblNewLabel_1 = new JLabel("Attach Resource Image for Identification");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setBounds(758, 310, 257, 23);
		frame.getContentPane().add(lblNewLabel_1);*/
		
		/*JButton btnNewButton_2 = new JButton("Attach Resource Image Here");
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_2.setBounds(780, 344, 257, 29);
		frame.getContentPane().add(btnNewButton_2);*/
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.setForeground(Color.BLACK);		
		btnNewButton.setBounds(463, 630, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String s1=cb1.getSelectedItem().toString();
				String s2=cb2.getSelectedItem().toString();
				String s3=textField_1.getText();
				String s4=textField_3.getText();
				String s5=textField_4.getText();
				String s6=textField_5.getText();
				String s7=textField_6.getText();
				String s8=textField_7.getText();
				String s9=textArea.getText();
				
				try {					
				//	Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
				//Connection con=DriverManager.getConnection("jdbc:ucanaccess://F://polytechinc//TestData.accdb");
				Statement st=con.createStatement();

					// Connection connection = DriverManager.getConnection("jdbc:ucanaccess://D://Database5.accdb");
		            //System.out.println("Connected Successfully");
		            String sql="insert into resource"+"(State,City,ResourceName,FoundedBy,FoundedOn,Phone,Address,Type,Information,img,Date_Formed)"+"values(?,?,?,?,?,?,?,?,?,?,?)";
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
		            ss.setBlob(10, (Blob)null);
		            ss.setDate(11, java.sql.Date.valueOf(java.time.LocalDate.now()));
		        /*    ss.setString(10,s10);
		            ss.setString(11,s11);
		            ss.setString(12,s12);*/
			        int e1=ss.executeUpdate();
			        System.out.println("data inserted successfully"+e1); 
			        String query1 = ("SELECT reso_id FROM resource ORDER BY reso_id DESC ");
			        ResultSet rs= null;
			        PreparedStatement ss2=con.prepareStatement(query1);
			        rs = ss2.executeQuery();
			        if (rs.next()) 
			         {
			              id  = rs.getInt("reso_id");
			            
			         }
			         
			        String query_1="update resource set img=? where reso_id= ?";//insert into anthro(historical_p) values(?) where Annthro_id=? ";
					PreparedStatement stmt_1=con.prepareStatement(query_1);
					stmt_1.setLong(2, id);
                    try {
						stmt_1.setBinaryStream(1,f1,f1.available());
						stmt_1.executeUpdate();
						} catch (IOException e11) {
						// TODO Auto-generated catch block
						e11.printStackTrace();
					}
			        String h="RES00"+id;
			        // String h2=String.valueOf(id);
			       String query2 = "update resource set g_id='"+h+"' where reso_id in (?)";
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
		
		JButton btnNewButton_1 = new JButton("CLOSE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				
				
			}
		});
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBounds(788, 630, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
	/*	JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(resources.class.getResource("/Image/Smart City Logo change.jpg")));
		lblNewLabel_2.setBounds(-37, 0, 302, 154);
		frame.getContentPane().add(lblNewLabel_2);*/
		
		JLabel lblNewLabel_4 = new JLabel("Enter Resource Information in brief");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_4.setBounds(800, 124, 237, 20);
		frame.getContentPane().add(lblNewLabel_4);
		
		JButton btnNewButton_3 = new JButton("Update ");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		Updateresource1 us = new Updateresource1();			
			us.setVisiable(true);
			}
		});
		btnNewButton_3.setBounds(573, 630, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Delete");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Delresource1 ds=new Delresource1();
				ds.setVisiable(true);
			}
		});
		btnNewButton_4.setBounds(689, 630, 89, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(resources1.class.getResource("/image/1553504662023.jpg")));
		lblNewLabel_1.setBounds(0, -73, 1345, 766);
		frame.getContentPane().add(lblNewLabel_1);
		
				
		/*JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(resources.class.getResource("/Image/1553504662023.jpg")));
		lblNewLabel_5.setBounds(0, -73, 1345, 766);
		frame.getContentPane().add(lblNewLabel_5);*/
		
		
		
		
	
	}
}
