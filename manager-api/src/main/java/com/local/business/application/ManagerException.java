package com.local.business.application;

/**
 * 
 * @author rbeldi
 *
 */
public abstract class ManagerException extends RuntimeException {

	private static final long serialVersionUID = -8170619680829917821L;

	
	
	
	
	
	public ManagerException() {
		super();
	}

	public ManagerException(String message, Throwable cause) {
		super(message, cause);
	}

	public ManagerException(String message) {
		super(message);
	}
}
