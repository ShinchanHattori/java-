package game;
import java.util.Scanner;

import gamewindow.MenuInputException;

import java.util.Random;
class WrongInputException extends RuntimeException
{
	WrongInputException()
	{
		System.out.println("Please Provide Single Character only");
	}
}
class MenuInputException extends WrongInputException
{
	MenuInputException()
	{
		System.out.println("Pleae provide a valid input(1-3)");
	}
}
public class Hang
{
	String word[]= {"japan","india","qatar","syria","mongolia","bahrain","australia"};
	public void showMenu()
	{
		int opt;
		Scanner s=new Scanner(System.in);
		System.out.println("-------HANGMAN------");
		System.out.println("1.Play");
		System.out.println("2.Instruction");
		System.out.println("3.Exit");
		System.out.println("\n Choose the option");
		opt=s.nextInt();
		switch(opt)
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
	public void playGame()
	{
		System.out.println("playing");
		int i,len,cnt=0,rnd,flag=0;
		String input,gu;
		String choice,temp;
		Random r=new Random();
		Scanner s1=new Scanner(System.in);
		rnd=r.nextInt(6);
		len=word[rnd].length();
		char[] newString =new char[len];
		StringBuffer wrgString=new StringBuffer();
		for(int j=0;j<len;j++)
		{
			System.out.println("-");
		}
		System.out.println();
		do
		{
			flag=0;
			System.out.println("Enter your guess");
			String ch=s1.nextLine().toLowerCase();
			try
			{
				if(ch.length()!=1)
				{
					throw new WrongInputException();
				}
			cnt++;
			input=s1.nextLine();
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
				wrgString.append(ch+" ");
				System.out.println("\n Misses:"+wrgString);
			}
			System.out.println("newString");
			temp= new String(newString);
			if(word[rnd].equals(temp));
			{
				System.out.println("--------Congrats you WIN :)-------------");
				System.out.println("do you want play again(y/n)");
				choice=s1.nextLine();
				if(choice.equalsIgnoreCase("y"))
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
			System.out.println(e);
			flag=1;
		}
		}while(flag!=0);
	}
	public void instructGame()
	{
		System.out.println("instruction");
	}
	public void exitGame()
	{
		System.out.println("Exit");
	}
	public static void main(String[] args)
	{
		Hang h=new Hang();
		h.showMenu();
	}

}
