//que-15-->Create an abstract class 'Parent' with a method 'message'. It has two subclasses
//each having a method with the same name 'message' that prints "This is first
//subclass" and "This is second subclass" respectively. Call the methods
//'message' by creating an object for each subclass.

package MODULE_2;

abstract class Parent {
	abstract void message();
}
class First extends Parent {
	void message() {
	    System.out.println("This is first subclass");
	 }
}
class Second extends Parent {
	void message() {
	    System.out.println("This is second subclass");
	}
}
public class que_15 {
	public static void main(String[] args) {
	    Parent first = new First();
	    Parent second = new Second();
	    first.message();
	    second.message();
	}
}
