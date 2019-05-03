
public class Position {
	private String title, description;
	private Employee employee;
	

	public Position(String title, String description) {
		super();
		this.title = title;
		this.description = description;
	}

	public Position(String title, String description, Employee employee) {
		super();
		this.title = title;
		this.description = description;
		this.employee = employee;
	}

	public void print() {
		System.out.println(title+"=>"+description);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	
	
	
	
}
