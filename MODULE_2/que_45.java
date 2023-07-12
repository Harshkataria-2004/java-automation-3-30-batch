//que-45-->Write a Java program to iterate through all elements in a hash list

package MODULE_2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class que_45 {
	public static void main(String[] args) {
		HashMap map=new HashMap();
		map.put(101, "Harsh");
		map.put(781, "Anjali");
		map.put(340, "Vraj");
		map.put(908, "Veer");
		map.put(451, "Archana");
		map.put(765, "Sharddha");
		System.out.println(map);
		Set set=map.entrySet();//map cannot be iterated so we have to convert it to set
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
