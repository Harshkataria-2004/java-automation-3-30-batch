//que-46-->Write a Java program to get the number of elements in a hash set. 

package MODULE_2;

import java.util.HashSet;

public class que_46 {
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(10);
		hs.add(10.10);
		hs.add("tops");
		hs.add('t');
		hs.add(true);
		hs.add("Java");
		hs.add(null);
		hs.add(10);
		System.out.println(hs);
		int elements = hs.size();
	    System.out.println(elements);
	}
}
