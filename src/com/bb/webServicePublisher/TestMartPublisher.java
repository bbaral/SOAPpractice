package com.bb.webServicePublisher;

import javax.xml.ws.Endpoint;

import com.bb.Driver.ProductCatalog;

/**
 * @author Bikram Baral May 20, 2018
 */
public class TestMartPublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:1234/productcatalog", new ProductCatalog());

	}

}
