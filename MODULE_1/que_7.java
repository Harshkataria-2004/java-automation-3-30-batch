package MODULE_1;

//que-7.Write a program in Java to make such a pattern like right angle triangle with
//number increased by 1 The pattern like:
//1
//2 3
//4 5 6
//7 8 9 10

public class que_7 {
	public static void main(String[] args)
	{
		int row = 4, n = 1;
	    for(int i = 1; i <= row; i++) {
	      for(int j = 1; j <= i; j++) {
	        System.out.print(n + " ");
	        ++n;
	      }
	      System.out.println();
	    }
	}
}
