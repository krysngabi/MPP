package lab3_3;
import java.time.LocalDate;

public class Runner {

	public static void main(String[] args) {
		// //
		
		Employee top1=new Employee(1, "Lyle", "Lyle", "Lyle", "123-456", LocalDate.of(1958, 12, 16), 102);
		Employee tom=new Employee(2, "Tom", "Tom", "Tom", "012-456", LocalDate.of(1990, 12, 16), 91);
		Employee sue=new Employee(3, "Sue", "Sue", "Sue", "045-456", LocalDate.of(1990, 12, 16), 27);
		Employee marc=new Employee(4, "Marc", "Marc", "Marc", "022-456", LocalDate.of(1990, 12, 16), 322);
		Employee stan=new Employee(5, "Stan", "Stan", "Stan", "011-456", LocalDate.of(1990, 12, 16), 25);
		Employee dan=new Employee(6, "Dan", "Dan", "Dan", "035-456", LocalDate.of(1990, 12, 16), 93);
		Employee peter=new Employee(7, "Peter", "Peter", "Peter", "0385-456", LocalDate.of(1990, 12, 16), 93);
		Employee ron=new Employee(8, "Ron", "Ron", "Ron", "039-456", LocalDate.of(1990, 12, 16), 93);
		Employee bill=new Employee(9, "Bill", "Bill", "Bill", "040-456", LocalDate.of(1990, 12, 16), 93);
		
		Employee garry=new Employee(10, "Garry", "Garry", "Garry", "041-456", LocalDate.of(1990, 12, 16), 93);
		Employee anne=new Employee(11, "Anne", "Anne", "Anne", "042-456", LocalDate.of(1990, 12, 16), 93);
		
		
		Position pos1=new Position("TE", "Top Executive",40);
		Position pos2=new Position("DepH", "Department Head",50);
		Position pos3=new Position("Sp", "Worker",50);
		Position pos31=new Position("Sp", "Worker",50);
		Position pos32=new Position("Sp", "Worker",50);
		Position pos4=new Position("Sp", "Worker",50);
		Position pos41=new Position("Sp", "Worker",50);
		
		Position pos42=new Position("Sp", "Worker",50);
		
		Position sup1=new Position("Stn", "Sup1",50);
		Position sup2=new Position("Stn2", "Sup2",50);
		
		Position headp1=new Position("head1", "head1",50);
		Position headep2=new Position("head2", "head2",50);
		
		
		pos1.setEmployee(top1);
		stan.setPosition(sup1);//stan sup 1
		peter.setPosition(sup2);
		
		tom.setPosition(pos3);
		sue.setPosition(pos31);
		marc.setPosition(pos32);
		
		sup1.addInferiors(pos3);
		sup1.addInferiors(pos31);
		sup1.addInferiors(pos32);
		
		bill.setPosition(pos4);
		dan.setPosition(pos41);
		
		sup2.addInferiors(pos4);
		sup2.addInferiors(pos41);
		
		stan.setPosition(pos3);
		peter.setPosition(pos3);
		garry.setPosition(pos3);
		
		ron.setPosition(pos2);
		anne.setPosition(pos2);
		
		
		
		Department dep1=new Department("Sales", "BLD1-R104",144);
		Department dep2=new Department("Marketing", "BLD2-R76",29);
		
		dep1.addPositions(pos3);
		
		
		
		
		dep1.setDepartmentHead(pos2);//Ron is the the sales head
		dep2.setDepartmentHead(pos2);//Anne is the department head
		
		
		
		Company comp1=new Company("IBM Computers");
		
		comp1.addDepartment(dep1);
		comp1.addDepartment(dep2);
		
		comp1.setTopExecutive(pos1);
		
		comp1.print();
		
		

	}

}
