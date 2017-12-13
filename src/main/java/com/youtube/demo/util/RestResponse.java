package com.youtube.demo.util;

public class RestResponse {
	
	private Integer resposeCode;
	private String message;
	
	public RestResponse(Integer resposeCode) {
		super();
		this.resposeCode = resposeCode;
	}
	
	public RestResponse(Integer resposeCode, String message) {
		super();
		this.resposeCode = resposeCode;
		this.message = message;
	}
	
	public Integer getResposeCode() {
		return resposeCode;
	}
	public void setResposeCode(Integer resposeCode) {
		this.resposeCode = resposeCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
