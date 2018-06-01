package com.basic;

public class MinMax {
	public static void main(String[]arg) {
	
int array[]= new int[]{3,4,5,2,33,24,2};
int max=getMax(array);
System.out.println("Maximum value is"+max);
int min=getMin(array);
System.out.println("Minimum value is"+min);
	}
public static int getMax(int[]inputArray) {
	int maxvalue=inputArray[0];
	for(int i=1;i<inputArray.length;i++) {
	if(inputArray[i]>maxvalue) {
		maxvalue=inputArray[i];
	}
	}
	return maxvalue;
}
public static int getMin(int[]inputArray) {
	int minvalue=inputArray[0];
	for(int i=1;i<inputArray.length;i++) {
	if(inputArray[i]<minvalue) {
		minvalue=inputArray[i];
	}
	}
	return minvalue;
}
}
