//que_8-->Create a class to print an integer and a character with two methods having
//the same name but different sequence of the integer and the character
//parameters. For example, if the parameters of the first method are of the form
//(int n, char c), then that of the second method will be of the form (char c, int
//n). 

package MODULE_2;

public class que_8 {	
	public static void main(String[] args) 
	{
		int num = 2;
		char alpha = 'h';
		alphanum(num, alpha);
		alphanum(alpha, num);
	}
	 public static void alphanum(int n,char c) 
	 {
	     System.out.println("The integer is "+n+" and the character is "+c);
	 }

	 public static void alphanum(char c,int n) 
	 {
		 System.out.println("The character is "+c+" and the integer is "+n);
     }
}
