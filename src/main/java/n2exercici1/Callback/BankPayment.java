package n2exercici1.Callback;

public class BankPayment implements PaymentMethod{

	@Override
	public void payment(float price) {
		System.out.println("Estoy pagando " + price + " euros via deuda en cuenta bancaria");		
	}

}
