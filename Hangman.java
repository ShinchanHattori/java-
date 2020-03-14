package gamewindow;
import java.util.Scanner;
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
public class Hangman
{
	String word[]= {"japan","india","qatar","syria","mongolia","bahrain","australia"};
	public void menu()
	{
		int opt;
		Scanner sc=new Scanner(System.in);
		System.out.println("-------HANGMAN------");
		System.out.println("1.Play");
		System.out.println("2.Instruction");
		System.out.println("3.Exit");
		System.out.println("\n Choose the option");
		opt=0;
		try
		{
			opt=sc.nextInt();
		}
		catch(RuntimeException e)
		{
			System.out.println("Please Provide a Valid Numeric input");
			menu();
		}
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
			menu();
		}
	}
}
void playGame()
{
	System.out.println("Play method is invoked");
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
				menu();
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
void instructGame()
{
	System.out.println("Instruct method is invoked");
}
void exitGame()
{
	System.out.println("Exit method is invoked");
}
public static void main(String[] args) 
{
	Hangman h=new Hangman();
	h.menu();
	Menu mobj=new Menu();
	mobj.addComponent();
	GameWindow gobj=new GameWindow();
	gobj.addComponent();
}

}
