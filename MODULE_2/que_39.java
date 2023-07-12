//que-39-->Write a Java program to remove the third element from an array list. 

package MODULE_2;

import java.util.ArrayList;

public class que_39 {
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
		System.out.println(al.remove(3));
		System.out.println(al);
	}
}
