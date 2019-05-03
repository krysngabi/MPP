package lab3;

public class UsMail extends ACarrier{
	private double rate;
	
	public double getPrice(Package pack) {
		double weight=pack.getWeight();
		if(weight<3) {
			return 1;
		}else {
		return 0.55*weight;
		}
		
	}

	

}
