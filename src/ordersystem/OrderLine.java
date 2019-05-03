package ordersystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderLine  implements IProduct{
private int quantity;
private double price,points;
private LocalDate shipDate;
private String status;
private Order myorder;
private /*List<IProduct>*/ IProduct products;
private Product product;


public OrderLine(int quantity, double price, double points, LocalDate shipDate, String status) {
	super();
	this.quantity = quantity;
	this.price = price;
	this.points = points;
	this.shipDate = shipDate;
	this.status = status;
}

public void print() {
	
		Product prod=(Product)products;
		System.out.println(prod.getDescription()+" Points "+prod.getICompPoints().getPoints());
	
}

public IProduct getProducts() {
	return products;
}

public void setProducts(IProduct products) {
	this.products = products;
}

public double computePrice() {
	//System.out.println(prod.getDescription()+" * "+products.getPrice()+" "+quantity);
	return quantity*products.getPrice();
}
public double computePoints() {
	Product prod=(Product)products;
	return quantity*prod.getICompPoints().getPoints();
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public double getPoints() {
	return points;
}
public void setPoints(double points) {
	this.points = points;
}
public LocalDate getShipDate() {
	return shipDate;
}
public void setShipDate(LocalDate shipDate) {
	this.shipDate = shipDate;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public Order getMyorder() {
	return myorder;
}
public void setMyorder(Order myorder) {
	this.myorder = myorder;
}
public Product getProduct() {
	return product;
}
public void setProduct(Product product) {
	this.product = product;
}

}
