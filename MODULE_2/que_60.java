//que-60-->Write a Java program to compare two sets and retain elements which are
//same on both sets. 

package MODULE_2;

public class que_60 {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		HashSet<String> hs2 = new HashSet<String>();
		hs.add("First");
		hs.add("Second");
		hs.add("Third");
		hs.add("Fourth");
		hs.add("Fifth");

		hs2.add("One");
		hs2.add("Second");
		hs2.add("Three");
		hs2.add("Fourth");
		hs.add("Five");

		System.out.println("First Set : " + hs);
		System.out.println("Second Set : " + hs2);
		hs.retainAll(hs2);
		System.out.println("Common Element Of Both Sets : " + hs);

	}
}
