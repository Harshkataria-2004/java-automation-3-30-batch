//que-61-->• Write a Java program to get a collection view of the values contained in
//this map.

package MODULE_2;

import java.util.Collection;
import java.util.HashMap;

public class que_61 {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "Zero");
		hm.put(1, "One");
		hm.put(2, "Two");
		hm.put(3, "Three");
		hm.put(4, "Four");
		System.out.println("Map : " + hm);
		Collection<String> c = hm.values();
		System.out.println("Values In This Map : " + c);

	}
}
