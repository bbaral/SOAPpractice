package com.bb.business;

/**
 * @author Bikram Baral May 20, 2018
 */
public class InvalidInputException extends Exception {

	private String errorDetails;

	/**
	 * @param errorDetails
	 */
	public InvalidInputException(String reason, String errorDetails) {
		super(reason);
		this.errorDetails = errorDetails;
	}

	public String getFaultInfo() {
		return errorDetails;
	}

}
