package lab2_3;

import java.util.ArrayList;
import java.util.List;

public class Company {
	private String name;
	private List<Department> departments;
	private Position topExecutive;

	public Company(String namex) {
		super();
		this.name = namex;
		this.departments = new ArrayList<>();
	}

	public void print() {
		List<Position> positions = new ArrayList<>();
		System.out.println("COMPANY: " + name + "\n");
		for (Department dept : departments) {
			System.out.println("DEPARTMENT : " + dept.getName() + "\n\n");
			dept.print();

			System.out.println(
					"\n-----------------------------------------------------" + "------------------------------");
			positions = dept.getPositions();
			for (Position mpos : positions) {

				mpos.print();

			}
			System.out.println("");

		}
		System.out.println("\n");
		System.out.println("-----------------------------------------------------" + "------------------------------");
		System.out.println("-----------------------------------------------------" + "------------------------------");

	}

	public void getSalary() {
		double sum = 0;
		List<Position> positions = new ArrayList<>();
		for (Department dept : departments) {
			sum += dept.getSalary();
			positions = dept.getPositions();
			for (Position mpos : positions) {

				sum += mpos.getSalary();
				if (mpos.getEmployee() != null) {
					sum += mpos.getEmployee().getSalary();
				}

			}

		}
		System.out.println("SUM OF SALARY IS "+sum);
	}
	

	public void addDepartment(Department dept) {
		departments.add(dept);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}

	public Position getTopExecutive() {
		return topExecutive;
	}

	public void setTopExecutive(Position topExecutive) {
		this.topExecutive = topExecutive;
	}

	public void printReportingHierarchy() {
		List<Position> positions = new ArrayList<>();
		System.out.println(getName());
		System.out.println("__________________");
		
		System.out.println("TOP EXECUTIVE "+getTopExecutive().getEmployee().getFirstName());
		
		for(Department dept:departments) {
			System.out.println(dept.getName() +" :  "+dept.getDepartmentHead().getEmployee().getFirstName()+"\n");
			dept.getDepartmentHead().print();
			positions=dept.getPositions();
			for(Position pos:positions) {
				
				pos.print();
				pos.printDownLine();
				
			}
			
		}
		
	}

}
