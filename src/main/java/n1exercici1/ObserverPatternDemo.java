package n1exercici1;

import n1exercici1.Observers.AgencyObserver;
import n1exercici1.Subject.Broker;

public class ObserverPatternDemo {

	public static void main(String[] args) {

		Broker broker = new Broker(200);
		
		AgencyObserver agency1 = new AgencyObserver(1, broker);
		AgencyObserver agency2 = new AgencyObserver(2, broker);

		System.out.println("L'estat de la borsa actual es de " + broker.getState());
		
		System.out.println("------------------------");
		
		broker.setState(50);
		
		System.out.println("------------------------");

		broker.setState(-30);
			
	}

}
