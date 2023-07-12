//que-34-->TestDaemonThread2 t1=new TestDaemonThread2(); o
//TestDaemonThread2 t2=new TestDaemonThread2(); t1.start() o
//t1.setDaemon(true);//will throw exception here t2.start();
//Write a Java program to create a new array list, add some colours (string)
//and print out the collection. 

package MODULE_2;

import java.util.ArrayList;

public class TestDaemonThread2 extends Thread {
	  public void run() {
	    if (Thread.currentThread().isDaemon()) {
	      System.out.println("Daemon thread executing...");
	    } else {
	      System.out.println("User thread executing...");
	    }
	  }

	  public static void main(String[] args) {
	    TestDaemonThread2 t1 = new TestDaemonThread2();
	    TestDaemonThread2 t2 = new TestDaemonThread2();
	    t1.setDaemon(true);
	    t1.start();
	    t2.start();
	  }
	}
public class que_34 extends Thread{
	public static void main(String[] args) {
	    ArrayList<String> colors = new ArrayList<String>();
	    colors.add("Red");
	    colors.add("Green");
	    colors.add("Blue");
	    System.out.println(colors);
	  }
}
