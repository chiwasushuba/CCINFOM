package dbApp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Main {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
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
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 1000, 580);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton button2 = new JButton("Voting Management");
		button2.setBounds(392, 248, 200, 30);
		frame.getContentPane().add(button2);
		
		JButton button1 = new JButton("Candidate Management");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button1.setBounds(392, 157, 200, 30);
		frame.getContentPane().add(button1);
		
		JButton button3 = new JButton("Disqualification Management");
		button3.setBounds(392, 352, 200, 30);
		frame.getContentPane().add(button3);
		
		JButton button4 = new JButton("Winning Candidate  Management");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button4.setBounds(392, 452, 200, 30);
		frame.getContentPane().add(button4);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(0, 0, 986, 138);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel titleLabel = new JLabel("Election Management App");
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(titleLabel);
		titleLabel.setFont(new Font("Sylfaen", Font.PLAIN, 30));
	}
}
