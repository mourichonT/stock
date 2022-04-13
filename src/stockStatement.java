import java.awt.Component;
import java.awt.SystemColor;
import java.beans.PropertyVetoException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JRootPane;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import bdd.ConnexionBdd;
import tools.AddTools;
import tools.Article;

@SuppressWarnings("serial")
public class stockStatement extends JInternalFrame {
	/**
	 * Create the frame.
	 * @throws PropertyVetoException 
	 * @throws SQLException 
	 * 
	 */
	
	 
	
	public stockStatement() throws SQLException, PropertyVetoException {
		setEnabled(false);
		setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setMaximum(true);
		setBounds(100, 100, 582, 362);
		getContentPane().setLayout(null);
		
		//JLabel lblNewLabel = new JLabel("Gestion de Stock");
		//lblNewLabel.setBounds(10, 10, 558, 30);
		//getContentPane().add(lblNewLabel);
		
		//ConnexionBdd.openConnection();
		ArrayList<Article> article = AddTools.showListTool();
		
		System.out.println("test");	
		
		DefaultTableModel model = new DefaultTableModel();
		Object rowData[] = new Object[5];
		
		for (int i = 0; i < article.size(); i++)
		{
			rowData[0] = article.get(i).getID();
			rowData[1] = article.get(i).getName();
			rowData[2] = article.get(i).getFournisseur();
			rowData[3] = article.get(i).getDateCreation();
			rowData[4] = article.get(i).getType();
			
			model.addRow(rowData);
					}
		
		//TableModel model = Article.showListTool();
		//JTable table = new JTable ();
		//table.add(article);
		
		
		
	
//		table.setBounds(47, 50, 491, 257);
//		
		//getContentPane().add(article);
		
		
		
		removeTitleBar();
	}
	public void removeTitleBar() {
		putClientProperty("stockStatement.isPalette", Boolean.TRUE);
		getRootPane().setWindowDecorationStyle(JRootPane.NONE);
		((BasicInternalFrameUI)this.getUI()).setNorthPane(null);
		this.setBorder(new BevelBorder(BevelBorder.LOWERED, SystemColor.scrollbar, SystemColor.scrollbar, null, null));
		
	}
}
