package com.test.exception;
import java.lang.Exception;
public class InvalidAgeException extends Exception{

	public InvalidAgeException(String message) {
		// call the constructor of Exception class
		super(message);
	}
}