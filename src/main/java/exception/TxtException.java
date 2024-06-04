package org.example.exception;

public class TxtException extends Exception{
    public TxtException() {
    }

    public TxtException(String message) {
        super(message);
    }

    public TxtException(String message, Throwable cause) {
        super(message, cause);
    }

    public TxtException(Throwable cause) {
        super(cause);
    }
}
