import java.util.ArrayList;
import java.util.List;

public class Department {
	private String name, location;
	private List<Position> positions;
	
	

	public Department(String name, String location) {
		super();
		this.name = name;
		this.location = location;
		this.positions = new ArrayList<>();
	}



	public void print() {
		for(Position pos:positions) {
			System.out.print(pos.getTitle());
			System.out.print(" ");
		}

	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getLocation() {
		return location;
	}



	public void setLocation(String location) {
		this.location = location;
	}



	public List<Position> getPositions() {
		return positions;
	}



	public void setPositions(List<Position> positions) {
		this.positions = positions;
	}
	public void addPositions(Position pos) {
		positions.add(pos);
	}
}
