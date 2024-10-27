package day7;

public class Elements extends Button {

	public static void main(String[] args) 
	{
		Elements eleobj=new Elements();
		eleobj.clik();
		eleobj.setText("hello");//method overriden from superclass button which inherits webelement
		eleobj.submit();
		
	}

}
