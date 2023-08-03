package com.samsung.globalexception;

import java.util.NoSuchElementException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import com.samsung.exception.model.EmptyInputException;

@ControllerAdvice
public class GlobalExceptionHandling {

	@ExceptionHandler(EmptyInputException.class)
	public ResponseEntity<String> HandlingInputException(EmptyInputException emptyInputException) {
		return new ResponseEntity<String>("The field is empty' please check it. ", HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<String> HandleNoSuchElementException(NoSuchElementException noSuchElementException) {
		return new ResponseEntity<String>("Please enter the Data' and Field is empty", HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(EmptyResultDataAccessException.class)
	public ResponseEntity<String> HandleEmptyResultDataAccessException(
			EmptyResultDataAccessException emptyResultDataAccessException) {
		return new ResponseEntity<String>("The Id is not Exists'please check the input Field", HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(MethodArgumentTypeMismatchException.class)
	public ResponseEntity<String> HandleMethodArgumentTypeMismatchException(
			MethodArgumentTypeMismatchException methodArgumentTypeMismatchException) {
		return new ResponseEntity<String>("The Id is not Exists'please check the valid argument",
				HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(HttpRequestMethodNotSupportedException.class)
	public ResponseEntity<String> HandleHttpRequestMethodNotSupportedException(
			HttpRequestMethodNotSupportedException httpRequestMethodNotSupportedException) {
		return new ResponseEntity<String>("It is Invalid argument", HttpStatus.BAD_REQUEST);
	}
}
