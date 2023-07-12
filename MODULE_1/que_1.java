//que-1-->Write a Java program to Take three numbers from the user and print the
//greatest number.

package MODULE_1;

import java.util.Scanner;

public class que_1 {
	public static void main(String[] args) {
		  try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Input the 1st num: ");
              int num1 = sc.nextInt();
              System.out.print("Input the 2nd num: ");
              int num2 = sc.nextInt();
              System.out.print("Input the 3rd num: ");
              int num3 = sc.nextInt();
               
              if (num1 > num2)
              {
            	  if (num1 > num3)
            	  {
            		  System.out.println("The greatest number is " + num1);		   
            	  }		  
              }
               
              if (num2 > num1)
              {
            	if (num2 > num3)
            	{
            		System.out.println("The greatest number is " + num2);		   
            	}  
              }
               
               
              if (num3 > num1)
              {		  
            	  if (num3 > num2)
            	  {
            		  System.out.println("The greatest number is " + num3);		   
            	  }
              }
        }
		 }
}
