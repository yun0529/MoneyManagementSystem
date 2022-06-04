package gui;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import ClassProject.MoneyManager;
import Listener.BackButtonListener;
import Listener.TableEditButtonListener;
import Money.MoneyInput;

public class ViewMoney extends JPanel{
	WindowFrame frame;
	MoneyManager moneyManager;
	JScrollPane sp;
	DefaultTableModel model;
	JTable table;
	public ViewMoney(WindowFrame frame, MoneyManager moneyManager) {
		this.frame = frame;
		this.moneyManager = moneyManager;
		
		model = new DefaultTableModel();
		model.addColumn("Kind");
		model.addColumn("Classification");
		model.addColumn("Name");
		model.addColumn("Amount");
		JButton editButton = new JButton("edit");
		JButton deleteButton = new JButton("delete");
		JButton refreshButton = new JButton("새로고침");
		ArrayList<MoneyInput> list = moneyManager.getList();
		for(int i = 0;i < moneyManager.size();i++) {
			
			Vector row = new Vector();
			MoneyInput moneyInput = moneyManager.get(i);
			row.add(moneyInput.getKind());
			row.add(moneyInput.getClassification());
			row.add(moneyInput.getMoneyName());
			row.add(moneyInput.getAmount());
			model.addRow(row);
		}
		
		table = new JTable(model);
		sp = new JScrollPane(table);
		JButton backButton = new JButton("back");
		BackButtonListener back = new BackButtonListener(frame);
		backButton.addActionListener(back);
		editButton.addActionListener(new TableEditButtonListener(frame,moneyManager,table));
		
		deleteButton.addActionListener(e -> {
			int n = table.getSelectedRow();
			moneyManager.removeArr(n);
			model.removeRow(n);
		});
		refreshButton.addActionListener(e -> {
			DefaultTableModel newModel = new DefaultTableModel();
			ArrayList<MoneyInput> newList = moneyManager.getList();
			model.setNumRows(0);
			for(int i = 0;i < moneyManager.size();i++) {
				Vector newRow = new Vector();
				MoneyInput newMoneyInput = moneyManager.get(i);
				newRow.add(newMoneyInput.getKind());
				newRow.add(newMoneyInput.getClassification());
				newRow.add(newMoneyInput.getMoneyName());
				newRow.add(newMoneyInput.getAmount());
				model.addRow(newRow);
			}
			table = new JTable(model);
			sp = new JScrollPane(table);
			
			frame.setupPanel(this);
			model.fireTableDataChanged();
		});
		sp.setPreferredSize(new Dimension(460,200));
		this.add(sp);
		this.add(editButton);
		this.add(deleteButton);
		this.add(refreshButton);
		this.add(backButton);
	}
	public void testRow() {
		System.out.println("test");
	}
}
