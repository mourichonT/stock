import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import bdd.ConnexionBdd;

import java.awt.BorderLayout;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.JPasswordField;

public class login {

	private JFrame ident;
	private JLabel Password;
	private JTextField Login_textField;
	private JTextField Pwd_textField;
	public static boolean flag =false;

	/**
	 * Launch the application.
	 */

	
	Connection accessDataBase = null;
	ResultSet rs =null;
	PreparedStatement queryConnec = null;
	private JLabel Identitification;
	private JPasswordField passwordField;
	
	/**
	 * Create the application.
	 */
	public login() {
		initialize();
		ident.setVisible(true);
		accessDataBase = ConnexionBdd.openConnection();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ident = new JFrame();
		ident.setAutoRequestFocus(false);
		ident.setBounds(100, 100, 1014, 669);
		ident.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ident.getContentPane().setLayout(null);
		
		JLabel Login = new JLabel("Login");
		Login.setForeground(Color.LIGHT_GRAY);
		Login.setBounds(106, 202, 424, 49);
		Login.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Login.setFocusTraversalKeysEnabled(false);
		ident.getContentPane().add(Login);
		
		Password = new JLabel("Password");
		Password.setForeground(Color.LIGHT_GRAY);
		Password.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Password.setFocusTraversalKeysEnabled(false);
		Password.setBounds(106, 354, 424, 49);
		ident.getContentPane().add(Password);
		
		Login_textField = new JTextField();
		Login_textField.setFont(new Font("Tahoma", Font.ITALIC, 16));
		Login_textField.setPreferredSize(new Dimension(19, 19));
		Login_textField.setBounds(106, 261, 767, 43);
		ident.getContentPane().add(Login_textField);
		Login_textField.setColumns(10);
	
		
		JPasswordField pw = new JPasswordField(20);
		pw.setPreferredSize(new Dimension(19, 19));
		pw.setBounds(106, 422, 767, 43);
		ident.getContentPane().add(pw);
	
		
		
		
		
		JButton Connexion = new JButton("Connexion");
		Connexion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
			String request = "SELECT * FROM users WHERE login =? and password=? ";
			try {
				queryConnec = accessDataBase.prepareStatement(request);
				queryConnec.setString(1, Login_textField.getText());
				queryConnec.setString(2, new String(pw.getPassword()));
				
				
				
				rs = queryConnec.executeQuery();
				
				
				if(rs.next()) {
					System.out.println("Bravo vous etes connecter");
					try {
						Accueil openApp = new Accueil();
						openApp.frame.setVisible(true);
						ident.setVisible(false);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				
				} else {
					
				System.out.println("le mot de passe ou le login ne correspondent pas");	
				}
				
				
				
			}catch(SQLException ex){
				Logger.getLogger(ConnexionBdd.class.getName()).log(Level.SEVERE, null, ex);
			}
			}});
		Connexion.setFont(new Font("Tahoma", Font.PLAIN, 21));
		Connexion.setBounds(351, 516, 315, 56);
		ident.getContentPane().add(Connexion);
		
		Identitification = new JLabel("Identification");
		Identitification.setForeground(Color.GRAY);
		Identitification.setFont(new Font("Impact", Font.PLAIN, 31));
		Identitification.setBackground(Color.WHITE);
		Identitification.setBounds(24, 10, 966, 200);
		ident.getContentPane().add(Identitification);
		
		
	}
}
