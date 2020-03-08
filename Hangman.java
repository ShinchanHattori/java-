import java.util.Scanner;
import java.util.*;
import java.util.Random;
import java.lang.*;
import java.io.*;
class WrongInputException extends RuntimeException
{
	WrongInputException()
	{
		System.out.println("Please Provide A Single Character Only...!");
	}
}
class MenuInputException extends RuntimeException
{
	MenuInputException()
	{
		System.out.println("Please Provide A Valid Input(1-3)");
	}
}
public class Hangman
{
	String word[]={"japan","qatar","syria","mongolia","bahrain","india"};
	public void showMenu()
	{
		int op;
		Scanner s=new Scanner(System.in);
		System.out.println("-----Menu-----");
		System.out.println("1.Play");
		System.out.println("2.Instruction");
		System.out.println("3.Exit");
		System.out.println("Choose the option");
		op=0;
		try
		{
			op=s.nextInt();
		}
		catch(RuntimeException e)
		{
			System.out.println("Please Provide A Valid Numeric Input");
			showMenu();
		}
		switch(op)
		{
			case 1:
				playGame();
				break;
			case 2:
				instructGame();
				break;
			case 3:
				exitGame();
				break;
			default:
				try
				{
					throw new MenuInputException();
				}
				catch(Exception e)
				{
					showMenu();
				}
		}
	}
	void playGame()
	{
		int len,i,count=0,rnd,flag=0;		
		String choice,temp;
		Random r=new Random();
		Scanner s=new Scanner(System.in);
		rnd=r.nextInt(6);
		len=word[rnd].length();
		char[]newString=new char[len];
		StringBuffer wrgString=new StringBuffer();
		for(int j=0;j<len;j++)
		{
			System.out.println("-");
		}
		System.out.println();
		do
		{
			flag=0;
			System.out.println("\n\nEnter Your Guess");
			try
			{
				String ch=s.nextLine().toLowerCase();
				if(ch.length()!=1)
				{
					throw new WrongInputException();
				}
				count++;
				for(i=0;i<len;i++)
				{
					if(word[rnd].charAt(i)==ch.charAt(0))
					{
						newString[i]=word[rnd].charAt(i);
						flag=1;
					}
				}
				if(flag==0)
				{
					flag=1;
					wrgString.append(ch+",");
					System.out.println("\nMisses:"+wrgString);
				}
				System.out.println(newString);
				temp=new String(newString);
				if(word[rnd].equals(temp))
				{
					System.out.println("-----Congrats:)YOU WON-----");
					System.out.println("Do U Want Play Again(Y/N)");
					choice=s.nextLine();
					if(choice.equalsIgnoreCase("Y"))
					{
						playGame();
					}
					else
					{
						showMenu();
					}
				}
			}
			catch(WrongInputException e)
			{
				//System.out.println(e);
				flag=1;
			}
		}while(flag!=0);
	}
	void instructGame()
	{
		System.out.println("Instructing game method is invoked");
	}
	void exitGame()
	{
		System.exit(0);
	}
	public static void main(String args[])
	{
		Hangman h=new Hangman();
		h.showMenu();
	}
}
	
	