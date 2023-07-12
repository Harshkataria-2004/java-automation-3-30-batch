//que-7-->Create a class named 'PrintNumber' to print various numbers of different data
//types by creating different methods with the same name 'printn' having a
//parameter for each data type. 


package MODULE_2;

public class que_7 {
	    public void printn(int num) 
	    {
	        System.out.println(num);
	    }
	    public void printn(float num) 
		{
	        System.out.println(num);
	    }
	    public void printn(double num) 
		{
	        System.out.println(num);
	    }
	    public void printn(long num) 
		{
	        System.out.println(num);
	    }
	    public static void main(String[] args) 
	    {
	        que_7 obj1 = new que_7();

	        obj1.printn(100);
	        obj1.printn(25.5f);
	        obj1.printn(25.5d);
	        obj1.printn(10000000000L);
	    }
}
