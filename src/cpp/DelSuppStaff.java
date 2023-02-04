package cpp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class DelSuppStaff {

	public JFrame frame;
	public JTextField id_txt;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DelSuppStaff window = new DelSuppStaff();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	Connection con=null;
	private JButton btnNewButton_1;
	/**
	 * Create the application.
	 */
	public DelSuppStaff() {
	con=DB.dbconnect();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 649, 442);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Please enter the ID for the record which you want to delete");
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 18));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBounds(42, 77, 493, 43);
		frame.getContentPane().add(lblNewLabel);
		
		id_txt = new JTextField();
		id_txt.setBounds(109, 156, 225, 20);
		frame.getContentPane().add(id_txt);
		id_txt.setColumns(10);
		
		btnNewButton = new JButton("SUBMIT");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String ids =id_txt.getText();
               	
               
				
				try {
					//Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
					//Connection con=DriverManager.getConnection("jdbc:ucanaccess://F://polytechinc//TestData.accdb");
					Statement st=con.createStatement();
					PreparedStatement pst=(PreparedStatement) con.prepareStatement("Delete from supp_staff where g_id=?");
					pst.setString(1, ids);
					
					int x= pst.executeUpdate();
					JOptionPane.showMessageDialog(null,"YOUR RECORD HAS BEEN SUCCESSFULLY DELETED");
					

					
				} catch (Exception e1) {
				
					e1.printStackTrace();
				}
			
				
				
				
				
				
			}
			
			
			
		});
		btnNewButton.setBounds(63, 246, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("CLOSE");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
			}
		});
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBounds(289, 246, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(DelSuppStaff.class.getResource("/Image/writing2.jpg")));
		lblNewLabel_1.setBounds(-570, -135, 1219, 652);
		frame.getContentPane().add(lblNewLabel_1);
	}

	public void setVisiable(boolean b) {
	// TODO Auto-generated method stub
		frame.setVisible(true);
	}
}
