package com.basic;

public class Reverse {
public static void main(String[]arg) {
	int num =9897;int reverse=0;
	while(num!=0) {
		int digit=num%10;
		reverse=reverse*10+digit;
		num=num/10;
	}
	System.out.println(reverse);
}
}
