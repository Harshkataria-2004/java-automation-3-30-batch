//que-44-->Write a Java program to append the specified element to the end of a hash
//set. 

package MODULE_2;

import java.util.HashSet;

public class que_44 {
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
		int element=5;
		hs.add(element);
		System.out.println(hs);
	}
}
