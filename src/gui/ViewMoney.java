package gui;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import ClassProject.MoneyManager;
import Listener.BackButtonListener;
import Money.Money;
import Money.MoneyInput;
import Money.MoneyKind;

public class ViewMoney extends JPanel{
	WindowFrame frame;
	MoneyManager moneyManager;
	public ViewMoney(WindowFrame frame, MoneyManager moneyManager) {
		this.frame = frame;
		this.moneyManager = moneyManager;
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Kind");
		model.addColumn("Classification");
		model.addColumn("Name");
		model.addColumn("Amount");
		ArrayList<MoneyInput> list = moneyManager.getList();
		for(MoneyInput i : list) {
			Vector row = new Vector();
			//MoneyInput moneyInput = moneyManager.get(i);
			row.add(i.getKind());
			row.add(i.getClassification());
			row.add(i.getMoneyName());
			row.add(i.getAmount());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		JButton backButton = new JButton("back");
		BackButtonListener back = new BackButtonListener(frame);
		
		backButton.addActionListener(back);
		sp.setPreferredSize(new Dimension(280,200));
		this.add(sp);
		this.add(backButton);
	}
}
