//que-41-->Write a Java program to sort a given array list. 

package MODULE_2;

import java.util.ArrayList;
import java.util.Collections;

public class que_41 {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(5);
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(4);
        Collections.sort(arrayList);
        System.out.println("The sorted array list is: " + arrayList);
	}
}
