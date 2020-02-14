package Login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import Restaurant.Restaurant;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame frame;
	private JTextField text_Id;
	private JPasswordField password;

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
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 200, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SAARR Restaurant");
		lblNewLabel.setForeground(Color.ORANGE);
		lblNewLabel.setBackground(Color.ORANGE);
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 26));
		lblNewLabel.setBounds(143, 11, 207, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblLoginId = new JLabel("Login ID");
		lblLoginId.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblLoginId.setBounds(32, 58, 63, 14);
		frame.getContentPane().add(lblLoginId);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblPassword.setBounds(32, 106, 63, 14);
		frame.getContentPane().add(lblPassword);
		
		text_Id = new JTextField();
		text_Id.setBounds(178, 55, 86, 20);
		frame.getContentPane().add(text_Id);
		text_Id.setColumns(10);
		
		password = new JPasswordField();
		password.setBounds(178, 103, 86, 20);
		frame.getContentPane().add(password);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String pass=password.getText();
				String username=text_Id.getText();
				if(pass.contains("pass123")&& username.contains("admin"))
				{
					text_Id.setText(null);
					password.setText(null);
					Restaurant res=new Restaurant();
					Restaurant.main(null);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Invalid user!");
					text_Id.setText(null);
					password.setText(null);
				}
			}
		});
		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 16));
		btnNewButton.setBounds(32, 186, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				text_Id.setText(null);
				password.setText(null);
			}
		});
		btnReset.setFont(new Font("Calibri", Font.PLAIN, 16));
		btnReset.setBounds(178, 186, 89, 23);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Calibri", Font.PLAIN, 16));
		btnExit.setBounds(329, 186, 89, 23);
		frame.getContentPane().add(btnExit);
	}
}
