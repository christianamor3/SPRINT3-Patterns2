package n1exercici1.Observers;

import n1exercici1.Subject.Broker;

public class AgencyObserver extends Observer {
	
	private int id;
	
	public AgencyObserver(int id, Broker broker) {
		this.id = id;
		this.broker = broker;
		this.broker.agregateObserver(this);
	}

	@Override
	public void update() {
			System.out.println("Agencia " + id + ", ara l'estat de la borsa és de " + broker.getState());
	}

}
