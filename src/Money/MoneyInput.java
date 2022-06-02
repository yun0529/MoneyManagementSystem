package Money;

import java.util.Scanner;

import Exception.ClassificationException;

public interface MoneyInput {
	public boolean getKindInput(Scanner sc);

	public String getMoneyName();

	public void setAmount(int amount);
	
	public void setKind(String kind);
	
	public void setMoneyName(String moneyName);

	public Object getClassification();
	
	public void setClassification(String classification) throws ClassificationException;

	public int getAmount();

	public MoneyKind getKind();

}
