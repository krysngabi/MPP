package lab5_1;

public class Hourly extends Employee {
private double hoursWage,hoursPerWeek;




public Hourly(int empId,String name, double hoursWage, double hoursPerWeek) {
	super(empId,name);
	this.hoursWage = hoursWage;
	this.hoursPerWeek = hoursPerWeek;
}

public double getHoursWage() {
	return hoursWage;
}

public void setHoursWage(double hoursWage) {
	this.hoursWage = hoursWage;
}

public double getHoursPerWeek() {
	return hoursPerWeek;
}




public void setHoursPerWeek(double hoursPerWeek) {
	this.hoursPerWeek = hoursPerWeek;
}




@Override
double calcGrossPay(DateRange drange) {
	 //
	return 4*hoursPerWeek*hoursWage;
}

}
