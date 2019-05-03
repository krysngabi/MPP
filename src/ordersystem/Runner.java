package ordersystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		 //
		List<Product> products=new ArrayList<Product>();
		List<OrderLine> orderlines=new ArrayList<OrderLine>();
		List<Order> orders=new ArrayList<Order>();
		
		Product prod1=new Product("Iphone7s", "I7S", 350);
		Product prod2=new Product("Earbud", "WTR", 2.5);
		Product prod3=new Product("Glasses", "GLS", 12);
		Product prod4=new Product("Books", "BKS", 45);
		Product prod5=new Product("IphoneXR", "XR", 750);
		
		ACustomer customer1=new PersonalCustomer("Krys","R104 B141","+243897396004","poor","124-569"); 
		ACustomer customer2=new PersonalCustomer("Patrick","R104 B142","+203897396004","excellent","184-569"); 
		ACustomer customer3=new CorporateCustomer("NicoleINT","HH B142","+256897396004","excellent",20); 
		
		products.add(prod1);
		products.add(prod2);
		products.add(prod3);
		products.add(prod4);
		products.add(prod5);
		
		ICompPoints comp=new ComputerPoints(2);
		ICompPoints health=new HealthPoints(1);
		ICompPoints audio=new Audio_VideosPoints(0.5);
		ICompPoints others=new OtherPoints(0.25);
		
		prod1.setICompPoints(comp);
		prod2.setICompPoints(audio);
		prod3.setICompPoints(health);
		prod4.setICompPoints(others);
		prod5.setICompPoints(comp);
		
		Order ord1=new Order("01", "RAS", false, LocalDate.of(2019, 04, 8), 250);
		Order ord2=new Order("02", "RAS", false, LocalDate.of(2019, 04, 8), 125);
		Order ord3=new Order("03", "RAS", false, LocalDate.of(2019, 04, 8), 700);
		
		OrderLine odl1=new OrderLine(2, 10, 2, LocalDate.of(2019, 04, 10), "RAS");//computer
		OrderLine odl2=new OrderLine(9, 15, 1, LocalDate.of(2019, 04, 10), "RAS");//health
		OrderLine odl3=new OrderLine(5, 17, 0.5, LocalDate.of(2019, 04, 10), "RAS");//audio
		OrderLine odl4=new OrderLine(6, 22, 2, LocalDate.of(2019, 04, 10), "RAS");//computer
		
		
		odl1.setProducts((IProduct)prod1);
		odl2.setProducts((IProduct)prod3);
		odl3.setProducts((IProduct)prod2);
		odl4.setProducts((IProduct)prod5);
		
		ord1.addOrderLine(odl1);
		ord1.addOrderLine(odl2);
		ord1.addOrderLine(odl3);
		ord2.addOrderLine(odl2);
		ord2.addOrderLine(odl4);
		
		ord1.setCustomer((ICustomer)customer1);
		ord2.setCustomer((ICustomer)customer2);
		
		orderlines.add(odl1);
		orderlines.add(odl2);
		orderlines.add(odl3);
		orderlines.add(odl4);
		
		orders.add(ord1);
		orders.add(ord2);
		
		/*for(OrderLine odline:orderlines) {
			odline.print();
		}*/
		for(Order order:orders) {
			order.print();
		}
		
		
		

	}

}
