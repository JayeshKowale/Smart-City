package cpp;


import javax.swing.*;

import com.mysql.jdbc.PreparedStatement;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.SQLException;


public class PropertyReg {
    
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
					PropertyReg window = new PropertyReg();
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
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_14;
	private JTextField textField;
	private JTextField textField_11;
	public PropertyReg() {
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
		JButton dash = new JButton("BACK TO DASHBOARD");
		dash.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.setVisible(false);
				Dashboard d = new Dashboard();
				d.frmSmartcityDashboard.setVisible(true);
			}
		});
		
		JButton btnNewButton_3 = new JButton("Delete");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Delprop1 d=new Delprop1();
				d.frame.setVisible(true);
				
			}
		});
		btnNewButton_3.setBounds(982, 640, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("Update");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Updateprop1 u=new Updateprop1();
				u.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton_2.setBounds(888, 640, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		textField_11 = new JTextField();
		textField_11.setBounds(1074, 309, 238, 20);
		frame.getContentPane().add(textField_11);
		textField_11.setColumns(10);
		
		JLabel lblNewLabel_19 = new JLabel("Sq. foot of property");
		lblNewLabel_19.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_19.setBounds(875, 312, 137, 14);
		frame.getContentPane().add(lblNewLabel_19);
		
		textField = new JTextField();
		textField.setBounds(1074, 165, 238, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
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
		btnNewButton_1.setBounds(1093, 640, 89, 23);
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
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			String nam=txtEnterName.getText();
			String ph=textField_1.getText();
			String email=textField_2.getText();
			String dis=textField_3.getText();
			String state=textField_4.getText();
			String prop_addr=textField_5.getText();
			String landm=textField_6.getText();
			String pin=textField_7.getText();
			String dis_p=textField_8.getText();
			String prop_y=textField_9.getText();
			String prop_d=textField_10.getText();
			String land_n=textField_12.getText();
			String city=textField_13.getText();
			String state_p=textField_14.getText();
			String area=textField_15.getText();
			String prop_reg=textField_16.getText();
			String tax=textField.getText();
			String sq_foot=textField_11.getText();
			
			
			try {
				PreparedStatement pst=(PreparedStatement) con.prepareStatement("insert into prop_reg(name_ow,ph_no,email,district,state,prop_addr,land_m,pin,district_p,prop_reg_y,prop_reg_d,land_l,city,state_prop,area_road,prop_by,payable_tax,sq_foot,Date_Formed)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
				pst.setString(1, nam);
				pst.setString(2, ph);
				pst.setString(3, email);
				pst.setString(4, dis);
				pst.setString(5, state); 
				pst.setString(6, prop_addr);
				pst.setString(7, landm);
				pst.setString(8, pin);
				pst.setString(9, dis_p);
				pst.setString(10, prop_y);
				pst.setString(11, prop_d);
				pst.setString(12, land_n);
				pst.setString(13, city);
				pst.setString(14, state_p);
				pst.setString(15, area);
				pst.setString(16, prop_reg);  
				pst.setString(17,tax);
				pst.setString(18, sq_foot);
				pst.setDate(19, java.sql.Date.valueOf(java.time.LocalDate.now()));
				pst.executeUpdate();
				JOptionPane.showMessageDialog(null, "YOUR PROPERTY HAS BEEN REGISTERED SUCCESSFULLY!!!");
			
			
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
			
			
			}
		});
		btnNewButton.setForeground(Color.BLACK);
	
		btnNewButton.setBounds(779, 640, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
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
		
		textField_12 = new JTextField();
		textField_12.setToolTipText("Enter Category");
		textField_12.setBounds(1074, 121, 238, 20);
		frame.getContentPane().add(textField_12);
		textField_12.setColumns(10);
		
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
		
		textField_15 = new JTextField();
		textField_15.setBounds(1074, 356, 238, 20);
		frame.getContentPane().add(textField_15);
		textField_15.setColumns(10);
		
		JLabel lblNewLabel_20 = new JLabel("State");
		lblNewLabel_20.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_20.setBounds(877, 269, 46, 14);
		frame.getContentPane().add(lblNewLabel_20);
		
		JLabel lblNewLabel_21 = new JLabel("Property Registered by:");
		lblNewLabel_21.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_21.setBounds(862, 416, 181, 14);
		frame.getContentPane().add(lblNewLabel_21);
		
		textField_16 = new JTextField();
		textField_16.setBounds(1074, 414, 238, 20);
		frame.getContentPane().add(textField_16);
		textField_16.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setBounds(1074, 267, 238, 20);
		frame.getContentPane().add(textField_14);
		textField_14.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.setIcon(new ImageIcon(PropertyReg.class.getResource("/Image/Smart City Logo change.jpg")));
		lblNewLabel_13.setBounds(10, 0, 338, 166);
		frame.getContentPane().add(lblNewLabel_13);
		
		JLabel lblNewLabel_22 = new JLabel("New label");
		lblNewLabel_22.setIcon(new ImageIcon(PropertyReg.class.getResource("/Image/Real-Estate-b-edited.jpg")));
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
		
		

}	
}