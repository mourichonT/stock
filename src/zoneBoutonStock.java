import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.sql.Connection;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JRootPane;
import javax.swing.border.BevelBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;

import bdd.ConnexionBdd;

import java.awt.Color;
import java.awt.Rectangle;

public class zoneBoutonStock extends JInternalFrame {
	
	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public zoneBoutonStock() {
		try {
			setMaximum(true);
		} catch (PropertyVetoException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		setBounds(100, 100, 204, 344);

	
	JButton btnNewButton = new JButton("ADD");
	btnNewButton.setBounds(new Rectangle(5, 5, 5, 5));
	btnNewButton.setForeground(Color.WHITE);
	btnNewButton.setBackground(new Color(0, 102, 0));
	btnNewButton.setBorderPainted(false);
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			addToolInterface add = new addToolInterface();
			
			add.setVisible(true);
		}
	});
	getContentPane().setLayout(null);
	btnNewButton.setBounds(24, 48, 147, 42);
	getContentPane().add(btnNewButton);
	
	JButton btnDelete = new JButton("DELETE");
	btnDelete.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			//
		}
	});
	btnDelete.setForeground(Color.WHITE);
	btnDelete.setBounds(new Rectangle(5, 5, 5, 5));
	btnDelete.setBorderPainted(false);
	btnDelete.setBackground(new Color(220, 20, 60));
	btnDelete.setBounds(24, 112, 147, 42);
	getContentPane().add(btnDelete);
	removeTitleBar();
	}
	
	
public void removeTitleBar() {
	putClientProperty("stockStatement.isPalette", Boolean.TRUE);
	getRootPane().setWindowDecorationStyle(JRootPane.NONE);
	((BasicInternalFrameUI)this.getUI()).setNorthPane(null);
	this.setBorder(new BevelBorder(BevelBorder.LOWERED, SystemColor.scrollbar, SystemColor.scrollbar, null, null));
	
}
}