package lab3_3;

import java.time.LocalDate;
import java.util.Scanner;

public class Runner_Equals {

	public static void main(String[] args) {
		// //

		Employee emp1 = new Employee(1, "Krys", "Kika", "Ngabi", "123-456", LocalDate.of(1990, 12, 16), 100);
		Employee emp2 = new Employee(2, "Patrick", "Tabuku", "Mabala", "012-456", LocalDate.of(1990, 12, 16), 100);
		Employee emp3 = new Employee(3, "Eunice", "Mwanabi", "Mawu", "045-456", LocalDate.of(1990, 12, 16), 100);
		Employee emp4 = new Employee(4, "Junior", "Masanu", "Kingidi", "022-456", LocalDate.of(1990, 12, 16), 100);
		Employee emp5 = new Employee(5, "Blanchard", "Mikubu", "Kingolo", "011-456", LocalDate.of(1990, 12, 16), 100);
		Employee emp6 = new Employee(6, "Christian", "Vagelis", "Mbappe", "035-456", LocalDate.of(1990, 12, 16), 100);
		Employee emp7 = new Employee(1, "Krys", "Vagelis", "Mbappe", "123-456", LocalDate.of(1990, 12, 16), 100);

		Position pos1 = new Position("HRR", "Human Resources Responsible", 0);
		Position pos2 = new Position("ITA", "IT advisor", 0);
		Position pos3 = new Position("GUIP", "GUI Programmers", 0);
		Position pos4 = new Position("SECS", "Security Staff", 0);
		Position pos5 = new Position("DD", "Department Director", 0);
		Position pos6 = new Position("SR", "Sport Representative", 0);

		Position pos7 = new Position("HRR", "Human Resources Responsible", 0);

		/*
		 * emp1.setPosition(pos3); emp5.setPosition(pos3); emp4.setPosition(pos3);
		 * emp6.setPosition(pos5);
		 */

		pos1.setEmployee(emp1);
		pos2.setEmployee(emp2);
		pos3.setEmployee(emp3);

		pos4.setEmployee(emp4);
		pos5.setEmployee(emp5);

		Department dep1 = new Department("Human Ressources", "BLD1-R104", 0);
		Department dep2 = new Department("Technique", "BLD2-R76", 0);

		dep1.addPositions(pos1);
		dep1.addPositions(pos2);
		dep1.addPositions(pos3);

		dep2.addPositions(pos4);
		dep2.addPositions(pos5);
		dep2.addPositions(pos6);

		Company comp1 = new Company("GLE");
		Company comp2 = new Company("RAWBANK");

		comp1.addDepartment(dep1);
		comp1.addDepartment(dep2);

		comp2.addDepartment(dep2);
		comp2.addDepartment(dep1);

		boolean empComp = emp1.equals(emp7);
		boolean empComp1 = emp1.equals(emp2);

		System.out.println("Employee Equals?");
		System.out.println(empComp);
		System.out.println(empComp1);

		pos1.setSuperior(pos5);
		pos7.setSuperior(pos5);

		boolean posComp = pos1.equals(pos7);
		boolean posComp1 = pos1.equals(pos2);

		System.out.println("Positions Equals?");
		System.out.println(posComp);
		System.out.println(posComp1);

		System.out.println("Hascode Equals?");
		System.out.println(pos1.hashCode() + " ---- " + pos7.hashCode());
		System.out.println(pos1.hashCode() + " ---- " + pos2.hashCode());

		IPerson p = new Person("krys", "123-456", 20);
		IPerson p2 = new Person2("grace", "129-456", 31);

		p.myAbstract();
		p.myDefault();
		IPerson.myStatic();
		IPerson2.myStatic();
		
		 MyImmutable s = new MyImmutable(102,"ABC"); 
		 System.out.println("FROM IMMUTABLE");
	     System.out.println(s.getName()); 
	     System.out.println(s.getId()); 
	    // s.id=34;

		MyEnum myEnum;
		System.out.println("Enter 1 for English & 2 for French");
		String value = "", retour = "";
		Scanner sc = new Scanner(System.in);
		value = sc.nextLine();
		if (value.equals("1")) {
			getEnum(MyEnum.ENGLISH);
		}
		if (value.equals("2")) {
			getEnum(MyEnum.FRENCH);
		}

	}

	public static void getEnum(MyEnum value) {
		System.out.println("Hello from " + value);
	}

}
