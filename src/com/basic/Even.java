package com.basic;

public class Even {
public boolean iseven(int one) {
	return one%2==0 ? true:false;
}
public static void main(String[]arg) {
	Even e1=new Even();
	System.out.println("Is 5 is even number"+e1.iseven(5));
	
}
}
