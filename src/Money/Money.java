package Money;

import java.util.Scanner;

public abstract class Money {
	protected MoneyKind kind = MoneyKind.Checking_Account;
	protected String classification = null;
	protected String moneyName = null;
	protected int amount = 0;
	
	public Money() {
	}
	public Money(String classification, String moneyName, int amount) {
		this.classification = classification; 
		this.moneyName = moneyName;
		this.amount = amount;
	}
	public String getClassification() {
		return classification;
	}
	public void setClassification(String classification) {
		this.classification = classification;
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
		return "Money [classification=" + classification + ", moneyName=" + moneyName + ", amount=" + amount + "]";
	}
	
		
}