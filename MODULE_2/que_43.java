//que-43-->Write a Java program to shuffle elements in an array list

package MODULE_2;

import java.util.ArrayList;
import java.util.Collections;

public class que_43 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        System.out.println(al);
        Collections.shuffle(al);
        System.out.println(al);
	}
}
