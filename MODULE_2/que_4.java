//que-4-->• W.A.J.P to check whether a given string ends with the contents of another
//string. "Java Exercises" ends with "se"? False "Java Exercise" ends with
//"se"? True

package MODULE_2;

import java.util.Scanner;

public class que_4 {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter string 1 : ");
		 String str1=sc.next();
		 System.out.println("Enter string 2 : ");
	     String str2=sc.next();
	     boolean doesEndWith = str1.endsWith(str2);
	     System.out.println("Does "+str1+" end with "+str2+" : "+str1.endsWith(str2));
	}
}
