//que-49-->Write a Java program to reverse elements in an array al

package MODULE_2;

import java.util.ArrayList;

public class que_49 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        int start_index = 0;
        int end_index = al.size() - 1;
        while (start_index < end_index) {
            int temp = al.get(start_index);
            al.set(start_index, al.get(end_index));
            al.set(end_index, temp);
            start_index++;
            end_index--;
        }
        System.out.println(al);
	}
}
