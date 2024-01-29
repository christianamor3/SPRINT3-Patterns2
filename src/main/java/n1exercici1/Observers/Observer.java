package n1exercici1.Observers;

import n1exercici1.Subject.Broker;

public abstract class Observer {

	protected Broker broker;
	
	public abstract void update();
	
}
