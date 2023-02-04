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
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class delete_stack {

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
					delete_stack window = new delete_stack();
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
	public delete_stack() {
		con = DB.dbconnect();
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
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel.setForeground(new Color(0, 128, 0));
		lblNewLabel.setBounds(111, 65, 493, 43);
		frame.getContentPane().add(lblNewLabel);
		
		id_txt = new JTextField();
		id_txt.setBounds(190, 143, 225, 20);
		frame.getContentPane().add(id_txt);
		id_txt.setColumns(10);
		
		btnNewButton = new JButton("SUBMIT");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String ids =id_txt.getText();
               	
               
				
				try {
					PreparedStatement pst=(PreparedStatement) con.prepareStatement("Delete from stack_reg where g_id=?");
					pst.setString(1, ids);
					
					int x= pst.executeUpdate();
					JOptionPane.showMessageDialog(null,"YOUR RECORD HAS BEEN SUCCESSFULLY DELETED");
					
				/*	if(rs.next()==null)
					{
						
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Please reverify your Credentials!!!");
					}*/
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
				
				
				
				
				
			}
			
			
			
		});
		btnNewButton.setBounds(190, 287, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("CLOSE");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
			}
		});
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBounds(338, 287, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
	}
}
