package mpp_march;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	static double getTotalPrice(List<Order> orders,List<Customer>customers) {
		
		return customers.stream().
				flatMapToDouble(c->{
					return orders.stream().
							filter(o->c.getOrders().contains(o) && o.getOrderDate().isAfter(LocalDate.of(2018, 06, 1))).
							mapToDouble(or->or.getAmount());
				}).sum();
	}
		
		
	
		


	
	static List<Integer> findProductIds(List<OrderItem>orderItems){
		
		return orderItems.stream().filter(e->e.getProduits().getPrice()>10 && e.getQuantity()>3)
		.map(o->{
			return o.getProduits().getProductId();
		}).distinct().collect(Collectors.toList());
		
	}
	public static void main(String[] args) {
		 //
		

		Customer frankMoore = new Customer("Frank Moore");	
		Customer samHoward = new Customer("Sam Howard");
		Customer johnDoodle = new Customer("John Doodle");
		Customer johnDoe = new Customer("John Doe");
		Customer maryJones = new Customer("Mary Jones");
		
		List<Customer> customers = new ArrayList<Customer>();
		customers.add(frankMoore);
		customers.add(samHoward);
		customers.add(johnDoodle);
		customers.add(johnDoe);
		customers.add(maryJones);
		//customers.add(leeJohnson);
		
		
		Order o1 = new Order("01", 2000,LocalDate.of(2018, 05, 4));	
		Order o2 = new Order("02", 1500,LocalDate.of(2018, 06, 4));
		Order o3 = new Order("03", 800,LocalDate.of(2018, 06, 4));
		Order o4 = new Order("04",200,LocalDate.of(2018, 06, 4));
		Order o5 = new Order("05", 500,LocalDate.of(2018, 06, 4));
		Order o6 = new Order("07",20,LocalDate.of(2018, 06, 4));
		Order o7 = new Order("08",210,LocalDate.of(2018, 06, 4));
		Order o8 = new Order("09",20,LocalDate.of(2018, 06, 4));
		Order o9 = new Order("10",40,LocalDate.of(2018, 06, 4));
		
		List<Order> orders = new ArrayList<Order>();
		orders.add(o1);
		orders.add(o2);
		orders.add(o3);
		
		
		frankMoore.addOrder(o1);
		frankMoore.addOrder(o2);
		
		samHoward.addOrder(o3);
		
		johnDoodle.addOrder(o3);
		johnDoodle.addOrder(o5);
		johnDoodle.addOrder(o6);
		
		johnDoe.addOrder(o2);
		johnDoe.addOrder(o8);
		
		maryJones.addOrder(o7);
		
		System.out.printf("Total %.2f",getTotalPrice(orders,customers));
		
		Product p1=new Product(1, "Makayabu", "c1", 8);
		Product p2=new Product(2, "Lait", "c2", 125);
		Product p3=new Product(3, "Beurre", "c3", 22);
		
		OrderItem oi1=new OrderItem(2);
		OrderItem oi2=new OrderItem(20);
		OrderItem oi3=new OrderItem(10);
		
		oi1.setProduits(p1);
		oi2.setProduits(p2);
		oi3.setProduits(p3);
		
		List<OrderItem>orderItems=new ArrayList<OrderItem>();
		orderItems.add(oi1);
		orderItems.add(oi2);
		orderItems.add(oi3);
		
		System.out.printf("\nIDs %s",findProductIds(orderItems));

	}

}
