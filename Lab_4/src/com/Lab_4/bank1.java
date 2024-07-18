package com.Lab_4;

public class BankAccount 
{
	String AccountNumber;
	double balance;
	
	BankAccount(String AccountNumber, double balance)
	{
		this.AccountNumber = AccountNumber;
		this.balance = balance;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void deposit(double amt)
	{
		balance = balance + amt;
	}
	
	public void withdraw(double amt)
	{
		if(amt <= balance)
		{
			balance = balance - amt;
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
	}
}

class SavingsAcoount extends BankAccount
{
	double withdrawalLimit;
	
	SavingsAcoount(String AccountNumber, double balance, double withdrawalLimit) {
		super(AccountNumber, balance);
		this.withdrawalLimit = withdrawalLimit;
	}
	
	public void withdraw(double amt)
	{
		if(amt <= withdrawalLimit)
		{
			super.withdraw(amt);
		}
		else
		{
			System.out.println("Withdrawal limit exceeded");
		}
	}
	
}

class CheckingAcoount extends BankAccount
{
	double overdraftFee;

	CheckingAcoount(String AccountNumber, double balance, double overdraftFee) {
		super(AccountNumber, balance);
		this.overdraftFee = overdraftFee;
	}
	
	public void withdraw(double amt)
	{
		if(amt <= getBalance())
		{
			super.withdraw(amt);
		}
		else
		{
			System.out.println("Overdraft fee applied.");
		    super.withdraw(amt + overdraftFee);
		}
	}	
}

public class bank1 {

	public static void main(String[] args) {
		
		SavingsAcoount sa = new SavingsAcoount("sa-8711", 5000, 1000);
		sa.withdraw(800);
		System.out.println("Account Number: " +sa.AccountNumber+ ", Savings Account Balance: " +sa.getBalance());
		
		CheckingAcoount ca = new CheckingAcoount("ca-2211",2000, 100);
		ca.withdraw(200);
		System.out.println("Account Number: " +ca.AccountNumber+ ", Checking Account Balance: " +ca.getBalance());
		
	}

}
