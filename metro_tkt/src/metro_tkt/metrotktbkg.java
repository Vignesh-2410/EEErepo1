package metro_tkt;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class metrotktbkg {


	
	protected static final int YES_OPTION = 0;
	protected static final int NO_OPTION = 0;
	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					metrotktbkg window = new metrotktbkg();
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
	public metrotktbkg() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 287, 308);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Metro Ticket Booking");
		lblNewLabel.setForeground(new Color(220, 20, 60));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 23));
		lblNewLabel.setBounds(29, 11, 220, 33);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setForeground(new Color(128, 0, 128));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_1.setBounds(39, 55, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Source");
		lblNewLabel_2.setForeground(new Color(255, 0, 255));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_2.setBounds(39, 95, 64, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Destination");
		lblNewLabel_3.setForeground(new Color(255, 69, 0));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_3.setBounds(39, 143, 96, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("No of Tkts");
		lblNewLabel_4.setForeground(new Color(0, 128, 0));
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_4.setBounds(39, 189, 83, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		tb1 = new JTextField();
		tb1.setBounds(163, 55, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"Select", "MIYAPUR", "JNTU", "KPHB"}));
		cb1.setBounds(163, 93, 86, 22);
		frame.getContentPane().add(cb1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"Select", "JBS", "MGBS", "AMEERPET", "JNTU", "MIYAPUR"}));
		cb2.setBounds(163, 141, 86, 22);
		frame.getContentPane().add(cb2);
		
		JComboBox cb3 = new JComboBox();
		cb3.setModel(new DefaultComboBoxModel(new String[] {"Select", "1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		cb3.setBounds(163, 187, 86, 22);
		frame.getContentPane().add(cb3);
		
		JButton btnNewButton = new JButton("BOOK TICKETS");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String name=tb1.getText();
			String source=(String) cb1.getSelectedItem();
			String destination= (String)cb2.getSelectedItem();
			String tickets= (String)cb3.getSelectedItem();
			int nt=Integer.parseInt(tickets);
			int bill=0;
			if(source.equals(destination))
			{
				JOptionPane.showMessageDialog(btnNewButton, "Please Check Stations");
			}
			else {
				bill=bill+nt*45;
	            int res=0;
				res=JOptionPane.showConfirmDialog(btnNewButton, " Name:"+name+"\n Source:"+source+"\n Destination:"+destination+"\n No of tkts :"
				+tickets+"\n Amount:"+bill);
	
			    if(res==YES_OPTION)
				{
					JOptionPane.showMessageDialog(btnNewButton, "Tickets Confirmed");
				}
			    else
				{
					JOptionPane.showMessageDialog(btnNewButton, "Tickets Cancelled");
				}
			}
			}
			
			
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(220, 20, 60));
		btnNewButton.setBounds(75, 235, 127, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\online lab\\Downloads\\luxa.org-opacity-changed-Screenshot 2024-06-11 122012.png"));
		lblNewLabel_5.setBounds(10, 11, 292, 263);
		frame.getContentPane().add(lblNewLabel_5);
	}

}
