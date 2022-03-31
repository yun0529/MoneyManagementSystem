package ClassProject;

import java.util.Scanner;

public class MoneyManager {
	Money money = new Money(null, 0, null, 0);
	Scanner sc;
	public MoneyManager(Scanner sc) {
		this.sc = sc;
	}
	
	public void addMoney() {
		if (money.spendName == null) {
			String moneyName;
			System.out.print("Money Name : ");
			sc.nextLine();
			moneyName = sc.nextLine();
			
			System.out.print("Amount : ");
			int addAmount = sc.nextInt();
			money = new Money(moneyName, addAmount, null, 0);
		}else {
			String moneyName;
			System.out.print("Money Name : ");
			sc.nextLine();
			moneyName = sc.nextLine();
			
			System.out.print("Amount : ");
			int addAmount = sc.nextInt();
			money = new Money(moneyName, addAmount, money.spendName, money.spendAmount);
		}
		
	}

	public void spendMoney() {
		if(money.moneyName == null) {
			System.out.print("Spend Name : ");
			sc.nextLine();
			String spendName = sc.nextLine();
			System.out.print("Amount( ex) -4000 ) : ");
			int spendAmount = sc.nextInt();
			money = new Money(null, 0, spendName, spendAmount);
		}else {
			System.out.print("Spend Name : ");
			sc.nextLine();
			String spendName = sc.nextLine();
			System.out.print("Amount( ex) -4000 ) : ");
			int spendAmount = sc.nextInt();
			money = new Money(money.moneyName, money.amount, spendName, spendAmount);
		}
	}
	public void editMoney() {
		String deleteName;
		int editAmount;
		String editName;
		System.out.print("Delete or Edit : ");
		String select = sc.next();
		sc.nextLine();
		switch(select) {
		case "Delete":
			System.out.print("Delete Money Name : ");
			deleteName = sc.nextLine();
			if(money == null) {
				System.out.println("the money has not been registered");
				return;
			}
			if(deleteName.equals(money.moneyName)) {
				money.moneyName = null;
				money.amount = 0;
				System.out.println("the money is deleted");
			}else if(deleteName.equals(money.spendName)) {
				money.spendName = null;
				money.spendAmount = 0;
				System.out.println("the spendMoney is deleted");
			}
			break;
		case "delete":
			System.out.print("Delete Money Name : ");
			deleteName = sc.nextLine();
			if(money == null) {
				System.out.println("the money has not been registered");
				return;
			}
			if(deleteName.equals(money.moneyName)) {
				money.moneyName = null;
				money.amount = 0;
				System.out.println("the money is deleted");
			}else if(deleteName.equals(money.spendName)) {
				money.spendName = null;
				money.spendAmount = 0;
				System.out.println("the spendMoney is deleted");
			}
			break;
		case "edit":
			System.out.print("Edit Money Name : ");
			editName = sc.nextLine();
			if(money == null) {
				System.out.println("the money has not been registered");
				return;
			}
			if(editName.equals(money.moneyName)) {
				System.out.print("input edit amount : ");
				money.amount = sc.nextInt();
				System.out.println("The amount to be edited is : " + money.amount);
			}else if(editName.equals(money.spendName)) {
				System.out.print("input edit spendAmount : ");
				money.spendAmount = sc.nextInt();
				System.out.println("The spendAmount to be edited is : " + money.spendAmount);
			}
			break;
		case "Edit":
			System.out.print("Edit Money Name : ");
			editName = sc.nextLine();
			if(money == null) {
				System.out.println("the money has not been registered");
				return;
			}
			if(editName.equals(money.moneyName)) {
				System.out.print("input edit amount : ");
				money.amount = sc.nextInt();
				System.out.println("The amount to be edited is : " + money.amount);
			}else if(editName.equals(money.spendName)) {
				System.out.print("input edit spendAmount : ");
				money.spendAmount = sc.nextInt();
				System.out.println("The spendAmount to be edited is : " + money.spendAmount);
			}
			break;
		}
	}
	public void viewMoney() {
		money.printLog();
	}
}
