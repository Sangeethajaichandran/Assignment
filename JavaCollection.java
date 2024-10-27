package day8assignment;

public class JavaCollection implements DataBaseConnection {

	public void connect()
	{System.out.println("Connecting-->fromDatabase");}
	public void disconnect()
	{System.out.println("Disconnecting-->fromDatabase");}
	public void executeUpdate()
	{System.out.println("Executing update-->fromDatabase");}
	
	public void connectstatus()
	{System.out.println("Status-->JavaCollection");}
	

	
	public static void main(String[] args) 
	{
	JavaCollection javaobj=new JavaCollection();
	javaobj.connect();
	javaobj.disconnect();
	javaobj.executeUpdate();
	javaobj.connectstatus();
	}

}
