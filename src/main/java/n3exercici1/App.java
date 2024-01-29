package n3exercici1;

import java.util.ArrayList;

import n3exercici1.Article.Article;

import n3exercici1.Converters.*;

public class App {

	public static void main(String[] args) {
				
		ArrayList<Article> articleList = new ArrayList<>();
		ArrayList<MoneyConverter> converterList = new ArrayList<>();

		PricesList pricesList = new PricesList(articleList, converterList);
		
		Article article1 = new Article("Primer Articulo", 10);
		Article article2 = new Article("Segundo Articulo", 20);

		pricesList.addArticles(article1);
		pricesList.addArticles(article2);

		
		MoneyConverter moneyConverter = new DollarConverter();
		MoneyConverter moneyConverter2 = new YenConverter();
		
		pricesList.addConverters(moneyConverter);
		pricesList.addConverters(moneyConverter2);
		
		pricesList.listingArticles(articleList, converterList);
		
		
	}

}
