package std_052017;

import java.util.*;

public class Admin {
	//Returns phone numbers (in sorted order) of the Library Members who have ever checked out the specified lending item
	public static List<String> getPhoneNums(LibraryMember[] members, LendingItem item) {
		List<String> phoneNums = new ArrayList<>();
		//implement
		for(LibraryMember libm:members) {
			CheckoutRecord chckRecord=libm.getCheckoutRecord();
			List<CheckoutRecordEntry> chentrList=chckRecord.getCheckoutentries();
			
			for(CheckoutRecordEntry entry:chentrList) {
				
					if(entry.getLendingitem().equals(item)) {
						phoneNums.add(libm.getPhone());
						//System.out.println(libm.getPhone());
				
					}
			
			
		}
		Collections.sort(phoneNums);
		
	}
		return phoneNums;
}
}
	
