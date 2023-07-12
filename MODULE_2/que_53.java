//que-53-->Write a Java program to join two array lists. 

package MODULE_2;

import java.util.ArrayList;
import java.util.Collections;

public class que_53 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("abc");
		al.add("pqr");
		al.add("xyz");

		ArrayList<String> a = new ArrayList<String>();
		a.add("43");
		a.add("67");
		a.add("99");
		ArrayList<String> a1 = new ArrayList<String>(al);
		a1.addAll(a);
		System.out.println(a1);
	}
}
