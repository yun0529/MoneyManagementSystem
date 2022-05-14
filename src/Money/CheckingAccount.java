package Money;

import java.util.Scanner;

public class CheckingAccount extends Money implements MoneyInput{
	public boolean getKindInput(Scanner sc) {
		sc.nextLine();
		setMoneyClassification(sc);
		
		System.out.print("Money Name : ");
		sc.nextLine();
		moneyName = sc.nextLine();
		
		super.setMoneyAmount(sc);
		return true;
	}
}
