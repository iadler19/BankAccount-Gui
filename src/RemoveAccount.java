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
public class RemoveAccount extends JPanel {

	
	public RemoveAccount(ArrayList<BankAccount> acct)
	{
		setLayout(new GridBagLayout());

		String[] acctopt = { "Checking", "Savings" };
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;		
		JComboBox options = new JComboBox(acctopt);
		add(options, gbc);
		JLabel name = new JLabel("Account Name:");
		gbc.gridy = 1;
		add(name, gbc);
		JTextField nam = new JTextField("");
		nam.setPreferredSize(new Dimension(70, 30));
		gbc.gridx = 1;
		add(nam, gbc);
		
		JButton confirm = new JButton("Confirm");
		gbc.gridy++;
		add(confirm, gbc);
		JLabel acc = new JLabel("");
		gbc.gridy++;
		add(acc, gbc);

		setVisible(true);
		
		confirm.addActionListener(new ActionListener()
		{
	public void actionPerformed(ActionEvent e)
	{
		
		for(int i = 0; i < acct.size(); i++)
		if(options.getSelectedItem() == "Checking" && nam.getText().equals((acct.get(i)).getName()))
		{
		acc.remove(i);
		}
		nam.setText("");
		options.setSelectedIndex(0);
	}
		});
	}
}
	

