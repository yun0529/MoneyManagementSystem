package Money;

import java.util.Scanner;

public class CheckingAccount extends Money implements MoneyInput{
	public boolean getKindInput(Scanner sc) {
		String classification;
		sc.nextLine();
		System.out.print("input classification(add / spend) : ");
		classification = sc.next();
		this.classification = classification;
		String moneyName;
		System.out.print("Money Name : ");
		sc.nextLine();
		moneyName = sc.nextLine();
		this.moneyName = moneyName;
		System.out.print("Amount : ");
		int addAmount = sc.nextInt();
		this.amount = addAmount;
		return true;
	}
}
