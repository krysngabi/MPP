package lab3_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
		if(employee!=null) {
			
				System.out.print(getDescription()+"=>");
				employee.print();
		}else {
			System.out.println(getDescription());
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
	public void printDownLine() {

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
	@Override
	public boolean equals(Object obj) {
		if(obj==null)return false;
		if(this==obj)return true;
		if(!(obj instanceof Position)) return false;
		
		Position pos=(Position)obj;
		
		if(this.description==null && pos.description!=null)return false;
		if(this.title==null && pos.title!=null)return false;
		if(this.superior==null && pos.superior!=null)return false;
		if(pos.superior==null)return false;
				
		
		
		boolean isEqual=this.description.equals(pos.description) && this.title.equals(pos.title)
				&& this.superior.equals(pos.superior);
		
		return isEqual;
	}
	@Override
	public int hashCode() {
		return Objects.hash(description,title,superior);
	}
	
	
	
	
}
