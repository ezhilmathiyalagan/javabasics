package com.basic;

public class DoubleSheet {
	public static void main(String args[])
    {
        double total = 0.0;
            
        for (String s : args)
        {
            double d = Double.parseDouble(s);
            total += d;
        }
        System.out.printf("The sum should appear here: %.2f\n", total);
    }
}


