package com.basic;

public class Arr {
	public static void main(String[]arg) {
		int Squares[]=new int[4];
		for(int i=0;i<Squares.length;i++) {
			Squares[i]=i*2;
			System.out.println(Squares[i]);
		}
		for(int i=0;i<arg.length;i++) {
			System.out.println(arg[i]);
		}
	}

}
