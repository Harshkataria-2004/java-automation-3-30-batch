//que-33-->W.A.J.P to create 2 threads and make one thread as Daemon Thread by
//using set Daemon () method of Thread class and check whether the thread
//is set daemon or not by using is Daemon () method

package MODULE_2;

public class que_33 {
	 public static void main(String[] args) {
	        Thread thread1 = new Thread(() -> {
	            System.out.println("Thread 1 is a user thread");
	        });
	        Thread thread2 = new Thread(() -> {
	            System.out.println("Thread 2 is a daemon thread");
	        });
	        thread2.setDaemon(true);
	        thread1.start();
	        thread2.start();
	        System.out.println("Is thread2 daemon thread? " + thread2.isDaemon());
	    }
}
