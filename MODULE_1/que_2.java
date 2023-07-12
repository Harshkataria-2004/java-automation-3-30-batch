//que-2-->Write a Java program that takes the user to provide a single character from
//the alphabet. Print Vowel or Consonant, depending on the user input. If the
//user input is not a letter (between a & z or A and Z), or is a string of length
//> 1, print an error message. 

package MODULE_1;

import java.util.Scanner;

public class que_2 {
	  public static void main(String[] args) {
		  	Scanner sc = new Scanner(System.in);
		  	System.out.println("Enter a alphabet : ");
			String ch = sc.next();
	        int len=ch.length();
	        if(len==1)
	        {
	        	if(ch.charAt(0) == 'a' || ch.charAt(0) == 'e' || ch.charAt(0) == 'i' || ch.charAt(0) == 'o' || ch.charAt(0) == 'u' )
	        	{
	        		System.out.println(ch + " is vowel");	        		
	        	}
	        	else
	        	{
	        		System.out.println(ch + " is consonant");	        		
	        	}
	        }
	        else if(len!=1) 
	        {
	        	System.out.println("Enter a single letter");
	        }
	  }
}
