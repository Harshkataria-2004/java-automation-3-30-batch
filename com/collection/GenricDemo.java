package com.collection;

public class GenricDemo {
	public static <E> void printArray(E[] inputArray) 
	{
		for(E e:inputArray)
		{
			System.out.println(e+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Integer intArray[]= {1,2,3,4,5};
		Double doubleArray[]= {1.1,2.2,3.3,4.4,5.5};
		Character charArray[]= {'T','O','P','S'};
		String strArray[]= {"Java","Python","PHP","DM","Automation"};
		
		printArray(intArray);
		printArray(doubleArray);
		printArray(charArray);
		printArray(strArray);;
	}
}
