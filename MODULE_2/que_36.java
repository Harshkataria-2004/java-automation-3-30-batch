//que-36-->Write a Java program to insert an element into the array list at the first
//position. 

package MODULE_2;

import java.util.ArrayList;

public class que_36 {
	public static void main(String[] args) {
        // Create a new array list
        ArrayList<String> colors = new ArrayList<>();

        // Add some colors to the array list
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        // Insert a new color at the first position
        colors.add(0, "Pink");

        // Print out the array list
        System.out.println("The colors are: " + colors);
    }
}
