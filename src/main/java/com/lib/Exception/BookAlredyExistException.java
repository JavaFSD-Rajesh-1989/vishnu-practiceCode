package com.lib.Exception;

@SuppressWarnings("serial")
public class BookAlredyExistException extends Exception {
	public BookAlredyExistException(String message) {
		super(message);
	}

}
