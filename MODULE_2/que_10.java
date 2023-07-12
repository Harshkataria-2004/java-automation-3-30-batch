//que-10-->Create a class with a method that prints "This is a parent class" and its subclass
//with another method that prints "This is child class". Now, create an object for
//each of the class and call 1 - method of parent class by object of parent class 2
//- method of child class by object of child class 3 - method of parent class by
//object of child class 

package MODULE_2;

class A {
	void printA() {
		System.out.println("This is a parent class");
	}
}
class B extends A {
	void printB() {
		System.out.println("This is child class");
	}
}
public class que_10 {
	 public static void main(String[] args) {
	     A p = new A();
	     B c = new B();
	     p.printA();
	     c.printB();
	     c.printA();
	 }
}
