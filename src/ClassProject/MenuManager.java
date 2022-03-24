package ClassProject;

import java.util.Scanner;

public class MenuManager {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int num = 5;
		
		while(num != 6) {
			System.out.println("*** Money Management System Menu ***");
			System.out.println("1. Pocket Money");
			System.out.println("2. Spending");
			System.out.println("3. Edit Money");
			System.out.println("4. View Money");
			System.out.println("5. Show a menu");
			System.out.println("6. Exit");
			System.out.print("Select one number between 1 - 6 : ");
			num = sc.nextInt();
			switch (num) {
			case 1:
				addMoney();
				break;
			case 2:
				spendMoney();
				break;
			case 3:
				editMoney();
				break;
			case 4:
				viewMoney();
				break;
			default:
				break;
				
					
			}
		}
	}
	public static void addMoney() {
		String moneyName;
		System.out.print("Money Name : ");
		moneyName = sc.nextLine();
		sc.nextLine();
		System.out.print("Amount : ");
		int addAmount = sc.nextInt();
	}
	public static void spendMoney() {
		System.out.print("Spend Name : ");
		String spendName = sc.nextLine();
		sc.nextLine();
		System.out.print("Amount : ");
		int spendAmount = sc.nextInt();
	}
	public static void editMoney() {
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
			break;
		case "delete":
			System.out.print("Delete Money Name : ");
			deleteName = sc.nextLine();
			break;
		case "edit":
			System.out.print("Edit Money Name : ");
			editName = sc.nextLine();
			System.out.print("Amount : ");
			editAmount = sc.nextInt();
			break;
		case "Edit":
			System.out.print("Edit Money Name : ");
			editName = sc.nextLine();
			System.out.print("Amount : ");
			editAmount = sc.nextInt();
			break;
		}
	}
	public static void viewMoney() {
		System.out.println("Management Log");
	}
}
