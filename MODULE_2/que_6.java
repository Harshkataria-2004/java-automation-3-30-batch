//que-6-->W.A.J.P to find the second most frequent character in a given string. The
//given string is: successes The second most frequent char in the string is: c

package MODULE_2;

import java.util.Scanner;

public class que_6 {
	public static char Secondmost(String str) {
	    int[] count = new int[256];
	    int first=0;
	    int second=0;
	    for (int i = 0; i < str.length(); i++) 
	    {
	        count[str.charAt(i)]++;
	    }
	    for (int i = 0; i < count.length; i++) 
	    {
	        if (count[i] > count[first]) 
	        {
	            second = first;
	            first = i;
	        } 
	        else if (count[i] > count[second] && count[i] != count[first]) 
	        {
	            second = i;
	        }
	    }
	    return (char) second;
	}
	public static void main(String[] args) 
	{
	    String str = "successes";
	    char secondMostFrequentChar = Secondmost(str);
	    System.out.println("The given string is: " + str);
	    System.out.println("The second most frequent char in the string is: " + secondMostFrequentChar);
	}

}
