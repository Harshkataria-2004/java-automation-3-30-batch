//que-25-->W.A.J.P to create the validate method that takes integer value as a
//parameter. If the age is less than 18, then throw an Arithmetic Exception
//otherwise print a message welcome to vote.
//o O/P- Enter your age: 16
//o Exception in thread main java. lang. Arithmetic Exception: not
//valid 

package MODULE_2;

public class que_25 {
	public static void validate(int age) {
        if (age < 18) 
        {
            throw new ArithmeticException("Not valid");
        }
        else 
        {
            System.out.println("Welcome to vote");
        }
    }
    public static void main(String[] args) {
        int age=16;
        validate(age);
    }
}
