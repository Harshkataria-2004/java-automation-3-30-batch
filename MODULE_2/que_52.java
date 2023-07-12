//que-52-->Write a Java program of swap two elements in an array list. 

package MODULE_2;

import java.util.ArrayList;
import java.util.Collections;

public class que_52 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Zero");
		al.add("first");
		al.add("second");
		al.add("third");
		al.add("fourth");
		System.out.println("Before Swap : " + al);
		Collections.swap(al, 2, 4);
		System.out.println("After Swap : " + al);
	}
}
