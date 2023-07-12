//que-29-->W.A.J. P to create one thread by extending Thread class in another Class.

package MODULE_2;

public class que_29 extends Thread {
	public void run()
    {
        System.out.println("Thread Started Running...");
    }
    public static void main(String[] args)
    {
        que_29 g1 = new que_29();
        g1.start();
    }
}
