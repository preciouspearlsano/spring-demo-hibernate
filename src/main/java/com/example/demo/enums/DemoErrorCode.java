/**
 * 
 */
package com.example.demo.enums;

/**
 * @author Precious Pearl A. Sano Ventura <pr3_cious_15@yahoo.com>
 *
 */
public enum DemoErrorCode {
	EXDEMO_NULL_REQUEST("Null request found."), 
	EXDEMO_INV_OWNER("Now owner of account");
	
	private final String message;
	
	private DemoErrorCode() {
		this.message = "";
	}
	
	private DemoErrorCode(String message) {
		this.message = message;
	}
	
	@SuppressWarnings("unused")
	private String getMessage() {
		return message;
	}
}
