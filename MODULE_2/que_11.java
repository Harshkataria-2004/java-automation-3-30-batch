//que-11-->Create a class named 'Member' having the following members:
//	Data members
//	a) Name
//	b) Age
//	c) Phone number
//	d) Address 5 - Salary
//	e) It also has a method named 'printSalary' which prints the salary of the
//	members.
//	f) Two classes 'Employee' and 'Manager' inherits the 'Member' class. The
//	'Employee' and 'Manager' classes have data members 'specialization'
//	and 'department' respectively. Now, assign name, age, phone number,
//	address and salary to an employee and a manager by making an object
//	of both of these classes and print the same. 

package MODULE_2;

class Member 
{
	String name;
	int age;
	int phone;
	String address;
	float salary;
	public Member(String name, int age, int phone, String address, float salary) 
	{
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.address = address;
		this.salary = salary;
	}
	public void printSalary() 
	{
		System.out.println("Salary : " + salary);
	}
}

class Employee extends Member 
{
	String specialization;
	public Employee(String name, int age, int phone, String address, float salary, String specialization) 
	{
		super(name, age, phone, address, salary);
		this.specialization = specialization;
	}
}

class Manager extends Member 
{
	String department;
	public Manager(String name, int age, int phone, String address, float salary, String department) 
	{
		super(name, age, phone, address, salary);
		this.department = department;
	}
}
public class que_11 
{

	public static void main(String[] args) 
	{
	   	Employee employee = new Employee("ABC",30,1234567890,"abc apartments",1000000,"SE");
	   	employee.printSalary();
	   	Manager manager = new Manager("XYZ", 40, 1234567894, "xyz apartments", 2000000, "CA");
	   	manager.printSalary();
	}
}
