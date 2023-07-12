//que-23-->W.A.J. P to implement the above program (pro.no-B27) using nesting of
//try-catch block. try { o try o {//code} o catch (Exception e) o {//code}
//o catch (Exception e) o {//code} 

package MODULE_2;

public class que_23 {
	public static void main(String[] args) {
        int[] arr = new int[10];
        try 
        {
	        try 
	        {
	            System.out.println(arr[10]);
	            System.out.println(30 / 0); 
	        }
	        catch (ArrayIndexOutOfBoundsException e) 
	        {
	            System.out.println("An ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
	        }
        }
        catch (ArithmeticException e) 
        {
            System.out.println("An ArithmeticException occurred: " + e.getMessage());
        }
    }
}
