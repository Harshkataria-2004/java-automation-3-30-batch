//que-31-->W.A.J.P to start the same Thread twice by calling start () method twice.
//Test ThreadTwice1 t1=new TestThreadTwice1(); t1.start (); t1.start (); 

package MODULE_2;

class ThreadTwice1 extends Thread{
	public void run(){
		System.out.println("Inside run method");
    }
}
public class que_31 {
	public static void main(String args[]){
		ThreadTwice1 t1 = new ThreadTwice1();
	    t1.start();
	    t1.start();
	}
}
