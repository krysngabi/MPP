package lab5_1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		 //
		List<Employee> employees=new ArrayList<Employee>();
		/*Employee emp1=new Hourly(1, "Krys", 25, 32);
		Employee emp2=new Salaried(2, "Jado", 1200);
		Employee emp3=new Commissioned(3, "Eric", 0.07, 100);*/
		
		Employee emp1=new Hourly(1, "Krys", 10, 40);
		Employee emp2=new Salaried(2, "Jado", 8000);
		Employee emp3=new Commissioned(3, "Eric", 0.07, 800);
		
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		
		Order ord1=new Order(1, 200, LocalDate.of(2019, 4, 1));
		Order ord2=new Order(2, 300, LocalDate.of(2019, 4, 1));
		Order ord3=new Order(3, 400, LocalDate.of(2019, 4, 1));
		
		Order ord4=new Order(4, 25, LocalDate.of(2019, 5, 1));
		Order ord5=new Order(5, 128, LocalDate.of(2019, 6, 1));
	
		
		((Commissioned)emp3).addOrder(ord1);
		((Commissioned)emp3).addOrder(ord2);
		((Commissioned)emp3).addOrder(ord3);
		((Commissioned)emp3).addOrder(ord4);
		((Commissioned)emp3).addOrder(ord5);
		
		for(Employee emp:employees) {
			emp.calcCompensation(4, 2019);
		}
		
		
		
		

	}

}
