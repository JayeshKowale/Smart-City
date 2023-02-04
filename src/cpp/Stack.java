package cpp;


import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
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

public class Stack {
    
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
					Stack window = new Stack();
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
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	public Stack() {
    con = DB.dbconnect();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Stackholder Registration");
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.getContentPane().setFont(new Font("Times New Roman", Font.PLAIN, 13));
		frame.setBounds(100, 100, 700, 590);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton_1 = new JButton("CLOSE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				
				
			}
		});
		
		JButton btnNewButton_3 = new JButton("UPDATE");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				update_stack t = new update_stack();
				t.f.setVisible(true);
				
			}
		});
		btnNewButton_3.setBounds(276, 517, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("DELETE");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				delete_stack u = new delete_stack();
				u.frame.setVisible(true);
				
				
			}
		});
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.setBounds(386, 517, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBounds(501, 517, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("STAKEHOLDER REGISTRATION");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel.setForeground(new Color(123, 104, 238));
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setBounds(10, 11, 399, 46);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Name");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 120, 113, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtEnterName = new JTextField();
		txtEnterName.setToolTipText("Enter Registration Date\r\n");
		txtEnterName.setBounds(133, 72, 197, 20);
		frame.getContentPane().add(txtEnterName);
		txtEnterName.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setToolTipText("Enter Name");
		textField_1.setBounds(133, 114, 200, 20);
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
		textField_2.setToolTipText("Enter Address\r\n");
		textField_2.setBounds(133, 163, 197, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Reg_d=txtEnterName.getText();
				String Name=textField_1.getText();
				String addr=textField_2.getText();
				String addr2=textField_3.getText();
				String Email=textField_4.getText();
				String Mobile=textField_5.getText();
				String Landl=textField_6.getText();
				String Qualif=textField_7.getText();
				String Desig=textField_8.getText();
				String Exper=textField_9.getText();
				String D_O_B=textField_10.getText();
				String Age=textField_11.getText();
				String Gender=textField_12.getText();
				String A_O_E=textField_13.getText();   //area of experience
				String Catg=textField_14.getText();
			    
				try {
					
					
					PreparedStatement pst=con.prepareStatement("insert into stack_reg(Reg_Date,Name,Address,Address_2,Email,Mobile,Landline,Qualification,Designation,Experience,Date_of_birth,Age,Gender,Area_of_experience,Category,g_id,Date_Formed)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");    //TAble values
				    pst.setString(1, Reg_d);                  // index and variable nam
					pst.setString(2, Name);
					pst.setString(3, addr);
					pst.setString(4, addr2);
					pst.setString(5, Email);
					pst.setString(6, Mobile);
					pst.setString(7, Landl);
					pst.setString(8, Qualif);
					pst.setString(9, Desig);
					pst.setString(10, Exper);
					pst.setString(11, D_O_B);
					pst.setString(12, Age);
					pst.setString(13, Gender);
					pst.setString(14, A_O_E);
					pst.setString(15, Catg);
					pst.setString(16, "0");
					pst.setDate(17, java.sql.Date.valueOf(java.time.LocalDate.now()));
					//pst.setString(16, g_id);
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null,"DATA ADDED");
					int id=0;
					String query = ("SELECT Stackholder_no FROM stack_reg ORDER BY Stackholder_no DESC ");
				        ResultSet rs= null;
				        PreparedStatement ss2=con.prepareStatement(query);
				        rs = ss2.executeQuery();
				        
				        
				         if (rs.next()) 
				         {
				              id  = rs.getInt("Stackholder_no");
				          
				              //String q1="update stack_reg set Stackholder_no='"+i+"' where Stackholder in (?)";
				              //PreparedStatement s1=con.prepareStatement(q1);
				              //s1.setString(1, id);
				         }
				         String g_id="STH00"+id;
				         PreparedStatement ps=con.prepareStatement("update stack_reg set g_id=? where Stackholder_no=?");
				         ps.setString(1, g_id);
				         ps.setInt(2, id);
				         ps.executeUpdate();
				         
				         JOptionPane.showMessageDialog(null,"Your database id is   "+g_id+ "  remember it for your future use");
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
			}
		});
		btnNewButton.setBounds(166, 517, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("Enter Email");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_4.setBounds(10, 260, 113, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel(" Registration Date");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_5.setBounds(0, 72, 147, 19);
		frame.getContentPane().add(lblNewLabel_5);
		
		textField_3 = new JTextField();
		textField_3.setToolTipText("Enter Address-2");
		textField_3.setBounds(133, 211, 197, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setToolTipText("Enter Email Address\r\n");
		textField_4.setBounds(133, 257, 197, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Enter Mobile_no");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_6.setBounds(10, 312, 113, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		textField_5 = new JTextField();
		textField_5.setToolTipText("Enter Mobile Number\r\n");
		textField_5.setBounds(133, 309, 197, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Enter Landline_no");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_7.setBounds(10, 369, 126, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		textField_6 = new JTextField();
		textField_6.setBounds(133, 366, 197, 20);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
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
		                                                                   
		JLabel lblNewLabel_16 = new JLabel("");
		lblNewLabel_16.setToolTipText("Enter Landline No");
		lblNewLabel_16.setIcon(new ImageIcon("E:\\DR. PD 6 sem\\CPP\\Image\\Image\\unnamed.png"));
		lblNewLabel_16.setBounds(41, 40, 619, 477);
		frame.getContentPane().add(lblNewLabel_16);
		
		JButton dash = new JButton("BACK TO DASHBOARD");
		dash.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.setVisible(false);
				Dashboard d = new Dashboard();
				d.frmSmartcityDashboard.setVisible(true);
			}
		});
		dash.setBounds(10, 517, 146, 23);
		frame.getContentPane().add(dash);
	}
}
