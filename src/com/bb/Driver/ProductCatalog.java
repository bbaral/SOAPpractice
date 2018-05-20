package com.bb.Driver;

import java.util.List;
import javax.jws.WebService;

import com.bb.Interface.ProductCatalogInterface;
import com.bb.business.ProductServiceImpl;
import com.bb.model.Product;

/**
 * @author Bikram Baral May 14, 2018
 */
@WebService(endpointInterface="com.bb.Interface.ProductCatalogInterface",
portName = "TestMartCatalogPort", serviceName = "TestMartCatalogService")
public class ProductCatalog implements ProductCatalogInterface {

	ProductServiceImpl productServiceImpl = new ProductServiceImpl();

	@Override
	public List<String> getProductCategoriesFirst() {
		return productServiceImpl.getProductCategories1();
	}

	@Override
	public List<String> getProductCategories(String category) {
		return productServiceImpl.getProductCategories(category);
	}

	@Override
	public List<Product> getProductCategoriesv2(String category) {
		return productServiceImpl.getProductv2(category);
	}

	@Override
	public boolean addProduct(String category, String product) {
		return productServiceImpl.addProduct(category, product);
	}

}
