package std_032018.prob2;

public class Student {
	private String firstName,lastName;
	 PlanOfStudy planOfStudy;
	private Transcript transcript;
	
	

	public Student(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.planOfStudy=new PlanOfStudy();
		this.transcript=new Transcript();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public PlanOfStudy getPlanOfStudy() {
		return planOfStudy;
	}

	public void setPlanOfStudy(PlanOfStudy planOfStudy) {
		this.planOfStudy = planOfStudy;
	}

	public Transcript getTranscript() {
		return transcript;
	}

	public void setTranscript(Transcript transcript) {
		this.transcript = transcript;
	}
	

}
