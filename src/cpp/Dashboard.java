package cpp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.UIManager;

public class Dashboard {

	JFrame frmSmartcityDashboard;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard window = new Dashboard();
					window.frmSmartcityDashboard.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Dashboard() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frmSmartcityDashboard = new JFrame("DashBorad");
		frmSmartcityDashboard.setTitle("SmartCity- Dashboard");
		frmSmartcityDashboard.setBounds(0, 0, 1369, 730);
		frmSmartcityDashboard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSmartcityDashboard.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Monitoring ");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				frmSmartcityDashboard.setVisible(false);
				view p = new view();
				p.frmInformationSearch.setVisible(true);
				
			}
		});
		
		JButton btnReportGenrator = new JButton("Report Generator");
		btnReportGenrator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ex ec= new ex();
				ec.frmReportGeneration.setVisible(true);
				frmSmartcityDashboard.setVisible(false);
				
			}
		});
		btnReportGenrator.setForeground(new Color(0, 128, 128));
		btnReportGenrator.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 20));
		btnReportGenrator.setBounds(168, 302, 264, 80);
		frmSmartcityDashboard.getContentPane().add(btnReportGenrator);
		btnNewButton.setForeground(new Color(0, 128, 128));
		btnNewButton.setBounds(168, 451, 264, 63);
		frmSmartcityDashboard.getContentPane().add(btnNewButton);
		
		JLabel Label1 = new JLabel("WELCOME TO SMART CITY MANAGEMENT SYSTEMS");
		Label1.setForeground(new Color(30, 144, 255));
		Label1.setFont(new Font("Sitka Small", Font.BOLD, 22));
		Label1.setBounds(377, 10, 668, 40);
		frmSmartcityDashboard.getContentPane().add(Label1);
		
		JLabel Label2 = new JLabel("PLEASE CHOOSE THE SERVICES FROM THE FOLLOWING LIST -");
		Label2.setForeground(new Color(255, 69, 0));
		Label2.setFont(new Font("Bodoni MT", Font.BOLD | Font.ITALIC, 18));
		Label2.setBounds(454, 135, 640, 29);
		frmSmartcityDashboard.getContentPane().add(Label2);
		
		JButton Buttonnstack = new JButton("Stakeholder Registration");
		Buttonnstack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmSmartcityDashboard.setVisible(false);
				Stack s=new Stack();
				s.frame.setVisible(true);
				
				
				
				
				
			}
		});
		Buttonnstack.setForeground(new Color(0, 128, 128));
		Buttonnstack.setBackground(UIManager.getColor("Button.disabledForeground"));
		Buttonnstack.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 20));
		Buttonnstack.setBounds(476, 164, 264, 80);
		frmSmartcityDashboard.getContentPane().add(Buttonnstack);
		
		JButton ButtonVenue = new JButton("Venue Registration");
		ButtonVenue.setForeground(new Color(0, 128, 128));
		ButtonVenue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmSmartcityDashboard.setVisible(false);
				Venue1 v =new Venue1();
				v.frmVenueRegistration.setVisible(true);
				
				
			}
		});
		ButtonVenue.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 20));
		ButtonVenue.setBounds(819, 164, 264, 80);
		frmSmartcityDashboard.getContentPane().add(ButtonVenue);
		
		JButton Buttonstaff = new JButton("Supporting staff Registration");
		Buttonstaff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmSmartcityDashboard.setVisible(false);
				SupportingStaff s= new SupportingStaff();
				s.frame.setVisible(true);
				
				
				
			}
		});
		Buttonstaff.setForeground(new Color(0, 128, 128));
		Buttonstaff.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 20));
		Buttonstaff.setBounds(476, 302, 264, 80);
		frmSmartcityDashboard.getContentPane().add(Buttonstaff);
		
		JButton ButtonResource = new JButton("Resources Registration");
		ButtonResource.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmSmartcityDashboard.setVisible(false);
				resources1 r = new resources1();
				r.frame.setVisible(true);
			}
		});
		ButtonResource.setForeground(new Color(0, 128, 128));
		ButtonResource.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 20));
		ButtonResource.setBounds(819, 302, 264, 80);
		frmSmartcityDashboard.getContentPane().add(ButtonResource);
		
		JButton Buttonproperty = new JButton("Property Registration");
		Buttonproperty.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmSmartcityDashboard.setVisible(false);
				PropertyReg p = new PropertyReg();
				p.frame.setVisible(true);
			}
		});
		Buttonproperty.setForeground(new Color(0, 128, 128));
		Buttonproperty.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 20));
		Buttonproperty.setBounds(476, 442, 264, 80);
		frmSmartcityDashboard.getContentPane().add(Buttonproperty);
		
		JButton Buttonanthro = new JButton("Anthropologic Inputs");
		Buttonanthro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmSmartcityDashboard.setVisible(false);
				Anthro1 a = new Anthro1();
				a.frmVenueRegistration.setVisible(true);
				
			}
		});
		Buttonanthro.setForeground(new Color(0, 128, 128));
		Buttonanthro.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 20));
		Buttonanthro.setBounds(819, 442, 264, 80);
		frmSmartcityDashboard.getContentPane().add(Buttonanthro);
		
		JButton Buttonback = new JButton("Back to login");
		Buttonback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmSmartcityDashboard.setVisible(false);

				Login1 l = new Login1();
				l.frame.setVisible(true);
				
			}	
		});
		Buttonback.setForeground(new Color(0, 128, 128));
		Buttonback.setFont(new Font("Sitka Subheading", Font.BOLD, 15));
		Buttonback.setBounds(562, 587, 147, 40);
		frmSmartcityDashboard.getContentPane().add(Buttonback);
		
		JButton Buttonhelp = new JButton("Help");
		Buttonhelp.setForeground(new Color(0, 128, 128));
		Buttonhelp.setFont(new Font("Sitka Subheading", Font.BOLD, 15));
		Buttonhelp.setBounds(882, 585, 147, 42);
		frmSmartcityDashboard.getContentPane().add(Buttonhelp);
		
		JLabel Label2_1 = new JLabel("WE PROVIDE FOLLOWING SERVICES :");
		Label2_1.setForeground(new Color(240, 230, 140));
		Label2_1.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 20));
		Label2_1.setBounds(263, 86, 428, 29);
		frmSmartcityDashboard.getContentPane().add(Label2_1);
		
		JLabel lblNewLabel = new JLabel("No more managing mannual records !");
		lblNewLabel.setForeground(new Color(0, 255, 255));
		lblNewLabel.setFont(new Font("Matura MT Script Capitals", Font.PLAIN, 18));
		lblNewLabel.setBounds(581, 44, 357, 29);
		frmSmartcityDashboard.getContentPane().add(lblNewLabel);
		
		JButton Buttonnstack_1 = new JButton("Stakeholder Registration");
		Buttonnstack_1.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 20));
		Buttonnstack_1.setBounds(476, 164, 264, 80);
		frmSmartcityDashboard.getContentPane().add(Buttonnstack_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Dashboard.class.getResource("/Image/IMG-20210426-WA0034.jpg")));
		lblNewLabel_1.setBounds(0, 0, 1355, 683);
		frmSmartcityDashboard.getContentPane().add(lblNewLabel_1);
		
		
	}
}
