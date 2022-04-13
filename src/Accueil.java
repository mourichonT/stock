import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRootPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

import tools.Article;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyVetoException;
import java.util.ArrayList;

import javax.swing.JDesktopPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Accueil {

	public JFrame frame;
	private JDesktopPane desk;
	private JDesktopPane desk_1;
	public Accueil() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1389, 756);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		desk = new JDesktopPane();
		desk.setBounds(285, 49, 1054, 639);
		frame.getContentPane().add(desk);
		desk_1 = new JDesktopPane();
		desk_1.setBounds(29, 344, 203, 344);
		
		JButton Fournisseurs = new JButton("Fournisseurs");
		Fournisseurs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				desk.removeAll();
				desk.repaint();
				providerList pl;
				try {
					pl = new providerList();
					desk.add(pl);
					pl.show();
				} catch (PropertyVetoException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}				
			}
		});
		
		
		frame.getContentPane().add(desk_1);
		Fournisseurs.setFont(new Font("Tahoma", Font.PLAIN, 20));						
		Fournisseurs.setBounds(27, 49, 205, 84);
		frame.getContentPane().add(Fournisseurs);

		JButton Stock = new JButton("Stock");
		Stock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				desk.removeAll();
				desk.repaint();				
				stockStatement ss;
				zoneBoutonStock btn; 
				
				try {
					
					btn = new zoneBoutonStock();
					desk_1.add(btn);
					btn.show();
				} catch (Exception e2) {
					System.err.println("une erreur a ete trouvé dans le trycatch1");
					// TODO: handle exception
				}
				
				try {
					
					ss = new stockStatement();
					desk.add(ss);
					ss.show();
				}catch(Exception e3) {
					System.err.println("une erreur a ete trouvé dans la partie trycatch2 ");
				}
				
				
			}
		});

		Stock.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Stock.setBounds(27, 237, 205, 84);
		frame.getContentPane().add(Stock);

		JButton commande = new JButton("Commandes");
		commande.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				desk.removeAll();
				desk.repaint();
				commande c;
				try {
					c = new commande();
					desk.add(c);
					c.show();
				} catch (Exception e4) {
					// TODO: handle exception
				}

			}
		});
		commande.setFont(new Font("Tahoma", Font.PLAIN, 20));
		commande.setBounds(27, 143, 205, 84);
		frame.getContentPane().add(commande);

		

	}
}
