package lab3_3;
import java.time.LocalDate;

public class Runner1 {

	public static void main(String[] args) {
		 ////
		
		Employee emp1=new Employee(1, "Krys", "Kika", "Ngabi", "123-456", LocalDate.of(1990, 12, 16), 100);
		Employee emp2=new Employee(2, "Patrick", "Tabuku", "Mabala", "012-456", LocalDate.of(1990, 12, 16), 100);
		Employee emp3=new Employee(3, "Eunice", "Mwanabi", "Mawu", "045-456", LocalDate.of(1990, 12, 16), 100);
		Employee emp4=new Employee(4, "Junior", "Masanu", "Kingidi", "022-456", LocalDate.of(1990, 12, 16), 100);
		Employee emp5=new Employee(5, "Blanchard", "Mikubu", "Kingolo", "011-456", LocalDate.of(1990, 12, 16), 100);
		Employee emp6=new Employee(6, "Christian", "Vagelis", "Mbappe", "035-456", LocalDate.of(1990, 12, 16), 100);
		
		
		Position pos1=new Position("HRR", "Human Resources Responsible",0);
		Position pos2=new Position("ITA", "IT advisor",0);
		Position pos3=new Position("GUIP", "GUI Programmers",0);
		Position pos4=new Position("SECS", "Security Staff",0);
		Position pos5=new Position("DD", "Department Director",0);
		Position pos6=new Position("SR", "Sport Representative",0);
		
		/*emp1.setPosition(pos3);
		emp5.setPosition(pos3);
		emp4.setPosition(pos3);
		emp6.setPosition(pos5);*/
		
		pos1.setEmployee(emp1);
		pos2.setEmployee(emp2);
		pos3.setEmployee(emp3);
		
		pos4.setEmployee(emp4);
		pos5.setEmployee(emp5);
		
		
		
		Department dep1=new Department("Human Ressources", "BLD1-R104",0);
		Department dep2=new Department("Technique", "BLD2-R76",0);
		
		
		
		dep1.addPositions(pos1);
		dep1.addPositions(pos2);
		dep1.addPositions(pos3);
		
		dep2.addPositions(pos4);
		dep2.addPositions(pos5);
		dep2.addPositions(pos6);
		
		
		
		Company comp1=new Company("GLE");
		Company comp2=new Company("RAWBANK");
		
		comp1.addDepartment(dep1);
		comp1.addDepartment(dep2);
		
		comp2.addDepartment(dep2);
		comp2.addDepartment(dep1);
		
		
		
		
		
		
		

	}

}
