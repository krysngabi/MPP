package ordersystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order implements ICustomer {
	private String  ordernumber,status;
	private boolean prepaid;
	private LocalDate orderdate;
	private double orderprice,customerPoints;
	private List<OrderLine> orderLines;
	private ICustomer customer;
	
	
	public Order(String ordernumber, String status, boolean prepaid, LocalDate orderdate, double orderprice) {
		super();
		this.ordernumber = ordernumber;
		this.status = status;
		this.prepaid = prepaid;
		this.orderdate = orderdate;
		this.orderprice = orderprice;
		orderLines=new ArrayList<OrderLine>();
		
	}
	public void addOrderLine(OrderLine ol) {
		orderLines.add(ol);
	}
	
	public double getTotalPrice() {
		double total=0.0;
		for(OrderLine ord:orderLines) {
			total+=ord.getPrice();
		}
		return total;
	}
	

	public String getOrdernumber() {
		return ordernumber;
	}


	public void setOrdernumber(String ordernumber) {
		this.ordernumber = ordernumber;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public LocalDate getOrderdate() {
		return orderdate;
	}


	public void setOrderdate(LocalDate orderdate) {
		this.orderdate = orderdate;
	}


	public double getOrderprice() {
		return orderprice;
	}


	public void setOrderprice(double orderprice) {
		this.orderprice = orderprice;
	}


	public List<OrderLine> getOrderLines() {
		return orderLines;
	}


	public void setOrderLines(List<OrderLine> orderLines) {
		this.orderLines = orderLines;
	}


	public double getCustomerPoints() {
		
		return customerPoints;
	}


	public void setCustomerPoints(double customerPoints) {
		this.customerPoints = customerPoints;
	}


	public double getOrderPoints() {
		double totpoints=0.0;
		for(OrderLine ord:orderLines) {
			totpoints+=ord.computePoints();
		}
		return totpoints;
	}

	public boolean isPrepaid() {
		
		if(getCreditRating().equalsIgnoreCase("poor")){
			prepaid=true;
		}
		if(customer instanceof CorporateCustomer) {
			if(getTotalPrice()>((CorporateCustomer) customer).getCreditLimit()) {
				prepaid=true;
			}
		}
		return prepaid;
	}

	public void setPrepaid(boolean prepaid) {
		this.prepaid = prepaid;
	}
	@Override
	public String getCreditRating() {
		 //
		return customer.getCreditRating();
	}
	public ICustomer getCustomer() {
		return customer;
	}
	public void setCustomer(ICustomer customer) {
		this.customer = customer;
	}
	public void print() {
		System.out.println("Order Number "+ordernumber +"\nPoints "+getOrderPoints());
		System.out.printf("Order Date %d-%d-%d \n",orderdate.getYear(),orderdate.getMonthValue(),orderdate.getDayOfMonth());
		System.out.println("Prepaid? "+isPrepaid());
		System.out.print("********************\n");
		for(OrderLine ord:orderLines) {
			Product mprod=(Product)ord.getProducts();
			
			System.out.println(mprod.getDescription());
			System.out.println("\t QTY\t "+ord.getQuantity());
			System.out.println("\t P.U \t"+mprod.getPrice());
			System.out.println("\t PRICE\t"+ord.computePrice());
			System.out.println("\t POINT\t"+ord.computePoints());
			System.out.println("_________________________________");
			}
	}
	
	

}
