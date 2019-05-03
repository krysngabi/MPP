package ordersystem;

import java.util.ArrayList;
import java.util.List;

public abstract class ACustomer implements ICustomer {
private String name,address,phone;
private double poins;
private List<Order> orders;


public ACustomer(String name, String address, String phone) {
	super();
	this.name = name;
	this.address = address;
	this.phone = phone;
	orders=new ArrayList<Order>();
}
public void addOrder(Order o) {
	orders.add(o);
}
public abstract String getCreditRating();
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public double getPoins() {
	return poins;
}
public void setPoins(double poins) {
	this.poins = poins;
}

}
