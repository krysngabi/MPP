package std_032017;

public class CheckingAccount extends Account {
	private double balance,monthlyFee;
	private String accid;
	
	
	public CheckingAccount(String accid,double monthlyFee, double balance ) {
		super();
		this.balance = balance;
		this.monthlyFee = monthlyFee;
		this.accid = accid;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getMonthlyFee() {
		return monthlyFee;
	}
	public void setMonthlyFee(double monthlyFee) {
		this.monthlyFee = monthlyFee;
	}
	
	public String getAccid() {
		return accid;
	}
	public void setAccid(String accid) {
		this.accid = accid;
	}
	@Override
	public String getAccountID() {
		 //
		return accid;
	}
	@Override
	public double computeUpdateBalance() {
		 //
		return balance-monthlyFee;
	}
	

}
