package n2exercici1.Shop;

public class Shoe {

	private int id;
	private String color;
	private float price;
	
	public Shoe(int id, String color, float price) {
		this.id = id;
		this.color = color;
		this.price = price;
	}

	
	public String getColor() {
		return color;
	}


	public float getPrice() {
		return price;
	}


	public int getId() {
		return id;
	}
	
}
