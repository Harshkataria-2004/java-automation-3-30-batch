//que-10-->Write a Java program to print the ASCII value of a given character. 

package MODULE_1;

import java.util.Scanner;

public class que_10 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	     System.out.print("Enter a character: ");
	     char ch = sc.next().charAt(0);
	     int asciiValue = ch;
	     System.out.println("The ASCII value of "+ch+" is: "+asciiValue);
	}
}
