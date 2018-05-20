package com.bb.Interface;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.bb.model.Product;

/**
 * @author Bikram Baral May 19, 2018
 */

@WebService(name = "TestMartCatalog", targetNamespace = "http://www.testmart.com")
public interface ProductCatalogInterface {

	@WebMethod(action = "fetch_categories", operationName = "fetchCateg")
	List<String> getProductCategoriesFirst();

	@WebMethod
	List<String> getProductCategories(String category);

	@WebMethod
	@WebResult(name="Product")
	List<Product> getProductCategoriesv2(String category);

	@WebMethod
	boolean addProduct(String category, String product);

}