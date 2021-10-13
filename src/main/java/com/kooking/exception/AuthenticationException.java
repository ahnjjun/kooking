package com.kooking.exception;

/**
 * 로그인할때 인증에 실패하면 발생하는 예외종류
 * */
public class AuthenticationException extends Exception {
	private static final long serialVersionUID = 5227561488556420975L;
	
	public AuthenticationException() {}
	public AuthenticationException(String message) {
		super(message);
	}

}
