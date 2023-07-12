//que-12-->Create a class named 'Rectangle' with two data members 'length' and 'breadth'
//and two methods to print the area and perimeter of the rectangle respectively.
//Its constructor having parameters for length and breadth is used to initialize
//the length and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle'
//class with its constructor having a parameter for its side (suppose s) calling the
//constructor of its parent class as 'super (s, s)'. Print the area and perimeter of a
//rectangle and a square. 

package MODULE_2;


class Rectangle 
{
	int length;
	int breadth;
	public Rectangle(int length, int breadth) 
	{
	    this.breadth = breadth;
	    this.length = length;
	}
	public int Area() 
	{
		return length * breadth;
	}
	public int Perimeter() 
	{
		return 2*(length+breadth);
	}
}
class Square extends Rectangle 
{
	public Square(int s) 
	{
		super(s,s);
	}
}
public class que_12 {
	public static void main(String[] args) 
	{
	    Rectangle rec = new Rectangle(5,15);
	    Square sq = new Square(10);
	    System.err.println("For Recatangle: ");
	    System.out.println("Area : "+rec.Area());
	    System.out.println("Perimeter: "+rec.Perimeter());
	    System.err.println("For Square: ");
	    System.out.println("Area : " + sq.Area());
	    System.out.println("Perimeter : " + sq.Perimeter());
	  }
}
