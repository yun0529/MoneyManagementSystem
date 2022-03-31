package ClassProject;

public class Money {
	String moneyName = null;
	int amount = 0;
	String spendName = null;
	int spendAmount = 0;
	public Money(String moneyName, int amount, String spendName, int spendAmount) {
		this.moneyName = moneyName;
		this.amount = amount;
		this.spendName = spendName;
		this.spendAmount = spendAmount;
	}
	
	public void printLog() {
		if(amount == 0 && spendAmount != 0) {
			System.out.println("spendName : " + spendName + " , spendAmount : " + spendAmount);
		}else if(spendAmount == 0 && amount != 0) {
			System.out.println("addMoneyName : " + moneyName + " , addAmount : " + amount);
		}else {
			System.out.println("addMoneyName : " + moneyName + " , addAmount : " + amount + 
					" , spendName : " + spendName + " , spendAmount : " + spendAmount);
		}
		
	}
}
