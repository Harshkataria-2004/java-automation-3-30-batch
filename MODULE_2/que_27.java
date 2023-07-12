//que-27-->W.A.J.P to create a class Student with attributes roll no, name, age and
//course. Initialize values through parameterized constructor. If age of
//student is not in between 15 and 21 then generate user defined exception
//"AgeNotWithinRangeException". If name contains numbers or special
//symbols raise exception "NameNotValidException". Define the two
//exception classes. 

package MODULE_2;

class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

class Student {
    int roll_no;
    String name;
    int age;
    String course;

    public Student(int roll_no, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        if (!(15 <= age && age <= 21)) 
        {
            throw new AgeNotWithinRangeException("Age should be between 15 and 21");
        }
        if (!name.matches("^[a-zA-Z]*$")) 
        {
            throw new NameNotValidException("Name should not contain numbers or special symbols");
        }
        this.roll_no = roll_no;
        this.name = name;
        this.age = age;
        this.course = course;
    }
}
public class que_27 {
	 public static void main(String[] args) {
	        try {
	            Student student1 = new Student(1, "John", 22, "Computer Science");
	        }
			 catch (AgeNotWithinRangeException e) {
	            System.out.println(e.getMessage());
	        }
			 catch (NameNotValidException e) {
	            System.out.println(e.getMessage());
	        }
			 finally {
	            System.out.println("Student created successfully!");
	        }
	    }
}
