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
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
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
import javax.swing.JTextArea;

public class Updateresource1 {
    
	public JFrame frame;

	private JTextField textField_1;
	public static FileInputStream f1;

	/**
	 * Launch the application.
	 */
	Connection con=null;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Updateresource1 window = new Updateresource1();
					window.frame.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private int id;
	public static String y1,ss1;
	public Updateresource1() {
		con=DB.dbconnect();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Resources Registration");
	
		frame.getContentPane().setFont(new Font("Times New Roman", Font.PLAIN, 13));
		frame.setBounds(0, 0, 1369, 730);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton_2 = new JButton("Attach Image here");
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
		btnNewButton_2.setBounds(868, 378, 131, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton dash = new JButton("BACK TO DASHBOARD");
		dash.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.setVisible(false);
				//Dashboard d = new Dashboard();
				//d.frmSmartcityDashboard.setVisible(true);
			}
		});
		dash.setBounds(788, 630, 146, 23);
		frame.getContentPane().add(dash);
		
		
		JLabel lblNewLabel = new JLabel("UPDATE YOUR RESOURCES REGISTRATION INFORMATION HERE");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel.setBounds(459, 11, 796, 46);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblPleaseEnterDetails = new JLabel("Please Enter Details Carefully");
		lblPleaseEnterDetails.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblPleaseEnterDetails.setBounds(295, 68, 337, 29);
		frame.getContentPane().add(lblPleaseEnterDetails);
		
		JLabel label1 = new JLabel("Select State Name");
		label1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label1.setBounds(275, 124, 168, 14);
		frame.getContentPane().add(label1);
		
		JLabel label2 = new JLabel("Select City Name ");
		label2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label2.setBounds(275, 166, 244, 14);
		frame.getContentPane().add(label2);
		
		JLabel lblNewLabel_3 = new JLabel("Enter Name of Resources");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_3.setBounds(275, 213, 213, 14);
		frame.getContentPane().add(lblNewLabel_3);

		
		
		textField_1 = new JTextField("");
		textField_1.setBounds(435, 211, 200, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		
		textField_3 = new JTextField("");
	
		textField_3.setBounds(435, 263, 197, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField("");
		textField_4.setBounds(435, 323, 197, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel Label5 = new JLabel("Enter Founded By");
		Label5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		Label5.setBounds(275, 265, 168, 14);
		frame.getContentPane().add(Label5);
		
		textField_5 = new JTextField("");
		textField_5.setBounds(435, 378, 197, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel Label6 = new JLabel("Resource founded on");
		Label6.setFont(new Font("Times New Roman", Font.BOLD, 14));
		Label6.setBounds(275, 325, 168, 14);
		frame.getContentPane().add(Label6);
		
		textField_6 = new JTextField("");
		textField_6.setBounds(435, 441, 197, 20);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JLabel Label7 = new JLabel("Founder Phone No");
		Label7.setFont(new Font("Times New Roman", Font.BOLD, 14));
		Label7.setBounds(275, 380, 137, 14);
		frame.getContentPane().add(Label7);
		
		textField_7 = new JTextField("");
		textField_7.setBounds(435, 494, 197, 20);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JTextArea textArea = new JTextArea("");
		textArea.setBounds(800, 162, 237, 117);
		frame.getContentPane().add(textArea);

	
	
		
		JComboBox cb1 = new JComboBox();
		cb1.addItem("Select State Name");
		cb1.addItem("Maharashtra");
		cb1.addItem("Madhya Pradesh");
		cb1.addItem("Uttar Pradesh");
		cb1.addItem("Andhra Pradesh");
		cb1.addItem("Punjab");
		cb1.addItem("non of above");
		cb1.setBounds(435, 121, 137, 23);
		frame.getContentPane().add(cb1);
		
		
		JComboBox cb2 = new JComboBox();
		cb2.addItem("Select City Name");
		cb2.addItem("Amravati");
		cb2.addItem("Akola");
		cb2.addItem("Nagpur");
		cb2.addItem("Mumbai");
		cb2.addItem("Pune");
		cb2.addItem("non of above");
		cb2.setBounds(435, 164, 137, 20);
		frame.getContentPane().add(cb2);
		
		/*JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Select City Name ", "Amravati", "Akola", "Nagpur", "Mumbai", "Pune"}));
		comboBox_1.setBounds(435, 257, 137, 22);
		frame.getContentPane().add(comboBox_1);*/
		
		JLabel Label8 = new JLabel("Resource Address");
		Label8.setFont(new Font("Times New Roman", Font.BOLD, 14));
		Label8.setBounds(275, 443, 197, 14);
		frame.getContentPane().add(Label8);
		
		JLabel Label9 = new JLabel(" Enter Type Of Resource");
		Label9.setFont(new Font("Times New Roman", Font.BOLD, 14));
		Label9.setBounds(275, 496, 182, 14);
		frame.getContentPane().add(Label9);
		
		/*JLabel lblNewLabel_1 = new JLabel("Attach Resource Image for Identification");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setBounds(758, 310, 257, 23);
		frame.getContentPane().add(lblNewLabel_1);*/
		
		/*JButton btnNewButton_2 = new JButton("Attach Resource Image Here");
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_2.setBounds(780, 344, 257, 29);
		frame.getContentPane().add(btnNewButton_2);*/
		
		
		/****************************************/
        JFrame f=new JFrame("fgfh");
		f.setBounds(100, 100, 700, 690);
		f.setVisible(true);
		f.getContentPane().setLayout(null);
		
		JLabel j =new JLabel("Please enter the data id and name of Resource Registration");	
		j.setFont(new Font("Times New Roman", Font.BOLD, 24));
	    j.setBounds(10, 11,700 , 39);
		f.getContentPane().add(j);
		
		JLabel j1 =new JLabel("Data id:-");	
		j1.setFont(new Font("Times New Roman", Font.BOLD,20));
	    j1.setBounds(150,190,100 ,19);
		f.getContentPane().add(j1);

		JLabel j2 =new JLabel("Name");	
		j2.setFont(new Font("Times New Roman", Font.BOLD,20));
	    j2.setBounds(150,120,130 ,20);
		f.getContentPane().add(j2);
		
		/*JTextField ff= new JTextField("yyy");
		ff.setBounds(300,190,100,20);
		f.add(ff);
		ff.setVisible(true);*/

		 JTextField tf = new JTextField();
		tf.setToolTipText("Enter Data id");
		tf.setBounds(270, 190,130, 20);
		f.getContentPane().add(tf);
		tf.setColumns(20);
		tf.setVisible(true);

		JTextField tf1 = new JTextField();
		tf1.setToolTipText("Enter Name");
		tf1.setBounds(270, 120,130, 20);
		f.getContentPane().add(tf1);
		tf1.setColumns(20);
		tf1.setVisible(true);
		
		JButton jb=new JButton("Submit");
		jb.setBounds(150,300, 89, 23);
		f.getContentPane().add(jb);
		
		jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String s1=cb1.getSelectedItem().toString();
				String s2=cb2.getSelectedItem().toString();
				String s=tf1.getText();
				String y1=tf.getText();
				
				try {
					// Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
						//Connection con=DriverManager.getConnection("jdbc:ucanaccess://F://polytechinc//TestData.accdb");
						Statement st=con.createStatement();
					 String query1="select * from resource where reso_id =?";
				        ResultSet rs1= null;
				         PreparedStatement ss3=con.prepareStatement(query1);
				         ss3.setString(1,y1);
				       rs1=ss3.executeQuery();
				        // System.out.println("done");
				         ResultSetMetaData rsMetaData = rs1.getMetaData();
				         
				         if(!rs1.next())
					 		{
					 			JOptionPane.showMessageDialog(null,"Please enter an valid ID");
					 		}
					 String i=null;
		        	 String i1=null;
		        	 String i2=null;
		        	 String i3=null;
		        	 String i4=null;
		        	 String i5=null;
		        	 String i6=null;
		        	 String i7=null;
		        	 String i8=null;
		        	 String i9=null;
		        	 
		        	 i=cb1.getSelectedItem().toString();
		        	 i1=cb2.getSelectedItem().toString();
	        		//i1=rs1.getString("City");
	        		i2=rs1.getString("ResourceName");
	        		i3=rs1.getString("FoundedBy");
	        		i4=rs1.getString("FoundedOn");
	        		i5=rs1.getString("Phone");
	        		i6=rs1.getString("Address");
	        		i7=rs1.getString("Type");
	        		i8=rs1.getString("Information");
	        		i9=rs1.getString("img");
	        		
	        		cb1.setToolTipText(i);
	        		cb2.setToolTipText(i1);//i5,i2,i10
	        		textField_1.setText(i2);
	        		 textField_3.setText(i3);
	        		 textField_4.setText(i4);
	        		 textField_5.setText(i5);
	        		 textField_6.setText(i6);
	        		 textField_7.setText(i7);
	        		 textArea.setText(i8);
	        		 
	        		 f.setVisible(false);
	        		 frame.setVisible(true);
						ss1=y1;
			        		
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
				try
				{
					String y2=tf.getText();
					//Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
					//Connection con=DriverManager.getConnection("jdbc:ucanaccess://F://polytechinc//TestData.accdb");
					Statement st=con.createStatement();
					String s1=cb1.getSelectedItem().toString();
					String s2=cb2.getSelectedItem().toString();
					String s3=textField_1.getText();
					String s4=textField_3.getText();
					String s5=textField_4.getText();
					String s6= textField_5.getText();
					String s7= textField_6.getText();
					String s8= textField_7.getText();
					String s9=textArea.getText();
					
				/*String s1=textField_1.getText();
					String s2=textField_3.getText();
				    String s3= textField_4.getText();
					String s4= textField_5.getText();
					String s5= textField_6.getText();
					String s6= textField_7.getText();
					String s7= textArea.getText();
					String s8=cb1.getSelectedItem().toString();
					String s9=cb2.getSelectedItem().toString();*/
					

	
	String sql = "UPDATE resource SET State=?,City=?,ResourceName=?,FoundedBy=?,FoundedOn=?,Phone=?,Address=?,Type=?,Information=? where reso_id="+y2;		           
    PreparedStatement ss=con.prepareStatement(sql);
    	int rs1;
    	ss.setString(1,s1);
    	ss.setString(2, s2);
    	ss.setString(3,s3);
    	ss.setString(4,s4);
    	ss.setString(5,s5);
    	ss.setString(6,s6);
    	ss.setString(7,s7);
    	ss.setString(8,s8);
    	ss.setString(9,s9);
  
    
 
  
  rs1=ss.executeUpdate();
JOptionPane.showMessageDialog(null,"Your Information has been successfully Updated!!");
				
				}
				catch(Exception e1)
				{
					System.out.println(e1);
				}
				
			
				
			}

			private ResultSet ResultSetMetaData() {
				// TODO Auto-generated method stub
				return null;
			}
		});
		btnNewButton.setForeground(Color.BLACK);		
		btnNewButton.setBounds(507, 630, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CLOSE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				
				
			}
		});
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBounds(668, 630, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		/*JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Updateresource.class.getResource("/Image/Smart City Logo change.jpg")));
		lblNewLabel_2.setBounds(-37, 0, 302, 154);
		frame.getContentPane().add(lblNewLabel_2);*/
		
		JLabel lblNewLabel_4 = new JLabel("Enter Resource Information in brief");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_4.setBounds(800, 124, 237, 20);
		frame.getContentPane().add(lblNewLabel_4);
		
				
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Updateresource1.class.getResource("/image/1553504662023.jpg")));
		lblNewLabel_1.setBounds(0, -73, 1345, 766);
		frame.getContentPane().add(lblNewLabel_1);
		
		
		
		
	
	}

	public void setVisiable(boolean b) {
		// TODO Auto-generated method stub
		frame.setVisible(false);
	}
}
