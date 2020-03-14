package university;
import java.util.Scanner;
public class MainMenu 
{
	public static void main(String[] args)
	{
		Scanner c=new Scanner(System.in);
		System.out.println("Menu");
		System.out.println("Student Detail");
		System.out.println("Employee Detail");
		System.out.println("Enter ur Choice");
		int a=c.nextInt();
		switch(a)
		{
		case 1:
			Student st=new Student();
			st.getDetail();
			break;
		case 2:
			Employee emp=new Employee();
			emp.getDetail();
			break;
		}
	}

}
