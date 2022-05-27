package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ViewMoney extends JFrame{
	public ViewMoney(String title) {
		super(title);
		String column[] = {"Kind", "Classification", "Name", "Amount"};
		String content[][] = {
				{"CheckingAccount", "add", "allowance", "100000"},
				{"Loan", "loan", "friendLoan", "30000"},
				{"SavingMoney", "deposit", "save", "200000"},
				{"CheckingAccount", "add", "sell", "14000"},
				{"CheckingAccount", "spend", "dinner", "7000"},
				{"SavingMoney", "deposit", "save", "200000"}
		};
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Kind");
		model.addColumn("Classification");
		model.addColumn("Name");
		model.addColumn("Amount");
		
		JTable table = new JTable(content, column);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
