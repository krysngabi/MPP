package lab5_1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Employee {
	private int empId;
	private String name;
	private List<PayCheck> payCheckList;

	public Employee(int empId,String name) {

		this.empId = empId;
		this.name=name;
		payCheckList = new ArrayList<PayCheck>();
	}

	public Employee() {
		 // Auto-generated constructor stub
	}
	

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<PayCheck> getPayCheckList() {
		return payCheckList;
	}

	public void setPayCheckList(List<PayCheck> payCheckList) {
		this.payCheckList = payCheckList;
	}

	public void addPayCheck(PayCheck pcheck) {
		payCheckList.add(pcheck);
	}

	public PayCheck calcCompensation(int month, int year) {
		LocalDate newDate = LocalDate.of(year, month, 5);
		DateRange mdate = new DateRange(newDate, newDate);
		double grosspay = calcGrossPay(mdate);
		
		System.out.println(name+"--> gross "+grosspay);
		double fica = grosspay * 0.23;
		double state = grosspay * 0.05;
		double local = grosspay * 0.01;
		double medicare = grosspay * 0.03;
		double ss = grosspay * 0.075;
		
		PayCheck mpay=new PayCheck(grosspay, fica, state, local, medicare, ss, mdate);
		payCheckList.add(mpay);
		print();
		
		return mpay;
	}

	abstract double calcGrossPay(DateRange drange);

	public void print() {
		System.out.println("************************");
		for(PayCheck payc:payCheckList) {
			System.out.println("Employee "+name);
			payc.print();
		}

	}
}
