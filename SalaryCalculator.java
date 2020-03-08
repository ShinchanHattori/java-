package calculator;
import java.util.Scanner;
public class SalaryCalculator
{
public static void main(string[]args)
{
int hra;
int specialallowance;
int pf;
int netpayabalesalary;
int basicsalray;
syatem.out.println("Enter your basic salary:");
Scanner scl=new Scanner(system.in);
basicsalary=scl.nextInt();
hra=(50*basicsalary)/100;
specialallowance=(75*basicsalary)/100;
pf=(12*basicsalary)/100;
netpayablesalary=basicsalary+hra+specialallowance-pf;
system.out.println("basic salary      ="+basicsalary);
system.out.println("HRA               ="+hra);
system.out.println("special allowance ="+specialallowance);
system.out.println("PF                ="+pf);
system.out.println("-----------------------");
system.out.println("net payable salary="+netpaybalesalary);
}
}

1