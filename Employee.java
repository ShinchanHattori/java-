package university;
import java.util.Scanner;
class Employee extends Person
{
	double sal;
	String degn,dept;
	public void getDetail()
	{
		super.getDetail();
		Scanner s2=new Scanner(System.in);
		System.out.println("Enter the Professional Details");
		System.out.println("Enter the Department");
		dept=s2.nextLine();
		System.out.println("Enter the Designation");
		degn=s2.nextLine();
		System.out.println("Enter the salary");
		sal=s2.nextInt();
		showDetail();
		}
	public void showDetail()
	{
		System.out.println("the details enterd are:\n");
		System.out.println("First Name    :"+super.fn);
		System.out.println("Last Name     :"+super.ln);
		System.out.println("Age           :"+super.age);
		System.out.println("Department    :"+dept);
		System.out.println("Designation   :"+degn);
		System.out.println("Salary        :"+sal);
	}
}
