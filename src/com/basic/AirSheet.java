package com.basic;
import java.io.*;

public class AirSheet {

		public static void main(String args[])throws Exception
		{
		int sea[]=new int[10];
		int ch,cho,ref=0,ree=5;
		String na[]=new String[10];
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		do
		{
		System.out.println("Welcome Private Airlience");
		System.out.println("Press 1 -> First Class");
		System.out.println("Press 2 -> Economy's Class");
		System.out.println("Enter your Choice");
		ch=Integer.parseInt(br.readLine());
		switch(ch)
		{
		case 1:
		if(ref<=4)
		{
		System.out.println("Enter your name");
		na[ref]=br.readLine();
		sea[ref]=ref+1;
		ref++;

		}
		break;

		case 2:
		if(ree>=5 && ree<=7)
		{
		System.out.println("Enter Your name");
		na[ree]=br.readLine();
		sea[ree]=ree+1;
		ree++;

		}
		else
		{
		if(ref<=5)
		{
		System.out.println("economy section full. ");
		System.out.println("Are you want seat in first class press[1-yes / 2-no]");
		cho=Integer.parseInt(br.readLine());

		if(cho == 1)
		{
		//continue A1;

		System.out.println("Enter your name");
		na[ref]=br.readLine();
		sea[ref]=ref+1;
		ref++;

		}


		}

		}

		}
		System.out.println("Are you want to coninue press[1-yes / 2-no]");
		cho=Integer.parseInt(br.readLine());
		}while(cho==1);
		for(int i=0;i<=9;i++)
		{
		System.out.println("name : "+na[i]+"\t seat no. :"+sea[i]);
		}

		}
		}

