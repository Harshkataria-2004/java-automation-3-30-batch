//que-35-->Write a Java program to iterate through all elements in an array list. 

package MODULE_2;

import java.util.ArrayList;
import java.util.Iterator;

public class que_35 {
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
		
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
    }
}
