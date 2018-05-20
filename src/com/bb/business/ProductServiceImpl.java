package com.bb.business;

import java.util.ArrayList;
import java.util.List;

import com.bb.model.Product;

/**
 * @author Bikram Baral May 19, 2018
 */
public class ProductServiceImpl {
	List<String> bookList = new ArrayList<>();
	List<String> musicList = new ArrayList<>();
	List<String> movieList = new ArrayList<>();

	public ProductServiceImpl() {
		bookList.add("Inferno");
		bookList.add("Joyland");
		bookList.add("Fault on our star");

		musicList.add("Childish Gambino - This is america");
		musicList.add("Avici - wake me up");
		musicList.add("Beattles");

		movieList.add("The Quite Place");
		movieList.add("Star War");
		movieList.add("Avengers");
	}

	public List<String> getProductCategories1() {
		List<String> categories = new ArrayList<>();
		categories.add("Books");
		categories.add("Music");
		categories.add("Movies");
		return categories;
	}

	public List<Product> getProductv2(String category) {
		List<Product> productList = new ArrayList<>();
		productList.add(new Product("Java Handsbook", "1234", 99.99));
		productList.add(new Product("Python programming", "2356", 59.99));
		return productList;
	}

	public List<String> getProductCategories(String category) {
		switch (category.toLowerCase()) {
		case "books":
			return bookList;
		case "musics":
			return musicList;
		case "movies":
			return movieList;
		default:
			break;
		}
		return null;
	}

	public boolean addProduct(String category, String product) {
		switch (category.toLowerCase()) {
		case "books":
			bookList.add(product);
			break;
		case "musics":
			musicList.add(product);
			break;
		case "movies":
			movieList.add(product);
		default:
			return false;
		}
		return true;
	}

}
