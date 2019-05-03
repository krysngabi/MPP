import java.util.ArrayList;
import java.util.List;

public class Company {
	private String name;
	private List<Department> departments;
	
	
	public Company(String namex) {
		super();
		this.name = namex;
		this.departments = new ArrayList<>();
	}


	public void print() {
		 List<Position> positions=new ArrayList<>();
		 System.out.println("#### "+name+"####");
		for (Department dept:departments) {
			System.out.println(dept.getName());
			dept.print();
			/*positions=dept.getPositions();
			for(Position mpos:positions) {
				System.out.print(mpos.getTitle()+" ");
				
			}*/
			System.out.println("");
			
			
		}
		
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
	

}
