package day7;

public class APIClient {
	
	public void sendRequest(String endpoint)
	{System.out.println("Endpoint -->APIClient1:"+endpoint);}
	
	public void sendRequest(String endpoint,String requestBody,boolean requestStatus)
	{System.out.println("Endpoint -->APIClient2:"+endpoint);
	System.out.println("requestBody -->APIClient:"+requestBody);
	System.out.println("requestStatus -->APIClient:"+requestStatus);
	}
	
	public static void main(String[] args) 
	{
	APIClient apiobj=new APIClient();
	apiobj.sendRequest("Connection");
	apiobj.sendRequest("connect", "data", true);
	}

}
