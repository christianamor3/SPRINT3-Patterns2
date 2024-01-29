package n3exercici1.Article;

public class Article {

	private String name;
	private int price;
	
	public Article(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPriceEuros() {
		return price;
	}
	
}
