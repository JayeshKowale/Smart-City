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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
import javax.swing.JRadioButton;

public class SupportingStaff {
    
	public JFrame frame;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SupportingStaff window = new SupportingStaff();
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
	public JComboBox comboBox_2;
	public JComboBox comboBox_1;
	public JComboBox comboBox;
	public String g_id;
	public static FileInputStream f1;
	public SupportingStaff() {
		con = DB.dbconnect();
   
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Support Staff Registration");
	
		frame.getContentPane().setFont(new Font("Times New Roman", Font.PLAIN, 13));
		frame.setBounds(0, 0, 1369, 730);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton_4 = new JButton("Delete");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DelSuppStaff d=new DelSuppStaff();
				d.frame.setVisible(true);
				frame.setVisible(false);
				
				
			}
		});
		btnNewButton_4.setBounds(660, 630, 89, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_3 = new JButton("Update");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UpdateSuppStaff u=new UpdateSuppStaff();
				u.frame.setVisible(true);
				frame.setVisible(false);
				
			}
		});
		btnNewButton_3.setBounds(555, 630, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female", "Other"}));
		comboBox_2.setBounds(938, 366, 149, 22);
		frame.getContentPane().add(comboBox_2);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(839, 581, 146, 14);
		frame.getContentPane().add(progressBar);
		
		
		
		JLabel lblNewLabel = new JLabel("WELCOME TO SUPPORTING STAFF REGISTRATION");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel.setBounds(331, 11, 643, 46);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label1 = new JLabel("Select Office Type");
		label1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label1.setBounds(303, 124, 168, 14);
		frame.getContentPane().add(label1);
		
		textField_1 = new JTextField();
		textField_1.setToolTipText("Enter Registration Date\r\n");
		textField_1.setBounds(435, 164, 197, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setToolTipText("Enter Name");
		textField_2.setBounds(435, 211, 200, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label2 = new JLabel("Name of officer ");
		label2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label2.setBounds(303, 166, 113, 14);
		frame.getContentPane().add(label2);
		
		JLabel lblNewLabel_3 = new JLabel("Address ");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_3.setBounds(303, 213, 72, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel label4 = new JLabel("Select City Name ");
		label4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label4.setBounds(303, 260, 113, 14);
		frame.getContentPane().add(label4);
		
		textField_3 = new JTextField();
		textField_3.setToolTipText("Enter Address-2");
		textField_3.setBounds(435, 310, 197, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setToolTipText("Enter Email Address\r\n");
		textField_4.setBounds(435, 367, 197, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel Label5 = new JLabel("Enter Mobile_no");
		Label5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		Label5.setBounds(303, 312, 113, 14);
		frame.getContentPane().add(Label5);
		
		textField_5 = new JTextField();
		textField_5.setToolTipText("Enter Mobile Number");
		textField_5.setBounds(435, 424, 197, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel Label6 = new JLabel("Enter Mobile No-2");
		Label6.setFont(new Font("Times New Roman", Font.BOLD, 14));
		Label6.setBounds(303, 369, 126, 14);
		frame.getContentPane().add(Label6);
		
		textField_6 = new JTextField();
		textField_6.setBounds(435, 479, 197, 20);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JLabel Label7 = new JLabel("Enter Email Address");
		Label7.setFont(new Font("Times New Roman", Font.BOLD, 14));
		Label7.setBounds(303, 426, 137, 14);
		frame.getContentPane().add(Label7);
		
		textField_7 = new JTextField();
		textField_7.setBounds(435, 537, 197, 20);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JLabel Label10 = new JLabel("Enter Designation");
		Label10.setFont(new Font("Times New Roman", Font.BOLD, 14));
		Label10.setBounds(780, 124, 118, 14);
		frame.getContentPane().add(Label10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(938, 118, 232, 20);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		JLabel Label11 = new JLabel("Enter Experience");
		Label11.setFont(new Font("Times New Roman", Font.BOLD, 14));
		Label11.setBounds(780, 185, 118, 14);
		frame.getContentPane().add(Label11);
		
		textField_9 = new JTextField();
		textField_9.setBounds(938, 183, 232, 20);
		frame.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		JLabel Label12 = new JLabel("Enter Date of birth");
		Label12.setFont(new Font("Times New Roman", Font.BOLD, 14));
		Label12.setBounds(780, 243, 118, 14);
		frame.getContentPane().add(Label12);
		
		textField_10 = new JTextField();
		textField_10.setToolTipText("DD/MM/YYYY");
		textField_10.setBounds(938, 241, 232, 20);
		frame.getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		JLabel Label13 = new JLabel("Enter Age");
		Label13.setFont(new Font("Times New Roman", Font.BOLD, 14));
		Label13.setBounds(780, 313, 102, 17);
		frame.getContentPane().add(Label13);
		
		JLabel Label14 = new JLabel("Enter Gender");
		Label14.setFont(new Font("Times New Roman", Font.BOLD, 14));
		Label14.setBounds(780, 370, 102, 14);
		frame.getContentPane().add(Label14);
		
		textField_11 = new JTextField();
		textField_11.setToolTipText("Enter Gender ");
		textField_11.setBounds(938, 310, 232, 20);
		frame.getContentPane().add(textField_11);
		textField_11.setColumns(10);
		
		
		JButton dash = new JButton("BACK TO DASHBOARD");
		dash.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.setVisible(false);
				Dashboard d = new Dashboard();
				d.frmSmartcityDashboard.setVisible(true);
			}
		});
		dash.setBounds(238, 630, 146, 23);
		frame.getContentPane().add(dash);
		
		
			String[] values = new String[] {"Select ", "Amravati", "Akola", "Nagpur"};
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Office Name", "Govt.Offices", "NGO's", "School", "Colleges", "non of above "}));
		comboBox.setBounds(435, 121, 137, 23);
		frame.getContentPane().add(comboBox);
		
		JComboBox<String> comboBox_1 = new JComboBox<String>();
		comboBox_1.setModel(new DefaultComboBoxModel<String>(new String[] {"Select City Name ", "Amravati", "Akola", "Nagpur", "Mumbai", "Pune"}));
		comboBox_1.setBounds(435, 257, 137, 22);
		frame.getContentPane().add(comboBox_1);
		
		JLabel Label8 = new JLabel("Enter Office Name");
		Label8.setFont(new Font("Times New Roman", Font.BOLD, 14));
		Label8.setBounds(303, 482, 197, 14);
		frame.getContentPane().add(Label8);
		
		JLabel Label9 = new JLabel("Enter Graduation");
		Label9.setFont(new Font("Times New Roman", Font.BOLD, 14));
		Label9.setBounds(303, 539, 113, 14);
		frame.getContentPane().add(Label9);
		
		JLabel lblNewLabel_1 = new JLabel("Attach Your Image for Identification");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setBounds(790, 477, 257, 23);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton_2 = new JButton("Attach Your Image Here");
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
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_2.setBounds(806, 532, 195, 29);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String offi=comboBox.getSelectedItem().toString();
				String nam=textField_1.getText();
				String addr=textField_2.getText();
		     	String city=comboBox_1.getSelectedItem().toString();
		     	String mob_1=textField_3.getText();
		     	String mob_2=textField_4.getText();
		     	String email=textField_5.getText();
		     	String offi_n=textField_6.getText();
		     	String grad=textField_7.getText();
		     	String desig=textField_8.getText();
		     	String exp=textField_9.getText();
		     	String dob=textField_10.getText();
		     	String age=textField_11.getText();
		     	String gender=comboBox_2.getSelectedItem().toString();
				
		     	
		     	
		     	PreparedStatement pst;
				try {
					pst = con.prepareStatement("insert into supp_staff(office_type,officer_name,addr,city,mob_no,mob_no2,email,office_name,graduation,designation,experience,D_O_B,age,gender,img_off,g_id,avail,Date_Formed)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
				
					   pst.setString(1, offi);               // index and variable nam
					   pst.setString(2, nam);
					   pst.setString(3, addr);
					   pst.setString(4, city);
					   pst.setString(5, mob_1);
					   pst.setString(6, mob_2);
					   pst.setString(7, email);
					   pst.setString(8, offi_n);
					   pst.setString(9, grad);
					   pst.setString(10, desig);
					   pst.setString(11, exp);
					   pst.setString(12, dob);
					   pst.setString(13, age);
					   pst.setString(14, gender);
					   pst.setBlob(15, (Blob)null);
					   pst.setString(16, "0");
					   pst.setString(17, "yes");
					   pst.setDate(18, java.sql.Date.valueOf(java.time.LocalDate.now()));
					   pst.executeUpdate();
						JOptionPane.showMessageDialog(null,"DATA ADDED");
						
						String id=null;
						String quer = ("SELECT staff_id FROM supp_staff ORDER BY staff_id DESC ");
					        ResultSet rs= null;
					        PreparedStatement ss2=con.prepareStatement(quer);
					        rs = ss2.executeQuery();
					        
					        
					         if (rs.next()) 
					         {
					              id  = rs.getString("staff_id");
					              g_id="SUPST000"+id;
					         }
					        // JOptionPane.showMessageDialog(null,"Your database id is   "+g_id+"   remember  it for your future use");
					     	
						
						 	String query_1="update supp_staff set img_off=? where staff_id= ?";//insert into anthro(historical_p) values(?) where Annthro_id=? ";
							PreparedStatement stmt_1=con.prepareStatement(query_1);
							stmt_1.setString(2, id);
		                    try {
								stmt_1.setBinaryStream(1,f1,f1.available());
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
		                    
		                   
					         PreparedStatement ps=con.prepareStatement("update supp_staff set g_id=? where staff_id=?");
					         ps.setString(1, g_id);
					         ps.setString(2, id);
					         ps.executeUpdate();
					         
					         JOptionPane.showMessageDialog(null,"Your database id is   "+g_id+ "  remember it for your future use");
						
		                   
							stmt_1.executeUpdate();
							
				
				
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}    //TAble values
			 
				
				
				
				
				
				
				
			}
		});
		btnNewButton.setForeground(Color.BLACK);		
		btnNewButton.setBounds(439, 630, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CLOSE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				
				
			}
		});
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBounds(765, 630, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(SupportingStaff.class.getResource("/Image/Smart City Logo.jpg")));
		lblNewLabel_2.setBounds(10, 11, 269, 154);
		frame.getContentPane().add(lblNewLabel_2);
		
		
		
		JLabel lblNewLabel_5 = new JLabel("REGISTER YOUR SELF");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_5.setBounds(0, 322, 293, 31);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_4 = new JLabel("HERE");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_4.setBounds(83, 359, 149, 31);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel Imagelabel = new JLabel("");
		Imagelabel.setIcon(new ImageIcon(SupportingStaff.class.getResource("/Image/writing2.jpg")));
		Imagelabel.setBounds(0, 0, 1353, 675);
		frame.getContentPane().add(Imagelabel);
	}
}

