//que-38-->Write a Java program to update specific array element by given element. 

package MODULE_2;

import java.util.ArrayList;

public class que_38 {
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
		System.out.println(al.set(3, "tops"));
		System.out.println(al);
	}
}
