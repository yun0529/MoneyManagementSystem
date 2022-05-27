package ClassProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class MenuManager{
	//static EventLogger Logger = new EventLogger("log.txt");
	static LogManager lgmngr = LogManager.getLogManager();
	static Logger log = lgmngr.getLogger(Logger.GLOBAL_LOGGER_NAME);
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		MoneyManager moneyManager = getObject("moneyManager.ser");
		if(moneyManager == null) {
			moneyManager = new MoneyManager(sc);
		}
			//new MoneyManager(sc);
		
		selectMenu(sc, moneyManager);
		putObject(moneyManager,"moneyManager.ser");
		
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
					log.log(Level.INFO, "add a money");
					break;
				case 2:
					moneyManager.deleteMoney();
					log.log(Level.INFO, "delet a money");
					break;
				case 3:
					moneyManager.editMoney();
					log.log(Level.INFO, "edit a money");
					break;
				case 4:
					moneyManager.viewMoneys();
					log.log(Level.INFO, "view a list of money");
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
	public static MoneyManager getObject(String fileName) {
		MoneyManager moneyManager = null;
		try {
			FileInputStream file = new FileInputStream(fileName);
			ObjectInputStream obj = new ObjectInputStream(file);
			
			moneyManager = (MoneyManager)obj.readObject();
			
			obj.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			return moneyManager;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return moneyManager;
	}
	public static void putObject(MoneyManager moneyManager, String fileName) {
		try {
			FileOutputStream file = new FileOutputStream(fileName);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(moneyManager);
			
			out.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
