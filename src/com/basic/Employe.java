package com.basic;

public class Employe {
	 private String firstname;
	private String lastname;
	 private double salary;
	public Employe()
	{
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public static void main(String[]agr)
	{
		Employe employe1=new Employe();
		employe1.setFirstname("ezhil");
		employe1.setLastname("mathiyalagan");
		employe1.setSalary(25000.00);
		Employe employe2=new Employe();
		employe2.setFirstname("sindhu");
		employe1.setLastname("mathiyalagan");
		employe2.setSalary(25500.00);
		System.out.println(employe1.getSalary());
		System.out.println(employe2.getSalary());
		double salary=employe1.getSalary();
		salary = salary*1.1;
		employe1.setSalary(salary);
		System.out.println(employe1.getSalary());
		
	}

}
