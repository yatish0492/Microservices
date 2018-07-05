package com.yatish.webservices.tutorial;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//When this exception is throw, then instead of throwing default 500 code, it will throw 404
@ResponseStatus(HttpStatus.NOT_FOUND)
public class J5_CustomException extends Exception{

	
	J5_CustomException(String message) {
		super(message);
	}
}
