package ordersystem;

public class Product implements ICompPoints,IProduct {
private String description,productNumber;
private double price;
private ICompPoints ICompPoints;


public Product(String description, String productNumber, double price) {
	super();
	this.description = description;
	this.productNumber = productNumber;
	this.price = price;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getProductNumber() {
	return productNumber;
}
public void setProductNumber(String productNumber) {
	this.productNumber = productNumber;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public double getPoints() {
	 //
	return 0;
}
public ICompPoints getICompPoints() {
	return ICompPoints;
}
public void setICompPoints(ICompPoints iCompPoints) {
	this.ICompPoints = iCompPoints;
}




}
