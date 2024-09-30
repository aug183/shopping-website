package com.aug183.shoppingwebsite.exception;

public class ProductNotFoundException extends RuntimeException{
    public ProductNotFoundException(String message) {
        super(message);

    }
}
