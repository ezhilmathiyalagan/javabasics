package com.basic;

public class Sta {
static int count=10;
private static Sta sta;
static{
	count++;
	System.out.println("First static block" +count);
}
public Sta() {
	count++;
	System.out.println("Constructors"+count);
}
public void getItem() {
	count++;
	System.out.println("Instance"+count);
}
public static void getCus() {
	count++;
	System.out.println("static()"+count);
}
public static void main(String[]arg) {
	Sta.sta=new Sta();
	sta.getItem();
	sta.getCus();
	sta.count++;
}
}
