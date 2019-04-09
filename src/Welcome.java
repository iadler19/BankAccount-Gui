import java.awt.CardLayout;
import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Welcome extends JPanel {
	
	public Welcome()
	{	
		JLabel welcome = new JLabel("Welcome to Bankaccount System");
		welcome.setBounds(0,0,500,500);
		add(welcome);	
	}
	
	
}
