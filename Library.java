package day3;

public class Library 
{
	  public String addBook(String bookTitle)//public Access Modifier which can be called from any class ,any package and any project 
	 {
		 System.out.println("Book Added Successfully");
		 return bookTitle;
	 }
	   void issueBook()//default access modifier can be used by same and diff class from same package
	  {
		  System.out.println("Book Issued Successfully");
	  }
public static void main(String[] args)
{
	Library bklib=new Library();
	System.out.println(bklib.addBook("Core Java"));
	bklib.issueBook();
}
}
