package day8assignment2;

import day8assignment.DataBaseConnection;

public class JavaConnection extends MySqlConnection implements DataBaseConnection
{
	@Override
	public void connect() 
	{
	System.out.println("connecting from dbconnection-->java");
	}

	@Override
	public void disconnect() 
	{System.out.println("Disconnecting from dbconnection-->java");}

	@Override
	public void executeUpdate() 
	{System.out.println("updating from dbconnection-->java");
		
	}

	@Override
	public void executeQuery() {
		System.out.println("Executing from mysqlconnection-->java");
			
	}

	public static void main(String[] args) 
	{
	JavaConnection javcon=new JavaConnection();
	javcon.connect();
	javcon.disconnect();
	javcon.executeUpdate();
	javcon.executeQuery();
	
	}

	
	
	
}
