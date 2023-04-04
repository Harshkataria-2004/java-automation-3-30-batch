package core_java;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Exception : An abnormal situation that arises during the run time 
 * of a program is called Exception
 * 
 * */



public class ExceptionDemo {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Start Code");
		try {
			System.out.print("Enter A : ");
			a=sc.nextInt();
			System.out.print("Enter B : ");
			b=sc.nextInt();
			c=a/b;
			System.out.println("Division : "+c);
		}
//		catch(ArithmeticException e)
//		{
//			System.out.println("Excepion Caught : "+e);
//		}
//		catch(InputMismatchException e)
//		{
//			System.out.println("Excepion Caught : "+e);
//		}
		catch(Exception e)
		{
			System.out.println("Excepion Caught : "+e);
		}
		System.out.println("End Code");
	}
}
