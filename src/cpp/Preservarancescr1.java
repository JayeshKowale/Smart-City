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
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;   

public class Preservarancescr1 {

	JFrame frmPreservarance;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_7;
	
	public static String st1;
	public static String st2;
	public static String st3;//textField
	public static String st4;
	private JTextField textField_6;
	private JTextField textField_8;
	private JTextField textField_9;
	public static int flag;
	private JTextField textField_10;
	
	//private static final long MILLIS_IN_A_DAY=1;
	//
//	int SimpleDateFormat;
//	int Date;
	String nextDate; 
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Preservarancescr1 window = new Preservarancescr1();
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
	Connection con=null;
	
	/**
	 * Create the application.
	 */
	public Preservarancescr1() {
		con=DB.dbconnect();
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
			
				
				st1="SELECT * FROM Venue WHERE g_id =?";		
				
				
			}
		});
		
		JButton back = new JButton("Back");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmPreservarance.setVisible(false);
				view v=new view();
				v.frmInformationSearch.setVisible(true);
				
			}
		});
		back.setBounds(286, 632, 115, 29);
		frmPreservarance.getContentPane().add(back);
		
		JLabel lblNewLabel_8 = new JLabel("Staff Allocation Information");
		lblNewLabel_8.setFont(new Font("Lucida Handwriting", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_8.setBounds(688, 122, 343, 29);
		frmPreservarance.getContentPane().add(lblNewLabel_8);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(830, 571, 271, 71);
		frmPreservarance.getContentPane().add(textArea);
		
		JLabel lblNewLabel_7 = new JLabel("Resource Information");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_7.setBounds(618, 575, 189, 14);
		frmPreservarance.getContentPane().add(lblNewLabel_7);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Resources", "JCB", "RoadRoller ", "Small JCB"}));
		comboBox.setBounds(270, 556, 181, 22);
		frmPreservarance.getContentPane().add(comboBox);
		
		textField_13 = new JTextField();
		textField_13.setEditable(false);
		textField_13.setBounds(263, 324, 312, 20);
		frmPreservarance.getContentPane().add(textField_13);
		textField_13.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setEditable(false);
		textField_12.setBounds(263, 282, 312, 20);
		frmPreservarance.getContentPane().add(textField_12);
		textField_12.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Venue Address ");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(10, 326, 142, 14);
		frmPreservarance.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_5 = new JLabel("Owner Name is");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(10, 282, 142, 14);
		frmPreservarance.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_4 = new JLabel("Maintencence Start Date:");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(10, 241, 175, 14);
		frmPreservarance.getContentPane().add(lblNewLabel_4);
		
		textField_10 = new JTextField();
		textField_10.setEditable(false);
		textField_10.setBounds(263, 239, 312, 20);
		frmPreservarance.getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setEditable(false);
		textField_9.setBounds(263, 195, 312, 20);
		frmPreservarance.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		JLabel lblEnterPropertyId = new JLabel("Enter Venue ID");
		lblEnterPropertyId.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblEnterPropertyId.setBounds(10, 147, 175, 29);
		frmPreservarance.getContentPane().add(lblEnterPropertyId);
	
		JLabel lblNewLabel_3 = new JLabel("Your Maintencence (Venue) Name is:");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(10, 195, 227, 14);
		frmPreservarance.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("Name of the Resource");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(618, 461, 189, 14);
		frmPreservarance.getContentPane().add(lblNewLabel_2);
		
		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setBounds(830, 459, 319, 20);
		frmPreservarance.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(270, 494, 319, 20);
		frmPreservarance.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		chckbxNewCheckBox.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		chckbxNewCheckBox.setBounds(846, 43, 181, 21);
		frmPreservarance.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Anthropological Monuments");
			
		chckbxNewCheckBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				st1="SELECT * FROM Anthro WHERE Anthro_id =?";
				
				
				
			}		});
        	

		chckbxNewCheckBox_1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		chckbxNewCheckBox_1.setBounds(846, 67, 261, 21);
		frmPreservarance.getContentPane().add(chckbxNewCheckBox_1);
		
		textField = new JTextField();
		textField.setBounds(263, 152, 319, 19);
		frmPreservarance.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(856, 170, 319, 19);
		frmPreservarance.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(856, 215, 319, 19);
		frmPreservarance.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(856, 262, 319, 19);
		frmPreservarance.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(270, 441, 319, 19);
		frmPreservarance.getContentPane().add(textField_4);
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(830, 520, 319, 19);
		frmPreservarance.getContentPane().add(textField_7);
		
		JLabel lblNewLabel = new JLabel("ENTER DETAILS");
		lblNewLabel.setFont(new Font("Lucida Handwriting", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setBounds(10, 72, 312, 79);
		frmPreservarance.getContentPane().add(lblNewLabel);
	
		
			
	
		JLabel lblSupportingStaffAssigned = new JLabel("Supporting Staff ID");
		lblSupportingStaffAssigned.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblSupportingStaffAssigned.setBounds(688, 170, 158, 29);
		frmPreservarance.getContentPane().add(lblSupportingStaffAssigned);
		
		JLabel lblSupportingStaffName = new JLabel("Supporting Staff Name");
		lblSupportingStaffName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblSupportingStaffName.setBounds(688, 210, 158, 29);
		frmPreservarance.getContentPane().add(lblSupportingStaffName);
		
		JLabel lblSupportingStaffContact = new JLabel("Supporting Staff Contact");
		lblSupportingStaffContact.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblSupportingStaffContact.setBounds(688, 257, 158, 29);
		frmPreservarance.getContentPane().add(lblSupportingStaffContact);
		
		JLabel lblResourcesRequired = new JLabel("RESOURCES REQUIRED");
		lblResourcesRequired.setFont(new Font("Lucida Handwriting", Font.BOLD | Font.ITALIC, 18));
		lblResourcesRequired.setBounds(10, 351, 312, 79);
		frmPreservarance.getContentPane().add(lblResourcesRequired);
		
		JLabel lblResourceId = new JLabel("Resource ID");
		lblResourceId.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblResourceId.setBounds(33, 436, 158, 29);
		frmPreservarance.getContentPane().add(lblResourceId);
		
		JLabel lblResourceType = new JLabel("Resource Type");
		lblResourceType.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblResourceType.setBounds(33, 552, 158, 29);
		frmPreservarance.getContentPane().add(lblResourceType);
		
		JLabel lblPayableAmountFor = new JLabel("Payable Amount for the Resource");
		lblPayableAmountFor.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblPayableAmountFor.setBounds(618, 515, 228, 29);
		frmPreservarance.getContentPane().add(lblPayableAmountFor);
		
		JLabel lblDurationtimePeriod = new JLabel("Duration (Time Period in Hrs)");
		lblDurationtimePeriod.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblDurationtimePeriod.setBounds(33, 494, 189, 29);
		frmPreservarance.getContentPane().add(lblDurationtimePeriod);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
		
				try {
					
					//textField
					//String Reg_id=textField.getText();
					String s1,s2,s3,s4,s5,s6,s7;
				 	s4=textField_4.getText();
						//Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
						//Connection conn=DriverManager.getConnection("jdbc:ucanaccess://F://polytechinc//TestData.accdb");
						Statement st=con.createStatement();
						
					//	String query = ("SELECT name_ow FROM prop_reg WHERE ID='"+Reg_id+"'");
						
						st2=textField.getText();
						String query = st1;
						//query.setString(1,st2);
						 ResultSet rs= null;
					        PreparedStatement ss2=con.prepareStatement(query);
					        ss2.setString(1, st2);
					        rs = ss2.executeQuery();
					        
					        if(chckbxNewCheckBox.isSelected())
					        { 
					        
					        	 if (rs.next()) 
						         {
						        	s3  = rs.getString("Venue_name");
						        	s4 =rs.getString("Owner");
						        	s7 =rs.getString("Venue_Address");
						        //	JOptionPane.showMessageDialog(null,"Welcome  "+s3);
						        	
						        	textField_9.setText(s3);
						        	textField_12.setText(s4);
						        	textField_13.setText(s7);
						         }
					        	
					        }
					        if(chckbxNewCheckBox_1.isSelected())
					        {
					        	
					        	if (rs.next()) 
						         {
						        	s3  = rs.getString("Venue_nam");
						        //	JOptionPane.showMessageDialog(null,"Welcome  "+s3);
						        	textField_9.setText(s3);
						        	s4=rs.getString("founder");
						        	textField_12.setText(s4);
						        	s7=rs.getString("venue_addr");
						        	textField_13.setText(s7);
						        			
						        	
						         }
					        
					        }
					        LocalDate date = LocalDate.now();
				   	        date = date.plusDays(2);
				   	        nextDate = date.toString();
				   		   textField_10.setText(nextDate);
				   		
					        
					      /*  else
					        {
					        	JOptionPane.showMessageDialog(null,"You are not registered");
					        }
					         */
					        
					        
					        
					        String query1 = ("SELECT officer_name,mob_no,g_id FROM supp_staff ");
					        ResultSet rs1=st.executeQuery(query1);
						     //   rs = ss3.executeQuery();
						        if (rs1.next()) 
						         {
						        	s1=rs1.getString("officer_name");
						        	s2=rs1.getString("mob_no");
						        	s5=rs1.getString("g_id");
						        	
						        	//System.out.println(s1);
						        	textField_1.setText(s5);
						        	textField_2.setText(s1);
						        	textField_3.setText(s2);
						        	
						        	//System.out.println(s2);
						        	//JOptionPane.showMessageDialog(null,"Welcome  "+Reg_id);
						        	
						        	
						         }
						        	
						        	
						        	// for secound part
						      String id=textField_4.getText();
						        String query4 = ("SELECT ResourceName,Information FROM resource WHERE reso_id='"+id+"'");
						        ResultSet rs4=st.executeQuery(query4);
							     //   rs = ss3.executeQuery();
							        if (rs4.next()) 
							         {
							        	s1=rs4.getString("ResourceName");
							        	textField_8.setText(s1);
							        	s6=rs4.getString("Information");
							        	textArea.setText(s6);
							        
							        
							        	
							        	   int total;
										int sum;
										String s;
							        	   String value=textField_6.getText();
							        	  sum= Integer.parseInt(value);
							        	   total =sum * 5000;
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
		btnNewButton.setBounds(471, 632, 142, 29);
		frmPreservarance.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1.setIcon(new ImageIcon(Preservarancescr1.class.getResource("/image/resource.png")));
		lblNewLabel_1.setBounds(-1068, 11, 2471, 687);
		frmPreservarance.getContentPane().add(lblNewLabel_1);
		
		textField_11 = new JTextField();
		textField_11.setBounds(263, 282, 86, 20);
		frmPreservarance.getContentPane().add(textField_11);
		textField_11.setColumns(10);
		
		/* DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");  
		   LocalDate now = LocalDate.now(); 
		   
		   System.out.println(dtf.format(now) + MILLIS_IN_A_DAY);*/
		
	
	//	
		
	


	}



	private char[] findNextDay(LocalDate now) {
		// TODO Auto-generated method stub
		return null;
	}
}
