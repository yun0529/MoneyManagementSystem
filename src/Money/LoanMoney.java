package Money;

import java.util.Scanner;

public class LoanMoney extends Money implements MoneyInput{
	public boolean getKindInput(Scanner sc) {
		super.setKind(MoneyKind.Loan);
		sc.nextLine();
		setMoneyClassification(sc);
		
		char answer = 'x';
		while(answer != 'y' || answer != 'Y' || answer != 'n' || answer != 'N') {
			System.out.print("Would you like to Loan (y / n) : ");
			//sc.nextLine();
			answer = sc.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				System.out.print("Money Name : ");
				sc.nextLine();
				moneyName = sc.nextLine();
				
				super.setMoneyAmount(sc);
				break;
			}
			else if(answer == 'n' || answer == 'N'){
				break;
			}
			else {
				continue;
			}
		}
		if(answer == 'Y' || answer == 'y') {
			return true;
		}else {
			return false;
		}
		
	}
}