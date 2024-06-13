package db_operations;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class dbms {

	private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;
	private JTextField tb3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dbms window = new dbms();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public dbms() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 271, 306);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Registration ");
		lblNewLabel.setBounds(24, 10, 213, 27);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 23));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setBounds(49, 48, 46, 14);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Roll No");
		lblNewLabel_2.setBounds(39, 88, 46, 14);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Branch");
		lblNewLabel_3.setBounds(39, 133, 46, 14);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Marks");
		lblNewLabel_4.setBounds(39, 184, 46, 14);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		frame.getContentPane().add(lblNewLabel_4);
		
		tb1 = new JTextField();
		tb1.setBounds(128, 49, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		tb2 = new JTextField();
		tb2.setBounds(128, 86, 86, 20);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setBounds(128, 130, 86, 22);
		cb1.setModel(new DefaultComboBoxModel(new String[] {"Select", "CE", "CSE", "CSE-AIML", "CSE-DS", "EEE", "ECE", "MECH", "MIN", "CSE-IOT"}));
		frame.getContentPane().add(cb1);
		
		tb3 = new JTextField();
		tb3.setBounds(128, 182, 86, 20);
		frame.getContentPane().add(tb3);
		tb3.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBounds(87, 221, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String rno=tb2.getText();
				int rollno=Integer.parseInt(rno);
				String name=tb1.getText();
				String branch=(String) cb1.getSelectedItem();
				String m=tb3.getText();
				int marks=Integer.parseInt(m);
				try
				{
					Connection con=DriverManager.getConnection
							("jdbc:mysql://localhost:3306/mydb","root","mrec");
					String q="insert into student values('"+name+"','"+rollno+"','"+branch+"','"+marks+"')";
					Statement stn=con.createStatement();
					stn.executeUpdate(q);
					con.close();
					JOptionPane.showMessageDialog(btnNewButton,"Inserted Successfully" );
				}
				catch(SQLException e1)
				{
					e1.printStackTrace();
				}
				}
		});
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(22, 11, 242, 249);
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\online lab\\Downloads\\luxa.org-opacity-changed-download-removebg-preview.png"));
		frame.getContentPane().add(lblNewLabel_5);
	}
}
