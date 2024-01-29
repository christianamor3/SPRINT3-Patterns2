package n2exercici1.Callback;

public class PaypalPayment implements PaymentMethod{

	@Override
	public void payment(float price) {
		System.out.println("Estoy pagando " + price + " euros via Paypal");		
	}

}
