package com.basic;

public class Perfect {public static void main(String[]arg) {
	Perfect p1=new Perfect();
	System.out.println("Is 7 is a perfect number"+p1.isperfect(7));
}
public boolean isperfect(int number) {
int sum=0;
for(int i=1;i<=number/2;i++)
{
	if(number%i==0) {
		sum =sum+i;
	}
}
if(sum==number) {
	return true;
} 
else {
	return false;
}
}
}


