//que-50-->Write a Java program to extract a portion of an array list. 

package MODULE_2;

import java.util.ArrayList;

public class que_50 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int start_index = 2;
        int end_index = 4;
        ArrayList<Integer> extracted_portion = list.subList(start_index, end_index + 1);
        System.out.println(extracted_portion);
	}
}
