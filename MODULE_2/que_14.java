//que-14-->Print the sum, difference and product of two complex numbers by creating a
//class named 'Complex' with separate methods for each operation whose real
//and imaginary parts are entered by user. 

package MODULE_2;

public class que_14 {
	  double real;
	  double imag;

	  public que_14(double real, double imag) {
	        this.real = real;
	        this.imag = imag;
	  }
	  public static void main(String[] args) {
	    	que_14 n1 = new que_14(2.3, 4.5),
	                n2 = new que_14(3.4, 5.0),
	                temp1,temp2;
	        temp1 = add(n1, n2);
	        temp2 = sub(n1, n2);
	        System.out.printf("Sum = %.1f + %.1fi", temp1.real, temp1.imag);
	        System.out.println();
	        System.out.printf("Subtraction = %.1f + %.1fi", temp2.real, temp2.imag);
	  }
	  public static que_14 add(que_14 n1, que_14 n2)
	    {
	    	que_14 temp = new que_14(0.0, 0.0);
	        temp.real = n1.real + n2.real;
	        temp.imag = n1.imag + n2.imag;
	        return(temp);
	    }
	    public static que_14 sub(que_14 n1, que_14 n2)
	    {
	    	que_14 temp = new que_14(0.0, 0.0);
	        temp.real = n1.real - n2.real;
	        temp.imag = n1.imag - n2.imag;

	        return(temp);
	    }

}
