package student_form;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class StudentRegistrationForm {

	private JFrame frame;
	private JTextField TB1;
	private JTextField TB2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentRegistrationForm window = new StudentRegistrationForm();
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
	public StudentRegistrationForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(UIManager.getColor("Button.highlight"));
		frame.setBounds(100, 100, 445, 311);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		TB1 = new JTextField();
		TB1.setBounds(266, 50, 86, 20);
		TB1.setColumns(10);
		frame.getContentPane().add(TB1);
		
		TB2 = new JTextField();
		TB2.setBounds(266, 81, 86, 20);
		TB2.setColumns(10);
		frame.getContentPane().add(TB2);
		
		JComboBox CB1 = new JComboBox();
		CB1.setBounds(266, 112, 86, 20);
		CB1.setModel(new DefaultComboBoxModel(new String[] {"Select", "ECE", "EEE", "CSE", "MECH", "MIN", "CIVIL"}));
		frame.getContentPane().add(CB1);
		
		JRadioButton R1 = new JRadioButton("Male");
		R1.setBounds(158, 159, 109, 23);
		R1.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(R1);
		
		JRadioButton R2 = new JRadioButton("Female");
		R2.setBounds(283, 159, 109, 23);
		R2.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(R2);
		
		JCheckBox C1 = new JCheckBox("C");
		C1.setBounds(158, 190, 49, 23);
		C1.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(C1);
		
		JCheckBox C2 = new JCheckBox("Java");
		C2.setBounds(223, 190, 60, 23);
		C2.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(C2);
		
		
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(99, 51, 86, 17);
		lblNewLabel.setForeground(Color.MAGENTA);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Roll No");
		lblNewLabel_1.setBounds(88, 82, 86, 17);
		lblNewLabel_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Branch");
		lblNewLabel_2.setBounds(88, 113, 86, 17);
		lblNewLabel_2.setForeground(new Color(139, 0, 0));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Gender");
		lblNewLabel_3.setBounds(88, 161, 86, 17);
		lblNewLabel_3.setForeground(new Color(75, 0, 130));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Prog. Lang");
		lblNewLabel_4.setBounds(60, 192, 86, 17);
		lblNewLabel_4.setForeground(new Color(34, 139, 34));
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Student Registration Form");
		lblNewLabel_5.setBounds(104, 11, 228, 28);
		lblNewLabel_5.setForeground(Color.RED);
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 20));
		frame.getContentPane().add(lblNewLabel_5);
		
		JCheckBox C3 = new JCheckBox("Python");
		C3.setBounds(295, 190, 97, 23);
		C3.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(C3);
		
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(R1);
		bg.add(R2);
		JButton btnNewButton = new JButton("REGISTER");
		btnNewButton.setBounds(158, 238, 109, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=TB1.getText();
				String rollno=TB2.getText();
				String branch=(String) CB1.getSelectedItem();
				String gender="";
				String langs="";
				if(R1.isSelected())
				{
					gender="Male";
				}
				if(R2.isSelected())
				{
					gender="Female";
				}
				if(C1.isSelected())
				{
					langs=langs+"C";
				}
				if(C2.isSelected())
				{
					langs=langs+"Java";
				}
				if(C3.isSelected())
				{
					langs=langs+"Python";
				}
				
				
       JOptionPane.showMessageDialog(btnNewButton," Name:"+name+"\n RollNo:"+rollno+"\n Branch:"+branch+"\n Gender:"+gender+"\n Prog.Langs:"+langs);
		}
		});
		btnNewButton.setBackground(Color.BLUE);
		btnNewButton.setForeground(Color.WHITE);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\online lab\\Desktop\\Screenshot 2024-06-10 154151.png"));
		lblNewLabel_6.setBounds(130, 29, 170, 212);
		frame.getContentPane().add(lblNewLabel_6);
		
		
	}
	}