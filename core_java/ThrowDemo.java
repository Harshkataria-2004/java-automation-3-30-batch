//package core_java;
//
//import java.util.Scanner;
//
//public class ThrowDemo {
//	public static void demo() {
//		int x;
//		Scanner sc=new Scanner(System.in);
//		try {
//			System.out.print("Enter X : ");
//			x=sc.nextInt();
//			if(x>0)
//			{
//				System.out.println("Square of  "+x+" is "+(x*x));
//			}
//			else 
//			{
//				throw new Exception();
//			}
//		}
//		catch (Exception e) {
//			System.out.println("Please Enter Positive Values Only");
//			demo();
//		}
//	}
//	public static void main(String[] args) {
//		demo();
//	}
//}




package core_java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowDemo {
	public static void demo() throws ArithmeticException,InputMismatchException,ArrayIndexOutOfBoundsException {
		int x;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter X : ");
		x=sc.nextInt();
		if(x>0)
		{
			System.out.println("Square of  "+x+" is "+(x*x));
		}
		else 
		{
			throw new ArithmeticException();
		}
	}
	public static void main(String[] args) {
		try
		{
			demo();
		}
		catch(Exception e)
		{
			System.out.println("Exception Caught");
		}
		finally
		{
			System.out.println("Finally Called");
		}
	}
}
