package std_032017;

public class SavingsAccount extends Account {
private String accId;
private double interestRate,balance;


public SavingsAccount(String accId, double interestRate, double balance) {
	super();
	this.accId = accId;
	this.interestRate = interestRate;
	this.balance = balance;
}
public String getAccId() {
	return accId;
}
public void setAccId(String accId) {
	this.accId = accId;
}
public double getInterestRate() {
	return interestRate;
}
public void setInterestRate(double interestRate) {
	this.interestRate = interestRate;
}

@Override
public String getAccountID() {
	 //
	return accId;
}
@Override
public double getBalance() {
	 //
	return balance;
}
@Override
public double computeUpdateBalance() {
	 //
	return balance+(interestRate*balance);
}

}
