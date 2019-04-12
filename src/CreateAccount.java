import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CreateAccount extends JPanel {
	
	public CreateAccount(ArrayList<BankAccount> acct)
	{
		
		setLayout(new GridBagLayout());
		
		
		String[] acctopt = { "Checking", "Savings" };
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;		
		JComboBox options = new JComboBox(acctopt);
		add(options, gbc);
		JLabel name = new JLabel("Name:");
		gbc.gridy = 1;
		add(name, gbc);
		JTextField nam = new JTextField("");
		nam.setPreferredSize(new Dimension(70, 30));
		gbc.gridx = 1;
		add(nam,  gbc);
		
		JLabel inital = new JLabel("Inital Balance:");
		gbc.gridy = 2;
		gbc.gridx = 0;
		add(inital, gbc);
		JTextField bal = new JTextField("");
		bal.setPreferredSize(new Dimension(70,30));
		gbc.gridx = 1;
		add(bal, gbc);
		
		JButton confirm = new JButton("Confirm");
		gbc.gridy++;
		add(confirm, gbc);

		setVisible(true);
	
	confirm.addActionListener(new ActionListener()
	{
public void actionPerformed(ActionEvent e)
{
	

	if(options.getSelectedItem() == "Checking")
	{
		CheckingAccount acc = new CheckingAccount(nam.getText(), Integer.parseInt(bal.getText()) , 0, 0, 0);
				acct.add(acc);
				System.out.println(acc.toString());
	}
	else
	{
		SavingsAccount acc1 = new SavingsAccount(nam.getText(), Integer.parseInt(bal.getText()) , 0, 0, 0);
		acct.add(acc1);
	}
	nam.setText("");
	bal.setText("");
	options.setSelectedIndex(0);
}
	});

}
}