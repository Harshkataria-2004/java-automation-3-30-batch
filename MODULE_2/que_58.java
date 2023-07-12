//que-58-->Write a Java program to replace the second element of an ArrayList with
//the specified element. 

package MODULE_2;

import java.util.ArrayList;

public class que_58 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Zero");
		al.add("First");
		al.add("Second");
		al.add("Third");
		al.add("Fourth");
		al.add("Fifth");
		for (int i = 0; i < al.size(); i++) 
		{
			System.out.println("element at : " + i + " : " + al.get(i));
		}
	}
}
