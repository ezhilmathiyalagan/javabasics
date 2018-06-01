package com.basic;

public class Number {
	public static void main(String[]arg) 
	{ 
			int n=1234;
		int number[]=new int[10];
		for(int i=0;i<number.length;i++)
		{
			number[i]=n%10;
			n/=10;
			System.out.print( number[i]);
		}
	}

}
