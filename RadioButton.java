package day7;

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
