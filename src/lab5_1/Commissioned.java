package lab5_1;

import java.util.ArrayList;
import java.util.List;

public class Commissioned extends Employee {
	private double commission, baseSalary;
	private List<Order> orderList;

	public Commissioned(int empId,String name, double commission, double baseSalary) {
		super(empId,name);
		this.commission = commission;
		this.baseSalary = baseSalary;
		orderList = new ArrayList<Order>();
	}

	public void addOrder(Order o) {
		orderList.add(o);
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

@Override
double calcGrossPay(DateRange drange) {
	 //
	double sum=0.0;
	for(Order order:orderList) {
		int dd=drange.getStartDate().getMonthValue();
		int dy=drange.getStartDate().getYear();
		
		int od=order.getOrderDate().getMonthValue();
		int oy=order.getOrderDate().getYear();
		
		if(dd==od && dy==oy) {
			System.out.println(order.getOrderAmount());
			sum+=order.getOrderAmount();
			
		}
	}
	return baseSalary+(sum*commission);
}

}
