package ClassProject;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class MoneyManager {
	Money money = new Money(null, null,0);
	static LinkedList<Money> moneyList = new LinkedList<>();
	Iterator<Money> addItr = moneyList.iterator();
	Scanner sc;
	public MoneyManager(Scanner sc) {
		this.sc = sc;
	}
	
	public void addMoney() {
		String classification;
		sc.nextLine();
		System.out.print("input classification : ");
		classification = sc.next();
		String moneyName;
		System.out.print("Money Name : ");
		sc.nextLine();
		moneyName = sc.nextLine();
		System.out.print("Amount : ");
		int addAmount = sc.nextInt();
		money = new Money(classification ,moneyName, addAmount);
		moneyList.add(money);
	
	}
	//iterator로 확인해서 체크하기
	public void deleteMoney() {
		int count = 0;
		sc.nextLine();
		System.out.print("Delete Money Name : ");
		String deleteName = sc.nextLine();
		if(money == null) {
			System.out.println("the money has not been registered");
			return;
		}
		for(Money j : moneyList) {
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
		if(money == null) {
			System.out.println("the money has not been registered");
			return;
		}
		for(Money j : moneyList) {
			String name = j.getMoneyName();
			if(name.equals(editName)) {
				System.out.print("input edit amount : ");
				editAmount = sc.nextInt();
				moneyList.get(count).amount = editAmount;
				return;
			}
			count++;
		}
		System.out.println("Can't find moneyName");
	}
	public void viewMoney() {
		for(Money i : moneyList) {
			System.out.println(i.toString());
		}
	}
	
}
