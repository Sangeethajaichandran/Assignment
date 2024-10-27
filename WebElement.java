package day7;

public class WebElement {

	public void clik() {
		System.out.println("Click --->webelement");
	}
	public void setText(String text) {
	System.out.println(text);
		}
	
	
}


public class Button extends WebElement
{
       public void submit()
       {System.out.println("submit--->Button class");}
	public static void main(String[] args) {
		
	}

}


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


public class TextField extends WebElement
{
  public void getText()
  {System.out.println("get the text--->Text field class");}
	public static void main(String[] args) {
		TextField txtobj=new TextField();
		txtobj.clik();
		txtobj.setText("text is overriden");
		txtobj.getText();
		
	}

}

public class RadioButton extends Button {

	public void SelectRadioButton()
	{
		System.out.println("Select radiobutton--->Radio button class");
	}
	public static void main(String[] args)
	{
		RadioButton radobj=new RadioButton();
		radobj.clik();
		radobj.setText("Welcome Radio");
		radobj.submit();
		radobj.SelectRadioButton();
	}

}


public class Elements extends Button {

	public static void main(String[] args) 
	{
		Elements eleobj=new Elements();
		eleobj.clik();
		eleobj.setText("hello");//method overriden from superclass button which inherits webelement
		eleobj.submit();
		
	}

}
