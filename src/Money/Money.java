package Money;

import java.io.Serializable;
import java.util.InputMismatchException;
import java.util.Scanner;

import Exception.ClassificationException;

public abstract class Money implements MoneyInput, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8662641725169276222L;
	
	protected MoneyKind kind;
	protected String classification = null;
	protected String moneyName = null;
	protected int amount = 0;
	
	public Money() {}
	
	public Money(String classification, String moneyName, int amount) {
		this.classification = classification; 
		this.moneyName = moneyName;
		this.amount = amount;
	}
	
	public void setClassification(String classification) throws ClassificationException{
		if(kind.equals(MoneyKind.Checking_Account)) {
			if(classification.equals("add") || classification.equals("spend")) {
				this.classification = classification;
			}
			else {
				throw new ClassificationException();
			}
		}else if(kind.equals(MoneyKind.Saving_Account)) {
			if(!classification.equals("deposit")) {
				throw new ClassificationException();
			}
			this.classification = classification;
		}else if(kind.equals(MoneyKind.Loan)) {
			if(!classification.equals("loan")) {
				throw new ClassificationException();
			}
			this.classification = classification;
		}
	}
	public String getClassification() {
		return classification;
	}
	public String getMoneyName() {
		return moneyName;
	}
	public void setMoneyName(String moneyName) {
		this.moneyName = moneyName;
	}
	public int getAmount() {
		return amount;
	}
	public MoneyKind getKind() {
		return kind;
	}
	public void setKind(MoneyKind kind) {
		this.kind = kind;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "Money [kind=" + kind + ", classification=" + classification + ", moneyName=" + moneyName + ", amount="
				+ amount + "]";
	}
	
	public void setMoneyAmount(Scanner sc) {
		int n = 0;
		while(n == 0) {
			try {
				System.out.print("Amount : ");
				n = sc.nextInt();
				setAmount(n);
			}catch(InputMismatchException e) {
				System.out.println("Please put an integer");
				if(sc.hasNext()) {
					sc.next();
				}
				n = 0;
			}
		}
	}
	
	public void setMoneyClassification(Scanner sc) {
		String n = " ";
		while(n.equals(" ")) {
			try {
				if(kind.equals(MoneyKind.Checking_Account)) {
					System.out.print("input classification(add / spend) : ");
				}
				else if(kind.equals(MoneyKind.Saving_Account)) {
					System.out.print("input classification (deposit) : ");
				}
				else if(kind.equals(MoneyKind.Loan)) {
					System.out.print("input classification (loan) : ");
				}
				
				n = sc.next();
				setClassification(n);
			}catch(ClassificationException e) {
				if(kind.equals(MoneyKind.Checking_Account)) {
					System.out.println("Please put \"add\" or \"spend\"");
				}
				else if(kind.equals(MoneyKind.Saving_Account)) {
					System.out.println("Please put \"deposit\"");
				}
				else if(kind.equals(MoneyKind.Loan)) {
					System.out.println("Please put \"loan\"");
				}
				n = " ";
			}
		}
	}
	@SuppressWarnings("unlikely-arg-type")
	public void setGuiClassification(String k, String c) {
		if(k.equals(MoneyKind.Checking_Account)) {
			if(classification.equals("add") || classification.equals("spend")) {
				this.classification = c;
			}
			else {
				System.out.println("Input add or spend");
			}
		}else if(k.equals(MoneyKind.Saving_Account)) {
			if(!classification.equals("deposit")) {
				System.out.println("Input deposit");
			}
			this.classification = c;
		}else if(k.equals(MoneyKind.Loan)) {
			if(!classification.equals("loan")) {
				System.out.println("Input loan");
			}
			this.classification = c;
		}
	}
}