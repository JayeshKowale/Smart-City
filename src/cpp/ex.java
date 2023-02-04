package cpp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTable;

import net.proteanit.sql.DbUtils;

import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.util.Date;
//import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.SystemColor;

public class ex
{

	 JFrame frmReportGeneration;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	public static String g,g1,d; 
	public static Date date1;
	public static Date date2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run() {
				try {
					ex window = new ex();
					window.frmReportGeneration.setVisible(true);
				    } catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	Connection con=null;
	public ex() {
		initialize();
		con=DB.dbconnect();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frmReportGeneration = new JFrame();
		frmReportGeneration.setTitle("REPORT GENERATION");
		frmReportGeneration.setBounds(0,0,1500,775);  
		frmReportGeneration.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmReportGeneration.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(57, 228, 1323, 500);
		scrollPane.setVisible(false);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dashboard v=new Dashboard();
				v.frmSmartcityDashboard.setVisible(true);
				frmReportGeneration.setVisible(false);
			}
		});
		btnBack.setForeground(new Color(30, 144, 255));
		btnBack.setFont(new Font("Showcard Gothic", Font.BOLD, 27));
		btnBack.setBounds(396, 166, 300, 41);
		frmReportGeneration.getContentPane().add(btnBack);
		frmReportGeneration.getContentPane().add(scrollPane);
		
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("GENERATE REPORT");
		btnNewButton.setForeground(new Color(30, 144, 255));
		btnNewButton.setFont(new Font("Showcard Gothic", Font.BOLD, 27));
		
		btnNewButton.setBounds(706, 166, 285, 41);
		frmReportGeneration.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("WELCOME TO REPORT GENERATION SECTION");
		lblNewLabel.setForeground(new Color(0, 191, 255));
		lblNewLabel.setFont(new Font("Berlin Sans FB Demi", Font.BOLD | Font.ITALIC, 33));
		lblNewLabel.setBounds(422, 0, 738, 76);
		frmReportGeneration.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("From Date :-");
		lblNewLabel_1.setForeground(SystemColor.controlShadow);
		lblNewLabel_1.setFont(new Font("Lucida Sans", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_1.setBounds(402, 86, 214, 53);
		frmReportGeneration.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setToolTipText("yyyy/mm/dd");
		textField.setFont(new Font("Times New Roman", Font.BOLD, 18));
		textField.setBounds(626, 86, 149, 53);
		frmReportGeneration.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("To Date :-");
		lblNewLabel_1_1.setForeground(SystemColor.textInactiveText);
		lblNewLabel_1_1.setFont(new Font("Lucida Sans", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_1_1.setBounds(805, 86, 198, 41);
		frmReportGeneration.getContentPane().add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setToolTipText("yyyy/mm/dd");
		textField_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		textField_1.setColumns(10);
		textField_1.setBounds(1013, 86, 147, 53);
		frmReportGeneration.getContentPane().add(textField_1);
		
		String s1[] = { "Stack","Venue","Anthro","Resource","Supporting Staff","Property" };
		JComboBox comboBox = new JComboBox(s1);
		comboBox.setBackground(SystemColor.textText);
		comboBox.setForeground(new Color(0, 128, 128));
		comboBox.setToolTipText("Select Section");
		comboBox.setFont(new Font("Times New Roman", Font.BOLD, 24));
		comboBox.setBounds(1040, 157, 214, 53);
		frmReportGeneration.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setIcon(new ImageIcon(ex.class.getResource("/Image/rs1.jpg")));
		lblNewLabel_1_2.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 29));
		lblNewLabel_1_2.setBounds(0, 0, 1543, 1045);
		frmReportGeneration.getContentPane().add(lblNewLabel_1_2);
		
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				try {
					
					
					//Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
				//	Connection con=DriverManager.getConnection("jdbc:ucanaccess://D://Database5.accdb");
				//	Statement st=con.createStatement();
					
					d =comboBox.getSelectedItem().toString();  
					
					g1=textField.getText();
					g=textField_1.getText();
					//g1="2021/06/02";
					//g="2021/06/07";
					try {
						 date1=(Date) new SimpleDateFormat("yyyy/MM/dd").parse(g);
						 date2=(Date) new SimpleDateFormat("yyyy/MM/dd").parse(g1);
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}  
					
					if("Stack".equals(d))
					{
						//System.out.println(d);
						String sql = "Select * FROM stack_reg WHERE Date_Formed BETWEEN  ? AND ? " ;	           
					    PreparedStatement ss=con.prepareStatement(sql);
					   // ss.setDate(1, java.sql.Date.valueOf(g));
					  //  ss.setDate(2, java.sql.Date.valueOf(g1));
					    ss.setDate(1, new java.sql.Date(date2.getTime()));
					    ss.setDate(2, new java.sql.Date(date1.getTime()));
					    ResultSet rs=null;
					    rs=ss.executeQuery();
					    scrollPane.setVisible(true);
					    table.setModel(DbUtils.resultSetToTableModel(rs));
					}

					if("Venue".equals(d))
					{
						//System.out.println(d);
						String sql = "Select * FROM venue WHERE Date_Formed BETWEEN  ? AND ? " ;	           
					    PreparedStatement ss=con.prepareStatement(sql);
					   // ss.setDate(1, java.sql.Date.valueOf(g));
					  //  ss.setDate(2, java.sql.Date.valueOf(g1));
					    ss.setDate(1, new java.sql.Date(date2.getTime()));
					    ss.setDate(2, new java.sql.Date(date1.getTime()));
					    ResultSet rs=null;
					    rs=ss.executeQuery();
					    scrollPane.setVisible(true);
					    table.setModel(DbUtils.resultSetToTableModel(rs));
					}

					if("Anthro".equals(d))
					{
						//System.out.println(d);
						String sql = "Select * FROM anthro WHERE Date_Formed BETWEEN  ? AND ? " ;	           
					    PreparedStatement ss=con.prepareStatement(sql);
					   // ss.setDate(1, java.sql.Date.valueOf(g));
					  //  ss.setDate(2, java.sql.Date.valueOf(g1));
					    ss.setDate(1, new java.sql.Date(date2.getTime()));
					    ss.setDate(2, new java.sql.Date(date1.getTime()));
					    ResultSet rs=null;
					    rs=ss.executeQuery();
					    scrollPane.setVisible(true);
					    table.setModel(DbUtils.resultSetToTableModel(rs));
					}
					

					if("Resource".equals(d))
					{
						//System.out.println(d);
						String sql = "Select * FROM resource WHERE Date_Formed BETWEEN  ? AND ? " ;	           
					    PreparedStatement ss=con.prepareStatement(sql);
					   // ss.setDate(1, java.sql.Date.valueOf(g));
					  //  ss.setDate(2, java.sql.Date.valueOf(g1));
					    ss.setDate(1, new java.sql.Date(date2.getTime()));
					    ss.setDate(2, new java.sql.Date(date1.getTime()));
					    ResultSet rs=null;
					    rs=ss.executeQuery();
					    scrollPane.setVisible(true);
					    table.setModel(DbUtils.resultSetToTableModel(rs));
					}

					if("Supporting Staff".equals(d))
					{
						//System.out.println(d);
						String sql = "Select * FROM supp_staff WHERE Date_Formed BETWEEN  ? AND ? " ;	           
					    PreparedStatement ss=con.prepareStatement(sql);
					   // ss.setDate(1, java.sql.Date.valueOf(g));
					  //  ss.setDate(2, java.sql.Date.valueOf(g1));
					    ss.setDate(1, new java.sql.Date(date2.getTime()));
					    ss.setDate(2, new java.sql.Date(date1.getTime()));
					    ResultSet rs=null;
					    rs=ss.executeQuery();
					    scrollPane.setVisible(true);
					    table.setModel(DbUtils.resultSetToTableModel(rs));
					}

					if("Property".equals(d))
					{
						//System.out.println(d);
						String sql = "Select * FROM prop_reg WHERE Date_Formed BETWEEN  ? AND ? " ;	           
					    PreparedStatement ss=con.prepareStatement(sql);
					   // ss.setDate(1, java.sql.Date.valueOf(g));
					  //  ss.setDate(2, java.sql.Date.valueOf(g1));
					    ss.setDate(1, new java.sql.Date(date2.getTime()));
					    ss.setDate(2, new java.sql.Date(date1.getTime()));
					    ResultSet rs=null;
					    rs=ss.executeQuery();
					    scrollPane.setVisible(true);
					    table.setModel(DbUtils.resultSetToTableModel(rs));
					}

				}
				    catch (SQLException e1) 
					   {
							e1.printStackTrace();
						}



			}
			
			
		});
		
		
	}
}