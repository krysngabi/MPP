package lab3;

public class Fedex extends ACarrier {

	public double getPrice(Package pack) {
		double rate = 0.0;
		switch (pack.getZone()) {
		case "IA":
		case "MT":
		case "OR":
		case "CA":
			rate = 0.35;
			break;
		case "TX":
		case "UT":
			rate = 0.30;
			break;
		case "FL":
		case "MA":
		case "OH":
			rate = 0.55;
			break;
		default:
			rate = 0.43;
		}
		return rate*pack.getWeight();

	}


	

}
