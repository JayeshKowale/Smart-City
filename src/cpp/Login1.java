package cpp;
import java.awt.EventQueue;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;


public class Login1 {


	JFrame frame;
	 JTextField textField;
	 JPasswordField passwordField;
	JLabel lblNewLabel_2;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login1 window = new Login1();
					window.frame.setVisible(true);
				} catch (Exception e) {}
				
			}
		});
	}
	
	Connection con=null;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	public Login1() {
		con = DB.dbconnect();
		initialize();
	}

	public void initialize() {
		frame = new JFrame("Login Screen");
		frame.getContentPane().setBackground(new Color(153, 204, 255));
		//frame.getContentPane().setBackground(new Color(135, 206, 235));
		//frame.getContentPane().setForeground(new Color(0, 0, 255));
		frame.setBounds(100, 100, 886, 706);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("WELCOME TO SMART CITY INFORMATION SYSTEM");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_6.setForeground(new Color(0, 0, 255));
		lblNewLabel_6.setBounds(220, 26, 466, 28);
		frame.getContentPane().add(lblNewLabel_6);
		//frame.getContentPane().setBackground(Constants.GREEN_DARK);
		
		JLabel lblNewLabel = new JLabel("USERNAME");
		lblNewLabel.setForeground(new Color(0, 0, 205));
		lblNewLabel.setBackground(new Color(135, 206, 250));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(302, 159, 109, 41);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PASSWORD");
		lblNewLabel_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_1.setBackground(Color.YELLOW);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1.setBounds(302, 263, 109, 34);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(487, 170, 200, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(487, 271, 200, 20);
		frame.getContentPane().add(passwordField);
		
		lblNewLabel_2 = new JLabel("Login Form");
		lblNewLabel_2.setForeground(UIManager.getColor("ToolTip.background"));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_2.setBounds(369, 88, 156, 29);
		frame.getContentPane().add(lblNewLabel_2);
		
		btnNewButton = new JButton("LOGIN");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnNewButton.setForeground(new Color(0, 0, 255));
		btnNewButton.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent e) {
				
			String user = textField.getText();
			String pwd = String .valueOf(passwordField.getPassword());
			try {
				PreparedStatement pst=(PreparedStatement) con.prepareStatement("select * from sign_up where Username=? and Password=?");
				pst.setString(1, user);
				pst.setString(2, pwd);
				ResultSet rs = pst.executeQuery();
				
				if(rs.next())
				{
					Dashboard d=new Dashboard();
					d.frmSmartcityDashboard.setVisible(true);
					frame.setVisible(false);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Please reverify your Credentials!!!");
				}
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
				
				
			
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(386, 464, 123, 41);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("CLOSE");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setForeground(new Color(0, 0, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
	            frame.dispose();
			}
		});
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setBounds(531, 398, 123, 41);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("SIGN UP");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.setForeground(new Color(0, 0, 255));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Signup sn = new Signup();
				sn.frame.setVisible(true);
				
				
			}
		});
		btnNewButton_2.setBackground(new Color(255, 255, 255));
		btnNewButton_2.setBounds(245, 398, 117, 41);
		frame.getContentPane().add(btnNewButton_2);
		
		lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("E:\\DR. PD 6 sem\\CPP\\Image\\Image\\Login Image.jpg"));
		lblNewLabel_3.setBounds(-341, 11, 1295, 729);
		frame.getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon(Login1.class.getResource("/cpp/900.jpg")));
		lblNewLabel_4.setBounds(106, 99, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		
		
		

	}
}