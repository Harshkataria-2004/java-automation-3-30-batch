package core_java;

import java.util.Iterator;
import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {
//		int a[]=new int[5];
//		int i;
//		Scanner sc=new Scanner(System.in);
//		
//		System.out.println("Enter array Elements");
//		for (i=0;i<a.length;i++) 
//		{
//			System.out.println("Enter "+(i+1)+" Elements :");
//			a[i]=sc.nextInt();
//		}
//		System.out.println("Array Elements are :");
//		for (i=0;i<a.length;i++) 
//		{
//			System.out.println("A["+i+"] ="+a[i]);
//		}
		
		int a[]=new int[5];
		int i,j,temp;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter array Elements");
		for (i=0;i<a.length;i++) 
		{
			System.out.println("Enter "+(i+1)+" Elements :");
			a[i]=sc.nextInt();
		}
		System.out.println("Array Elements are :");
		for (i=0;i<a.length;i++) 
		{
			System.out.println("A["+i+"] ="+a[i]);
		}
		for (i=0;i<a.length;i++) 
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Array Elements Are In Ascending Order  :");
		for (i=0;i<a.length;i++) 
		{
			System.out.println("A["+i+"] ="+a[i]);
		}
		for (i=0;i<a.length;i++) 
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Array Elements Are In Descending Order  :");
		for (i=0;i<a.length;i++) 
		{
			System.out.println("A["+i+"] ="+a[i]);
		}
	}
}
