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

public class Delresource1 {

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
					Delresource1 window = new Delresource1();
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
	public Delresource1() {
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
		
		JLabel lblNewLabel = new JLabel("Please enter the ID for the record which you want to delete from Resource");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBounds(10, 74, 493, 43);
		frame.getContentPane().add(lblNewLabel);
		
		id_txt = new JTextField();
		id_txt.setBounds(68, 147, 225, 20);
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
					PreparedStatement pst=(PreparedStatement) con.prepareStatement("Delete from resource where reso_id=?");
					pst.setString(1, ids);
					
					int x= pst.executeUpdate();
					JOptionPane.showMessageDialog(null,"YOUR RECORD HAS BEEN SUCCESSFULLY DELETED");
					

					
				} catch (Exception e1) {
				
					e1.printStackTrace();
				}
			
				
				
				
				
				
			}
			
			
			
		});
		btnNewButton.setBounds(82, 261, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("CLOSE");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
			}
		});
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBounds(240, 261, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Delresource1.class.getResource("/image/1553504662023.jpg")));
		lblNewLabel_1.setBounds(0, 0, 649, 442);
		frame.getContentPane().add(lblNewLabel_1);
		
		
	}

	public void setVisiable(boolean b) {
	// TODO Auto-generated method stub
		frame.setVisible(true);
	}
}
