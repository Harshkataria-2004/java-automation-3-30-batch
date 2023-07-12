//que-17-->We have to calculate the percentage of marks obtained in three subjects (each
//		out of 100) by student A and in four subjects (each out of 100) by student B.
//		Create an abstract class 'Marks' with an abstract method 'getPercentage'. It is
//		inherited by two other classes 'A' and 'B' each having a method with the same
//		name which returns the percentage of the students. The constructor of student
//		A takes the marks in three subjects as its parameters and the marks in four
//		subjects as its parameters for student B. Create an object for each of the two
//		classes and print the percentage of marks for both the students. 

package MODULE_2;

abstract class Marks{
    abstract double getPercentage();
}

class a extends Marks{
    private float sub1, sub2, sub3;
  
    public a(float s1, float s2, float s3) {
        sub1 = s1;
    	sub2 = s2;
    	sub3 = s3;
    }
    double getPercentage() {
    	return (sub1 + sub2 + sub3)/300.0 * 100;
    }
}

class b extends Marks{
    private float sub1, sub2, sub3, sub4;
  
    public b(float s1, float s2, float s3, float s4) {
        sub1 = s1;
    	sub2 = s2;
    	sub3 = s3;
    	sub4 = s4;
    }
    double getPercentage() {
    	return (sub1 + sub2 + sub3 +sub4)/400.0 * 100;
    }
}
public class que_17 {
public static void main(String[] args){
		
	    a a = new a(47, 74, 22);
	    b b = new b(74, 47, 56, 22);
	  
	    double p1 = a.getPercentage();
	    double p2 = b.getPercentage();
	  
	    System.out.println("Percentage of student A : " + p1);
	    System.out.println("Percentage of student B : " + p2);
	}
}
