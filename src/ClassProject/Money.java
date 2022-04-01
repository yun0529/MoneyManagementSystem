package ClassProject;


public class Money {
	String classification = null;
	String moneyName = null;
	int amount = 0;
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
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "Money [classification=" + classification + ", moneyName=" + moneyName + ", amount=" + amount + "]";
	}
	
	
}
