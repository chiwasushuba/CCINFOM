package dbApp;

import javax.swing.table.DefaultTableModel;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class ViewCandidate {

	private JFrame frame;
	private JTable table;
	private DefaultTableModel tableModel;
	private JTextField textField;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewCandidate window = new ViewCandidate();
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
	public ViewCandidate() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	    frame = new JFrame();
	    frame.setBounds(100, 100, 1000, 580);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.getContentPane().setLayout(null);
	    
	    String[] columnNames = {"candidate_info", "election_id", "candidate_position", "candidate_status"};
	    
	    // Create the table model
	    tableModel = new DefaultTableModel(columnNames, 0);
	    
	    // Create and configure the scroll pane
	    JScrollPane scrollPane = new JScrollPane();
	    scrollPane.setBounds(428, 58, 549, 463);
	    frame.getContentPane().add(scrollPane);
	    
	    // Create the table and set the model
	    table = new JTable(tableModel);
	    scrollPane.setViewportView(table);
	    table.setCellSelectionEnabled(true);
	    table.setColumnSelectionAllowed(true);
	    
	    // Add a label for the title
	    JLabel lblNewLabel = new JLabel("Candidates Management System");
	    lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    lblNewLabel.setBounds(608, 20, 239, 20);
	    frame.getContentPane().add(lblNewLabel);
	    
	    // Add buttons
	    JButton backButton = new JButton("Back");
	    backButton.setBounds(25, 496, 85, 21);
	    frame.getContentPane().add(backButton);
	    
	    JButton btnDelete = new JButton("Delete");
	    btnDelete.setBounds(327, 385, 85, 30);
	    frame.getContentPane().add(btnDelete);
	    
	    JButton btnUpdate = new JButton("Update");
	    btnUpdate.setBounds(327, 332, 85, 30);
	    frame.getContentPane().add(btnUpdate);
	    
	    JButton btnInsert = new JButton("Insert");
	    btnInsert.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            // Insert new data into the table (example)
	        	if(textField1) {
	        		
	        	} else {
	        		tableModel.addRow(new Object[]{textField.getText(), textField1.getText(), textField2.getText(), textField3.getText()});
	        		textField.setText(null);
	        		textField1.setText(null);
	        		textField2.setText(null);
	        		textField3.setText(null);
	        	}
	           
	            // ADD CODE FOR SQL TO INSERT THIS DATA TO THE DATABASE
	        }
	    });
	    btnInsert.setBounds(327, 274, 85, 30);
	    frame.getContentPane().add(btnInsert);
	    
	    // Add labels (if needed)
	    JLabel lblNewLabel_1 = new JLabel("candidate_info");
	    lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    lblNewLabel_1.setBounds(43, 53, 105, 20);
	    frame.getContentPane().add(lblNewLabel_1);
	    
	    JLabel lblNewLabel_2 = new JLabel("election_id");
	    lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    lblNewLabel_2.setBounds(43, 105, 96, 25);
	    frame.getContentPane().add(lblNewLabel_2);
	    
	    JLabel lblNewLabel_3 = new JLabel("candidate_position");
	    lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    lblNewLabel_3.setBounds(43, 165, 134, 20);
	    frame.getContentPane().add(lblNewLabel_3);
	    
	    JLabel lblNewLabel_4 = new JLabel("candidate_status");
	    lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    lblNewLabel_4.setBounds(43, 226, 122, 20);
	    frame.getContentPane().add(lblNewLabel_4);
	    
	    textField = new JTextField();
	    textField.setBounds(185, 53, 227, 21);
	    frame.getContentPane().add(textField);
	    textField.setColumns(10);
	    
	    textField1 = new JTextField();
	    textField1.setColumns(10);
	    textField1.setBounds(185, 105, 227, 21);
	    frame.getContentPane().add(textField1);
	    
	    textField2 = new JTextField();
	    textField2.setColumns(10);
	    textField2.setBounds(185, 165, 227, 21);
	    frame.getContentPane().add(textField2);
	    
	    textField3 = new JTextField();
	    textField3.setColumns(10);
	    textField3.setBounds(185, 225, 227, 21);
	    frame.getContentPane().add(textField3);
	    
	    // Populate the table with sample data
	    tableModel.addRow(new Object[]{"1", "Alice", "25", "HR"});
	    tableModel.addRow(new Object[]{"2", "Bob", "30", "Finance"});
	    tableModel.addRow(new Object[]{"3", "Charlie", "28", "IT"});
	    tableModel.addRow(new Object[]{"4", "Diana", "35", "Marketing"});
	}
}
