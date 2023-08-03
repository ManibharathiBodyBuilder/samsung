package com.samsung.exception.model;

public class EmptyInputException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String ErrorMessage;
	private String ErrorCode;
	
	public EmptyInputException(String errorMessage, String errorCode) {
		super();
		ErrorMessage = errorMessage;
		ErrorCode = errorCode;
	}
	
	public EmptyInputException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getErrorMessage() {
		return ErrorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		ErrorMessage = errorMessage;
	}
	public String getErrorCode() {
		return ErrorCode;
	}
	public void setErrorCode(String errorCode) {
		ErrorCode = errorCode;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}
