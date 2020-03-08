import java.util.Scanner;
import java.util.Random;
public class Hang
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
		op=s.nextInt();
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
				System.out.println("Incorrect menu option");
				showMenu();
				break;
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
			String ch=s.nextLine().toLowerCase();
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
		Hang h=new Hang();
		h.showMenu();
	}
}
	
	