package core_java;

import java.util.Scanner;

/*Data Type
 * 
 * 1.byte --> 1 byte
 * 2.short --> 2 byte
 * 3.int --> 4 byte
 * 4.long --> 8 byte
 * 5.float --> 4 byte
 * 6.double -->8 byte
 * 7. char Single character at a time
 * 8.boolean true/false
 * 
 * Variable : it is a data name and is used to store the data value.
 * 
 * 1.Must start with an alphabet.
 * 2.Upper case and Lower case are significant.
 * 
 * int a;
 * A=10;wrong
 * 
 * ASCII : American Standard Code FOr Information Interchange
 * A-Z : 65 to 90
 * a-z :97 to 122
 * 
 * 3.Keyword is not allowed as a variable name.
 * int void;wrong
 * int WRONG;correct
 * 
 * 4.Space is not allowed between name.
 */

public class sample {
	public static void main(String[] args) {
//		System.out.println("Welcome to Java");
//		System.out.println("Java is Best");
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A : ");
		a=sc.nextInt();
		System.out.println("Enter B : ");
		b=sc.nextInt();
		c=a+b;
		System.out.println("Addition : "+c);
	}
}
