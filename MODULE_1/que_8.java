package MODULE_1;

import java.util.Scanner;

//que-8.Write a Java program that reads a positive integer and count the number of
//digits the number. 

public class que_8 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number :");
	int num=sc.nextInt();
	int count = 0;
	if(num<0)
	{
		System.out.println("Enter a positive number");
	}
	else
	{
		if(num<10000000000L)
		{
			while (num != 0) 
			{
				num /= 10;
				++count;
			}	
		}
		else {
			System.out.println("Number out of range");
		}
	}	
	System.out.println("Number of digits: " + count);
	}
}
