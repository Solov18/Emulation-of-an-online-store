package com.javacurse.ce.internetMagazin;

public class CustomerException extends Exception {
    public CustomerException() {
    }

    public CustomerException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return " передан несуществующий покупатель ";
    }
}
