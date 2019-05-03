package lab3;

public class Ups extends ACarrier {
		public double getPrice(Package pack) {
		double	weight=pack.getWeight();
		return 0.45*weight;
		
	}



}
