package com.example.training.response;

import java.util.HashMap;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class Response {
	public static ResponseEntity<Object> generateResponse(String message, HttpStatus httpStatus, Object obj) {
		HashMap<String, Object> error = new HashMap<String, Object>();
		error.put("message", message);
		error.put("status", httpStatus.value());
		error.put("data", obj);
		return new ResponseEntity<Object>(error, httpStatus);

	}

}
