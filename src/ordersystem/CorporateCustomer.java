package ordersystem;

public class CorporateCustomer extends ACustomer{

private String creditRating;
private double creditLimit;

public CorporateCustomer(String name, String address, String phone,
		String creditRating,double creditLimit) {
	super(name, address, phone);
	 // Auto-generated constructor stub
	this.creditRating=creditRating;
	this.creditLimit=creditLimit;
}
public String getCreditRating() {
	return creditRating;
}
public void setCreditRating(String creditRating) {
	this.creditRating = creditRating;
}
public double getCreditLimit() {
	return creditLimit;
}
public void setCreditLimit(double creditLimit) {
	this.creditLimit = creditLimit;
}
public double generateMonthlyBill() {
	return 0;
}
}
