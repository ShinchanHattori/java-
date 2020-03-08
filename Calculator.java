import java.util.Scanner;
class Calculator
{
	public static void main(String args[])
	{
		int num1,num2,res=0;
		Scanner s=new Scanner(System.in);
		Scanner ope=new Scanner(System.in);
		String op;
		for(int i=0;i<4;i++)
		{
		System.out.println("Enter the 1st Number");
		num1=s.nextInt();
		assert(num1>0):"the number should be greater than 0";
		System.out.println("Enter the 2nd number");
		num2=s.nextInt();
		assert(num2>0):"the number should be greater than 0";
		System.out.println("Enter the operator");
		op=ope.nextLine();
		assert((op.equals("+"))||(op.equals("-"))||(op.equals("*"))||(op.equals("/"))):"The Operator Is Not Valid";
		if(op.equals("+"))
		{
			res=num1+num2;
		}
		else if(op.equals("-"))
		{
			if(num1>num2)
			{
				res=num1-num2;
			}
			else
			{
				res=num2-num1;
			}
		}
		else if(op.equals("*"))
		{
			res=num1*num2;
		}
		else if(op.equals("/"))
		{
			res=num1/num2;
		}
		else
		{
			System.out.println("Wrong operator");
		}
		System.out.println("The Result Is:"+res);
		}
	}
}