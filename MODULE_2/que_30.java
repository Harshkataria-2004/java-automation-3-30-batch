//que-30-->W.A.J.P to create 2 threads and execute that threads by providing sleep
//time as 2000ms and check the execution. 

package MODULE_2;

import java.util.concurrent.TimeUnit;

public class que_30 {
	public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            System.out.println("Thread 1 is sleeping for 2000ms");
            try {
                TimeUnit.MILLISECONDS.sleep(2000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 1 is awake");
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("Thread 2 is sleeping for 2000ms");
            try {
                TimeUnit.MILLISECONDS.sleep(2000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 2 is awake");
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Both threads are finished");
    }
}
