package day7;

public class CheckBoxButton extends Button 
{

	public void clickCheckButton()
	{System.out.println("click check button-->CheckBoxButton class");}
	
	public static void main(String[] args)
	{
		CheckBoxButton chkobj=new CheckBoxButton();
		chkobj.clik();
		chkobj.setText("Check box is selected");
		chkobj.submit();
		chkobj.clickCheckButton();
	}

}
