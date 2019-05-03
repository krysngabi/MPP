package std_052017;

import java.util.ArrayList;
import java.util.List;

public class CheckoutRecord {
	
List<CheckoutRecordEntry> checkoutentries=new ArrayList<CheckoutRecordEntry>();
	
	public void addCheckoutEntry(CheckoutRecordEntry ckout) {
		checkoutentries.add(ckout);
	}

	public List<CheckoutRecordEntry> getCheckoutentries() {
		return checkoutentries;
	}

	public void setCheckoutentries(List<CheckoutRecordEntry> checkoutentries) {
		this.checkoutentries = checkoutentries;
	}
	
}
