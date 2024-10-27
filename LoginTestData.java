package day7;

public class LoginTestData extends TestData {
public void enterUsername() 
{System.out.println("enter the username-->logintestdata");}
public void enterPassword()
{System.out.println("enter the password-->logintestdata");}

	
	public static void main(String[] args) 
	{
	LoginTestData logtst=new LoginTestData();
	logtst.enterCredentials();
	logtst.navigateToHomePage();
	logtst.enterUsername();
	logtst.enterPassword();
	}

}
