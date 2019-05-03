package std_032017;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	List<Account> empAccounts=new ArrayList<Account>();
	
	public Employee(String name) {
		super();
		this.name = name;
	}

	public double computeUpdatedBalanceSum() {
		//implement
		double updateBalance=0.0;
		for(Account acc:empAccounts) {
			updateBalance+=acc.computeUpdateBalance();
		}
		return updateBalance;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Account> getEmpAccounts() {
		return empAccounts;
	}

	public void setEmpAccounts(List<Account> empAccounts) {
		this.empAccounts = empAccounts;
	}

	public void addAccount(Account acc) {
		empAccounts.add(acc);
	}
}
