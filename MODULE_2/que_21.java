//que-21-->Take two numbers from the user and perform the division operation and
//handle Arithmetic Exception. O/P- Enter two numbers: 10 0 o Exception
//in thread main java.lang.ArithmeticException:/ by zero 

package MODULE_2;

import java.util.Scanner;

public class que_21 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2:");
        int num2 = sc.nextInt();
        try 
        {
            System.out.println(num1 / num2);
        }
        catch (ArithmeticException e) 
        {
            System.out.println("Exception in thread main java.lang.ArithmeticException:/ by zero");
        }
    }
}
