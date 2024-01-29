package n3exercici1;

import java.util.ArrayList;

import n3exercici1.Article.Article;
import n3exercici1.Converters.MoneyConverter;

public class PricesList {

	private ArrayList<Article> articleList;
	private ArrayList<MoneyConverter> converterList;
	

	public PricesList(ArrayList<Article> articleList, ArrayList<MoneyConverter> converterList) {
		this.articleList = articleList;
		this.converterList = converterList;
	}


	public void addArticles(Article article) {
		articleList.add(article);
	}
	
	
	public void addConverters(MoneyConverter moneyConverter) {
		converterList.add(moneyConverter);
	}
	
	
	public void listingArticles(ArrayList<Article> articleList, ArrayList<MoneyConverter> converterList) {
			
		for (Article article : articleList) {
			for (MoneyConverter converter : converterList) {
					System.out.println("El articulo " + article.getName() + " vale " + article.getPriceEuros() + " euros, "
							+ "que son " + converter.converter(article.getPriceEuros()) + " " + converter.getName());
			}
		}		
	}}
