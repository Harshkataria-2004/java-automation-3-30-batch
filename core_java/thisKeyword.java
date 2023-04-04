package core_java;


class Student
{
	int rno;
	String name;
	public Student()
	{
		System.out.println("Default Constructor");
	}
	public Student(int rno,String name)
	{
		this();
		System.out.println("Parameterized Constructor Called");
		this.rno=rno;
		this.name=name;
	}
}


public class thisKeyword {
	public static void main(String[] args) {
		Student s1=new Student(1,"jigar");
	}
}
