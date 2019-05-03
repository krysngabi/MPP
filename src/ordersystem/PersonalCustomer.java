package ordersystem;

public class PersonalCustomer extends ACustomer{

private String creditRating;
private String creditCard;
public PersonalCustomer(String name, String address, String phone,
		String creditRating,String creditCard) {
	super(name, address, phone);
	this.creditRating=creditRating;
	this.creditCard=creditCard;
	 // Auto-generated constructor stub
}


public String getCreditRating() {
	return creditRating;
}
public void setCreditRating(String creditRating) {
	this.creditRating = creditRating;
}


public String getCreditCard() {
	return creditCard;
}


public void setCreditCard(String creditCard) {
	this.creditCard = creditCard;
}


}
