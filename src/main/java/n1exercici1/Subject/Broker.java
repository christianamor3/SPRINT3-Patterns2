package n1exercici1.Subject;

import java.util.ArrayList;

import n1exercici1.Observers.Observer;

public class Broker {

	private ArrayList<Observer> observers;
	private int valueInvestmentStock;
	
	public Broker(int valueInvestmentStock) {
		this.observers = new ArrayList<>();
		this.valueInvestmentStock = valueInvestmentStock;
	}

	public int getState() {
		return valueInvestmentStock;
	}
	
	public void setState(int newState) {
		valueInvestmentStock += newState;
		notifyAllObservers();
	}
	
	public void agregateObserver(Observer observer) {
		observers.add(observer);
	}
	
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}
	
	private void notifyAllObservers() {
		observers.stream().forEach(o -> o.update());
	}
	
}
