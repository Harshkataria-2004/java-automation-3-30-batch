//que-5-->W.A.J.P to find all interleaving of given strings.
//The given strings are: WX YZ
//The interleaving strings are: YWZX WYZX YWXZ WXYZ YZWX WYXZ 

package MODULE_2;

import java.util.HashSet;
import java.util.Set;

public class que_5 {
	    public static void generateInterleavings(String s1, String s2, String interleaved, Set<String> result) {
	        if (s1.isEmpty() && s2.isEmpty()) {
	            result.add(interleaved);
	            return;
	        }
	        if (!s1.isEmpty()) {
	            generateInterleavings(s1.substring(1), s2, interleaved + s1.charAt(0), result);
	        }
	        if (!s2.isEmpty()) {
	            generateInterleavings(s1, s2.substring(1), interleaved + s2.charAt(0), result);
	        }
	    }

	    public static Set<String> findAllInterleavings(String s1, String s2) {
	        Set<String> result = new HashSet<>();
	        generateInterleavings(s1, s2, "", result);
	        return result;
	    }
	    public static void main(String[] args) {
	        String s1 = "wx";
	        String s2 = "yz";
	        Set<String> interleavings = findAllInterleavings(s1, s2);
	        System.out.println("The given strings are: " + s1 + " " + s2);
	        System.out.println("The interleaving strings are: " + interleavings);
	    }
}