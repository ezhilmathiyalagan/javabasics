package com.basic;

public class Method {
	private char[]Multiple;
	private char[]even;
public boolean Multiple(int one,int two) 
{
		return two % one==0 ?true: false;
	}
	public boolean even(int one)
	{
		return one%2==0?true:false;
	}
	public static void main(String[]arg)
	{
		Method m1=new Method();
		System.out.println(m1.Multiple);
		System.out.println(m1.even);
	}
}
