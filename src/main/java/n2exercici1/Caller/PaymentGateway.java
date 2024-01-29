package n2exercici1.Caller;

import n2exercici1.Callback.PaymentMethod;

public class PaymentGateway {

	public void executePayment(PaymentMethod payment, float price) {
		payment.payment(price);
	}
}
