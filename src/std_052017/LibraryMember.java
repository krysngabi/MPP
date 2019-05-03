package std_052017;

public class LibraryMember {
	private String memberId,firtsName,lastName,phone;
	private CheckoutRecord CheckoutRecord;

	public LibraryMember(String memberId, String firtsName, String lastName, String phone) {
		super();
		this.memberId = memberId;
		this.firtsName = firtsName;
		this.lastName = lastName;
		this.phone = phone;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getFirtsName() {
		return firtsName;
	}

	public void setFirtsName(String firtsName) {
		this.firtsName = firtsName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public CheckoutRecord getCheckoutRecord() {
		return CheckoutRecord;
	}

	public void setCheckoutRecord(CheckoutRecord checkoutRecord) {
		CheckoutRecord = checkoutRecord;
	}
	
}
