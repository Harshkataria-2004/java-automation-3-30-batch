//que-40-->Write a Java program to search an element in an array list.

package MODULE_2;

import java.util.ArrayList;

public class que_40 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(10.10);
		al.add("tops");
		al.add('t');
		al.add(true);
		al.add(null);
		al.add(10);
		System.out.println(al);
		System.out.println(al.indexOf(10.10));
	}
}
