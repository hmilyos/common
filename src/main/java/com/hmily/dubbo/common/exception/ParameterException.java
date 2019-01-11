package com.hmily.dubbo.common.exception;

import com.hmily.dubbo.common.util.ResponseCode;

public class ParameterException extends CustomException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5348103649659737744L;

	public ParameterException(int code, String message) {
		super(code, message);
	}
	
	public ParameterException(String message) {
		super(message);
	}
	
	public ParameterException(ResponseCode responseCode) {
		super(responseCode);
	}

}
