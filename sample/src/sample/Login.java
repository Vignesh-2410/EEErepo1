package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame frame;
	private JTextField tb1;
	private JPasswordField p1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	/**
	 * 
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.YELLOW);
		frame.getContentPane().setForeground(Color.MAGENTA);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("User Id");
		lblNewLabel_1.setForeground(Color.MAGENTA);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_1.setBounds(110, 89, 98, 23);
		frame.getContentPane().add(lblNewLabel_1);
		
		tb1 = new JTextField();
		tb1.setBounds(229, 92, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JButton btnNewButton = new JButton("Proceed");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tb1.getText();
				String password=p1.getText();
				if(name.equals("vignesh") && password.equals("1234"))
				{
					JOptionPane.showMessageDialog(btnNewButton, "Welcome Vignesh" );
					Bookcart window = new Bookcart();
					Bookcart.setVisible(true);
				}
				else
					JOptionPane.showMessageDialog(btnNewButton, "Invalid User");
			}
		});
		btnNewButton.setBackground(SystemColor.textHighlight);
		btnNewButton.setForeground(SystemColor.window);
		btnNewButton.setBounds(172, 198, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1_1 = new JLabel("User Login");
		lblNewLabel_1_1.setForeground(Color.RED);
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 23));
		lblNewLabel_1_1.setBounds(159, 27, 117, 27);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Password");
		lblNewLabel_1_2.setForeground(Color.BLUE);
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_1_2.setBounds(96, 138, 98, 23);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		p1 = new JPasswordField();
		p1.setBounds(229, 141, 86, 20);
		frame.getContentPane().add(p1);
	}
}
