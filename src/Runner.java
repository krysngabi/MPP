import java.time.LocalDate;

public class Runner {

	public static void main(String[] args) {
		
		Employee emp1=new Employee(1, "Krys", "Kika", "Ngabi", "123-456", LocalDate.of(1990, 12, 16), 100);
		Employee emp2=new Employee(2, "Patrick", "Tabuku", "Mabala", "012-456", LocalDate.of(1990, 12, 16), 100);
		Employee emp3=new Employee(3, "Eunice", "Mwanabi", "Mawu", "045-456", LocalDate.of(1990, 12, 16), 100);
		Employee emp4=new Employee(4, "Junior", "Masanu", "Kingidi", "022-456", LocalDate.of(1990, 12, 16), 100);
		Employee emp5=new Employee(5, "Blanchard", "Mikubu", "Kingolo", "011-456", LocalDate.of(1990, 12, 16), 100);
		Employee emp6=new Employee(6, "Christian", "Vagelis", "Mbappe", "035-456", LocalDate.of(1990, 12, 16), 100);
		
		
		Position pos1=new Position("HRR", "Human Resources Responsible");
		Position pos2=new Position("ITA", "IT advisor");
		Position pos3=new Position("GUIP", "GUI Programmers");
		Position pos4=new Position("SECS", "Security Staff");
		Position pos5=new Position("DD", "Department Director");
		
		emp1.setPosition(pos3);
		emp5.setPosition(pos3);
		emp4.setPosition(pos3);
		emp2.setPosition(pos5);
		
		
		pos3.setEmployee(emp1);
		pos3.setEmployee(emp5);
		pos3.setEmployee(emp4);
		pos5.setEmployee(emp2);
		
		
		
		Department dep1=new Department("Human Ressources", "BLD1-R104");
		Department dep2=new Department("Technique", "BLD2-R76");
		
		dep1.addPositions(pos1);
		dep1.addPositions(pos2);
		dep1.addPositions(pos5);
		
		dep2.addPositions(pos3);
		dep2.addPositions(pos4);
		dep2.addPositions(pos5);
		
		Company comp1=new Company("GLE");
		Company comp2=new Company("RAWBANK");
		
		comp1.addDepartment(dep1);
		comp1.addDepartment(dep2);
		
		comp2.addDepartment(dep1);
		comp2.addDepartment(dep2);
		
		comp1.print();
		
		

	}

}
