package com.basic;

public class Invoice {
	String number;
	String description;
	int quantity;
	double price;
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String i) {
		this.description = i;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		if(quantity<0) {
		this.quantity = 0;
	}else {
		this.quantity=quantity;
	}
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(price<0.0) {
			this.price=0.0;
		}else {
		this.price = price;
		}
	}
	public double getInvoiceAmount()
	{
		return quantity*price;
	}
public static void main(String[]arg)
{
Invoice e1=new Invoice();
e1.setQuantity(10);
e1.setDescription("bolt");
e1.setPrice(200);
System.out.println(e1.getQuantity());
System.out.println(e1.getInvoiceAmount());






	
}
}
