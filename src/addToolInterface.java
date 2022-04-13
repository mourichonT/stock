import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Window;

import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JButton;
import com.toedter.calendar.JDateChooser;

import bdd.ConnexionBdd;
import tools.AddTools;
import tools.Article;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.util.Arrays;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.ActionEvent;

public class addToolInterface extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtFourn;
	private JTextField txtType;

	
	static Connection accessDataBase = null;
	static ResultSet rs =null;
	static PreparedStatement queryAdd = null;
	protected static Object add;
	
	public addToolInterface() {
		setTitle("Frame");
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 426, 41);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ajout d'un ingredient ou d'un ustensile");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel.setBounds(10, 0, 406, 35);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(25, 74, 97, 28);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Fournisseur");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(25, 102, 97, 28);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Type");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1.setBounds(25, 159, 97, 28);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Date de creation");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(25, 131, 97, 28);
		contentPane.add(lblNewLabel_1_2);
		
		
		
		txtName = new JTextField();
		txtName.setBounds(142, 81, 284, 19);
		txtName.setColumns(10);
		contentPane.add(txtName);
		
		
		txtFourn = new JTextField();
		txtFourn.setColumns(10);
		txtFourn.setBounds(142, 109, 284, 19);
		contentPane.add(txtFourn);
		
		
		
		txtType = new JTextField();
		txtType.setColumns(10);
		txtType.setBounds(142, 166, 284, 19);
		contentPane.add(txtType);

		
		JDateChooser dateChooser = new JDateChooser();
		//String date = ("1/12/2000");
		//Date date=(Date)dateChooser.getDate();
 		dateChooser.setBounds(142, 140, 284, 19);
		contentPane.add(dateChooser);
	
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			
			Article tool = new Article(0,txtName.getText(), sdf.format(dateChooser.getDate()), txtType.getText(), txtFourn.getText());
		
			boolean saveOk = false;	
			AddTools oc = new AddTools();
				try {
					saveOk = oc.addNewTool (tool);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
						
				if (!saveOk) {
					contentPane.removeAll();
					
				}	
			
			}
				
				
			});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(154, 232, 85, 21);
		contentPane.add(btnNewButton);
		
	}

}
