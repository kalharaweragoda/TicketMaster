package edu.icet.exception;

public class InvalidBookingStateAndDateException extends Throwable {
    public InvalidBookingStateAndDateException(String message){
        super(message);
    }
}
