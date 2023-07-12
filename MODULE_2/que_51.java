//que-51-->Write a Java program to compare two array lists. 

package MODULE_2;

import java.util.ArrayList;

public class que_51 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add("1");
		al.add("2");
		al.add("3");
		al.add("4");
		al.add("5");
		ArrayList<Integer> a = new ArrayList<>();
		a.add("1");
		a.add("2");
		a.add("3");
		a.add("4");
		a.add("5");
		boolean t = al.equals(a);
		if (t) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not Equal");
		}
	}
}
