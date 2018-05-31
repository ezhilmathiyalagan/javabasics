package com.basic;

public class Methods {public static void main(String[]arg) {
	Methods m1=new Methods();
	System.out.println("Is 4 is Multiple of 2"+m1.IsMultiple(4,2));
}
	public boolean IsMultiple(int one,int two)
	{
return two%one==0 ?true:false;
	}
}
