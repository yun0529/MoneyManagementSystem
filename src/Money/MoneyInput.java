package Money;

import java.util.Scanner;

public interface MoneyInput {
	public boolean getKindInput(Scanner sc);

	public String getMoneyName();

	public void setAmount(int editAmount);

	public Object getClassification();

	public int getAmount();


}
