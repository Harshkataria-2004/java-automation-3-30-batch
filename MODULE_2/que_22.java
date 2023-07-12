//que-22-->W.A.J. P to demonstrate multiple catch blocks, (one is to handle divide
//		by zero exception and another one is to handle o Array
//		IndexOutOfBoundException) int a [] =new int [5]; a [5]=30/0;

package MODULE_2;

public class que_22 {
	public static void main(String[] args) {
        int[] arr = new int[10];
        try 
        {
            System.out.println(arr[10]);
            System.out.println(30 / 0); 
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("An ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
        }
        catch (ArithmeticException e) 
        {
            System.out.println("An ArithmeticException occurred: " + e.getMessage());
        }
    }
}
