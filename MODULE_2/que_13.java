//que-13-->Write a program to print the area and perimeter of a triangle having sides of 3,
//4 and 5 units by creating a class named 'Triangle' without any parameter in its
//constructor. 

package MODULE_2;

class Triangle {
	  int s1;
	  int s2;
	  int s3;
	  public Triangle() {
	    this.s1 = 3;
	    this.s2 = 4;
	    this.s3 = 5;
	  }
	public double Area() {
		float s=(s1+s2+s3)/2;
	    return Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
	}
	public int Perimeter() {
		return (s1+s2+s3);
	}
}
public class que_13 {
	public static void main(String[] args) {
	    Triangle t = new Triangle();
	    System.out.println("For Triangle :");
	    System.out.println("Area : " + t.Area());
	    System.out.println("Perimeter : " + t.Perimeter());
	  }
}
