package std_042017;


public class Admin {
	//implement
	Department []depts;

	public Department[] getDepts() {
		return depts;
	}

	public void setDepts(Department[] depts) {
		this.depts = depts;
	}

	public Admin(Department[] depts) {
		super();
		this.depts = depts;
	}
	public String hourlyCompanyMessage() {
		String retour="",name="";
		int i=0;
		for(Department dept:depts) {
			name=dept.getName();
			i++;
			retour+=format(name,dept.nextMessage());
			//System.out.println(retour);
			try {
				dept.getQueue().dequeue();
			} catch (EmptyQueueException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//return format(name,dept.nextMessage());
		}
		//System.
		return retour;
		
		
	}
	public String format(String name,String message) {
		return name+ ": "+message+"\n";
	}
}