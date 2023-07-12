//que-3-->W.A.J.P to compare a given string to the specified character sequence.
//Comparing topsint.com and topsint.com: true Comparing Topsint.com and
//topsint.com: false

package MODULE_2;

import java.util.Scanner;

public class que_3 {
	public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);
		System.out.println("Enter string 1 : ");
		String str1 = sc.next();
		System.out.println("Enter string 2 : ");
        String str2 = sc.next();
        System.out.println("Comparing "+str1+" and " +str2 + " : " + str1.equals(str2));
	}
}
