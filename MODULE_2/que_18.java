//que-18-->Write a program to print the factorial of a number by defining a method named
//'Factorial'. Factorial of any number n is represented by n! and is equal to
//1*2*3*. *(n-1) *n. E.g.- o 4! = 1*2*3*4 = 24 o 3! = 3*2*1 = 6 o 2! = 2*1 =
//2 o Also, 1! = 1 o 0! = 0 

package MODULE_2;

public class que_18 {
	static int factorial(int n) {
	    if (n==0) 
	    {
	      return 0;
	    }
	    else if (n==1) 
	    {
	      return 1;
	    }
	    else 
	    {
	      return n*factorial(n-1);
	    }
	}
	  public static void main(String[] args) {
	    int n = 10;
	    int fact = factorial(n);
	    System.out.println("The factorial of " + n + " is: " + fact);
	  }
}
