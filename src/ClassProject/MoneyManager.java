package ClassProject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import Money.CheckingAccount;
import Money.LoanMoney;
import Money.Money;
import Money.MoneyInput;
import Money.SavingMoney;

public class MoneyManager {
	MoneyInput moneyInput;
	static ArrayList<MoneyInput> moneyList = new ArrayList<>();
	Iterator<MoneyInput> addItr = moneyList.iterator();
	Scanner sc;
	public MoneyManager(Scanner sc) {
		this.sc = sc;
	}
	
	public void addMoney() {
		int kind = 0;
		while(kind != 1 && kind != 2 && kind != 3) {
			System.out.println("1. for Checking_Account");
			System.out.println("2. for Saving_Account");
			System.out.println("3. for Loan");
			System.out.print("Select num for Money Kind between 1 and 3 : ");
			kind = sc.nextInt();
			switch(kind) {
			case 1:
				moneyInput = new CheckingAccount();
				moneyInput.getKindInput(sc);
				moneyList.add(moneyInput);
				break;
			case 2:
				moneyInput = new SavingMoney();
				if(moneyInput.getKindInput(sc) == true) {
					moneyList.add(moneyInput);
				}
				break;
			case 3:
				moneyInput = new LoanMoney();
				if(moneyInput.getKindInput(sc) == true) {
					moneyList.add(moneyInput);
				}
				break;
			default:
				System.out.println("Select num for Student Kind between 1 and 2 : ");
				break;
			}
		}
		
	
	}
	//iterator로 확인해서 체크하기
	public void deleteMoney() {
		int count = 0;
		sc.nextLine();
		System.out.print("Delete Money Name : ");
		String deleteName = sc.nextLine();
		if(moneyInput == null) {
			System.out.println("the money has not been registered");
			return;
		}
		for(MoneyInput j : moneyList) {
			String name = j.getMoneyName();
			if(name.equals(deleteName)) {
				moneyList.remove(count);
				System.out.println("the money is deleted");
				return;
			}
			count++;
		}
		System.out.println("Can't find moneyName");
	}

	public void editMoney() {
		int count = 0;
		int editAmount;
		String editName;
		sc.nextLine();
		System.out.print("Edit Money Name : ");
		editName = sc.nextLine();
		if(moneyInput == null) {
			System.out.println("the money has not been registered");
			return;
		}
		for(MoneyInput j : moneyList) {
			String name = j.getMoneyName();
			if(name.equals(editName)) {
				System.out.print("input edit amount : ");
				editAmount = sc.nextInt();
				moneyList.get(count).setAmount(editAmount);
				return;
			}
			count++;
		}
		System.out.println("Can't find moneyName");
	}
	public void viewMoneys() {
		System.out.println("total count : " + moneyList.size());
		for(MoneyInput i : moneyList) {
			System.out.println(i.toString());
		}
		int totalMoney = 0;
		for(MoneyInput j : moneyList) {
			if(j.getClassification().equals("add")) {
				totalMoney = totalMoney + j.getAmount();
			}
			else if(j.getClassification().equals("spend")) {
				totalMoney = totalMoney - j.getAmount();
			}
			else if(j.getClassification().equals("deposit")){
				totalMoney = totalMoney + j.getAmount();
			}
			else if(j.getClassification().equals("loan")) {
				totalMoney = totalMoney - j.getAmount();
			}
			
		}
		System.out.println("My Total Money : " +  totalMoney);
	}
	
}
