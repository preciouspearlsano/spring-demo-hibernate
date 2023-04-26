package com.example.demo.exception;

import java.util.Locale;

import com.example.demo.config.i18nUtil;

import lombok.Data;

/**
 * @author Precious Pearl A. Sano <pr3_cious_15@yahoo.com>
 *
 * 
 */
@Data
public class PayloadMsg {

	private String en;
	/**
	 * @param key
	 */
	public PayloadMsg(String key) {
		this.en = i18nUtil.getMessage(key, Locale.ENGLISH);
	}
	/**
	 * @param key
	 * @param args
	 */
	public PayloadMsg(String key, Object[] args) {
		this.en = i18nUtil.getMessage(key, args, Locale.ENGLISH);
	}

}