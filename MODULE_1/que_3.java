package MODULE_1;

import java.util.Scanner;

//que-3.Write a Java program that takes a year from user and print whether that year
//is a leap year or not.
public class que_3 {
	  public static void main(String[] args)
	    {
	        try (Scanner sc = new Scanner(System.in)) {
				System.out.print("Enter a year");
				int year = sc.nextInt();

				if ((year % 4) == 0 && ( (year % 100) != 0|| ((year % 100 == 0) && (year % 400 == 0))))
				{
				    System.out.println(year + " is a leap year");
				}
				else
				{
				    System.out.println(year + " is not a leap year");
				}
			}
	    }
}
