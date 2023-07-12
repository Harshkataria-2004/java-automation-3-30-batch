//que-55-->Write a Java program to convert a hash set to a List/ArrayList. 

package MODULE_2;

import java.util.ArrayList;
import java.util.HashSet;

public class que_55 {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("abc");
		hs.add("pqr");
		hs.add("xyz");
		hs.add("lmn");
		ArrayList<String> al = new ArrayList<>(hs);
		System.out.println(+ al);
	}
}
