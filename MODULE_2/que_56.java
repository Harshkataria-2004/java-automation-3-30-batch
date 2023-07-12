//que-56-->Write a Java program to check whether a map contains key-value
//mappings (empty) or not. 

package MODULE_2;

import java.util.HashMap;

public class que_56 {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		if (hm.isEmpty()) {
			System.out.println("Map Is Empty");
		}
		else {
			System.out.println("Map Is Not Empty");
		}
		hm.put(1, "abc");
		hm.put(2, "xyz");
		if (hm.isEmpty()) {
			System.out.println("Map Is Empty");
		}
		else {
			System.out.println("Map Is Not Empty");
		}
	}
}
