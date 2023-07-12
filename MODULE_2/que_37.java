//que-37-->Write a Java program to retrieve an element (at a specified index) from a
//given array list. 

package MODULE_2;

import java.util.ArrayList;

public class que_37 {
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
        System.out.println(al.get(3));
        System.out.println(al);
	}
}
