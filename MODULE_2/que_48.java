//que-48-->Write a Java program to count the number of key-value (size) mappings
//in a map.

package MODULE_2;

import java.util.HashMap;

public class que_48 {
	public static void main(String[] args) {
		HashMap hm = new HashMap<>();
        hm.put("key1", "value1");
        hm.put("key2", "value2");
        hm.put("key3", "value3");
        int size = hm.size();
        System.out.println(size);
	}
}
