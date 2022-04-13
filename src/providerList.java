import java.awt.EventQueue;
import java.beans.PropertyVetoException;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JRootPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.border.BevelBorder;
import java.awt.SystemColor;

public class providerList extends JInternalFrame {


	/**
	 * Create the frame.
	 * @throws PropertyVetoException 
	 */
	public providerList() throws PropertyVetoException {
		setClosable(true);
		setTitle("lists");
		setResizable(true);
		setMaximum(true);
		setIconifiable(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("page1");
		lblNewLabel.setBounds(10, 10, 428, 26);
		getContentPane().add(lblNewLabel);
		removeTitleBar();

	}
	
	public void removeTitleBar() {
		putClientProperty("providerList.isPalette", Boolean.TRUE);
		getRootPane().setWindowDecorationStyle(JRootPane.NONE);
		((BasicInternalFrameUI)this.getUI()).setNorthPane(null);
		this.setBorder(new BevelBorder(BevelBorder.LOWERED, SystemColor.scrollbar, SystemColor.scrollbar, null, null));
		
	}

}
