package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

import ClassProject.MoneyManager;
import Exception.ClassificationException;
import Money.CheckingAccount;
import Money.LoanMoney;
import Money.Money;
import Money.MoneyInput;
import Money.SavingMoney;
import gui.MenuSelection;
import gui.WindowFrame;

public class SaveButtonListener implements ActionListener {
	WindowFrame frame;
	MoneyManager moneyManager;
	MoneyInput moneyInput;
	JTextField kind;
	JTextField classification;
	JTextField moneyName;
	JTextField amountText;
	public SaveButtonListener(WindowFrame frame,MoneyManager moneyManager, JTextField kind, JTextField classification,
			JTextField moneyName, JTextField amount){
		this.frame = frame;
		this.moneyManager = moneyManager;
		this.kind = kind;
		this.classification = classification;
		this.moneyName = moneyName;
		this.amountText = amount;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton)e.getSource();
		MenuSelection viewer = frame.getMenuSelection();
		String k = kind.getText();
		String c = classification.getText();
		String m = moneyName.getText();
		String a = amountText.getText();
		
		if(k.equals("Checking Account")) {
			moneyInput = new CheckingAccount();
		}else if(k.equals("Saving Account")) {
			moneyInput = new SavingMoney();
		}else if(k.equals("Loan")) {
			moneyInput = new LoanMoney(); 
		}
		
		moneyInput.setKind(k);
		try {
			moneyInput.setClassification(c);
		} catch (ClassificationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		moneyInput.setMoneyName(m);
		moneyInput.setAmount(Integer.parseInt(a));
		moneyManager.addMoneyList(moneyInput);
		//System.out.println(moneyInput.toString());
		frame.setupPanel(viewer);
	}

}
