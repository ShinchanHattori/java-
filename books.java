import java.io.*;
class Books
{
	void display()
	{
		String Authorname;
		int Npage;
		int Price;
		System.out.println(Authorname);
		System.out.println(Npage);
		System.out.println(Price);
	}
}
class Paperbooks extends Books
{
	display();
}
class Bookmain
{
	public static void main(String args[])
	{
		Paperbook pb=new Paperbook();
		pb.display();
	}
}