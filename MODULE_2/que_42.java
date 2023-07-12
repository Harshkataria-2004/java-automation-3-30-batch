//que-42-->Write a Java program to copy one array list into another

package MODULE_2;

import java.util.ArrayList;

public class que_42 {
	public static void main(String[] args) {
		ArrayList<Integer> source = new ArrayList<>();
        source.add(1);
        source.add(2);
        source.add(3);
        source.add(4);
        source.add(5);

        ArrayList destination = new ArrayList<>();
        for (Integer element : source) 
        {
            destination.add(element);
        }
        System.out.println(destination);
	}
}
