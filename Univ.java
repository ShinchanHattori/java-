import java.util.Scanner;
class Univ
{
public void GetEmpDetails()
{
          String firstname,lastname,designation,department;
          int empid,age,salary;
           
          Scanner ST=new Scanner(System.in);
          System.out.print("Enter first Name: ");
          firstname=ST.nextLine();
        
          System.out.print("Enter last Name: ");
          lastname=ST.nextLine();
          
          System.out.print("Enter department name: ");
          department=ST.nextLine();

          System.out.print("Enter designation: ");
          designation=ST.nextLine();

          System.out.print("Enter salary: ");
          salary=ST.nextInt();

          System.out.print("Enter employee id: ");
          empid=ST.nextInt();

          System.out.print("Enter age: ");
          age=ST.nextInt();
      
      }
public void GetStudentDetails()
{
          String firstname,lastname,courseenrolled;
          int stuid,age;
           
          Scanner SE=new Scanner(System.in);
          System.out.print("Enter first Name: ");
          firstname=SE.nextLine();
          
          System.out.print("Enter last Name: ");
          lastname=SE.nextLine();
          
          System.out.print("Enter course enrolled: ");
          courseenrolled=SE.nextLine();

          System.out.print("Enter Roll Number: ");
          stuid=SE.nextInt();

          System.out.print("Enter age: ");
          age=SE.nextInt();

                     
      }
public static void main(String[]args)
{
int a;
Univ h=new Univ();
Scanner un=new Scanner(System.in);
System.out.println("enter the choice");
System.out.println("1.employee");
System.out.println("2.student");
a=un.nextInt();
switch(a)
{
case 1:h.GetEmpDetails();
       break;
case 2:h.GetStudentDetails();
       break;
default:System.out.println("enter the correct choice");
}
}       
}

 