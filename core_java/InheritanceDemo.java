package core_java;

import java.util.Scanner;

class A
{
	int a;
	Scanner sc=new Scanner(System.in);
	void getA()
	{
		System.out.println("Enter A :");
		a=sc.nextInt();
	}
	void putA()
	{
		System.out.println("A : "+a);
	}
}

class B extends A
{
	int b;
	Scanner sc=new Scanner(System.in);
	void getB()
	{
		System.out.println("Enter B :");
		b=sc.nextInt();
	}
	void putB()
	{
		System.out.println("B : "+b);
	}
}
class C extends A
{
	int c;
	Scanner sc=new Scanner(System.in);
	void getC()
	{
		System.out.println("Enter C :");
		c=sc.nextInt();
	}
	void putC()
	{
		System.out.println("C : "+c);
	}
}

public class InheritanceDemo {
	public static void main(String[] args) {
		B b1=new B();
		C c1=new C();
		b1.getA();
		b1.getB();
		c1.getC();
		b1.putA();
		b1.putB();
		c1.putC();
	}
}
