package lab5_1;

public class Salaried extends Employee {
private double salary;


public Salaried(int empId,String name,double salary) {
	super(empId,name);
	this.salary = salary;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

@Override
double calcGrossPay(DateRange drange) {
	 //
	return salary;
}

}
