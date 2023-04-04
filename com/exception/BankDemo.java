package com.exception;

import java.util.Scanner;

public class BankDemo {
	public static void main(String[] args) {
		double amount;
		Scanner sc=new Scanner(System.in);
		System.out.println("*******************************************");
		System.out.print("Enter Account Number : ");
		int acno=sc.nextInt();
		System.out.println("*******************************************");
		System.out.print("Enter Customer Name : ");
		String cname=sc.next();
		System.out.println("*******************************************");
		System.out.println("Enter Initial Balance : ");
		double balance=sc.nextInt();
		System.out.println("*******************************************");
		CheckingAccount c=new CheckingAccount(acno, cname, balance);
		while(true)
		{
			System.out.println("*******************************************");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Check Balance");
			System.out.println("4. Exit");
			System.out.println("*******************************************");
			
			System.out.println("Enter Your Choice : ");
			int choice=sc.nextInt();
			if(choice==1)
			{
				System.out.println("Enter Deposit Amount : ");
				amount=sc.nextInt();
				c.deposit(amount);
				System.out.println("*******************************************");
			}
			else if(choice==2)
			{
				try 
				{
					System.out.println("Enter Withdrawal Amount : ");
					amount=sc.nextInt();
					c.withdraw(amount);
				}
				catch(InSufficientFund e)
				{
					System.out.println("Sorry You Need Another "+e.getAmount());
				}
				System.out.println("*******************************************");
			}
			else if(choice==3)
			{
				c.checkBalance();
				System.out.println("*******************************************");
			}
			else
			{
				System.out.println("Good Bye. Thank You For Using Our Services");
				System.out.println("*******************************************");
				break;
			}
		}
	}
}
