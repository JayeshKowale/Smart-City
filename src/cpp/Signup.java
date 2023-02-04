package cpp;

import java.awt.EventQueue;

//import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;


public class Signup {

 JFrame frame;
	 JPasswordField passwordField;
	JTextField textField;
	 JTextField textField_1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Signup window = new Signup();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	Connection con=null;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_7;
	private JTextField textField_8;
	private JPasswordField passwordField_1;
	
	public Signup() {
		con = DB.dbconnect();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Sign-Up");
		//frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 851, 604);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WELCOME TO SIGN-UP FORM");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel.setBounds(24, -12, 360, 58);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Full Name");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setBounds(65, 49, 109, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(98, 290, 286, 20);
		frame.getContentPane().add(passwordField);
		
		JLabel lblNewLabel_2 = new JLabel("Email Address");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2.setBounds(469, 154, 109, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(105, 69, 279, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		JLabel lblNewLabel_3 = new JLabel("Mobile Nomber");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_3.setBounds(65, 100, 123, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(477, 179, 286, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		JLabel lblNewLabel_4 = new JLabel("Address");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_4.setBounds(65, 156, 109, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setBounds(98, 125, 286, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("I Accept Terms And Condition");
		chckbxNewCheckBox.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		chckbxNewCheckBox.setBounds(259, 394, 237, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		textField_4 = new JTextField();
		textField_4.setBounds(98, 179, 286, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		
		JLabel lblNewLabel_8 = new JLabel("Pin Code");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_8.setBounds(469, 210, 76, 14);
		frame.getContentPane().add(lblNewLabel_8);
		
		textField_7 = new JTextField();
		textField_7.setBounds(477, 235, 147, 20);
		frame.getContentPane().add(textField_7);
	
		
		JLabel lblNewLabel_9 = new JLabel("Username");
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_9.setBounds(65, 210, 89, 14);
		frame.getContentPane().add(lblNewLabel_9);
		
		textField_8 = new JTextField();
		textField_8.setBounds(98, 231, 286, 20);
		frame.getContentPane().add(textField_8);
		
		
		JLabel lblNewLabel_10 = new JLabel("Password");
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_10.setBounds(65, 262, 89, 14);
		frame.getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Re-Enter Password");
		lblNewLabel_11.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_11.setBounds(64, 321, 164, 14);
		frame.getContentPane().add(lblNewLabel_11);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(98, 346, 286, 20);
		frame.getContentPane().add(passwordField_1);
		
		JButton btnNewButton_2 = new JButton("Login");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.setVisible(false);
				Login1 ups =new Login1();
				ups.frame.setVisible(true);
				
				
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_2.setBounds(166, 444, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("Sign up");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nam = textField.getText();
				String Email=textField_1.getText();
				String user_n=textField_8.getText();
				String pin=textField_7.getText();
				char[] Pass=passwordField.getPassword();
				String mob=textField_2.getText();
				String pass=new String(Pass);
				String addr=textField_4.getText();
				
				
				try {
					PreparedStatement pst=con.prepareStatement("insert into sign_up(Username,Password,Name,Mobile_no,Email,Address,Pin_code)values(?,?,?,?,?,?,?)");
				    pst.setString(1,user_n);
				    pst.setString(2,pass);
				    pst.setString(3,nam);
				    pst.setString(4,mob);
				    pst.setString(5,Email);
				    pst.setString(6,addr);
				    pst.setString(7,pin);
				    pst.executeUpdate();
				    JOptionPane.showMessageDialog(null,"Your Credentials have been saved");
				    
				    
				
				
				
				
				
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton.setBounds(295, 484, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Close");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_1.setBounds(417, 444, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setIcon(new ImageIcon("E:\\DR. PD 6 sem\\CPP\\Image\\Image\\login.png"));
		lblNewLabel_12.setBounds(41, -48, 794, 662);
		frame.getContentPane().add(lblNewLabel_12);
	}
}