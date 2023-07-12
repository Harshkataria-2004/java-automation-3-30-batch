//que-57-->Write a Java program to increase the size of an array list.

package MODULE_2;

import java.util.ArrayList;

public class que_57 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		System.out.println(">>\tBefore Arra-List Size = " + al.size());
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		System.out.println(al.size());
		al.add(6);
		al.add(7);
		al.add(8);
		al.add(9);
		System.out.println(al.size());
	}
}
