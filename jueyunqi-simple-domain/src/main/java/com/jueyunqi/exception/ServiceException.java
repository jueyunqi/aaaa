package com.jueyunqi.exception;

public class ServiceException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5834215494798191648L;
	public ServiceException(){
		super();
	}
	
	public ServiceException(String msg){
		super(msg);
	}
	
}
