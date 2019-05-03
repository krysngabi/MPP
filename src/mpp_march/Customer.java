package mpp_march;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String name;
	private List<Order> orders;
	
	public Customer(String name) {
		super();
		this.name = name;
		orders = new ArrayList<Order>();
	}

	public List<Order> getOrders(){
		return orders;
	}
	
	public void addOrder(Order o) {
		orders.add(o);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}


	
	
}
