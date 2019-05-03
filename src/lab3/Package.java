package lab3;

import java.util.ArrayList;
import java.util.List;

 public class Package {
private String description;
private double weight;
private String zone;
private List<ACarrier> carriers;
public Package(String description, double weight, String zone) {
	super();
	this.description = description;
	this.weight = weight;
	this.zone = zone;
	carriers=new ArrayList<ACarrier>();
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public double getWeight() {
	return weight;
}

public void setWeight(double weight) {
	this.weight = weight;
}

public String getZone() {
	return zone;
}

public void setZone(String zone) {
	this.zone = zone;
}
public void addCarrier(ACarrier carrier ) {
	carriers.add(carrier);
}

 public void minSort() {
	 List<Package> mpack=new ArrayList<Package>();
	 Package mypack=new Package(description, weight, zone);
	 double min=carriers.get(0).getPrice(mypack);
	 
	 String carrier=carriers.get(0).getClass().getSimpleName();
	 int counter=0;
	 for( int i=1;i<carriers.size();i++) {
		Double price=carriers.get(i).getPrice(mypack);
		if(min>price) {
			min=price;
			carrier=carriers.get(i).getClass().getSimpleName();
		}else {
			min=price;
			
		}
				
	 }
	System.out.println( description+"\t "+carrier+"\t  $ "+min);
 }
}
