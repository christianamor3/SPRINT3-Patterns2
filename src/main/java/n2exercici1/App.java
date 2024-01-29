package n2exercici1;

import n2exercici1.Shop.Shoe;
import n2exercici1.Shop.Shop;

public class App {

	public static void main(String[] args) {

		Shop shop1 = new Shop("Zapateria");
		
		shop1.addShoeToList(new Shoe(1, "Brown", 25f));
		shop1.addShoeToList(new Shoe(2, "Black", 50f));
		shop1.addShoeToList(new Shoe(3, "White", 30f));
		
		boolean chivato = true;
		
		while (chivato) {
			chivato=shop1.buyingShoe();
		}
		
		
	}

}
