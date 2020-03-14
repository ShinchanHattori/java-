import java.util.Scanner;
public class Salary{
void calculation(){
int Basic, HRA, PF, SA, Total;
System.out.println("Total get Salary");
Scanner S = new Scanner(System.in);
Basic = S.nextInt();
HRA = (Basic*50)/100;
SA = (Basic*75)/100;
PF = (Basic*12)/100;
Total = Basic + HRA + SA - PF;
System.out.println("HRA : " + HRA);
System.out.println("PF : " + PF);
System.out.println("SA : " + SA);
System.out.println("Overall Salary is: " + Total );
}
public static void main(String args[]){
Salary Sal = new Salary();
Sal.calculation();
}
}