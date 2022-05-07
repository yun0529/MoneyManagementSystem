package Money;

import java.util.Scanner;

public class LoanMoney extends Money implements MoneyInput{
	public boolean getKindInput(Scanner sc) {
		String classification;
		sc.nextLine();
		System.out.print("input classification (loan) : ");
		classification = sc.next();
		this.classification = classification;
		
		char answer = 'x';
		while(answer != 'y' || answer != 'Y' || answer != 'n' || answer != 'N') {
			System.out.print("Would you like to Loan (y / n) : ");
			//sc.nextLine();
			answer = sc.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				String moneyName;
				System.out.print("Money Name : ");
				sc.nextLine();
				moneyName = sc.nextLine();
				this.moneyName = moneyName;
				
				System.out.print("Amount : ");
				int addAmount = sc.nextInt();
				this.amount = addAmount;
				break;
			}
			else if(answer == 'n' || answer == 'N'){
				break;
			}
			else {
				break;
			}
		}
		if(answer == 'Y' || answer == 'y') {
			return true;
		}else {
			return false;
		}
		
	}
}