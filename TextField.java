package day7;

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
