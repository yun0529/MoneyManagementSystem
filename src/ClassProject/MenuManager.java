package ClassProject;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MoneyManager moneyManager = new MoneyManager(sc);
		
		selectMenu(sc, moneyManager);
		
	}
	
	public static void selectMenu(Scanner sc, MoneyManager moneyManager) {
		int num = -1;
		Scanner sc2 = new Scanner(System.in);
		while(num != 5) {
			showMenu();
			try{
				num = sc2.nextInt();
				switch (num) {
				case 1:
					moneyManager.addMoney();
					break;
				case 2:
					moneyManager.deleteMoney();
					break;
				case 3:
					moneyManager.editMoney();
					break;
				case 4:
					moneyManager.viewMoneys();
					break;
				default:
					break;
						
				}
			} catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if(sc.hasNext()) {
					sc.next();
				}
				num = -1;
			}
		}
	}
	public static void showMenu() {
		System.out.println("*** Money Management System Menu ***");
		System.out.println("1. Add Money");
		System.out.println("2. Delete Money");
		System.out.println("3. Edit Money");
		System.out.println("4. View Moneys");
		System.out.println("5. Exit");
		System.out.print("Select one number between 1 - 5 : ");
	}
}
