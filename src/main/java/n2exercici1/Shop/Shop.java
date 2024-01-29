package n2exercici1.Shop;

import java.util.ArrayList;
import java.util.Scanner;

import n2exercici1.Callback.BankPayment;
import n2exercici1.Callback.CreditCardPayment;
import n2exercici1.Callback.PaymentMethod;
import n2exercici1.Callback.PaypalPayment;
import n2exercici1.Caller.PaymentGateway;

public class Shop {

	private ArrayList<Shoe> shoesList;
	private String name;
	
	public Shop(String name) {
		this.shoesList = new ArrayList<>();
		this.name = name;
	}

	public void printShoesList() {
		System.out.println("Este es el listado de zapatos disponibles:");
		shoesList.stream().forEach(s -> System.out.println(s.getId() + " " + s.getColor() + " " + s.getPrice() + " euros"));
	}
	
	public void addShoeToList(Shoe shoe) {
		if (!shoesList.contains(shoe)) {
			shoesList.add(shoe);
		}
	}
	
	
	public int indexPosition(int shoeId) {
		int posicioIndex=-1;
		int i = 0;
		
		while (i<shoesList.size() && posicioIndex==-1) {
			if (shoeId==shoesList.get(i).getId()) {
				posicioIndex=i;
			}	
			i++;
		}	
		
		return posicioIndex;
	}
	
	public void removeShoeFromList(int shoeId) {
			shoesList.remove(shoeId);
	}
	
	public PaymentMethod paymentMethod() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el metodo de pago: Tarjeta / Paypal / Cuenta Bancaria");
		String respuesta = sc.nextLine();
		
		if (respuesta.equalsIgnoreCase("Tarjeta")) {
			return new CreditCardPayment();
		} else if (respuesta.equalsIgnoreCase("Paypal")){
			return new PaypalPayment();
		} else if (respuesta.equalsIgnoreCase("Cuenta Bancaria")){
			return new BankPayment();
		} else {
			System.out.println("No has introducido un metodo de pago valido");
		}
		return null;
	}
	
	public boolean buyingShoe() {
		printShoesList();
		boolean seguirComprando=true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el ID del zapato que quieres comprar");
		int shoeBought = sc.nextInt();
		
		int idShoe=-1;
		
		for (int i = 0; i<shoesList.size();i++) {
			if (shoeBought==shoesList.get(i).getId()) {
				idShoe=i;
				System.out.println("El zapato tiene un precio de " + shoesList.get(i).getPrice() + " euros");
			}	
		}
		
		PaymentGateway paymentGate = new PaymentGateway();
		paymentGate.executePayment(paymentMethod(), shoesList.get(idShoe).getPrice());
		
		removeShoeFromList(indexPosition(shoeBought));
		
		sc.nextLine();
		
		System.out.println("Quieres seguir comprando? Si / No");
		String respuesta = sc.nextLine();
		
		if (!respuesta.equalsIgnoreCase("si")) {
			seguirComprando=false;
			System.out.println("Adios!");
		}

		return seguirComprando;
	}
	
}
