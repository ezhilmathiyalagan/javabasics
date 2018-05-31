package com.basic;

public class Admin {
	public static void main(String[]agr)
	{
		Employe employe1=new Employe();
		employe1.setFirstname("firstname");
		employe1.setLastname("lastname");
		employe1.setSalary(25000.00);
		Employe employe2=new Employe();
		employe2.setFirstname("firstname");
		employe1.setLastname("Lastname");
		employe2.setSalary(25500.00);
		double salary=employe1.getSalary();
		salary = salary*1.1;
		employe1.setSalary(salary);
		System.out.println(employe1.getSalary());
}
}