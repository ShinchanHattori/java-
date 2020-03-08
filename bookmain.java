import java.io.*;
class Books
{
	void display()
	{
		System.out.println("Books class");
	}
}
class PaperBooks extends Books
{
	void display()
	{	
		System.out.println("paper books class");
	}
}
class mainBook
{
	public static void main(String args[])
	Books B;
	Paperbooks pb=new Paperbooks();
	B=pb;
	B.display();
	Books b=new books();
	B=b;
	B.display();
}