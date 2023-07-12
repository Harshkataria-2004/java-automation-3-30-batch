//que-11-->Write a Java program that accepts an integer (n) and computes the value of
//n+nn+nnn. Input number: 5
//5 + 55 + 555 

package MODULE_1;

import java.util.Scanner;

public class que_11 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int sum = n+(n * 11)+(n * 111);
        System.out.println("The sum of " + n + " is : " + sum);
    }
}
