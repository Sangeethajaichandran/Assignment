package day3;

public class LibraryManagement {

	public static void main(String[] args) 
	{
	Library manlib=new Library();
	System.out.println(manlib.addBook("Basics of Selenium"));
	manlib.issueBook();
	}

}
