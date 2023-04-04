package core_java;

import java.util.Scanner;

/* If Condition
 *
 * 1.Simple if
 * 
 * if(Condition)
 * {
 *  	statement;
 *  }
 *  
 *  2.if/else
 *  
 *  if(Condition)
 *  {
 *  	statement;
 *  }
 *  else
 *  {
 *  	statement;
 *  }
 *  
 *  3.Nested if /else
 *  
 *  if(Condition)
 *  {
 *  	if(Condition)
 *  	{
 *  		statement;
 *  	}
 *  	else
 *  	{
 *  		statement;
 *  	}
 *  }
 *  else
 *  {
 *  	statement;
 *  }
 *  
 *  4.Ladder if/else
 *  
 *  if(Condition)
 *  {
 *  	statement;
 *  }
 *  else if(Condition)
 *  {
 *  	statement;
 *  }
 *  else if(Condition)
 *  {
 *  	statement;
 *  }
 *  else if(Condition)
 *  {
 *  	statement;
 *  }
 *  else if(Condition)
 *  {
 *  	statement;
 *  }
 *  else
 *  {
 *  	statement;
 *  }
 *  
 */



public class ifCondition {
	public static void main(String[] args) {
//		int a;
//		Scanner sc=new Scanner(System.in);
//		System.out.print("Enter A : ");
//		a=sc.nextInt();
//		
//		if(a>0)
//		{
//			System.out.println("A is Positive Number");
//		}
//		else
//		{
//			System.out.println("A is negative Number");
//		}
//		if(a%2==0)
//		{
//			System.out.println("A is Even Number");
//		}
//		else
//		{
//			System.out.println("A is Odd Number");
//		}
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A : ");
		a=sc.nextInt();
		System.out.print("Enter B : ");
		b=sc.nextInt();
		System.out.print("Enter C : ");
		c=sc.nextInt();
		
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("A is Greater Number");
			}
			else
			{
				System.out.println("C is Greater Number");
			}
		}
		else if(b>c)
		{
			System.out.println("B is Greater Number");
		}
		else
		{
			System.out.println("C is greater");
		}
	}
}
