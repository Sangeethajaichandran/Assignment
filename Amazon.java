package day8;

public class Amazon extends CanaraBank 
{
@Override
//methods from payment interface
public void cashOnDelivery() {
	System.out.println("Cashon delivery-Payments");
}

@Override
public void upiPayments() {
	System.out.println("upipayments--payments");
}

@Override
public void cardPayments() {
	System.out.println("Card Payments--payments");
}

@Override
public void internetBanking() {
	System.out.println("internetbanking--payments");
}

@Override
public void recordPaymentDetails() {
	System.out.println("recording payment details-amazon");
}

public void cart()
{
	System.out.println("Add items");}

public static void main(String[] args)
{Amazon amz=new Amazon();
amz.cashOnDelivery();
amz.upiPayments();
amz.cardPayments();
amz.internetBanking();
amz.recordPaymentDetails();
amz.cart();//own method
	}


}
