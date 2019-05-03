package lab2_3;

import java.time.LocalDate;

public class Runner {

	public static void main(String[] args) {
		 ////

		Employee top1 = new Employee(1, "Lyle", "Lyle", "Lyle", "123-456", LocalDate.of(1958, 12, 16), 102);
		Employee tom = new Employee(2, "Tom", "Tom", "Tom", "012-456", LocalDate.of(1990, 12, 16), 91);
		Employee sue = new Employee(3, "Sue", "Sue", "Sue", "045-456", LocalDate.of(1990, 12, 16), 27);
		Employee marc = new Employee(4, "Marc", "Marc", "Marc", "022-456", LocalDate.of(1990, 12, 16), 322);
		Employee stan = new Employee(5, "Stan", "Stan", "Stan", "011-456", LocalDate.of(1990, 12, 16), 25);
		Employee dan = new Employee(6, "Dan", "Dan", "Dan", "035-456", LocalDate.of(1990, 12, 16), 93);
		Employee peter = new Employee(7, "Peter", "Peter", "Peter", "0385-456", LocalDate.of(1990, 12, 16), 93);
		Employee ron = new Employee(8, "Ron", "Ron", "Ron", "039-456", LocalDate.of(1990, 12, 16), 93);
		Employee bill = new Employee(9, "Bill", "Bill", "Bill", "040-456", LocalDate.of(1990, 12, 16), 93);

		Employee garry = new Employee(10, "Garry", "Garry", "Garry", "041-456", LocalDate.of(1990, 12, 16), 93);
		Employee anne = new Employee(11, "Anne", "Anne", "Anne", "042-456", LocalDate.of(1990, 12, 16), 93);

		Company comp1 = new Company("IBM Computers");
		Department dep1 = new Department("Sales", "BLD1-R104", 144);
		Department dep2 = new Department("Marketing", "BLD2-R76", 29);
		
		comp1.addDepartment(dep1);
		comp1.addDepartment(dep2);
		
		Position pos1 = new Position("TE", "Top Executive", 40);
		Position pos2 = new Position("DepH", "Department Head", 50);
		Position pos3 = new Position("Sp", "Worker", 50);
		Position pos31 = new Position("Sp", "Worker", 50);
		Position pos32 = new Position("Sp", "Worker", 50);
		Position pos4 = new Position("Sp", "Worker", 50);
		Position pos41 = new Position("Sp", "Worker", 50);

		Position pos42 = new Position("SM", "Worker", 50);

		Position sup1 = new Position("Stn", "Sup1", 50);
		Position sup2 = new Position("Stn2", "Sup2", 50);

		Position headp1 = new Position("HEAD", "HEAD", 50);
		Position headp2 = new Position("HEAD", "HEAD", 50);

		pos1.setEmployee(top1);
		
		sup1.setEmployee(stan);
		sup2.setEmployee(peter);

		pos3.setEmployee(tom);
		pos3.setSuperior(sup1);
		pos31.setEmployee(sue);
		pos31.setSuperior(sup1);
		pos32.setEmployee(marc);
		pos32.setSuperior(sup1);

		sup1.addInferiors(pos3);//stan inferiors
		sup1.addInferiors(pos31);
		sup1.addInferiors(pos32);

		pos4.setEmployee(bill);
		pos4.setSuperior(sup2);
		pos41.setEmployee(dan);
		pos41.setSuperior(sup2);
		
		sup1.setSuperior(headp1);
		sup2.setSuperior(headp1);
		

		sup2.addInferiors(pos4);//peter inferiors
		sup2.addInferiors(pos41);

		pos42.setEmployee(garry);

		
		headp1.addInferiors(sup2);//peter work for ron
		headp1.addInferiors(sup1);
		headp2.addInferiors(pos42);//garry works for anne

		

		headp1.setEmployee(ron);
		
		dep1.addPositions(pos3);
		dep1.addPositions(pos31);
		dep1.addPositions(pos32);
		dep1.addPositions(pos4);
		dep1.addPositions(pos41);
		dep1.addPositions(sup1);
		dep1.addPositions(sup2);

		dep1.addPositions(headp1);
		
		
		headp2.setEmployee(anne);
		
		dep2.addPositions(pos42);
		dep2.addPositions(headp2);
		
		

		dep1.setDepartmentHead(headp1);// Ron is the the sales head
		dep2.setDepartmentHead(headp2); //Anne is the department head

		

		

		comp1.setTopExecutive(pos1);
		
		comp1.printReportingHierarchy();
		dep1.printReportingHierarchy();

	}

}
