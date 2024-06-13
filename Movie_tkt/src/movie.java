import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class movie {

	protected static final int YES_OPTION = 0;
	private JFrame frame;
	private JTextField tb1;
	private JLabel png;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					movie window = new movie();
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
	public movie() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 442, 310);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MOVIE TICKET BOOKING");
		lblNewLabel.setForeground(new Color(75, 0, 130));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel.setBounds(69, 11, 319, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setForeground(new Color(0, 128, 128));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_1.setBounds(129, 68, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Movie");
		lblNewLabel_2.setForeground(new Color(255, 0, 255));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_2.setBounds(125, 113, 65, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"Select", "KALKI2898AD", "SALAAR", "RRR", "BAAHUBALI"}));
		cb1.setBounds(244, 111, 87, 22);
		frame.getContentPane().add(cb1);
		
		JLabel lblNewLabel_4 = new JLabel("No of Tkts");
		lblNewLabel_4.setForeground(new Color(0, 0, 255));
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_4.setBounds(103, 158, 87, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"Select", "1", "2", "3", "4"}));
		cb2.setBounds(244, 156, 89, 22);
		frame.getContentPane().add(cb2);
		
		JButton btnNewButton = new JButton("BOOK TICKETS");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String name =tb1.getText();
			String movie=(String) cb1.getSelectedItem();
			String tickets=(String) cb2.getSelectedItem();
			int nt=Integer.parseInt(tickets);
			int bill=0;
			if(movie.equals("KALKI2898AD"))
			{
				bill=bill+nt*250;
			}
			if(movie.equals("SALAAR"))
			{
				bill=bill+nt*150;
			}
			if(movie.equals("RRR"))
			{
				bill=bill+nt*170;
			}
			if(movie.equals("BAAHUBALI"))
			{
				bill=bill+nt*100;
			}
			int res=0;
			res=JOptionPane.showConfirmDialog(btnNewButton, " Name:"+name+"\n Movie:"+movie+"\n No of Tkts:"+tickets+"\n Amount :"+bill);
			if(res==YES_OPTION)
			{
				JOptionPane.showMessageDialog(btnNewButton, "Tickets Confirmed");
			}
			else
			{
				JOptionPane.showMessageDialog(btnNewButton, "Tickets Cancelled");
			}
			}
		});
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(164, 212, 126, 23);
		frame.getContentPane().add(btnNewButton);
		
		tb1 = new JTextField();
		tb1.setBounds(244, 67, 87, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		png = new JLabel("");
		png.setIcon(new ImageIcon("C:\\Users\\online lab\\Desktop\\New folder\\movieee.jpg"));
		png.setBounds(0, 0, 434, 276);
		frame.getContentPane().add(png);
	}
	public JLabel getLblNewLabel_3() {
		return png;
	}
}
