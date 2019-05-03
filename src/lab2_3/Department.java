package lab2_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Department {
	private String name, location;
	private List<Position> positions;
	private double salary;
	private Position departmentHead;
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Department(String name, String location, double salary) {
		super();
		this.name = name;
		this.location = location;
		this.salary = salary;
		this.positions = new ArrayList<>();
	}

	public void print() {
		 System.out.print("\n");
		int counter = 0;
		for (Position pos : positions) {
			
			System.out.print(counter + ". " + pos.getDescription() + "\t");
			System.out.print(" ");
			counter++;
		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Position> getPositions() {
		return positions;
	}

	public void setPositions(List<Position> positions) {
		this.positions = positions;
	}

	public void addPositions(Position pos) {
		positions.add(pos);
	}

	public Position getDepartmentHead() {
		return departmentHead;
	}

	public void setDepartmentHead(Position departmentHead) {
		this.departmentHead = departmentHead;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj==null) return false;
		if(this==obj)return true;
		if(!(obj instanceof Department) )return false;
		Department dpt=(Department)obj;
		
		return this.name.equals(dpt.getName()) && this.positions.equals(dpt.getPositions());
	}

	public void printReportingHierarchy() {
		System.out.println(getName());
		System.out.println("__________________");
		
		
			for(Position pos:positions) {
				Employee emp=pos.getEmployee();
				if(pos.getSuperior()==null) {
					System.out.println("Head : "+emp.getFirstName());
					pos.printDownLine();
				}else {
					pos.printDownLine();
				}
				
				
				
				
				System.out.println(pos.getEmployee().getFirstName());
				
				pos.print();
				pos.printDownLine();
				
			}
			
		

	}
}
