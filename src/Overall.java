import java.awt.CardLayout;
import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Overall extends JFrame {
	
	
	public Overall() {
		
		ArrayList<BankAccount> accounts = new ArrayList<>();
		CardLayout cl = new CardLayout();
		JPanel overall = new JPanel();
		overall.setLayout(cl);
		
		
JMenuBar menuBar = new JMenuBar();
		
		JMenu  accts = new JMenu("Accounts");
		
		JMenuItem add = new JMenuItem("Add Account");
		accts.add(add);
		JMenuItem remove = new JMenuItem("Remove Account");
		accts.add(remove);
		JMenuItem find = new JMenuItem("Find Account");
		accts.add(find);
		menuBar.add(accts);
JMenu  trans = new JMenu("Transactions");
		
		JMenuItem deposit = new JMenuItem("Deposit");
		trans.add(deposit);
		JMenuItem withdraw = new JMenuItem("Withdraw");
		trans.add(withdraw);
		JMenuItem transfer = new JMenuItem("Transfer");
		trans.add(transfer);
		JMenuItem getBal = new JMenuItem("Get Balance");
		trans.add(getBal);
		
		menuBar.add(trans);
	
		JMenuItem  home = new JMenuItem("Home");
		menuBar.add(home);
		this.setJMenuBar(menuBar);
		
		Welcome welcome = new Welcome();
		RemoveAccount removeacct = new RemoveAccount(accounts);
		CreateAccount create = new CreateAccount(accounts);
		FindAccount findacct = new FindAccount(accounts);
		overall.add(welcome, "Welcome");
		overall.add(create, "Create Account");
		overall.add(removeacct, "Remove Account");
		overall.add(findacct, "Find Account");
		
		add(overall);
		
		cl.show(overall, "Welcome");
		setBounds(0,0,500,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		add.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent e)
			{
				cl.show(overall, "Create Account");
			}
				});
		remove.addActionListener(new ActionListener()
		{
	public void actionPerformed(ActionEvent e)
	{
		cl.show(overall, "Remove Account");
	}
		});
		
		find.addActionListener(new ActionListener()
		{
	public void actionPerformed(ActionEvent e)
	{
		cl.show(overall, "Find Account");
	}
		});

	
	home.addActionListener(new ActionListener()
	{
public void actionPerformed(ActionEvent e)
{
	cl.show(overall, "Welcome");
}
	});
	
	
}
	
	
	public static void main(String[] args)
	{
		new Overall();
	}

}
