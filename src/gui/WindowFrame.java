package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import ClassProject.MenuManager;
import ClassProject.MoneyManager;
import Money.Money;

public class WindowFrame extends JFrame{
	MoneyManager moneyManager;
	MenuManager menuManager;
	MenuSelection menuSelection;
	AddMoney addMoney;
	ViewMoney viewMoney; 
	SelectKindMoney selectKindMoney;
	String kind;
	public WindowFrame(MoneyManager moneyManager,MenuManager menuManager) {
		this.moneyManager = moneyManager;
		menuSelection = new MenuSelection(this,moneyManager,menuManager);
		this.menuManager = menuManager;
		//addMoney = new AddMoney(this, kind);
		viewMoney = new ViewMoney(this, moneyManager);
		selectKindMoney = new SelectKindMoney(this, moneyManager);
		this.setupPanel(menuSelection);
		this.setTitle("MyFrame");
		
		this.setSize(500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuSelection() {
		return menuSelection;
	}

	public void setMenuSelection(MenuSelection menuSelection) {
		this.menuSelection = menuSelection;
	}

	public AddMoney getAddMoney() {
		return new AddMoney(this, moneyManager,kind);
	}

	public void setAddMoney(AddMoney addMoney,String kind, MoneyManager moneyManager) {
		this.addMoney = addMoney;
		this.kind = kind;
		this.moneyManager = moneyManager;
	}

	public ViewMoney getViewMoney() {
		return viewMoney;
	}

	public void setViewMoney(ViewMoney viewMoney) {
		this.viewMoney = viewMoney;
	}
	
	public SelectKindMoney getSelectKindMoney() {
		return selectKindMoney;
	}

	public void setSelectKindMoney(SelectKindMoney selectKindMoney) {
		this.selectKindMoney = selectKindMoney;
	}
}
