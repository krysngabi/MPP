package mpp_march;

public class OrderItem {
private int quantity;
private Product produits;


public OrderItem(int quantity) {
	super();
	this.quantity = quantity;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public Product getProduits() {
	return produits;
}
public void setProduits(Product produits) {
	this.produits = produits;
}

}
