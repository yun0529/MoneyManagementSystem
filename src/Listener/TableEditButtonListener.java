package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;

import ClassProject.MoneyManager;
import gui.AddMoney;
import gui.WindowFrame;

public class TableEditButtonListener implements ActionListener {
	WindowFrame frame;
	MoneyManager moneyManager;
	JTable table;
	
	public TableEditButtonListener(WindowFrame frame, MoneyManager moneyManager, JTable table) {
		this.frame = frame;
		this.moneyManager = moneyManager;
		this.table = table;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String kind;
		String classification;
		String moneyName;
		String amount;
		int idx;
		try {
		idx = table.getSelectedRow();
		kind = table.getModel().getValueAt(idx, 0).toString();
		classification = table.getModel().getValueAt(idx, 1).toString();
		moneyName = table.getModel().getValueAt(idx, 2).toString();
		amount = table.getModel().getValueAt(idx, 3).toString();
		
		AddMoney editMoney = new AddMoney(frame,moneyManager,kind,
				classification,moneyName,amount,idx);
		frame.setupPanel(editMoney);
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("수정할 열을 선택해 주세요");
		}
	}

}
