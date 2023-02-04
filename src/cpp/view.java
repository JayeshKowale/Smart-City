package cpp;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class view {

	 JFrame frmInformationSearch;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					view window = new view();
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
	public view() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmInformationSearch = new JFrame();
		frmInformationSearch.setForeground(Color.BLACK);
		frmInformationSearch.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		frmInformationSearch.setTitle("SEARCH HERE !!");
		frmInformationSearch.setBounds(100, 100, 1251, 759);
		frmInformationSearch.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmInformationSearch.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmInformationSearch.setVisible(false);
			Dashboard d = new Dashboard();
			d.frmSmartcityDashboard.setVisible(true);
			
			}
		});
		btnNewButton.setForeground(new Color(204, 0, 51));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton.setBounds(288, 614, 89, 23);
		frmInformationSearch.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("SELECT YOUR CHOICE :");
		lblNewLabel_1.setForeground(new Color(255, 255, 153));
		lblNewLabel_1.setFont(new Font("Lucida Calligraphy", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel_1.setBounds(351, 72, 586, 48);
		frmInformationSearch.getContentPane().add(lblNewLabel_1);
		
		JButton rdbtnNewRadioButton = new JButton("PROPERTY TRACKING");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmInformationSearch.setVisible(false);
				prop_track pt= new prop_track();
				pt.frmPropertyTracking.setVisible(true);
			}
		});
		rdbtnNewRadioButton.setForeground(new Color(255, 204, 0));
		rdbtnNewRadioButton.setBackground(new Color(255, 255, 255));
		rdbtnNewRadioButton.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 35));
		rdbtnNewRadioButton.setBounds(89, 205, 435, 87);
		frmInformationSearch.getContentPane().add(rdbtnNewRadioButton);
		
		JButton rdbtnNewRadioButton_1 = new JButton("PRESERVERANCE");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				frmInformationSearch.setVisible(false);
				Preservarancescr1 p=new Preservarancescr1();
				p.frmPreservarance.setVisible(true);
			}
		});
		rdbtnNewRadioButton_1.setForeground(new Color(255, 204, 51));
		rdbtnNewRadioButton_1.setBackground(new Color(255, 255, 255));
		rdbtnNewRadioButton_1.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 35));
		rdbtnNewRadioButton_1.setBounds(334, 322, 425, 69);
		frmInformationSearch.getContentPane().add(rdbtnNewRadioButton_1);
		
		JButton rdbtnNewRadioButton_2 = new JButton("INFORMATION SEARCH");
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmInformationSearch.setVisible(false);
				info_search in =new info_search();
				in.frmInformationSearch.setVisible(true);
				
			}
		});
		rdbtnNewRadioButton_2.setForeground(new Color(255, 204, 102));
		rdbtnNewRadioButton_2.setBackground(new Color(255, 255, 255));
		rdbtnNewRadioButton_2.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 35));
		rdbtnNewRadioButton_2.setBounds(622, 428, 488, 69);
		frmInformationSearch.getContentPane().add(rdbtnNewRadioButton_2);
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(view.class.getResource("/Image/future_of_cities-1200x1200.jpg")));
		lblNewLabel_2.setBounds(-14, -59, 1279, 1024);
		frmInformationSearch.getContentPane().add(lblNewLabel_2);
	}
}
