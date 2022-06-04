package Money;

import java.util.Scanner;

public class CheckingAccount extends Money implements MoneyInput{
	public CheckingAccount() {
		super.setKind(MoneyKind.Checking_Account);
	}
	public boolean getKindInput(Scanner sc) {
		super.setKind(MoneyKind.Checking_Account);
		sc.nextLine();
		setMoneyClassification(sc);
		
		System.out.print("Money Name : ");
		sc.nextLine();
		moneyName = sc.nextLine();
		
		super.setMoneyAmount(sc);
		return true;
	}

	@Override
	public void setKind(String kind) {
		// TODO Auto-generated method stub
		
	}
}
