package std_062017;

abstract public class Student {
	private String name;
	abstract double computeGpa();
	
	

	public Student(String name) {
		super();
		this.name = name;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
