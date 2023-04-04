package core_java;

public class MethodOverloading {
	void test()
	{
		System.out.println("test with no arguments");
	}
	void test(int a)
	{
		System.out.println("test with 1 argument");
	}
	void test(int a,float b)
	{
		System.out.println("test with 2 argument");
	}
	public static void main(String[] args) {
		MethodOverloading n=new MethodOverloading();
		n.test();
		n.test(10);
		n.test(10, 10.10F);;
	}
}
