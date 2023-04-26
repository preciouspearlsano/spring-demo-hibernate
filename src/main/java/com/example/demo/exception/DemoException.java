package com.example.demo.exception;

import java.io.Serializable;
import java.util.Locale;

import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.demo.config.i18nUtil;

import org.springframework.http.HttpStatus;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Precious Pearl A. Sano <pr3_cious_15@yahoo.com>
 *
 * 
 */
@EqualsAndHashCode(callSuper = true)
@Data
@ResponseStatus(code = HttpStatus.EXPECTATION_FAILED)
public class DemoException extends RuntimeException implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private HttpStatus error = HttpStatus.EXPECTATION_FAILED;
	private transient Object code;
	private transient Object payload;
	private transient PayloadMsg msg;

	/**
	 * 
	 */
	public DemoException() {
		super();
	}

	public DemoException(Throwable cause) {
		super(cause);
	}
	
	public <T> DemoException(String key) {
		super(i18nUtil.getMessage(key,Locale.ENGLISH));
		this.msg = new PayloadMsg(key);
	}
	
	public <T> DemoException(String key, Throwable cause) {
		super(i18nUtil.getMessage(key,Locale.ENGLISH),cause);
		this.msg = new PayloadMsg(key);
	}
	
	public <T> DemoException(String key, Object[] args) {
		super(i18nUtil.getMessage(key,args,Locale.ENGLISH));
		this.msg = new PayloadMsg(key,args);
	}
}
