package cpp;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.text.Caret;

import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class preser {

	 JFrame frmPreservarance;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_7;
	
	public static String st1;
	public static String st2;
	private JTextField textField_6;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					preser window = new preser();
					window.frmPreservarance.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	

	/*JLabel lblNewLabel_1 = new JLabel("");
	lblNewLabel_1.setIcon(new ImageIcon(Edit.class.getResource("/Image/resource.png")));
	lblNewLabel_1.setBounds(-1119, 10, 2471, 687);
	frmPreservarance.getContentPane().add(lblNewLabel_1);*/
	
	
	/**
	 * Create the application.
	 */
	public preser() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPreservarance = new JFrame();
		frmPreservarance.setTitle("Preservarance");
		frmPreservarance.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		frmPreservarance.getContentPane().setFont(new Font("Times New Roman", Font.PLAIN, 12));
		frmPreservarance.setBounds(0, 0, 1369, 730);
		frmPreservarance.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPreservarance.getContentPane().setLayout(null);
		
	
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Venue");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
				st1="SELECT * FROM Venue WHERE ven_id =?";				
			}
		});
		
		JLabel lblNewLabel_2 = new JLabel("Name of the Resource");
		lblNewLabel_2.setBounds(600, 499, 189, 14);
		frmPreservarance.getContentPane().add(lblNewLabel_2);
		
		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setBounds(830, 493, 319, 20);
		frmPreservarance.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(260, 489, 319, 20);
		frmPreservarance.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		chckbxNewCheckBox.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		chckbxNewCheckBox.setBounds(600, 43, 181, 21);
		frmPreservarance.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Anthropological Monuments");
		chckbxNewCheckBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				st1="SELECT * FROM Anthro WHERE Anthro_id =?";
				
			}
		});
		chckbxNewCheckBox_1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		chckbxNewCheckBox_1.setBounds(600, 67, 261, 21);
		frmPreservarance.getContentPane().add(chckbxNewCheckBox_1);
		
		textField = new JTextField();
		textField.setBounds(260, 152, 319, 19);
		frmPreservarance.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(856, 152, 319, 19);
		frmPreservarance.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(856, 195, 319, 19);
		frmPreservarance.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(856, 239, 319, 19);
		frmPreservarance.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(260, 409, 319, 19);
		frmPreservarance.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(260, 560, 319, 19);
		frmPreservarance.getContentPane().add(textField_5);
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(830, 560, 319, 19);
		frmPreservarance.getContentPane().add(textField_7);
		
		JLabel lblNewLabel = new JLabel("SELECT TYPE");
		lblNewLabel.setFont(new Font("Lucida Handwriting", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel.setBounds(294, 39, 312, 79);
		frmPreservarance.getContentPane().add(lblNewLabel);
		
		JLabel lblEnterPropertyId = new JLabel("Enter Property ID");
		lblEnterPropertyId.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblEnterPropertyId.setBounds(33, 136, 128, 29);
		frmPreservarance.getContentPane().add(lblEnterPropertyId);
		
		JLabel lblSupportingStaffAssigned = new JLabel("Supporting Staff Assigned");
		lblSupportingStaffAssigned.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblSupportingStaffAssigned.setBounds(688, 146, 158, 29);
		frmPreservarance.getContentPane().add(lblSupportingStaffAssigned);
		
		JLabel lblSupportingStaffName = new JLabel("Supporting Staff Name");
		lblSupportingStaffName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblSupportingStaffName.setBounds(688, 185, 158, 29);
		frmPreservarance.getContentPane().add(lblSupportingStaffName);
		
		JLabel lblSupportingStaffContact = new JLabel("Supporting Staff Contact");
		lblSupportingStaffContact.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblSupportingStaffContact.setBounds(688, 233, 158, 29);
		frmPreservarance.getContentPane().add(lblSupportingStaffContact);
		
		JLabel lblResourcesRequired = new JLabel("RESOURCES REQUIRED");
		lblResourcesRequired.setFont(new Font("Lucida Handwriting", Font.BOLD | Font.ITALIC, 15));
		lblResourcesRequired.setBounds(29, 320, 312, 79);
		frmPreservarance.getContentPane().add(lblResourcesRequired);
		
		JLabel lblResourceId = new JLabel("Resource ID");
		lblResourceId.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblResourceId.setBounds(33, 403, 158, 29);
		frmPreservarance.getContentPane().add(lblResourceId);
		
		JLabel lblResourceType = new JLabel("Resource Type");
		lblResourceType.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblResourceType.setBounds(29, 550, 158, 29);
		frmPreservarance.getContentPane().add(lblResourceType);
		
		JLabel lblPayableAmountFor = new JLabel("Payable Amount for the Resource");
		lblPayableAmountFor.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblPayableAmountFor.setBounds(600, 554, 228, 29);
		frmPreservarance.getContentPane().add(lblPayableAmountFor);
		
		JLabel lblDurationtimePeriod = new JLabel("Duration (Time Period)");
		lblDurationtimePeriod.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblDurationtimePeriod.setBounds(29, 484, 158, 29);
		frmPreservarance.getContentPane().add(lblDurationtimePeriod);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			try {
				
				//textField
				//String Reg_id=textField.getText();
				String s1,s2,s3,s4;
			 	s4=textField_4.getText();
					Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
					Connection conn=DriverManager.getConnection("jdbc:ucanaccess://F://polytechinc//TestData.accdb");
					Statement st=conn.createStatement();
					
				//	String query = ("SELECT name_ow FROM prop_reg WHERE ID='"+Reg_id+"'");
					
					st2=textField.getText();
					String query = st1;
					//query.setString(1,st2);
					 ResultSet rs= null;
				        PreparedStatement ss2=conn.prepareStatement(query);
				        ss2.setString(1, st2);
				        rs = ss2.executeQuery();
				        
				        if(chckbxNewCheckBox.isSelected())
				        { 
				        
				        	 if (rs.next()) 
					         {
					        	s3  = rs.getString("venue_name");
					        	JOptionPane.showMessageDialog(null,"Welcome  "+s3);
					         }
				        }
				        if(chckbxNewCheckBox_1.isSelected())
				        {
				        	
				        	if (rs.next()) 
					         {
					        	s3  = rs.getString("Venue_nam");
					        	JOptionPane.showMessageDialog(null,"Welcome  "+s3);
					         }
				        
				        }
				        
				        
				      /*  else
				        {
				        	JOptionPane.showMessageDialog(null,"You are not registered");
				        }
				         */
				        
				        
				        String query1 = ("SELECT officer_name,mob_no FROM supp_staff ");
				        ResultSet rs1=st.executeQuery(query1);
					     //   rs = ss3.executeQuery();
					        if (rs1.next()) 
					         {
					        	s1=rs1.getString("officer_name");
					        	s2=rs1.getString("mob_no");
					        	
					        	//System.out.println(s1);
					        	textField_1.setText(s1);
					        	textField_2.setText(s1);
					        	textField_3.setText(s2);
					        	
					        	//System.out.println(s2);
					        	//JOptionPane.showMessageDialog(null,"Welcome  "+Reg_id);
					        	
					        	
					         }
					        	
					        	
					        	// for secound part
					      String id=textField_4.getText();
					        String query4 = ("SELECT ResourceName FROM resource WHERE ID='"+id+"'");
					        ResultSet rs4=st.executeQuery(query4);
						     //   rs = ss3.executeQuery();
						        if (rs4.next()) 
						         {
						        	s1=rs4.getString("ResourceName");
						        	textField_8.setText(s1);
						        	
						        	//JOptionPane.showMessageDialog(null,"Name is  "+s1);
						        	//System.out.println(s1);
						        
						        	
						        	   int total;
									int sum;
									String s;
						        	   String value=textField_6.getText();
						        	  sum= Integer.parseInt(value);
						        	   total =sum * 100;
						        	   s=Integer.toString(total);
						        	   textField_7.setText(s);
					        	
					        	
					        	
					        	
					     
					         }
				        
					
			}
			
			catch(Exception e1) {
				System.out.println(e1);
			}
					
			
					
		
				
				
			}

			private void parseInt(String value) {
				// TODO Auto-generated method stub
				
			}
		});
		btnNewButton.setBounds(260, 618, 142, 29);
		frmPreservarance.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(preser.class.getResource("/image/resource.png")));
		lblNewLabel_1.setBounds(-1119, 10, 2471, 687);
		frmPreservarance.getContentPane().add(lblNewLabel_1);
		

	
	//	
		
	


	}
}
