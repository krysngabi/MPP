package lab2_3;

import java.util.ArrayList;
import java.util.List;

public class Position {
	private String title, description;
	private Employee employee;
	private StringBuilder sb=new StringBuilder();
	private double salary;
	private Position superior;
	private List<Position>inferiors;

	public Position(String title, String description,double salary) {
		super();
		this.title = title;
		this.description = description;
		this.salary=salary;
		inferiors=new ArrayList<Position>();
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Position(String title, String description, Employee employee) {
		super();
		this.title = title;
		this.description = description;
		this.employee = employee;
	}

	public void print() {
			if(inferiors.size()>0) {
					System.out.println(employee.getFirstName());
					
					for(Position inferior:inferiors) {
						inferior.getEmployee().print();
					}
					
				}else {
					
				}
	
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public Position getSuperior() {
		return superior;
	}

	public void setSuperior(Position superior) {
		this.superior = superior;
	}
	public void addInferiors(Position infer) {
		inferiors.add(infer);
		
	}
	public String toString() {
		return employee.getFirstName();
		
	}
	
	public List<Position> getInferiors() {
		return inferiors;
	}

	public void setInferiors(List<Position> inferiors) {
		this.inferiors = inferiors;
	}

	public void printDownLine() {
		
		if(inferiors.size()>0) {
			System.out.println(employee.getFirstName());
			
			for(Position inferior:inferiors) {
				inferior.getEmployee().print();
			}
			
		}else {
			
		}
		
	}
	
	
	
	
}
