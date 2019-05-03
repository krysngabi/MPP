 package std_032017;

import java.util.List;

public class Admin {
	public static double computeUpdatedBalanceSum(List<Employee> list) {
		//implement
		double computedSalanceSum=0.0;
		for(Employee emp:list) {
			computedSalanceSum+=emp.computeUpdatedBalanceSum();
		}
		return computedSalanceSum;
	}
}
