package lab5_1;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Order {
private double orderNo,orderAmount;
private LocalDate orderDate;
private Commissioned commissioned;

public Order(double orderNo, double orderAmount, LocalDate orderDate) {
	super();
	this.orderNo = orderNo;
	this.orderAmount = orderAmount;
	this.orderDate = orderDate;
}

public double getOrderNo() {
	return orderNo;
}
public void setOrderNo(double orderNo) {
	this.orderNo = orderNo;
}
public double getOrderAmount() {
	return orderAmount;
}
public void setOrderAmount(double orderAmount) {
	this.orderAmount = orderAmount;
}
public LocalDate getOrderDate() {
	return orderDate;
}
public void setOrderDate(LocalDate orderDate) {
	this.orderDate = orderDate;
}

public Commissioned getCommissioned() {
	return commissioned;
}

public void setCommissioned(Commissioned commissioned) {
	this.commissioned = commissioned;
}



}
