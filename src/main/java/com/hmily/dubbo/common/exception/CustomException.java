package com.hmily.dubbo.common.exception;

import com.hmily.dubbo.common.util.ResponseCode;

/**
 * 统一的运行时异常类，方便全局异常拦截器返回自定义异常信息
 * @author hmily
 *
 */
public class CustomException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4697472371024662746L;
	
	private int code;

	public CustomException(String message) {
		super(message);
	}

	public CustomException(int code, String message) {
		super(message);
		this.code = code;
	}
	
	public CustomException(ResponseCode responseCode) {
		super(responseCode.getDesc());
		this.code = responseCode.getCode();
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
	
	
}
