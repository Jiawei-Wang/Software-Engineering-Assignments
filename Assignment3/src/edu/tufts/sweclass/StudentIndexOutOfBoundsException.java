package edu.tufts.sweclass;

public class StudentIndexOutOfBoundsException extends RuntimeException {
	private static final long serialVersionUID = 8226094121089000000L;

	public StudentIndexOutOfBoundsException(String message) {
		super(message);
	}

	public StudentIndexOutOfBoundsException() {
		super();
	}
}
