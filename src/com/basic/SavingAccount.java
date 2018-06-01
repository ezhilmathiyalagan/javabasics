package com.basic;

public class SavingAccount {
static int InterestRate;
private double SavingBalance;
public SavingAccount(double balance) {
	this.SavingBalance=balance;
}
public void MonthlyInterest() {
	double interest=(SavingBalance*(InterestRate/100.0)/12);
	SavingBalance=SavingBalance+interest;
}
public static void modifyIntersetRate(int newValue) {
	InterestRate=newValue;
}
public void showbalance() {
	System.out.println("balance" + SavingBalance);
}
;public static void main (String[]arg) {
	SavingAccount saver1=new SavingAccount(2000);
	SavingAccount saver2=new SavingAccount(3000);
	SavingAccount.modifyIntersetRate(4);
	saver1.MonthlyInterest();
	saver2.MonthlyInterest();
	saver1.showbalance();
	saver2.showbalance();
	SavingAccount.modifyIntersetRate(5);
	saver1.MonthlyInterest();
	saver2.MonthlyInterest();
	saver1.showbalance();
	saver2.showbalance();
	
	
}
}

