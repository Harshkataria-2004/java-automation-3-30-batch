//que-9-->• Create a class to print the area of a square and a rectangle. The class has two
//methods with the same name but different number of parameters. The method
//for printing area of a rectangle has two parameters which are length and
//breadth respectively while the other method for printing area of square has
//one parameter which is side of square. 
package MODULE_2;

public class que_9 {
	public static void main(String[] args) 
	{
		int l = 2;
		int b = 5;
		int s = 3;
		Area(l, b);
		Area(s);
	}
	public static void Area(int l, int b) 
	{
        System.out.println("Area of Rectangle : "+l*b);
    }

    public static void Area(int s) 
    {
        System.out.println("Area of Square : "+s*s);
    }
}
