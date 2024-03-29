package com.singh.business;

import java.util.ArrayList;
import java.util.List;

import com.singh.model.Product;

public class ProductServiceImpl {

	List<String> bookList = new ArrayList<String>();
	List<String> musicList = new ArrayList<String>();
	List<String> moviesList = new ArrayList<String>();

	public ProductServiceImpl() {
		bookList.add("Eragon");
		bookList.add("Harry Potter");
		bookList.add("Game of Thrones");

		musicList.add("Gorgeous - Kanye West");
		musicList.add("Blood On Our Hands - Death From Above 1979");
		musicList.add("Trust Nobody - Hippie Sabotage");

		moviesList.add("Star Wars");
		moviesList.add("Lord of The Rings");
		moviesList.add("Pulp Fiction");
	}

	public List<String> getProductCategories() {
		List<String> categories = new ArrayList<String>();
		categories.add("Books");
		categories.add("Music");
		categories.add("Movies");
		return categories;
	}

	public List<String> getProducts(String category) {
		switch (category.toLowerCase()) {
		case "books":
			return bookList;
		case "music":
			return musicList;
		case "movies":
			return moviesList;
		}
		return null;
	}

	public boolean addProduct(String category, String product) {
		switch (category.toLowerCase()) {
		case "books":
			bookList.add(product);
			break;
		case "music":
			musicList.add(product);
			break;
		case "movies":
			moviesList.add(product);
			break;
		default:
			return false;
		}
		return true;
	}

	public List<Product> getProductsv2(String category) {
		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product("Singh Automony", "1234", 99999.99));
		productList.add(new Product("Singh Automony 2", "abc", 5099.99));
		return productList;

	}

}
