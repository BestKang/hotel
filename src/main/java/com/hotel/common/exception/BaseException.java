package com.hotel.common.exception;



import com.hotel.common.constant.Constants;
import com.hotel.common.constant.enumeration.BaseCode;
import com.hotel.common.util.FastJsonUtil;

import java.util.HashMap;
import java.util.Map;


public class BaseException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	private final BaseCode error;

	public BaseException(BaseCode ec, String message, Throwable cause) {
		super(message, cause);
		error = ec;
	}

	public BaseException(BaseCode ec) {
		this(ec, ec.getMessage(), null);
	}
	
	public BaseException(BaseCode ec, String message) {
		this(ec, message, null);
	}

	public BaseException(BaseCode ec, Throwable cause) {
		this(ec, null, cause);
	}

	public BaseCode getError() {
		return error;
	}

	@Override
	public String toString() {
		Map<String, String> jsonObj = new HashMap<>(4);
		jsonObj.put(Constants.CODE_FLAG, String.valueOf(error.getCode()));
		jsonObj.put(Constants.ERROR_MSG_FLAG, error.getMessage()+","+this.getMessage());
		return FastJsonUtil.collectToString(jsonObj);

	}
}
