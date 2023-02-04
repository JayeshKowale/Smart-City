package cpp;



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Anthro1 {
    
	public JFrame frmVenueRegistration;
	private JTextField txt0;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Anthro1 window = new Anthro1();
					window.frmVenueRegistration.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	Connection con=null;
	
	private JTextField txt2;
	private JTextField txt3;
	private JTextField textField_8;
	private JTextField txt1;
	public JComboBox comboBox;
	public JComboBox comboBox_1;
	public JComboBox cb3;
	public static FileInputStream f1;
	public static FileInputStream f2;
	public static FileInputStream f3;
	public Anthro1() {
		con=DB.dbconnect();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmVenueRegistration = new JFrame("ANTHROPOLOGICAL INPUTS	");
		frmVenueRegistration.setTitle("Anthropological Inputs");
		frmVenueRegistration.getContentPane().setBackground(Color.WHITE);
		
		frmVenueRegistration.getContentPane().setFont(new Font("Times New Roman", Font.PLAIN, 13));
		frmVenueRegistration.setBounds(0, 0, 1369, 713);
		frmVenueRegistration.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmVenueRegistration.getContentPane().setLayout(null);
		
		JButton btnNewButton_1 = new JButton("CLOSE");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmVenueRegistration.dispose();
				
				
			}
		});
		
		JLabel lofolabel = new JLabel("");
		lofolabel.setIcon(new ImageIcon(Anthro1.class.getResource("/Image/Smart City Logo change.jpg")));
		lofolabel.setBounds(10, 0, 302, 154);
		frmVenueRegistration.getContentPane().add(lofolabel);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Maharashtra ", "not avaiable in the list"}));
		comboBox_1.setBounds(468, 439, 232, 22);
		frmVenueRegistration.getContentPane().add(comboBox_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("Please select city/village");
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Chikaldara ", "Bazargaon", "Pachgani", "Melghat ", "Kondeshwar ", "Wadali", "Amravati", "Nagpur"}));
		comboBox.setBounds(468, 383, 232, 22);
		frmVenueRegistration.getContentPane().add(comboBox);
		
		JTextArea textField_3 = new JTextArea();
		textField_3.setBounds(1128, 462, 174, 97);
		frmVenueRegistration.getContentPane().add(textField_3);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(1190, 499, -34, 22);
		frmVenueRegistration.getContentPane().add(textArea);
		
		JButton dash = new JButton("BACK TO DASHBOARD");
		dash.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmVenueRegistration.setVisible(false);
				Dashboard d = new Dashboard();
				d.frmSmartcityDashboard.setVisible(true);
			}
		});
		dash.setBounds(855, 645, 146, 23);
		frmVenueRegistration.getContentPane().add(dash);
		
		JTextArea textField_2 = new JTextArea();
		textField_2.setBounds(1128, 303, 174, 86);
		frmVenueRegistration.getContentPane().add(textField_2);
		
		JTextArea textField_1 = new JTextArea();
		textField_1.setBounds(1128, 162, 174, 84);
		frmVenueRegistration.getContentPane().add(textField_1);
		btnNewButton_1.setBounds(696, 641, 123, 28);
		frmVenueRegistration.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("ANTHROPOLOGICAL INPUTS");
		lblNewLabel.setFont(new Font("Forte", Font.BOLD, 33));
		lblNewLabel.setForeground(new Color(210, 105, 30));
		lblNewLabel.setBackground(new Color(153, 0, 0));
		lblNewLabel.setBounds(527, 21, 489, 46);
		frmVenueRegistration.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Founded By / Owner\r\n");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1.setBounds(368, 166, 147, 14);
		frmVenueRegistration.getContentPane().add(lblNewLabel_1);
		
		txt0 = new JTextField();
		txt0.setToolTipText("");
		txt0.setBounds(525, 121, 232, 20);
		frmVenueRegistration.getContentPane().add(txt0);
		txt0.setColumns(10);
		
		
		
		
		JButton btnNewButton_4 = new JButton("Attach Image Here");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					JFileChooser jfc=new JFileChooser();
					jfc.showOpenDialog(null);
					File file=jfc.getSelectedFile();
					
					 f1=new FileInputStream(file);
					
				
				
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 
				
				
			}
		});
		btnNewButton_4.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_4.setBounds(879, 194, 137, 21);
		frmVenueRegistration.getContentPane().add(btnNewButton_4);
		
		
		
		JButton btnNewButton_3 = new JButton("Attach Image Here");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			

				try {
			JFileChooser jfc=new JFileChooser();
			jfc.showOpenDialog(null);
			File file=jfc.getSelectedFile();
			
			 f2=new FileInputStream(file);
			
		
		
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 	
				
			}
			
			
			
			
		});
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_3.setBounds(879, 339, 146, 21);
		frmVenueRegistration.getContentPane().add(btnNewButton_3);
		
		
		
		JButton btnNewButton_5 = new JButton("Attach Image Here");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
				
					JFileChooser jfc=new JFileChooser();
					jfc.showOpenDialog(null);
					File file=jfc.getSelectedFile();
					
					 f3=new FileInputStream(file);
			
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 
			
				
				
			}
		});
		btnNewButton_5.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_5.setBounds(881, 485, 135, 21);
		frmVenueRegistration.getContentPane().add(btnNewButton_5);
		
		
		JButton btnNewButton = new JButton("ADD");
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String ven_name = txt0.getText();
			String found_by = txt1.getText();
			String ven_addr = txt2.getText();
			String found_yr = txt3.getText();
			/*String hist_info=textField_1.getText();
			String ancient_info=textField_2.getText();
			String religious_info=textField_3.getText();*/
		    String city =(String) comboBox.getSelectedItem();
			String state = (String) comboBox_1.getSelectedItem();
			String histo_info=textField_1.getText();
			String anci_info=textField_2.getText();
			String reli_info=textField_3.getText();
			String subm_by=textField_8.getText();
			try {
				//Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
				//Connection con=DriverManager.getConnection("jdbc:ucanaccess://F://polytechinc//TestData.accdb");
				Statement st=con.createStatement();
				PreparedStatement pst=con.prepareStatement("insert into anthro(Venue_nam,founder,venue_addr,founded_in,city_vill,state,history_p_info,ancient_p_info,religious_p_info,historical_p,ancient_p,religious_p,submitted_by,Date_Formed) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			
			    pst.setString(1,ven_name);
			    pst.setString(2,found_by);
			    pst.setString(3,ven_addr);
			    pst.setString(4,found_yr);
			    pst.setString(5,city);
			    pst.setString(6,state);
			    pst.setString(7,histo_info);
			    pst.setString(8,anci_info);
			    pst.setString(9,reli_info);
			    pst.setBlob(10,(Blob)null);
			    pst.setBlob(11,(Blob)null);
			    pst.setBlob(12,(Blob)null);
			    pst.setString(13, subm_by);
			    pst.setDate(14, java.sql.Date.valueOf(java.time.LocalDate.now()));
			  
			    pst.executeUpdate();
				JOptionPane.showMessageDialog(null,"DATA ADDED");
				
			
			
				String id=null;
				String quer = ("SELECT Anthro_id FROM anthro ORDER BY Anthro_id DESC ");
			        ResultSet rs= null;
			        PreparedStatement ss2=con.prepareStatement(quer);
			        rs = ss2.executeQuery();
			        
			        
			         if (rs.next()) 
			         {
			              id  = rs.getString("Anthro_id");
			           
			         }
			         JOptionPane.showMessageDialog(null,"Your database id is   "+id+ "  remember it for your future use");
			     	
				
				 	String query_1="update anthro set historical_p=? where Anthro_id= ?";//insert into anthro(historical_p) values(?) where Annthro_id=? ";
					PreparedStatement stmt_1=con.prepareStatement(query_1);
					stmt_1.setString(2, id);
                    stmt_1.setBinaryStream(1,f1,f1.available());
                    JOptionPane.showMessageDialog(null, "Your Historical image has been successfully added!!!!");
					stmt_1.executeUpdate();
					
					String query_2="update anthro set ancient_p=? where Anthro_id= ?";//insert into anthro(historical_p) values(?) where Annthro_id=? ";
					PreparedStatement stmt_2=con.prepareStatement(query_2);
					stmt_2.setString(2, id);
                    stmt_2.setBinaryStream(1,f2,f2.available());
                    JOptionPane.showMessageDialog(null, "Your Ancient place image has been successfully added!!!!");
					stmt_2.executeUpdate();
					
					String query_3="update anthro set religious_p=? where Anthro_id= ?";//insert into anthro(historical_p) values(?) where Annthro_id=? ";
					PreparedStatement stmt_3=con.prepareStatement(query_3);
					stmt_3.setString(2, id);
                    stmt_3.setBinaryStream(1,f3,f3.available());
                    JOptionPane.showMessageDialog(null, "Your Religious place image has been successfully added!!!!");
					stmt_3.executeUpdate();
				
				
					
					
					
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			catch(Exception e3)
			{
				e3.printStackTrace();
			}
			
			
			
			
		
			
			
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setForeground(Color.BLACK);
	
		btnNewButton.setBounds(255, 641, 127, 28);
		frmVenueRegistration.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("Venue Full Name");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_5.setBounds(388, 121, 147, 19);
		frmVenueRegistration.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Venue Address");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_6.setBounds(331, 267, 127, 14);
		frmVenueRegistration.getContentPane().add(lblNewLabel_6);
		
		txt2 = new JTextField();
		txt2.setToolTipText("");
		txt2.setBounds(468, 266, 232, 20);
		frmVenueRegistration.getContentPane().add(txt2);
		txt2.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("City/Village");
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_9.setBounds(331, 386, 118, 14);
		frmVenueRegistration.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_17 = new JLabel("Venue Information");
		lblNewLabel_17.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_17.setBounds(331, 206, 238, 23);
		frmVenueRegistration.getContentPane().add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("General Information");
		lblNewLabel_18.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_18.setBounds(374, 77, 211, 23);
		frmVenueRegistration.getContentPane().add(lblNewLabel_18);
		
		JLabel lblNewLabel_20 = new JLabel("State");
		lblNewLabel_20.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_20.setBounds(342, 442, 46, 14);
		frmVenueRegistration.getContentPane().add(lblNewLabel_20);
		
		/*JLabel lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.setIcon(new ImageIcon(Anthro.class.getResource("/Image/Smart City Logo change.jpg")));
		lblNewLabel_13.setBounds(10, 0, 338, 166);
		frmVenueRegistration.getContentPane().add(lblNewLabel_13);*/
		
		JLabel lblNewLabel_23 = new JLabel("LET'S");
		lblNewLabel_23.setBackground(new Color(204, 255, 51));
		lblNewLabel_23.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_23.setBounds(88, 462, 174, 23);
		frmVenueRegistration.getContentPane().add(lblNewLabel_23);
		
		JLabel lblNewLabel_24 = new JLabel("ALL ROAM IN THE");
		lblNewLabel_24.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_24.setBounds(25, 495, 344, 26);
		frmVenueRegistration.getContentPane().add(lblNewLabel_24);
		
		JLabel lblNewLabel_25 = new JLabel("HISTORICAL WORLD !!");
		lblNewLabel_25.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_25.setBounds(25, 520, 262, 35);
		frmVenueRegistration.getContentPane().add(lblNewLabel_25);
		
		JButton btnNewButton_2 = new JButton("Help ");
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnNewButton_2.setBounds(1217, 21, 85, 21);
		frmVenueRegistration.getContentPane().add(btnNewButton_2);
		
		/*JComboBox cb1 = new JComboBox();
		
		cb1.setToolTipText("Select City/Village");
		cb1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		cb1.setModel(new DefaultComboBoxModel(new String[] {"Chikaldara", "Bazargaon", "Pachgani", "Melghat", "Kondeshwar", "Wadali", "Amravati", "Nagpur"}));
		cb1.setBounds(468, 383, 232, 21);
		frmVenueRegistration.getContentPane().add(cb1);*/
		
		/*JComboBox cb2 = new JComboBox();
		cb2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		cb2.setModel(new DefaultComboBoxModel(new String[] {"Maharashtra", "(not avaiable in the list)"}));
		cb2.setBounds(468, 439, 232, 21);
		frmVenueRegistration.getContentPane().add(cb2);*/
		
		JLabel lblNewLabel_3 = new JLabel("Historical/Past Information");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_3.setBounds(954, 66, 260, 46);
		frmVenueRegistration.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_10 = new JLabel("History of Monument(30-50 Words)");
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_10.setBounds(1055, 112, 247, 35);
		frmVenueRegistration.getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Founded in (Year)");
		lblNewLabel_11.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_11.setBounds(318, 323, 137, 13);
		frmVenueRegistration.getContentPane().add(lblNewLabel_11);
		
		txt3 = new JTextField();
		txt3.setBounds(489, 321, 190, 19);
		frmVenueRegistration.getContentPane().add(txt3);
		txt3.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Information Submitted By :-\r\n");
		lblNewLabel_12.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_12.setBounds(824, 598, 207, 13);
		frmVenueRegistration.getContentPane().add(lblNewLabel_12);
		
		textField_8 = new JTextField();
		textField_8.setBounds(1060, 596, 162, 19);
		frmVenueRegistration.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		txt1 = new JTextField();
		txt1.setBounds(527, 165, 230, 19);
		frmVenueRegistration.getContentPane().add(txt1);
		txt1.setColumns(10);
		
		JLabel lblNewLabel_10_1 = new JLabel("History of Monument (30-50 Words)");
		lblNewLabel_10_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_10_1.setBounds(1055, 257, 247, 35);
		frmVenueRegistration.getContentPane().add(lblNewLabel_10_1);
		
		JLabel lblNewLabel_10_1_1 = new JLabel("History of Monument (30-50 Words)");
		lblNewLabel_10_1_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_10_1_1.setBounds(1060, 419, 247, 35);
		frmVenueRegistration.getContentPane().add(lblNewLabel_10_1_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Select Historical Places", "Shaniwarwada, Pune", "Red Fort, Delhi", "Gateway of India, Mumbai"}));
		comboBox_2.setBounds(862, 120, 183, 21);
		frmVenueRegistration.getContentPane().add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Select Ancient Places", "Tajmahal, Agra", "Bibika Makbara, Aurangabad", "Ajanata Elora Caves, Aurangabad", "Shivneri Fort, Pune"}));
		comboBox_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		comboBox_3.setBounds(862, 265, 183, 21);
		frmVenueRegistration.getContentPane().add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setFont(new Font("Times New Roman", Font.BOLD, 12));
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Select Relegious Places", "Tryamabakeshwar, Nashik", "Siddhivinayak Mandir, Mumbai", "Ambadevi Temple, Amravati", "Dagdusheth Mandir, Pune"}));
		comboBox_4.setBounds(860, 427, 180, 21);
		frmVenueRegistration.getContentPane().add(comboBox_4);
		
		JButton btnNewButton_6 = new JButton("update");
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UpdateAnthro1 ua=new UpdateAnthro1();
				ua.setVisiable(true);
				
			}
		});
		btnNewButton_6.setBounds(426, 641, 89, 27);
		frmVenueRegistration.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Delete");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DelAnthro1 da= new DelAnthro1();
				da.setVisiable(true);
				
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_7.setBounds(550, 645, 108, 23);
		frmVenueRegistration.getContentPane().add(btnNewButton_7);
		

		
	
		
		
	JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setToolTipText("please select");
		lblNewLabel_2.setIcon(new ImageIcon(Anthro1.class.getResource("/image/5089466-background-paper-grunge-old-world-map.jpg")));
		lblNewLabel_2.setBounds(10, 0, 1345, 676);
		frmVenueRegistration.getContentPane().add(lblNewLabel_2);
		
		JLabel Logo = new JLabel("");
		Logo.setIcon(new ImageIcon(Anthro1.class.getResource("/image/Smart City Logo change.jpg")));
		Logo.setBounds(-37, 0, 302, 154);
		frmVenueRegistration.getContentPane().add(Logo);


	
	}
}
