package ClassProject;

import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MoneyManager moneyManager = new MoneyManager(sc);
		int num = -1;
		
		while(num != 5) {
			System.out.println("*** Money Management System Menu ***");
			System.out.println("1. Pocket Money");
			System.out.println("2. Spending");
			System.out.println("3. Edit Money");
			System.out.println("4. View Money");
			System.out.println("5. Exit");
			System.out.print("Select one number between 1 - 5 : ");
			num = sc.nextInt();
			switch (num) {
			case 1:
				moneyManager.addMoney();
				break;
			case 2:
				moneyManager.spendMoney();
				break;
			case 3:
				moneyManager.editMoney();
				break;
			case 4:
				moneyManager.viewMoney();
				break;
			default:
				break;
					
			}
		}
	}
	
}
