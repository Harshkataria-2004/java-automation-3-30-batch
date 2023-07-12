//que-54-->Write a Java program to convert a hash set to an array. 

package MODULE_2;

import java.util.Arrays;
import java.util.HashSet;

public class que_54 {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("abc");
		hs.add("pqr");
		hs.add("xyz");
		hs.add("lmn");
		String[] arr = hs.toArray(new String[hs.size()]);
		System.out.println(Arrays.toString(arr));
	}
}
