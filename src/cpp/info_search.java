package cpp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JTextPane;
import javax.swing.SwingConstants;

import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class info_search {

	public static JFrame frmInformationSearch;
	public static String g;
	public static String t;

	public static int r;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					info_search window = new info_search();
					window.frmInformationSearch.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	Connection connection=null;
	public info_search() {
		initialize();
		connection=DB.dbconnect();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmInformationSearch = new JFrame();
		frmInformationSearch.setForeground(Color.BLACK);
		frmInformationSearch.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		frmInformationSearch.setTitle("SEARCH HERE !!");
		frmInformationSearch.setBounds(100, 100, 1279, 709);
		frmInformationSearch.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmInformationSearch.getContentPane().setLayout(null);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				view v = new view();
				v.frmInformationSearch.setVisible(true);
				frmInformationSearch.setVisible(false);
				
			}
		});
		btnBack.setForeground(Color.BLUE);
		btnBack.setFont(new Font("Viner Hand ITC", Font.BOLD | Font.ITALIC, 20));
		btnBack.setBackground(Color.CYAN);
		btnBack.setBounds(270, 590, 246, 69);
		frmInformationSearch.getContentPane().add(btnBack);
		
		
		JLabel lblNewLabel = new JLabel("WELCOME DEAR USER !!!");
		lblNewLabel.setForeground(new Color(0, 128, 128));
		lblNewLabel.setFont(new Font("MathJax_SansSerif", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(422, 10, 435, 33);
		frmInformationSearch.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("SELECT YOUR CHOICE :");
		lblNewLabel_1.setForeground(new Color(100, 149, 237));
		lblNewLabel_1.setFont(new Font("Lucida Handwriting", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel_1.setBounds(351, 53, 586, 48);
		frmInformationSearch.getContentPane().add(lblNewLabel_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("PROPERTY");
		rdbtnNewRadioButton.setBackground(new Color(30, 144, 255));
		rdbtnNewRadioButton.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 35));
		rdbtnNewRadioButton.setBounds(449, 107, 261, 69);
		frmInformationSearch.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("VENUES");
		rdbtnNewRadioButton_1.setBackground(new Color(100, 149, 237));
		rdbtnNewRadioButton_1.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 35));
		rdbtnNewRadioButton_1.setBounds(449, 196, 261, 69);
		frmInformationSearch.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("ANTHROPOLOGICAL");
		rdbtnNewRadioButton_2.setBackground(new Color(32, 178, 170));
		rdbtnNewRadioButton_2.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 35));
		rdbtnNewRadioButton_2.setBounds(450, 290, 385, 69);
		frmInformationSearch.getContentPane().add(rdbtnNewRadioButton_2);
		
		JButton btnNewButton = new JButton("SEARCH RESULTS");
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setFont(new Font("Viner Hand ITC", Font.BOLD | Font.ITALIC, 20));
		btnNewButton.setBounds(671, 590, 246, 69);
		frmInformationSearch.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("Search Here !");
		lblNewLabel_3.setForeground(new Color(0, 255, 255));
		lblNewLabel_3.setBackground(new Color(30, 144, 255));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 28));
		lblNewLabel_3.setBounds(559, 365, 199, 33);
		frmInformationSearch.getContentPane().add(lblNewLabel_3);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(449, 408, 386, 153);
		frmInformationSearch.getContentPane().add(textArea);
		
		JLabel lblNewLabel_2 = new JLabel("Your Result !");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lblNewLabel_2.setForeground(Color.CYAN);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(967, 387, 261, 57);
		frmInformationSearch.getContentPane().add(lblNewLabel_2);
		lblNewLabel_2.setVisible(false);
		
		JLabel lblNewLabel_4 = new JLabel("Owner Name");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_4.setForeground(Color.CYAN);
		lblNewLabel_4.setBounds(952, 444, 122, 33);
		frmInformationSearch.getContentPane().add(lblNewLabel_4);
		lblNewLabel_4.setVisible(false);
		
		JLabel lblNewLabel_6 = new JLabel("xxyz");
		lblNewLabel_6.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblNewLabel_6.setForeground(Color.CYAN);
		lblNewLabel_6.setBounds(1084, 440, 157, 40);
		frmInformationSearch.getContentPane().add(lblNewLabel_6);
		lblNewLabel_6.setVisible(false);
		
		JLabel lblNewLabel_7 = new JLabel("Phone No.");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_7.setForeground(Color.CYAN);
		lblNewLabel_7.setBounds(952, 488, 85, 27);
		frmInformationSearch.getContentPane().add(lblNewLabel_7);
		lblNewLabel_7.setVisible(false);
		
		JLabel lblNewLabel_8 = new JLabel("2222222222");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_8.setForeground(Color.CYAN);
		lblNewLabel_8.setBounds(1084, 496, 130, 19);
		frmInformationSearch.getContentPane().add(lblNewLabel_8);
		lblNewLabel_8.setVisible(false);
		
		JLabel lblNewLabel_9 = new JLabel("E-Mail");
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_9.setForeground(Color.CYAN);
		lblNewLabel_9.setBounds(952, 542, 85, 19);
		frmInformationSearch.getContentPane().add(lblNewLabel_9);
		lblNewLabel_9.setVisible(false);
		
		JLabel lblNewLabel_10 = new JLabel("h04pandey@gmail.com");
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_10.setForeground(Color.CYAN);
		lblNewLabel_10.setBounds(1060, 538, 193, 27);
		frmInformationSearch.getContentPane().add(lblNewLabel_10);
		lblNewLabel_10.setVisible(false);
		
		JLabel lblNewLabel_41 = new JLabel("Owner Name");
		lblNewLabel_41.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_41.setForeground(Color.CYAN);
		lblNewLabel_41.setBounds(952, 444, 122, 33);
		frmInformationSearch.getContentPane().add(lblNewLabel_41);
		lblNewLabel_41.setVisible(false);
		
		JLabel lblNewLabel_61 = new JLabel("xxyz");
		lblNewLabel_61.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblNewLabel_61.setForeground(Color.CYAN);
		lblNewLabel_61.setBounds(1084, 440, 157, 40);
		frmInformationSearch.getContentPane().add(lblNewLabel_61);
		lblNewLabel_61.setVisible(false);
		
		JLabel lblNewLabel_71 = new JLabel("Venue Name");
		lblNewLabel_71.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_71.setForeground(Color.CYAN);
		lblNewLabel_71.setBounds(952, 488, 106, 27);
		frmInformationSearch.getContentPane().add(lblNewLabel_71);
		lblNewLabel_71.setVisible(false);
		
		JLabel lblNewLabel_81 = new JLabel("2222222222");
		lblNewLabel_81.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_81.setForeground(Color.CYAN);
		lblNewLabel_81.setBounds(1084, 496, 130, 19);
		frmInformationSearch.getContentPane().add(lblNewLabel_81);
		lblNewLabel_81.setVisible(false);
		
		JLabel lblNewLabel_91 = new JLabel("Venue Address");
		lblNewLabel_91.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_91.setForeground(Color.CYAN);
		lblNewLabel_91.setBounds(915, 542, 122, 19);
		frmInformationSearch.getContentPane().add(lblNewLabel_91);
		lblNewLabel_91.setVisible(false);
		
		JLabel lblNewLabel_57 = new JLabel("Please Enter Your Choice !");
		lblNewLabel_57.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_57.setForeground(Color.CYAN);
		lblNewLabel_57.setBounds(59, 507, 288, 33);
		frmInformationSearch.getContentPane().add(lblNewLabel_57);
		lblNewLabel_57.setVisible(false);
		
		JLabel lblNewLabel_571 = new JLabel("No Data Found!");
		lblNewLabel_571.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_571.setForeground(Color.CYAN);
		lblNewLabel_571.setBounds(59, 546, 288, 33);
		frmInformationSearch.getContentPane().add(lblNewLabel_571);
		lblNewLabel_571.setVisible(false);

		
		JLabel lblNewLabel_101 = new JLabel("h04pandey@gmail.com");
		lblNewLabel_101.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_101.setForeground(Color.CYAN);
		lblNewLabel_101.setBounds(1060, 538, 193, 27);
		frmInformationSearch.getContentPane().add(lblNewLabel_101);
		lblNewLabel_101.setVisible(false);
		
		
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				t=textArea.getText();
				boolean choiceSelected=false;
				
			//   try {
					 /*connection = DriverManager.getConnection("jdbc:ucanaccess://D://Database5.accdb");
					System.out.println("Connected Successfully");
					}
			   catch (SQLException e1) 
			   {
					e1.printStackTrace();
				}*/
		           		            
				if(rdbtnNewRadioButton.isSelected())
				{    
					g="property"; 
					choiceSelected=true;
					System.out.println("value of g:"+g);
					try {
						PreparedStatement ss=connection.prepareStatement("select * from prop_reg where name_ow=? OR ph_no=? OR email=? OR district=? OR state=? OR prop_addr=? OR land_m=? OR pin =? OR district_p =? OR prop_reg_y =? OR prop_reg_d =? OR land_l =? OR city =? OR state_prop =? OR area_road =? OR prop_by=?");
						ss.setString(1,t);
			            ss.setString(2,t);
			            ss.setString(3,t);
			            ss.setString(4,t);
			            ss.setString(5,t);
			            ss.setString(6,t);
			            ss.setString(7,t);
			            ss.setString(8,t);
			            ss.setString(9,t);
			            ss.setString(10,t);
			            ss.setString(11,t);
			            ss.setString(12,t);
			            ss.setString(13,t);
			            ss.setString(14,t);
			            ss.setString(15,t);
			            ss.setString(16,t);
			            ResultSet rs= null;
				     //   PreparedStatement ss2=connection.prepareStatement(query);
				        rs = ss.executeQuery();
				        if (!rs.isBeforeFirst() ) {    
				            System.out.println("No data"); 
				            lblNewLabel_571.setVisible(true);
				        } 
				        else
				        {	
				        
				        if (rs.next()) 
				         {
				             
				             // t=rs.getString("name_ow");
				        	lblNewLabel_6.setText(rs.getString("name_ow"));
				        	lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 18));
				        	lblNewLabel_8.setText(rs.getString("ph_no"));
				        	lblNewLabel_10.setText(rs.getString("email"));
				        	
				         }
				        
				       // lblNewLabel_57.setText(t);
				        lblNewLabel_4.setVisible(true);
				        lblNewLabel_2.setVisible(true);
						lblNewLabel_6.setVisible(true);
						lblNewLabel_7.setVisible(true);
						lblNewLabel_8.setVisible(true);
						lblNewLabel_9.setVisible(true);
						lblNewLabel_10.setVisible(true);
				        }

				        
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}    
				if(rdbtnNewRadioButton_1.isSelected())
				{    
					g="Venue";   
					choiceSelected=true;
					try {
						PreparedStatement ss=connection.prepareStatement("select * from venue where Venue_Name=? OR Owner=? OR Opening_Time=? OR Venue_Address=? OR Landmark=? OR Pincode=? OR City=? OR State=? OR Founder=? OR History=? OR Found_Year=? OR Submitter_Name=? OR g_id=?");
						ss.setString(1,t);
			            ss.setString(2,t);
			            ss.setString(3,t);
			            ss.setString(4,t);
			            ss.setString(5,t);
			            ss.setString(6,t);
			            ss.setString(7,t);
			            ss.setString(8,t);
			            ss.setString(9,t);
			            ss.setString(10,t);
			            ss.setString(11,t);
			            ss.setString(12,t);
			            ss.setString(13,t);
			           /* ss.setString(14,t);
			            ss.setString(15,t);
			            ss.setString(16,t);*/
			            ResultSet rs= null;
				     //   PreparedStatement ss2=connection.prepareStatement(query);
				        rs = ss.executeQuery();
				        if (!rs.isBeforeFirst() ) {    
				            System.out.println("No data"); 
				            lblNewLabel_571.setVisible(true);
				        } 
				        else
				        {	

				        if (rs.next()) 
				         {
				             
				             // t=rs.getString("name_ow");
				        	lblNewLabel_61.setText(rs.getString("Venue_Name"));
				        	lblNewLabel_61.setFont(new Font("Times New Roman", Font.BOLD, 18));
				        	lblNewLabel_81.setText(rs.getString("Owner"));
				        	lblNewLabel_101.setText(rs.getString("Venue_Address"));
				        	
				         }
				        
				      //  lblNewLabel_57.setText(t);
				        lblNewLabel_41.setVisible(true);
				        lblNewLabel_2.setVisible(true);
						lblNewLabel_61.setVisible(true);
						lblNewLabel_71.setVisible(true);
						lblNewLabel_81.setVisible(true);
						lblNewLabel_91.setVisible(true);
						lblNewLabel_101.setVisible(true);

				        }
				        
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}    
				if(rdbtnNewRadioButton_2.isSelected())
				{    
					g="Anthro";   
					choiceSelected=true;
					try {
						PreparedStatement ss=connection.prepareStatement("select * from anthro where venue_nam=? OR founder=? OR venue_addr=? OR founded_in=? OR city_vill=? OR state=? OR history_p_info=? OR ancient_p_info=? OR religious_p_info=?");
						ss.setString(1,t);
			            ss.setString(2,t);
			            ss.setString(3,t);
			            ss.setString(4,t);
			            ss.setString(5,t);
			            ss.setString(6,t);
			            ss.setString(7,t);
			            ss.setString(8,t);
			            ss.setString(9,t);
			            /*ss.setString(10,t);
			            ss.setString(11,t);
			            ss.setString(12,t);
			            ss.setString(13,t);
			            ss.setString(14,t);
			            ss.setString(15,t);
			            ss.setString(16,t);*/
			            ResultSet rs= null;
				     //   PreparedStatement ss2=connection.prepareStatement(query);
				        rs = ss.executeQuery();
				        if (!rs.isBeforeFirst() ) {    
				            System.out.println("No data"); 
				            lblNewLabel_571.setVisible(true);
				        } 
				        else
				        {	

				        if (rs.next()) 
				         {
				             
				             // t=rs.getString("name_ow");
				        	lblNewLabel_61.setText(rs.getString("founder"));
				        	lblNewLabel_61.setFont(new Font("Times New Roman", Font.BOLD, 18));
				        	lblNewLabel_81.setText(rs.getString("venue_nam"));
				        	lblNewLabel_101.setText(rs.getString("venue_addr"));
				        	lblNewLabel_41.setText("Founder");
				        	
				         }
				        
				      //  lblNewLabel_57.setText(t);
				        lblNewLabel_41.setVisible(true);
				        lblNewLabel_2.setVisible(true);
						lblNewLabel_61.setVisible(true);
						lblNewLabel_71.setVisible(true);
						lblNewLabel_81.setVisible(true);
						lblNewLabel_91.setVisible(true);
						lblNewLabel_101.setVisible(true);

				        }
				        
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					
				} 
				
		/*	 if(!g.equals("Anthro")&&!g.equals("Venue")&&!g.equals("property"));
				{
					System.out.println(g);
					lblNewLabel_57.setVisible(true); 
					//r=0;
				}*/
				
				//if(!g.equalsIgnoreCase("Anthro") && !g.equalsIgnoreCase("vennue")&& !g.equalsIgnoreCase("property"));
				if(!choiceSelected)
				{
					System.out.println(g);
					lblNewLabel_57.setVisible(true); 
					//r=0;
				}
				
				
				
					
				
			}
		});

		
		JLabel lblNewLabel_21 = new JLabel("");
		lblNewLabel_21.setIcon(new ImageIcon(info_search.class.getResource("/IMAGE/PicsArt_05-18-10.06.37.jpg")));
		lblNewLabel_21.setBounds(0, 10, 1280, 918);
		frmInformationSearch.getContentPane().add(lblNewLabel_21);
		
		JButton btnNewButton_1 = new JButton("SEARCH RESULTS");
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.setFont(new Font("Viner Hand ITC", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_1.setBackground(Color.CYAN);
		btnNewButton_1.setBounds(335, 253, 246, 69);
		frmInformationSearch.getContentPane().add(btnNewButton_1);
	}
}
