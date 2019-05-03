package lab2_3;
import java.time.LocalDate;

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
		System.out.println("\t\t "+firstName);
		
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
	
	
}
