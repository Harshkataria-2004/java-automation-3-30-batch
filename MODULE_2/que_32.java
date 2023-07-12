//que-32-->W.A.J.P to set the user defined name, priority and get that name and
//priority for 2 threads using setName (), setPriority (), getName (),
//getPriority () methods of Thread class.
//o TestMultiPriority1 m1=new TestMultiPriority1 ();
//TestMultiPriority1 m2=new TestMultiPriority1 (); m1.setName
//(“mythread-1”); m2.setName (“mythread- 2”); m1.setPriority
//(Thread.MIN_PRIORITY); m2.setPriority
//(Thread.MAX_PRIORITY); o
//m1.start (); m2.start (); 

package MODULE_2;

public class que_32 extends Thread {
	public void run(){  
		   System.out.println("running thread name is:"+Thread.currentThread().getName());  
		   System.out.println("running thread priority is:"+Thread.currentThread().getPriority());  
		 }  
		 public static void main(String args[]){  
		  que_32 m1=new que_32();  
		  que_32 m2=new que_32();  
		  m1.setName("mythread-1");  
		  m2.setName("mythread-2");  
		  m1.setPriority(Thread.MIN_PRIORITY);  
		  m2.setPriority(Thread.MAX_PRIORITY);  
		  m1.start();  
		  m2.start();  

		 }
}
