package lab3;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		ACarrier ups=new Ups();
		ACarrier fedex=new Fedex();
		ACarrier usmail=new UsMail();
		
		List<Package>mpackages=new ArrayList<Package>();
		
		Package p1=new Package("Book",2,"IA") ;
		Package p2=new Package("Phone",4,"MA") ;
		Package p3=new Package("Boots",6,"NY") ;
		
		p1.addCarrier(ups);
		p1.addCarrier(fedex);
		p1.addCarrier(usmail);
		
		p2.addCarrier(ups);
		p2.addCarrier(fedex);
		p2.addCarrier(usmail);
		
		p3.addCarrier(ups);
		p3.addCarrier(fedex);
		p3.addCarrier(usmail);
		
		mpackages.add(p1);
		mpackages.add(p2);
		mpackages.add(p3);
		
		for(Package pack:mpackages) {
			pack.minSort();
		}
		
		
	}

}
