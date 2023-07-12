//que-59-->Write a Java program to print all the elements of an ArrayList using the
//position of the elements. 

package MODULE_2;

import java.util.ArrayList;

public class que_59 {
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
			System.out.println("element At : " + i + " -> " + al.get(i));
		}
	}
}
