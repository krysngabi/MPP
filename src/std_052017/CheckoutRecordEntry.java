package std_052017;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CheckoutRecordEntry {
	private LendingItem lendingitem;
	private LocalDate checkoutDate,dueDate;
	private ItemType itemtype;

	public CheckoutRecordEntry(LendingItem lendingitem, LocalDate checkoutDate, LocalDate dueDate, ItemType itemtype) {
		super();
		this.lendingitem = lendingitem;
		this.checkoutDate = checkoutDate;
		this.dueDate = dueDate;
		this.itemtype = itemtype;
	}

	public LocalDate getCheckoutDate() {
		return checkoutDate;
	}

	public void setCheckoutDate(LocalDate checkoutDate) {
		this.checkoutDate = checkoutDate;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public LendingItem getLendingitem() {
		return lendingitem;
	}

	public void setLendingitem(LendingItem lendingitem) {
		this.lendingitem = lendingitem;
	}

	public ItemType getItemtype() {
		return itemtype;
	}

	public void setItemtype(ItemType itemtype) {
		this.itemtype = itemtype;
	}
	
}
