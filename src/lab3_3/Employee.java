package lab3_3;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {
	private int employeeId;
	private String firstName, middleInitial, lastName, ssn;
	private LocalDate birthDate;
	private double salary;
	private Position position;

	public Employee(int employeeId, String firstName, String middleInitial, String lastName, String ssn,
			LocalDate birthDate, double salary) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.middleInitial = middleInitial;
		this.lastName = lastName;
		this.ssn = ssn;
		this.birthDate = birthDate;
		this.salary = salary;
	}

	public void print() {
		System.out.println(firstName + " " + middleInitial + " " + lastName);
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleInitial() {
		return middleInitial;
	}

	public void setMiddleInitial(String middleInitial) {
		this.middleInitial = middleInitial;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (this.getClass() != obj.getClass())
			return false;
		Employee emp = (Employee) obj;
		if(this.firstName==null && emp.firstName!=null) {
			return false;
		}
		boolean isequal=(this.employeeId==emp.getEmployeeId() && this.firstName.equals(emp.getFirstName()) 
				&& this.ssn.equals(emp.getSsn()));
				

		return isequal;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(firstName,employeeId,ssn);
	}

}
